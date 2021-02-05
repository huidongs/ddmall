package pers.huidong.ddmall.db.service;

import pers.huidong.ddmall.db.dao.DdmallCartMapper;
import pers.huidong.ddmall.db.domain.DdmallCart;
import pers.huidong.ddmall.db.domain.DdmallCartExample;

import javax.annotation.Resource;
import java.util.List;

/**
 * @USER: xhd
 * @DATE: 2021-02-05
 * @Desc:
 */
public class DdmallCartService {
    @Resource
    private DdmallCartMapper cartMapper;

    public List<DdmallCart> queryByUid(Integer userId) {
        DdmallCartExample example = new DdmallCartExample();
        example.or().andUserIdEqualTo(userId).andDeletedEqualTo(false);
        return cartMapper.selectByExample(example);
    }
}
