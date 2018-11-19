/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.referraldb.tables;


import com.moseeker.baseorm.db.referraldb.Keys;
import com.moseeker.baseorm.db.referraldb.Referraldb;
import com.moseeker.baseorm.db.referraldb.tables.records.ReferralRecomHbPositionRecord;

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
 * 推荐类红包与被推荐人关系表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ReferralRecomHbPosition extends TableImpl<ReferralRecomHbPositionRecord> {

    private static final long serialVersionUID = -788544571;

    /**
     * The reference instance of <code>referraldb.referral_recom_hb_position</code>
     */
    public static final ReferralRecomHbPosition REFERRAL_RECOM_HB_POSITION = new ReferralRecomHbPosition();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReferralRecomHbPositionRecord> getRecordType() {
        return ReferralRecomHbPositionRecord.class;
    }

    /**
     * The column <code>referraldb.referral_recom_hb_position.id</code>. 序列ID
     */
    public final TableField<ReferralRecomHbPositionRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "序列ID");

    /**
     * The column <code>referraldb.referral_recom_hb_position.recom_record_id</code>. 推荐记录ID
     */
    public final TableField<ReferralRecomHbPositionRecord, Integer> RECOM_RECORD_ID = createField("recom_record_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "推荐记录ID");

    /**
     * The column <code>referraldb.referral_recom_hb_position.hb_item_id</code>. 红包ID
     */
    public final TableField<ReferralRecomHbPositionRecord, Integer> HB_ITEM_ID = createField("hb_item_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "红包ID");

    /**
     * The column <code>referraldb.referral_recom_hb_position.create_time</code>. 创建时间
     */
    public final TableField<ReferralRecomHbPositionRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>referraldb.referral_recom_hb_position.update_time</code>. 更新时间
     */
    public final TableField<ReferralRecomHbPositionRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "更新时间");

    /**
     * Create a <code>referraldb.referral_recom_hb_position</code> table reference
     */
    public ReferralRecomHbPosition() {
        this("referral_recom_hb_position", null);
    }

    /**
     * Create an aliased <code>referraldb.referral_recom_hb_position</code> table reference
     */
    public ReferralRecomHbPosition(String alias) {
        this(alias, REFERRAL_RECOM_HB_POSITION);
    }

    private ReferralRecomHbPosition(String alias, Table<ReferralRecomHbPositionRecord> aliased) {
        this(alias, aliased, null);
    }

    private ReferralRecomHbPosition(String alias, Table<ReferralRecomHbPositionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "推荐类红包与被推荐人关系表");
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
    public Identity<ReferralRecomHbPositionRecord, Integer> getIdentity() {
        return Keys.IDENTITY_REFERRAL_RECOM_HB_POSITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ReferralRecomHbPositionRecord> getPrimaryKey() {
        return Keys.KEY_REFERRAL_RECOM_HB_POSITION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ReferralRecomHbPositionRecord>> getKeys() {
        return Arrays.<UniqueKey<ReferralRecomHbPositionRecord>>asList(Keys.KEY_REFERRAL_RECOM_HB_POSITION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferralRecomHbPosition as(String alias) {
        return new ReferralRecomHbPosition(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReferralRecomHbPosition rename(String name) {
        return new ReferralRecomHbPosition(name, null);
    }
}
