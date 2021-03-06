package pers.huidong.ddmall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pers.huidong.ddmall.db.domain.DdmallOrder;
import pers.huidong.ddmall.db.domain.DdmallOrderExample;

public interface DdmallOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_order
     *
     * @mbg.generated
     */
    long countByExample(DdmallOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_order
     *
     * @mbg.generated
     */
    int deleteByExample(DdmallOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_order
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_order
     *
     * @mbg.generated
     */
    int insert(DdmallOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_order
     *
     * @mbg.generated
     */
    int insertSelective(DdmallOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_order
     *
     * @mbg.generated
     */
    DdmallOrder selectOneByExample(DdmallOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_order
     *
     * @mbg.generated
     */
    DdmallOrder selectOneByExampleSelective(@Param("example") DdmallOrderExample example, @Param("selective") DdmallOrder.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_order
     *
     * @mbg.generated
     */
    List<DdmallOrder> selectByExampleSelective(@Param("example") DdmallOrderExample example, @Param("selective") DdmallOrder.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_order
     *
     * @mbg.generated
     */
    List<DdmallOrder> selectByExample(DdmallOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_order
     *
     * @mbg.generated
     */
    DdmallOrder selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") DdmallOrder.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_order
     *
     * @mbg.generated
     */
    DdmallOrder selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_order
     *
     * @mbg.generated
     */
    DdmallOrder selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_order
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") DdmallOrder record, @Param("example") DdmallOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_order
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") DdmallOrder record, @Param("example") DdmallOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_order
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DdmallOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_order
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DdmallOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_order
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") DdmallOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_order
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}