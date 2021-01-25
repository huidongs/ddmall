package pers.huidong.ddmall.db.service;

import com.github.pagehelper.PageHelper;
import pers.huidong.ddmall.db.dao.DdmallCouponMapper;
import pers.huidong.ddmall.db.dao.DdmallCouponUserMapper;
import pers.huidong.ddmall.db.domain.DdmallCoupon.Column;
import pers.huidong.ddmall.db.domain.DdmallCouponExample;
import pers.huidong.ddmall.db.util.CouponConstant;

import javax.annotation.Resource;
import java.util.List;

/**
 * @USER: xhd
 * @DATE: 2021-01-22
 * @Desc:
 */
public class DdmallCouponService {
    @Resource
    private DdmallCouponMapper couponMapper;
    @Resource
    private DdmallCouponUserMapper couponUserMapper;

    private Column[] result = new Column[]{Column.id, Column.name, Column.desc, Column.tag,
            Column.days, Column.startTime, Column.endTime,
            Column.discount, Column.min};

    public List queryList(int offset, int limit) {
        return null;
    }

    public List queryAvailableList(Integer userId, int i, int i1) {
        return null;
    }

    public List queryList(DdmallCouponExample.Criteria criteria,int offset,int limit,String sort,String order){
        criteria.andTypeEqualTo(CouponConstant.TYPE_COMMON).andStatusEqualTo(CouponConstant.STATUS_NORMAL).andDeletedEqualTo(false);
        criteria.example().setOrderByClause(sort + " " + order);
        PageHelper.startPage(offset, limit);
        return couponMapper.selectByExampleSelective(criteria.example(), result);
    }
}
