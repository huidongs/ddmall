package pers.huidong.ddmall.db.service;

import org.springframework.stereotype.Service;
import pers.huidong.ddmall.db.dao.DdmallFootprintMapper;
import pers.huidong.ddmall.db.domain.DdmallFootprint;

import javax.annotation.Resource;
import java.time.LocalDateTime;

/**
 * @USER: xhd
 * @DATE: 2021-02-05
 * @Desc:
 */
@Service
public class DdmallFootprintService {
    @Resource
    private DdmallFootprintMapper footprintMapper;

    public void add(DdmallFootprint footprint) {
        footprint.setAddTime(LocalDateTime.now());
        footprint.setUpdateTime(LocalDateTime.now());
        footprintMapper.insertSelective(footprint);
    }
}
