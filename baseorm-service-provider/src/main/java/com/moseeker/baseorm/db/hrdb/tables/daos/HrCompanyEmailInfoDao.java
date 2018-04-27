/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.daos;


import com.moseeker.baseorm.db.hrdb.tables.HrCompanyEmailInfo;
import com.moseeker.baseorm.db.hrdb.tables.records.HrCompanyEmailInfoRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 企业邮件总量信息表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrCompanyEmailInfoDao extends DAOImpl<HrCompanyEmailInfoRecord, com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompanyEmailInfo, Integer> {

    /**
     * Create a new HrCompanyEmailInfoDao without any configuration
     */
    public HrCompanyEmailInfoDao() {
        super(HrCompanyEmailInfo.HR_COMPANY_EMAIL_INFO, com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompanyEmailInfo.class);
    }

    /**
     * Create a new HrCompanyEmailInfoDao with an attached configuration
     */
    public HrCompanyEmailInfoDao(Configuration configuration) {
        super(HrCompanyEmailInfo.HR_COMPANY_EMAIL_INFO, com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompanyEmailInfo.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompanyEmailInfo object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompanyEmailInfo> fetchById(Integer... values) {
        return fetch(HrCompanyEmailInfo.HR_COMPANY_EMAIL_INFO.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompanyEmailInfo fetchOneById(Integer value) {
        return fetchOne(HrCompanyEmailInfo.HR_COMPANY_EMAIL_INFO.ID, value);
    }

    /**
     * Fetch records that have <code>company_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompanyEmailInfo> fetchByCompanyId(Integer... values) {
        return fetch(HrCompanyEmailInfo.HR_COMPANY_EMAIL_INFO.COMPANY_ID, values);
    }

    /**
     * Fetch a unique record that has <code>company_id = value</code>
     */
    public com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompanyEmailInfo fetchOneByCompanyId(Integer value) {
        return fetchOne(HrCompanyEmailInfo.HR_COMPANY_EMAIL_INFO.COMPANY_ID, value);
    }

    /**
     * Fetch records that have <code>total IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompanyEmailInfo> fetchByTotal(Integer... values) {
        return fetch(HrCompanyEmailInfo.HR_COMPANY_EMAIL_INFO.TOTAL, values);
    }

    /**
     * Fetch records that have <code>balance IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompanyEmailInfo> fetchByBalance(Integer... values) {
        return fetch(HrCompanyEmailInfo.HR_COMPANY_EMAIL_INFO.BALANCE, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompanyEmailInfo> fetchByCreateTime(Timestamp... values) {
        return fetch(HrCompanyEmailInfo.HR_COMPANY_EMAIL_INFO.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompanyEmailInfo> fetchByUpdateTime(Timestamp... values) {
        return fetch(HrCompanyEmailInfo.HR_COMPANY_EMAIL_INFO.UPDATE_TIME, values);
    }
}
