package pers.huidong.ddmall.db.service;

import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import pers.huidong.ddmall.db.dao.DdmallKeywordMapper;
import pers.huidong.ddmall.db.domain.DdmallKeyword;
import pers.huidong.ddmall.db.domain.DdmallKeywordExample;

import javax.annotation.Resource;
import java.util.List;

/**
 * @USER: xhd
 * @DATE: 2021-01-28
 * @Desc:
 */
@Service
public class DdmallKeywordService {
    @Resource
    private DdmallKeywordMapper keywordsMapper;

    public DdmallKeyword queryDefault() {
        DdmallKeywordExample example = new DdmallKeywordExample();
        example.or().andIsDefaultEqualTo(true).andDeletedEqualTo(false);
        return keywordsMapper.selectOneByExample(example);
    }

    public List<DdmallKeyword> queryHots() {
        DdmallKeywordExample example = new DdmallKeywordExample();
        example.or().andIsHotEqualTo(true).andDeletedEqualTo(false);
        return keywordsMapper.selectByExample(example);
    }

    public List<DdmallKeyword> queryByKeyword(String keyword, Integer page, Integer limit) {
        DdmallKeywordExample example = new DdmallKeywordExample();
        example.setDistinct(true);
        example.or().andKeywordLike("%" + keyword + "%").andDeletedEqualTo(false);
        PageHelper.startPage(page, limit);
        return keywordsMapper.selectByExampleSelective(example, DdmallKeyword.Column.keyword);
    }
}
