/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.logdb.tables.daos;


import com.moseeker.baseorm.db.logdb.tables.LogWxWechatMenuDailyRecord;
import com.moseeker.baseorm.db.logdb.tables.records.LogWxWechatMenuDailyRecordRecord;

import java.sql.Date;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 每日微信公众号菜单数据, 脚本运行每天的已经微信公众号菜单数据
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LogWxWechatMenuDailyRecordDao extends DAOImpl<LogWxWechatMenuDailyRecordRecord, com.moseeker.baseorm.db.logdb.tables.pojos.LogWxWechatMenuDailyRecord, Integer> {

    /**
     * Create a new LogWxWechatMenuDailyRecordDao without any configuration
     */
    public LogWxWechatMenuDailyRecordDao() {
        super(LogWxWechatMenuDailyRecord.LOG_WX_WECHAT_MENU_DAILY_RECORD, com.moseeker.baseorm.db.logdb.tables.pojos.LogWxWechatMenuDailyRecord.class);
    }

    /**
     * Create a new LogWxWechatMenuDailyRecordDao with an attached configuration
     */
    public LogWxWechatMenuDailyRecordDao(Configuration configuration) {
        super(LogWxWechatMenuDailyRecord.LOG_WX_WECHAT_MENU_DAILY_RECORD, com.moseeker.baseorm.db.logdb.tables.pojos.LogWxWechatMenuDailyRecord.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.logdb.tables.pojos.LogWxWechatMenuDailyRecord object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.logdb.tables.pojos.LogWxWechatMenuDailyRecord> fetchById(Integer... values) {
        return fetch(LogWxWechatMenuDailyRecord.LOG_WX_WECHAT_MENU_DAILY_RECORD.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.logdb.tables.pojos.LogWxWechatMenuDailyRecord fetchOneById(Integer value) {
        return fetchOne(LogWxWechatMenuDailyRecord.LOG_WX_WECHAT_MENU_DAILY_RECORD.ID, value);
    }

    /**
     * Fetch records that have <code>wechat_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.logdb.tables.pojos.LogWxWechatMenuDailyRecord> fetchByWechatId(Integer... values) {
        return fetch(LogWxWechatMenuDailyRecord.LOG_WX_WECHAT_MENU_DAILY_RECORD.WECHAT_ID, values);
    }

    /**
     * Fetch records that have <code>company_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.logdb.tables.pojos.LogWxWechatMenuDailyRecord> fetchByCompanyId(Integer... values) {
        return fetch(LogWxWechatMenuDailyRecord.LOG_WX_WECHAT_MENU_DAILY_RECORD.COMPANY_ID, values);
    }

    /**
     * Fetch records that have <code>menu_json IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.logdb.tables.pojos.LogWxWechatMenuDailyRecord> fetchByMenuJson(String... values) {
        return fetch(LogWxWechatMenuDailyRecord.LOG_WX_WECHAT_MENU_DAILY_RECORD.MENU_JSON, values);
    }

    /**
     * Fetch records that have <code>create_date IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.logdb.tables.pojos.LogWxWechatMenuDailyRecord> fetchByCreateDate(Date... values) {
        return fetch(LogWxWechatMenuDailyRecord.LOG_WX_WECHAT_MENU_DAILY_RECORD.CREATE_DATE, values);
    }
}
