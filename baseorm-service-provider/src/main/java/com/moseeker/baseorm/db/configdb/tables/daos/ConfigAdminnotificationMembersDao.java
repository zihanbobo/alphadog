/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.configdb.tables.daos;


import com.moseeker.baseorm.db.configdb.tables.ConfigAdminnotificationMembers;
import com.moseeker.baseorm.db.configdb.tables.records.ConfigAdminnotificationMembersRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 管理员通知联系人
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ConfigAdminnotificationMembersDao extends DAOImpl<ConfigAdminnotificationMembersRecord, com.moseeker.baseorm.db.configdb.tables.pojos.ConfigAdminnotificationMembers, Integer> {

    /**
     * Create a new ConfigAdminnotificationMembersDao without any configuration
     */
    public ConfigAdminnotificationMembersDao() {
        super(ConfigAdminnotificationMembers.CONFIG_ADMINNOTIFICATION_MEMBERS, com.moseeker.baseorm.db.configdb.tables.pojos.ConfigAdminnotificationMembers.class);
    }

    /**
     * Create a new ConfigAdminnotificationMembersDao with an attached configuration
     */
    public ConfigAdminnotificationMembersDao(Configuration configuration) {
        super(ConfigAdminnotificationMembers.CONFIG_ADMINNOTIFICATION_MEMBERS, com.moseeker.baseorm.db.configdb.tables.pojos.ConfigAdminnotificationMembers.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.configdb.tables.pojos.ConfigAdminnotificationMembers object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.configdb.tables.pojos.ConfigAdminnotificationMembers> fetchById(Integer... values) {
        return fetch(ConfigAdminnotificationMembers.CONFIG_ADMINNOTIFICATION_MEMBERS.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.configdb.tables.pojos.ConfigAdminnotificationMembers fetchOneById(Integer value) {
        return fetchOne(ConfigAdminnotificationMembers.CONFIG_ADMINNOTIFICATION_MEMBERS.ID, value);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.configdb.tables.pojos.ConfigAdminnotificationMembers> fetchByName(String... values) {
        return fetch(ConfigAdminnotificationMembers.CONFIG_ADMINNOTIFICATION_MEMBERS.NAME, values);
    }

    /**
     * Fetch a unique record that has <code>name = value</code>
     */
    public com.moseeker.baseorm.db.configdb.tables.pojos.ConfigAdminnotificationMembers fetchOneByName(String value) {
        return fetchOne(ConfigAdminnotificationMembers.CONFIG_ADMINNOTIFICATION_MEMBERS.NAME, value);
    }

    /**
     * Fetch records that have <code>mobilephone IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.configdb.tables.pojos.ConfigAdminnotificationMembers> fetchByMobilephone(String... values) {
        return fetch(ConfigAdminnotificationMembers.CONFIG_ADMINNOTIFICATION_MEMBERS.MOBILEPHONE, values);
    }

    /**
     * Fetch a unique record that has <code>mobilephone = value</code>
     */
    public com.moseeker.baseorm.db.configdb.tables.pojos.ConfigAdminnotificationMembers fetchOneByMobilephone(String value) {
        return fetchOne(ConfigAdminnotificationMembers.CONFIG_ADMINNOTIFICATION_MEMBERS.MOBILEPHONE, value);
    }

    /**
     * Fetch records that have <code>wechatopenid IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.configdb.tables.pojos.ConfigAdminnotificationMembers> fetchByWechatopenid(String... values) {
        return fetch(ConfigAdminnotificationMembers.CONFIG_ADMINNOTIFICATION_MEMBERS.WECHATOPENID, values);
    }

    /**
     * Fetch a unique record that has <code>wechatopenid = value</code>
     */
    public com.moseeker.baseorm.db.configdb.tables.pojos.ConfigAdminnotificationMembers fetchOneByWechatopenid(String value) {
        return fetchOne(ConfigAdminnotificationMembers.CONFIG_ADMINNOTIFICATION_MEMBERS.WECHATOPENID, value);
    }

    /**
     * Fetch records that have <code>email IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.configdb.tables.pojos.ConfigAdminnotificationMembers> fetchByEmail(String... values) {
        return fetch(ConfigAdminnotificationMembers.CONFIG_ADMINNOTIFICATION_MEMBERS.EMAIL, values);
    }

    /**
     * Fetch a unique record that has <code>email = value</code>
     */
    public com.moseeker.baseorm.db.configdb.tables.pojos.ConfigAdminnotificationMembers fetchOneByEmail(String value) {
        return fetchOne(ConfigAdminnotificationMembers.CONFIG_ADMINNOTIFICATION_MEMBERS.EMAIL, value);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.configdb.tables.pojos.ConfigAdminnotificationMembers> fetchByStatus(Byte... values) {
        return fetch(ConfigAdminnotificationMembers.CONFIG_ADMINNOTIFICATION_MEMBERS.STATUS, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.configdb.tables.pojos.ConfigAdminnotificationMembers> fetchByCreateTime(Timestamp... values) {
        return fetch(ConfigAdminnotificationMembers.CONFIG_ADMINNOTIFICATION_MEMBERS.CREATE_TIME, values);
    }
}
