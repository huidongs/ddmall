package pers.huidong.ddmall.db.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Database Table Remarks:
 *   收货地址表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table ddmall_address
 */
public class DdmallAddress {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ddmall_address
     *
     * @mbg.generated
     */
    public static final Boolean IS_DELETED = Deleted.IS_DELETED.value();

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ddmall_address
     *
     * @mbg.generated
     */
    public static final Boolean NOT_DELETED = Deleted.NOT_DELETED.value();

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ddmall_address.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   收货人名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ddmall_address.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     * Database Column Remarks:
     *   用户表的用户ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ddmall_address.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     * Database Column Remarks:
     *   行政区域表的省ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ddmall_address.province
     *
     * @mbg.generated
     */
    private String province;

    /**
     * Database Column Remarks:
     *   行政区域表的市ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ddmall_address.city
     *
     * @mbg.generated
     */
    private String city;

    /**
     * Database Column Remarks:
     *   行政区域表的区县ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ddmall_address.county
     *
     * @mbg.generated
     */
    private String county;

    /**
     * Database Column Remarks:
     *   详细收货地址
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ddmall_address.address_detail
     *
     * @mbg.generated
     */
    private String addressDetail;

    /**
     * Database Column Remarks:
     *   地区编码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ddmall_address.area_code
     *
     * @mbg.generated
     */
    private String areaCode;

    /**
     * Database Column Remarks:
     *   邮政编码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ddmall_address.postal_code
     *
     * @mbg.generated
     */
    private String postalCode;

    /**
     * Database Column Remarks:
     *   手机号码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ddmall_address.tel
     *
     * @mbg.generated
     */
    private String tel;

    /**
     * Database Column Remarks:
     *   是否默认地址
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ddmall_address.is_default
     *
     * @mbg.generated
     */
    private Boolean isDefault;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ddmall_address.add_time
     *
     * @mbg.generated
     */
    private LocalDateTime addTime;

    /**
     * Database Column Remarks:
     *   更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ddmall_address.update_time
     *
     * @mbg.generated
     */
    private LocalDateTime updateTime;

    /**
     * Database Column Remarks:
     *   逻辑删除
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ddmall_address.deleted
     *
     * @mbg.generated
     */
    private Boolean deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ddmall_address.id
     *
     * @return the value of ddmall_address.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ddmall_address.id
     *
     * @param id the value for ddmall_address.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ddmall_address.name
     *
     * @return the value of ddmall_address.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ddmall_address.name
     *
     * @param name the value for ddmall_address.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ddmall_address.user_id
     *
     * @return the value of ddmall_address.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ddmall_address.user_id
     *
     * @param userId the value for ddmall_address.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ddmall_address.province
     *
     * @return the value of ddmall_address.province
     *
     * @mbg.generated
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ddmall_address.province
     *
     * @param province the value for ddmall_address.province
     *
     * @mbg.generated
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ddmall_address.city
     *
     * @return the value of ddmall_address.city
     *
     * @mbg.generated
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ddmall_address.city
     *
     * @param city the value for ddmall_address.city
     *
     * @mbg.generated
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ddmall_address.county
     *
     * @return the value of ddmall_address.county
     *
     * @mbg.generated
     */
    public String getCounty() {
        return county;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ddmall_address.county
     *
     * @param county the value for ddmall_address.county
     *
     * @mbg.generated
     */
    public void setCounty(String county) {
        this.county = county;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ddmall_address.address_detail
     *
     * @return the value of ddmall_address.address_detail
     *
     * @mbg.generated
     */
    public String getAddressDetail() {
        return addressDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ddmall_address.address_detail
     *
     * @param addressDetail the value for ddmall_address.address_detail
     *
     * @mbg.generated
     */
    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ddmall_address.area_code
     *
     * @return the value of ddmall_address.area_code
     *
     * @mbg.generated
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ddmall_address.area_code
     *
     * @param areaCode the value for ddmall_address.area_code
     *
     * @mbg.generated
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ddmall_address.postal_code
     *
     * @return the value of ddmall_address.postal_code
     *
     * @mbg.generated
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ddmall_address.postal_code
     *
     * @param postalCode the value for ddmall_address.postal_code
     *
     * @mbg.generated
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ddmall_address.tel
     *
     * @return the value of ddmall_address.tel
     *
     * @mbg.generated
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ddmall_address.tel
     *
     * @param tel the value for ddmall_address.tel
     *
     * @mbg.generated
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ddmall_address.is_default
     *
     * @return the value of ddmall_address.is_default
     *
     * @mbg.generated
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ddmall_address.is_default
     *
     * @param isDefault the value for ddmall_address.is_default
     *
     * @mbg.generated
     */
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ddmall_address.add_time
     *
     * @return the value of ddmall_address.add_time
     *
     * @mbg.generated
     */
    public LocalDateTime getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ddmall_address.add_time
     *
     * @param addTime the value for ddmall_address.add_time
     *
     * @mbg.generated
     */
    public void setAddTime(LocalDateTime addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ddmall_address.update_time
     *
     * @return the value of ddmall_address.update_time
     *
     * @mbg.generated
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ddmall_address.update_time
     *
     * @param updateTime the value for ddmall_address.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_address
     *
     * @mbg.generated
     */
    public void andLogicalDeleted(boolean deleted) {
        setDeleted(deleted ? Deleted.IS_DELETED.value() : Deleted.NOT_DELETED.value());
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ddmall_address.deleted
     *
     * @return the value of ddmall_address.deleted
     *
     * @mbg.generated
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ddmall_address.deleted
     *
     * @param deleted the value for ddmall_address.deleted
     *
     * @mbg.generated
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table ddmall_address
     *
     * @mbg.generated
     */
    public enum Deleted {
        NOT_DELETED(new Boolean("0"), "未删除"),
        IS_DELETED(new Boolean("1"), "已删除");

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table ddmall_address
         *
         * @mbg.generated
         */
        private final Boolean value;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table ddmall_address
         *
         * @mbg.generated
         */
        private final String name;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table ddmall_address
         *
         * @mbg.generated
         */
        Deleted(Boolean value, String name) {
            this.value = value;
            this.name = name;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table ddmall_address
         *
         * @mbg.generated
         */
        public Boolean getValue() {
            return this.value;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table ddmall_address
         *
         * @mbg.generated
         */
        public Boolean value() {
            return this.value;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table ddmall_address
         *
         * @mbg.generated
         */
        public String getName() {
            return this.name;
        }
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table ddmall_address
     *
     * @mbg.generated
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        name("name", "name", "VARCHAR", true),
        userId("user_id", "userId", "INTEGER", false),
        province("province", "province", "VARCHAR", false),
        city("city", "city", "VARCHAR", false),
        county("county", "county", "VARCHAR", false),
        addressDetail("address_detail", "addressDetail", "VARCHAR", false),
        areaCode("area_code", "areaCode", "CHAR", false),
        postalCode("postal_code", "postalCode", "CHAR", false),
        tel("tel", "tel", "VARCHAR", false),
        isDefault("is_default", "isDefault", "BIT", false),
        addTime("add_time", "addTime", "TIMESTAMP", false),
        updateTime("update_time", "updateTime", "TIMESTAMP", false),
        deleted("deleted", "deleted", "BIT", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table ddmall_address
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table ddmall_address
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table ddmall_address
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table ddmall_address
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table ddmall_address
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table ddmall_address
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table ddmall_address
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table ddmall_address
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table ddmall_address
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table ddmall_address
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table ddmall_address
         *
         * @mbg.generated
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table ddmall_address
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table ddmall_address
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table ddmall_address
         *
         * @mbg.generated
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table ddmall_address
         *
         * @mbg.generated
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table ddmall_address
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}