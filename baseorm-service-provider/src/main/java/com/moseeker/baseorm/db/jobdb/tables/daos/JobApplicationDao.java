/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.jobdb.tables.daos;


import com.moseeker.baseorm.db.jobdb.tables.JobApplication;
import com.moseeker.baseorm.db.jobdb.tables.records.JobApplicationRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


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
public class JobApplicationDao extends DAOImpl<JobApplicationRecord, com.moseeker.baseorm.db.jobdb.tables.pojos.JobApplication, Integer> {

    /**
     * Create a new JobApplicationDao without any configuration
     */
    public JobApplicationDao() {
        super(JobApplication.JOB_APPLICATION, com.moseeker.baseorm.db.jobdb.tables.pojos.JobApplication.class);
    }

    /**
     * Create a new JobApplicationDao with an attached configuration
     */
    public JobApplicationDao(Configuration configuration) {
        super(JobApplication.JOB_APPLICATION, com.moseeker.baseorm.db.jobdb.tables.pojos.JobApplication.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.jobdb.tables.pojos.JobApplication object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobApplication> fetchById(Integer... values) {
        return fetch(JobApplication.JOB_APPLICATION.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.jobdb.tables.pojos.JobApplication fetchOneById(Integer value) {
        return fetchOne(JobApplication.JOB_APPLICATION.ID, value);
    }

    /**
     * Fetch records that have <code>wechat_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobApplication> fetchByWechatId(Integer... values) {
        return fetch(JobApplication.JOB_APPLICATION.WECHAT_ID, values);
    }

    /**
     * Fetch records that have <code>position_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobApplication> fetchByPositionId(Integer... values) {
        return fetch(JobApplication.JOB_APPLICATION.POSITION_ID, values);
    }

    /**
     * Fetch records that have <code>recommender_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobApplication> fetchByRecommenderId(Integer... values) {
        return fetch(JobApplication.JOB_APPLICATION.RECOMMENDER_ID, values);
    }

    /**
     * Fetch records that have <code>submit_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobApplication> fetchBySubmitTime(Timestamp... values) {
        return fetch(JobApplication.JOB_APPLICATION.SUBMIT_TIME, values);
    }

    /**
     * Fetch records that have <code>status_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobApplication> fetchByStatusId(Integer... values) {
        return fetch(JobApplication.JOB_APPLICATION.STATUS_ID, values);
    }

    /**
     * Fetch records that have <code>l_application_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobApplication> fetchByLApplicationId(Integer... values) {
        return fetch(JobApplication.JOB_APPLICATION.L_APPLICATION_ID, values);
    }

    /**
     * Fetch records that have <code>reward IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobApplication> fetchByReward(Integer... values) {
        return fetch(JobApplication.JOB_APPLICATION.REWARD, values);
    }

    /**
     * Fetch records that have <code>source_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobApplication> fetchBySourceId(Integer... values) {
        return fetch(JobApplication.JOB_APPLICATION.SOURCE_ID, values);
    }

    /**
     * Fetch records that have <code>_create_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobApplication> fetchBy_CreateTime(Timestamp... values) {
        return fetch(JobApplication.JOB_APPLICATION._CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>applier_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobApplication> fetchByApplierId(Integer... values) {
        return fetch(JobApplication.JOB_APPLICATION.APPLIER_ID, values);
    }

    /**
     * Fetch records that have <code>interview_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobApplication> fetchByInterviewId(Integer... values) {
        return fetch(JobApplication.JOB_APPLICATION.INTERVIEW_ID, values);
    }

    /**
     * Fetch records that have <code>resume_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobApplication> fetchByResumeId(String... values) {
        return fetch(JobApplication.JOB_APPLICATION.RESUME_ID, values);
    }

    /**
     * Fetch records that have <code>ats_status IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobApplication> fetchByAtsStatus(Integer... values) {
        return fetch(JobApplication.JOB_APPLICATION.ATS_STATUS, values);
    }

    /**
     * Fetch records that have <code>applier_name IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobApplication> fetchByApplierName(String... values) {
        return fetch(JobApplication.JOB_APPLICATION.APPLIER_NAME, values);
    }

    /**
     * Fetch records that have <code>disable IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobApplication> fetchByDisable(Integer... values) {
        return fetch(JobApplication.JOB_APPLICATION.DISABLE, values);
    }

    /**
     * Fetch records that have <code>routine IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobApplication> fetchByRoutine(Integer... values) {
        return fetch(JobApplication.JOB_APPLICATION.ROUTINE, values);
    }

    /**
     * Fetch records that have <code>is_viewed IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobApplication> fetchByIsViewed(Byte... values) {
        return fetch(JobApplication.JOB_APPLICATION.IS_VIEWED, values);
    }

    /**
     * Fetch records that have <code>not_suitable IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobApplication> fetchByNotSuitable(Byte... values) {
        return fetch(JobApplication.JOB_APPLICATION.NOT_SUITABLE, values);
    }

    /**
     * Fetch records that have <code>company_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobApplication> fetchByCompanyId(Integer... values) {
        return fetch(JobApplication.JOB_APPLICATION.COMPANY_ID, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobApplication> fetchByUpdateTime(Timestamp... values) {
        return fetch(JobApplication.JOB_APPLICATION.UPDATE_TIME, values);
    }

    /**
     * Fetch records that have <code>app_tpl_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobApplication> fetchByAppTplId(Integer... values) {
        return fetch(JobApplication.JOB_APPLICATION.APP_TPL_ID, values);
    }

    /**
     * Fetch records that have <code>proxy IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobApplication> fetchByProxy(Byte... values) {
        return fetch(JobApplication.JOB_APPLICATION.PROXY, values);
    }

    /**
     * Fetch records that have <code>apply_type IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobApplication> fetchByApplyType(Integer... values) {
        return fetch(JobApplication.JOB_APPLICATION.APPLY_TYPE, values);
    }

    /**
     * Fetch records that have <code>email_status IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobApplication> fetchByEmailStatus(Integer... values) {
        return fetch(JobApplication.JOB_APPLICATION.EMAIL_STATUS, values);
    }

    /**
     * Fetch records that have <code>view_count IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobApplication> fetchByViewCount(Integer... values) {
        return fetch(JobApplication.JOB_APPLICATION.VIEW_COUNT, values);
    }

    /**
     * Fetch records that have <code>recommender_user_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobApplication> fetchByRecommenderUserId(Integer... values) {
        return fetch(JobApplication.JOB_APPLICATION.RECOMMENDER_USER_ID, values);
    }

    /**
     * Fetch records that have <code>origin IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobApplication> fetchByOrigin(Integer... values) {
        return fetch(JobApplication.JOB_APPLICATION.ORIGIN, values);
    }
}
