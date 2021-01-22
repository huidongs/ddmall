package pers.huidong.ddmall.db.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Database Table Remarks:
 *   意见反馈表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table ddmall_feedback
 */
public class DdmallFeedback {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ddmall_feedback
     *
     * @mbg.generated
     */
    public static final Boolean IS_DELETED = Deleted.IS_DELETED.value();

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ddmall_feedback
     *
     * @mbg.generated
     */
    public static final Boolean NOT_DELETED = Deleted.NOT_DELETED.value();

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ddmall_feedback.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   用户表的用户ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ddmall_feedback.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     * Database Column Remarks:
     *   用户名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ddmall_feedback.username
     *
     * @mbg.generated
     */
    private String username;

    /**
     * Database Column Remarks:
     *   手机号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ddmall_feedback.mobile
     *
     * @mbg.generated
     */
    private String mobile;

    /**
     * Database Column Remarks:
     *   反馈类型
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ddmall_feedback.feed_type
     *
     * @mbg.generated
     */
    private String feedType;

    /**
     * Database Column Remarks:
     *   反馈内容
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ddmall_feedback.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     * Database Column Remarks:
     *   状态
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ddmall_feedback.status
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     * Database Column Remarks:
     *   是否含有图片
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ddmall_feedback.has_picture
     *
     * @mbg.generated
     */
    private Boolean hasPicture;

    /**
     * Database Column Remarks:
     *   图片地址列表，采用JSON数组格式
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ddmall_feedback.pic_urls
     *
     * @mbg.generated
     */
    private String[] picUrls;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ddmall_feedback.add_time
     *
     * @mbg.generated
     */
    private LocalDateTime addTime;

    /**
     * Database Column Remarks:
     *   更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ddmall_feedback.update_time
     *
     * @mbg.generated
     */
    private LocalDateTime updateTime;

    /**
     * Database Column Remarks:
     *   逻辑删除
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ddmall_feedback.deleted
     *
     * @mbg.generated
     */
    private Boolean deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ddmall_feedback.id
     *
     * @return the value of ddmall_feedback.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ddmall_feedback.id
     *
     * @param id the value for ddmall_feedback.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ddmall_feedback.user_id
     *
     * @return the value of ddmall_feedback.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ddmall_feedback.user_id
     *
     * @param userId the value for ddmall_feedback.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ddmall_feedback.username
     *
     * @return the value of ddmall_feedback.username
     *
     * @mbg.generated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ddmall_feedback.username
     *
     * @param username the value for ddmall_feedback.username
     *
     * @mbg.generated
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ddmall_feedback.mobile
     *
     * @return the value of ddmall_feedback.mobile
     *
     * @mbg.generated
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ddmall_feedback.mobile
     *
     * @param mobile the value for ddmall_feedback.mobile
     *
     * @mbg.generated
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ddmall_feedback.feed_type
     *
     * @return the value of ddmall_feedback.feed_type
     *
     * @mbg.generated
     */
    public String getFeedType() {
        return feedType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ddmall_feedback.feed_type
     *
     * @param feedType the value for ddmall_feedback.feed_type
     *
     * @mbg.generated
     */
    public void setFeedType(String feedType) {
        this.feedType = feedType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ddmall_feedback.content
     *
     * @return the value of ddmall_feedback.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ddmall_feedback.content
     *
     * @param content the value for ddmall_feedback.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ddmall_feedback.status
     *
     * @return the value of ddmall_feedback.status
     *
     * @mbg.generated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ddmall_feedback.status
     *
     * @param status the value for ddmall_feedback.status
     *
     * @mbg.generated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ddmall_feedback.has_picture
     *
     * @return the value of ddmall_feedback.has_picture
     *
     * @mbg.generated
     */
    public Boolean getHasPicture() {
        return hasPicture;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ddmall_feedback.has_picture
     *
     * @param hasPicture the value for ddmall_feedback.has_picture
     *
     * @mbg.generated
     */
    public void setHasPicture(Boolean hasPicture) {
        this.hasPicture = hasPicture;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ddmall_feedback.pic_urls
     *
     * @return the value of ddmall_feedback.pic_urls
     *
     * @mbg.generated
     */
    public String[] getPicUrls() {
        return picUrls;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ddmall_feedback.pic_urls
     *
     * @param picUrls the value for ddmall_feedback.pic_urls
     *
     * @mbg.generated
     */
    public void setPicUrls(String[] picUrls) {
        this.picUrls = picUrls;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ddmall_feedback.add_time
     *
     * @return the value of ddmall_feedback.add_time
     *
     * @mbg.generated
     */
    public LocalDateTime getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ddmall_feedback.add_time
     *
     * @param addTime the value for ddmall_feedback.add_time
     *
     * @mbg.generated
     */
    public void setAddTime(LocalDateTime addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ddmall_feedback.update_time
     *
     * @return the value of ddmall_feedback.update_time
     *
     * @mbg.generated
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ddmall_feedback.update_time
     *
     * @param updateTime the value for ddmall_feedback.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddmall_feedback
     *
     * @mbg.generated
     */
    public void andLogicalDeleted(boolean deleted) {
        setDeleted(deleted ? Deleted.IS_DELETED.value() : Deleted.NOT_DELETED.value());
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ddmall_feedback.deleted
     *
     * @return the value of ddmall_feedback.deleted
     *
     * @mbg.generated
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ddmall_feedback.deleted
     *
     * @param deleted the value for ddmall_feedback.deleted
     *
     * @mbg.generated
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table ddmall_feedback
     *
     * @mbg.generated
     */
    public enum Deleted {
        NOT_DELETED(new Boolean("0"), "未删除"),
        IS_DELETED(new Boolean("1"), "已删除");

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table ddmall_feedback
         *
         * @mbg.generated
         */
        private final Boolean value;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table ddmall_feedback
         *
         * @mbg.generated
         */
        private final String name;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table ddmall_feedback
         *
         * @mbg.generated
         */
        Deleted(Boolean value, String name) {
            this.value = value;
            this.name = name;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table ddmall_feedback
         *
         * @mbg.generated
         */
        public Boolean getValue() {
            return this.value;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table ddmall_feedback
         *
         * @mbg.generated
         */
        public Boolean value() {
            return this.value;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table ddmall_feedback
         *
         * @mbg.generated
         */
        public String getName() {
            return this.name;
        }
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table ddmall_feedback
     *
     * @mbg.generated
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        userId("user_id", "userId", "INTEGER", false),
        username("username", "username", "VARCHAR", false),
        mobile("mobile", "mobile", "VARCHAR", false),
        feedType("feed_type", "feedType", "VARCHAR", false),
        content("content", "content", "VARCHAR", false),
        status("status", "status", "INTEGER", true),
        hasPicture("has_picture", "hasPicture", "BIT", false),
        picUrls("pic_urls", "picUrls", "VARCHAR", false),
        addTime("add_time", "addTime", "TIMESTAMP", false),
        updateTime("update_time", "updateTime", "TIMESTAMP", false),
        deleted("deleted", "deleted", "BIT", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table ddmall_feedback
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table ddmall_feedback
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table ddmall_feedback
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table ddmall_feedback
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table ddmall_feedback
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table ddmall_feedback
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table ddmall_feedback
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table ddmall_feedback
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table ddmall_feedback
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table ddmall_feedback
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table ddmall_feedback
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
         * This method corresponds to the database table ddmall_feedback
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table ddmall_feedback
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table ddmall_feedback
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
         * This method corresponds to the database table ddmall_feedback
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
         * This method corresponds to the database table ddmall_feedback
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}