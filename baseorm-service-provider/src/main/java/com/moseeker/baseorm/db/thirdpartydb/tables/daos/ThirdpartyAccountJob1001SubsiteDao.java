/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.thirdpartydb.tables.daos;


import com.moseeker.baseorm.db.thirdpartydb.tables.ThirdpartyAccountJob1001Subsite;
import com.moseeker.baseorm.db.thirdpartydb.tables.records.ThirdpartyAccountJob1001SubsiteRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 一览人才的第三方发布网站表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ThirdpartyAccountJob1001SubsiteDao extends DAOImpl<ThirdpartyAccountJob1001SubsiteRecord, com.moseeker.baseorm.db.thirdpartydb.tables.pojos.ThirdpartyAccountJob1001Subsite, Integer> {

    /**
     * Create a new ThirdpartyAccountJob1001SubsiteDao without any configuration
     */
    public ThirdpartyAccountJob1001SubsiteDao() {
        super(ThirdpartyAccountJob1001Subsite.THIRDPARTY_ACCOUNT_JOB1001_SUBSITE, com.moseeker.baseorm.db.thirdpartydb.tables.pojos.ThirdpartyAccountJob1001Subsite.class);
    }

    /**
     * Create a new ThirdpartyAccountJob1001SubsiteDao with an attached configuration
     */
    public ThirdpartyAccountJob1001SubsiteDao(Configuration configuration) {
        super(ThirdpartyAccountJob1001Subsite.THIRDPARTY_ACCOUNT_JOB1001_SUBSITE, com.moseeker.baseorm.db.thirdpartydb.tables.pojos.ThirdpartyAccountJob1001Subsite.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.thirdpartydb.tables.pojos.ThirdpartyAccountJob1001Subsite object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.thirdpartydb.tables.pojos.ThirdpartyAccountJob1001Subsite> fetchById(Integer... values) {
        return fetch(ThirdpartyAccountJob1001Subsite.THIRDPARTY_ACCOUNT_JOB1001_SUBSITE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.thirdpartydb.tables.pojos.ThirdpartyAccountJob1001Subsite fetchOneById(Integer value) {
        return fetchOne(ThirdpartyAccountJob1001Subsite.THIRDPARTY_ACCOUNT_JOB1001_SUBSITE.ID, value);
    }

    /**
     * Fetch records that have <code>account_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.thirdpartydb.tables.pojos.ThirdpartyAccountJob1001Subsite> fetchByAccountId(Integer... values) {
        return fetch(ThirdpartyAccountJob1001Subsite.THIRDPARTY_ACCOUNT_JOB1001_SUBSITE.ACCOUNT_ID, values);
    }

    /**
     * Fetch records that have <code>text IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.thirdpartydb.tables.pojos.ThirdpartyAccountJob1001Subsite> fetchByText(String... values) {
        return fetch(ThirdpartyAccountJob1001Subsite.THIRDPARTY_ACCOUNT_JOB1001_SUBSITE.TEXT, values);
    }

    /**
     * Fetch records that have <code>site IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.thirdpartydb.tables.pojos.ThirdpartyAccountJob1001Subsite> fetchBySite(String... values) {
        return fetch(ThirdpartyAccountJob1001Subsite.THIRDPARTY_ACCOUNT_JOB1001_SUBSITE.SITE, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.thirdpartydb.tables.pojos.ThirdpartyAccountJob1001Subsite> fetchByCreateTime(Timestamp... values) {
        return fetch(ThirdpartyAccountJob1001Subsite.THIRDPARTY_ACCOUNT_JOB1001_SUBSITE.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.thirdpartydb.tables.pojos.ThirdpartyAccountJob1001Subsite> fetchByUpdateTime(Timestamp... values) {
        return fetch(ThirdpartyAccountJob1001Subsite.THIRDPARTY_ACCOUNT_JOB1001_SUBSITE.UPDATE_TIME, values);
    }
}