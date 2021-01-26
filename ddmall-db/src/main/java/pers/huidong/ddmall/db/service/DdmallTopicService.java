package pers.huidong.ddmall.db.service;

import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import pers.huidong.ddmall.db.dao.DdmallTopicMapper;
import pers.huidong.ddmall.db.domain.DdmallTopic;
import pers.huidong.ddmall.db.domain.DdmallTopic.Column;
import pers.huidong.ddmall.db.domain.DdmallTopicExample;

import javax.annotation.Resource;
import java.util.List;

/**
 * @USER: xhd
 * @DATE: 2021-01-22
 * @Desc:
 */
@Service
public class DdmallTopicService {

    @Resource
    private DdmallTopicMapper topicMapper;

    private Column[] columns = new Column[]{Column.id, Column.title, Column.subtitle, Column.price, Column.picUrl, Column.readCount};

    public List<DdmallTopic> queryList(int offset, int limit, String sort, String order) {
        DdmallTopicExample example = new DdmallTopicExample();
        example.or().andDeletedEqualTo(false);
        example.setOrderByClause(sort + " " + order);
        PageHelper.startPage(offset, limit);
        return topicMapper.selectByExampleSelective(example, columns);
    }
    public List queryList(int offset, Integer limit) {
        return queryList(offset, limit, "add_time", "desc");
    }
}
