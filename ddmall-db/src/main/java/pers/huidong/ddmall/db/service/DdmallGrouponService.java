package pers.huidong.ddmall.db.service;

import org.springframework.stereotype.Service;
import pers.huidong.ddmall.db.dao.DdmallGrouponMapper;
import pers.huidong.ddmall.db.domain.DdmallGroupon;
import pers.huidong.ddmall.db.domain.DdmallGrouponExample;

import javax.annotation.Resource;

/**
 * @USER: xhd
 * @DATE: 2021-01-26
 * @Desc:
 */
@Service
public class DdmallGrouponService {
    @Resource
    private DdmallGrouponMapper mapper;
    /**
     * 根据ID查询记录
     *
     * @param id
     * @return
     */
    public DdmallGroupon queryById(Integer id) {
        DdmallGrouponExample example = new DdmallGrouponExample();
        example.or().andIdEqualTo(id).andDeletedEqualTo(false);
        return mapper.selectOneByExample(example);
    }
}
