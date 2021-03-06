/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.referraldb.tables.daos;


import com.moseeker.baseorm.db.referraldb.tables.ReferralRecomHbPosition;
import com.moseeker.baseorm.db.referraldb.tables.records.ReferralRecomHbPositionRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 推荐类红包与被推荐职位关系表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ReferralRecomHbPositionDao extends DAOImpl<ReferralRecomHbPositionRecord, com.moseeker.baseorm.db.referraldb.tables.pojos.ReferralRecomHbPosition, Integer> {

    /**
     * Create a new ReferralRecomHbPositionDao without any configuration
     */
    public ReferralRecomHbPositionDao() {
        super(ReferralRecomHbPosition.REFERRAL_RECOM_HB_POSITION, com.moseeker.baseorm.db.referraldb.tables.pojos.ReferralRecomHbPosition.class);
    }

    /**
     * Create a new ReferralRecomHbPositionDao with an attached configuration
     */
    public ReferralRecomHbPositionDao(Configuration configuration) {
        super(ReferralRecomHbPosition.REFERRAL_RECOM_HB_POSITION, com.moseeker.baseorm.db.referraldb.tables.pojos.ReferralRecomHbPosition.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.referraldb.tables.pojos.ReferralRecomHbPosition object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.referraldb.tables.pojos.ReferralRecomHbPosition> fetchById(Integer... values) {
        return fetch(ReferralRecomHbPosition.REFERRAL_RECOM_HB_POSITION.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.referraldb.tables.pojos.ReferralRecomHbPosition fetchOneById(Integer value) {
        return fetchOne(ReferralRecomHbPosition.REFERRAL_RECOM_HB_POSITION.ID, value);
    }

    /**
     * Fetch records that have <code>recom_record_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.referraldb.tables.pojos.ReferralRecomHbPosition> fetchByRecomRecordId(Integer... values) {
        return fetch(ReferralRecomHbPosition.REFERRAL_RECOM_HB_POSITION.RECOM_RECORD_ID, values);
    }

    /**
     * Fetch records that have <code>hb_item_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.referraldb.tables.pojos.ReferralRecomHbPosition> fetchByHbItemId(Integer... values) {
        return fetch(ReferralRecomHbPosition.REFERRAL_RECOM_HB_POSITION.HB_ITEM_ID, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.referraldb.tables.pojos.ReferralRecomHbPosition> fetchByCreateTime(Timestamp... values) {
        return fetch(ReferralRecomHbPosition.REFERRAL_RECOM_HB_POSITION.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.referraldb.tables.pojos.ReferralRecomHbPosition> fetchByUpdateTime(Timestamp... values) {
        return fetch(ReferralRecomHbPosition.REFERRAL_RECOM_HB_POSITION.UPDATE_TIME, values);
    }
}
