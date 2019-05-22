/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.dictdb.tables.daos;


import com.moseeker.baseorm.db.dictdb.tables.Dict_58jobFeature;
import com.moseeker.baseorm.db.dictdb.tables.records.Dict_58jobFeatureRecord;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 58福利特色表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Dict_58jobFeatureDao extends DAOImpl<Dict_58jobFeatureRecord, com.moseeker.baseorm.db.dictdb.tables.pojos.Dict_58jobFeature, Integer> {

    /**
     * Create a new Dict_58jobFeatureDao without any configuration
     */
    public Dict_58jobFeatureDao() {
        super(Dict_58jobFeature.DICT_58JOB_FEATURE, com.moseeker.baseorm.db.dictdb.tables.pojos.Dict_58jobFeature.class);
    }

    /**
     * Create a new Dict_58jobFeatureDao with an attached configuration
     */
    public Dict_58jobFeatureDao(Configuration configuration) {
        super(Dict_58jobFeature.DICT_58JOB_FEATURE, com.moseeker.baseorm.db.dictdb.tables.pojos.Dict_58jobFeature.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.dictdb.tables.pojos.Dict_58jobFeature object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.dictdb.tables.pojos.Dict_58jobFeature> fetchById(Integer... values) {
        return fetch(Dict_58jobFeature.DICT_58JOB_FEATURE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.dictdb.tables.pojos.Dict_58jobFeature fetchOneById(Integer value) {
        return fetchOne(Dict_58jobFeature.DICT_58JOB_FEATURE.ID, value);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.dictdb.tables.pojos.Dict_58jobFeature> fetchByName(String... values) {
        return fetch(Dict_58jobFeature.DICT_58JOB_FEATURE.NAME, values);
    }
}
