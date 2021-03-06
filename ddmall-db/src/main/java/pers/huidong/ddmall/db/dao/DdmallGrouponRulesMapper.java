package pers.huidong.ddmall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pers.huidong.ddmall.db.domain.DdmallGrouponRules;
import pers.huidong.ddmall.db.domain.DdmallGrouponRulesExample;

public interface DdmallGrouponRulesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_groupon_rules
     *
     * @mbg.generated
     */
    long countByExample(DdmallGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_groupon_rules
     *
     * @mbg.generated
     */
    int deleteByExample(DdmallGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_groupon_rules
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_groupon_rules
     *
     * @mbg.generated
     */
    int insert(DdmallGrouponRules record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_groupon_rules
     *
     * @mbg.generated
     */
    int insertSelective(DdmallGrouponRules record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_groupon_rules
     *
     * @mbg.generated
     */
    DdmallGrouponRules selectOneByExample(DdmallGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_groupon_rules
     *
     * @mbg.generated
     */
    DdmallGrouponRules selectOneByExampleSelective(@Param("example") DdmallGrouponRulesExample example, @Param("selective") DdmallGrouponRules.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_groupon_rules
     *
     * @mbg.generated
     */
    List<DdmallGrouponRules> selectByExampleSelective(@Param("example") DdmallGrouponRulesExample example, @Param("selective") DdmallGrouponRules.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_groupon_rules
     *
     * @mbg.generated
     */
    List<DdmallGrouponRules> selectByExample(DdmallGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_groupon_rules
     *
     * @mbg.generated
     */
    DdmallGrouponRules selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") DdmallGrouponRules.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_groupon_rules
     *
     * @mbg.generated
     */
    DdmallGrouponRules selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_groupon_rules
     *
     * @mbg.generated
     */
    DdmallGrouponRules selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_groupon_rules
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") DdmallGrouponRules record, @Param("example") DdmallGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_groupon_rules
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") DdmallGrouponRules record, @Param("example") DdmallGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_groupon_rules
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DdmallGrouponRules record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_groupon_rules
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DdmallGrouponRules record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_groupon_rules
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") DdmallGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_groupon_rules
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}