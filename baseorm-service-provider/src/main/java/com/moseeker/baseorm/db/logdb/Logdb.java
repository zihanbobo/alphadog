/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.logdb;


import com.moseeker.baseorm.db.logdb.tables.LogCronjob;
import com.moseeker.baseorm.db.logdb.tables.LogDeadLetter;
import com.moseeker.baseorm.db.logdb.tables.LogEmailSendrecord;
import com.moseeker.baseorm.db.logdb.tables.LogHrOperationRecord;
import com.moseeker.baseorm.db.logdb.tables.LogHrloginRecord;
import com.moseeker.baseorm.db.logdb.tables.LogJbEmailparseRecord;
import com.moseeker.baseorm.db.logdb.tables.LogResumeRecord;
import com.moseeker.baseorm.db.logdb.tables.LogScraperRecord;
import com.moseeker.baseorm.db.logdb.tables.LogSmsSendrecord;
import com.moseeker.baseorm.db.logdb.tables.LogTalentpoolEmailDailyLog;
import com.moseeker.baseorm.db.logdb.tables.LogTalentpoolEmailLog;
import com.moseeker.baseorm.db.logdb.tables.LogTalentpoolProfileFilterLog;
import com.moseeker.baseorm.db.logdb.tables.LogWxMenuRecord;
import com.moseeker.baseorm.db.logdb.tables.LogWxMessageRecord;
import com.moseeker.baseorm.db.logdb.tables.LogWxTemplateMessageSendrecord;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Logdb extends SchemaImpl {

    private static final long serialVersionUID = 1929449227;

    /**
     * The reference instance of <code>logdb</code>
     */
    public static final Logdb LOGDB = new Logdb();

    /**
     * The table <code>logdb.log_cronjob</code>.
     */
    public final LogCronjob LOG_CRONJOB = com.moseeker.baseorm.db.logdb.tables.LogCronjob.LOG_CRONJOB;

    /**
     * 死信队列日志记录表
     */
    public final LogDeadLetter LOG_DEAD_LETTER = com.moseeker.baseorm.db.logdb.tables.LogDeadLetter.LOG_DEAD_LETTER;

    /**
     * 短信发送记录表
     */
    public final LogEmailSendrecord LOG_EMAIL_SENDRECORD = com.moseeker.baseorm.db.logdb.tables.LogEmailSendrecord.LOG_EMAIL_SENDRECORD;

    /**
     * hr每日登陆/使用统计表
     */
    public final LogHrloginRecord LOG_HRLOGIN_RECORD = com.moseeker.baseorm.db.logdb.tables.LogHrloginRecord.LOG_HRLOGIN_RECORD;

    /**
     * HR操作记录表
     */
    public final LogHrOperationRecord LOG_HR_OPERATION_RECORD = com.moseeker.baseorm.db.logdb.tables.LogHrOperationRecord.LOG_HR_OPERATION_RECORD;

    /**
     * 第三方简历回流email解析日志
     */
    public final LogJbEmailparseRecord LOG_JB_EMAILPARSE_RECORD = com.moseeker.baseorm.db.logdb.tables.LogJbEmailparseRecord.LOG_JB_EMAILPARSE_RECORD;

    /**
     * The table <code>logdb.log_resume_record</code>.
     */
    public final LogResumeRecord LOG_RESUME_RECORD = com.moseeker.baseorm.db.logdb.tables.LogResumeRecord.LOG_RESUME_RECORD;

    /**
     * c端导入日志明细表
     */
    public final LogScraperRecord LOG_SCRAPER_RECORD = com.moseeker.baseorm.db.logdb.tables.LogScraperRecord.LOG_SCRAPER_RECORD;

    /**
     * 短信发送记录表
     */
    public final LogSmsSendrecord LOG_SMS_SENDRECORD = com.moseeker.baseorm.db.logdb.tables.LogSmsSendrecord.LOG_SMS_SENDRECORD;

    /**
     * 邮件额度每天使用日志
     */
    public final LogTalentpoolEmailDailyLog LOG_TALENTPOOL_EMAIL_DAILY_LOG = com.moseeker.baseorm.db.logdb.tables.LogTalentpoolEmailDailyLog.LOG_TALENTPOOL_EMAIL_DAILY_LOG;

    /**
     * 邮件日志
     */
    public final LogTalentpoolEmailLog LOG_TALENTPOOL_EMAIL_LOG = com.moseeker.baseorm.db.logdb.tables.LogTalentpoolEmailLog.LOG_TALENTPOOL_EMAIL_LOG;

    /**
     * 人才库简历过滤日志
     */
    public final LogTalentpoolProfileFilterLog LOG_TALENTPOOL_PROFILE_FILTER_LOG = com.moseeker.baseorm.db.logdb.tables.LogTalentpoolProfileFilterLog.LOG_TALENTPOOL_PROFILE_FILTER_LOG;

    /**
     * 微信菜单操作日志表
     */
    public final LogWxMenuRecord LOG_WX_MENU_RECORD = com.moseeker.baseorm.db.logdb.tables.LogWxMenuRecord.LOG_WX_MENU_RECORD;

    /**
     * 模板消息发送结果记录表
     */
    public final LogWxMessageRecord LOG_WX_MESSAGE_RECORD = com.moseeker.baseorm.db.logdb.tables.LogWxMessageRecord.LOG_WX_MESSAGE_RECORD;

    /**
     * 模板消息发送结果记录
     */
    public final LogWxTemplateMessageSendrecord LOG_WX_TEMPLATE_MESSAGE_SENDRECORD = com.moseeker.baseorm.db.logdb.tables.LogWxTemplateMessageSendrecord.LOG_WX_TEMPLATE_MESSAGE_SENDRECORD;

    /**
     * No further instances allowed
     */
    private Logdb() {
        super("logdb", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            LogCronjob.LOG_CRONJOB,
            LogDeadLetter.LOG_DEAD_LETTER,
            LogEmailSendrecord.LOG_EMAIL_SENDRECORD,
            LogHrloginRecord.LOG_HRLOGIN_RECORD,
            LogHrOperationRecord.LOG_HR_OPERATION_RECORD,
            LogJbEmailparseRecord.LOG_JB_EMAILPARSE_RECORD,
            LogResumeRecord.LOG_RESUME_RECORD,
            LogScraperRecord.LOG_SCRAPER_RECORD,
            LogSmsSendrecord.LOG_SMS_SENDRECORD,
            LogTalentpoolEmailDailyLog.LOG_TALENTPOOL_EMAIL_DAILY_LOG,
            LogTalentpoolEmailLog.LOG_TALENTPOOL_EMAIL_LOG,
            LogTalentpoolProfileFilterLog.LOG_TALENTPOOL_PROFILE_FILTER_LOG,
            LogWxMenuRecord.LOG_WX_MENU_RECORD,
            LogWxMessageRecord.LOG_WX_MESSAGE_RECORD,
            LogWxTemplateMessageSendrecord.LOG_WX_TEMPLATE_MESSAGE_SENDRECORD);
    }
}
