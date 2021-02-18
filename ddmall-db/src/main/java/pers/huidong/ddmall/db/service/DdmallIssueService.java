package pers.huidong.ddmall.db.service;

import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import pers.huidong.ddmall.db.dao.DdmallIssueMapper;
import pers.huidong.ddmall.db.domain.DdmallIssueExample;

import javax.annotation.Resource;
import java.util.List;

/**
 * @USER: xhd
 * @DATE: 2021-02-05
 * @Desc:
 */
@Service
public class DdmallIssueService {
    @Resource
    private DdmallIssueMapper issueMapper;

    public List querySelective(String question, int page, int limit, String sort, String order) {
        DdmallIssueExample example = new DdmallIssueExample();
        DdmallIssueExample.Criteria criteria = example.createCriteria();

        if (!StringUtils.isEmpty(question)) {
            criteria.andQuestionLike("%" + question + "%");
        }
        criteria.andDeletedEqualTo(false);

        if (!StringUtils.isEmpty(sort) && !StringUtils.isEmpty(order)) {
            example.setOrderByClause(sort + " " + order);
        }

        PageHelper.startPage(page, limit);
        return issueMapper.selectByExample(example);
    }
}
