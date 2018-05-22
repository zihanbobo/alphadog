/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.configdb.tables.daos;


import com.moseeker.baseorm.db.configdb.tables.ConfigAdminnotificationGroup;
import com.moseeker.baseorm.db.configdb.tables.records.ConfigAdminnotificationGroupRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 管理员通知群组
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ConfigAdminnotificationGroupDao extends DAOImpl<ConfigAdminnotificationGroupRecord, com.moseeker.baseorm.db.configdb.tables.pojos.ConfigAdminnotificationGroup, Integer> {

    /**
     * Create a new ConfigAdminnotificationGroupDao without any configuration
     */
    public ConfigAdminnotificationGroupDao() {
        super(ConfigAdminnotificationGroup.CONFIG_ADMINNOTIFICATION_GROUP, com.moseeker.baseorm.db.configdb.tables.pojos.ConfigAdminnotificationGroup.class);
    }

    /**
     * Create a new ConfigAdminnotificationGroupDao with an attached configuration
     */
    public ConfigAdminnotificationGroupDao(Configuration configuration) {
        super(ConfigAdminnotificationGroup.CONFIG_ADMINNOTIFICATION_GROUP, com.moseeker.baseorm.db.configdb.tables.pojos.ConfigAdminnotificationGroup.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.configdb.tables.pojos.ConfigAdminnotificationGroup object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.configdb.tables.pojos.ConfigAdminnotificationGroup> fetchById(Integer... values) {
        return fetch(ConfigAdminnotificationGroup.CONFIG_ADMINNOTIFICATION_GROUP.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.configdb.tables.pojos.ConfigAdminnotificationGroup fetchOneById(Integer value) {
        return fetchOne(ConfigAdminnotificationGroup.CONFIG_ADMINNOTIFICATION_GROUP.ID, value);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.configdb.tables.pojos.ConfigAdminnotificationGroup> fetchByName(String... values) {
        return fetch(ConfigAdminnotificationGroup.CONFIG_ADMINNOTIFICATION_GROUP.NAME, values);
    }

    /**
     * Fetch a unique record that has <code>name = value</code>
     */
    public com.moseeker.baseorm.db.configdb.tables.pojos.ConfigAdminnotificationGroup fetchOneByName(String value) {
        return fetchOne(ConfigAdminnotificationGroup.CONFIG_ADMINNOTIFICATION_GROUP.NAME, value);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.configdb.tables.pojos.ConfigAdminnotificationGroup> fetchByCreateTime(Timestamp... values) {
        return fetch(ConfigAdminnotificationGroup.CONFIG_ADMINNOTIFICATION_GROUP.CREATE_TIME, values);
    }
}