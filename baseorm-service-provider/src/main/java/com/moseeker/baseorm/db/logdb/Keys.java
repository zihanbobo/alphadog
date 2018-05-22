/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.logdb;


import com.moseeker.baseorm.db.logdb.tables.LogAiRecom;
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
import com.moseeker.baseorm.db.logdb.tables.records.LogAiRecomRecord;
import com.moseeker.baseorm.db.logdb.tables.records.LogCronjobRecord;
import com.moseeker.baseorm.db.logdb.tables.records.LogDeadLetterRecord;
import com.moseeker.baseorm.db.logdb.tables.records.LogEmailSendrecordRecord;
import com.moseeker.baseorm.db.logdb.tables.records.LogHrOperationRecordRecord;
import com.moseeker.baseorm.db.logdb.tables.records.LogHrloginRecordRecord;
import com.moseeker.baseorm.db.logdb.tables.records.LogJbEmailparseRecordRecord;
import com.moseeker.baseorm.db.logdb.tables.records.LogResumeRecordRecord;
import com.moseeker.baseorm.db.logdb.tables.records.LogScraperRecordRecord;
import com.moseeker.baseorm.db.logdb.tables.records.LogSmsSendrecordRecord;
import com.moseeker.baseorm.db.logdb.tables.records.LogTalentpoolEmailDailyLogRecord;
import com.moseeker.baseorm.db.logdb.tables.records.LogTalentpoolEmailLogRecord;
import com.moseeker.baseorm.db.logdb.tables.records.LogTalentpoolProfileFilterLogRecord;
import com.moseeker.baseorm.db.logdb.tables.records.LogWxMenuRecordRecord;
import com.moseeker.baseorm.db.logdb.tables.records.LogWxMessageRecordRecord;
import com.moseeker.baseorm.db.logdb.tables.records.LogWxTemplateMessageSendrecordRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>logdb</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<LogAiRecomRecord, Integer> IDENTITY_LOG_AI_RECOM = Identities0.IDENTITY_LOG_AI_RECOM;
    public static final Identity<LogCronjobRecord, Integer> IDENTITY_LOG_CRONJOB = Identities0.IDENTITY_LOG_CRONJOB;
    public static final Identity<LogDeadLetterRecord, Integer> IDENTITY_LOG_DEAD_LETTER = Identities0.IDENTITY_LOG_DEAD_LETTER;
    public static final Identity<LogEmailSendrecordRecord, Integer> IDENTITY_LOG_EMAIL_SENDRECORD = Identities0.IDENTITY_LOG_EMAIL_SENDRECORD;
    public static final Identity<LogHrloginRecordRecord, Integer> IDENTITY_LOG_HRLOGIN_RECORD = Identities0.IDENTITY_LOG_HRLOGIN_RECORD;
    public static final Identity<LogHrOperationRecordRecord, Integer> IDENTITY_LOG_HR_OPERATION_RECORD = Identities0.IDENTITY_LOG_HR_OPERATION_RECORD;
    public static final Identity<LogJbEmailparseRecordRecord, Integer> IDENTITY_LOG_JB_EMAILPARSE_RECORD = Identities0.IDENTITY_LOG_JB_EMAILPARSE_RECORD;
    public static final Identity<LogResumeRecordRecord, Integer> IDENTITY_LOG_RESUME_RECORD = Identities0.IDENTITY_LOG_RESUME_RECORD;
    public static final Identity<LogScraperRecordRecord, Integer> IDENTITY_LOG_SCRAPER_RECORD = Identities0.IDENTITY_LOG_SCRAPER_RECORD;
    public static final Identity<LogSmsSendrecordRecord, Integer> IDENTITY_LOG_SMS_SENDRECORD = Identities0.IDENTITY_LOG_SMS_SENDRECORD;
    public static final Identity<LogTalentpoolEmailDailyLogRecord, Integer> IDENTITY_LOG_TALENTPOOL_EMAIL_DAILY_LOG = Identities0.IDENTITY_LOG_TALENTPOOL_EMAIL_DAILY_LOG;
    public static final Identity<LogTalentpoolEmailLogRecord, Integer> IDENTITY_LOG_TALENTPOOL_EMAIL_LOG = Identities0.IDENTITY_LOG_TALENTPOOL_EMAIL_LOG;
    public static final Identity<LogTalentpoolProfileFilterLogRecord, Integer> IDENTITY_LOG_TALENTPOOL_PROFILE_FILTER_LOG = Identities0.IDENTITY_LOG_TALENTPOOL_PROFILE_FILTER_LOG;
    public static final Identity<LogWxMenuRecordRecord, Integer> IDENTITY_LOG_WX_MENU_RECORD = Identities0.IDENTITY_LOG_WX_MENU_RECORD;
    public static final Identity<LogWxMessageRecordRecord, Integer> IDENTITY_LOG_WX_MESSAGE_RECORD = Identities0.IDENTITY_LOG_WX_MESSAGE_RECORD;
    public static final Identity<LogWxTemplateMessageSendrecordRecord, Integer> IDENTITY_LOG_WX_TEMPLATE_MESSAGE_SENDRECORD = Identities0.IDENTITY_LOG_WX_TEMPLATE_MESSAGE_SENDRECORD;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<LogAiRecomRecord> KEY_LOG_AI_RECOM_PRIMARY = UniqueKeys0.KEY_LOG_AI_RECOM_PRIMARY;
    public static final UniqueKey<LogAiRecomRecord> KEY_LOG_AI_RECOM_LOG_AI_RECOM_ID_UINDEX = UniqueKeys0.KEY_LOG_AI_RECOM_LOG_AI_RECOM_ID_UINDEX;
    public static final UniqueKey<LogCronjobRecord> KEY_LOG_CRONJOB_PRIMARY = UniqueKeys0.KEY_LOG_CRONJOB_PRIMARY;
    public static final UniqueKey<LogDeadLetterRecord> KEY_LOG_DEAD_LETTER_PRIMARY = UniqueKeys0.KEY_LOG_DEAD_LETTER_PRIMARY;
    public static final UniqueKey<LogEmailSendrecordRecord> KEY_LOG_EMAIL_SENDRECORD_PRIMARY = UniqueKeys0.KEY_LOG_EMAIL_SENDRECORD_PRIMARY;
    public static final UniqueKey<LogHrloginRecordRecord> KEY_LOG_HRLOGIN_RECORD_PRIMARY = UniqueKeys0.KEY_LOG_HRLOGIN_RECORD_PRIMARY;
    public static final UniqueKey<LogHrloginRecordRecord> KEY_LOG_HRLOGIN_RECORD_HR_ID = UniqueKeys0.KEY_LOG_HRLOGIN_RECORD_HR_ID;
    public static final UniqueKey<LogHrOperationRecordRecord> KEY_LOG_HR_OPERATION_RECORD_PRIMARY = UniqueKeys0.KEY_LOG_HR_OPERATION_RECORD_PRIMARY;
    public static final UniqueKey<LogJbEmailparseRecordRecord> KEY_LOG_JB_EMAILPARSE_RECORD_PRIMARY = UniqueKeys0.KEY_LOG_JB_EMAILPARSE_RECORD_PRIMARY;
    public static final UniqueKey<LogResumeRecordRecord> KEY_LOG_RESUME_RECORD_PRIMARY = UniqueKeys0.KEY_LOG_RESUME_RECORD_PRIMARY;
    public static final UniqueKey<LogScraperRecordRecord> KEY_LOG_SCRAPER_RECORD_PRIMARY = UniqueKeys0.KEY_LOG_SCRAPER_RECORD_PRIMARY;
    public static final UniqueKey<LogSmsSendrecordRecord> KEY_LOG_SMS_SENDRECORD_PRIMARY = UniqueKeys0.KEY_LOG_SMS_SENDRECORD_PRIMARY;
    public static final UniqueKey<LogTalentpoolEmailDailyLogRecord> KEY_LOG_TALENTPOOL_EMAIL_DAILY_LOG_PRIMARY = UniqueKeys0.KEY_LOG_TALENTPOOL_EMAIL_DAILY_LOG_PRIMARY;
    public static final UniqueKey<LogTalentpoolEmailDailyLogRecord> KEY_LOG_TALENTPOOL_EMAIL_DAILY_LOG_LOG_TALENTPOOL_EMAIL_DAILY_LOG_DAILY_UNIQUE = UniqueKeys0.KEY_LOG_TALENTPOOL_EMAIL_DAILY_LOG_LOG_TALENTPOOL_EMAIL_DAILY_LOG_DAILY_UNIQUE;
    public static final UniqueKey<LogTalentpoolEmailLogRecord> KEY_LOG_TALENTPOOL_EMAIL_LOG_PRIMARY = UniqueKeys0.KEY_LOG_TALENTPOOL_EMAIL_LOG_PRIMARY;
    public static final UniqueKey<LogTalentpoolProfileFilterLogRecord> KEY_LOG_TALENTPOOL_PROFILE_FILTER_LOG_PRIMARY = UniqueKeys0.KEY_LOG_TALENTPOOL_PROFILE_FILTER_LOG_PRIMARY;
    public static final UniqueKey<LogWxMenuRecordRecord> KEY_LOG_WX_MENU_RECORD_PRIMARY = UniqueKeys0.KEY_LOG_WX_MENU_RECORD_PRIMARY;
    public static final UniqueKey<LogWxMessageRecordRecord> KEY_LOG_WX_MESSAGE_RECORD_PRIMARY = UniqueKeys0.KEY_LOG_WX_MESSAGE_RECORD_PRIMARY;
    public static final UniqueKey<LogWxTemplateMessageSendrecordRecord> KEY_LOG_WX_TEMPLATE_MESSAGE_SENDRECORD_PRIMARY = UniqueKeys0.KEY_LOG_WX_TEMPLATE_MESSAGE_SENDRECORD_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<LogAiRecomRecord, Integer> IDENTITY_LOG_AI_RECOM = createIdentity(LogAiRecom.LOG_AI_RECOM, LogAiRecom.LOG_AI_RECOM.ID);
        public static Identity<LogCronjobRecord, Integer> IDENTITY_LOG_CRONJOB = createIdentity(LogCronjob.LOG_CRONJOB, LogCronjob.LOG_CRONJOB.ID);
        public static Identity<LogDeadLetterRecord, Integer> IDENTITY_LOG_DEAD_LETTER = createIdentity(LogDeadLetter.LOG_DEAD_LETTER, LogDeadLetter.LOG_DEAD_LETTER.ID);
        public static Identity<LogEmailSendrecordRecord, Integer> IDENTITY_LOG_EMAIL_SENDRECORD = createIdentity(LogEmailSendrecord.LOG_EMAIL_SENDRECORD, LogEmailSendrecord.LOG_EMAIL_SENDRECORD.ID);
        public static Identity<LogHrloginRecordRecord, Integer> IDENTITY_LOG_HRLOGIN_RECORD = createIdentity(LogHrloginRecord.LOG_HRLOGIN_RECORD, LogHrloginRecord.LOG_HRLOGIN_RECORD.ID);
        public static Identity<LogHrOperationRecordRecord, Integer> IDENTITY_LOG_HR_OPERATION_RECORD = createIdentity(LogHrOperationRecord.LOG_HR_OPERATION_RECORD, LogHrOperationRecord.LOG_HR_OPERATION_RECORD.ID);
        public static Identity<LogJbEmailparseRecordRecord, Integer> IDENTITY_LOG_JB_EMAILPARSE_RECORD = createIdentity(LogJbEmailparseRecord.LOG_JB_EMAILPARSE_RECORD, LogJbEmailparseRecord.LOG_JB_EMAILPARSE_RECORD.ID);
        public static Identity<LogResumeRecordRecord, Integer> IDENTITY_LOG_RESUME_RECORD = createIdentity(LogResumeRecord.LOG_RESUME_RECORD, LogResumeRecord.LOG_RESUME_RECORD.ID);
        public static Identity<LogScraperRecordRecord, Integer> IDENTITY_LOG_SCRAPER_RECORD = createIdentity(LogScraperRecord.LOG_SCRAPER_RECORD, LogScraperRecord.LOG_SCRAPER_RECORD.ID);
        public static Identity<LogSmsSendrecordRecord, Integer> IDENTITY_LOG_SMS_SENDRECORD = createIdentity(LogSmsSendrecord.LOG_SMS_SENDRECORD, LogSmsSendrecord.LOG_SMS_SENDRECORD.ID);
        public static Identity<LogTalentpoolEmailDailyLogRecord, Integer> IDENTITY_LOG_TALENTPOOL_EMAIL_DAILY_LOG = createIdentity(LogTalentpoolEmailDailyLog.LOG_TALENTPOOL_EMAIL_DAILY_LOG, LogTalentpoolEmailDailyLog.LOG_TALENTPOOL_EMAIL_DAILY_LOG.ID);
        public static Identity<LogTalentpoolEmailLogRecord, Integer> IDENTITY_LOG_TALENTPOOL_EMAIL_LOG = createIdentity(LogTalentpoolEmailLog.LOG_TALENTPOOL_EMAIL_LOG, LogTalentpoolEmailLog.LOG_TALENTPOOL_EMAIL_LOG.ID);
        public static Identity<LogTalentpoolProfileFilterLogRecord, Integer> IDENTITY_LOG_TALENTPOOL_PROFILE_FILTER_LOG = createIdentity(LogTalentpoolProfileFilterLog.LOG_TALENTPOOL_PROFILE_FILTER_LOG, LogTalentpoolProfileFilterLog.LOG_TALENTPOOL_PROFILE_FILTER_LOG.ID);
        public static Identity<LogWxMenuRecordRecord, Integer> IDENTITY_LOG_WX_MENU_RECORD = createIdentity(LogWxMenuRecord.LOG_WX_MENU_RECORD, LogWxMenuRecord.LOG_WX_MENU_RECORD.ID);
        public static Identity<LogWxMessageRecordRecord, Integer> IDENTITY_LOG_WX_MESSAGE_RECORD = createIdentity(LogWxMessageRecord.LOG_WX_MESSAGE_RECORD, LogWxMessageRecord.LOG_WX_MESSAGE_RECORD.ID);
        public static Identity<LogWxTemplateMessageSendrecordRecord, Integer> IDENTITY_LOG_WX_TEMPLATE_MESSAGE_SENDRECORD = createIdentity(LogWxTemplateMessageSendrecord.LOG_WX_TEMPLATE_MESSAGE_SENDRECORD, LogWxTemplateMessageSendrecord.LOG_WX_TEMPLATE_MESSAGE_SENDRECORD.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<LogAiRecomRecord> KEY_LOG_AI_RECOM_PRIMARY = createUniqueKey(LogAiRecom.LOG_AI_RECOM, "KEY_log_ai_recom_PRIMARY", LogAiRecom.LOG_AI_RECOM.ID);
        public static final UniqueKey<LogAiRecomRecord> KEY_LOG_AI_RECOM_LOG_AI_RECOM_ID_UINDEX = createUniqueKey(LogAiRecom.LOG_AI_RECOM, "KEY_log_ai_recom_log_ai_recom_id_uindex", LogAiRecom.LOG_AI_RECOM.ID);
        public static final UniqueKey<LogCronjobRecord> KEY_LOG_CRONJOB_PRIMARY = createUniqueKey(LogCronjob.LOG_CRONJOB, "KEY_log_cronjob_PRIMARY", LogCronjob.LOG_CRONJOB.ID);
        public static final UniqueKey<LogDeadLetterRecord> KEY_LOG_DEAD_LETTER_PRIMARY = createUniqueKey(LogDeadLetter.LOG_DEAD_LETTER, "KEY_log_dead_letter_PRIMARY", LogDeadLetter.LOG_DEAD_LETTER.ID);
        public static final UniqueKey<LogEmailSendrecordRecord> KEY_LOG_EMAIL_SENDRECORD_PRIMARY = createUniqueKey(LogEmailSendrecord.LOG_EMAIL_SENDRECORD, "KEY_log_email_sendrecord_PRIMARY", LogEmailSendrecord.LOG_EMAIL_SENDRECORD.ID);
        public static final UniqueKey<LogHrloginRecordRecord> KEY_LOG_HRLOGIN_RECORD_PRIMARY = createUniqueKey(LogHrloginRecord.LOG_HRLOGIN_RECORD, "KEY_log_hrlogin_record_PRIMARY", LogHrloginRecord.LOG_HRLOGIN_RECORD.ID);
        public static final UniqueKey<LogHrloginRecordRecord> KEY_LOG_HRLOGIN_RECORD_HR_ID = createUniqueKey(LogHrloginRecord.LOG_HRLOGIN_RECORD, "KEY_log_hrlogin_record_hr_id", LogHrloginRecord.LOG_HRLOGIN_RECORD.HR_ID, LogHrloginRecord.LOG_HRLOGIN_RECORD.LOGIN_DATE);
        public static final UniqueKey<LogHrOperationRecordRecord> KEY_LOG_HR_OPERATION_RECORD_PRIMARY = createUniqueKey(LogHrOperationRecord.LOG_HR_OPERATION_RECORD, "KEY_log_hr_operation_record_PRIMARY", LogHrOperationRecord.LOG_HR_OPERATION_RECORD.ID);
        public static final UniqueKey<LogJbEmailparseRecordRecord> KEY_LOG_JB_EMAILPARSE_RECORD_PRIMARY = createUniqueKey(LogJbEmailparseRecord.LOG_JB_EMAILPARSE_RECORD, "KEY_log_jb_emailparse_record_PRIMARY", LogJbEmailparseRecord.LOG_JB_EMAILPARSE_RECORD.ID);
        public static final UniqueKey<LogResumeRecordRecord> KEY_LOG_RESUME_RECORD_PRIMARY = createUniqueKey(LogResumeRecord.LOG_RESUME_RECORD, "KEY_log_resume_record_PRIMARY", LogResumeRecord.LOG_RESUME_RECORD.ID);
        public static final UniqueKey<LogScraperRecordRecord> KEY_LOG_SCRAPER_RECORD_PRIMARY = createUniqueKey(LogScraperRecord.LOG_SCRAPER_RECORD, "KEY_log_scraper_record_PRIMARY", LogScraperRecord.LOG_SCRAPER_RECORD.ID);
        public static final UniqueKey<LogSmsSendrecordRecord> KEY_LOG_SMS_SENDRECORD_PRIMARY = createUniqueKey(LogSmsSendrecord.LOG_SMS_SENDRECORD, "KEY_log_sms_sendrecord_PRIMARY", LogSmsSendrecord.LOG_SMS_SENDRECORD.ID);
        public static final UniqueKey<LogTalentpoolEmailDailyLogRecord> KEY_LOG_TALENTPOOL_EMAIL_DAILY_LOG_PRIMARY = createUniqueKey(LogTalentpoolEmailDailyLog.LOG_TALENTPOOL_EMAIL_DAILY_LOG, "KEY_log_talentpool_email_daily_log_PRIMARY", LogTalentpoolEmailDailyLog.LOG_TALENTPOOL_EMAIL_DAILY_LOG.ID);
        public static final UniqueKey<LogTalentpoolEmailDailyLogRecord> KEY_LOG_TALENTPOOL_EMAIL_DAILY_LOG_LOG_TALENTPOOL_EMAIL_DAILY_LOG_DAILY_UNIQUE = createUniqueKey(LogTalentpoolEmailDailyLog.LOG_TALENTPOOL_EMAIL_DAILY_LOG, "KEY_log_talentpool_email_daily_log_log_talentpool_email_daily_log_daily_unique", LogTalentpoolEmailDailyLog.LOG_TALENTPOOL_EMAIL_DAILY_LOG.COMPANY_ID, LogTalentpoolEmailDailyLog.LOG_TALENTPOOL_EMAIL_DAILY_LOG.DATE);
        public static final UniqueKey<LogTalentpoolEmailLogRecord> KEY_LOG_TALENTPOOL_EMAIL_LOG_PRIMARY = createUniqueKey(LogTalentpoolEmailLog.LOG_TALENTPOOL_EMAIL_LOG, "KEY_log_talentpool_email_log_PRIMARY", LogTalentpoolEmailLog.LOG_TALENTPOOL_EMAIL_LOG.ID);
        public static final UniqueKey<LogTalentpoolProfileFilterLogRecord> KEY_LOG_TALENTPOOL_PROFILE_FILTER_LOG_PRIMARY = createUniqueKey(LogTalentpoolProfileFilterLog.LOG_TALENTPOOL_PROFILE_FILTER_LOG, "KEY_log_talentpool_profile_filter_log_PRIMARY", LogTalentpoolProfileFilterLog.LOG_TALENTPOOL_PROFILE_FILTER_LOG.ID);
        public static final UniqueKey<LogWxMenuRecordRecord> KEY_LOG_WX_MENU_RECORD_PRIMARY = createUniqueKey(LogWxMenuRecord.LOG_WX_MENU_RECORD, "KEY_log_wx_menu_record_PRIMARY", LogWxMenuRecord.LOG_WX_MENU_RECORD.ID);
        public static final UniqueKey<LogWxMessageRecordRecord> KEY_LOG_WX_MESSAGE_RECORD_PRIMARY = createUniqueKey(LogWxMessageRecord.LOG_WX_MESSAGE_RECORD, "KEY_log_wx_message_record_PRIMARY", LogWxMessageRecord.LOG_WX_MESSAGE_RECORD.ID);
        public static final UniqueKey<LogWxTemplateMessageSendrecordRecord> KEY_LOG_WX_TEMPLATE_MESSAGE_SENDRECORD_PRIMARY = createUniqueKey(LogWxTemplateMessageSendrecord.LOG_WX_TEMPLATE_MESSAGE_SENDRECORD, "KEY_log_wx_template_message_sendrecord_PRIMARY", LogWxTemplateMessageSendrecord.LOG_WX_TEMPLATE_MESSAGE_SENDRECORD.ID);
    }
}
