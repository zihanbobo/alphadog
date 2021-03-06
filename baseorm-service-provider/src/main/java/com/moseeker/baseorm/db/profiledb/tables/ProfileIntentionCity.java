/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.profiledb.tables;


import com.moseeker.baseorm.db.profiledb.Keys;
import com.moseeker.baseorm.db.profiledb.Profiledb;
import com.moseeker.baseorm.db.profiledb.tables.records.ProfileIntentionCityRecord;

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
 * Profile的求职意向-期望城市关系表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProfileIntentionCity extends TableImpl<ProfileIntentionCityRecord> {

    private static final long serialVersionUID = 1032080852;

    /**
     * The reference instance of <code>profiledb.profile_intention_city</code>
     */
    public static final ProfileIntentionCity PROFILE_INTENTION_CITY = new ProfileIntentionCity();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProfileIntentionCityRecord> getRecordType() {
        return ProfileIntentionCityRecord.class;
    }

    /**
     * The column <code>profiledb.profile_intention_city.id</code>. 主key
     */
    public final TableField<ProfileIntentionCityRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "主key");

    /**
     * The column <code>profiledb.profile_intention_city.profile_intention_id</code>. profile_intention.id
     */
    public final TableField<ProfileIntentionCityRecord, Integer> PROFILE_INTENTION_ID = createField("profile_intention_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "profile_intention.id");

    /**
     * The column <code>profiledb.profile_intention_city.city_code</code>. 期望城市字典编码
     */
    public final TableField<ProfileIntentionCityRecord, Integer> CITY_CODE = createField("city_code", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "期望城市字典编码");

    /**
     * The column <code>profiledb.profile_intention_city.city_name</code>. 期望城市名称
     */
    public final TableField<ProfileIntentionCityRecord, String> CITY_NAME = createField("city_name", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "期望城市名称");

    /**
     * Create a <code>profiledb.profile_intention_city</code> table reference
     */
    public ProfileIntentionCity() {
        this("profile_intention_city", null);
    }

    /**
     * Create an aliased <code>profiledb.profile_intention_city</code> table reference
     */
    public ProfileIntentionCity(String alias) {
        this(alias, PROFILE_INTENTION_CITY);
    }

    private ProfileIntentionCity(String alias, Table<ProfileIntentionCityRecord> aliased) {
        this(alias, aliased, null);
    }

    private ProfileIntentionCity(String alias, Table<ProfileIntentionCityRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "Profile的求职意向-期望城市关系表");
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
    public Identity<ProfileIntentionCityRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PROFILE_INTENTION_CITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ProfileIntentionCityRecord> getPrimaryKey() {
        return Keys.KEY_PROFILE_INTENTION_CITY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ProfileIntentionCityRecord>> getKeys() {
        return Arrays.<UniqueKey<ProfileIntentionCityRecord>>asList(Keys.KEY_PROFILE_INTENTION_CITY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfileIntentionCity as(String alias) {
        return new ProfileIntentionCity(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ProfileIntentionCity rename(String name) {
        return new ProfileIntentionCity(name, null);
    }
}
