package pers.huidong.ddmall.db.service;

import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import pers.huidong.ddmall.db.dao.DdmallCouponUserMapper;
import pers.huidong.ddmall.db.domain.DdmallCouponUser;
import pers.huidong.ddmall.db.domain.DdmallCouponUserExample;
import pers.huidong.ddmall.db.util.CouponUserConstant;

import javax.annotation.Resource;
import java.util.List;

/**
 * @USER: xhd
 * @DATE: 2021-02-05
 * @Desc:
 */
@Service
public class DdmallCouponUserService {
    @Resource
    private DdmallCouponUserMapper couponUserMapper;

    public List<DdmallCouponUser> queryList(Integer userId, Integer couponId, Short status, Integer page, Integer size, String sort, String order) {
        DdmallCouponUserExample example = new DdmallCouponUserExample();
        DdmallCouponUserExample.Criteria criteria = example.createCriteria();
        if (userId != null) {
            criteria.andUserIdEqualTo(userId);
        }
        if(couponId != null){
            criteria.andCouponIdEqualTo(couponId);
        }
        if (status != null) {
            criteria.andStatusEqualTo(status);
        }
        criteria.andDeletedEqualTo(false);

        if (!StringUtils.isEmpty(sort) && !StringUtils.isEmpty(order)) {
            example.setOrderByClause(sort + " " + order);
        }

        if (!StringUtils.isEmpty(page) && !StringUtils.isEmpty(size)) {
            PageHelper.startPage(page, size);
        }

        return couponUserMapper.selectByExample(example);
    }
    public List<DdmallCouponUser> queryAll(Integer userId) {
        return queryList(userId, null, CouponUserConstant.STATUS_USABLE, null, null, "add_time", "desc");
    }

    public DdmallCouponUser findById(Integer userCouponId) {
        return couponUserMapper.selectByPrimaryKey(userCouponId);
    }

    public DdmallCouponUser queryOne(Integer userId, Integer couponId) {
        List<DdmallCouponUser> couponUserList = queryList(userId, couponId, CouponUserConstant.STATUS_USABLE, 1, 1, "add_time", "desc");
        if(couponUserList.size() == 0){
            return null;
        }
        return couponUserList.get(0);
    }
}
