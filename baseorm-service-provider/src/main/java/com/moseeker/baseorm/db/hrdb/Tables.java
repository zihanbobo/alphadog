/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb;


import com.moseeker.baseorm.db.hrdb.tables.HrAccountApplicationNotify;
import com.moseeker.baseorm.db.hrdb.tables.HrAiConf;
import com.moseeker.baseorm.db.hrdb.tables.HrAppCvConf;
import com.moseeker.baseorm.db.hrdb.tables.HrAppExportFields;
import com.moseeker.baseorm.db.hrdb.tables.HrAtsApplicationRecommend;
import com.moseeker.baseorm.db.hrdb.tables.HrAtsApplicationShowField;
import com.moseeker.baseorm.db.hrdb.tables.HrAtsLastOperationRecord;
import com.moseeker.baseorm.db.hrdb.tables.HrAtsPhaseBase;
import com.moseeker.baseorm.db.hrdb.tables.HrAtsPhaseBaseEvent;
import com.moseeker.baseorm.db.hrdb.tables.HrAtsPhaseBaseItem;
import com.moseeker.baseorm.db.hrdb.tables.HrAtsPhaseEvent;
import com.moseeker.baseorm.db.hrdb.tables.HrAtsPhaseEventItems;
import com.moseeker.baseorm.db.hrdb.tables.HrAtsProcessCompany;
import com.moseeker.baseorm.db.hrdb.tables.HrAtsProcessCompanyItem;
import com.moseeker.baseorm.db.hrdb.tables.HrAtsProcessNewRecord;
import com.moseeker.baseorm.db.hrdb.tables.HrChatUnreadCount;
import com.moseeker.baseorm.db.hrdb.tables.HrCmsMedia;
import com.moseeker.baseorm.db.hrdb.tables.HrCmsModule;
import com.moseeker.baseorm.db.hrdb.tables.HrCmsPages;
import com.moseeker.baseorm.db.hrdb.tables.HrCompany;
import com.moseeker.baseorm.db.hrdb.tables.HrCompanyAccount;
import com.moseeker.baseorm.db.hrdb.tables.HrCompanyConf;
import com.moseeker.baseorm.db.hrdb.tables.HrCompanyCs;
import com.moseeker.baseorm.db.hrdb.tables.HrCompanyEmailInfo;
import com.moseeker.baseorm.db.hrdb.tables.HrCompanyFeature;
import com.moseeker.baseorm.db.hrdb.tables.HrCompanyRecruitProcess;
import com.moseeker.baseorm.db.hrdb.tables.HrCompanyRecruitProcessItems;
import com.moseeker.baseorm.db.hrdb.tables.HrCompanyReferralConf;
import com.moseeker.baseorm.db.hrdb.tables.HrCompanyWorkwxConf;
import com.moseeker.baseorm.db.hrdb.tables.HrDashboardConfig;
import com.moseeker.baseorm.db.hrdb.tables.HrEmployeeCertConf;
import com.moseeker.baseorm.db.hrdb.tables.HrEmployeeCustomFields;
import com.moseeker.baseorm.db.hrdb.tables.HrEmployeePosition;
import com.moseeker.baseorm.db.hrdb.tables.HrEmployeeSection;
import com.moseeker.baseorm.db.hrdb.tables.HrFeedback;
import com.moseeker.baseorm.db.hrdb.tables.HrGroupCompany;
import com.moseeker.baseorm.db.hrdb.tables.HrGroupCompanyRel;
import com.moseeker.baseorm.db.hrdb.tables.HrHbConfig;
import com.moseeker.baseorm.db.hrdb.tables.HrHbItems;
import com.moseeker.baseorm.db.hrdb.tables.HrHbItemsBackupChendi_180625;
import com.moseeker.baseorm.db.hrdb.tables.HrHbPositionBinding;
import com.moseeker.baseorm.db.hrdb.tables.HrHbScratchCard;
import com.moseeker.baseorm.db.hrdb.tables.HrHbSendRecord;
import com.moseeker.baseorm.db.hrdb.tables.HrHbTheme;
import com.moseeker.baseorm.db.hrdb.tables.HrHeadhunterAccount;
import com.moseeker.baseorm.db.hrdb.tables.HrHeadhunterCandidate;
import com.moseeker.baseorm.db.hrdb.tables.HrHeadhunterCompany;
import com.moseeker.baseorm.db.hrdb.tables.HrHeadhunterJob;
import com.moseeker.baseorm.db.hrdb.tables.HrHeadhunterOmsConf;
import com.moseeker.baseorm.db.hrdb.tables.HrHeadhunterProfile;
import com.moseeker.baseorm.db.hrdb.tables.HrHtml5Statistics;
import com.moseeker.baseorm.db.hrdb.tables.HrHtml5UniqueStatistics;
import com.moseeker.baseorm.db.hrdb.tables.HrImporterMonitor;
import com.moseeker.baseorm.db.hrdb.tables.HrInterviewAddress;
import com.moseeker.baseorm.db.hrdb.tables.HrInterviewConcrete;
import com.moseeker.baseorm.db.hrdb.tables.HrInterviewFeedbackResultAnswerSheet;
import com.moseeker.baseorm.db.hrdb.tables.HrInterviewFeedbackResultItemAnswer;
import com.moseeker.baseorm.db.hrdb.tables.HrInterviewFeedbackTemplate;
import com.moseeker.baseorm.db.hrdb.tables.HrInterviewFeedbackTemplateItem;
import com.moseeker.baseorm.db.hrdb.tables.HrInterviewFeedbackTemplateItemOption;
import com.moseeker.baseorm.db.hrdb.tables.HrInterviewNotice;
import com.moseeker.baseorm.db.hrdb.tables.HrInterviewProcess;
import com.moseeker.baseorm.db.hrdb.tables.HrInterviewProcessRound;
import com.moseeker.baseorm.db.hrdb.tables.HrLeaderBoard;
import com.moseeker.baseorm.db.hrdb.tables.HrNps;
import com.moseeker.baseorm.db.hrdb.tables.HrNpsRecommend;
import com.moseeker.baseorm.db.hrdb.tables.HrOperationAllRecord;
import com.moseeker.baseorm.db.hrdb.tables.HrOperationRecord;
import com.moseeker.baseorm.db.hrdb.tables.HrPointsConf;
import com.moseeker.baseorm.db.hrdb.tables.HrRecruitStatistics;
import com.moseeker.baseorm.db.hrdb.tables.HrRecruitUniqueStatistics;
import com.moseeker.baseorm.db.hrdb.tables.HrReferralStatistics;
import com.moseeker.baseorm.db.hrdb.tables.HrResource;
import com.moseeker.baseorm.db.hrdb.tables.HrRuleStatistics;
import com.moseeker.baseorm.db.hrdb.tables.HrRuleUniqueStatistics;
import com.moseeker.baseorm.db.hrdb.tables.HrSearchCondition;
import com.moseeker.baseorm.db.hrdb.tables.HrSuperaccountApply;
import com.moseeker.baseorm.db.hrdb.tables.HrTalentpool;
import com.moseeker.baseorm.db.hrdb.tables.HrTeam;
import com.moseeker.baseorm.db.hrdb.tables.HrTeamMember;
import com.moseeker.baseorm.db.hrdb.tables.HrTeam_20180118Chendi;
import com.moseeker.baseorm.db.hrdb.tables.HrThirdPartyAccount;
import com.moseeker.baseorm.db.hrdb.tables.HrThirdPartyAccountHr;
import com.moseeker.baseorm.db.hrdb.tables.HrThirdPartyPosition;
import com.moseeker.baseorm.db.hrdb.tables.HrTopic;
import com.moseeker.baseorm.db.hrdb.tables.HrWxBasicReply;
import com.moseeker.baseorm.db.hrdb.tables.HrWxHrChat;
import com.moseeker.baseorm.db.hrdb.tables.HrWxHrChatList;
import com.moseeker.baseorm.db.hrdb.tables.HrWxHrChatVoice;
import com.moseeker.baseorm.db.hrdb.tables.HrWxImageReply;
import com.moseeker.baseorm.db.hrdb.tables.HrWxModule;
import com.moseeker.baseorm.db.hrdb.tables.HrWxNewsReply;
import com.moseeker.baseorm.db.hrdb.tables.HrWxNoticeMessage;
import com.moseeker.baseorm.db.hrdb.tables.HrWxRule;
import com.moseeker.baseorm.db.hrdb.tables.HrWxTemplateMessage;
import com.moseeker.baseorm.db.hrdb.tables.HrWxWechat;
import com.moseeker.baseorm.db.hrdb.tables.HrWxWechatNoticeSyncStatus;
import com.moseeker.baseorm.db.hrdb.tables.HrWxWechatQrcode;
import com.moseeker.baseorm.db.hrdb.tables.HrWxWechat_20180127chendi;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in hrdb
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>hrdb.hr_account_application_notify</code>.
     */
    public static final HrAccountApplicationNotify HR_ACCOUNT_APPLICATION_NOTIFY = com.moseeker.baseorm.db.hrdb.tables.HrAccountApplicationNotify.HR_ACCOUNT_APPLICATION_NOTIFY;

    /**
     * 人工智能系统配置表
     */
    public static final HrAiConf HR_AI_CONF = com.moseeker.baseorm.db.hrdb.tables.HrAiConf.HR_AI_CONF;

    /**
     * 企业申请简历校验配置
     */
    public static final HrAppCvConf HR_APP_CV_CONF = com.moseeker.baseorm.db.hrdb.tables.HrAppCvConf.HR_APP_CV_CONF;

    /**
     * 自定义简历模板导出字段表
     */
    public static final HrAppExportFields HR_APP_EXPORT_FIELDS = com.moseeker.baseorm.db.hrdb.tables.HrAppExportFields.HR_APP_EXPORT_FIELDS;

    /**
     * HR推荐给用人部门做初筛的基表
     */
    public static final HrAtsApplicationRecommend HR_ATS_APPLICATION_RECOMMEND = com.moseeker.baseorm.db.hrdb.tables.HrAtsApplicationRecommend.HR_ATS_APPLICATION_RECOMMEND;

    /**
     * hr招聘管理自定义可显示字段具体表
     */
    public static final HrAtsApplicationShowField HR_ATS_APPLICATION_SHOW_FIELD = com.moseeker.baseorm.db.hrdb.tables.HrAtsApplicationShowField.HR_ATS_APPLICATION_SHOW_FIELD;

    /**
     * hr ats申请状态的上一个操作记录
     */
    public static final HrAtsLastOperationRecord HR_ATS_LAST_OPERATION_RECORD = com.moseeker.baseorm.db.hrdb.tables.HrAtsLastOperationRecord.HR_ATS_LAST_OPERATION_RECORD;

    /**
     * 企业招聘阶段基础类别表
     */
    public static final HrAtsPhaseBase HR_ATS_PHASE_BASE = com.moseeker.baseorm.db.hrdb.tables.HrAtsPhaseBase.HR_ATS_PHASE_BASE;

    /**
     * hr阶段事件可配置选项表
     */
    public static final HrAtsPhaseBaseEvent HR_ATS_PHASE_BASE_EVENT = com.moseeker.baseorm.db.hrdb.tables.HrAtsPhaseBaseEvent.HR_ATS_PHASE_BASE_EVENT;

    /**
     * ats阶段具体的企业配置项
     */
    public static final HrAtsPhaseBaseItem HR_ATS_PHASE_BASE_ITEM = com.moseeker.baseorm.db.hrdb.tables.HrAtsPhaseBaseItem.HR_ATS_PHASE_BASE_ITEM;

    /**
     * 企业l阶段事件挂载中间表
     */
    public static final HrAtsPhaseEvent HR_ATS_PHASE_EVENT = com.moseeker.baseorm.db.hrdb.tables.HrAtsPhaseEvent.HR_ATS_PHASE_EVENT;

    /**
     * 招聘管理事件
     */
    public static final HrAtsPhaseEventItems HR_ATS_PHASE_EVENT_ITEMS = com.moseeker.baseorm.db.hrdb.tables.HrAtsPhaseEventItems.HR_ATS_PHASE_EVENT_ITEMS;

    /**
     * ats流程企业端配置项
     */
    public static final HrAtsProcessCompany HR_ATS_PROCESS_COMPANY = com.moseeker.baseorm.db.hrdb.tables.HrAtsProcessCompany.HR_ATS_PROCESS_COMPANY;

    /**
     * ats流程企业端配置搭配表
     */
    public static final HrAtsProcessCompanyItem HR_ATS_PROCESS_COMPANY_ITEM = com.moseeker.baseorm.db.hrdb.tables.HrAtsProcessCompanyItem.HR_ATS_PROCESS_COMPANY_ITEM;

    /**
     * ats招聘流程进度流水表
     */
    public static final HrAtsProcessNewRecord HR_ATS_PROCESS_NEW_RECORD = com.moseeker.baseorm.db.hrdb.tables.HrAtsProcessNewRecord.HR_ATS_PROCESS_NEW_RECORD;

    /**
     * 聊天室未读消息
     */
    public static final HrChatUnreadCount HR_CHAT_UNREAD_COUNT = com.moseeker.baseorm.db.hrdb.tables.HrChatUnreadCount.HR_CHAT_UNREAD_COUNT;

    /**
     * 微信端新jd模块具体内容项
     */
    public static final HrCmsMedia HR_CMS_MEDIA = com.moseeker.baseorm.db.hrdb.tables.HrCmsMedia.HR_CMS_MEDIA;

    /**
     * 微信端新jd内容模块配置项
     */
    public static final HrCmsModule HR_CMS_MODULE = com.moseeker.baseorm.db.hrdb.tables.HrCmsModule.HR_CMS_MODULE;

    /**
     * 微信端新jd配置表
     */
    public static final HrCmsPages HR_CMS_PAGES = com.moseeker.baseorm.db.hrdb.tables.HrCmsPages.HR_CMS_PAGES;

    /**
     * 公司表
     */
    public static final HrCompany HR_COMPANY = com.moseeker.baseorm.db.hrdb.tables.HrCompany.HR_COMPANY;

    /**
     * 账号公司关联记录
     */
    public static final HrCompanyAccount HR_COMPANY_ACCOUNT = com.moseeker.baseorm.db.hrdb.tables.HrCompanyAccount.HR_COMPANY_ACCOUNT;

    /**
     * 公司级别的配置信息表
     */
    public static final HrCompanyConf HR_COMPANY_CONF = com.moseeker.baseorm.db.hrdb.tables.HrCompanyConf.HR_COMPANY_CONF;

    /**
     * 公司和CS匹配表
     */
    public static final HrCompanyCs HR_COMPANY_CS = com.moseeker.baseorm.db.hrdb.tables.HrCompanyCs.HR_COMPANY_CS;

    /**
     * 企业邮件总量信息表
     */
    public static final HrCompanyEmailInfo HR_COMPANY_EMAIL_INFO = com.moseeker.baseorm.db.hrdb.tables.HrCompanyEmailInfo.HR_COMPANY_EMAIL_INFO;

    /**
     * 公司福利特色
     */
    public static final HrCompanyFeature HR_COMPANY_FEATURE = com.moseeker.baseorm.db.hrdb.tables.HrCompanyFeature.HR_COMPANY_FEATURE;

    /**
     * 公司招聘流程配置表
     */
    public static final HrCompanyRecruitProcess HR_COMPANY_RECRUIT_PROCESS = com.moseeker.baseorm.db.hrdb.tables.HrCompanyRecruitProcess.HR_COMPANY_RECRUIT_PROCESS;

    /**
     * 公司招聘流程配置表具体状态字表
     */
    public static final HrCompanyRecruitProcessItems HR_COMPANY_RECRUIT_PROCESS_ITEMS = com.moseeker.baseorm.db.hrdb.tables.HrCompanyRecruitProcessItems.HR_COMPANY_RECRUIT_PROCESS_ITEMS;

    /**
     * 公司内推配置表
     */
    public static final HrCompanyReferralConf HR_COMPANY_REFERRAL_CONF = com.moseeker.baseorm.db.hrdb.tables.HrCompanyReferralConf.HR_COMPANY_REFERRAL_CONF;

    /**
     * 企业微信配置
     */
    public static final HrCompanyWorkwxConf HR_COMPANY_WORKWX_CONF = com.moseeker.baseorm.db.hrdb.tables.HrCompanyWorkwxConf.HR_COMPANY_WORKWX_CONF;

    /**
     * dashboard展示项配置表
     */
    public static final HrDashboardConfig HR_DASHBOARD_CONFIG = com.moseeker.baseorm.db.hrdb.tables.HrDashboardConfig.HR_DASHBOARD_CONFIG;

    /**
     * 部门员工配置表
     */
    public static final HrEmployeeCertConf HR_EMPLOYEE_CERT_CONF = com.moseeker.baseorm.db.hrdb.tables.HrEmployeeCertConf.HR_EMPLOYEE_CERT_CONF;

    /**
     * 员工认证自定义字段表
     */
    public static final HrEmployeeCustomFields HR_EMPLOYEE_CUSTOM_FIELDS = com.moseeker.baseorm.db.hrdb.tables.HrEmployeeCustomFields.HR_EMPLOYEE_CUSTOM_FIELDS;

    /**
     * 员工职能表
     */
    public static final HrEmployeePosition HR_EMPLOYEE_POSITION = com.moseeker.baseorm.db.hrdb.tables.HrEmployeePosition.HR_EMPLOYEE_POSITION;

    /**
     * 员工部门表
     */
    public static final HrEmployeeSection HR_EMPLOYEE_SECTION = com.moseeker.baseorm.db.hrdb.tables.HrEmployeeSection.HR_EMPLOYEE_SECTION;

    /**
     * HR反馈表
     */
    public static final HrFeedback HR_FEEDBACK = com.moseeker.baseorm.db.hrdb.tables.HrFeedback.HR_FEEDBACK;

    /**
     * The table <code>hrdb.hr_group_company</code>.
     */
    public static final HrGroupCompany HR_GROUP_COMPANY = com.moseeker.baseorm.db.hrdb.tables.HrGroupCompany.HR_GROUP_COMPANY;

    /**
     * The table <code>hrdb.hr_group_company_rel</code>.
     */
    public static final HrGroupCompanyRel HR_GROUP_COMPANY_REL = com.moseeker.baseorm.db.hrdb.tables.HrGroupCompanyRel.HR_GROUP_COMPANY_REL;

    /**
     * 红包配置表
     */
    public static final HrHbConfig HR_HB_CONFIG = com.moseeker.baseorm.db.hrdb.tables.HrHbConfig.HR_HB_CONFIG;

    /**
     * 红包记录表
     */
    public static final HrHbItems HR_HB_ITEMS = com.moseeker.baseorm.db.hrdb.tables.HrHbItems.HR_HB_ITEMS;

    /**
     * The table <code>hrdb.hr_hb_items_backup_chendi_180625</code>.
     */
    public static final HrHbItemsBackupChendi_180625 HR_HB_ITEMS_BACKUP_CHENDI_180625 = com.moseeker.baseorm.db.hrdb.tables.HrHbItemsBackupChendi_180625.HR_HB_ITEMS_BACKUP_CHENDI_180625;

    /**
     * 红包配置和职位绑定表
     */
    public static final HrHbPositionBinding HR_HB_POSITION_BINDING = com.moseeker.baseorm.db.hrdb.tables.HrHbPositionBinding.HR_HB_POSITION_BINDING;

    /**
     * 新红包刮刮卡记录表
     */
    public static final HrHbScratchCard HR_HB_SCRATCH_CARD = com.moseeker.baseorm.db.hrdb.tables.HrHbScratchCard.HR_HB_SCRATCH_CARD;

    /**
     * 红包发送记录
     */
    public static final HrHbSendRecord HR_HB_SEND_RECORD = com.moseeker.baseorm.db.hrdb.tables.HrHbSendRecord.HR_HB_SEND_RECORD;

    /**
     * 红包活动与主题的关系表
     */
    public static final HrHbTheme HR_HB_THEME = com.moseeker.baseorm.db.hrdb.tables.HrHbTheme.HR_HB_THEME;

    /**
     * 猎头渠道表
     */
    public static final HrHeadhunterAccount HR_HEADHUNTER_ACCOUNT = com.moseeker.baseorm.db.hrdb.tables.HrHeadhunterAccount.HR_HEADHUNTER_ACCOUNT;

    /**
     * 猎头候选人表
     */
    public static final HrHeadhunterCandidate HR_HEADHUNTER_CANDIDATE = com.moseeker.baseorm.db.hrdb.tables.HrHeadhunterCandidate.HR_HEADHUNTER_CANDIDATE;

    /**
     * 猎头公司表
     */
    public static final HrHeadhunterCompany HR_HEADHUNTER_COMPANY = com.moseeker.baseorm.db.hrdb.tables.HrHeadhunterCompany.HR_HEADHUNTER_COMPANY;

    /**
     * 猎头职位表
     */
    public static final HrHeadhunterJob HR_HEADHUNTER_JOB = com.moseeker.baseorm.db.hrdb.tables.HrHeadhunterJob.HR_HEADHUNTER_JOB;

    /**
     * 猎头管理OMS配置表
     */
    public static final HrHeadhunterOmsConf HR_HEADHUNTER_OMS_CONF = com.moseeker.baseorm.db.hrdb.tables.HrHeadhunterOmsConf.HR_HEADHUNTER_OMS_CONF;

    /**
     * 猎头上传简历表 猎头上传简历临时存储，hr接收后为正式简历
     */
    public static final HrHeadhunterProfile HR_HEADHUNTER_PROFILE = com.moseeker.baseorm.db.hrdb.tables.HrHeadhunterProfile.HR_HEADHUNTER_PROFILE;

    /**
     * 专题传播统计次数表
     */
    public static final HrHtml5Statistics HR_HTML5_STATISTICS = com.moseeker.baseorm.db.hrdb.tables.HrHtml5Statistics.HR_HTML5_STATISTICS;

    /**
     * 专题传播统计去重信息表
     */
    public static final HrHtml5UniqueStatistics HR_HTML5_UNIQUE_STATISTICS = com.moseeker.baseorm.db.hrdb.tables.HrHtml5UniqueStatistics.HR_HTML5_UNIQUE_STATISTICS;

    /**
     * 企业用户导入数据异步处理监控操作表
     */
    public static final HrImporterMonitor HR_IMPORTER_MONITOR = com.moseeker.baseorm.db.hrdb.tables.HrImporterMonitor.HR_IMPORTER_MONITOR;

    /**
     * 面试地址表
     */
    public static final HrInterviewAddress HR_INTERVIEW_ADDRESS = com.moseeker.baseorm.db.hrdb.tables.HrInterviewAddress.HR_INTERVIEW_ADDRESS;

    /**
     * 面试安排表
     */
    public static final HrInterviewConcrete HR_INTERVIEW_CONCRETE = com.moseeker.baseorm.db.hrdb.tables.HrInterviewConcrete.HR_INTERVIEW_CONCRETE;

    /**
     * 面试反馈结果
     */
    public static final HrInterviewFeedbackResultAnswerSheet HR_INTERVIEW_FEEDBACK_RESULT_ANSWER_SHEET = com.moseeker.baseorm.db.hrdb.tables.HrInterviewFeedbackResultAnswerSheet.HR_INTERVIEW_FEEDBACK_RESULT_ANSWER_SHEET;

    /**
     * 面试反馈-每个反馈项的反馈结果
     */
    public static final HrInterviewFeedbackResultItemAnswer HR_INTERVIEW_FEEDBACK_RESULT_ITEM_ANSWER = com.moseeker.baseorm.db.hrdb.tables.HrInterviewFeedbackResultItemAnswer.HR_INTERVIEW_FEEDBACK_RESULT_ITEM_ANSWER;

    /**
     * 面试反馈表模板
     */
    public static final HrInterviewFeedbackTemplate HR_INTERVIEW_FEEDBACK_TEMPLATE = com.moseeker.baseorm.db.hrdb.tables.HrInterviewFeedbackTemplate.HR_INTERVIEW_FEEDBACK_TEMPLATE;

    /**
     * 面试反馈表反馈项
     */
    public static final HrInterviewFeedbackTemplateItem HR_INTERVIEW_FEEDBACK_TEMPLATE_ITEM = com.moseeker.baseorm.db.hrdb.tables.HrInterviewFeedbackTemplateItem.HR_INTERVIEW_FEEDBACK_TEMPLATE_ITEM;

    /**
     * 面试反馈选项
     */
    public static final HrInterviewFeedbackTemplateItemOption HR_INTERVIEW_FEEDBACK_TEMPLATE_ITEM_OPTION = com.moseeker.baseorm.db.hrdb.tables.HrInterviewFeedbackTemplateItemOption.HR_INTERVIEW_FEEDBACK_TEMPLATE_ITEM_OPTION;

    /**
     * 面试提醒表
     */
    public static final HrInterviewNotice HR_INTERVIEW_NOTICE = com.moseeker.baseorm.db.hrdb.tables.HrInterviewNotice.HR_INTERVIEW_NOTICE;

    /**
     * 面试流程表
     */
    public static final HrInterviewProcess HR_INTERVIEW_PROCESS = com.moseeker.baseorm.db.hrdb.tables.HrInterviewProcess.HR_INTERVIEW_PROCESS;

    /**
     * 面试阶段表
     */
    public static final HrInterviewProcessRound HR_INTERVIEW_PROCESS_ROUND = com.moseeker.baseorm.db.hrdb.tables.HrInterviewProcessRound.HR_INTERVIEW_PROCESS_ROUND;

    /**
     * 榜单开关
     */
    public static final HrLeaderBoard HR_LEADER_BOARD = com.moseeker.baseorm.db.hrdb.tables.HrLeaderBoard.HR_LEADER_BOARD;

    /**
     * nps打分推荐表
     */
    public static final HrNps HR_NPS = com.moseeker.baseorm.db.hrdb.tables.HrNps.HR_NPS;

    /**
     * hr推荐同行表
     */
    public static final HrNpsRecommend HR_NPS_RECOMMEND = com.moseeker.baseorm.db.hrdb.tables.HrNpsRecommend.HR_NPS_RECOMMEND;

    /**
     * 简历操作历史表
     */
    public static final HrOperationAllRecord HR_OPERATION_ALL_RECORD = com.moseeker.baseorm.db.hrdb.tables.HrOperationAllRecord.HR_OPERATION_ALL_RECORD;

    /**
     * hr申请状态操作记录
     */
    public static final HrOperationRecord HR_OPERATION_RECORD = com.moseeker.baseorm.db.hrdb.tables.HrOperationRecord.HR_OPERATION_RECORD;

    /**
     * 雇主积分规则配置表
     */
    public static final HrPointsConf HR_POINTS_CONF = com.moseeker.baseorm.db.hrdb.tables.HrPointsConf.HR_POINTS_CONF;

    /**
     * 招聘数据次数统计表
     */
    public static final HrRecruitStatistics HR_RECRUIT_STATISTICS = com.moseeker.baseorm.db.hrdb.tables.HrRecruitStatistics.HR_RECRUIT_STATISTICS;

    /**
     * 招聘数据去重信息统计表
     */
    public static final HrRecruitUniqueStatistics HR_RECRUIT_UNIQUE_STATISTICS = com.moseeker.baseorm.db.hrdb.tables.HrRecruitUniqueStatistics.HR_RECRUIT_UNIQUE_STATISTICS;

    /**
     * 内推统计表
     */
    public static final HrReferralStatistics HR_REFERRAL_STATISTICS = com.moseeker.baseorm.db.hrdb.tables.HrReferralStatistics.HR_REFERRAL_STATISTICS;

    /**
     * 资源集合表
     */
    public static final HrResource HR_RESOURCE = com.moseeker.baseorm.db.hrdb.tables.HrResource.HR_RESOURCE;

    /**
     * 微信图文传播次数统计表
     */
    public static final HrRuleStatistics HR_RULE_STATISTICS = com.moseeker.baseorm.db.hrdb.tables.HrRuleStatistics.HR_RULE_STATISTICS;

    /**
     * 微信图文传播去重信息统计表
     */
    public static final HrRuleUniqueStatistics HR_RULE_UNIQUE_STATISTICS = com.moseeker.baseorm.db.hrdb.tables.HrRuleUniqueStatistics.HR_RULE_UNIQUE_STATISTICS;

    /**
     * 候选人列表常用筛选项
     */
    public static final HrSearchCondition HR_SEARCH_CONDITION = com.moseeker.baseorm.db.hrdb.tables.HrSearchCondition.HR_SEARCH_CONDITION;

    /**
     * 升级超级账号申请表
     */
    public static final HrSuperaccountApply HR_SUPERACCOUNT_APPLY = com.moseeker.baseorm.db.hrdb.tables.HrSuperaccountApply.HR_SUPERACCOUNT_APPLY;

    /**
     * 人才库
     */
    public static final HrTalentpool HR_TALENTPOOL = com.moseeker.baseorm.db.hrdb.tables.HrTalentpool.HR_TALENTPOOL;

    /**
     * 团队信息
     */
    public static final HrTeam HR_TEAM = com.moseeker.baseorm.db.hrdb.tables.HrTeam.HR_TEAM;

    /**
     * The table <code>hrdb.hr_team_20180118_chendi</code>.
     */
    public static final HrTeam_20180118Chendi HR_TEAM_20180118_CHENDI = com.moseeker.baseorm.db.hrdb.tables.HrTeam_20180118Chendi.HR_TEAM_20180118_CHENDI;

    /**
     * 团队成员信息
     */
    public static final HrTeamMember HR_TEAM_MEMBER = com.moseeker.baseorm.db.hrdb.tables.HrTeamMember.HR_TEAM_MEMBER;

    /**
     * 第三方渠道帐号
     */
    public static final HrThirdPartyAccount HR_THIRD_PARTY_ACCOUNT = com.moseeker.baseorm.db.hrdb.tables.HrThirdPartyAccount.HR_THIRD_PARTY_ACCOUNT;

    /**
     * 第三方账号和hr表关联表，账号分配表，取消分配将status置为0，重新分配不修改记录而是新加分配记录
     */
    public static final HrThirdPartyAccountHr HR_THIRD_PARTY_ACCOUNT_HR = com.moseeker.baseorm.db.hrdb.tables.HrThirdPartyAccountHr.HR_THIRD_PARTY_ACCOUNT_HR;

    /**
     * 第三方渠道同步的职位
     */
    public static final HrThirdPartyPosition HR_THIRD_PARTY_POSITION = com.moseeker.baseorm.db.hrdb.tables.HrThirdPartyPosition.HR_THIRD_PARTY_POSITION;

    /**
     * 雇主主题活动表
     */
    public static final HrTopic HR_TOPIC = com.moseeker.baseorm.db.hrdb.tables.HrTopic.HR_TOPIC;

    /**
     * 微信文本回复表
     */
    public static final HrWxBasicReply HR_WX_BASIC_REPLY = com.moseeker.baseorm.db.hrdb.tables.HrWxBasicReply.HR_WX_BASIC_REPLY;

    /**
     * IM聊天
     */
    public static final HrWxHrChat HR_WX_HR_CHAT = com.moseeker.baseorm.db.hrdb.tables.HrWxHrChat.HR_WX_HR_CHAT;

    /**
     * IM聊天人关系
     */
    public static final HrWxHrChatList HR_WX_HR_CHAT_LIST = com.moseeker.baseorm.db.hrdb.tables.HrWxHrChatList.HR_WX_HR_CHAT_LIST;

    /**
     * 语音聊天的语音信息
     */
    public static final HrWxHrChatVoice HR_WX_HR_CHAT_VOICE = com.moseeker.baseorm.db.hrdb.tables.HrWxHrChatVoice.HR_WX_HR_CHAT_VOICE;

    /**
     * 微信图片回复
     */
    public static final HrWxImageReply HR_WX_IMAGE_REPLY = com.moseeker.baseorm.db.hrdb.tables.HrWxImageReply.HR_WX_IMAGE_REPLY;

    /**
     * 微信模块表
     */
    public static final HrWxModule HR_WX_MODULE = com.moseeker.baseorm.db.hrdb.tables.HrWxModule.HR_WX_MODULE;

    /**
     * 微信图文回复表
     */
    public static final HrWxNewsReply HR_WX_NEWS_REPLY = com.moseeker.baseorm.db.hrdb.tables.HrWxNewsReply.HR_WX_NEWS_REPLY;

    /**
     * 微信消息通知, first和remark文案暂不使用
     */
    public static final HrWxNoticeMessage HR_WX_NOTICE_MESSAGE = com.moseeker.baseorm.db.hrdb.tables.HrWxNoticeMessage.HR_WX_NOTICE_MESSAGE;

    /**
     * 微信回复规则表
     */
    public static final HrWxRule HR_WX_RULE = com.moseeker.baseorm.db.hrdb.tables.HrWxRule.HR_WX_RULE;

    /**
     * 微信模板消息
     */
    public static final HrWxTemplateMessage HR_WX_TEMPLATE_MESSAGE = com.moseeker.baseorm.db.hrdb.tables.HrWxTemplateMessage.HR_WX_TEMPLATE_MESSAGE;

    /**
     * 微信公众号表
     */
    public static final HrWxWechat HR_WX_WECHAT = com.moseeker.baseorm.db.hrdb.tables.HrWxWechat.HR_WX_WECHAT;

    /**
     * The table <code>hrdb.hr_wx_wechat_20180127chendi</code>.
     */
    public static final HrWxWechat_20180127chendi HR_WX_WECHAT_20180127CHENDI = com.moseeker.baseorm.db.hrdb.tables.HrWxWechat_20180127chendi.HR_WX_WECHAT_20180127CHENDI;

    /**
     * 微信消息通知同步状态
     */
    public static final HrWxWechatNoticeSyncStatus HR_WX_WECHAT_NOTICE_SYNC_STATUS = com.moseeker.baseorm.db.hrdb.tables.HrWxWechatNoticeSyncStatus.HR_WX_WECHAT_NOTICE_SYNC_STATUS;

    /**
     * 微信公众号的场景二维码表(永久)
     */
    public static final HrWxWechatQrcode HR_WX_WECHAT_QRCODE = com.moseeker.baseorm.db.hrdb.tables.HrWxWechatQrcode.HR_WX_WECHAT_QRCODE;
}
