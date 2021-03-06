package pers.huidong.ddmall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pers.huidong.ddmall.db.domain.DdmallRegion;
import pers.huidong.ddmall.db.domain.DdmallRegionExample;

public interface DdmallRegionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_region
     *
     * @mbg.generated
     */
    long countByExample(DdmallRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_region
     *
     * @mbg.generated
     */
    int deleteByExample(DdmallRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_region
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_region
     *
     * @mbg.generated
     */
    int insert(DdmallRegion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_region
     *
     * @mbg.generated
     */
    int insertSelective(DdmallRegion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_region
     *
     * @mbg.generated
     */
    DdmallRegion selectOneByExample(DdmallRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_region
     *
     * @mbg.generated
     */
    DdmallRegion selectOneByExampleSelective(@Param("example") DdmallRegionExample example, @Param("selective") DdmallRegion.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_region
     *
     * @mbg.generated
     */
    List<DdmallRegion> selectByExampleSelective(@Param("example") DdmallRegionExample example, @Param("selective") DdmallRegion.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_region
     *
     * @mbg.generated
     */
    List<DdmallRegion> selectByExample(DdmallRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_region
     *
     * @mbg.generated
     */
    DdmallRegion selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") DdmallRegion.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_region
     *
     * @mbg.generated
     */
    DdmallRegion selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_region
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") DdmallRegion record, @Param("example") DdmallRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_region
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") DdmallRegion record, @Param("example") DdmallRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_region
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DdmallRegion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_region
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DdmallRegion record);
}