/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.userdb.tables.daos;


import com.moseeker.baseorm.db.userdb.tables.UserHrUserRole;
import com.moseeker.baseorm.db.userdb.tables.records.UserHrUserRoleRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 用户的角色
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserHrUserRoleDao extends DAOImpl<UserHrUserRoleRecord, com.moseeker.baseorm.db.userdb.tables.pojos.UserHrUserRole, Integer> {

    /**
     * Create a new UserHrUserRoleDao without any configuration
     */
    public UserHrUserRoleDao() {
        super(UserHrUserRole.USER_HR_USER_ROLE, com.moseeker.baseorm.db.userdb.tables.pojos.UserHrUserRole.class);
    }

    /**
     * Create a new UserHrUserRoleDao with an attached configuration
     */
    public UserHrUserRoleDao(Configuration configuration) {
        super(UserHrUserRole.USER_HR_USER_ROLE, com.moseeker.baseorm.db.userdb.tables.pojos.UserHrUserRole.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.userdb.tables.pojos.UserHrUserRole object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.userdb.tables.pojos.UserHrUserRole> fetchById(Integer... values) {
        return fetch(UserHrUserRole.USER_HR_USER_ROLE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.userdb.tables.pojos.UserHrUserRole fetchOneById(Integer value) {
        return fetchOne(UserHrUserRole.USER_HR_USER_ROLE.ID, value);
    }

    /**
     * Fetch records that have <code>user_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.userdb.tables.pojos.UserHrUserRole> fetchByUserId(Integer... values) {
        return fetch(UserHrUserRole.USER_HR_USER_ROLE.USER_ID, values);
    }

    /**
     * Fetch records that have <code>role_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.userdb.tables.pojos.UserHrUserRole> fetchByRoleId(Integer... values) {
        return fetch(UserHrUserRole.USER_HR_USER_ROLE.ROLE_ID, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.userdb.tables.pojos.UserHrUserRole> fetchByCreateTime(Timestamp... values) {
        return fetch(UserHrUserRole.USER_HR_USER_ROLE.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>creator IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.userdb.tables.pojos.UserHrUserRole> fetchByCreator(String... values) {
        return fetch(UserHrUserRole.USER_HR_USER_ROLE.CREATOR, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.userdb.tables.pojos.UserHrUserRole> fetchByUpdateTime(Timestamp... values) {
        return fetch(UserHrUserRole.USER_HR_USER_ROLE.UPDATE_TIME, values);
    }

    /**
     * Fetch records that have <code>updator IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.userdb.tables.pojos.UserHrUserRole> fetchByUpdator(String... values) {
        return fetch(UserHrUserRole.USER_HR_USER_ROLE.UPDATOR, values);
    }
}
