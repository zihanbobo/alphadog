/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.daos;


import com.moseeker.baseorm.db.hrdb.tables.HrSuperaccountApply;
import com.moseeker.baseorm.db.hrdb.tables.records.HrSuperaccountApplyRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 升级超级账号申请表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrSuperaccountApplyDao extends DAOImpl<HrSuperaccountApplyRecord, com.moseeker.baseorm.db.hrdb.tables.pojos.HrSuperaccountApply, Integer> {

    /**
     * Create a new HrSuperaccountApplyDao without any configuration
     */
    public HrSuperaccountApplyDao() {
        super(HrSuperaccountApply.HR_SUPERACCOUNT_APPLY, com.moseeker.baseorm.db.hrdb.tables.pojos.HrSuperaccountApply.class);
    }

    /**
     * Create a new HrSuperaccountApplyDao with an attached configuration
     */
    public HrSuperaccountApplyDao(Configuration configuration) {
        super(HrSuperaccountApply.HR_SUPERACCOUNT_APPLY, com.moseeker.baseorm.db.hrdb.tables.pojos.HrSuperaccountApply.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.hrdb.tables.pojos.HrSuperaccountApply object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrSuperaccountApply> fetchById(Integer... values) {
        return fetch(HrSuperaccountApply.HR_SUPERACCOUNT_APPLY.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.hrdb.tables.pojos.HrSuperaccountApply fetchOneById(Integer value) {
        return fetchOne(HrSuperaccountApply.HR_SUPERACCOUNT_APPLY.ID, value);
    }

    /**
     * Fetch records that have <code>company_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrSuperaccountApply> fetchByCompanyId(Integer... values) {
        return fetch(HrSuperaccountApply.HR_SUPERACCOUNT_APPLY.COMPANY_ID, values);
    }

    /**
     * Fetch records that have <code>licence IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrSuperaccountApply> fetchByLicence(byte[]... values) {
        return fetch(HrSuperaccountApply.HR_SUPERACCOUNT_APPLY.LICENCE, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrSuperaccountApply> fetchByCreateTime(Timestamp... values) {
        return fetch(HrSuperaccountApply.HR_SUPERACCOUNT_APPLY.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrSuperaccountApply> fetchByUpdateTime(Timestamp... values) {
        return fetch(HrSuperaccountApply.HR_SUPERACCOUNT_APPLY.UPDATE_TIME, values);
    }

    /**
     * Fetch records that have <code>operate IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrSuperaccountApply> fetchByOperate(Integer... values) {
        return fetch(HrSuperaccountApply.HR_SUPERACCOUNT_APPLY.OPERATE, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrSuperaccountApply> fetchByStatus(Integer... values) {
        return fetch(HrSuperaccountApply.HR_SUPERACCOUNT_APPLY.STATUS, values);
    }

    /**
     * Fetch records that have <code>message IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrSuperaccountApply> fetchByMessage(String... values) {
        return fetch(HrSuperaccountApply.HR_SUPERACCOUNT_APPLY.MESSAGE, values);
    }

    /**
     * Fetch records that have <code>child_company_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrSuperaccountApply> fetchByChildCompanyId(String... values) {
        return fetch(HrSuperaccountApply.HR_SUPERACCOUNT_APPLY.CHILD_COMPANY_ID, values);
    }

    /**
     * Fetch records that have <code>migrate_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrSuperaccountApply> fetchByMigrateTime(Timestamp... values) {
        return fetch(HrSuperaccountApply.HR_SUPERACCOUNT_APPLY.MIGRATE_TIME, values);
    }

    /**
     * Fetch records that have <code>account_limit IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrSuperaccountApply> fetchByAccountLimit(Integer... values) {
        return fetch(HrSuperaccountApply.HR_SUPERACCOUNT_APPLY.ACCOUNT_LIMIT, values);
    }
}
