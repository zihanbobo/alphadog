/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.userdb.tables.daos;


import com.moseeker.baseorm.db.userdb.tables.UserViewedPosition;
import com.moseeker.baseorm.db.userdb.tables.records.UserViewedPositionRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 用户查看过的职位
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserViewedPositionDao extends DAOImpl<UserViewedPositionRecord, com.moseeker.baseorm.db.userdb.tables.pojos.UserViewedPosition, Integer> {

    /**
     * Create a new UserViewedPositionDao without any configuration
     */
    public UserViewedPositionDao() {
        super(UserViewedPosition.USER_VIEWED_POSITION, com.moseeker.baseorm.db.userdb.tables.pojos.UserViewedPosition.class);
    }

    /**
     * Create a new UserViewedPositionDao with an attached configuration
     */
    public UserViewedPositionDao(Configuration configuration) {
        super(UserViewedPosition.USER_VIEWED_POSITION, com.moseeker.baseorm.db.userdb.tables.pojos.UserViewedPosition.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.userdb.tables.pojos.UserViewedPosition object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.userdb.tables.pojos.UserViewedPosition> fetchById(Integer... values) {
        return fetch(UserViewedPosition.USER_VIEWED_POSITION.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.userdb.tables.pojos.UserViewedPosition fetchOneById(Integer value) {
        return fetchOne(UserViewedPosition.USER_VIEWED_POSITION.ID, value);
    }

    /**
     * Fetch records that have <code>user_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.userdb.tables.pojos.UserViewedPosition> fetchByUserId(Integer... values) {
        return fetch(UserViewedPosition.USER_VIEWED_POSITION.USER_ID, values);
    }

    /**
     * Fetch records that have <code>position_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.userdb.tables.pojos.UserViewedPosition> fetchByPositionId(Integer... values) {
        return fetch(UserViewedPosition.USER_VIEWED_POSITION.POSITION_ID, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.userdb.tables.pojos.UserViewedPosition> fetchByCreateTime(Timestamp... values) {
        return fetch(UserViewedPosition.USER_VIEWED_POSITION.CREATE_TIME, values);
    }
}
