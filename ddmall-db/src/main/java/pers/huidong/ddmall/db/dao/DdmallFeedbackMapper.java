package pers.huidong.ddmall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pers.huidong.ddmall.db.domain.DdmallFeedback;
import pers.huidong.ddmall.db.domain.DdmallFeedbackExample;

public interface DdmallFeedbackMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_feedback
     *
     * @mbg.generated
     */
    long countByExample(DdmallFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_feedback
     *
     * @mbg.generated
     */
    int deleteByExample(DdmallFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_feedback
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_feedback
     *
     * @mbg.generated
     */
    int insert(DdmallFeedback record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_feedback
     *
     * @mbg.generated
     */
    int insertSelective(DdmallFeedback record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_feedback
     *
     * @mbg.generated
     */
    DdmallFeedback selectOneByExample(DdmallFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_feedback
     *
     * @mbg.generated
     */
    DdmallFeedback selectOneByExampleSelective(@Param("example") DdmallFeedbackExample example, @Param("selective") DdmallFeedback.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_feedback
     *
     * @mbg.generated
     */
    List<DdmallFeedback> selectByExampleSelective(@Param("example") DdmallFeedbackExample example, @Param("selective") DdmallFeedback.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_feedback
     *
     * @mbg.generated
     */
    List<DdmallFeedback> selectByExample(DdmallFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_feedback
     *
     * @mbg.generated
     */
    DdmallFeedback selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") DdmallFeedback.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_feedback
     *
     * @mbg.generated
     */
    DdmallFeedback selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_feedback
     *
     * @mbg.generated
     */
    DdmallFeedback selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_feedback
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") DdmallFeedback record, @Param("example") DdmallFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_feedback
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") DdmallFeedback record, @Param("example") DdmallFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_feedback
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DdmallFeedback record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_feedback
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DdmallFeedback record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_feedback
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") DdmallFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_feedback
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}