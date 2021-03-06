/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.userdb.tables;


import com.moseeker.baseorm.db.userdb.Keys;
import com.moseeker.baseorm.db.userdb.Userdb;
import com.moseeker.baseorm.db.userdb.tables.records.UserReferralRecordRecord;

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
 * 员工主动推荐记录
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserReferralRecord extends TableImpl<UserReferralRecordRecord> {

    private static final long serialVersionUID = -1846258687;

    /**
     * The reference instance of <code>userdb.user_referral_record</code>
     */
    public static final UserReferralRecord USER_REFERRAL_RECORD = new UserReferralRecord();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserReferralRecordRecord> getRecordType() {
        return UserReferralRecordRecord.class;
    }

    /**
     * The column <code>userdb.user_referral_record.id</code>. 主key
     */
    public final TableField<UserReferralRecordRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "主key");

    /**
     * The column <code>userdb.user_referral_record.user_id</code>. 用户编号
     */
    public final TableField<UserReferralRecordRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER, this, "用户编号");

    /**
     * The column <code>userdb.user_referral_record.reference_id</code>. 推荐人编号
     */
    public final TableField<UserReferralRecordRecord, Integer> REFERENCE_ID = createField("reference_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "推荐人编号");

    /**
     * The column <code>userdb.user_referral_record.company_id</code>. 公司编号
     */
    public final TableField<UserReferralRecordRecord, Integer> COMPANY_ID = createField("company_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "公司编号");

    /**
     * The column <code>userdb.user_referral_record.create_time</code>. 创建时间
     */
    public final TableField<UserReferralRecordRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>userdb.user_referral_record.update_time</code>. 更新时间
     */
    public final TableField<UserReferralRecordRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "更新时间");

    /**
     * The column <code>userdb.user_referral_record.scene</code>. 内推的场景 1. 内推 2. ChatBot 上传 
     */
    public final TableField<UserReferralRecordRecord, Byte> SCENE = createField("scene", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "内推的场景 1. 内推 2. ChatBot 上传 ");

    /**
     * Create a <code>userdb.user_referral_record</code> table reference
     */
    public UserReferralRecord() {
        this("user_referral_record", null);
    }

    /**
     * Create an aliased <code>userdb.user_referral_record</code> table reference
     */
    public UserReferralRecord(String alias) {
        this(alias, USER_REFERRAL_RECORD);
    }

    private UserReferralRecord(String alias, Table<UserReferralRecordRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserReferralRecord(String alias, Table<UserReferralRecordRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "员工主动推荐记录");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Userdb.USERDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<UserReferralRecordRecord, Integer> getIdentity() {
        return Keys.IDENTITY_USER_REFERRAL_RECORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserReferralRecordRecord> getPrimaryKey() {
        return Keys.KEY_USER_REFERRAL_RECORD_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserReferralRecordRecord>> getKeys() {
        return Arrays.<UniqueKey<UserReferralRecordRecord>>asList(Keys.KEY_USER_REFERRAL_RECORD_PRIMARY, Keys.KEY_USER_REFERRAL_RECORD_UK_USER_COMPANY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserReferralRecord as(String alias) {
        return new UserReferralRecord(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserReferralRecord rename(String name) {
        return new UserReferralRecord(name, null);
    }
}
