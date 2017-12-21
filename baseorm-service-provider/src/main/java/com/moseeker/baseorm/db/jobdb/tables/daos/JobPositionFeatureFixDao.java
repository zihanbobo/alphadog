/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.jobdb.tables.daos;


import com.moseeker.baseorm.db.jobdb.tables.JobPositionFeatureFix;
import com.moseeker.baseorm.db.jobdb.tables.records.JobPositionFeatureFixRecord;

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
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JobPositionFeatureFixDao extends DAOImpl<JobPositionFeatureFixRecord, com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix, Integer> {

    /**
     * Create a new JobPositionFeatureFixDao without any configuration
     */
    public JobPositionFeatureFixDao() {
        super(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX, com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix.class);
    }

    /**
     * Create a new JobPositionFeatureFixDao with an attached configuration
     */
    public JobPositionFeatureFixDao(Configuration configuration) {
        super(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX, com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchById(Integer... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix fetchOneById(Integer value) {
        return fetchOne(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.ID, value);
    }

    /**
     * Fetch records that have <code>jobnumber IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByJobnumber(String... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.JOBNUMBER, values);
    }

    /**
     * Fetch records that have <code>company_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByCompanyId(Integer... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.COMPANY_ID, values);
    }

    /**
     * Fetch records that have <code>title IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByTitle(String... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.TITLE, values);
    }

    /**
     * Fetch records that have <code>province IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByProvince(String... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.PROVINCE, values);
    }

    /**
     * Fetch records that have <code>city IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByCity(String... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.CITY, values);
    }

    /**
     * Fetch records that have <code>department IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByDepartment(String... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.DEPARTMENT, values);
    }

    /**
     * Fetch records that have <code>l_jobid IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByLJobid(Integer... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.L_JOBID, values);
    }

    /**
     * Fetch records that have <code>publish_date IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByPublishDate(Timestamp... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.PUBLISH_DATE, values);
    }

    /**
     * Fetch records that have <code>stop_date IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByStopDate(Timestamp... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.STOP_DATE, values);
    }

    /**
     * Fetch records that have <code>accountabilities IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByAccountabilities(String... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.ACCOUNTABILITIES, values);
    }

    /**
     * Fetch records that have <code>experience IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByExperience(String... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.EXPERIENCE, values);
    }

    /**
     * Fetch records that have <code>requirement IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByRequirement(String... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.REQUIREMENT, values);
    }

    /**
     * Fetch records that have <code>salary IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchBySalary(String... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.SALARY, values);
    }

    /**
     * Fetch records that have <code>language IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByLanguage(String... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.LANGUAGE, values);
    }

    /**
     * Fetch records that have <code>job_grade IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByJobGrade(Integer... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.JOB_GRADE, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByStatus(Byte... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.STATUS, values);
    }

    /**
     * Fetch records that have <code>visitnum IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByVisitnum(Integer... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.VISITNUM, values);
    }

    /**
     * Fetch records that have <code>lastvisit IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByLastvisit(String... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.LASTVISIT, values);
    }

    /**
     * Fetch records that have <code>source_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchBySourceId(Integer... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.SOURCE_ID, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByUpdateTime(Timestamp... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.UPDATE_TIME, values);
    }

    /**
     * Fetch records that have <code>business_group IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByBusinessGroup(String... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.BUSINESS_GROUP, values);
    }

    /**
     * Fetch records that have <code>employment_type IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByEmploymentType(Byte... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.EMPLOYMENT_TYPE, values);
    }

    /**
     * Fetch records that have <code>hr_email IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByHrEmail(String... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.HR_EMAIL, values);
    }

    /**
     * Fetch records that have <code>benefits IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByBenefits(String... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.BENEFITS, values);
    }

    /**
     * Fetch records that have <code>degree IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByDegree(Byte... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.DEGREE, values);
    }

    /**
     * Fetch records that have <code>feature IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByFeature(String... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.FEATURE, values);
    }

    /**
     * Fetch records that have <code>email_notice IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByEmailNotice(Byte... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.EMAIL_NOTICE, values);
    }

    /**
     * Fetch records that have <code>candidate_source IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByCandidateSource(Byte... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.CANDIDATE_SOURCE, values);
    }

    /**
     * Fetch records that have <code>occupation IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByOccupation(String... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.OCCUPATION, values);
    }

    /**
     * Fetch records that have <code>is_recom IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByIsRecom(Integer... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.IS_RECOM, values);
    }

    /**
     * Fetch records that have <code>industry IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByIndustry(String... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.INDUSTRY, values);
    }

    /**
     * Fetch records that have <code>hongbao_config_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByHongbaoConfigId(Integer... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.HONGBAO_CONFIG_ID, values);
    }

    /**
     * Fetch records that have <code>hongbao_config_recom_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByHongbaoConfigRecomId(Integer... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.HONGBAO_CONFIG_RECOM_ID, values);
    }

    /**
     * Fetch records that have <code>hongbao_config_app_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByHongbaoConfigAppId(Integer... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.HONGBAO_CONFIG_APP_ID, values);
    }

    /**
     * Fetch records that have <code>email_resume_conf IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByEmailResumeConf(Byte... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.EMAIL_RESUME_CONF, values);
    }

    /**
     * Fetch records that have <code>l_PostingTargetId IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByLPostingtargetid(Integer... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.L_POSTINGTARGETID, values);
    }

    /**
     * Fetch records that have <code>priority IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByPriority(Byte... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.PRIORITY, values);
    }

    /**
     * Fetch records that have <code>share_tpl_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByShareTplId(Integer... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.SHARE_TPL_ID, values);
    }

    /**
     * Fetch records that have <code>district IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByDistrict(String... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.DISTRICT, values);
    }

    /**
     * Fetch records that have <code>count IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByCount(Short... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.COUNT, values);
    }

    /**
     * Fetch records that have <code>salary_top IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchBySalaryTop(Integer... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.SALARY_TOP, values);
    }

    /**
     * Fetch records that have <code>salary_bottom IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchBySalaryBottom(Integer... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.SALARY_BOTTOM, values);
    }

    /**
     * Fetch records that have <code>experience_above IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByExperienceAbove(Byte... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.EXPERIENCE_ABOVE, values);
    }

    /**
     * Fetch records that have <code>degree_above IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByDegreeAbove(Byte... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.DEGREE_ABOVE, values);
    }

    /**
     * Fetch records that have <code>management_experience IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByManagementExperience(Byte... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.MANAGEMENT_EXPERIENCE, values);
    }

    /**
     * Fetch records that have <code>gender IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByGender(Byte... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.GENDER, values);
    }

    /**
     * Fetch records that have <code>publisher IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByPublisher(Integer... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.PUBLISHER, values);
    }

    /**
     * Fetch records that have <code>app_cv_config_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByAppCvConfigId(Integer... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.APP_CV_CONFIG_ID, values);
    }

    /**
     * Fetch records that have <code>source IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchBySource(Short... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.SOURCE, values);
    }

    /**
     * Fetch records that have <code>hb_status IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByHbStatus(Byte... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.HB_STATUS, values);
    }

    /**
     * Fetch records that have <code>child_company_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByChildCompanyId(Integer... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.CHILD_COMPANY_ID, values);
    }

    /**
     * Fetch records that have <code>age IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByAge(Byte... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.AGE, values);
    }

    /**
     * Fetch records that have <code>major_required IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByMajorRequired(String... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.MAJOR_REQUIRED, values);
    }

    /**
     * Fetch records that have <code>work_address IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByWorkAddress(String... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.WORK_ADDRESS, values);
    }

    /**
     * Fetch records that have <code>keyword IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByKeyword(String... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.KEYWORD, values);
    }

    /**
     * Fetch records that have <code>reporting_to IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByReportingTo(String... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.REPORTING_TO, values);
    }

    /**
     * Fetch records that have <code>is_hiring IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByIsHiring(Byte... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.IS_HIRING, values);
    }

    /**
     * Fetch records that have <code>underlings IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByUnderlings(Byte... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.UNDERLINGS, values);
    }

    /**
     * Fetch records that have <code>language_required IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByLanguageRequired(Byte... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.LANGUAGE_REQUIRED, values);
    }

    /**
     * Fetch records that have <code>target_industry IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByTargetIndustry(Byte... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.TARGET_INDUSTRY, values);
    }

    /**
     * Fetch records that have <code>current_status IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByCurrentStatus(Byte... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.CURRENT_STATUS, values);
    }

    /**
     * Fetch records that have <code>position_code IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByPositionCode(Integer... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.POSITION_CODE, values);
    }

    /**
     * Fetch records that have <code>team_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionFeatureFix> fetchByTeamId(Integer... values) {
        return fetch(JobPositionFeatureFix.JOB_POSITION_FEATURE_FIX.TEAM_ID, values);
    }
}
