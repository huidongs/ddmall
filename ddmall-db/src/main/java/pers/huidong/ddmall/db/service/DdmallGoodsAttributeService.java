package pers.huidong.ddmall.db.service;

import org.springframework.stereotype.Service;
import pers.huidong.ddmall.db.dao.DdmallGoodsAttributeMapper;
import pers.huidong.ddmall.db.domain.DdmallGoodsAttribute;
import pers.huidong.ddmall.db.domain.DdmallGoodsAttributeExample;

import javax.annotation.Resource;
import java.util.List;

/**
 * @USER: xhd
 * @DATE: 2021-02-05
 * @Desc:
 */
@Service
public class DdmallGoodsAttributeService {
    @Resource
    private DdmallGoodsAttributeMapper goodsAttributeMapper;

    public List<DdmallGoodsAttribute> queryByGid(Integer goodsId) {
        DdmallGoodsAttributeExample example = new DdmallGoodsAttributeExample();
        example.or().andGoodsIdEqualTo(goodsId).andDeletedEqualTo(false);
        return goodsAttributeMapper.selectByExample(example);
    }
}
