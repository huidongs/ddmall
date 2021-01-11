package pers.huidong.ddmall.db.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.huidong.ddmall.db.dao.DdmallUserMapper;
import pers.huidong.ddmall.db.domain.DdmallUser;
import pers.huidong.ddmall.db.domain.DdmallUserExample;
import sun.util.resources.LocaleData;

import java.time.LocalDateTime;

/**
 * @USER: xhd
 * @DATE: 2021-01-11
 * @Desc:
 */
@Service
public class DdmallUserService {
    @Autowired
    private DdmallUserMapper userMapper;

    public DdmallUser findById(Integer userId){
        return userMapper.selectByPrimaryKey(userId);
    }

    public DdmallUser queryByOpenId(String openId){
        DdmallUserExample example = new DdmallUserExample();
        example.or().andWeixinOpenidEqualTo(openId).andDeletedEqualTo(false);
        return userMapper.selectOneByExample(example);
    }

    public void add(DdmallUser user) {
        user.setAddTime(LocalDateTime.now());
        user.setUpdateTime(LocalDateTime.now());
        userMapper.insertSelective(user);
    }

    public int updateByUser(DdmallUser user) {
        user.setUpdateTime(LocalDateTime.now());
        return userMapper.updateByPrimaryKeySelective(user);
    }
}
