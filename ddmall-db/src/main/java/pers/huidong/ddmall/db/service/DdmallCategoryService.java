package pers.huidong.ddmall.db.service;

import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import pers.huidong.ddmall.db.dao.DdmallCategoryMapper;
import pers.huidong.ddmall.db.domain.DdmallCategory;
import pers.huidong.ddmall.db.domain.DdmallCategoryExample;

import javax.annotation.Resource;
import java.util.List;

/**
 * @USER: xhd
 * @DATE: 2021-01-22
 * @Desc:
 */
@Service
public class DdmallCategoryService {
    @Resource
    private DdmallCategoryMapper categoryMapper;
    private DdmallCategory.Column[] CHANNEL = {DdmallCategory.Column.id, DdmallCategory.Column.name, DdmallCategory.Column.iconUrl};

    public List<DdmallCategory> queryL1WithoutRecommend(int offset,int limit) {
        DdmallCategoryExample example = new DdmallCategoryExample();
        example.or().andLevelEqualTo("L1").andNameNotEqualTo("推荐").andDeletedEqualTo(false);
        PageHelper.startPage(offset,limit);
        return categoryMapper.selectByExample(example);
    }

    public List<DdmallCategory> queryChannel() {
        DdmallCategoryExample example = new DdmallCategoryExample();
        example.or().andLevelEqualTo("L1").andDeletedEqualTo(false);
        return categoryMapper.selectByExampleSelective(example,CHANNEL);
    }


    public List<DdmallCategory> queryByPid(Integer pid) {
        DdmallCategoryExample example = new DdmallCategoryExample();
        example.or().andPidEqualTo(pid).andDeletedEqualTo(false);
        return categoryMapper.selectByExample(example);
    }
}
