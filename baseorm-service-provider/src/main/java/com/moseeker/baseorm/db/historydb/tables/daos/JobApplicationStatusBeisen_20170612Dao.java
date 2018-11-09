/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.historydb.tables.daos;


import com.moseeker.baseorm.db.historydb.tables.JobApplicationStatusBeisen_20170612;
import com.moseeker.baseorm.db.historydb.tables.records.JobApplicationStatusBeisen_20170612Record;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 申请状态记录（ats北森）
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JobApplicationStatusBeisen_20170612Dao extends DAOImpl<JobApplicationStatusBeisen_20170612Record, com.moseeker.baseorm.db.historydb.tables.pojos.JobApplicationStatusBeisen_20170612, Integer> {

    /**
     * Create a new JobApplicationStatusBeisen_20170612Dao without any configuration
     */
    public JobApplicationStatusBeisen_20170612Dao() {
        super(JobApplicationStatusBeisen_20170612.JOB_APPLICATION_STATUS_BEISEN_20170612, com.moseeker.baseorm.db.historydb.tables.pojos.JobApplicationStatusBeisen_20170612.class);
    }

    /**
     * Create a new JobApplicationStatusBeisen_20170612Dao with an attached configuration
     */
    public JobApplicationStatusBeisen_20170612Dao(Configuration configuration) {
        super(JobApplicationStatusBeisen_20170612.JOB_APPLICATION_STATUS_BEISEN_20170612, com.moseeker.baseorm.db.historydb.tables.pojos.JobApplicationStatusBeisen_20170612.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.historydb.tables.pojos.JobApplicationStatusBeisen_20170612 object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobApplicationStatusBeisen_20170612> fetchById(Integer... values) {
        return fetch(JobApplicationStatusBeisen_20170612.JOB_APPLICATION_STATUS_BEISEN_20170612.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.historydb.tables.pojos.JobApplicationStatusBeisen_20170612 fetchOneById(Integer value) {
        return fetchOne(JobApplicationStatusBeisen_20170612.JOB_APPLICATION_STATUS_BEISEN_20170612.ID, value);
    }

    /**
     * Fetch records that have <code>company_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobApplicationStatusBeisen_20170612> fetchByCompanyId(Integer... values) {
        return fetch(JobApplicationStatusBeisen_20170612.JOB_APPLICATION_STATUS_BEISEN_20170612.COMPANY_ID, values);
    }

    /**
     * Fetch records that have <code>applier_mobile IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobApplicationStatusBeisen_20170612> fetchByApplierMobile(Long... values) {
        return fetch(JobApplicationStatusBeisen_20170612.JOB_APPLICATION_STATUS_BEISEN_20170612.APPLIER_MOBILE, values);
    }

    /**
     * Fetch records that have <code>applier_name IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobApplicationStatusBeisen_20170612> fetchByApplierName(String... values) {
        return fetch(JobApplicationStatusBeisen_20170612.JOB_APPLICATION_STATUS_BEISEN_20170612.APPLIER_NAME, values);
    }

    /**
     * Fetch records that have <code>jobnumber IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobApplicationStatusBeisen_20170612> fetchByJobnumber(String... values) {
        return fetch(JobApplicationStatusBeisen_20170612.JOB_APPLICATION_STATUS_BEISEN_20170612.JOBNUMBER, values);
    }

    /**
     * Fetch records that have <code>jobtitle IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobApplicationStatusBeisen_20170612> fetchByJobtitle(String... values) {
        return fetch(JobApplicationStatusBeisen_20170612.JOB_APPLICATION_STATUS_BEISEN_20170612.JOBTITLE, values);
    }

    /**
     * Fetch records that have <code>phasecode IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobApplicationStatusBeisen_20170612> fetchByPhasecode(Integer... values) {
        return fetch(JobApplicationStatusBeisen_20170612.JOB_APPLICATION_STATUS_BEISEN_20170612.PHASECODE, values);
    }

    /**
     * Fetch records that have <code>phasename IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobApplicationStatusBeisen_20170612> fetchByPhasename(String... values) {
        return fetch(JobApplicationStatusBeisen_20170612.JOB_APPLICATION_STATUS_BEISEN_20170612.PHASENAME, values);
    }

    /**
     * Fetch records that have <code>statuscode IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobApplicationStatusBeisen_20170612> fetchByStatuscode(Integer... values) {
        return fetch(JobApplicationStatusBeisen_20170612.JOB_APPLICATION_STATUS_BEISEN_20170612.STATUSCODE, values);
    }

    /**
     * Fetch records that have <code>statusname IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobApplicationStatusBeisen_20170612> fetchByStatusname(String... values) {
        return fetch(JobApplicationStatusBeisen_20170612.JOB_APPLICATION_STATUS_BEISEN_20170612.STATUSNAME, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobApplicationStatusBeisen_20170612> fetchByCreateTime(Timestamp... values) {
        return fetch(JobApplicationStatusBeisen_20170612.JOB_APPLICATION_STATUS_BEISEN_20170612.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobApplicationStatusBeisen_20170612> fetchByUpdateTime(Timestamp... values) {
        return fetch(JobApplicationStatusBeisen_20170612.JOB_APPLICATION_STATUS_BEISEN_20170612.UPDATE_TIME, values);
    }
}