package pers.huidong.ddmall.db.service;

import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import pers.huidong.ddmall.db.dao.DdmallBrandMapper;
import pers.huidong.ddmall.db.domain.DdmallBrand;
import pers.huidong.ddmall.db.domain.DdmallBrand.Column;
import pers.huidong.ddmall.db.domain.DdmallBrandExample;

import javax.annotation.Resource;
import java.util.List;

/**
 * @USER: xhd
 * @DATE: 2021-01-22
 * @Desc:
 */
@Service
public class DdmallBrandService {
    @Resource
    private DdmallBrandMapper brandMapper;
    private Column[] columns = new Column[]{Column.id, Column.name, Column.desc, Column.picUrl, Column.floorPrice};

    public List<DdmallBrand> query(Integer page, Integer limit, String sort, String order) {
        DdmallBrandExample example = new DdmallBrandExample();
        example.or().andDeletedEqualTo(false);
        if (!StringUtils.isEmpty(sort) && !StringUtils.isEmpty(order)) {
            example.setOrderByClause(sort + " " + order);
        }
        PageHelper.startPage(page, limit);
        return brandMapper.selectByExampleSelective(example, columns);
    }
    public List query(Integer page, Integer limit) {
        return query(page, limit, null, null);
    }
}
