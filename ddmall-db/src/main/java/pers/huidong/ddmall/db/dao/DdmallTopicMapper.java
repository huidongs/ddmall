package pers.huidong.ddmall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pers.huidong.ddmall.db.domain.DdmallTopic;
import pers.huidong.ddmall.db.domain.DdmallTopicExample;

public interface DdmallTopicMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_topic
     *
     * @mbg.generated
     */
    long countByExample(DdmallTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_topic
     *
     * @mbg.generated
     */
    int deleteByExample(DdmallTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_topic
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_topic
     *
     * @mbg.generated
     */
    int insert(DdmallTopic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_topic
     *
     * @mbg.generated
     */
    int insertSelective(DdmallTopic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_topic
     *
     * @mbg.generated
     */
    DdmallTopic selectOneByExample(DdmallTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_topic
     *
     * @mbg.generated
     */
    DdmallTopic selectOneByExampleSelective(@Param("example") DdmallTopicExample example, @Param("selective") DdmallTopic.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_topic
     *
     * @mbg.generated
     */
    DdmallTopic selectOneByExampleWithBLOBs(DdmallTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_topic
     *
     * @mbg.generated
     */
    List<DdmallTopic> selectByExampleSelective(@Param("example") DdmallTopicExample example, @Param("selective") DdmallTopic.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_topic
     *
     * @mbg.generated
     */
    List<DdmallTopic> selectByExampleWithBLOBs(DdmallTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_topic
     *
     * @mbg.generated
     */
    List<DdmallTopic> selectByExample(DdmallTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_topic
     *
     * @mbg.generated
     */
    DdmallTopic selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") DdmallTopic.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_topic
     *
     * @mbg.generated
     */
    DdmallTopic selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_topic
     *
     * @mbg.generated
     */
    DdmallTopic selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_topic
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") DdmallTopic record, @Param("example") DdmallTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_topic
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") DdmallTopic record, @Param("example") DdmallTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_topic
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") DdmallTopic record, @Param("example") DdmallTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_topic
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DdmallTopic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_topic
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(DdmallTopic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_topic
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DdmallTopic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_topic
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") DdmallTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_topic
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}