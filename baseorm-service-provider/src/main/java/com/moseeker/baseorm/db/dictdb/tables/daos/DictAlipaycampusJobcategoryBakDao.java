/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.dictdb.tables.daos;


import com.moseeker.baseorm.db.dictdb.tables.DictAlipaycampusJobcategoryBak;
import com.moseeker.baseorm.db.dictdb.tables.records.DictAlipaycampusJobcategoryBakRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * job_category[校园工作-基础数据-职位类别]
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DictAlipaycampusJobcategoryBakDao extends DAOImpl<DictAlipaycampusJobcategoryBakRecord, com.moseeker.baseorm.db.dictdb.tables.pojos.DictAlipaycampusJobcategoryBak, Integer> {

    /**
     * Create a new DictAlipaycampusJobcategoryBakDao without any configuration
     */
    public DictAlipaycampusJobcategoryBakDao() {
        super(DictAlipaycampusJobcategoryBak.DICT_ALIPAYCAMPUS_JOBCATEGORY_BAK, com.moseeker.baseorm.db.dictdb.tables.pojos.DictAlipaycampusJobcategoryBak.class);
    }

    /**
     * Create a new DictAlipaycampusJobcategoryBakDao with an attached configuration
     */
    public DictAlipaycampusJobcategoryBakDao(Configuration configuration) {
        super(DictAlipaycampusJobcategoryBak.DICT_ALIPAYCAMPUS_JOBCATEGORY_BAK, com.moseeker.baseorm.db.dictdb.tables.pojos.DictAlipaycampusJobcategoryBak.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.dictdb.tables.pojos.DictAlipaycampusJobcategoryBak object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.dictdb.tables.pojos.DictAlipaycampusJobcategoryBak> fetchById(Integer... values) {
        return fetch(DictAlipaycampusJobcategoryBak.DICT_ALIPAYCAMPUS_JOBCATEGORY_BAK.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.dictdb.tables.pojos.DictAlipaycampusJobcategoryBak fetchOneById(Integer value) {
        return fetchOne(DictAlipaycampusJobcategoryBak.DICT_ALIPAYCAMPUS_JOBCATEGORY_BAK.ID, value);
    }

    /**
     * Fetch records that have <code>code IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.dictdb.tables.pojos.DictAlipaycampusJobcategoryBak> fetchByCode(String... values) {
        return fetch(DictAlipaycampusJobcategoryBak.DICT_ALIPAYCAMPUS_JOBCATEGORY_BAK.CODE, values);
    }

    /**
     * Fetch records that have <code>parent_code IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.dictdb.tables.pojos.DictAlipaycampusJobcategoryBak> fetchByParentCode(String... values) {
        return fetch(DictAlipaycampusJobcategoryBak.DICT_ALIPAYCAMPUS_JOBCATEGORY_BAK.PARENT_CODE, values);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.dictdb.tables.pojos.DictAlipaycampusJobcategoryBak> fetchByName(String... values) {
        return fetch(DictAlipaycampusJobcategoryBak.DICT_ALIPAYCAMPUS_JOBCATEGORY_BAK.NAME, values);
    }

    /**
     * Fetch records that have <code>level IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.dictdb.tables.pojos.DictAlipaycampusJobcategoryBak> fetchByLevel(Integer... values) {
        return fetch(DictAlipaycampusJobcategoryBak.DICT_ALIPAYCAMPUS_JOBCATEGORY_BAK.LEVEL, values);
    }

    /**
     * Fetch records that have <code>is_hot IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.dictdb.tables.pojos.DictAlipaycampusJobcategoryBak> fetchByIsHot(Integer... values) {
        return fetch(DictAlipaycampusJobcategoryBak.DICT_ALIPAYCAMPUS_JOBCATEGORY_BAK.IS_HOT, values);
    }

    /**
     * Fetch records that have <code>sort IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.dictdb.tables.pojos.DictAlipaycampusJobcategoryBak> fetchBySort(Integer... values) {
        return fetch(DictAlipaycampusJobcategoryBak.DICT_ALIPAYCAMPUS_JOBCATEGORY_BAK.SORT, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.dictdb.tables.pojos.DictAlipaycampusJobcategoryBak> fetchByStatus(Integer... values) {
        return fetch(DictAlipaycampusJobcategoryBak.DICT_ALIPAYCAMPUS_JOBCATEGORY_BAK.STATUS, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.dictdb.tables.pojos.DictAlipaycampusJobcategoryBak> fetchByCreateTime(Timestamp... values) {
        return fetch(DictAlipaycampusJobcategoryBak.DICT_ALIPAYCAMPUS_JOBCATEGORY_BAK.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.dictdb.tables.pojos.DictAlipaycampusJobcategoryBak> fetchByUpdateTime(Timestamp... values) {
        return fetch(DictAlipaycampusJobcategoryBak.DICT_ALIPAYCAMPUS_JOBCATEGORY_BAK.UPDATE_TIME, values);
    }
}