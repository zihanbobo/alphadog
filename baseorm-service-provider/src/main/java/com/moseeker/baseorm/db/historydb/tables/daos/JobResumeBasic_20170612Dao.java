/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.historydb.tables.daos;


import com.moseeker.baseorm.db.historydb.tables.JobResumeBasic_20170612;
import com.moseeker.baseorm.db.historydb.tables.records.JobResumeBasic_20170612Record;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 申请简历简述表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JobResumeBasic_20170612Dao extends DAOImpl<JobResumeBasic_20170612Record, com.moseeker.baseorm.db.historydb.tables.pojos.JobResumeBasic_20170612, Integer> {

    /**
     * Create a new JobResumeBasic_20170612Dao without any configuration
     */
    public JobResumeBasic_20170612Dao() {
        super(JobResumeBasic_20170612.JOB_RESUME_BASIC_20170612, com.moseeker.baseorm.db.historydb.tables.pojos.JobResumeBasic_20170612.class);
    }

    /**
     * Create a new JobResumeBasic_20170612Dao with an attached configuration
     */
    public JobResumeBasic_20170612Dao(Configuration configuration) {
        super(JobResumeBasic_20170612.JOB_RESUME_BASIC_20170612, com.moseeker.baseorm.db.historydb.tables.pojos.JobResumeBasic_20170612.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.historydb.tables.pojos.JobResumeBasic_20170612 object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobResumeBasic_20170612> fetchById(Integer... values) {
        return fetch(JobResumeBasic_20170612.JOB_RESUME_BASIC_20170612.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.historydb.tables.pojos.JobResumeBasic_20170612 fetchOneById(Integer value) {
        return fetchOne(JobResumeBasic_20170612.JOB_RESUME_BASIC_20170612.ID, value);
    }

    /**
     * Fetch records that have <code>app_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobResumeBasic_20170612> fetchByAppId(Integer... values) {
        return fetch(JobResumeBasic_20170612.JOB_RESUME_BASIC_20170612.APP_ID, values);
    }

    /**
     * Fetch records that have <code>position_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobResumeBasic_20170612> fetchByPositionId(Integer... values) {
        return fetch(JobResumeBasic_20170612.JOB_RESUME_BASIC_20170612.POSITION_ID, values);
    }

    /**
     * Fetch records that have <code>firstname IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobResumeBasic_20170612> fetchByFirstname(String... values) {
        return fetch(JobResumeBasic_20170612.JOB_RESUME_BASIC_20170612.FIRSTNAME, values);
    }

    /**
     * Fetch records that have <code>lastname IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobResumeBasic_20170612> fetchByLastname(String... values) {
        return fetch(JobResumeBasic_20170612.JOB_RESUME_BASIC_20170612.LASTNAME, values);
    }

    /**
     * Fetch records that have <code>address IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobResumeBasic_20170612> fetchByAddress(String... values) {
        return fetch(JobResumeBasic_20170612.JOB_RESUME_BASIC_20170612.ADDRESS, values);
    }

    /**
     * Fetch records that have <code>age IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobResumeBasic_20170612> fetchByAge(String... values) {
        return fetch(JobResumeBasic_20170612.JOB_RESUME_BASIC_20170612.AGE, values);
    }

    /**
     * Fetch records that have <code>work_exp_years IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobResumeBasic_20170612> fetchByWorkExpYears(Byte... values) {
        return fetch(JobResumeBasic_20170612.JOB_RESUME_BASIC_20170612.WORK_EXP_YEARS, values);
    }

    /**
     * Fetch records that have <code>job_position IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobResumeBasic_20170612> fetchByJobPosition(String... values) {
        return fetch(JobResumeBasic_20170612.JOB_RESUME_BASIC_20170612.JOB_POSITION, values);
    }

    /**
     * Fetch records that have <code>job_company IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobResumeBasic_20170612> fetchByJobCompany(String... values) {
        return fetch(JobResumeBasic_20170612.JOB_RESUME_BASIC_20170612.JOB_COMPANY, values);
    }

    /**
     * Fetch records that have <code>job_start IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobResumeBasic_20170612> fetchByJobStart(Timestamp... values) {
        return fetch(JobResumeBasic_20170612.JOB_RESUME_BASIC_20170612.JOB_START, values);
    }

    /**
     * Fetch records that have <code>job_end IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobResumeBasic_20170612> fetchByJobEnd(Timestamp... values) {
        return fetch(JobResumeBasic_20170612.JOB_RESUME_BASIC_20170612.JOB_END, values);
    }

    /**
     * Fetch records that have <code>edu_grade IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobResumeBasic_20170612> fetchByEduGrade(String... values) {
        return fetch(JobResumeBasic_20170612.JOB_RESUME_BASIC_20170612.EDU_GRADE, values);
    }

    /**
     * Fetch records that have <code>edu_school IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobResumeBasic_20170612> fetchByEduSchool(String... values) {
        return fetch(JobResumeBasic_20170612.JOB_RESUME_BASIC_20170612.EDU_SCHOOL, values);
    }

    /**
     * Fetch records that have <code>edu_start IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobResumeBasic_20170612> fetchByEduStart(Timestamp... values) {
        return fetch(JobResumeBasic_20170612.JOB_RESUME_BASIC_20170612.EDU_START, values);
    }

    /**
     * Fetch records that have <code>edu_end IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobResumeBasic_20170612> fetchByEduEnd(Timestamp... values) {
        return fetch(JobResumeBasic_20170612.JOB_RESUME_BASIC_20170612.EDU_END, values);
    }

    /**
     * Fetch records that have <code>view_count IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobResumeBasic_20170612> fetchByViewCount(Long... values) {
        return fetch(JobResumeBasic_20170612.JOB_RESUME_BASIC_20170612.VIEW_COUNT, values);
    }

    /**
     * Fetch records that have <code>resume_type IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobResumeBasic_20170612> fetchByResumeType(Byte... values) {
        return fetch(JobResumeBasic_20170612.JOB_RESUME_BASIC_20170612.RESUME_TYPE, values);
    }

    /**
     * Fetch records that have <code>cv_type IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobResumeBasic_20170612> fetchByCvType(Short... values) {
        return fetch(JobResumeBasic_20170612.JOB_RESUME_BASIC_20170612.CV_TYPE, values);
    }

    /**
     * Fetch records that have <code>email_resume_status IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobResumeBasic_20170612> fetchByEmailResumeStatus(Byte... values) {
        return fetch(JobResumeBasic_20170612.JOB_RESUME_BASIC_20170612.EMAIL_RESUME_STATUS, values);
    }
}
