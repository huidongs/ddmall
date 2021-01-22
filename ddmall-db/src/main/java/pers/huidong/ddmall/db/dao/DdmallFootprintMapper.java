package pers.huidong.ddmall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pers.huidong.ddmall.db.domain.DdmallFootprint;
import pers.huidong.ddmall.db.domain.DdmallFootprintExample;

public interface DdmallFootprintMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_footprint
     *
     * @mbg.generated
     */
    long countByExample(DdmallFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_footprint
     *
     * @mbg.generated
     */
    int deleteByExample(DdmallFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_footprint
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_footprint
     *
     * @mbg.generated
     */
    int insert(DdmallFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_footprint
     *
     * @mbg.generated
     */
    int insertSelective(DdmallFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_footprint
     *
     * @mbg.generated
     */
    DdmallFootprint selectOneByExample(DdmallFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_footprint
     *
     * @mbg.generated
     */
    DdmallFootprint selectOneByExampleSelective(@Param("example") DdmallFootprintExample example, @Param("selective") DdmallFootprint.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_footprint
     *
     * @mbg.generated
     */
    List<DdmallFootprint> selectByExampleSelective(@Param("example") DdmallFootprintExample example, @Param("selective") DdmallFootprint.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_footprint
     *
     * @mbg.generated
     */
    List<DdmallFootprint> selectByExample(DdmallFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_footprint
     *
     * @mbg.generated
     */
    DdmallFootprint selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") DdmallFootprint.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_footprint
     *
     * @mbg.generated
     */
    DdmallFootprint selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_footprint
     *
     * @mbg.generated
     */
    DdmallFootprint selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_footprint
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") DdmallFootprint record, @Param("example") DdmallFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_footprint
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") DdmallFootprint record, @Param("example") DdmallFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_footprint
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DdmallFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_footprint
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DdmallFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_footprint
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") DdmallFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_footprint
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}