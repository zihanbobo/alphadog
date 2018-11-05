/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.referraldb.tables.daos;


import com.moseeker.baseorm.db.referraldb.tables.ReferralApplicationStatusCount;
import com.moseeker.baseorm.db.referraldb.tables.records.ReferralApplicationStatusCountRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 红包活动职位申请状态统计
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ReferralApplicationStatusCountDao extends DAOImpl<ReferralApplicationStatusCountRecord, com.moseeker.baseorm.db.referraldb.tables.pojos.ReferralApplicationStatusCount, Integer> {

    /**
     * Create a new ReferralApplicationStatusCountDao without any configuration
     */
    public ReferralApplicationStatusCountDao() {
        super(ReferralApplicationStatusCount.REFERRAL_APPLICATION_STATUS_COUNT, com.moseeker.baseorm.db.referraldb.tables.pojos.ReferralApplicationStatusCount.class);
    }

    /**
     * Create a new ReferralApplicationStatusCountDao with an attached configuration
     */
    public ReferralApplicationStatusCountDao(Configuration configuration) {
        super(ReferralApplicationStatusCount.REFERRAL_APPLICATION_STATUS_COUNT, com.moseeker.baseorm.db.referraldb.tables.pojos.ReferralApplicationStatusCount.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.referraldb.tables.pojos.ReferralApplicationStatusCount object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.referraldb.tables.pojos.ReferralApplicationStatusCount> fetchById(Integer... values) {
        return fetch(ReferralApplicationStatusCount.REFERRAL_APPLICATION_STATUS_COUNT.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.referraldb.tables.pojos.ReferralApplicationStatusCount fetchOneById(Integer value) {
        return fetchOne(ReferralApplicationStatusCount.REFERRAL_APPLICATION_STATUS_COUNT.ID, value);
    }

    /**
     * Fetch records that have <code>application_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.referraldb.tables.pojos.ReferralApplicationStatusCount> fetchByApplicationId(Integer... values) {
        return fetch(ReferralApplicationStatusCount.REFERRAL_APPLICATION_STATUS_COUNT.APPLICATION_ID, values);
    }

    /**
     * Fetch records that have <code>appication_tpl_status IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.referraldb.tables.pojos.ReferralApplicationStatusCount> fetchByAppicationTplStatus(Integer... values) {
        return fetch(ReferralApplicationStatusCount.REFERRAL_APPLICATION_STATUS_COUNT.APPICATION_TPL_STATUS, values);
    }

    /**
     * Fetch records that have <code>count IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.referraldb.tables.pojos.ReferralApplicationStatusCount> fetchByCount(Integer... values) {
        return fetch(ReferralApplicationStatusCount.REFERRAL_APPLICATION_STATUS_COUNT.COUNT, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.referraldb.tables.pojos.ReferralApplicationStatusCount> fetchByCreateTime(Timestamp... values) {
        return fetch(ReferralApplicationStatusCount.REFERRAL_APPLICATION_STATUS_COUNT.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.referraldb.tables.pojos.ReferralApplicationStatusCount> fetchByUpdateTime(Timestamp... values) {
        return fetch(ReferralApplicationStatusCount.REFERRAL_APPLICATION_STATUS_COUNT.UPDATE_TIME, values);
    }
}
