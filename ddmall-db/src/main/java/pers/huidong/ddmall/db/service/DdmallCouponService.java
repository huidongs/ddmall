package pers.huidong.ddmall.db.service;

import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import pers.huidong.ddmall.db.dao.DdmallCouponMapper;
import pers.huidong.ddmall.db.dao.DdmallCouponUserMapper;
import pers.huidong.ddmall.db.domain.DdmallCoupon;
import pers.huidong.ddmall.db.domain.DdmallCoupon.Column;
import pers.huidong.ddmall.db.domain.DdmallCouponExample;
import pers.huidong.ddmall.db.domain.DdmallCouponUser;
import pers.huidong.ddmall.db.domain.DdmallCouponUserExample;
import pers.huidong.ddmall.db.util.CouponConstant;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @USER: xhd
 * @DATE: 2021-01-22
 * @Desc:
 */
@Service
public class DdmallCouponService {
    @Resource
    private DdmallCouponMapper couponMapper;
    @Resource
    private DdmallCouponUserMapper couponUserMapper;

    private Column[] result = new Column[]{Column.id, Column.name, Column.desc, Column.tag,
            Column.days, Column.startTime, Column.endTime,
            Column.discount, Column.min};

    /**
     * 查询，空参数
     *
     * @param offset
     * @param limit
     * @param sort
     * @param order
     * @return
     */
    public List<DdmallCoupon> queryList(int offset, int limit, String sort, String order) {
        return queryList(DdmallCouponExample.newAndCreateCriteria(), offset, limit, sort, order);
    }

    /**
     * 查询
     *
     * @param criteria 可扩展的条件
     * @param offset
     * @param limit
     * @param sort
     * @param order
     * @return
     */
    public List<DdmallCoupon> queryList(DdmallCouponExample.Criteria criteria, int offset, int limit, String sort, String order) {
        criteria.andTypeEqualTo(CouponConstant.TYPE_COMMON).andStatusEqualTo(CouponConstant.STATUS_NORMAL).andDeletedEqualTo(false);
        criteria.example().setOrderByClause(sort + " " + order);
        PageHelper.startPage(offset, limit);
        return couponMapper.selectByExampleSelective(criteria.example(), result);
    }

    public List<DdmallCoupon> queryAvailableList(Integer userId, int offset, int limit) {
        assert userId != null;
        // 过滤掉登录账号已经领取过的coupon
        DdmallCouponExample.Criteria c = DdmallCouponExample.newAndCreateCriteria();
        List<DdmallCouponUser> used = couponUserMapper.selectByExample(
                DdmallCouponUserExample.newAndCreateCriteria().andUserIdEqualTo(userId).example()
        );
        if (used != null && !used.isEmpty()) {
            c.andIdNotIn(used.stream().map(DdmallCouponUser::getCouponId).collect(Collectors.toList()));
        }
        return queryList(c, offset, limit, "add_time", "desc");
    }

    public List<DdmallCoupon> queryList(int offset, int limit) {
        return queryList(offset, limit, "add_time", "desc");
    }


    public DdmallCoupon findById(Integer couponId) {
        return couponMapper.selectByPrimaryKey(couponId);
    }
}
