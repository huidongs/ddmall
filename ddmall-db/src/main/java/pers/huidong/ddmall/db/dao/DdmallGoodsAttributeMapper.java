package pers.huidong.ddmall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pers.huidong.ddmall.db.domain.DdmallGoodsAttribute;
import pers.huidong.ddmall.db.domain.DdmallGoodsAttributeExample;

public interface DdmallGoodsAttributeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_goods_attribute
     *
     * @mbg.generated
     */
    long countByExample(DdmallGoodsAttributeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_goods_attribute
     *
     * @mbg.generated
     */
    int deleteByExample(DdmallGoodsAttributeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_goods_attribute
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_goods_attribute
     *
     * @mbg.generated
     */
    int insert(DdmallGoodsAttribute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_goods_attribute
     *
     * @mbg.generated
     */
    int insertSelective(DdmallGoodsAttribute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_goods_attribute
     *
     * @mbg.generated
     */
    DdmallGoodsAttribute selectOneByExample(DdmallGoodsAttributeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_goods_attribute
     *
     * @mbg.generated
     */
    DdmallGoodsAttribute selectOneByExampleSelective(@Param("example") DdmallGoodsAttributeExample example, @Param("selective") DdmallGoodsAttribute.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_goods_attribute
     *
     * @mbg.generated
     */
    List<DdmallGoodsAttribute> selectByExampleSelective(@Param("example") DdmallGoodsAttributeExample example, @Param("selective") DdmallGoodsAttribute.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_goods_attribute
     *
     * @mbg.generated
     */
    List<DdmallGoodsAttribute> selectByExample(DdmallGoodsAttributeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_goods_attribute
     *
     * @mbg.generated
     */
    DdmallGoodsAttribute selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") DdmallGoodsAttribute.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_goods_attribute
     *
     * @mbg.generated
     */
    DdmallGoodsAttribute selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_goods_attribute
     *
     * @mbg.generated
     */
    DdmallGoodsAttribute selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_goods_attribute
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") DdmallGoodsAttribute record, @Param("example") DdmallGoodsAttributeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_goods_attribute
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") DdmallGoodsAttribute record, @Param("example") DdmallGoodsAttributeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_goods_attribute
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DdmallGoodsAttribute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_goods_attribute
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DdmallGoodsAttribute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_goods_attribute
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") DdmallGoodsAttributeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_goods_attribute
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}