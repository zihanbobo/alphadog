/**
 * This class is generated by jOOQ
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
import org.jooq.types.UInteger;
import org.jooq.types.UShort;


/**
 * 公司级别的配置信息表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrCompanyConf extends TableImpl<HrCompanyConfRecord> {

    private static final long serialVersionUID = -1865229109;

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
    public final TableField<HrCompanyConfRecord, UInteger> COMPANY_ID = createField("company_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>hrdb.hr_company_conf.theme_id</code>. config_sys_theme.id
     */
    public final TableField<HrCompanyConfRecord, Integer> THEME_ID = createField("theme_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("5", org.jooq.impl.SQLDataType.INTEGER)), this, "config_sys_theme.id");

    /**
     * The column <code>hrdb.hr_company_conf.hb_throttle</code>. 全局每人每次红包活动可以获得的红包金额上限
     */
    public final TableField<HrCompanyConfRecord, Integer> HB_THROTTLE = createField("hb_throttle", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("10", org.jooq.impl.SQLDataType.INTEGER)), this, "全局每人每次红包活动可以获得的红包金额上限");

    /**
     * The column <code>hrdb.hr_company_conf.app_reply</code>. 申请提交成功回复信息
     */
    public final TableField<HrCompanyConfRecord, String> APP_REPLY = createField("app_reply", org.jooq.impl.SQLDataType.VARCHAR.length(999).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "申请提交成功回复信息");

    /**
     * The column <code>hrdb.hr_company_conf.create_time</code>. 创建时间
     */
    public final TableField<HrCompanyConfRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>hrdb.hr_company_conf.update_time</code>. 更新时间
     */
    public final TableField<HrCompanyConfRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "更新时间");

    /**
     * The column <code>hrdb.hr_company_conf.employee_binding</code>. 员工认证自定义文案
     */
    public final TableField<HrCompanyConfRecord, String> EMPLOYEE_BINDING = createField("employee_binding", org.jooq.impl.SQLDataType.VARCHAR.length(999).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "员工认证自定义文案");

    /**
     * The column <code>hrdb.hr_company_conf.recommend_presentee</code>. 推荐候选人自定义文案
     */
    public final TableField<HrCompanyConfRecord, String> RECOMMEND_PRESENTEE = createField("recommend_presentee", org.jooq.impl.SQLDataType.VARCHAR.length(999).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "推荐候选人自定义文案");

    /**
     * The column <code>hrdb.hr_company_conf.recommend_success</code>. 推荐成功自定义文案
     */
    public final TableField<HrCompanyConfRecord, String> RECOMMEND_SUCCESS = createField("recommend_success", org.jooq.impl.SQLDataType.VARCHAR.length(999).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "推荐成功自定义文案");

    /**
     * The column <code>hrdb.hr_company_conf.forward_message</code>. 转发职位自定义文案
     */
    public final TableField<HrCompanyConfRecord, String> FORWARD_MESSAGE = createField("forward_message", org.jooq.impl.SQLDataType.VARCHAR.length(999).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "转发职位自定义文案");

    /**
     * The column <code>hrdb.hr_company_conf.application_count_limit</code>. 一个人在一个公司下每月申请次数限制
     */
    public final TableField<HrCompanyConfRecord, UShort> APPLICATION_COUNT_LIMIT = createField("application_count_limit", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.field("3", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED)), this, "一个人在一个公司下每月申请次数限制");

    /**
     * The column <code>hrdb.hr_company_conf.job_custom_title</code>. 职位自定义字段标题
     */
    public final TableField<HrCompanyConfRecord, String> JOB_CUSTOM_TITLE = createField("job_custom_title", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "职位自定义字段标题");

    /**
     * The column <code>hrdb.hr_company_conf.search_seq</code>. 搜索页页面设置顺序,3#1#2
     */
    public final TableField<HrCompanyConfRecord, String> SEARCH_SEQ = createField("search_seq", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "搜索页页面设置顺序,3#1#2");

    /**
     * The column <code>hrdb.hr_company_conf.search_img</code>. 搜索页页面设置背景图
     */
    public final TableField<HrCompanyConfRecord, String> SEARCH_IMG = createField("search_img", org.jooq.impl.SQLDataType.VARCHAR.length(200).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "搜索页页面设置背景图");

    /**
     * The column <code>hrdb.hr_company_conf.job_occupation</code>. 自定义字段名称
     */
    public final TableField<HrCompanyConfRecord, String> JOB_OCCUPATION = createField("job_occupation", org.jooq.impl.SQLDataType.VARCHAR.length(30).defaultValue(org.jooq.impl.DSL.field("职位职能", org.jooq.impl.SQLDataType.VARCHAR)), this, "自定义字段名称");

    /**
     * The column <code>hrdb.hr_company_conf.teamname_custom</code>. 自定义部门别名
     */
    public final TableField<HrCompanyConfRecord, String> TEAMNAME_CUSTOM = createField("teamname_custom", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "自定义部门别名");

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
    public HrCompanyConf rename(String name) {
        return new HrCompanyConf(name, null);
    }
}
