package pers.huidong.ddmall.db.service;

import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import pers.huidong.ddmall.db.dao.DdmallCommentMapper;
import pers.huidong.ddmall.db.domain.DdmallComment;
import pers.huidong.ddmall.db.domain.DdmallCommentExample;

import javax.annotation.Resource;
import java.util.List;

/**
 * @USER: xhd
 * @DATE: 2021-02-05
 * @Desc:
 */
@Service
public class DdmallCommentService {
    @Resource
    private DdmallCommentMapper commentMapper;

    public List<DdmallComment> queryGoodsByGid(Integer id, int offset, int limit) {
        DdmallCommentExample example = new DdmallCommentExample();
        example.setOrderByClause(DdmallComment.Column.addTime.desc());
        example.or().andValueIdEqualTo(id).andTypeEqualTo((byte) 0).andDeletedEqualTo(false);
        PageHelper.startPage(offset, limit);
        return commentMapper.selectByExample(example);
    }
}
