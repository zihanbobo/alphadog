/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.jobdb.tables.daos;


import com.moseeker.baseorm.db.jobdb.tables.FeatureNotFound;
import com.moseeker.baseorm.db.jobdb.tables.records.FeatureNotFoundRecord;

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
public class FeatureNotFoundDao extends DAOImpl<FeatureNotFoundRecord, com.moseeker.baseorm.db.jobdb.tables.pojos.FeatureNotFound, Integer> {

    /**
     * Create a new FeatureNotFoundDao without any configuration
     */
    public FeatureNotFoundDao() {
        super(FeatureNotFound.FEATURE_NOT_FOUND, com.moseeker.baseorm.db.jobdb.tables.pojos.FeatureNotFound.class);
    }

    /**
     * Create a new FeatureNotFoundDao with an attached configuration
     */
    public FeatureNotFoundDao(Configuration configuration) {
        super(FeatureNotFound.FEATURE_NOT_FOUND, com.moseeker.baseorm.db.jobdb.tables.pojos.FeatureNotFound.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.jobdb.tables.pojos.FeatureNotFound object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.FeatureNotFound> fetchById(Integer... values) {
        return fetch(FeatureNotFound.FEATURE_NOT_FOUND.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.jobdb.tables.pojos.FeatureNotFound fetchOneById(Integer value) {
        return fetchOne(FeatureNotFound.FEATURE_NOT_FOUND.ID, value);
    }

    /**
     * Fetch records that have <code>feature IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.FeatureNotFound> fetchByFeature(String... values) {
        return fetch(FeatureNotFound.FEATURE_NOT_FOUND.FEATURE, values);
    }

    /**
     * Fetch records that have <code>company_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.FeatureNotFound> fetchByCompanyId(Integer... values) {
        return fetch(FeatureNotFound.FEATURE_NOT_FOUND.COMPANY_ID, values);
    }
}