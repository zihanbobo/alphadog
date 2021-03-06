/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.campaigndb.tables;


import com.moseeker.baseorm.db.campaigndb.Campaigndb;
import com.moseeker.baseorm.db.campaigndb.Keys;
import com.moseeker.baseorm.db.campaigndb.tables.records.CampaignRecommendCompanyRecord;

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
 * 推荐公司
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CampaignRecommendCompany extends TableImpl<CampaignRecommendCompanyRecord> {

    private static final long serialVersionUID = 972193876;

    /**
     * The reference instance of <code>campaigndb.campaign_recommend_company</code>
     */
    public static final CampaignRecommendCompany CAMPAIGN_RECOMMEND_COMPANY = new CampaignRecommendCompany();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CampaignRecommendCompanyRecord> getRecordType() {
        return CampaignRecommendCompanyRecord.class;
    }

    /**
     * The column <code>campaigndb.campaign_recommend_company.id</code>.
     */
    public final TableField<CampaignRecommendCompanyRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>campaigndb.campaign_recommend_company.company_id</code>. hr_company.id 公司id
     */
    public final TableField<CampaignRecommendCompanyRecord, Integer> COMPANY_ID = createField("company_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "hr_company.id 公司id");

    /**
     * The column <code>campaigndb.campaign_recommend_company.weight</code>. 权重值
     */
    public final TableField<CampaignRecommendCompanyRecord, Integer> WEIGHT = createField("weight", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "权重值");

    /**
     * The column <code>campaigndb.campaign_recommend_company.disable</code>. 是否禁用(0: 启用，1: 禁用)
     */
    public final TableField<CampaignRecommendCompanyRecord, Byte> DISABLE = createField("disable", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否禁用(0: 启用，1: 禁用)");

    /**
     * The column <code>campaigndb.campaign_recommend_company.create_time</code>. 创建时间
     */
    public final TableField<CampaignRecommendCompanyRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>campaigndb.campaign_recommend_company.update_time</code>. 修改时间
     */
    public final TableField<CampaignRecommendCompanyRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "修改时间");

    /**
     * Create a <code>campaigndb.campaign_recommend_company</code> table reference
     */
    public CampaignRecommendCompany() {
        this("campaign_recommend_company", null);
    }

    /**
     * Create an aliased <code>campaigndb.campaign_recommend_company</code> table reference
     */
    public CampaignRecommendCompany(String alias) {
        this(alias, CAMPAIGN_RECOMMEND_COMPANY);
    }

    private CampaignRecommendCompany(String alias, Table<CampaignRecommendCompanyRecord> aliased) {
        this(alias, aliased, null);
    }

    private CampaignRecommendCompany(String alias, Table<CampaignRecommendCompanyRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "推荐公司");
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
    public Identity<CampaignRecommendCompanyRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CAMPAIGN_RECOMMEND_COMPANY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CampaignRecommendCompanyRecord> getPrimaryKey() {
        return Keys.KEY_CAMPAIGN_RECOMMEND_COMPANY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CampaignRecommendCompanyRecord>> getKeys() {
        return Arrays.<UniqueKey<CampaignRecommendCompanyRecord>>asList(Keys.KEY_CAMPAIGN_RECOMMEND_COMPANY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CampaignRecommendCompany as(String alias) {
        return new CampaignRecommendCompany(alias, this);
    }

    /**
     * Rename this table
     */

    public CampaignRecommendCompany rename(String name) {
        return new CampaignRecommendCompany(name, null);
    }
}
