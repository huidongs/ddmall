package pers.huidong.ddmall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pers.huidong.ddmall.db.domain.DdmallCouponUser;
import pers.huidong.ddmall.db.domain.DdmallCouponUserExample;

public interface DdmallCouponUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_coupon_user
     *
     * @mbg.generated
     */
    long countByExample(DdmallCouponUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_coupon_user
     *
     * @mbg.generated
     */
    int deleteByExample(DdmallCouponUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_coupon_user
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_coupon_user
     *
     * @mbg.generated
     */
    int insert(DdmallCouponUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_coupon_user
     *
     * @mbg.generated
     */
    int insertSelective(DdmallCouponUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_coupon_user
     *
     * @mbg.generated
     */
    DdmallCouponUser selectOneByExample(DdmallCouponUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_coupon_user
     *
     * @mbg.generated
     */
    DdmallCouponUser selectOneByExampleSelective(@Param("example") DdmallCouponUserExample example, @Param("selective") DdmallCouponUser.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_coupon_user
     *
     * @mbg.generated
     */
    List<DdmallCouponUser> selectByExampleSelective(@Param("example") DdmallCouponUserExample example, @Param("selective") DdmallCouponUser.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_coupon_user
     *
     * @mbg.generated
     */
    List<DdmallCouponUser> selectByExample(DdmallCouponUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_coupon_user
     *
     * @mbg.generated
     */
    DdmallCouponUser selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") DdmallCouponUser.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_coupon_user
     *
     * @mbg.generated
     */
    DdmallCouponUser selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_coupon_user
     *
     * @mbg.generated
     */
    DdmallCouponUser selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_coupon_user
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") DdmallCouponUser record, @Param("example") DdmallCouponUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_coupon_user
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") DdmallCouponUser record, @Param("example") DdmallCouponUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_coupon_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DdmallCouponUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_coupon_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DdmallCouponUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_coupon_user
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") DdmallCouponUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_coupon_user
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}