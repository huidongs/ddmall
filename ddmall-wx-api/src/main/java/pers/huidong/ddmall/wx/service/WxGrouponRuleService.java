package pers.huidong.ddmall.wx.service;

import com.github.pagehelper.Page;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.huidong.ddmall.db.domain.DdmallGoods;
import pers.huidong.ddmall.db.domain.DdmallGrouponRules;
import pers.huidong.ddmall.db.service.DdmallGoodsService;
import pers.huidong.ddmall.db.service.DdmallGrouponRulesService;
import pers.huidong.ddmall.db.service.DdmallGrouponService;
import pers.huidong.ddmall.wx.vo.GrouponRuleVo;

import java.util.List;

/**
 * @USER: xhd
 * @DATE: 2021-01-22
 * @Desc:
 */
@Service
public class WxGrouponRuleService {
    private final Log logger = LogFactory.getLog(WxGrouponRuleService.class);

    @Autowired
    private DdmallGrouponRulesService grouponRulesService;
    @Autowired
    private DdmallGrouponService grouponService;
    @Autowired
    private DdmallGoodsService goodsService;


    public List queryList(Integer page, Integer size) {
        return queryList(page, size, "add_time", "desc");
    }
    public List<GrouponRuleVo> queryList(Integer page, Integer size, String sort, String order) {
        Page<DdmallGrouponRules> grouponRulesList = (Page<DdmallGrouponRules>)grouponRulesService.queryList(page, size, sort, order);
        System.out.println("grouponRulesList{}"+grouponRulesList);
        Page<GrouponRuleVo> grouponList = new Page<GrouponRuleVo>();
        grouponList.setPages(grouponRulesList.getPages());
        grouponList.setPageNum(grouponRulesList.getPageNum());
        grouponList.setPageSize(grouponRulesList.getPageSize());
        grouponList.setTotal(grouponRulesList.getTotal());

        for (DdmallGrouponRules rule : grouponRulesList) {
            Integer goodsId = rule.getGoodsId();
            DdmallGoods goods = goodsService.findById(goodsId);
            if (goods == null) {
                continue;
            }

            GrouponRuleVo grouponRuleVo = new GrouponRuleVo();
            grouponRuleVo.setId(goods.getId());
            grouponRuleVo.setName(goods.getName());
            grouponRuleVo.setBrief(goods.getBrief());
            grouponRuleVo.setPicUrl(goods.getPicUrl());
            grouponRuleVo.setCounterPrice(goods.getCounterPrice());
            grouponRuleVo.setRetailPrice(goods.getRetailPrice());
            grouponRuleVo.setGrouponPrice(goods.getRetailPrice().subtract(rule.getDiscount()));
            grouponRuleVo.setGrouponDiscount(rule.getDiscount());
            grouponRuleVo.setGrouponMember(rule.getDiscountMember());
            grouponRuleVo.setExpireTime(rule.getExpireTime());
            grouponList.add(grouponRuleVo);
        }

        return grouponList;
    }
}
