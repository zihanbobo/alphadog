/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.campaigndb.tables;


import com.moseeker.baseorm.db.campaigndb.Campaigndb;
import com.moseeker.baseorm.db.campaigndb.Keys;
import com.moseeker.baseorm.db.campaigndb.tables.records.CampaignPersonaRecomRecord;

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
 * 推送职位表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CampaignPersonaRecom extends TableImpl<CampaignPersonaRecomRecord> {

    private static final long serialVersionUID = -1507449928;

    /**
     * The reference instance of <code>campaigndb.campaign_persona_recom</code>
     */
    public static final CampaignPersonaRecom CAMPAIGN_PERSONA_RECOM = new CampaignPersonaRecom();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CampaignPersonaRecomRecord> getRecordType() {
        return CampaignPersonaRecomRecord.class;
    }

    /**
     * The column <code>campaigndb.campaign_persona_recom.id</code>.
     */
    public final TableField<CampaignPersonaRecomRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>campaigndb.campaign_persona_recom.user_id</code>. 用户id user_user.id
     */
    public final TableField<CampaignPersonaRecomRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "用户id user_user.id");

    /**
     * The column <code>campaigndb.campaign_persona_recom.company_id</code>. 企业的id
     */
    public final TableField<CampaignPersonaRecomRecord, Integer> COMPANY_ID = createField("company_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "企业的id");

    /**
     * The column <code>campaigndb.campaign_persona_recom.position_id</code>. 职位id job_position.id
     */
    public final TableField<CampaignPersonaRecomRecord, Integer> POSITION_ID = createField("position_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "职位id job_position.id");

    /**
     * The column <code>campaigndb.campaign_persona_recom.create_time</code>. 创建时间
     */
    public final TableField<CampaignPersonaRecomRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>campaigndb.campaign_persona_recom.send_time</code>. 推送时间
     */
    public final TableField<CampaignPersonaRecomRecord, Timestamp> SEND_TIME = createField("send_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "推送时间");

    /**
     * The column <code>campaigndb.campaign_persona_recom.is_send</code>. 是否发送，0是未发送，1是已发送
     */
    public final TableField<CampaignPersonaRecomRecord, Byte> IS_SEND = createField("is_send", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否发送，0是未发送，1是已发送");

    /**
     * The column <code>campaigndb.campaign_persona_recom.update_time</code>. 更新时间

     */
    public final TableField<CampaignPersonaRecomRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "更新时间\n");

    /**
     * The column <code>campaigndb.campaign_persona_recom.type</code>.
     */
    public final TableField<CampaignPersonaRecomRecord, Byte> TYPE = createField("type", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * Create a <code>campaigndb.campaign_persona_recom</code> table reference
     */
    public CampaignPersonaRecom() {
        this("campaign_persona_recom", null);
    }

    /**
     * Create an aliased <code>campaigndb.campaign_persona_recom</code> table reference
     */
    public CampaignPersonaRecom(String alias) {
        this(alias, CAMPAIGN_PERSONA_RECOM);
    }

    private CampaignPersonaRecom(String alias, Table<CampaignPersonaRecomRecord> aliased) {
        this(alias, aliased, null);
    }

    private CampaignPersonaRecom(String alias, Table<CampaignPersonaRecomRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "推送职位表");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Campaigndb.CAMPAIGNDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CampaignPersonaRecomRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CAMPAIGN_PERSONA_RECOM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CampaignPersonaRecomRecord> getPrimaryKey() {
        return Keys.KEY_CAMPAIGN_PERSONA_RECOM_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CampaignPersonaRecomRecord>> getKeys() {
        return Arrays.<UniqueKey<CampaignPersonaRecomRecord>>asList(Keys.KEY_CAMPAIGN_PERSONA_RECOM_PRIMARY, Keys.KEY_CAMPAIGN_PERSONA_RECOM_CAMPAIGN_PERSONA_RECOM_UINDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CampaignPersonaRecom as(String alias) {
        return new CampaignPersonaRecom(alias, this);
    }

    /**
     * Rename this table
     */

    public CampaignPersonaRecom rename(String name) {
        return new CampaignPersonaRecom(name, null);
    }
}
