package pers.huidong.ddmall.db.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
/**
 * Database Table Remarks:
 *   评论表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table ddmall_comment
 */
public class DdmallComment {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ddmall_comment
     *
     * @mbg.generated
     */
    public static final Boolean IS_DELETED = Deleted.IS_DELETED.value();

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ddmall_comment
     *
     * @mbg.generated
     */
    public static final Boolean NOT_DELETED = Deleted.NOT_DELETED.value();

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ddmall_comment.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   如果type=0，则是商品评论；如果是type=1，则是专题评论。
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ddmall_comment.value_id
     *
     * @mbg.generated
     */
    private Integer valueId;

    /**
     * Database Column Remarks:
     *   评论类型，如果type=0，则是商品评论；如果是type=1，则是专题评论；
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ddmall_comment.type
     *
     * @mbg.generated
     */
    private Byte type;

    /**
     * Database Column Remarks:
     *   评论内容
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ddmall_comment.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     * Database Column Remarks:
     *   管理员回复内容
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ddmall_comment.admin_content
     *
     * @mbg.generated
     */
    private String adminContent;

    /**
     * Database Column Remarks:
     *   用户表的用户ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ddmall_comment.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     * Database Column Remarks:
     *   是否含有图片
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ddmall_comment.has_picture
     *
     * @mbg.generated
     */
    private Boolean hasPicture;

    /**
     * Database Column Remarks:
     *   图片地址列表，采用JSON数组格式
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ddmall_comment.pic_urls
     *
     * @mbg.generated
     */
    private String[] picUrls;

    /**
     * Database Column Remarks:
     *   评分， 1-5
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ddmall_comment.star
     *
     * @mbg.generated
     */
    private Short star;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ddmall_comment.add_time
     *
     * @mbg.generated
     */
    private LocalDateTime addTime;

    /**
     * Database Column Remarks:
     *   更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ddmall_comment.update_time
     *
     * @mbg.generated
     */
    private LocalDateTime updateTime;

    /**
     * Database Column Remarks:
     *   逻辑删除
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ddmall_comment.deleted
     *
     * @mbg.generated
     */
    private Boolean deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ddmall_comment.id
     *
     * @return the value of ddmall_comment.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ddmall_comment.id
     *
     * @param id the value for ddmall_comment.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ddmall_comment.value_id
     *
     * @return the value of ddmall_comment.value_id
     *
     * @mbg.generated
     */
    public Integer getValueId() {
        return valueId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ddmall_comment.value_id
     *
     * @param valueId the value for ddmall_comment.value_id
     *
     * @mbg.generated
     */
    public void setValueId(Integer valueId) {
        this.valueId = valueId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ddmall_comment.type
     *
     * @return the value of ddmall_comment.type
     *
     * @mbg.generated
     */
    public Byte getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ddmall_comment.type
     *
     * @param type the value for ddmall_comment.type
     *
     * @mbg.generated
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ddmall_comment.content
     *
     * @return the value of ddmall_comment.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ddmall_comment.content
     *
     * @param content the value for ddmall_comment.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ddmall_comment.admin_content
     *
     * @return the value of ddmall_comment.admin_content
     *
     * @mbg.generated
     */
    public String getAdminContent() {
        return adminContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ddmall_comment.admin_content
     *
     * @param adminContent the value for ddmall_comment.admin_content
     *
     * @mbg.generated
     */
    public void setAdminContent(String adminContent) {
        this.adminContent = adminContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ddmall_comment.user_id
     *
     * @return the value of ddmall_comment.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ddmall_comment.user_id
     *
     * @param userId the value for ddmall_comment.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ddmall_comment.has_picture
     *
     * @return the value of ddmall_comment.has_picture
     *
     * @mbg.generated
     */
    public Boolean getHasPicture() {
        return hasPicture;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ddmall_comment.has_picture
     *
     * @param hasPicture the value for ddmall_comment.has_picture
     *
     * @mbg.generated
     */
    public void setHasPicture(Boolean hasPicture) {
        this.hasPicture = hasPicture;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ddmall_comment.pic_urls
     *
     * @return the value of ddmall_comment.pic_urls
     *
     * @mbg.generated
     */
    public String[] getPicUrls() {
        return picUrls;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ddmall_comment.pic_urls
     *
     * @param picUrls the value for ddmall_comment.pic_urls
     *
     * @mbg.generated
     */
    public void setPicUrls(String[] picUrls) {
        this.picUrls = picUrls;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ddmall_comment.star
     *
     * @return the value of ddmall_comment.star
     *
     * @mbg.generated
     */
    public Short getStar() {
        return star;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ddmall_comment.star
     *
     * @param star the value for ddmall_comment.star
     *
     * @mbg.generated
     */
    public void setStar(Short star) {
        this.star = star;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ddmall_comment.add_time
     *
     * @return the value of ddmall_comment.add_time
     *
     * @mbg.generated
     */
    public LocalDateTime getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ddmall_comment.add_time
     *
     * @param addTime the value for ddmall_comment.add_time
     *
     * @mbg.generated
     */
    public void setAddTime(LocalDateTime addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ddmall_comment.update_time
     *
     * @return the value of ddmall_comment.update_time
     *
     * @mbg.generated
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ddmall_comment.update_time
     *
     * @param updateTime the value for ddmall_comment.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_comment
     *
     * @mbg.generated
     */
    public void andLogicalDeleted(boolean deleted) {
        setDeleted(deleted ? Deleted.IS_DELETED.value() : Deleted.NOT_DELETED.value());
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ddmall_comment.deleted
     *
     * @return the value of ddmall_comment.deleted
     *
     * @mbg.generated
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ddmall_comment.deleted
     *
     * @param deleted the value for ddmall_comment.deleted
     *
     * @mbg.generated
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table ddmall_comment
     *
     * @mbg.generated
     */
    public enum Deleted {
        NOT_DELETED(new Boolean("0"), "未删除"),
        IS_DELETED(new Boolean("1"), "已删除");

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table ddmall_comment
         *
         * @mbg.generated
         */
        private final Boolean value;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table ddmall_comment
         *
         * @mbg.generated
         */
        private final String name;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table ddmall_comment
         *
         * @mbg.generated
         */
        Deleted(Boolean value, String name) {
            this.value = value;
            this.name = name;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table ddmall_comment
         *
         * @mbg.generated
         */
        public Boolean getValue() {
            return this.value;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table ddmall_comment
         *
         * @mbg.generated
         */
        public Boolean value() {
            return this.value;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table ddmall_comment
         *
         * @mbg.generated
         */
        public String getName() {
            return this.name;
        }
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table ddmall_comment
     *
     * @mbg.generated
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        valueId("value_id", "valueId", "INTEGER", false),
        type("type", "type", "TINYINT", true),
        content("content", "content", "VARCHAR", false),
        adminContent("admin_content", "adminContent", "VARCHAR", false),
        userId("user_id", "userId", "INTEGER", false),
        hasPicture("has_picture", "hasPicture", "BIT", false),
        picUrls("pic_urls", "picUrls", "VARCHAR", false),
        star("star", "star", "SMALLINT", false),
        addTime("add_time", "addTime", "TIMESTAMP", false),
        updateTime("update_time", "updateTime", "TIMESTAMP", false),
        deleted("deleted", "deleted", "BIT", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table ddmall_comment
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table ddmall_comment
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table ddmall_comment
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table ddmall_comment
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table ddmall_comment
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table ddmall_comment
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table ddmall_comment
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table ddmall_comment
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table ddmall_comment
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table ddmall_comment
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table ddmall_comment
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
         * This method corresponds to the database table ddmall_comment
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table ddmall_comment
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table ddmall_comment
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
         * This method corresponds to the database table ddmall_comment
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
         * This method corresponds to the database table ddmall_comment
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}