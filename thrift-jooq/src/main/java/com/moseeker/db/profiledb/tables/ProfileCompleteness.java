/*
 * This file is generated by jOOQ.
*/
package com.moseeker.db.profiledb.tables;


import com.moseeker.db.profiledb.Keys;
import com.moseeker.db.profiledb.Profiledb;
import com.moseeker.db.profiledb.tables.records.ProfileCompletenessRecord;

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
 * profile各个部分完成度表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProfileCompleteness extends TableImpl<ProfileCompletenessRecord> {

    private static final long serialVersionUID = 756561286;

    /**
     * The reference instance of <code>profiledb.profile_completeness</code>
     */
    public static final ProfileCompleteness PROFILE_COMPLETENESS = new ProfileCompleteness();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProfileCompletenessRecord> getRecordType() {
        return ProfileCompletenessRecord.class;
    }

    /**
     * The column <code>profiledb.profile_completeness.profile_id</code>. 主key
     */
    public final TableField<ProfileCompletenessRecord, Integer> PROFILE_ID = createField("profile_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "主key");

    /**
     * The column <code>profiledb.profile_completeness.user_user</code>. 用户表信息完成度
     */
    public final TableField<ProfileCompletenessRecord, Integer> USER_USER = createField("user_user", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "用户表信息完成度");

    /**
     * The column <code>profiledb.profile_completeness.profile_basic</code>. profile基础信息表完成度
     */
    public final TableField<ProfileCompletenessRecord, Integer> PROFILE_BASIC = createField("profile_basic", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "profile基础信息表完成度");

    /**
     * The column <code>profiledb.profile_completeness.profile_workexp</code>. 工作经历完成度
     */
    public final TableField<ProfileCompletenessRecord, Integer> PROFILE_WORKEXP = createField("profile_workexp", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "工作经历完成度");

    /**
     * The column <code>profiledb.profile_completeness.profile_education</code>. 教育经历完成度
     */
    public final TableField<ProfileCompletenessRecord, Integer> PROFILE_EDUCATION = createField("profile_education", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "教育经历完成度");

    /**
     * The column <code>profiledb.profile_completeness.profile_projectexp</code>. 项目经历完成度
     */
    public final TableField<ProfileCompletenessRecord, Integer> PROFILE_PROJECTEXP = createField("profile_projectexp", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "项目经历完成度");

    /**
     * The column <code>profiledb.profile_completeness.profile_language</code>. 语言完成度
     */
    public final TableField<ProfileCompletenessRecord, Integer> PROFILE_LANGUAGE = createField("profile_language", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "语言完成度");

    /**
     * The column <code>profiledb.profile_completeness.profile_skill</code>. 技能完成度
     */
    public final TableField<ProfileCompletenessRecord, Integer> PROFILE_SKILL = createField("profile_skill", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "技能完成度");

    /**
     * The column <code>profiledb.profile_completeness.profile_credentials</code>. 证书完成度
     */
    public final TableField<ProfileCompletenessRecord, Integer> PROFILE_CREDENTIALS = createField("profile_credentials", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "证书完成度");

    /**
     * The column <code>profiledb.profile_completeness.profile_awards</code>. 获得奖项完成度
     */
    public final TableField<ProfileCompletenessRecord, Integer> PROFILE_AWARDS = createField("profile_awards", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "获得奖项完成度");

    /**
     * The column <code>profiledb.profile_completeness.profile_works</code>. 个人作品
     */
    public final TableField<ProfileCompletenessRecord, Integer> PROFILE_WORKS = createField("profile_works", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "个人作品");

    /**
     * The column <code>profiledb.profile_completeness.profile_intention</code>. 求职意愿
     */
    public final TableField<ProfileCompletenessRecord, Integer> PROFILE_INTENTION = createField("profile_intention", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "求职意愿");

    /**
     * Create a <code>profiledb.profile_completeness</code> table reference
     */
    public ProfileCompleteness() {
        this("profile_completeness", null);
    }

    /**
     * Create an aliased <code>profiledb.profile_completeness</code> table reference
     */
    public ProfileCompleteness(String alias) {
        this(alias, PROFILE_COMPLETENESS);
    }

    private ProfileCompleteness(String alias, Table<ProfileCompletenessRecord> aliased) {
        this(alias, aliased, null);
    }

    private ProfileCompleteness(String alias, Table<ProfileCompletenessRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "profile各个部分完成度表");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Profiledb.PROFILEDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ProfileCompletenessRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PROFILE_COMPLETENESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ProfileCompletenessRecord> getPrimaryKey() {
        return Keys.KEY_PROFILE_COMPLETENESS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ProfileCompletenessRecord>> getKeys() {
        return Arrays.<UniqueKey<ProfileCompletenessRecord>>asList(Keys.KEY_PROFILE_COMPLETENESS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfileCompleteness as(String alias) {
        return new ProfileCompleteness(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ProfileCompleteness rename(String name) {
        return new ProfileCompleteness(name, null);
    }
}
