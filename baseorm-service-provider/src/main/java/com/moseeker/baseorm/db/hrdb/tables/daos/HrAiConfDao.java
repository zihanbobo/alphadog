/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.daos;


import com.moseeker.baseorm.db.hrdb.tables.HrAiConf;
import com.moseeker.baseorm.db.hrdb.tables.records.HrAiConfRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 人工智能系统配置表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrAiConfDao extends DAOImpl<HrAiConfRecord, com.moseeker.baseorm.db.hrdb.tables.pojos.HrAiConf, Integer> {

    /**
     * Create a new HrAiConfDao without any configuration
     */
    public HrAiConfDao() {
        super(HrAiConf.HR_AI_CONF, com.moseeker.baseorm.db.hrdb.tables.pojos.HrAiConf.class);
    }

    /**
     * Create a new HrAiConfDao with an attached configuration
     */
    public HrAiConfDao(Configuration configuration) {
        super(HrAiConf.HR_AI_CONF, com.moseeker.baseorm.db.hrdb.tables.pojos.HrAiConf.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.hrdb.tables.pojos.HrAiConf object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrAiConf> fetchById(Integer... values) {
        return fetch(HrAiConf.HR_AI_CONF.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.hrdb.tables.pojos.HrAiConf fetchOneById(Integer value) {
        return fetchOne(HrAiConf.HR_AI_CONF.ID, value);
    }

    /**
     * Fetch records that have <code>company_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrAiConf> fetchByCompanyId(Integer... values) {
        return fetch(HrAiConf.HR_AI_CONF.COMPANY_ID, values);
    }

    /**
     * Fetch records that have <code>follower_switch IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrAiConf> fetchByFollowerSwitch(Byte... values) {
        return fetch(HrAiConf.HR_AI_CONF.FOLLOWER_SWITCH, values);
    }

    /**
     * Fetch records that have <code>follower_percent IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrAiConf> fetchByFollowerPercent(Double... values) {
        return fetch(HrAiConf.HR_AI_CONF.FOLLOWER_PERCENT, values);
    }

    /**
     * Fetch records that have <code>employee_switch IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrAiConf> fetchByEmployeeSwitch(Byte... values) {
        return fetch(HrAiConf.HR_AI_CONF.EMPLOYEE_SWITCH, values);
    }

    /**
     * Fetch records that have <code>employee_percent IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrAiConf> fetchByEmployeePercent(Double... values) {
        return fetch(HrAiConf.HR_AI_CONF.EMPLOYEE_PERCENT, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrAiConf> fetchByCreateTime(Timestamp... values) {
        return fetch(HrAiConf.HR_AI_CONF.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrAiConf> fetchByUpdateTime(Timestamp... values) {
        return fetch(HrAiConf.HR_AI_CONF.UPDATE_TIME, values);
    }
}
