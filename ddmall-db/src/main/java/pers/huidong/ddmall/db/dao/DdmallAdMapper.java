package pers.huidong.ddmall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pers.huidong.ddmall.db.domain.DdmallAd;
import pers.huidong.ddmall.db.domain.DdmallAdExample;

public interface DdmallAdMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_ad
     *
     * @mbg.generated
     */
    long countByExample(DdmallAdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_ad
     *
     * @mbg.generated
     */
    int deleteByExample(DdmallAdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_ad
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_ad
     *
     * @mbg.generated
     */
    int insert(DdmallAd record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_ad
     *
     * @mbg.generated
     */
    int insertSelective(DdmallAd record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_ad
     *
     * @mbg.generated
     */
    DdmallAd selectOneByExample(DdmallAdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_ad
     *
     * @mbg.generated
     */
    DdmallAd selectOneByExampleSelective(@Param("example") DdmallAdExample example, @Param("selective") DdmallAd.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_ad
     *
     * @mbg.generated
     */
    List<DdmallAd> selectByExampleSelective(@Param("example") DdmallAdExample example, @Param("selective") DdmallAd.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_ad
     *
     * @mbg.generated
     */
    List<DdmallAd> selectByExample(DdmallAdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_ad
     *
     * @mbg.generated
     */
    DdmallAd selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") DdmallAd.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_ad
     *
     * @mbg.generated
     */
    DdmallAd selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_ad
     *
     * @mbg.generated
     */
    DdmallAd selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_ad
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") DdmallAd record, @Param("example") DdmallAdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_ad
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") DdmallAd record, @Param("example") DdmallAdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_ad
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DdmallAd record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_ad
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DdmallAd record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_ad
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") DdmallAdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_ad
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}