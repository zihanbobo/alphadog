/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.dictdb.tables.daos;


import com.moseeker.baseorm.db.dictdb.tables.DictTestMobile;
import com.moseeker.baseorm.db.dictdb.tables.records.DictTestMobileRecord;

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
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DictTestMobileDao extends DAOImpl<DictTestMobileRecord, com.moseeker.baseorm.db.dictdb.tables.pojos.DictTestMobile, Integer> {

    /**
     * Create a new DictTestMobileDao without any configuration
     */
    public DictTestMobileDao() {
        super(DictTestMobile.DICT_TEST_MOBILE, com.moseeker.baseorm.db.dictdb.tables.pojos.DictTestMobile.class);
    }

    /**
     * Create a new DictTestMobileDao with an attached configuration
     */
    public DictTestMobileDao(Configuration configuration) {
        super(DictTestMobile.DICT_TEST_MOBILE, com.moseeker.baseorm.db.dictdb.tables.pojos.DictTestMobile.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.dictdb.tables.pojos.DictTestMobile object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.dictdb.tables.pojos.DictTestMobile> fetchById(Integer... values) {
        return fetch(DictTestMobile.DICT_TEST_MOBILE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.dictdb.tables.pojos.DictTestMobile fetchOneById(Integer value) {
        return fetchOne(DictTestMobile.DICT_TEST_MOBILE.ID, value);
    }

    /**
     * Fetch records that have <code>mobile IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.dictdb.tables.pojos.DictTestMobile> fetchByMobile(String... values) {
        return fetch(DictTestMobile.DICT_TEST_MOBILE.MOBILE, values);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.dictdb.tables.pojos.DictTestMobile> fetchByName(String... values) {
        return fetch(DictTestMobile.DICT_TEST_MOBILE.NAME, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.dictdb.tables.pojos.DictTestMobile> fetchByCreateTime(Timestamp... values) {
        return fetch(DictTestMobile.DICT_TEST_MOBILE.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.dictdb.tables.pojos.DictTestMobile> fetchByUpdateTime(Timestamp... values) {
        return fetch(DictTestMobile.DICT_TEST_MOBILE.UPDATE_TIME, values);
    }
}
