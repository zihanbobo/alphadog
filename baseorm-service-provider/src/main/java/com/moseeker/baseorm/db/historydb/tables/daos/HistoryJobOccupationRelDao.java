/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.historydb.tables.daos;


import com.moseeker.baseorm.db.historydb.tables.HistoryJobOccupationRel;
import com.moseeker.baseorm.db.historydb.tables.records.HistoryJobOccupationRelRecord;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 职位与职能关系表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HistoryJobOccupationRelDao extends DAOImpl<HistoryJobOccupationRelRecord, com.moseeker.baseorm.db.historydb.tables.pojos.HistoryJobOccupationRel, Integer> {

    /**
     * Create a new HistoryJobOccupationRelDao without any configuration
     */
    public HistoryJobOccupationRelDao() {
        super(HistoryJobOccupationRel.HISTORY_JOB_OCCUPATION_REL, com.moseeker.baseorm.db.historydb.tables.pojos.HistoryJobOccupationRel.class);
    }

    /**
     * Create a new HistoryJobOccupationRelDao with an attached configuration
     */
    public HistoryJobOccupationRelDao(Configuration configuration) {
        super(HistoryJobOccupationRel.HISTORY_JOB_OCCUPATION_REL, com.moseeker.baseorm.db.historydb.tables.pojos.HistoryJobOccupationRel.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.historydb.tables.pojos.HistoryJobOccupationRel object) {
        return object.getPid();
    }

    /**
     * Fetch records that have <code>pid IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HistoryJobOccupationRel> fetchByPid(Integer... values) {
        return fetch(HistoryJobOccupationRel.HISTORY_JOB_OCCUPATION_REL.PID, values);
    }

    /**
     * Fetch a unique record that has <code>pid = value</code>
     */
    public com.moseeker.baseorm.db.historydb.tables.pojos.HistoryJobOccupationRel fetchOneByPid(Integer value) {
        return fetchOne(HistoryJobOccupationRel.HISTORY_JOB_OCCUPATION_REL.PID, value);
    }

    /**
     * Fetch records that have <code>code IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HistoryJobOccupationRel> fetchByCode(Integer... values) {
        return fetch(HistoryJobOccupationRel.HISTORY_JOB_OCCUPATION_REL.CODE, values);
    }
}
