/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.daos;


import com.moseeker.baseorm.db.hrdb.tables.HrCompanyConf;
import com.moseeker.baseorm.db.hrdb.tables.records.HrCompanyConfRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 公司级别的配置信息表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrCompanyConfDao extends DAOImpl<HrCompanyConfRecord, com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompanyConf, Integer> {

    /**
     * Create a new HrCompanyConfDao without any configuration
     */
    public HrCompanyConfDao() {
        super(HrCompanyConf.HR_COMPANY_CONF, com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompanyConf.class);
    }

    /**
     * Create a new HrCompanyConfDao with an attached configuration
     */
    public HrCompanyConfDao(Configuration configuration) {
        super(HrCompanyConf.HR_COMPANY_CONF, com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompanyConf.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompanyConf object) {
        return object.getCompanyId();
    }

    /**
     * Fetch records that have <code>company_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompanyConf> fetchByCompanyId(Integer... values) {
        return fetch(HrCompanyConf.HR_COMPANY_CONF.COMPANY_ID, values);
    }

    /**
     * Fetch a unique record that has <code>company_id = value</code>
     */
    public com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompanyConf fetchOneByCompanyId(Integer value) {
        return fetchOne(HrCompanyConf.HR_COMPANY_CONF.COMPANY_ID, value);
    }

    /**
     * Fetch records that have <code>theme_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompanyConf> fetchByThemeId(Integer... values) {
        return fetch(HrCompanyConf.HR_COMPANY_CONF.THEME_ID, values);
    }

    /**
     * Fetch records that have <code>hb_throttle IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompanyConf> fetchByHbThrottle(Integer... values) {
        return fetch(HrCompanyConf.HR_COMPANY_CONF.HB_THROTTLE, values);
    }

    /**
     * Fetch records that have <code>app_reply IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompanyConf> fetchByAppReply(String... values) {
        return fetch(HrCompanyConf.HR_COMPANY_CONF.APP_REPLY, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompanyConf> fetchByCreateTime(Timestamp... values) {
        return fetch(HrCompanyConf.HR_COMPANY_CONF.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompanyConf> fetchByUpdateTime(Timestamp... values) {
        return fetch(HrCompanyConf.HR_COMPANY_CONF.UPDATE_TIME, values);
    }

    /**
     * Fetch records that have <code>employee_binding IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompanyConf> fetchByEmployeeBinding(String... values) {
        return fetch(HrCompanyConf.HR_COMPANY_CONF.EMPLOYEE_BINDING, values);
    }

    /**
     * Fetch records that have <code>recommend_presentee IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompanyConf> fetchByRecommendPresentee(String... values) {
        return fetch(HrCompanyConf.HR_COMPANY_CONF.RECOMMEND_PRESENTEE, values);
    }

    /**
     * Fetch records that have <code>recommend_success IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompanyConf> fetchByRecommendSuccess(String... values) {
        return fetch(HrCompanyConf.HR_COMPANY_CONF.RECOMMEND_SUCCESS, values);
    }

    /**
     * Fetch records that have <code>forward_message IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompanyConf> fetchByForwardMessage(String... values) {
        return fetch(HrCompanyConf.HR_COMPANY_CONF.FORWARD_MESSAGE, values);
    }

    /**
     * Fetch records that have <code>application_count_limit IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompanyConf> fetchByApplicationCountLimit(Short... values) {
        return fetch(HrCompanyConf.HR_COMPANY_CONF.APPLICATION_COUNT_LIMIT, values);
    }

    /**
     * Fetch records that have <code>school_application_count_limit IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompanyConf> fetchBySchoolApplicationCountLimit(Short... values) {
        return fetch(HrCompanyConf.HR_COMPANY_CONF.SCHOOL_APPLICATION_COUNT_LIMIT, values);
    }

    /**
     * Fetch records that have <code>job_custom_title IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompanyConf> fetchByJobCustomTitle(String... values) {
        return fetch(HrCompanyConf.HR_COMPANY_CONF.JOB_CUSTOM_TITLE, values);
    }

    /**
     * Fetch records that have <code>search_seq IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompanyConf> fetchBySearchSeq(String... values) {
        return fetch(HrCompanyConf.HR_COMPANY_CONF.SEARCH_SEQ, values);
    }

    /**
     * Fetch records that have <code>search_img IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompanyConf> fetchBySearchImg(String... values) {
        return fetch(HrCompanyConf.HR_COMPANY_CONF.SEARCH_IMG, values);
    }

    /**
     * Fetch records that have <code>job_occupation IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompanyConf> fetchByJobOccupation(String... values) {
        return fetch(HrCompanyConf.HR_COMPANY_CONF.JOB_OCCUPATION, values);
    }

    /**
     * Fetch records that have <code>teamname_custom IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompanyConf> fetchByTeamnameCustom(String... values) {
        return fetch(HrCompanyConf.HR_COMPANY_CONF.TEAMNAME_CUSTOM, values);
    }

    /**
     * Fetch records that have <code>application_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompanyConf> fetchByApplicationTime(Timestamp... values) {
        return fetch(HrCompanyConf.HR_COMPANY_CONF.APPLICATION_TIME, values);
    }

    /**
     * Fetch records that have <code>newjd_status IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompanyConf> fetchByNewjdStatus(Integer... values) {
        return fetch(HrCompanyConf.HR_COMPANY_CONF.NEWJD_STATUS, values);
    }

    /**
     * Fetch records that have <code>hr_chat IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompanyConf> fetchByHrChat(Byte... values) {
        return fetch(HrCompanyConf.HR_COMPANY_CONF.HR_CHAT, values);
    }

    /**
     * Fetch records that have <code>show_in_qx IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompanyConf> fetchByShowInQx(Byte... values) {
        return fetch(HrCompanyConf.HR_COMPANY_CONF.SHOW_IN_QX, values);
    }

    /**
     * Fetch records that have <code>employee_slug IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompanyConf> fetchByEmployeeSlug(String... values) {
        return fetch(HrCompanyConf.HR_COMPANY_CONF.EMPLOYEE_SLUG, values);
    }

    /**
     * Fetch records that have <code>display_locale IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompanyConf> fetchByDisplayLocale(String... values) {
        return fetch(HrCompanyConf.HR_COMPANY_CONF.DISPLAY_LOCALE, values);
    }
}
