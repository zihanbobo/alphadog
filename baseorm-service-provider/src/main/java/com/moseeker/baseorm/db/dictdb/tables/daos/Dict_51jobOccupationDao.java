/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.dictdb.tables.daos;


import com.moseeker.baseorm.db.dictdb.tables.Dict_51jobOccupation;
import com.moseeker.baseorm.db.dictdb.tables.records.Dict_51jobOccupationRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 51的职位表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Dict_51jobOccupationDao extends DAOImpl<Dict_51jobOccupationRecord, com.moseeker.baseorm.db.dictdb.tables.pojos.Dict_51jobOccupation, Integer> {

    /**
     * Create a new Dict_51jobOccupationDao without any configuration
     */
    public Dict_51jobOccupationDao() {
        super(Dict_51jobOccupation.DICT_51JOB_OCCUPATION, com.moseeker.baseorm.db.dictdb.tables.pojos.Dict_51jobOccupation.class);
    }

    /**
     * Create a new Dict_51jobOccupationDao with an attached configuration
     */
    public Dict_51jobOccupationDao(Configuration configuration) {
        super(Dict_51jobOccupation.DICT_51JOB_OCCUPATION, com.moseeker.baseorm.db.dictdb.tables.pojos.Dict_51jobOccupation.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.dictdb.tables.pojos.Dict_51jobOccupation object) {
        return object.getCode();
    }

    /**
     * Fetch records that have <code>CODE IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.dictdb.tables.pojos.Dict_51jobOccupation> fetchByCode(Integer... values) {
        return fetch(Dict_51jobOccupation.DICT_51JOB_OCCUPATION.CODE, values);
    }

    /**
     * Fetch a unique record that has <code>CODE = value</code>
     */
    public com.moseeker.baseorm.db.dictdb.tables.pojos.Dict_51jobOccupation fetchOneByCode(Integer value) {
        return fetchOne(Dict_51jobOccupation.DICT_51JOB_OCCUPATION.CODE, value);
    }

    /**
     * Fetch records that have <code>parent_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.dictdb.tables.pojos.Dict_51jobOccupation> fetchByParentId(Integer... values) {
        return fetch(Dict_51jobOccupation.DICT_51JOB_OCCUPATION.PARENT_ID, values);
    }

    /**
     * Fetch records that have <code>NAME IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.dictdb.tables.pojos.Dict_51jobOccupation> fetchByName(String... values) {
        return fetch(Dict_51jobOccupation.DICT_51JOB_OCCUPATION.NAME, values);
    }

    /**
     * Fetch records that have <code>code_other IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.dictdb.tables.pojos.Dict_51jobOccupation> fetchByCodeOther(String... values) {
        return fetch(Dict_51jobOccupation.DICT_51JOB_OCCUPATION.CODE_OTHER, values);
    }

    /**
     * Fetch records that have <code>LEVEL IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.dictdb.tables.pojos.Dict_51jobOccupation> fetchByLevel(Short... values) {
        return fetch(Dict_51jobOccupation.DICT_51JOB_OCCUPATION.LEVEL, values);
    }

    /**
     * Fetch records that have <code>STATUS IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.dictdb.tables.pojos.Dict_51jobOccupation> fetchByStatus(Short... values) {
        return fetch(Dict_51jobOccupation.DICT_51JOB_OCCUPATION.STATUS, values);
    }

    /**
     * Fetch records that have <code>createTime IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.dictdb.tables.pojos.Dict_51jobOccupation> fetchByCreatetime(Timestamp... values) {
        return fetch(Dict_51jobOccupation.DICT_51JOB_OCCUPATION.CREATETIME, values);
    }
}
