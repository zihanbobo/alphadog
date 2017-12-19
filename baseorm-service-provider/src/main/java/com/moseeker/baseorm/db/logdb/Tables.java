/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.logdb;


import com.moseeker.baseorm.db.logdb.tables.LogCronjob;
import com.moseeker.baseorm.db.logdb.tables.LogEmailSendrecord;
import com.moseeker.baseorm.db.logdb.tables.LogHrOperationRecord;
import com.moseeker.baseorm.db.logdb.tables.LogResumeRecord;
import com.moseeker.baseorm.db.logdb.tables.LogSmsSendrecord;
import com.moseeker.baseorm.db.logdb.tables.LogWxMenuRecord;
import com.moseeker.baseorm.db.logdb.tables.LogWxMessageRecord;
import com.moseeker.baseorm.db.logdb.tables.LogWxTemplateMessageSendrecord;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in logdb
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>logdb.log_cronjob</code>.
     */
    public static final LogCronjob LOG_CRONJOB = com.moseeker.baseorm.db.logdb.tables.LogCronjob.LOG_CRONJOB;

    /**
     * 短信发送记录表
     */
    public static final LogEmailSendrecord LOG_EMAIL_SENDRECORD = com.moseeker.baseorm.db.logdb.tables.LogEmailSendrecord.LOG_EMAIL_SENDRECORD;

    /**
     * HR操作记录表
     */
    public static final LogHrOperationRecord LOG_HR_OPERATION_RECORD = com.moseeker.baseorm.db.logdb.tables.LogHrOperationRecord.LOG_HR_OPERATION_RECORD;

    /**
     * 简历解析日志
     */
    public static final LogResumeRecord LOG_RESUME_RECORD = com.moseeker.baseorm.db.logdb.tables.LogResumeRecord.LOG_RESUME_RECORD;

    /**
     * 短信发送记录表
     */
    public static final LogSmsSendrecord LOG_SMS_SENDRECORD = com.moseeker.baseorm.db.logdb.tables.LogSmsSendrecord.LOG_SMS_SENDRECORD;

    /**
     * 微信菜单操作日志表
     */
    public static final LogWxMenuRecord LOG_WX_MENU_RECORD = com.moseeker.baseorm.db.logdb.tables.LogWxMenuRecord.LOG_WX_MENU_RECORD;

    /**
     * 模板消息发送结果记录表
     */
    public static final LogWxMessageRecord LOG_WX_MESSAGE_RECORD = com.moseeker.baseorm.db.logdb.tables.LogWxMessageRecord.LOG_WX_MESSAGE_RECORD;

    /**
     * 模板消息发送结果记录
     */
    public static final LogWxTemplateMessageSendrecord LOG_WX_TEMPLATE_MESSAGE_SENDRECORD = com.moseeker.baseorm.db.logdb.tables.LogWxTemplateMessageSendrecord.LOG_WX_TEMPLATE_MESSAGE_SENDRECORD;
}
