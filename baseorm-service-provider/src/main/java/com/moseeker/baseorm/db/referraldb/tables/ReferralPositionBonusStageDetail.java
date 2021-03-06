/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.referraldb.tables;


import com.moseeker.baseorm.db.referraldb.Keys;
import com.moseeker.baseorm.db.referraldb.Referraldb;
import com.moseeker.baseorm.db.referraldb.tables.records.ReferralPositionBonusStageDetailRecord;

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
public class ReferralPositionBonusStageDetail extends TableImpl<ReferralPositionBonusStageDetailRecord> {

    private static final long serialVersionUID = -1787951684;

    /**
     * The reference instance of <code>referraldb.referral_position_bonus_stage_detail</code>
     */
    public static final ReferralPositionBonusStageDetail REFERRAL_POSITION_BONUS_STAGE_DETAIL = new ReferralPositionBonusStageDetail();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReferralPositionBonusStageDetailRecord> getRecordType() {
        return ReferralPositionBonusStageDetailRecord.class;
    }

    /**
     * The column <code>referraldb.referral_position_bonus_stage_detail.id</code>. 序列ID
     */
    public final TableField<ReferralPositionBonusStageDetailRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "序列ID");

    /**
     * The column <code>referraldb.referral_position_bonus_stage_detail.referral_position_bonus_id</code>. 内推职位总奖金表ID
     */
    public final TableField<ReferralPositionBonusStageDetailRecord, Integer> REFERRAL_POSITION_BONUS_ID = createField("referral_position_bonus_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "内推职位总奖金表ID");

    /**
     * The column <code>referraldb.referral_position_bonus_stage_detail.position_id</code>. 职位ID
     */
    public final TableField<ReferralPositionBonusStageDetailRecord, Integer> POSITION_ID = createField("position_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "职位ID");

    /**
     * The column <code>referraldb.referral_position_bonus_stage_detail.stage_type</code>. 奖励节点
     */
    public final TableField<ReferralPositionBonusStageDetailRecord, Integer> STAGE_TYPE = createField("stage_type", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.INTEGER)), this, "奖励节点");

    /**
     * The column <code>referraldb.referral_position_bonus_stage_detail.stage_bonus</code>. 奖励金额
     */
    public final TableField<ReferralPositionBonusStageDetailRecord, Integer> STAGE_BONUS = createField("stage_bonus", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "奖励金额");

    /**
     * The column <code>referraldb.referral_position_bonus_stage_detail.stage_proportion</code>. 该节点金额占百分比
     */
    public final TableField<ReferralPositionBonusStageDetailRecord, Integer> STAGE_PROPORTION = createField("stage_proportion", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("100", org.jooq.impl.SQLDataType.INTEGER)), this, "该节点金额占百分比");

    /**
     * The column <code>referraldb.referral_position_bonus_stage_detail.create_time</code>. 创建时间
     */
    public final TableField<ReferralPositionBonusStageDetailRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>referraldb.referral_position_bonus_stage_detail.update_time</code>. 更新时间
     */
    public final TableField<ReferralPositionBonusStageDetailRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "更新时间");

    /**
     * Create a <code>referraldb.referral_position_bonus_stage_detail</code> table reference
     */
    public ReferralPositionBonusStageDetail() {
        this("referral_position_bonus_stage_detail", null);
    }

    /**
     * Create an aliased <code>referraldb.referral_position_bonus_stage_detail</code> table reference
     */
    public ReferralPositionBonusStageDetail(String alias) {
        this(alias, REFERRAL_POSITION_BONUS_STAGE_DETAIL);
    }

    private ReferralPositionBonusStageDetail(String alias, Table<ReferralPositionBonusStageDetailRecord> aliased) {
        this(alias, aliased, null);
    }

    private ReferralPositionBonusStageDetail(String alias, Table<ReferralPositionBonusStageDetailRecord> aliased, Field<?>[] parameters) {
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
    public Identity<ReferralPositionBonusStageDetailRecord, Integer> getIdentity() {
        return Keys.IDENTITY_REFERRAL_POSITION_BONUS_STAGE_DETAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ReferralPositionBonusStageDetailRecord> getPrimaryKey() {
        return Keys.KEY_REFERRAL_POSITION_BONUS_STAGE_DETAIL_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ReferralPositionBonusStageDetailRecord>> getKeys() {
        return Arrays.<UniqueKey<ReferralPositionBonusStageDetailRecord>>asList(Keys.KEY_REFERRAL_POSITION_BONUS_STAGE_DETAIL_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferralPositionBonusStageDetail as(String alias) {
        return new ReferralPositionBonusStageDetail(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReferralPositionBonusStageDetail rename(String name) {
        return new ReferralPositionBonusStageDetail(name, null);
    }
}
