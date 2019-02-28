/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.userdb.tables.daos;


import com.moseeker.baseorm.db.userdb.tables.UserFormerEmployee;
import com.moseeker.baseorm.db.userdb.tables.records.UserFormerEmployeeRecord;

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
public class UserFormerEmployeeDao extends DAOImpl<UserFormerEmployeeRecord, com.moseeker.baseorm.db.userdb.tables.pojos.UserFormerEmployee, Integer> {

    /**
     * Create a new UserFormerEmployeeDao without any configuration
     */
    public UserFormerEmployeeDao() {
        super(UserFormerEmployee.USER_FORMER_EMPLOYEE, com.moseeker.baseorm.db.userdb.tables.pojos.UserFormerEmployee.class);
    }

    /**
     * Create a new UserFormerEmployeeDao with an attached configuration
     */
    public UserFormerEmployeeDao(Configuration configuration) {
        super(UserFormerEmployee.USER_FORMER_EMPLOYEE, com.moseeker.baseorm.db.userdb.tables.pojos.UserFormerEmployee.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.userdb.tables.pojos.UserFormerEmployee object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.userdb.tables.pojos.UserFormerEmployee> fetchById(Integer... values) {
        return fetch(UserFormerEmployee.USER_FORMER_EMPLOYEE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.userdb.tables.pojos.UserFormerEmployee fetchOneById(Integer value) {
        return fetchOne(UserFormerEmployee.USER_FORMER_EMPLOYEE.ID, value);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.userdb.tables.pojos.UserFormerEmployee> fetchByName(String... values) {
        return fetch(UserFormerEmployee.USER_FORMER_EMPLOYEE.NAME, values);
    }

    /**
     * Fetch records that have <code>company_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.userdb.tables.pojos.UserFormerEmployee> fetchByCompanyId(Integer... values) {
        return fetch(UserFormerEmployee.USER_FORMER_EMPLOYEE.COMPANY_ID, values);
    }

    /**
     * Fetch records that have <code>email IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.userdb.tables.pojos.UserFormerEmployee> fetchByEmail(String... values) {
        return fetch(UserFormerEmployee.USER_FORMER_EMPLOYEE.EMAIL, values);
    }

    /**
     * Fetch records that have <code>mobile IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.userdb.tables.pojos.UserFormerEmployee> fetchByMobile(Long... values) {
        return fetch(UserFormerEmployee.USER_FORMER_EMPLOYEE.MOBILE, values);
    }

    /**
     * Fetch records that have <code>user_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.userdb.tables.pojos.UserFormerEmployee> fetchByUserId(Integer... values) {
        return fetch(UserFormerEmployee.USER_FORMER_EMPLOYEE.USER_ID, values);
    }

    /**
     * Fetch records that have <code>last_tmplmsg_sent_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.userdb.tables.pojos.UserFormerEmployee> fetchByLastTmplmsgSentTime(Timestamp... values) {
        return fetch(UserFormerEmployee.USER_FORMER_EMPLOYEE.LAST_TMPLMSG_SENT_TIME, values);
    }

    /**
     * Fetch records that have <code>last_sms_sent_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.userdb.tables.pojos.UserFormerEmployee> fetchByLastSmsSentTime(Timestamp... values) {
        return fetch(UserFormerEmployee.USER_FORMER_EMPLOYEE.LAST_SMS_SENT_TIME, values);
    }

    /**
     * Fetch records that have <code>last_mail_sent_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.userdb.tables.pojos.UserFormerEmployee> fetchByLastMailSentTime(Timestamp... values) {
        return fetch(UserFormerEmployee.USER_FORMER_EMPLOYEE.LAST_MAIL_SENT_TIME, values);
    }
}