/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.daos;


import com.moseeker.baseorm.db.hrdb.tables.HrChannel;
import com.moseeker.baseorm.db.hrdb.tables.records.HrChannelRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 渠道表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrChannelDao extends DAOImpl<HrChannelRecord, com.moseeker.baseorm.db.hrdb.tables.pojos.HrChannel, Integer> {

    /**
     * Create a new HrChannelDao without any configuration
     */
    public HrChannelDao() {
        super(HrChannel.HR_CHANNEL, com.moseeker.baseorm.db.hrdb.tables.pojos.HrChannel.class);
    }

    /**
     * Create a new HrChannelDao with an attached configuration
     */
    public HrChannelDao(Configuration configuration) {
        super(HrChannel.HR_CHANNEL, com.moseeker.baseorm.db.hrdb.tables.pojos.HrChannel.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.hrdb.tables.pojos.HrChannel object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrChannel> fetchById(Integer... values) {
        return fetch(HrChannel.HR_CHANNEL.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.hrdb.tables.pojos.HrChannel fetchOneById(Integer value) {
        return fetchOne(HrChannel.HR_CHANNEL.ID, value);
    }

    /**
     * Fetch records that have <code>code IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrChannel> fetchByCode(String... values) {
        return fetch(HrChannel.HR_CHANNEL.CODE, values);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrChannel> fetchByName(String... values) {
        return fetch(HrChannel.HR_CHANNEL.NAME, values);
    }

    /**
     * Fetch records that have <code>category_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrChannel> fetchByCategoryId(Integer... values) {
        return fetch(HrChannel.HR_CHANNEL.CATEGORY_ID, values);
    }

    /**
     * Fetch records that have <code>attr IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrChannel> fetchByAttr(Byte... values) {
        return fetch(HrChannel.HR_CHANNEL.ATTR, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrChannel> fetchByStatus(Byte... values) {
        return fetch(HrChannel.HR_CHANNEL.STATUS, values);
    }

    /**
     * Fetch records that have <code>extra_show IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrChannel> fetchByExtraShow(String... values) {
        return fetch(HrChannel.HR_CHANNEL.EXTRA_SHOW, values);
    }

    /**
     * Fetch records that have <code>company_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrChannel> fetchByCompanyId(Integer... values) {
        return fetch(HrChannel.HR_CHANNEL.COMPANY_ID, values);
    }

    /**
     * Fetch records that have <code>cover IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrChannel> fetchByCover(Integer... values) {
        return fetch(HrChannel.HR_CHANNEL.COVER, values);
    }

    /**
     * Fetch records that have <code>sort IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrChannel> fetchBySort(Integer... values) {
        return fetch(HrChannel.HR_CHANNEL.SORT, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrChannel> fetchByCreateTime(Timestamp... values) {
        return fetch(HrChannel.HR_CHANNEL.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrChannel> fetchByUpdateTime(Timestamp... values) {
        return fetch(HrChannel.HR_CHANNEL.UPDATE_TIME, values);
    }
}
