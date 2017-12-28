/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables;


import com.moseeker.baseorm.db.hrdb.Hrdb;
import com.moseeker.baseorm.db.hrdb.Keys;
import com.moseeker.baseorm.db.hrdb.tables.records.HrCompanyConfRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * 公司级别的配置信息表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrCompanyConf extends TableImpl<HrCompanyConfRecord> {

    private static final long serialVersionUID = -1652589161;

    /**
     * The reference instance of <code>hrdb.hr_company_conf</code>
     */
    public static final HrCompanyConf HR_COMPANY_CONF = new HrCompanyConf();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HrCompanyConfRecord> getRecordType() {
        return HrCompanyConfRecord.class;
    }

    /**
     * The column <code>hrdb.hr_company_conf.company_id</code>.
     */
    public final TableField<HrCompanyConfRecord, Integer> COMPANY_ID = createField("company_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>hrdb.hr_company_conf.theme_id</code>. config_sys_theme.id
     */
    public final TableField<HrCompanyConfRecord, Integer> THEME_ID = createField("theme_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("5", org.jooq.impl.SQLDataType.INTEGER)), this, "config_sys_theme.id");

    /**
     * The column <code>hrdb.hr_company_conf.hb_throttle</code>. 全局每人每次红包活动可以获得的红包金额上限
     */
    public final TableField<HrCompanyConfRecord, Integer> HB_THROTTLE = createField("hb_throttle", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("10", org.jooq.impl.SQLDataType.INTEGER)), this, "全局每人每次红包活动可以获得的红包金额上限");

    /**
     * The column <code>hrdb.hr_company_conf.app_reply</code>. 申请提交成功回复信息
     */
    public final TableField<HrCompanyConfRecord, String> APP_REPLY = createField("app_reply", org.jooq.impl.SQLDataType.VARCHAR.length(999).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "申请提交成功回复信息");

    /**
     * The column <code>hrdb.hr_company_conf.create_time</code>. 创建时间
     */
    public final TableField<HrCompanyConfRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>hrdb.hr_company_conf.update_time</code>. 更新时间
     */
    public final TableField<HrCompanyConfRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "更新时间");

    /**
     * The column <code>hrdb.hr_company_conf.employee_binding</code>. 员工认证自定义文案
     */
    public final TableField<HrCompanyConfRecord, String> EMPLOYEE_BINDING = createField("employee_binding", org.jooq.impl.SQLDataType.VARCHAR.length(999).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "员工认证自定义文案");

    /**
     * The column <code>hrdb.hr_company_conf.recommend_presentee</code>. 推荐候选人自定义文案
     */
    public final TableField<HrCompanyConfRecord, String> RECOMMEND_PRESENTEE = createField("recommend_presentee", org.jooq.impl.SQLDataType.VARCHAR.length(999).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "推荐候选人自定义文案");

    /**
     * The column <code>hrdb.hr_company_conf.recommend_success</code>. 推荐成功自定义文案
     */
    public final TableField<HrCompanyConfRecord, String> RECOMMEND_SUCCESS = createField("recommend_success", org.jooq.impl.SQLDataType.VARCHAR.length(999).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "推荐成功自定义文案");

    /**
     * The column <code>hrdb.hr_company_conf.forward_message</code>. 转发职位自定义文案
     */
    public final TableField<HrCompanyConfRecord, String> FORWARD_MESSAGE = createField("forward_message", org.jooq.impl.SQLDataType.VARCHAR.length(999).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "转发职位自定义文案");

    /**
     * The column <code>hrdb.hr_company_conf.application_count_limit</code>. 一个人在一个公司下每月申请次数限制
     */
    public final TableField<HrCompanyConfRecord, Short> APPLICATION_COUNT_LIMIT = createField("application_count_limit", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("3", org.jooq.impl.SQLDataType.SMALLINT)), this, "一个人在一个公司下每月申请次数限制");

    /**
     * The column <code>hrdb.hr_company_conf.school_application_count_limit</code>. 一个人在一个公司下每月校招职位申请次数限制
     */
    public final TableField<HrCompanyConfRecord, Short> SCHOOL_APPLICATION_COUNT_LIMIT = createField("school_application_count_limit", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("3", org.jooq.impl.SQLDataType.SMALLINT)), this, "一个人在一个公司下每月校招职位申请次数限制");

    /**
     * The column <code>hrdb.hr_company_conf.job_custom_title</code>. 职位自定义字段标题
     */
    public final TableField<HrCompanyConfRecord, String> JOB_CUSTOM_TITLE = createField("job_custom_title", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "职位自定义字段标题");

    /**
     * The column <code>hrdb.hr_company_conf.search_seq</code>. 搜索页页面设置顺序,3#1#2
     */
    public final TableField<HrCompanyConfRecord, String> SEARCH_SEQ = createField("search_seq", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "搜索页页面设置顺序,3#1#2");

    /**
     * The column <code>hrdb.hr_company_conf.search_img</code>. 搜索页页面设置背景图
     */
    public final TableField<HrCompanyConfRecord, String> SEARCH_IMG = createField("search_img", org.jooq.impl.SQLDataType.VARCHAR.length(200).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "搜索页页面设置背景图");

    /**
     * The column <code>hrdb.hr_company_conf.job_occupation</code>. 自定义字段名称
     */
    public final TableField<HrCompanyConfRecord, String> JOB_OCCUPATION = createField("job_occupation", org.jooq.impl.SQLDataType.VARCHAR.length(30), this, "自定义字段名称");

    /**
     * The column <code>hrdb.hr_company_conf.teamname_custom</code>. 自定义部门别名
     */
    public final TableField<HrCompanyConfRecord, String> TEAMNAME_CUSTOM = createField("teamname_custom", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "自定义部门别名");

    /**
     * The column <code>hrdb.hr_company_conf.application_time</code>. newjd_status即新的jd页的生效时间，
     */
    public final TableField<HrCompanyConfRecord, Timestamp> APPLICATION_TIME = createField("application_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "newjd_status即新的jd页的生效时间，");

    /**
     * The column <code>hrdb.hr_company_conf.newjd_status</code>. 新jd页去设置状态0是为开启，1是用户开启，2是审核通过（使用新jd），3撤销（返回基础版） 默认是0
     */
    public final TableField<HrCompanyConfRecord, Integer> NEWJD_STATUS = createField("newjd_status", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "新jd页去设置状态0是为开启，1是用户开启，2是审核通过（使用新jd），3撤销（返回基础版） 默认是0");

    /**
     * The column <code>hrdb.hr_company_conf.hr_chat</code>. IM聊天开关，0：不开启，1：开启
     */
    public final TableField<HrCompanyConfRecord, Byte> HR_CHAT = createField("hr_chat", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "IM聊天开关，0：不开启，1：开启");

    /**
     * The column <code>hrdb.hr_company_conf.show_in_qx</code>. 公司信息、团队信息、职位信息在仟寻展示，0: 否， 1: 是
     */
    public final TableField<HrCompanyConfRecord, Byte> SHOW_IN_QX = createField("show_in_qx", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "公司信息、团队信息、职位信息在仟寻展示，0: 否， 1: 是");

    /**
     * The column <code>hrdb.hr_company_conf.employee_slug</code>. 员工自定义称谓
     */
    public final TableField<HrCompanyConfRecord, String> EMPLOYEE_SLUG = createField("employee_slug", org.jooq.impl.SQLDataType.VARCHAR.length(512).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "员工自定义称谓");

    /**
     * The column <code>hrdb.hr_company_conf.display_locale</code>. 公司页面语言，格式:IETF language tag
     */
    public final TableField<HrCompanyConfRecord, String> DISPLAY_LOCALE = createField("display_locale", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("zh_CN", org.jooq.impl.SQLDataType.VARCHAR)), this, "公司页面语言，格式:IETF language tag");

    /**
     * The column <code>hrdb.hr_company_conf.talentpool_status</code>. '人才库状态表 0未开启，1开启';
     */
    public final TableField<HrCompanyConfRecord, Byte> TALENTPOOL_STATUS = createField("talentpool_status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "'人才库状态表 0未开启，1开启';");

    /**
     * Create a <code>hrdb.hr_company_conf</code> table reference
     */
    public HrCompanyConf() {
        this("hr_company_conf", null);
    }

    /**
     * Create an aliased <code>hrdb.hr_company_conf</code> table reference
     */
    public HrCompanyConf(String alias) {
        this(alias, HR_COMPANY_CONF);
    }

    private HrCompanyConf(String alias, Table<HrCompanyConfRecord> aliased) {
        this(alias, aliased, null);
    }

    private HrCompanyConf(String alias, Table<HrCompanyConfRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "公司级别的配置信息表");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Hrdb.HRDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<HrCompanyConfRecord> getPrimaryKey() {
        return Keys.KEY_HR_COMPANY_CONF_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<HrCompanyConfRecord>> getKeys() {
        return Arrays.<UniqueKey<HrCompanyConfRecord>>asList(Keys.KEY_HR_COMPANY_CONF_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCompanyConf as(String alias) {
        return new HrCompanyConf(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public HrCompanyConf rename(String name) {
        return new HrCompanyConf(name, null);
    }
}
