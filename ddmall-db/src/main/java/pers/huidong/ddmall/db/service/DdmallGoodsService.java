package pers.huidong.ddmall.db.service;

import com.github.pagehelper.PageHelper;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import pers.huidong.ddmall.db.dao.DdmallGoodsMapper;
import pers.huidong.ddmall.db.domain.DdmallGoods;
import pers.huidong.ddmall.db.domain.DdmallGoods.Column;
import pers.huidong.ddmall.db.domain.DdmallGoodsExample;

import javax.annotation.Resource;
import java.util.ArrayList;
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
     * 获取分类下的商品
     *
     * @param catId
     * @param offset
     * @param limit
     * @return
     */
    public List<DdmallGoods> queryByCategory(Integer catId, int offset, int limit) {
        DdmallGoodsExample example = new DdmallGoodsExample();
        example.or().andCategoryIdEqualTo(catId).andIsOnSaleEqualTo(true).andDeletedEqualTo(false);
        example.setOrderByClause("add_time desc");
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

    public List<DdmallGoods> querySelective(Integer categoryId, Integer brandId, String keyword, Boolean isHot, Boolean isNew, Integer offset, Integer limit, String sort, String order) {
        DdmallGoodsExample example = new DdmallGoodsExample();
        DdmallGoodsExample.Criteria criteria1 = example.or();
        DdmallGoodsExample.Criteria criteria2 = example.or();

        if (!StringUtils.isEmpty(categoryId) && categoryId != 0) {
            criteria1.andCategoryIdEqualTo(categoryId);
            criteria2.andCategoryIdEqualTo(categoryId);
        }
        if (!StringUtils.isEmpty(brandId)) {
            criteria1.andBrandIdEqualTo(brandId);
            criteria2.andBrandIdEqualTo(brandId);
        }
        if (!StringUtils.isEmpty(isNew)) {
            criteria1.andIsNewEqualTo(isNew);
            criteria2.andIsNewEqualTo(isNew);
        }
        if (!StringUtils.isEmpty(isHot)) {
            criteria1.andIsHotEqualTo(isHot);
            criteria2.andIsHotEqualTo(isHot);
        }
        if (!StringUtils.isEmpty(keyword)) {
            criteria1.andKeywordsLike("%" + keyword + "%");
            criteria2.andNameLike("%" + keyword + "%");
        }
        criteria1.andIsOnSaleEqualTo(true);
        criteria2.andIsOnSaleEqualTo(true);
        criteria1.andDeletedEqualTo(false);
        criteria2.andDeletedEqualTo(false);

        if (!StringUtils.isEmpty(sort) && !StringUtils.isEmpty(order)) {
            example.setOrderByClause(sort + " " + order);
        }

        PageHelper.startPage(offset, limit);

        return goodsMapper.selectByExampleSelective(example, columns);
    }

    public List<Integer> getCatIds(Integer brandId, String keywords, Boolean isHot, Boolean isNew) {
        DdmallGoodsExample example = new DdmallGoodsExample();
        DdmallGoodsExample.Criteria criteria1 = example.or();
        DdmallGoodsExample.Criteria criteria2 = example.or();

        if (!StringUtils.isEmpty(brandId)) {
            criteria1.andBrandIdEqualTo(brandId);
            criteria2.andBrandIdEqualTo(brandId);
        }
        if (!StringUtils.isEmpty(isNew)) {
            criteria1.andIsNewEqualTo(isNew);
            criteria2.andIsNewEqualTo(isNew);
        }
        if (!StringUtils.isEmpty(isHot)) {
            criteria1.andIsHotEqualTo(isHot);
            criteria2.andIsHotEqualTo(isHot);
        }
        if (!StringUtils.isEmpty(keywords)) {
            criteria1.andKeywordsLike("%" + keywords + "%");
            criteria2.andNameLike("%" + keywords + "%");
        }
        criteria1.andIsOnSaleEqualTo(true);
        criteria2.andIsOnSaleEqualTo(true);
        criteria1.andDeletedEqualTo(false);
        criteria2.andDeletedEqualTo(false);

        List<DdmallGoods> goodsList = goodsMapper.selectByExampleSelective(example, Column.categoryId);
        List<Integer> cats = new ArrayList<Integer>();
        for (DdmallGoods goods : goodsList) {
            cats.add(goods.getCategoryId());
        }
        return cats;
    }
}
