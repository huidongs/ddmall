package pers.huidong.ddmall.db.service;

import org.springframework.stereotype.Service;
import pers.huidong.ddmall.db.dao.DdmallGoodsProductMapper;
import pers.huidong.ddmall.db.dao.GoodsProductMapper;
import pers.huidong.ddmall.db.domain.DdmallGoodsProduct;
import pers.huidong.ddmall.db.domain.DdmallGoodsProductExample;

import javax.annotation.Resource;
import java.util.List;

/**
 * @USER: xhd
 * @DATE: 2021-02-05
 * @Desc:
 */
@Service
public class DdmallGoodsProductService {
    @Resource
    private DdmallGoodsProductMapper ddmallGoodsProductMapper;
    @Resource
    private GoodsProductMapper goodsProductMapper;

    public List queryByGid(Integer gid) {
        DdmallGoodsProductExample example = new DdmallGoodsProductExample();
        example.or().andGoodsIdEqualTo(gid).andDeletedEqualTo(false);
        return ddmallGoodsProductMapper.selectByExample(example);
    }

    public DdmallGoodsProduct findById(Integer productId) {
        return ddmallGoodsProductMapper.selectByPrimaryKey(productId);
    }
}
