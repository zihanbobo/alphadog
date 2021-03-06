/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.profiledb.tables;


import com.moseeker.baseorm.db.profiledb.Keys;
import com.moseeker.baseorm.db.profiledb.Profiledb;
import com.moseeker.baseorm.db.profiledb.tables.records.ProfileIntentionIndustryRecord;

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
 * Profile的求职意向-行业关系表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProfileIntentionIndustry extends TableImpl<ProfileIntentionIndustryRecord> {

    private static final long serialVersionUID = 1670072842;

    /**
     * The reference instance of <code>profiledb.profile_intention_industry</code>
     */
    public static final ProfileIntentionIndustry PROFILE_INTENTION_INDUSTRY = new ProfileIntentionIndustry();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProfileIntentionIndustryRecord> getRecordType() {
        return ProfileIntentionIndustryRecord.class;
    }

    /**
     * The column <code>profiledb.profile_intention_industry.id</code>. 主key
     */
    public final TableField<ProfileIntentionIndustryRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "主key");

    /**
     * The column <code>profiledb.profile_intention_industry.profile_intention_id</code>. profile_intention.id
     */
    public final TableField<ProfileIntentionIndustryRecord, Integer> PROFILE_INTENTION_ID = createField("profile_intention_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "profile_intention.id");

    /**
     * The column <code>profiledb.profile_intention_industry.industry_code</code>. 行业字典编码
     */
    public final TableField<ProfileIntentionIndustryRecord, Integer> INDUSTRY_CODE = createField("industry_code", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "行业字典编码");

    /**
     * The column <code>profiledb.profile_intention_industry.industry_name</code>. 行业名称
     */
    public final TableField<ProfileIntentionIndustryRecord, String> INDUSTRY_NAME = createField("industry_name", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "行业名称");

    /**
     * Create a <code>profiledb.profile_intention_industry</code> table reference
     */
    public ProfileIntentionIndustry() {
        this("profile_intention_industry", null);
    }

    /**
     * Create an aliased <code>profiledb.profile_intention_industry</code> table reference
     */
    public ProfileIntentionIndustry(String alias) {
        this(alias, PROFILE_INTENTION_INDUSTRY);
    }

    private ProfileIntentionIndustry(String alias, Table<ProfileIntentionIndustryRecord> aliased) {
        this(alias, aliased, null);
    }

    private ProfileIntentionIndustry(String alias, Table<ProfileIntentionIndustryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "Profile的求职意向-行业关系表");
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
    public Identity<ProfileIntentionIndustryRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PROFILE_INTENTION_INDUSTRY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ProfileIntentionIndustryRecord> getPrimaryKey() {
        return Keys.KEY_PROFILE_INTENTION_INDUSTRY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ProfileIntentionIndustryRecord>> getKeys() {
        return Arrays.<UniqueKey<ProfileIntentionIndustryRecord>>asList(Keys.KEY_PROFILE_INTENTION_INDUSTRY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfileIntentionIndustry as(String alias) {
        return new ProfileIntentionIndustry(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ProfileIntentionIndustry rename(String name) {
        return new ProfileIntentionIndustry(name, null);
    }
}
