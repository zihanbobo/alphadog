/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.referraldb.tables.daos;


import com.moseeker.baseorm.db.referraldb.tables.ReferralConnectionChain;
import com.moseeker.baseorm.db.referraldb.tables.records.ReferralConnectionChainRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 人脉连连看链路表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ReferralConnectionChainDao extends DAOImpl<ReferralConnectionChainRecord, com.moseeker.baseorm.db.referraldb.tables.pojos.ReferralConnectionChain, Integer> {

    /**
     * Create a new ReferralConnectionChainDao without any configuration
     */
    public ReferralConnectionChainDao() {
        super(ReferralConnectionChain.REFERRAL_CONNECTION_CHAIN, com.moseeker.baseorm.db.referraldb.tables.pojos.ReferralConnectionChain.class);
    }

    /**
     * Create a new ReferralConnectionChainDao with an attached configuration
     */
    public ReferralConnectionChainDao(Configuration configuration) {
        super(ReferralConnectionChain.REFERRAL_CONNECTION_CHAIN, com.moseeker.baseorm.db.referraldb.tables.pojos.ReferralConnectionChain.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.referraldb.tables.pojos.ReferralConnectionChain object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.referraldb.tables.pojos.ReferralConnectionChain> fetchById(Integer... values) {
        return fetch(ReferralConnectionChain.REFERRAL_CONNECTION_CHAIN.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.referraldb.tables.pojos.ReferralConnectionChain fetchOneById(Integer value) {
        return fetchOne(ReferralConnectionChain.REFERRAL_CONNECTION_CHAIN.ID, value);
    }

    /**
     * Fetch records that have <code>recom_user_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.referraldb.tables.pojos.ReferralConnectionChain> fetchByRecomUserId(Integer... values) {
        return fetch(ReferralConnectionChain.REFERRAL_CONNECTION_CHAIN.RECOM_USER_ID, values);
    }

    /**
     * Fetch records that have <code>next_user_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.referraldb.tables.pojos.ReferralConnectionChain> fetchByNextUserId(Integer... values) {
        return fetch(ReferralConnectionChain.REFERRAL_CONNECTION_CHAIN.NEXT_USER_ID, values);
    }

    /**
     * Fetch records that have <code>parent_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.referraldb.tables.pojos.ReferralConnectionChain> fetchByParentId(Integer... values) {
        return fetch(ReferralConnectionChain.REFERRAL_CONNECTION_CHAIN.PARENT_ID, values);
    }

    /**
     * Fetch records that have <code>root_parent_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.referraldb.tables.pojos.ReferralConnectionChain> fetchByRootParentId(Integer... values) {
        return fetch(ReferralConnectionChain.REFERRAL_CONNECTION_CHAIN.ROOT_PARENT_ID, values);
    }

    /**
     * Fetch records that have <code>state IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.referraldb.tables.pojos.ReferralConnectionChain> fetchByState(Byte... values) {
        return fetch(ReferralConnectionChain.REFERRAL_CONNECTION_CHAIN.STATE, values);
    }

    /**
     * Fetch records that have <code>click_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.referraldb.tables.pojos.ReferralConnectionChain> fetchByClickTime(Timestamp... values) {
        return fetch(ReferralConnectionChain.REFERRAL_CONNECTION_CHAIN.CLICK_TIME, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.referraldb.tables.pojos.ReferralConnectionChain> fetchByCreateTime(Timestamp... values) {
        return fetch(ReferralConnectionChain.REFERRAL_CONNECTION_CHAIN.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.referraldb.tables.pojos.ReferralConnectionChain> fetchByUpdateTime(Timestamp... values) {
        return fetch(ReferralConnectionChain.REFERRAL_CONNECTION_CHAIN.UPDATE_TIME, values);
    }
}
