package pers.huidong.ddmall.wx.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pers.huidong.ddmall.core.util.ResponseUtil;
import pers.huidong.ddmall.core.validator.Order;
import pers.huidong.ddmall.core.validator.Sort;
import pers.huidong.ddmall.db.domain.*;
import pers.huidong.ddmall.db.service.DdmallGoodsService;
import pers.huidong.ddmall.db.service.DdmallGrouponRulesService;
import pers.huidong.ddmall.db.service.DdmallGrouponService;
import pers.huidong.ddmall.db.service.DdmallUserService;
import pers.huidong.ddmall.db.util.OrderUtil;
import pers.huidong.ddmall.wx.annotation.LoginUser;
import pers.huidong.ddmall.wx.service.WxGrouponRuleService;
import pers.huidong.ddmall.wx.vo.GrouponRuleVo;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static pers.huidong.ddmall.wx.util.WxResponseCode.ORDER_INVALID;
import static pers.huidong.ddmall.wx.util.WxResponseCode.ORDER_UNKNOWN;

/**
 * 团购服务
 * <p>
 * 需要注意这里团购规则和团购活动的关系和区别。
 */
@RestController
@RequestMapping("/wx/groupon")
@Validated
public class WxGrouponController {
    private final Log logger = LogFactory.getLog(WxGrouponController.class);

    @Autowired
    private DdmallGrouponRulesService rulesService;
    @Autowired
    private WxGrouponRuleService wxGrouponRuleService;
    @Autowired
    private DdmallGrouponService grouponService;
    @Autowired
    private DdmallGoodsService goodsService;
  //  @Autowired
 //   private DdmallOrderService orderService;
 //   @Autowired
//    private DdmallOrderGoodsService orderGoodsService;
    @Autowired
    private DdmallUserService userService;
   // @Autowired
  //  private ExpressService expressService;
    @Autowired
    private DdmallGrouponRulesService grouponRulesService;

    /**
     * 团购规则列表
     *
     * @param page 分页页数
     * @param limit 分页大小
     * @return 团购规则列表
     */
    @GetMapping("list")
    public Object list(@RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer limit,
                       @Sort @RequestParam(defaultValue = "add_time") String sort,
                       @Order @RequestParam(defaultValue = "desc") String order) {
        List<GrouponRuleVo> grouponRuleVoList = wxGrouponRuleService.queryList(page, limit, sort, order);
        return ResponseUtil.okList(grouponRuleVoList);
    }

    /**
     * 团购活动详情
     *
     * @param userId    用户ID
     * @param grouponId 团购活动ID
     * @return 团购活动详情
     */
    @GetMapping("detail")
    public Object detail(@LoginUser Integer userId, @NotNull Integer grouponId) {

        return null;
    }

    /**
     * 参加团购
     *
     * @param grouponId 团购活动ID
     * @return 操作结果
     */
    @GetMapping("join")
    public Object join(@NotNull Integer grouponId) {
        DdmallGroupon groupon = grouponService.queryById(grouponId);
        if (groupon == null) {
            return ResponseUtil.badArgumentValue();
        }

        DdmallGrouponRules rules = rulesService.findById(groupon.getRulesId());
        if (rules == null) {
            return ResponseUtil.badArgumentValue();
        }

        DdmallGoods goods = goodsService.findById(rules.getGoodsId());
        if (goods == null) {
            return ResponseUtil.badArgumentValue();
        }

        Map<String, Object> result = new HashMap<>();
        result.put("groupon", groupon);
        result.put("goods", goods);

        return ResponseUtil.ok(result);
    }

    /**
     * 用户开团或入团情况
     *
     * @param userId 用户ID
     * @param showType 显示类型，如果是0，则是当前用户开的团购；否则，则是当前用户参加的团购
     * @return 用户开团或入团情况
     */
    @GetMapping("my")
    public Object my(@LoginUser Integer userId, @RequestParam(defaultValue = "0") Integer showType) {
        return null;
    }

}
