/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.hrdb.tables;


import com.moseeker.baseorm.db.hrdb.Hrdb;
import com.moseeker.baseorm.db.hrdb.Keys;
import com.moseeker.baseorm.db.hrdb.tables.records.HrSearchConditionRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * 候选人列表常用筛选项
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrSearchCondition extends TableImpl<HrSearchConditionRecord> {

    private static final long serialVersionUID = 879290816;

    /**
     * The reference instance of <code>hrdb.hr_search_condition</code>
     */
    public static final HrSearchCondition HR_SEARCH_CONDITION = new HrSearchCondition();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HrSearchConditionRecord> getRecordType() {
        return HrSearchConditionRecord.class;
    }

    /**
     * The column <code>hrdb.hr_search_condition.id</code>.
     */
    public final TableField<HrSearchConditionRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>hrdb.hr_search_condition.name</code>. 常用搜索条件名称，长度不超过12个字符
     */
    public final TableField<HrSearchConditionRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(24).nullable(false), this, "常用搜索条件名称，长度不超过12个字符");

    /**
     * The column <code>hrdb.hr_search_condition.publisher</code>. 发布人id(user_hr_account.id)
     */
    public final TableField<HrSearchConditionRecord, Integer> PUBLISHER = createField("publisher", org.jooq.impl.SQLDataType.INTEGER, this, "发布人id(user_hr_account.id)");

    /**
     * The column <code>hrdb.hr_search_condition.position_id</code>. 职位id
     */
    public final TableField<HrSearchConditionRecord, Integer> POSITION_ID = createField("position_id", org.jooq.impl.SQLDataType.INTEGER, this, "职位id");

    /**
     * The column <code>hrdb.hr_search_condition.keyword</code>. 关键字
     */
    public final TableField<HrSearchConditionRecord, String> KEYWORD = createField("keyword", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "关键字");

    /**
     * The column <code>hrdb.hr_search_condition.submit_time</code>. 投递时间
     */
    public final TableField<HrSearchConditionRecord, String> SUBMIT_TIME = createField("submit_time", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "投递时间");

    /**
     * The column <code>hrdb.hr_search_condition.work_years</code>. 工作年限、工龄
     */
    public final TableField<HrSearchConditionRecord, Integer> WORK_YEARS = createField("work_years", org.jooq.impl.SQLDataType.INTEGER, this, "工作年限、工龄");

    /**
     * The column <code>hrdb.hr_search_condition.city_code</code>. 现居住地
     */
    public final TableField<HrSearchConditionRecord, String> CITY_CODE = createField("city_code", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "现居住地");

    /**
     * The column <code>hrdb.hr_search_condition.degree</code>. 学历
     */
    public final TableField<HrSearchConditionRecord, String> DEGREE = createField("degree", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "学历");

    /**
     * The column <code>hrdb.hr_search_condition.past_position</code>. 曾任职务
     */
    public final TableField<HrSearchConditionRecord, String> PAST_POSITION = createField("past_position", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "曾任职务");

    /**
     * The column <code>hrdb.hr_search_condition.in_last_job_search_position</code>. 是否只在最近一份工作中搜索曾任职务(0:否，1:是)
     */
    public final TableField<HrSearchConditionRecord, Integer> IN_LAST_JOB_SEARCH_POSITION = createField("in_last_job_search_position", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "是否只在最近一份工作中搜索曾任职务(0:否，1:是)");

    /**
     * The column <code>hrdb.hr_search_condition.min_age</code>. 最小年龄
     */
    public final TableField<HrSearchConditionRecord, Integer> MIN_AGE = createField("min_age", org.jooq.impl.SQLDataType.INTEGER, this, "最小年龄");

    /**
     * The column <code>hrdb.hr_search_condition.max_age</code>. 最大年龄
     */
    public final TableField<HrSearchConditionRecord, Integer> MAX_AGE = createField("max_age", org.jooq.impl.SQLDataType.INTEGER, this, "最大年龄");

    /**
     * The column <code>hrdb.hr_search_condition.intention_city_code</code>. 期望工作地(城市编码)
     */
    public final TableField<HrSearchConditionRecord, Integer> INTENTION_CITY_CODE = createField("intention_city_code", org.jooq.impl.SQLDataType.INTEGER, this, "期望工作地(城市编码)");

    /**
     * The column <code>hrdb.hr_search_condition.sex</code>. 性别
     */
    public final TableField<HrSearchConditionRecord, Integer> SEX = createField("sex", org.jooq.impl.SQLDataType.INTEGER, this, "性别");

    /**
     * The column <code>hrdb.hr_search_condition.intention_salary_code</code>. 期望薪资
     */
    public final TableField<HrSearchConditionRecord, String> INTENTION_SALARY_CODE = createField("intention_salary_code", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "期望薪资");

    /**
     * The column <code>hrdb.hr_search_condition.company_name</code>. 公司名称
     */
    public final TableField<HrSearchConditionRecord, String> COMPANY_NAME = createField("company_name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "公司名称");

    /**
     * The column <code>hrdb.hr_search_condition.in_last_job_search_company</code>. 是否只在最近一份工作中搜索公司名称（0:否，1:是）
     */
    public final TableField<HrSearchConditionRecord, Integer> IN_LAST_JOB_SEARCH_COMPANY = createField("in_last_job_search_company", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "是否只在最近一份工作中搜索公司名称（0:否，1:是）");

    /**
     * The column <code>hrdb.hr_search_condition.hr_account_id</code>. 创建人id(user_hr_account.id)
     */
    public final TableField<HrSearchConditionRecord, Integer> HR_ACCOUNT_ID = createField("hr_account_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "创建人id(user_hr_account.id)");

    /**
     * The column <code>hrdb.hr_search_condition.create_time</code>. 创建时间
     */
    public final TableField<HrSearchConditionRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>hrdb.hr_search_condition.update_time</code>. 简历更新时间选项（0：不限，1：最近一周，2：最近两周，3：最近一个月）
     */
    public final TableField<HrSearchConditionRecord, Integer> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "简历更新时间选项（0：不限，1：最近一周，2：最近两周，3：最近一个月）");

    /**
     * The column <code>hrdb.hr_search_condition.type</code>. 类型（0：候选人列表筛选条件，1：人才库列表筛选条件）
     */
    public final TableField<HrSearchConditionRecord, Integer> TYPE = createField("type", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "类型（0：候选人列表筛选条件，1：人才库列表筛选条件）");

    /**
     * Create a <code>hrdb.hr_search_condition</code> table reference
     */
    public HrSearchCondition() {
        this("hr_search_condition", null);
    }

    /**
     * Create an aliased <code>hrdb.hr_search_condition</code> table reference
     */
    public HrSearchCondition(String alias) {
        this(alias, HR_SEARCH_CONDITION);
    }

    private HrSearchCondition(String alias, Table<HrSearchConditionRecord> aliased) {
        this(alias, aliased, null);
    }

    private HrSearchCondition(String alias, Table<HrSearchConditionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "候选人列表常用筛选项");
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
    public Identity<HrSearchConditionRecord, Integer> getIdentity() {
        return Keys.IDENTITY_HR_SEARCH_CONDITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<HrSearchConditionRecord> getPrimaryKey() {
        return Keys.KEY_HR_SEARCH_CONDITION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<HrSearchConditionRecord>> getKeys() {
        return Arrays.<UniqueKey<HrSearchConditionRecord>>asList(Keys.KEY_HR_SEARCH_CONDITION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrSearchCondition as(String alias) {
        return new HrSearchCondition(alias, this);
    }

    /**
     * Rename this table
     */
    public HrSearchCondition rename(String name) {
        return new HrSearchCondition(name, null);
    }
}
