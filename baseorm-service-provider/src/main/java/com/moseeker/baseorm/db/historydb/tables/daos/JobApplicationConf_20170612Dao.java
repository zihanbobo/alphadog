/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.historydb.tables.daos;


import com.moseeker.baseorm.db.historydb.tables.JobApplicationConf_20170612;
import com.moseeker.baseorm.db.historydb.tables.records.JobApplicationConf_20170612Record;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 部门申请配置表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JobApplicationConf_20170612Dao extends DAOImpl<JobApplicationConf_20170612Record, com.moseeker.baseorm.db.historydb.tables.pojos.JobApplicationConf_20170612, Integer> {

    /**
     * Create a new JobApplicationConf_20170612Dao without any configuration
     */
    public JobApplicationConf_20170612Dao() {
        super(JobApplicationConf_20170612.JOB_APPLICATION_CONF_20170612, com.moseeker.baseorm.db.historydb.tables.pojos.JobApplicationConf_20170612.class);
    }

    /**
     * Create a new JobApplicationConf_20170612Dao with an attached configuration
     */
    public JobApplicationConf_20170612Dao(Configuration configuration) {
        super(JobApplicationConf_20170612.JOB_APPLICATION_CONF_20170612, com.moseeker.baseorm.db.historydb.tables.pojos.JobApplicationConf_20170612.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.historydb.tables.pojos.JobApplicationConf_20170612 object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobApplicationConf_20170612> fetchById(Integer... values) {
        return fetch(JobApplicationConf_20170612.JOB_APPLICATION_CONF_20170612.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.historydb.tables.pojos.JobApplicationConf_20170612 fetchOneById(Integer value) {
        return fetchOne(JobApplicationConf_20170612.JOB_APPLICATION_CONF_20170612.ID, value);
    }

    /**
     * Fetch records that have <code>company_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobApplicationConf_20170612> fetchByCompanyId(Integer... values) {
        return fetch(JobApplicationConf_20170612.JOB_APPLICATION_CONF_20170612.COMPANY_ID, values);
    }

    /**
     * Fetch records that have <code>appnotice IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobApplicationConf_20170612> fetchByAppnotice(Integer... values) {
        return fetch(JobApplicationConf_20170612.JOB_APPLICATION_CONF_20170612.APPNOTICE, values);
    }

    /**
     * Fetch records that have <code>appnotice_tpl IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobApplicationConf_20170612> fetchByAppnoticeTpl(Integer... values) {
        return fetch(JobApplicationConf_20170612.JOB_APPLICATION_CONF_20170612.APPNOTICE_TPL, values);
    }

    /**
     * Fetch records that have <code>app_reply IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobApplicationConf_20170612> fetchByAppReply(String... values) {
        return fetch(JobApplicationConf_20170612.JOB_APPLICATION_CONF_20170612.APP_REPLY, values);
    }

    /**
     * Fetch records that have <code>email_appnotice IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobApplicationConf_20170612> fetchByEmailAppnotice(Integer... values) {
        return fetch(JobApplicationConf_20170612.JOB_APPLICATION_CONF_20170612.EMAIL_APPNOTICE, values);
    }

    /**
     * Fetch records that have <code>email_appreply IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobApplicationConf_20170612> fetchByEmailAppreply(String... values) {
        return fetch(JobApplicationConf_20170612.JOB_APPLICATION_CONF_20170612.EMAIL_APPREPLY, values);
    }

    /**
     * Fetch records that have <code>sms_appnotice_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobApplicationConf_20170612> fetchBySmsAppnoticeId(Integer... values) {
        return fetch(JobApplicationConf_20170612.JOB_APPLICATION_CONF_20170612.SMS_APPNOTICE_ID, values);
    }

    /**
     * Fetch records that have <code>sms_appnotice_prefix IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobApplicationConf_20170612> fetchBySmsAppnoticePrefix(String... values) {
        return fetch(JobApplicationConf_20170612.JOB_APPLICATION_CONF_20170612.SMS_APPNOTICE_PREFIX, values);
    }

    /**
     * Fetch records that have <code>sms_appnotice_signature IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobApplicationConf_20170612> fetchBySmsAppnoticeSignature(String... values) {
        return fetch(JobApplicationConf_20170612.JOB_APPLICATION_CONF_20170612.SMS_APPNOTICE_SIGNATURE, values);
    }

    /**
     * Fetch records that have <code>sms_delay IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobApplicationConf_20170612> fetchBySmsDelay(Integer... values) {
        return fetch(JobApplicationConf_20170612.JOB_APPLICATION_CONF_20170612.SMS_DELAY, values);
    }

    /**
     * Fetch records that have <code>forward_click_reward IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobApplicationConf_20170612> fetchByForwardClickReward(Integer... values) {
        return fetch(JobApplicationConf_20170612.JOB_APPLICATION_CONF_20170612.FORWARD_CLICK_REWARD, values);
    }

    /**
     * Fetch records that have <code>forward_click_reward_tpl IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobApplicationConf_20170612> fetchByForwardClickRewardTpl(Integer... values) {
        return fetch(JobApplicationConf_20170612.JOB_APPLICATION_CONF_20170612.FORWARD_CLICK_REWARD_TPL, values);
    }

    /**
     * Fetch records that have <code>forward_app_reward IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobApplicationConf_20170612> fetchByForwardAppReward(Integer... values) {
        return fetch(JobApplicationConf_20170612.JOB_APPLICATION_CONF_20170612.FORWARD_APP_REWARD, values);
    }

    /**
     * Fetch records that have <code>forward_app_reward_tpl IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobApplicationConf_20170612> fetchByForwardAppRewardTpl(Integer... values) {
        return fetch(JobApplicationConf_20170612.JOB_APPLICATION_CONF_20170612.FORWARD_APP_REWARD_TPL, values);
    }

    /**
     * Fetch records that have <code>email_resume_conf IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobApplicationConf_20170612> fetchByEmailResumeConf(Byte... values) {
        return fetch(JobApplicationConf_20170612.JOB_APPLICATION_CONF_20170612.EMAIL_RESUME_CONF, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobApplicationConf_20170612> fetchByCreateTime(Timestamp... values) {
        return fetch(JobApplicationConf_20170612.JOB_APPLICATION_CONF_20170612.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.JobApplicationConf_20170612> fetchByUpdateTime(Timestamp... values) {
        return fetch(JobApplicationConf_20170612.JOB_APPLICATION_CONF_20170612.UPDATE_TIME, values);
    }
}
