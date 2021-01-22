package pers.huidong.ddmall.db.service;

import org.springframework.stereotype.Service;
import pers.huidong.ddmall.db.dao.DdmallAdMapper;
import pers.huidong.ddmall.db.domain.DdmallAd;
import pers.huidong.ddmall.db.domain.DdmallAdExample;

import javax.annotation.Resource;
import java.util.List;

/**
 * @USER: xhd
 * @DATE: 2021-01-21
 * @Desc:
 */
@Service
public class DdmallAdService {
    @Resource
    private DdmallAdMapper adMapper;

    public List<DdmallAd> queryIndex(){
        DdmallAdExample example = new DdmallAdExample();
        example.or().andPositionEqualTo((byte)1).andDeletedEqualTo(false).andEnabledEqualTo(true);
        return adMapper.selectByExample(example);
    }
}
