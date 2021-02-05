package pers.huidong.ddmall.db.service;

import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import pers.huidong.ddmall.db.dao.DdmallGoodsMapper;
import pers.huidong.ddmall.db.dao.DdmallGrouponRulesMapper;
import pers.huidong.ddmall.db.domain.DdmallGoods.Column;
import pers.huidong.ddmall.db.domain.DdmallGrouponRules;
import pers.huidong.ddmall.db.domain.DdmallGrouponRulesExample;
import pers.huidong.ddmall.db.util.GrouponConstant;

import javax.annotation.Resource;
import java.util.List;

/**
 * @USER: xhd
 * @DATE: 2021-01-26
 * @Desc:
 */
@Service
public class DdmallGrouponRulesService {
    @Resource
    private DdmallGrouponRulesMapper mapper;
    @Resource
    private DdmallGoodsMapper goodsMapper;
    private Column[] goodsColumns = new Column[]{Column.id, Column.name, Column.brief, Column.picUrl, Column.counterPrice, Column.retailPrice};

    /**
     * 获取首页团购规则列表
     *
     * @param page
     * @param limit
     * @return
     */
    public List<DdmallGrouponRules> queryList(Integer page, Integer limit) {
        return queryList(page, limit, "add_time", "desc");
    }

    public List<DdmallGrouponRules> queryList(Integer page, Integer limit, String sort, String order) {
        DdmallGrouponRulesExample example = new DdmallGrouponRulesExample();
        example.or().andStatusEqualTo(GrouponConstant.RULE_STATUS_ON).andDeletedEqualTo(false);
        example.setOrderByClause(sort + " " + order);
        PageHelper.startPage(page, limit);
        return mapper.selectByExample(example);
    }
    /**
     * 根据ID查找对应团购项
     *
     * @param id
     * @return
     */
    public DdmallGrouponRules findById(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }
}
