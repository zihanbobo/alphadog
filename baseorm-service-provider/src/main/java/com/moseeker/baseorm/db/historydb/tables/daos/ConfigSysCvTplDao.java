/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.historydb.tables.daos;


import com.moseeker.baseorm.db.historydb.tables.ConfigSysCvTpl;
import com.moseeker.baseorm.db.historydb.tables.records.ConfigSysCvTplRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 简历模板库
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ConfigSysCvTplDao extends DAOImpl<ConfigSysCvTplRecord, com.moseeker.baseorm.db.historydb.tables.pojos.ConfigSysCvTpl, Integer> {

    /**
     * Create a new ConfigSysCvTplDao without any configuration
     */
    public ConfigSysCvTplDao() {
        super(ConfigSysCvTpl.CONFIG_SYS_CV_TPL, com.moseeker.baseorm.db.historydb.tables.pojos.ConfigSysCvTpl.class);
    }

    /**
     * Create a new ConfigSysCvTplDao with an attached configuration
     */
    public ConfigSysCvTplDao(Configuration configuration) {
        super(ConfigSysCvTpl.CONFIG_SYS_CV_TPL, com.moseeker.baseorm.db.historydb.tables.pojos.ConfigSysCvTpl.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.historydb.tables.pojos.ConfigSysCvTpl object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.ConfigSysCvTpl> fetchById(Integer... values) {
        return fetch(ConfigSysCvTpl.CONFIG_SYS_CV_TPL.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.historydb.tables.pojos.ConfigSysCvTpl fetchOneById(Integer value) {
        return fetchOne(ConfigSysCvTpl.CONFIG_SYS_CV_TPL.ID, value);
    }

    /**
     * Fetch records that have <code>field_name IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.ConfigSysCvTpl> fetchByFieldName(String... values) {
        return fetch(ConfigSysCvTpl.CONFIG_SYS_CV_TPL.FIELD_NAME, values);
    }

    /**
     * Fetch records that have <code>field_title IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.ConfigSysCvTpl> fetchByFieldTitle(String... values) {
        return fetch(ConfigSysCvTpl.CONFIG_SYS_CV_TPL.FIELD_TITLE, values);
    }

    /**
     * Fetch records that have <code>field_type IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.ConfigSysCvTpl> fetchByFieldType(Integer... values) {
        return fetch(ConfigSysCvTpl.CONFIG_SYS_CV_TPL.FIELD_TYPE, values);
    }

    /**
     * Fetch records that have <code>field_value IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.ConfigSysCvTpl> fetchByFieldValue(String... values) {
        return fetch(ConfigSysCvTpl.CONFIG_SYS_CV_TPL.FIELD_VALUE, values);
    }

    /**
     * Fetch records that have <code>priority IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.ConfigSysCvTpl> fetchByPriority(Integer... values) {
        return fetch(ConfigSysCvTpl.CONFIG_SYS_CV_TPL.PRIORITY, values);
    }

    /**
     * Fetch records that have <code>is_basic IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.ConfigSysCvTpl> fetchByIsBasic(Integer... values) {
        return fetch(ConfigSysCvTpl.CONFIG_SYS_CV_TPL.IS_BASIC, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.ConfigSysCvTpl> fetchByCreateTime(Timestamp... values) {
        return fetch(ConfigSysCvTpl.CONFIG_SYS_CV_TPL.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.ConfigSysCvTpl> fetchByUpdateTime(Timestamp... values) {
        return fetch(ConfigSysCvTpl.CONFIG_SYS_CV_TPL.UPDATE_TIME, values);
    }

    /**
     * Fetch records that have <code>disable IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.ConfigSysCvTpl> fetchByDisable(Integer... values) {
        return fetch(ConfigSysCvTpl.CONFIG_SYS_CV_TPL.DISABLE, values);
    }

    /**
     * Fetch records that have <code>company_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.ConfigSysCvTpl> fetchByCompanyId(Integer... values) {
        return fetch(ConfigSysCvTpl.CONFIG_SYS_CV_TPL.COMPANY_ID, values);
    }

    /**
     * Fetch records that have <code>required IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.ConfigSysCvTpl> fetchByRequired(Integer... values) {
        return fetch(ConfigSysCvTpl.CONFIG_SYS_CV_TPL.REQUIRED, values);
    }

    /**
     * Fetch records that have <code>field_description IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.ConfigSysCvTpl> fetchByFieldDescription(String... values) {
        return fetch(ConfigSysCvTpl.CONFIG_SYS_CV_TPL.FIELD_DESCRIPTION, values);
    }

    /**
     * Fetch records that have <code>map IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.ConfigSysCvTpl> fetchByMap(String... values) {
        return fetch(ConfigSysCvTpl.CONFIG_SYS_CV_TPL.MAP, values);
    }
}