package pers.huidong.ddmall.db.service;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import pers.huidong.ddmall.db.dao.DdmallStorageMapper;
import pers.huidong.ddmall.db.domain.DdmallStorage;
import pers.huidong.ddmall.db.domain.DdmallStorageExample;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @USER: xhd
 * @DATE: 2021-02-19
 * @Desc:
 */
@Service
public class DdmallStorageService {
    @Autowired
    private DdmallStorageMapper storageMapper;

    public void deleteByKey(String key) {
        DdmallStorageExample example = new DdmallStorageExample();
        example.or().andKeyEqualTo(key);
        storageMapper.logicalDeleteByExample(example);
    }

    public void add(DdmallStorage storageInfo) {
        storageInfo.setAddTime(LocalDateTime.now());
        storageInfo.setUpdateTime(LocalDateTime.now());
        storageMapper.insertSelective(storageInfo);
    }

    public DdmallStorage findByKey(String key) {
        DdmallStorageExample example = new DdmallStorageExample();
        example.or().andKeyEqualTo(key).andDeletedEqualTo(false);
        return storageMapper.selectOneByExample(example);
    }

    public int update(DdmallStorage storageInfo) {
        storageInfo.setUpdateTime(LocalDateTime.now());
        return storageMapper.updateByPrimaryKeySelective(storageInfo);
    }

    public DdmallStorage findById(Integer id) {
        return storageMapper.selectByPrimaryKey(id);
    }

    public List<DdmallStorage> querySelective(String key, String name, Integer page, Integer limit, String sort, String order) {
        DdmallStorageExample example = new DdmallStorageExample();
        DdmallStorageExample.Criteria criteria = example.createCriteria();

        if (!StringUtils.isEmpty(key)) {
            criteria.andKeyEqualTo(key);
        }
        if (!StringUtils.isEmpty(name)) {
            criteria.andNameLike("%" + name + "%");
        }
        criteria.andDeletedEqualTo(false);

        if (!StringUtils.isEmpty(sort) && !StringUtils.isEmpty(order)) {
            example.setOrderByClause(sort + " " + order);
        }

        PageHelper.startPage(page, limit);
        return storageMapper.selectByExample(example);
    }
}
