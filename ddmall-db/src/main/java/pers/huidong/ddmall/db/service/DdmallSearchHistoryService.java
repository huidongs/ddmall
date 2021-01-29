package pers.huidong.ddmall.db.service;

import org.springframework.stereotype.Service;
import pers.huidong.ddmall.db.dao.DdmallSearchHistoryMapper;
import pers.huidong.ddmall.db.domain.DdmallSearchHistory;
import pers.huidong.ddmall.db.domain.DdmallSearchHistoryExample;

import javax.annotation.Resource;
import java.util.List;

/**
 * @USER: xhd
 * @DATE: 2021-01-28
 * @Desc:
 */
@Service
public class DdmallSearchHistoryService {
    @Resource
    private DdmallSearchHistoryMapper searchHistoryMapper;

    public List<DdmallSearchHistory> queryByUid(Integer uid) {
        DdmallSearchHistoryExample example = new DdmallSearchHistoryExample();
        example.or().andUserIdEqualTo(uid).andDeletedEqualTo(false);
        example.setDistinct(true);
        return searchHistoryMapper.selectByExampleSelective(example, DdmallSearchHistory.Column.keyword);
    }
}
