/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.wordpressdb.tables.records;


import com.moseeker.baseorm.db.wordpressdb.tables.WordpressUsers;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


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
public class WordpressUsersRecord extends UpdatableRecordImpl<WordpressUsersRecord> implements Record10<Long, String, String, String, String, String, Timestamp, String, Integer, String> {

    private static final long serialVersionUID = 732409534;

    /**
     * Setter for <code>wordpressdb.wordpress_users.ID</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>wordpressdb.wordpress_users.ID</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>wordpressdb.wordpress_users.user_login</code>.
     */
    public void setUserLogin(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>wordpressdb.wordpress_users.user_login</code>.
     */
    public String getUserLogin() {
        return (String) get(1);
    }

    /**
     * Setter for <code>wordpressdb.wordpress_users.user_pass</code>.
     */
    public void setUserPass(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>wordpressdb.wordpress_users.user_pass</code>.
     */
    public String getUserPass() {
        return (String) get(2);
    }

    /**
     * Setter for <code>wordpressdb.wordpress_users.user_nicename</code>.
     */
    public void setUserNicename(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>wordpressdb.wordpress_users.user_nicename</code>.
     */
    public String getUserNicename() {
        return (String) get(3);
    }

    /**
     * Setter for <code>wordpressdb.wordpress_users.user_email</code>.
     */
    public void setUserEmail(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>wordpressdb.wordpress_users.user_email</code>.
     */
    public String getUserEmail() {
        return (String) get(4);
    }

    /**
     * Setter for <code>wordpressdb.wordpress_users.user_url</code>.
     */
    public void setUserUrl(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>wordpressdb.wordpress_users.user_url</code>.
     */
    public String getUserUrl() {
        return (String) get(5);
    }

    /**
     * Setter for <code>wordpressdb.wordpress_users.user_registered</code>.
     */
    public void setUserRegistered(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>wordpressdb.wordpress_users.user_registered</code>.
     */
    public Timestamp getUserRegistered() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>wordpressdb.wordpress_users.user_activation_key</code>.
     */
    public void setUserActivationKey(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>wordpressdb.wordpress_users.user_activation_key</code>.
     */
    public String getUserActivationKey() {
        return (String) get(7);
    }

    /**
     * Setter for <code>wordpressdb.wordpress_users.user_status</code>.
     */
    public void setUserStatus(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>wordpressdb.wordpress_users.user_status</code>.
     */
    public Integer getUserStatus() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>wordpressdb.wordpress_users.display_name</code>.
     */
    public void setDisplayName(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>wordpressdb.wordpress_users.display_name</code>.
     */
    public String getDisplayName() {
        return (String) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Long, String, String, String, String, String, Timestamp, String, Integer, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Long, String, String, String, String, String, Timestamp, String, Integer, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return WordpressUsers.WORDPRESS_USERS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return WordpressUsers.WORDPRESS_USERS.USER_LOGIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return WordpressUsers.WORDPRESS_USERS.USER_PASS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return WordpressUsers.WORDPRESS_USERS.USER_NICENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return WordpressUsers.WORDPRESS_USERS.USER_EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return WordpressUsers.WORDPRESS_USERS.USER_URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return WordpressUsers.WORDPRESS_USERS.USER_REGISTERED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return WordpressUsers.WORDPRESS_USERS.USER_ACTIVATION_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return WordpressUsers.WORDPRESS_USERS.USER_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return WordpressUsers.WORDPRESS_USERS.DISPLAY_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getUserLogin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getUserPass();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getUserNicename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getUserEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getUserUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getUserRegistered();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getUserActivationKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getUserStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getDisplayName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WordpressUsersRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WordpressUsersRecord value2(String value) {
        setUserLogin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WordpressUsersRecord value3(String value) {
        setUserPass(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WordpressUsersRecord value4(String value) {
        setUserNicename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WordpressUsersRecord value5(String value) {
        setUserEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WordpressUsersRecord value6(String value) {
        setUserUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WordpressUsersRecord value7(Timestamp value) {
        setUserRegistered(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WordpressUsersRecord value8(String value) {
        setUserActivationKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WordpressUsersRecord value9(Integer value) {
        setUserStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WordpressUsersRecord value10(String value) {
        setDisplayName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WordpressUsersRecord values(Long value1, String value2, String value3, String value4, String value5, String value6, Timestamp value7, String value8, Integer value9, String value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached WordpressUsersRecord
     */
    public WordpressUsersRecord() {
        super(WordpressUsers.WORDPRESS_USERS);
    }

    /**
     * Create a detached, initialised WordpressUsersRecord
     */
    public WordpressUsersRecord(Long id, String userLogin, String userPass, String userNicename, String userEmail, String userUrl, Timestamp userRegistered, String userActivationKey, Integer userStatus, String displayName) {
        super(WordpressUsers.WORDPRESS_USERS);

        set(0, id);
        set(1, userLogin);
        set(2, userPass);
        set(3, userNicename);
        set(4, userEmail);
        set(5, userUrl);
        set(6, userRegistered);
        set(7, userActivationKey);
        set(8, userStatus);
        set(9, displayName);
    }
}
