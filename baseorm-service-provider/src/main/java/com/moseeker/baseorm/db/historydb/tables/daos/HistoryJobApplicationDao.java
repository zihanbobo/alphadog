/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.historydb.tables.daos;


import com.moseeker.baseorm.db.historydb.tables.HistoryJobApplication;
import com.moseeker.baseorm.db.historydb.tables.records.HistoryJobApplicationRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 申请记录归档表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HistoryJobApplicationDao extends DAOImpl<HistoryJobApplicationRecord, com.moseeker.baseorm.db.historydb.tables.pojos.HistoryJobApplication, Integer> {

    /**
     * Create a new HistoryJobApplicationDao without any configuration
     */
    public HistoryJobApplicationDao() {
        super(HistoryJobApplication.HISTORY_JOB_APPLICATION, com.moseeker.baseorm.db.historydb.tables.pojos.HistoryJobApplication.class);
    }

    /**
     * Create a new HistoryJobApplicationDao with an attached configuration
     */
    public HistoryJobApplicationDao(Configuration configuration) {
        super(HistoryJobApplication.HISTORY_JOB_APPLICATION, com.moseeker.baseorm.db.historydb.tables.pojos.HistoryJobApplication.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.historydb.tables.pojos.HistoryJobApplication object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HistoryJobApplication> fetchById(Integer... values) {
        return fetch(HistoryJobApplication.HISTORY_JOB_APPLICATION.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.historydb.tables.pojos.HistoryJobApplication fetchOneById(Integer value) {
        return fetchOne(HistoryJobApplication.HISTORY_JOB_APPLICATION.ID, value);
    }

    /**
     * Fetch records that have <code>position_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HistoryJobApplication> fetchByPositionId(Integer... values) {
        return fetch(HistoryJobApplication.HISTORY_JOB_APPLICATION.POSITION_ID, values);
    }

    /**
     * Fetch records that have <code>recommender_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HistoryJobApplication> fetchByRecommenderId(Integer... values) {
        return fetch(HistoryJobApplication.HISTORY_JOB_APPLICATION.RECOMMENDER_ID, values);
    }

    /**
     * Fetch records that have <code>l_application_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HistoryJobApplication> fetchByLApplicationId(Integer... values) {
        return fetch(HistoryJobApplication.HISTORY_JOB_APPLICATION.L_APPLICATION_ID, values);
    }

    /**
     * Fetch records that have <code>user_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HistoryJobApplication> fetchByUserId(Integer... values) {
        return fetch(HistoryJobApplication.HISTORY_JOB_APPLICATION.USER_ID, values);
    }

    /**
     * Fetch records that have <code>ats_status IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HistoryJobApplication> fetchByAtsStatus(Integer... values) {
        return fetch(HistoryJobApplication.HISTORY_JOB_APPLICATION.ATS_STATUS, values);
    }

    /**
     * Fetch records that have <code>disable IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HistoryJobApplication> fetchByDisable(Integer... values) {
        return fetch(HistoryJobApplication.HISTORY_JOB_APPLICATION.DISABLE, values);
    }

    /**
     * Fetch records that have <code>routine IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HistoryJobApplication> fetchByRoutine(Integer... values) {
        return fetch(HistoryJobApplication.HISTORY_JOB_APPLICATION.ROUTINE, values);
    }

    /**
     * Fetch records that have <code>is_viewed IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HistoryJobApplication> fetchByIsViewed(Byte... values) {
        return fetch(HistoryJobApplication.HISTORY_JOB_APPLICATION.IS_VIEWED, values);
    }

    /**
     * Fetch records that have <code>view_count IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HistoryJobApplication> fetchByViewCount(Integer... values) {
        return fetch(HistoryJobApplication.HISTORY_JOB_APPLICATION.VIEW_COUNT, values);
    }

    /**
     * Fetch records that have <code>not_suitable IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HistoryJobApplication> fetchByNotSuitable(Byte... values) {
        return fetch(HistoryJobApplication.HISTORY_JOB_APPLICATION.NOT_SUITABLE, values);
    }

    /**
     * Fetch records that have <code>company_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HistoryJobApplication> fetchByCompanyId(Integer... values) {
        return fetch(HistoryJobApplication.HISTORY_JOB_APPLICATION.COMPANY_ID, values);
    }

    /**
     * Fetch records that have <code>app_tpl_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HistoryJobApplication> fetchByAppTplId(Integer... values) {
        return fetch(HistoryJobApplication.HISTORY_JOB_APPLICATION.APP_TPL_ID, values);
    }

    /**
     * Fetch records that have <code>proxy IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HistoryJobApplication> fetchByProxy(Byte... values) {
        return fetch(HistoryJobApplication.HISTORY_JOB_APPLICATION.PROXY, values);
    }

    /**
     * Fetch records that have <code>apply_type IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HistoryJobApplication> fetchByApplyType(Integer... values) {
        return fetch(HistoryJobApplication.HISTORY_JOB_APPLICATION.APPLY_TYPE, values);
    }

    /**
     * Fetch records that have <code>email_status IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HistoryJobApplication> fetchByEmailStatus(Integer... values) {
        return fetch(HistoryJobApplication.HISTORY_JOB_APPLICATION.EMAIL_STATUS, values);
    }

    /**
     * Fetch records that have <code>submit_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HistoryJobApplication> fetchBySubmitTime(Timestamp... values) {
        return fetch(HistoryJobApplication.HISTORY_JOB_APPLICATION.SUBMIT_TIME, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HistoryJobApplication> fetchByCreateTime(Timestamp... values) {
        return fetch(HistoryJobApplication.HISTORY_JOB_APPLICATION.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HistoryJobApplication> fetchByUpdateTime(Timestamp... values) {
        return fetch(HistoryJobApplication.HISTORY_JOB_APPLICATION.UPDATE_TIME, values);
    }
}
