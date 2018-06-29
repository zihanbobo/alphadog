/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.configdb.tables.daos;


import com.moseeker.baseorm.db.configdb.tables.ConfigHbBalance;
import com.moseeker.baseorm.db.configdb.tables.records.ConfigHbBalanceRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 手动录入微信账户余额
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ConfigHbBalanceDao extends DAOImpl<ConfigHbBalanceRecord, com.moseeker.baseorm.db.configdb.tables.pojos.ConfigHbBalance, Integer> {

    /**
     * Create a new ConfigHbBalanceDao without any configuration
     */
    public ConfigHbBalanceDao() {
        super(ConfigHbBalance.CONFIG_HB_BALANCE, com.moseeker.baseorm.db.configdb.tables.pojos.ConfigHbBalance.class);
    }

    /**
     * Create a new ConfigHbBalanceDao with an attached configuration
     */
    public ConfigHbBalanceDao(Configuration configuration) {
        super(ConfigHbBalance.CONFIG_HB_BALANCE, com.moseeker.baseorm.db.configdb.tables.pojos.ConfigHbBalance.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.configdb.tables.pojos.ConfigHbBalance object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.configdb.tables.pojos.ConfigHbBalance> fetchById(Integer... values) {
        return fetch(ConfigHbBalance.CONFIG_HB_BALANCE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.configdb.tables.pojos.ConfigHbBalance fetchOneById(Integer value) {
        return fetchOne(ConfigHbBalance.CONFIG_HB_BALANCE.ID, value);
    }

    /**
     * Fetch records that have <code>balance IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.configdb.tables.pojos.ConfigHbBalance> fetchByBalance(Integer... values) {
        return fetch(ConfigHbBalance.CONFIG_HB_BALANCE.BALANCE, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.configdb.tables.pojos.ConfigHbBalance> fetchByCreateTime(Timestamp... values) {
        return fetch(ConfigHbBalance.CONFIG_HB_BALANCE.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.configdb.tables.pojos.ConfigHbBalance> fetchByUpdateTime(Timestamp... values) {
        return fetch(ConfigHbBalance.CONFIG_HB_BALANCE.UPDATE_TIME, values);
    }
}
