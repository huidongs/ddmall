package pers.huidong.ddmall.db.service;

import org.springframework.stereotype.Service;
import pers.huidong.ddmall.db.dao.DdmallCartMapper;
import pers.huidong.ddmall.db.domain.DdmallCart;
import pers.huidong.ddmall.db.domain.DdmallCartExample;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @USER: xhd
 * @DATE: 2021-02-05
 * @Desc:
 */
@Service
public class DdmallCartService {
    @Resource
    private DdmallCartMapper cartMapper;

    public List<DdmallCart> queryByUid(Integer userId) {
        DdmallCartExample example = new DdmallCartExample();
        example.or().andUserIdEqualTo(userId).andDeletedEqualTo(false);
        return cartMapper.selectByExample(example);
    }

    public void deleteById(Integer id) {
        cartMapper.logicalDeleteByPrimaryKey(id);
    }

    public DdmallCart queryExist(Integer goodsId, Integer productId, Integer userId) {
        DdmallCartExample example = new DdmallCartExample();
        example.or().andGoodsIdEqualTo(goodsId).andProductIdEqualTo(productId).andUserIdEqualTo(userId).andDeletedEqualTo(false);
        return cartMapper.selectOneByExample(example);
    }

    public void add(DdmallCart cart) {
        cart.setAddTime(LocalDateTime.now());
        cart.setUpdateTime(LocalDateTime.now());
        cartMapper.insertSelective(cart);
    }

    public int updateById(DdmallCart existCart) {
        existCart.setUpdateTime(LocalDateTime.now());
        return cartMapper.updateByPrimaryKeySelective(existCart);
    }

    public DdmallCart findById(Integer userId, Integer id) {
        DdmallCartExample example = new DdmallCartExample();
        example.or().andUserIdEqualTo(userId).andIdEqualTo(id).andDeletedEqualTo(false);
        return cartMapper.selectOneByExample(example);
    }

    public int updateCheck(Integer userId, List<Integer> idsList, Boolean checked) {
        DdmallCartExample example = new DdmallCartExample();
        example.or().andUserIdEqualTo(userId).andProductIdIn(idsList).andDeletedEqualTo(false);
        DdmallCart cart = new DdmallCart();
        cart.setChecked(checked);
        cart.setUpdateTime(LocalDateTime.now());
        return cartMapper.updateByExampleSelective(cart, example);
    }

    public int delete(List<Integer> productIdList, Integer userId) {
        DdmallCartExample example = new DdmallCartExample();
        example.or().andUserIdEqualTo(userId).andProductIdIn(productIdList);
        return cartMapper.logicalDeleteByExample(example);
    }

    public List<DdmallCart> queryByUidAndChecked(Integer userId) {
        DdmallCartExample example = new DdmallCartExample();
        example.or().andUserIdEqualTo(userId).andCheckedEqualTo(true).andDeletedEqualTo(false);
        return cartMapper.selectByExample(example);
    }
}
