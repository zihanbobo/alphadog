/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.userdb.tables.daos;


import com.moseeker.baseorm.db.userdb.tables.UserSearchCondition;
import com.moseeker.baseorm.db.userdb.tables.records.UserSearchConditionRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 用户搜索条件(qx职位搜索)
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserSearchConditionDao extends DAOImpl<UserSearchConditionRecord, com.moseeker.baseorm.db.userdb.tables.pojos.UserSearchCondition, Integer> {

    /**
     * Create a new UserSearchConditionDao without any configuration
     */
    public UserSearchConditionDao() {
        super(UserSearchCondition.USER_SEARCH_CONDITION, com.moseeker.baseorm.db.userdb.tables.pojos.UserSearchCondition.class);
    }

    /**
     * Create a new UserSearchConditionDao with an attached configuration
     */
    public UserSearchConditionDao(Configuration configuration) {
        super(UserSearchCondition.USER_SEARCH_CONDITION, com.moseeker.baseorm.db.userdb.tables.pojos.UserSearchCondition.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.userdb.tables.pojos.UserSearchCondition object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.userdb.tables.pojos.UserSearchCondition> fetchById(Integer... values) {
        return fetch(UserSearchCondition.USER_SEARCH_CONDITION.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.userdb.tables.pojos.UserSearchCondition fetchOneById(Integer value) {
        return fetchOne(UserSearchCondition.USER_SEARCH_CONDITION.ID, value);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.userdb.tables.pojos.UserSearchCondition> fetchByName(String... values) {
        return fetch(UserSearchCondition.USER_SEARCH_CONDITION.NAME, values);
    }

    /**
     * Fetch records that have <code>keywords IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.userdb.tables.pojos.UserSearchCondition> fetchByKeywords(String... values) {
        return fetch(UserSearchCondition.USER_SEARCH_CONDITION.KEYWORDS, values);
    }

    /**
     * Fetch records that have <code>city_name IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.userdb.tables.pojos.UserSearchCondition> fetchByCityName(String... values) {
        return fetch(UserSearchCondition.USER_SEARCH_CONDITION.CITY_NAME, values);
    }

    /**
     * Fetch records that have <code>salary_top IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.userdb.tables.pojos.UserSearchCondition> fetchBySalaryTop(Integer... values) {
        return fetch(UserSearchCondition.USER_SEARCH_CONDITION.SALARY_TOP, values);
    }

    /**
     * Fetch records that have <code>salary_bottom IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.userdb.tables.pojos.UserSearchCondition> fetchBySalaryBottom(Integer... values) {
        return fetch(UserSearchCondition.USER_SEARCH_CONDITION.SALARY_BOTTOM, values);
    }

    /**
     * Fetch records that have <code>salary_negotiable IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.userdb.tables.pojos.UserSearchCondition> fetchBySalaryNegotiable(Byte... values) {
        return fetch(UserSearchCondition.USER_SEARCH_CONDITION.SALARY_NEGOTIABLE, values);
    }

    /**
     * Fetch records that have <code>industry IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.userdb.tables.pojos.UserSearchCondition> fetchByIndustry(String... values) {
        return fetch(UserSearchCondition.USER_SEARCH_CONDITION.INDUSTRY, values);
    }

    /**
     * Fetch records that have <code>user_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.userdb.tables.pojos.UserSearchCondition> fetchByUserId(Integer... values) {
        return fetch(UserSearchCondition.USER_SEARCH_CONDITION.USER_ID, values);
    }

    /**
     * Fetch records that have <code>disable IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.userdb.tables.pojos.UserSearchCondition> fetchByDisable(Byte... values) {
        return fetch(UserSearchCondition.USER_SEARCH_CONDITION.DISABLE, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.userdb.tables.pojos.UserSearchCondition> fetchByCreateTime(Timestamp... values) {
        return fetch(UserSearchCondition.USER_SEARCH_CONDITION.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.userdb.tables.pojos.UserSearchCondition> fetchByUpdateTime(Timestamp... values) {
        return fetch(UserSearchCondition.USER_SEARCH_CONDITION.UPDATE_TIME, values);
    }
}
