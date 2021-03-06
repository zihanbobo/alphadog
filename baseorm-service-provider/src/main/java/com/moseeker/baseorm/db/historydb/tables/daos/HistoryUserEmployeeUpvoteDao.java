/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.historydb.tables.daos;


import com.moseeker.baseorm.db.historydb.tables.HistoryUserEmployeeUpvote;
import com.moseeker.baseorm.db.historydb.tables.records.HistoryUserEmployeeUpvoteRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 员工点赞历史记录
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HistoryUserEmployeeUpvoteDao extends DAOImpl<HistoryUserEmployeeUpvoteRecord, com.moseeker.baseorm.db.historydb.tables.pojos.HistoryUserEmployeeUpvote, Integer> {

    /**
     * Create a new HistoryUserEmployeeUpvoteDao without any configuration
     */
    public HistoryUserEmployeeUpvoteDao() {
        super(HistoryUserEmployeeUpvote.HISTORY_USER_EMPLOYEE_UPVOTE, com.moseeker.baseorm.db.historydb.tables.pojos.HistoryUserEmployeeUpvote.class);
    }

    /**
     * Create a new HistoryUserEmployeeUpvoteDao with an attached configuration
     */
    public HistoryUserEmployeeUpvoteDao(Configuration configuration) {
        super(HistoryUserEmployeeUpvote.HISTORY_USER_EMPLOYEE_UPVOTE, com.moseeker.baseorm.db.historydb.tables.pojos.HistoryUserEmployeeUpvote.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.historydb.tables.pojos.HistoryUserEmployeeUpvote object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HistoryUserEmployeeUpvote> fetchById(Integer... values) {
        return fetch(HistoryUserEmployeeUpvote.HISTORY_USER_EMPLOYEE_UPVOTE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.historydb.tables.pojos.HistoryUserEmployeeUpvote fetchOneById(Integer value) {
        return fetchOne(HistoryUserEmployeeUpvote.HISTORY_USER_EMPLOYEE_UPVOTE.ID, value);
    }

    /**
     * Fetch records that have <code>sender IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HistoryUserEmployeeUpvote> fetchBySender(Integer... values) {
        return fetch(HistoryUserEmployeeUpvote.HISTORY_USER_EMPLOYEE_UPVOTE.SENDER, values);
    }

    /**
     * Fetch records that have <code>rabbitmq IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HistoryUserEmployeeUpvote> fetchByReceiver(Integer... values) {
        return fetch(HistoryUserEmployeeUpvote.HISTORY_USER_EMPLOYEE_UPVOTE.RECEIVER, values);
    }

    /**
     * Fetch records that have <code>company_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HistoryUserEmployeeUpvote> fetchByCompanyId(Integer... values) {
        return fetch(HistoryUserEmployeeUpvote.HISTORY_USER_EMPLOYEE_UPVOTE.COMPANY_ID, values);
    }

    /**
     * Fetch records that have <code>upvote_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HistoryUserEmployeeUpvote> fetchByUpvoteTime(Timestamp... values) {
        return fetch(HistoryUserEmployeeUpvote.HISTORY_USER_EMPLOYEE_UPVOTE.UPVOTE_TIME, values);
    }

    /**
     * Fetch records that have <code>cancel IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HistoryUserEmployeeUpvote> fetchByCancel(Byte... values) {
        return fetch(HistoryUserEmployeeUpvote.HISTORY_USER_EMPLOYEE_UPVOTE.CANCEL, values);
    }

    /**
     * Fetch records that have <code>cancel_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HistoryUserEmployeeUpvote> fetchByCancelTime(Timestamp... values) {
        return fetch(HistoryUserEmployeeUpvote.HISTORY_USER_EMPLOYEE_UPVOTE.CANCEL_TIME, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HistoryUserEmployeeUpvote> fetchByCreateTime(Timestamp... values) {
        return fetch(HistoryUserEmployeeUpvote.HISTORY_USER_EMPLOYEE_UPVOTE.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HistoryUserEmployeeUpvote> fetchByUpdateTime(Timestamp... values) {
        return fetch(HistoryUserEmployeeUpvote.HISTORY_USER_EMPLOYEE_UPVOTE.UPDATE_TIME, values);
    }
}
