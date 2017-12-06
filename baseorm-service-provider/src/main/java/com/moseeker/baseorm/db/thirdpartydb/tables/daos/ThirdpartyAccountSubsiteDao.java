/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.thirdpartydb.tables.daos;


import com.moseeker.baseorm.db.thirdpartydb.tables.ThirdpartyAccountSubsite;
import com.moseeker.baseorm.db.thirdpartydb.tables.records.ThirdpartyAccountSubsiteRecord;

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
public class ThirdpartyAccountSubsiteDao extends DAOImpl<ThirdpartyAccountSubsiteRecord, com.moseeker.baseorm.db.thirdpartydb.tables.pojos.ThirdpartyAccountSubsite, Integer> {

    /**
     * Create a new ThirdpartyAccountSubsiteDao without any configuration
     */
    public ThirdpartyAccountSubsiteDao() {
        super(ThirdpartyAccountSubsite.THIRDPARTY_ACCOUNT_SUBSITE, com.moseeker.baseorm.db.thirdpartydb.tables.pojos.ThirdpartyAccountSubsite.class);
    }

    /**
     * Create a new ThirdpartyAccountSubsiteDao with an attached configuration
     */
    public ThirdpartyAccountSubsiteDao(Configuration configuration) {
        super(ThirdpartyAccountSubsite.THIRDPARTY_ACCOUNT_SUBSITE, com.moseeker.baseorm.db.thirdpartydb.tables.pojos.ThirdpartyAccountSubsite.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.thirdpartydb.tables.pojos.ThirdpartyAccountSubsite object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.thirdpartydb.tables.pojos.ThirdpartyAccountSubsite> fetchById(Integer... values) {
        return fetch(ThirdpartyAccountSubsite.THIRDPARTY_ACCOUNT_SUBSITE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.thirdpartydb.tables.pojos.ThirdpartyAccountSubsite fetchOneById(Integer value) {
        return fetchOne(ThirdpartyAccountSubsite.THIRDPARTY_ACCOUNT_SUBSITE.ID, value);
    }

    /**
     * Fetch records that have <code>account_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.thirdpartydb.tables.pojos.ThirdpartyAccountSubsite> fetchByAccountId(Integer... values) {
        return fetch(ThirdpartyAccountSubsite.THIRDPARTY_ACCOUNT_SUBSITE.ACCOUNT_ID, values);
    }

    /**
     * Fetch records that have <code>text IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.thirdpartydb.tables.pojos.ThirdpartyAccountSubsite> fetchByText(String... values) {
        return fetch(ThirdpartyAccountSubsite.THIRDPARTY_ACCOUNT_SUBSITE.TEXT, values);
    }

    /**
     * Fetch records that have <code>site IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.thirdpartydb.tables.pojos.ThirdpartyAccountSubsite> fetchBySite(String... values) {
        return fetch(ThirdpartyAccountSubsite.THIRDPARTY_ACCOUNT_SUBSITE.SITE, values);
    }

    /**
     * Fetch records that have <code>createTime IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.thirdpartydb.tables.pojos.ThirdpartyAccountSubsite> fetchByCreatetime(Timestamp... values) {
        return fetch(ThirdpartyAccountSubsite.THIRDPARTY_ACCOUNT_SUBSITE.CREATETIME, values);
    }
}
