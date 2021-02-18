package pers.huidong.ddmall.db.service;

import org.springframework.stereotype.Service;
import pers.huidong.ddmall.db.dao.DdmallCollectMapper;
import pers.huidong.ddmall.db.domain.DdmallCollectExample;

import javax.annotation.Resource;

/**
 * @USER: xhd
 * @DATE: 2021-02-05
 * @Desc:
 */
@Service
public class DdmallCollectService {
    @Resource
    private DdmallCollectMapper collectMapper;

    public int count(Integer uid, Integer gid) {
        DdmallCollectExample example = new DdmallCollectExample();
        example.or().andUserIdEqualTo(uid).andValueIdEqualTo(gid).andDeletedEqualTo(false);
        return (int) collectMapper.countByExample(example);
    }
}
