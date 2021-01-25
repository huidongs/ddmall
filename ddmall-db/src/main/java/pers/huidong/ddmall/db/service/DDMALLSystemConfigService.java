package pers.huidong.ddmall.db.service;

import pers.huidong.ddmall.db.dao.DdmallSystemMapper;
import pers.huidong.ddmall.db.domain.DdmallSystem;
import pers.huidong.ddmall.db.domain.DdmallSystemExample;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @USER: xhd
 * @DATE: 2021-01-25
 * @Desc:
 */
public class DDMALLSystemConfigService {
    @Resource
    private DdmallSystemMapper systemMapper;

    public Map<String, String> queryAll() {
       DdmallSystemExample example = new DdmallSystemExample();
        example.or().andDeletedEqualTo(false);

        List<DdmallSystem> systemList = systemMapper.selectByExample(example);
        Map<String, String> systemConfigs = new HashMap<>();
        for (DdmallSystem item : systemList) {
            systemConfigs.put(item.getKeyName(), item.getKeyValue());
        }

        return systemConfigs;
    }

    public Map<String, String> listMail() {
       DdmallSystemExample example = new DdmallSystemExample();
        example.or().andKeyNameLike("ddmall_mall_%").andDeletedEqualTo(false);
        List<DdmallSystem> systemList = systemMapper.selectByExample(example);
        Map<String, String> data = new HashMap<>();
        for(DdmallSystem system : systemList){
            data.put(system.getKeyName(), system.getKeyValue());
        }
        return data;
    }

    public Map<String, String> listWx() {
       DdmallSystemExample example = new DdmallSystemExample();
        example.or().andKeyNameLike("ddmall_wx_%").andDeletedEqualTo(false);
        List<DdmallSystem> systemList = systemMapper.selectByExample(example);
        Map<String, String> data = new HashMap<>();
        for(DdmallSystem system : systemList){
            data.put(system.getKeyName(), system.getKeyValue());
        }
        return data;
    }

    public Map<String, String> listOrder() {
       DdmallSystemExample example = new DdmallSystemExample();
        example.or().andKeyNameLike("ddmall_order_%").andDeletedEqualTo(false);
        List<DdmallSystem> systemList = systemMapper.selectByExample(example);
        Map<String, String> data = new HashMap<>();
        for(DdmallSystem system : systemList){
            data.put(system.getKeyName(), system.getKeyValue());
        }
        return data;
    }

    public Map<String, String> listExpress() {
       DdmallSystemExample example = new DdmallSystemExample();
        example.or().andKeyNameLike("ddmall_express_%").andDeletedEqualTo(false);
        List<DdmallSystem> systemList = systemMapper.selectByExample(example);
        Map<String, String> data = new HashMap<>();
        for(DdmallSystem system : systemList){
            data.put(system.getKeyName(), system.getKeyValue());
        }
        return data;
    }

    public void updateConfig(Map<String, String> data) {
        for (Map.Entry<String, String> entry : data.entrySet()) {
           DdmallSystemExample example = new DdmallSystemExample();
            example.or().andKeyNameEqualTo(entry.getKey()).andDeletedEqualTo(false);

           DdmallSystem system = new DdmallSystem();
            system.setKeyName(entry.getKey());
            system.setKeyValue(entry.getValue());
            system.setUpdateTime(LocalDateTime.now());
            systemMapper.updateByExampleSelective(system, example);
        }

    }

    public void addConfig(String key, String value) {
       DdmallSystem system = new DdmallSystem();
        system.setKeyName(key);
        system.setKeyValue(value);
        system.setAddTime(LocalDateTime.now());
        system.setUpdateTime(LocalDateTime.now());
        systemMapper.insertSelective(system);
    }
}
