/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.historydb.tables.daos;


import com.moseeker.baseorm.db.historydb.tables.HrAppCvConf_171117;
import com.moseeker.baseorm.db.historydb.tables.records.HrAppCvConf_171117Record;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 企业申请简历校验配置
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrAppCvConf_171117Dao extends DAOImpl<HrAppCvConf_171117Record, com.moseeker.baseorm.db.historydb.tables.pojos.HrAppCvConf_171117, Integer> {

    /**
     * Create a new HrAppCvConf_171117Dao without any configuration
     */
    public HrAppCvConf_171117Dao() {
        super(HrAppCvConf_171117.HR_APP_CV_CONF_171117, com.moseeker.baseorm.db.historydb.tables.pojos.HrAppCvConf_171117.class);
    }

    /**
     * Create a new HrAppCvConf_171117Dao with an attached configuration
     */
    public HrAppCvConf_171117Dao(Configuration configuration) {
        super(HrAppCvConf_171117.HR_APP_CV_CONF_171117, com.moseeker.baseorm.db.historydb.tables.pojos.HrAppCvConf_171117.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.historydb.tables.pojos.HrAppCvConf_171117 object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HrAppCvConf_171117> fetchById(Integer... values) {
        return fetch(HrAppCvConf_171117.HR_APP_CV_CONF_171117.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.historydb.tables.pojos.HrAppCvConf_171117 fetchOneById(Integer value) {
        return fetchOne(HrAppCvConf_171117.HR_APP_CV_CONF_171117.ID, value);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HrAppCvConf_171117> fetchByName(String... values) {
        return fetch(HrAppCvConf_171117.HR_APP_CV_CONF_171117.NAME, values);
    }

    /**
     * Fetch records that have <code>priority IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HrAppCvConf_171117> fetchByPriority(Integer... values) {
        return fetch(HrAppCvConf_171117.HR_APP_CV_CONF_171117.PRIORITY, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HrAppCvConf_171117> fetchByCreateTime(Timestamp... values) {
        return fetch(HrAppCvConf_171117.HR_APP_CV_CONF_171117.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HrAppCvConf_171117> fetchByUpdateTime(Timestamp... values) {
        return fetch(HrAppCvConf_171117.HR_APP_CV_CONF_171117.UPDATE_TIME, values);
    }

    /**
     * Fetch records that have <code>disable IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HrAppCvConf_171117> fetchByDisable(Integer... values) {
        return fetch(HrAppCvConf_171117.HR_APP_CV_CONF_171117.DISABLE, values);
    }

    /**
     * Fetch records that have <code>company_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HrAppCvConf_171117> fetchByCompanyId(Integer... values) {
        return fetch(HrAppCvConf_171117.HR_APP_CV_CONF_171117.COMPANY_ID, values);
    }

    /**
     * Fetch records that have <code>hraccount_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HrAppCvConf_171117> fetchByHraccountId(Integer... values) {
        return fetch(HrAppCvConf_171117.HR_APP_CV_CONF_171117.HRACCOUNT_ID, values);
    }

    /**
     * Fetch records that have <code>required IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HrAppCvConf_171117> fetchByRequired(Integer... values) {
        return fetch(HrAppCvConf_171117.HR_APP_CV_CONF_171117.REQUIRED, values);
    }

    /**
     * Fetch records that have <code>field_value IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HrAppCvConf_171117> fetchByFieldValue(String... values) {
        return fetch(HrAppCvConf_171117.HR_APP_CV_CONF_171117.FIELD_VALUE, values);
    }
}