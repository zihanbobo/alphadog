/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.referraldb.tables;


import com.moseeker.baseorm.db.referraldb.Keys;
import com.moseeker.baseorm.db.referraldb.Referraldb;
import com.moseeker.baseorm.db.referraldb.tables.records.ReferralPositionRelRecord;

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
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ReferralPositionRel extends TableImpl<ReferralPositionRelRecord> {

    private static final long serialVersionUID = 819904803;

    /**
     * The reference instance of <code>referraldb.referral_position_rel</code>
     */
    public static final ReferralPositionRel REFERRAL_POSITION_REL = new ReferralPositionRel();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReferralPositionRelRecord> getRecordType() {
        return ReferralPositionRelRecord.class;
    }

    /**
     * The column <code>referraldb.referral_position_rel.id</code>. 序列ID
     */
    public final TableField<ReferralPositionRelRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "序列ID");

    /**
     * The column <code>referraldb.referral_position_rel.position_id</code>. 职位ID
     */
    public final TableField<ReferralPositionRelRecord, Integer> POSITION_ID = createField("position_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "职位ID");

    /**
     * The column <code>referraldb.referral_position_rel.company_id</code>. 公司ID
     */
    public final TableField<ReferralPositionRelRecord, Integer> COMPANY_ID = createField("company_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "公司ID");

    /**
     * The column <code>referraldb.referral_position_rel.create_time</code>. 创建时间
     */
    public final TableField<ReferralPositionRelRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>referraldb.referral_position_rel.update_time</code>. 更新时间
     */
    public final TableField<ReferralPositionRelRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "更新时间");

    /**
     * Create a <code>referraldb.referral_position_rel</code> table reference
     */
    public ReferralPositionRel() {
        this("referral_position_rel", null);
    }

    /**
     * Create an aliased <code>referraldb.referral_position_rel</code> table reference
     */
    public ReferralPositionRel(String alias) {
        this(alias, REFERRAL_POSITION_REL);
    }

    private ReferralPositionRel(String alias, Table<ReferralPositionRelRecord> aliased) {
        this(alias, aliased, null);
    }

    private ReferralPositionRel(String alias, Table<ReferralPositionRelRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Referraldb.REFERRALDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ReferralPositionRelRecord, Integer> getIdentity() {
        return Keys.IDENTITY_REFERRAL_POSITION_REL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ReferralPositionRelRecord> getPrimaryKey() {
        return Keys.KEY_REFERRAL_POSITION_REL_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ReferralPositionRelRecord>> getKeys() {
        return Arrays.<UniqueKey<ReferralPositionRelRecord>>asList(Keys.KEY_REFERRAL_POSITION_REL_PRIMARY, Keys.KEY_REFERRAL_POSITION_REL_IDX_POSITION_COMPANY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferralPositionRel as(String alias) {
        return new ReferralPositionRel(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReferralPositionRel rename(String name) {
        return new ReferralPositionRel(name, null);
    }
}
