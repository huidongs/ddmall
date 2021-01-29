package pers.huidong.ddmall.db.service;

import com.github.pagehelper.PageHelper;

import org.springframework.stereotype.Service;
import pers.huidong.ddmall.db.dao.DdmallGoodsMapper;
import pers.huidong.ddmall.db.domain.DdmallGoods;
import pers.huidong.ddmall.db.domain.DdmallGoods.Column;
import pers.huidong.ddmall.db.domain.DdmallGoodsExample;

import javax.annotation.Resource;
import java.util.List;

/**
 * @USER: xhd
 * @DATE: 2021-01-22
 * @Desc:
 */
@Service
public class DdmallGoodsService {
    Column[] columns = new Column[]{Column.id, Column.name, Column.brief, Column.picUrl, Column.isHot, Column.isNew, Column.counterPrice, Column.retailPrice};
    @Resource
    private DdmallGoodsMapper goodsMapper;
    /**
     * 获取分类下的商品
     *
     * @param catList
     * @param offset
     * @param limit
     * @return
     */
    public List<DdmallGoods> queryByCategory(List<Integer> catList, int offset, Integer limit) {
        DdmallGoodsExample example = new DdmallGoodsExample();
        example.or().andCategoryIdIn(catList).andIsOnSaleEqualTo(true).andDeletedEqualTo(false);
        example.setOrderByClause("add_time  desc");
        PageHelper.startPage(offset, limit);

        return goodsMapper.selectByExampleSelective(example, columns);
    }
    /**
     * 获取新品上市
     *
     * @param offset
     * @param limit
     * @return
     */
    public List<DdmallGoods> queryByNew(int offset, int limit) {
        DdmallGoodsExample example = new DdmallGoodsExample();
        example.or().andIsNewEqualTo(true).andIsOnSaleEqualTo(true).andDeletedEqualTo(false);
        example.setOrderByClause("add_time desc");
        PageHelper.startPage(offset, limit);

        return goodsMapper.selectByExampleSelective(example, columns);
    }
    /**
     * 获取热卖商品
     *
     * @param offset
     * @param limit
     * @return
     */
    public List queryByHot(int offset ,int limit) {
        DdmallGoodsExample example = new DdmallGoodsExample();
        example.or().andIsHotEqualTo(true).andIsOnSaleEqualTo(true).andDeletedEqualTo(false);
        example.setOrderByClause("add_time desc");
        PageHelper.startPage(offset, limit);

        return goodsMapper.selectByExampleSelective(example, columns);
    }
    /**
     * 获取某个商品信息,包含完整信息
     *
     * @param goodsId
     * @return
     */
    public DdmallGoods findById(Integer goodsId) {
        DdmallGoodsExample example = new DdmallGoodsExample();
        example.or().andIdEqualTo(goodsId).andDeletedEqualTo(false);
        return goodsMapper.selectOneByExampleWithBLOBs(example);
    }

    /**
     * 获取所有在售物品总数
     *
     * @return
     */
    public Integer queryOnSale() {
        DdmallGoodsExample example = new DdmallGoodsExample();
        example.or().andIsOnSaleEqualTo(true).andDeletedEqualTo(false);
        return (int) goodsMapper.countByExample(example);
    }
}
