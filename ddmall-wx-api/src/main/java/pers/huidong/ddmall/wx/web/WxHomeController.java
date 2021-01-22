package pers.huidong.ddmall.wx.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.huidong.ddmall.core.util.ResponseUtil;
import pers.huidong.ddmall.db.service.*;
import pers.huidong.ddmall.wx.annotation.LoginUser;
import pers.huidong.ddmall.wx.service.HomeCacheManager;

import javax.validation.constraints.NotNull;
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
    private  DdmallCouponService couponService;

    /**
     *     //AbortPolicy：拒绝执行处理程序，这是默认策略。
     *     //CallerRunsPolicy：线程池未关闭，被拒绝任务，它直接在调用线程中运行被丢弃的任务
     *     //DiscardOldestPolicy：丢弃最老，然后重试执行当前任务
     *     //DiscardPolicy：比较粗暴，直接丢弃。
     */
    private final static ArrayBlockingQueue<Runnable> WORK_QUEUE = new ArrayBlockingQueue<>(9);

    private final static RejectedExecutionHandler HANDLER= new ThreadPoolExecutor.CallerRunsPolicy();

    private static ThreadPoolExecutor executorService = new ThreadPoolExecutor(9,9,1000, TimeUnit.MICROSECONDS,WORK_QUEUE,HANDLER);

    public Object cache(@NotNull String key){
        if (!key.equals("ddmall_cache")){
            return ResponseUtil.fail();
        }
        //清楚缓存
        HomeCacheManager.clearAll();
        return ResponseUtil.ok("缓存已清除");
    }

    /**
     * 首页数据
     * @param userId 当用户已经登录时，非空。为登录状态为null
     * @return 首页数据
     */
    @GetMapping("/index")
    public Object index(@LoginUser Integer userId){
        //有先从缓存中读取
        if (HomeCacheManager.hasData(HomeCacheManager.INDEX)){
            return ResponseUtil.ok(HomeCacheManager.getCacheData(HomeCacheManager.INDEX));
        }
        ExecutorService executorService = Executors.newFixedThreadPool(10);

    }

}
