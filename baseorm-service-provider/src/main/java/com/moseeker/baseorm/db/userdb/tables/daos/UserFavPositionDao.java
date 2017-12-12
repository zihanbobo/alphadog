/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.userdb.tables.daos;


import com.moseeker.baseorm.db.userdb.tables.UserFavPosition;
import com.moseeker.baseorm.db.userdb.tables.records.UserFavPositionRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 用户职位收藏
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserFavPositionDao extends DAOImpl<UserFavPositionRecord, com.moseeker.baseorm.db.userdb.tables.pojos.UserFavPosition, Integer> {

    /**
     * Create a new UserFavPositionDao without any configuration
     */
    public UserFavPositionDao() {
        super(UserFavPosition.USER_FAV_POSITION, com.moseeker.baseorm.db.userdb.tables.pojos.UserFavPosition.class);
    }

    /**
     * Create a new UserFavPositionDao with an attached configuration
     */
    public UserFavPositionDao(Configuration configuration) {
        super(UserFavPosition.USER_FAV_POSITION, com.moseeker.baseorm.db.userdb.tables.pojos.UserFavPosition.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.userdb.tables.pojos.UserFavPosition object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>sysuser_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.userdb.tables.pojos.UserFavPosition> fetchBySysuserId(Integer... values) {
        return fetch(UserFavPosition.USER_FAV_POSITION.SYSUSER_ID, values);
    }

    /**
     * Fetch records that have <code>position_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.userdb.tables.pojos.UserFavPosition> fetchByPositionId(Integer... values) {
        return fetch(UserFavPosition.USER_FAV_POSITION.POSITION_ID, values);
    }

    /**
     * Fetch records that have <code>favorite IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.userdb.tables.pojos.UserFavPosition> fetchByFavorite(Byte... values) {
        return fetch(UserFavPosition.USER_FAV_POSITION.FAVORITE, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.userdb.tables.pojos.UserFavPosition> fetchByCreateTime(Timestamp... values) {
        return fetch(UserFavPosition.USER_FAV_POSITION.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.userdb.tables.pojos.UserFavPosition> fetchByUpdateTime(Timestamp... values) {
        return fetch(UserFavPosition.USER_FAV_POSITION.UPDATE_TIME, values);
    }

    /**
     * Fetch records that have <code>mobile IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.userdb.tables.pojos.UserFavPosition> fetchByMobile(String... values) {
        return fetch(UserFavPosition.USER_FAV_POSITION.MOBILE, values);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.userdb.tables.pojos.UserFavPosition> fetchById(Integer... values) {
        return fetch(UserFavPosition.USER_FAV_POSITION.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.userdb.tables.pojos.UserFavPosition fetchOneById(Integer value) {
        return fetchOne(UserFavPosition.USER_FAV_POSITION.ID, value);
    }

    /**
     * Fetch records that have <code>wxuser_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.userdb.tables.pojos.UserFavPosition> fetchByWxuserId(Integer... values) {
        return fetch(UserFavPosition.USER_FAV_POSITION.WXUSER_ID, values);
    }

    /**
     * Fetch records that have <code>recom_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.userdb.tables.pojos.UserFavPosition> fetchByRecomId(Integer... values) {
        return fetch(UserFavPosition.USER_FAV_POSITION.RECOM_ID, values);
    }

    /**
     * Fetch records that have <code>recom_user_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.userdb.tables.pojos.UserFavPosition> fetchByRecomUserId(Integer... values) {
        return fetch(UserFavPosition.USER_FAV_POSITION.RECOM_USER_ID, values);
    }
}