package pers.huidong.ddmall.db.service;

import org.springframework.stereotype.Service;
import pers.huidong.ddmall.db.dao.DdmallBrandMapper;
import pers.huidong.ddmall.db.domain.DdmallBrand.Column;

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

    public List query(int i, Integer brandLimit) {
    }
}
