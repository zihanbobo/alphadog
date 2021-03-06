/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.campaigndb.tables.daos;


import com.moseeker.baseorm.db.campaigndb.tables.CampaignRecommendPosition;
import com.moseeker.baseorm.db.campaigndb.tables.records.CampaignRecommendPositionRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 推荐职位
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CampaignRecommendPositionDao extends DAOImpl<CampaignRecommendPositionRecord, com.moseeker.baseorm.db.campaigndb.tables.pojos.CampaignRecommendPosition, Integer> {

    /**
     * Create a new CampaignRecommendPositionDao without any configuration
     */
    public CampaignRecommendPositionDao() {
        super(CampaignRecommendPosition.CAMPAIGN_RECOMMEND_POSITION, com.moseeker.baseorm.db.campaigndb.tables.pojos.CampaignRecommendPosition.class);
    }

    /**
     * Create a new CampaignRecommendPositionDao with an attached configuration
     */
    public CampaignRecommendPositionDao(Configuration configuration) {
        super(CampaignRecommendPosition.CAMPAIGN_RECOMMEND_POSITION, com.moseeker.baseorm.db.campaigndb.tables.pojos.CampaignRecommendPosition.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.campaigndb.tables.pojos.CampaignRecommendPosition object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.campaigndb.tables.pojos.CampaignRecommendPosition> fetchById(Integer... values) {
        return fetch(CampaignRecommendPosition.CAMPAIGN_RECOMMEND_POSITION.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.campaigndb.tables.pojos.CampaignRecommendPosition fetchOneById(Integer value) {
        return fetchOne(CampaignRecommendPosition.CAMPAIGN_RECOMMEND_POSITION.ID, value);
    }

    /**
     * Fetch records that have <code>position_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.campaigndb.tables.pojos.CampaignRecommendPosition> fetchByPositionId(Integer... values) {
        return fetch(CampaignRecommendPosition.CAMPAIGN_RECOMMEND_POSITION.POSITION_ID, values);
    }

    /**
     * Fetch records that have <code>weight IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.campaigndb.tables.pojos.CampaignRecommendPosition> fetchByWeight(Integer... values) {
        return fetch(CampaignRecommendPosition.CAMPAIGN_RECOMMEND_POSITION.WEIGHT, values);
    }

    /**
     * Fetch records that have <code>disable IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.campaigndb.tables.pojos.CampaignRecommendPosition> fetchByDisable(Byte... values) {
        return fetch(CampaignRecommendPosition.CAMPAIGN_RECOMMEND_POSITION.DISABLE, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.campaigndb.tables.pojos.CampaignRecommendPosition> fetchByCreateTime(Timestamp... values) {
        return fetch(CampaignRecommendPosition.CAMPAIGN_RECOMMEND_POSITION.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.campaigndb.tables.pojos.CampaignRecommendPosition> fetchByUpdateTime(Timestamp... values) {
        return fetch(CampaignRecommendPosition.CAMPAIGN_RECOMMEND_POSITION.UPDATE_TIME, values);
    }
}
