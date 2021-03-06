package pers.huidong.ddmall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pers.huidong.ddmall.db.domain.DdmallLog;
import pers.huidong.ddmall.db.domain.DdmallLogExample;

public interface DdmallLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_log
     *
     * @mbg.generated
     */
    long countByExample(DdmallLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_log
     *
     * @mbg.generated
     */
    int deleteByExample(DdmallLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_log
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_log
     *
     * @mbg.generated
     */
    int insert(DdmallLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_log
     *
     * @mbg.generated
     */
    int insertSelective(DdmallLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_log
     *
     * @mbg.generated
     */
    DdmallLog selectOneByExample(DdmallLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_log
     *
     * @mbg.generated
     */
    DdmallLog selectOneByExampleSelective(@Param("example") DdmallLogExample example, @Param("selective") DdmallLog.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_log
     *
     * @mbg.generated
     */
    List<DdmallLog> selectByExampleSelective(@Param("example") DdmallLogExample example, @Param("selective") DdmallLog.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_log
     *
     * @mbg.generated
     */
    List<DdmallLog> selectByExample(DdmallLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_log
     *
     * @mbg.generated
     */
    DdmallLog selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") DdmallLog.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_log
     *
     * @mbg.generated
     */
    DdmallLog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_log
     *
     * @mbg.generated
     */
    DdmallLog selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_log
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") DdmallLog record, @Param("example") DdmallLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_log
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") DdmallLog record, @Param("example") DdmallLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DdmallLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DdmallLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_log
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") DdmallLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_log
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}