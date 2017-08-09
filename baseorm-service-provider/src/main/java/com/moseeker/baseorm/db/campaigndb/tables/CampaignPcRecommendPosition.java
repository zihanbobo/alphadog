/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.campaigndb.tables;


import com.moseeker.baseorm.db.campaigndb.Campaigndb;
import com.moseeker.baseorm.db.campaigndb.Keys;
import com.moseeker.baseorm.db.campaigndb.tables.records.CampaignPcRecommendPositionRecord;

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
 * 首页推荐职位
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CampaignPcRecommendPosition extends TableImpl<CampaignPcRecommendPositionRecord> {

    private static final long serialVersionUID = 275121548;

    /**
     * The reference instance of <code>campaigndb.campaign_pc_recommend_position</code>
     */
    public static final CampaignPcRecommendPosition CAMPAIGN_PC_RECOMMEND_POSITION = new CampaignPcRecommendPosition();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CampaignPcRecommendPositionRecord> getRecordType() {
        return CampaignPcRecommendPositionRecord.class;
    }

    /**
     * The column <code>campaigndb.campaign_pc_recommend_position.id</code>.
     */
    public final TableField<CampaignPcRecommendPositionRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>campaigndb.campaign_pc_recommend_position.position_id</code>. job_position.id
     */
    public final TableField<CampaignPcRecommendPositionRecord, Integer> POSITION_ID = createField("position_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "job_position.id");

    /**
     * The column <code>campaigndb.campaign_pc_recommend_position.disable</code>. 是否可用，0：可用，1：不可用
     */
    public final TableField<CampaignPcRecommendPositionRecord, Byte> DISABLE = createField("disable", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否可用，0：可用，1：不可用");

    /**
     * The column <code>campaigndb.campaign_pc_recommend_position.create_time</code>.
     */
    public final TableField<CampaignPcRecommendPositionRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>campaigndb.campaign_pc_recommend_position.update_time</code>.
     */
    public final TableField<CampaignPcRecommendPositionRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>campaigndb.campaign_pc_recommend_position</code> table reference
     */
    public CampaignPcRecommendPosition() {
        this("campaign_pc_recommend_position", null);
    }

    /**
     * Create an aliased <code>campaigndb.campaign_pc_recommend_position</code> table reference
     */
    public CampaignPcRecommendPosition(String alias) {
        this(alias, CAMPAIGN_PC_RECOMMEND_POSITION);
    }

    private CampaignPcRecommendPosition(String alias, Table<CampaignPcRecommendPositionRecord> aliased) {
        this(alias, aliased, null);
    }

    private CampaignPcRecommendPosition(String alias, Table<CampaignPcRecommendPositionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "首页推荐职位");
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
    public Identity<CampaignPcRecommendPositionRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CAMPAIGN_PC_RECOMMEND_POSITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CampaignPcRecommendPositionRecord> getPrimaryKey() {
        return Keys.KEY_CAMPAIGN_PC_RECOMMEND_POSITION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CampaignPcRecommendPositionRecord>> getKeys() {
        return Arrays.<UniqueKey<CampaignPcRecommendPositionRecord>>asList(Keys.KEY_CAMPAIGN_PC_RECOMMEND_POSITION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CampaignPcRecommendPosition as(String alias) {
        return new CampaignPcRecommendPosition(alias, this);
    }

    /**
     * Rename this table
     */
    public CampaignPcRecommendPosition rename(String name) {
        return new CampaignPcRecommendPosition(name, null);
    }
}
