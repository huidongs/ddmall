package pers.huidong.ddmall.db.service;

import org.springframework.stereotype.Service;
import pers.huidong.ddmall.db.dao.DdmallAddressMapper;
import pers.huidong.ddmall.db.domain.DdmallAddress;
import pers.huidong.ddmall.db.domain.DdmallAddressExample;

import javax.annotation.Resource;

/**
 * @USER: xhd
 * @DATE: 2021-02-05
 * @Desc:
 */
@Service
public class DdmallAddressService {
    @Resource
    private DdmallAddressMapper addressMapper;

    public DdmallAddress findDefault(Integer userId) {
        DdmallAddressExample example = new DdmallAddressExample();
        example.or().andUserIdEqualTo(userId).andIsDefaultEqualTo(true).andDeletedEqualTo(false);
        return addressMapper.selectOneByExample(example);
    }

    public DdmallAddress query(Integer userId, Integer id) {
        DdmallAddressExample example = new DdmallAddressExample();
        example.or().andIdEqualTo(id).andUserIdEqualTo(userId).andDeletedEqualTo(false);
        return addressMapper.selectOneByExample(example);
    }
}
