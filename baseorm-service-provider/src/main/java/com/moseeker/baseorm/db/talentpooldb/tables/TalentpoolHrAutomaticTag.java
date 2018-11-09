/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.talentpooldb.tables;


import com.moseeker.baseorm.db.talentpooldb.Keys;
import com.moseeker.baseorm.db.talentpooldb.Talentpooldb;
import com.moseeker.baseorm.db.talentpooldb.tables.records.TalentpoolHrAutomaticTagRecord;

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
 * hr自动标签
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TalentpoolHrAutomaticTag extends TableImpl<TalentpoolHrAutomaticTagRecord> {

    private static final long serialVersionUID = -1112971679;

    /**
     * The reference instance of <code>talentpooldb.talentpool_hr_automatic_tag</code>
     */
    public static final TalentpoolHrAutomaticTag TALENTPOOL_HR_AUTOMATIC_TAG = new TalentpoolHrAutomaticTag();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TalentpoolHrAutomaticTagRecord> getRecordType() {
        return TalentpoolHrAutomaticTagRecord.class;
    }

    /**
     * The column <code>talentpooldb.talentpool_hr_automatic_tag.id</code>.
     */
    public final TableField<TalentpoolHrAutomaticTagRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>talentpooldb.talentpool_hr_automatic_tag.hr_id</code>. hr编号
     */
    public final TableField<TalentpoolHrAutomaticTagRecord, Integer> HR_ID = createField("hr_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "hr编号");

    /**
     * The column <code>talentpooldb.talentpool_hr_automatic_tag.name</code>. 过滤项的名称
     */
    public final TableField<TalentpoolHrAutomaticTagRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "过滤项的名称");

    /**
     * The column <code>talentpooldb.talentpool_hr_automatic_tag.color</code>.  标签颜色
     */
    public final TableField<TalentpoolHrAutomaticTagRecord, String> COLOR = createField("color", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, " 标签颜色");

    /**
     * The column <code>talentpooldb.talentpool_hr_automatic_tag.origins</code>. 来源
     */
    public final TableField<TalentpoolHrAutomaticTagRecord, String> ORIGINS = createField("origins", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "来源");

    /**
     * The column <code>talentpooldb.talentpool_hr_automatic_tag.work_years</code>. 工作年限 存储的是code
     */
    public final TableField<TalentpoolHrAutomaticTagRecord, String> WORK_YEARS = createField("work_years", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "工作年限 存储的是code");

    /**
     * The column <code>talentpooldb.talentpool_hr_automatic_tag.city_name</code>. 现居住地
     */
    public final TableField<TalentpoolHrAutomaticTagRecord, String> CITY_NAME = createField("city_name", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "现居住地");

    /**
     * The column <code>talentpooldb.talentpool_hr_automatic_tag.city_code</code>. 城市的code
     */
    public final TableField<TalentpoolHrAutomaticTagRecord, String> CITY_CODE = createField("city_code", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "城市的code");

    /**
     * The column <code>talentpooldb.talentpool_hr_automatic_tag.degree</code>. 学历 传code
     */
    public final TableField<TalentpoolHrAutomaticTagRecord, String> DEGREE = createField("degree", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "学历 传code");

    /**
     * The column <code>talentpooldb.talentpool_hr_automatic_tag.past_position</code>. 曾经工作过的职位
     */
    public final TableField<TalentpoolHrAutomaticTagRecord, String> PAST_POSITION = createField("past_position", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "曾经工作过的职位");

    /**
     * The column <code>talentpooldb.talentpool_hr_automatic_tag.in_last_job_search_position</code>. 是否只搜索最近一份工作 0否 1是
     */
    public final TableField<TalentpoolHrAutomaticTagRecord, Integer> IN_LAST_JOB_SEARCH_POSITION = createField("in_last_job_search_position", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "是否只搜索最近一份工作 0否 1是");

    /**
     * The column <code>talentpooldb.talentpool_hr_automatic_tag.min_age</code>. 最小年龄
     */
    public final TableField<TalentpoolHrAutomaticTagRecord, Integer> MIN_AGE = createField("min_age", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "最小年龄");

    /**
     * The column <code>talentpooldb.talentpool_hr_automatic_tag.max_age</code>. 最大年龄
     */
    public final TableField<TalentpoolHrAutomaticTagRecord, Integer> MAX_AGE = createField("max_age", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "最大年龄");

    /**
     * The column <code>talentpooldb.talentpool_hr_automatic_tag.intention_city_name</code>. 期待工作地
     */
    public final TableField<TalentpoolHrAutomaticTagRecord, String> INTENTION_CITY_NAME = createField("intention_city_name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "期待工作地");

    /**
     * The column <code>talentpooldb.talentpool_hr_automatic_tag.intention_city_code</code>. 期望城市的code
     */
    public final TableField<TalentpoolHrAutomaticTagRecord, String> INTENTION_CITY_CODE = createField("intention_city_code", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "期望城市的code");

    /**
     * The column <code>talentpooldb.talentpool_hr_automatic_tag.intention_salary_code</code>. 期待薪资
     */
    public final TableField<TalentpoolHrAutomaticTagRecord, String> INTENTION_SALARY_CODE = createField("intention_salary_code", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "期待薪资");

    /**
     * The column <code>talentpooldb.talentpool_hr_automatic_tag.sex</code>. 性别 1男，2女 0 不限
     */
    public final TableField<TalentpoolHrAutomaticTagRecord, Integer> SEX = createField("sex", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "性别 1男，2女 0 不限");

    /**
     * The column <code>talentpooldb.talentpool_hr_automatic_tag.is_recommend</code>. 是否只看内推 0否，1是
     */
    public final TableField<TalentpoolHrAutomaticTagRecord, Integer> IS_RECOMMEND = createField("is_recommend", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "是否只看内推 0否，1是");

    /**
     * The column <code>talentpooldb.talentpool_hr_automatic_tag.company_name</code>. 工作过的公司
     */
    public final TableField<TalentpoolHrAutomaticTagRecord, String> COMPANY_NAME = createField("company_name", org.jooq.impl.SQLDataType.VARCHAR.length(1024).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "工作过的公司");

    /**
     * The column <code>talentpooldb.talentpool_hr_automatic_tag.in_last_job_search_company</code>. 是否只搜最近一个公司 0否，1是
     */
    public final TableField<TalentpoolHrAutomaticTagRecord, Integer> IN_LAST_JOB_SEARCH_COMPANY = createField("in_last_job_search_company", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "是否只搜最近一个公司 0否，1是");

    /**
     * The column <code>talentpooldb.talentpool_hr_automatic_tag.create_time</code>. 创建时间
     */
    public final TableField<TalentpoolHrAutomaticTagRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>talentpooldb.talentpool_hr_automatic_tag.update_time</code>. 更新时间
     */
    public final TableField<TalentpoolHrAutomaticTagRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "更新时间");

    /**
     * The column <code>talentpooldb.talentpool_hr_automatic_tag.disable</code>. 1有效，0删除，2关闭
     */
    public final TableField<TalentpoolHrAutomaticTagRecord, Integer> DISABLE = createField("disable", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.INTEGER)), this, "1有效，0删除，2关闭");

    /**
     * The column <code>talentpooldb.talentpool_hr_automatic_tag.keywords</code>. 关键词，以;分割，最多10个
     */
    public final TableField<TalentpoolHrAutomaticTagRecord, String> KEYWORDS = createField("keywords", org.jooq.impl.SQLDataType.VARCHAR.length(512).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "关键词，以;分割，最多10个");

    /**
     * The column <code>talentpooldb.talentpool_hr_automatic_tag.contain_any_key</code>. 是否符合任一关键词就匹配 0 否 1 是
     */
    public final TableField<TalentpoolHrAutomaticTagRecord, Byte> CONTAIN_ANY_KEY = createField("contain_any_key", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否符合任一关键词就匹配 0 否 1 是");

    /**
     * Create a <code>talentpooldb.talentpool_hr_automatic_tag</code> table reference
     */
    public TalentpoolHrAutomaticTag() {
        this("talentpool_hr_automatic_tag", null);
    }

    /**
     * Create an aliased <code>talentpooldb.talentpool_hr_automatic_tag</code> table reference
     */
    public TalentpoolHrAutomaticTag(String alias) {
        this(alias, TALENTPOOL_HR_AUTOMATIC_TAG);
    }

    private TalentpoolHrAutomaticTag(String alias, Table<TalentpoolHrAutomaticTagRecord> aliased) {
        this(alias, aliased, null);
    }

    private TalentpoolHrAutomaticTag(String alias, Table<TalentpoolHrAutomaticTagRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "hr自动标签");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Talentpooldb.TALENTPOOLDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TalentpoolHrAutomaticTagRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TALENTPOOL_HR_AUTOMATIC_TAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TalentpoolHrAutomaticTagRecord> getPrimaryKey() {
        return Keys.KEY_TALENTPOOL_HR_AUTOMATIC_TAG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TalentpoolHrAutomaticTagRecord>> getKeys() {
        return Arrays.<UniqueKey<TalentpoolHrAutomaticTagRecord>>asList(Keys.KEY_TALENTPOOL_HR_AUTOMATIC_TAG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TalentpoolHrAutomaticTag as(String alias) {
        return new TalentpoolHrAutomaticTag(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TalentpoolHrAutomaticTag rename(String name) {
        return new TalentpoolHrAutomaticTag(name, null);
    }
}