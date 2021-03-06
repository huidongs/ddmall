package pers.huidong.ddmall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pers.huidong.ddmall.db.domain.DdmallNoticeAdmin;
import pers.huidong.ddmall.db.domain.DdmallNoticeAdminExample;

public interface DdmallNoticeAdminMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_notice_admin
     *
     * @mbg.generated
     */
    long countByExample(DdmallNoticeAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_notice_admin
     *
     * @mbg.generated
     */
    int deleteByExample(DdmallNoticeAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_notice_admin
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_notice_admin
     *
     * @mbg.generated
     */
    int insert(DdmallNoticeAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_notice_admin
     *
     * @mbg.generated
     */
    int insertSelective(DdmallNoticeAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_notice_admin
     *
     * @mbg.generated
     */
    DdmallNoticeAdmin selectOneByExample(DdmallNoticeAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_notice_admin
     *
     * @mbg.generated
     */
    DdmallNoticeAdmin selectOneByExampleSelective(@Param("example") DdmallNoticeAdminExample example, @Param("selective") DdmallNoticeAdmin.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_notice_admin
     *
     * @mbg.generated
     */
    List<DdmallNoticeAdmin> selectByExampleSelective(@Param("example") DdmallNoticeAdminExample example, @Param("selective") DdmallNoticeAdmin.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_notice_admin
     *
     * @mbg.generated
     */
    List<DdmallNoticeAdmin> selectByExample(DdmallNoticeAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_notice_admin
     *
     * @mbg.generated
     */
    DdmallNoticeAdmin selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") DdmallNoticeAdmin.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_notice_admin
     *
     * @mbg.generated
     */
    DdmallNoticeAdmin selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_notice_admin
     *
     * @mbg.generated
     */
    DdmallNoticeAdmin selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_notice_admin
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") DdmallNoticeAdmin record, @Param("example") DdmallNoticeAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_notice_admin
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") DdmallNoticeAdmin record, @Param("example") DdmallNoticeAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_notice_admin
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DdmallNoticeAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_notice_admin
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DdmallNoticeAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_notice_admin
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") DdmallNoticeAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_notice_admin
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}