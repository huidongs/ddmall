package pers.huidong.ddmall.wx.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.huidong.ddmall.core.system.SystemConfig;
import pers.huidong.ddmall.core.util.ResponseUtil;
import pers.huidong.ddmall.db.domain.DdmallCategory;
import pers.huidong.ddmall.db.domain.DdmallGoods;
import pers.huidong.ddmall.db.service.*;
import pers.huidong.ddmall.wx.annotation.LoginUser;
import pers.huidong.ddmall.wx.service.HomeCacheManager;
import pers.huidong.ddmall.wx.service.WxGrouponRuleService;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

/**
 * @USER: xhd
 * @DATE: 2021-01-21
 * @Desc: 首页服务
 */
@RestController
@RequestMapping("/wx/home")
@Validated
public class WxHomeController {
    @Autowired
    private DdmallAdService adService;

    @Autowired
    private DdmallGoodsService goodsService;

    @Autowired
    private DdmallBrandService brandService;

    @Autowired
    private DdmallTopicService topicService;

    @Autowired
    private DdmallCategoryService categoryService;

    @Autowired
    private WxGrouponRuleService grouponService;

    @Autowired
    private DdmallCouponService couponService;

    /**
     * //AbortPolicy：拒绝执行处理程序，这是默认策略。
     * //CallerRunsPolicy：线程池未关闭，被拒绝任务，它直接在调用线程中运行被丢弃的任务
     * //DiscardOldestPolicy：丢弃最老，然后重试执行当前任务
     * //DiscardPolicy：比较粗暴，直接丢弃。
     */
    private final static ArrayBlockingQueue<Runnable> WORK_QUEUE = new ArrayBlockingQueue<>(9);

    private final static RejectedExecutionHandler HANDLER = new ThreadPoolExecutor.CallerRunsPolicy();

    private static ThreadPoolExecutor executorService = new ThreadPoolExecutor(9, 9, 1000, TimeUnit.MICROSECONDS, WORK_QUEUE, HANDLER);

    public Object cache(@NotNull String key) {
        if (!key.equals("ddmall_cache")) {
            return ResponseUtil.fail();
        }
        //清楚缓存
        HomeCacheManager.clearAll();
        return ResponseUtil.ok("缓存已清除");
    }

    /**
     * 首页数据
     *
     * @param userId 当用户已经登录时，非空。为登录状态为null
     * @return 首页数据
     */
    @GetMapping("/index")
    public Object index(@LoginUser Integer userId) {
        //有先从缓存中读取
        if (HomeCacheManager.hasData(HomeCacheManager.INDEX)) {
            return ResponseUtil.ok(HomeCacheManager.getCacheData(HomeCacheManager.INDEX));
        }
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Callable<List> bannerListCallable = () -> adService.queryIndex();
        Callable<List> channelListCallable = () -> categoryService.queryChannel();
        Callable<List> couponListCallable;
        if (userId == null) {
            couponListCallable = () -> couponService.queryList(0, 3);
        } else {
            couponListCallable = () -> couponService.queryAvailableList(userId, 0, 3);
        }

        Callable<List> newGoodsListCallable = () -> goodsService.queryByNew(0, SystemConfig.getNewLimit());

        Callable<List> hotGoodsListCallable = () -> goodsService.queryByHot(0, SystemConfig.getHotLimit());

        Callable<List> brandListCallable = () -> brandService.query(0, SystemConfig.getBrandLimit());

        Callable<List> topicListCallable = () -> topicService.queryList(0, SystemConfig.getTopicLimit());

        //团购专区
        Callable<List> grouponListCallable = () -> grouponService.queryList(0, 5);

        Callable<List> floorGoodsListCallable = this::getCategoryList;

        FutureTask<List> bannerTask = new FutureTask<>(bannerListCallable);
        FutureTask<List> channelTask = new FutureTask<>(channelListCallable);
        FutureTask<List> couponListTask = new FutureTask<>(couponListCallable);
        FutureTask<List> newGoodsListTask = new FutureTask<>(newGoodsListCallable);
        FutureTask<List> hotGoodsListTask = new FutureTask<>(hotGoodsListCallable);
        FutureTask<List> brandListTask = new FutureTask<>(brandListCallable);
        FutureTask<List> topicListTask = new FutureTask<>(topicListCallable);
        FutureTask<List> grouponListTask = new FutureTask<>(grouponListCallable);
        FutureTask<List> floorGoodsListTask = new FutureTask<>(floorGoodsListCallable);

        executorService.submit(bannerTask);
        executorService.submit(channelTask);
        executorService.submit(couponListTask);
        executorService.submit(newGoodsListTask);
        executorService.submit(hotGoodsListTask);
        executorService.submit(brandListTask);
        executorService.submit(topicListTask);
        executorService.submit(grouponListTask);
        executorService.submit(floorGoodsListTask);

        Map<String, Object> entity = new HashMap<>();
        try {
            entity.put("banner", bannerTask.get());
            entity.put("channel", channelTask.get());
            entity.put("couponList", couponListTask.get());
            entity.put("newGoodsList", newGoodsListTask.get());
            entity.put("hotGoodsList", hotGoodsListTask.get());
            entity.put("brandList", brandListTask.get());
            entity.put("topicList", topicListTask.get());
            entity.put("grouponList", grouponListTask.get());
            entity.put("floorGoodsList", floorGoodsListTask.get());
            //缓存数据
            HomeCacheManager.loadData(HomeCacheManager.INDEX, entity);
        }
        catch (Exception e) {
            e.printStackTrace();
        }finally {
            executorService.shutdown();
        }
        return ResponseUtil.ok(entity);

    }
    private List<Map> getCategoryList() {
        List<Map> categoryList = new ArrayList<>();
        List<DdmallCategory> catL1List = categoryService.queryL1WithoutRecommend(0, SystemConfig.getCatlogListLimit());
        System.out.println("========catL1List=========");
        System.out.println(catL1List);
        for (DdmallCategory catL1 : catL1List) {
            List<DdmallCategory> catL2List = categoryService.queryByPid(catL1.getId());
            List<Integer> l2List = new ArrayList<>();
            for (DdmallCategory catL2 : catL2List) {
                l2List.add(catL2.getId());
            }

            List<DdmallGoods> categoryGoods;
            if (l2List.size() == 0) {
                categoryGoods = new ArrayList<>();
            } else {
                categoryGoods = goodsService.queryByCategory(l2List, 0, SystemConfig.getCatlogMoreLimit());
            }

            Map<String, Object> catGoods = new HashMap<>();
            catGoods.put("id", catL1.getId());
            catGoods.put("name", catL1.getName());
            catGoods.put("goodsList", categoryGoods);
            categoryList.add(catGoods);
        }
        System.out.println("========categoryList=========");
        System.out.println(categoryList);
        return categoryList;
    }
    /**
     * 商城介绍信息
     * @return 商城介绍信息
     */
    @GetMapping("/about")
    public Object about() {
        Map<String, Object> about = new HashMap<>();
        about.put("name", SystemConfig.getMallName());
        about.put("address", SystemConfig.getMallAddress());
        about.put("phone", SystemConfig.getMallPhone());
        about.put("qq", SystemConfig.getMallQQ());
        about.put("longitude", SystemConfig.getMallLongitude());
        about.put("latitude", SystemConfig.getMallLatitude());
        return ResponseUtil.ok(about);
    }
}
