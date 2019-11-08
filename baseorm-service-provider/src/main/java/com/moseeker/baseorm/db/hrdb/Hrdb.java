/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb;


import com.moseeker.baseorm.db.hrdb.tables.HrAccountApplicationNotify;
import com.moseeker.baseorm.db.hrdb.tables.HrAiConf;
import com.moseeker.baseorm.db.hrdb.tables.HrAppCvConf;
import com.moseeker.baseorm.db.hrdb.tables.HrAppExportFields;
import com.moseeker.baseorm.db.hrdb.tables.HrAtsApplicationEmploy;
import com.moseeker.baseorm.db.hrdb.tables.HrAtsApplicationOffer;
import com.moseeker.baseorm.db.hrdb.tables.HrAtsApplicationRecommend;
import com.moseeker.baseorm.db.hrdb.tables.HrAtsApplicationShowField;
import com.moseeker.baseorm.db.hrdb.tables.HrAtsDepartment;
import com.moseeker.baseorm.db.hrdb.tables.HrAtsLastOperationRecord;
import com.moseeker.baseorm.db.hrdb.tables.HrAtsObsolete;
import com.moseeker.baseorm.db.hrdb.tables.HrAtsPhaseBase;
import com.moseeker.baseorm.db.hrdb.tables.HrAtsPhaseBaseEvent;
import com.moseeker.baseorm.db.hrdb.tables.HrAtsPhaseBaseItem;
import com.moseeker.baseorm.db.hrdb.tables.HrAtsPhaseEvent;
import com.moseeker.baseorm.db.hrdb.tables.HrAtsPhaseEventItems;
import com.moseeker.baseorm.db.hrdb.tables.HrAtsProcessCompany;
import com.moseeker.baseorm.db.hrdb.tables.HrAtsProcessCompanyItem;
import com.moseeker.baseorm.db.hrdb.tables.HrAtsProcessNewRecord;
import com.moseeker.baseorm.db.hrdb.tables.HrAtsRecommend;
import com.moseeker.baseorm.db.hrdb.tables.HrChatUnreadCount;
import com.moseeker.baseorm.db.hrdb.tables.HrCmsMedia;
import com.moseeker.baseorm.db.hrdb.tables.HrCmsModule;
import com.moseeker.baseorm.db.hrdb.tables.HrCmsPages;
import com.moseeker.baseorm.db.hrdb.tables.HrCompany;
import com.moseeker.baseorm.db.hrdb.tables.HrCompanyAccount;
import com.moseeker.baseorm.db.hrdb.tables.HrCompanyAccountConf;
import com.moseeker.baseorm.db.hrdb.tables.HrCompanyAddress;
import com.moseeker.baseorm.db.hrdb.tables.HrCompanyConf;
import com.moseeker.baseorm.db.hrdb.tables.HrCompanyCs;
import com.moseeker.baseorm.db.hrdb.tables.HrCompanyEmailInfo;
import com.moseeker.baseorm.db.hrdb.tables.HrCompanyFeature;
import com.moseeker.baseorm.db.hrdb.tables.HrCompanyInterview;
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
import com.moseeker.baseorm.db.hrdb.tables.HrReferralRuleConfig;
import com.moseeker.baseorm.db.hrdb.tables.HrReferralStatistics;
import com.moseeker.baseorm.db.hrdb.tables.HrResource;
import com.moseeker.baseorm.db.hrdb.tables.HrRuleStatistics;
import com.moseeker.baseorm.db.hrdb.tables.HrRuleUniqueStatistics;
import com.moseeker.baseorm.db.hrdb.tables.HrSearchCondition;
import com.moseeker.baseorm.db.hrdb.tables.HrSuperaccountApply;
import com.moseeker.baseorm.db.hrdb.tables.HrTalentpool;
import com.moseeker.baseorm.db.hrdb.tables.HrTeam;
import com.moseeker.baseorm.db.hrdb.tables.HrTeamMember;
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
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Hrdb extends SchemaImpl {

    private static final long serialVersionUID = -128202718;

    /**
     * The reference instance of <code>hrdb</code>
     */
    public static final Hrdb HRDB = new Hrdb();

    /**
     * The table <code>hrdb.hr_account_application_notify</code>.
     */
    public final HrAccountApplicationNotify HR_ACCOUNT_APPLICATION_NOTIFY = com.moseeker.baseorm.db.hrdb.tables.HrAccountApplicationNotify.HR_ACCOUNT_APPLICATION_NOTIFY;

    /**
     * 人工智能系统配置表
     */
    public final HrAiConf HR_AI_CONF = com.moseeker.baseorm.db.hrdb.tables.HrAiConf.HR_AI_CONF;

    /**
     * 企业申请简历校验配置
     */
    public final HrAppCvConf HR_APP_CV_CONF = com.moseeker.baseorm.db.hrdb.tables.HrAppCvConf.HR_APP_CV_CONF;

    /**
     * 自定义简历模板导出字段表
     */
    public final HrAppExportFields HR_APP_EXPORT_FIELDS = com.moseeker.baseorm.db.hrdb.tables.HrAppExportFields.HR_APP_EXPORT_FIELDS;

    /**
     * 新MoAts流程录用表
     */
    public final HrAtsApplicationEmploy HR_ATS_APPLICATION_EMPLOY = com.moseeker.baseorm.db.hrdb.tables.HrAtsApplicationEmploy.HR_ATS_APPLICATION_EMPLOY;

    /**
     * 新MoAts流程offer表
     */
    public final HrAtsApplicationOffer HR_ATS_APPLICATION_OFFER = com.moseeker.baseorm.db.hrdb.tables.HrAtsApplicationOffer.HR_ATS_APPLICATION_OFFER;

    /**
     * HR推荐给用人部门做初筛的基表
     */
    public final HrAtsApplicationRecommend HR_ATS_APPLICATION_RECOMMEND = com.moseeker.baseorm.db.hrdb.tables.HrAtsApplicationRecommend.HR_ATS_APPLICATION_RECOMMEND;

    /**
     * hr招聘管理自定义可显示字段具体表
     */
    public final HrAtsApplicationShowField HR_ATS_APPLICATION_SHOW_FIELD = com.moseeker.baseorm.db.hrdb.tables.HrAtsApplicationShowField.HR_ATS_APPLICATION_SHOW_FIELD;

    /**
     * 部门机构管理表
     */
    public final HrAtsDepartment HR_ATS_DEPARTMENT = com.moseeker.baseorm.db.hrdb.tables.HrAtsDepartment.HR_ATS_DEPARTMENT;

    /**
     * hr ats申请状态的上一个操作记录
     */
    public final HrAtsLastOperationRecord HR_ATS_LAST_OPERATION_RECORD = com.moseeker.baseorm.db.hrdb.tables.HrAtsLastOperationRecord.HR_ATS_LAST_OPERATION_RECORD;

    /**
     * hr淘汰候选人记录表
     */
    public final HrAtsObsolete HR_ATS_OBSOLETE = com.moseeker.baseorm.db.hrdb.tables.HrAtsObsolete.HR_ATS_OBSOLETE;

    /**
     * 企业招聘阶段基础类别表
     */
    public final HrAtsPhaseBase HR_ATS_PHASE_BASE = com.moseeker.baseorm.db.hrdb.tables.HrAtsPhaseBase.HR_ATS_PHASE_BASE;

    /**
     * hr阶段事件可配置选项表
     */
    public final HrAtsPhaseBaseEvent HR_ATS_PHASE_BASE_EVENT = com.moseeker.baseorm.db.hrdb.tables.HrAtsPhaseBaseEvent.HR_ATS_PHASE_BASE_EVENT;

    /**
     * ats阶段具体的企业配置项
     */
    public final HrAtsPhaseBaseItem HR_ATS_PHASE_BASE_ITEM = com.moseeker.baseorm.db.hrdb.tables.HrAtsPhaseBaseItem.HR_ATS_PHASE_BASE_ITEM;

    /**
     * 企业l阶段事件挂载中间表
     */
    public final HrAtsPhaseEvent HR_ATS_PHASE_EVENT = com.moseeker.baseorm.db.hrdb.tables.HrAtsPhaseEvent.HR_ATS_PHASE_EVENT;

    /**
     * 招聘管理事件
     */
    public final HrAtsPhaseEventItems HR_ATS_PHASE_EVENT_ITEMS = com.moseeker.baseorm.db.hrdb.tables.HrAtsPhaseEventItems.HR_ATS_PHASE_EVENT_ITEMS;

    /**
     * ats流程企业端配置项
     */
    public final HrAtsProcessCompany HR_ATS_PROCESS_COMPANY = com.moseeker.baseorm.db.hrdb.tables.HrAtsProcessCompany.HR_ATS_PROCESS_COMPANY;

    /**
     * ats流程企业端配置搭配表
     */
    public final HrAtsProcessCompanyItem HR_ATS_PROCESS_COMPANY_ITEM = com.moseeker.baseorm.db.hrdb.tables.HrAtsProcessCompanyItem.HR_ATS_PROCESS_COMPANY_ITEM;

    /**
     * ats招聘流程进度流水表
     */
    public final HrAtsProcessNewRecord HR_ATS_PROCESS_NEW_RECORD = com.moseeker.baseorm.db.hrdb.tables.HrAtsProcessNewRecord.HR_ATS_PROCESS_NEW_RECORD;

    /**
     * 推荐给用人部门表
     */
    public final HrAtsRecommend HR_ATS_RECOMMEND = com.moseeker.baseorm.db.hrdb.tables.HrAtsRecommend.HR_ATS_RECOMMEND;

    /**
     * 聊天室未读消息
     */
    public final HrChatUnreadCount HR_CHAT_UNREAD_COUNT = com.moseeker.baseorm.db.hrdb.tables.HrChatUnreadCount.HR_CHAT_UNREAD_COUNT;

    /**
     * 微信端新jd模块具体内容项
     */
    public final HrCmsMedia HR_CMS_MEDIA = com.moseeker.baseorm.db.hrdb.tables.HrCmsMedia.HR_CMS_MEDIA;

    /**
     * 微信端新jd内容模块配置项
     */
    public final HrCmsModule HR_CMS_MODULE = com.moseeker.baseorm.db.hrdb.tables.HrCmsModule.HR_CMS_MODULE;

    /**
     * 微信端新jd配置表
     */
    public final HrCmsPages HR_CMS_PAGES = com.moseeker.baseorm.db.hrdb.tables.HrCmsPages.HR_CMS_PAGES;

    /**
     * 公司表
     */
    public final HrCompany HR_COMPANY = com.moseeker.baseorm.db.hrdb.tables.HrCompany.HR_COMPANY;

    /**
     * 账号公司关联记录
     */
    public final HrCompanyAccount HR_COMPANY_ACCOUNT = com.moseeker.baseorm.db.hrdb.tables.HrCompanyAccount.HR_COMPANY_ACCOUNT;

    /**
     * 公司账号数量配置表
     */
    public final HrCompanyAccountConf HR_COMPANY_ACCOUNT_CONF = com.moseeker.baseorm.db.hrdb.tables.HrCompanyAccountConf.HR_COMPANY_ACCOUNT_CONF;

    /**
     * 公司地址表
     */
    public final HrCompanyAddress HR_COMPANY_ADDRESS = com.moseeker.baseorm.db.hrdb.tables.HrCompanyAddress.HR_COMPANY_ADDRESS;

    /**
     * 公司级别的配置信息表
     */
    public final HrCompanyConf HR_COMPANY_CONF = com.moseeker.baseorm.db.hrdb.tables.HrCompanyConf.HR_COMPANY_CONF;

    /**
     * 公司和CS匹配表
     */
    public final HrCompanyCs HR_COMPANY_CS = com.moseeker.baseorm.db.hrdb.tables.HrCompanyCs.HR_COMPANY_CS;

    /**
     * 企业邮件总量信息表
     */
    public final HrCompanyEmailInfo HR_COMPANY_EMAIL_INFO = com.moseeker.baseorm.db.hrdb.tables.HrCompanyEmailInfo.HR_COMPANY_EMAIL_INFO;

    /**
     * 公司福利特色
     */
    public final HrCompanyFeature HR_COMPANY_FEATURE = com.moseeker.baseorm.db.hrdb.tables.HrCompanyFeature.HR_COMPANY_FEATURE;

    /**
     * 新版面试安排表
     */
    public final HrCompanyInterview HR_COMPANY_INTERVIEW = com.moseeker.baseorm.db.hrdb.tables.HrCompanyInterview.HR_COMPANY_INTERVIEW;

    /**
     * 公司招聘流程配置表
     */
    public final HrCompanyRecruitProcess HR_COMPANY_RECRUIT_PROCESS = com.moseeker.baseorm.db.hrdb.tables.HrCompanyRecruitProcess.HR_COMPANY_RECRUIT_PROCESS;

    /**
     * 公司招聘流程配置表具体状态字表
     */
    public final HrCompanyRecruitProcessItems HR_COMPANY_RECRUIT_PROCESS_ITEMS = com.moseeker.baseorm.db.hrdb.tables.HrCompanyRecruitProcessItems.HR_COMPANY_RECRUIT_PROCESS_ITEMS;

    /**
     * 公司内推配置表
     */
    public final HrCompanyReferralConf HR_COMPANY_REFERRAL_CONF = com.moseeker.baseorm.db.hrdb.tables.HrCompanyReferralConf.HR_COMPANY_REFERRAL_CONF;

    /**
     * 企业微信配置
     */
    public final HrCompanyWorkwxConf HR_COMPANY_WORKWX_CONF = com.moseeker.baseorm.db.hrdb.tables.HrCompanyWorkwxConf.HR_COMPANY_WORKWX_CONF;

    /**
     * dashboard展示项配置表
     */
    public final HrDashboardConfig HR_DASHBOARD_CONFIG = com.moseeker.baseorm.db.hrdb.tables.HrDashboardConfig.HR_DASHBOARD_CONFIG;

    /**
     * 部门员工配置表
     */
    public final HrEmployeeCertConf HR_EMPLOYEE_CERT_CONF = com.moseeker.baseorm.db.hrdb.tables.HrEmployeeCertConf.HR_EMPLOYEE_CERT_CONF;

    /**
     * 员工认证自定义字段表
     */
    public final HrEmployeeCustomFields HR_EMPLOYEE_CUSTOM_FIELDS = com.moseeker.baseorm.db.hrdb.tables.HrEmployeeCustomFields.HR_EMPLOYEE_CUSTOM_FIELDS;

    /**
     * 员工职能表
     */
    public final HrEmployeePosition HR_EMPLOYEE_POSITION = com.moseeker.baseorm.db.hrdb.tables.HrEmployeePosition.HR_EMPLOYEE_POSITION;

    /**
     * 员工部门表
     */
    public final HrEmployeeSection HR_EMPLOYEE_SECTION = com.moseeker.baseorm.db.hrdb.tables.HrEmployeeSection.HR_EMPLOYEE_SECTION;

    /**
     * HR反馈表
     */
    public final HrFeedback HR_FEEDBACK = com.moseeker.baseorm.db.hrdb.tables.HrFeedback.HR_FEEDBACK;

    /**
     * The table <code>hrdb.hr_group_company</code>.
     */
    public final HrGroupCompany HR_GROUP_COMPANY = com.moseeker.baseorm.db.hrdb.tables.HrGroupCompany.HR_GROUP_COMPANY;

    /**
     * The table <code>hrdb.hr_group_company_rel</code>.
     */
    public final HrGroupCompanyRel HR_GROUP_COMPANY_REL = com.moseeker.baseorm.db.hrdb.tables.HrGroupCompanyRel.HR_GROUP_COMPANY_REL;

    /**
     * 红包配置表
     */
    public final HrHbConfig HR_HB_CONFIG = com.moseeker.baseorm.db.hrdb.tables.HrHbConfig.HR_HB_CONFIG;

    /**
     * 红包记录表
     */
    public final HrHbItems HR_HB_ITEMS = com.moseeker.baseorm.db.hrdb.tables.HrHbItems.HR_HB_ITEMS;

    /**
     * 红包配置和职位绑定表
     */
    public final HrHbPositionBinding HR_HB_POSITION_BINDING = com.moseeker.baseorm.db.hrdb.tables.HrHbPositionBinding.HR_HB_POSITION_BINDING;

    /**
     * 新红包刮刮卡记录表
     */
    public final HrHbScratchCard HR_HB_SCRATCH_CARD = com.moseeker.baseorm.db.hrdb.tables.HrHbScratchCard.HR_HB_SCRATCH_CARD;

    /**
     * 红包发送记录
     */
    public final HrHbSendRecord HR_HB_SEND_RECORD = com.moseeker.baseorm.db.hrdb.tables.HrHbSendRecord.HR_HB_SEND_RECORD;

    /**
     * 红包活动与主题的关系表
     */
    public final HrHbTheme HR_HB_THEME = com.moseeker.baseorm.db.hrdb.tables.HrHbTheme.HR_HB_THEME;

    /**
     * 猎头渠道表
     */
    public final HrHeadhunterAccount HR_HEADHUNTER_ACCOUNT = com.moseeker.baseorm.db.hrdb.tables.HrHeadhunterAccount.HR_HEADHUNTER_ACCOUNT;

    /**
     * 猎头候选人表
     */
    public final HrHeadhunterCandidate HR_HEADHUNTER_CANDIDATE = com.moseeker.baseorm.db.hrdb.tables.HrHeadhunterCandidate.HR_HEADHUNTER_CANDIDATE;

    /**
     * 猎头公司表
     */
    public final HrHeadhunterCompany HR_HEADHUNTER_COMPANY = com.moseeker.baseorm.db.hrdb.tables.HrHeadhunterCompany.HR_HEADHUNTER_COMPANY;

    /**
     * 猎头职位表
     */
    public final HrHeadhunterJob HR_HEADHUNTER_JOB = com.moseeker.baseorm.db.hrdb.tables.HrHeadhunterJob.HR_HEADHUNTER_JOB;

    /**
     * 猎头管理OMS配置表
     */
    public final HrHeadhunterOmsConf HR_HEADHUNTER_OMS_CONF = com.moseeker.baseorm.db.hrdb.tables.HrHeadhunterOmsConf.HR_HEADHUNTER_OMS_CONF;

    /**
     * 猎头上传简历表 猎头上传简历临时存储，hr接收后为正式简历
     */
    public final HrHeadhunterProfile HR_HEADHUNTER_PROFILE = com.moseeker.baseorm.db.hrdb.tables.HrHeadhunterProfile.HR_HEADHUNTER_PROFILE;

    /**
     * 专题传播统计次数表
     */
    public final HrHtml5Statistics HR_HTML5_STATISTICS = com.moseeker.baseorm.db.hrdb.tables.HrHtml5Statistics.HR_HTML5_STATISTICS;

    /**
     * 专题传播统计去重信息表
     */
    public final HrHtml5UniqueStatistics HR_HTML5_UNIQUE_STATISTICS = com.moseeker.baseorm.db.hrdb.tables.HrHtml5UniqueStatistics.HR_HTML5_UNIQUE_STATISTICS;

    /**
     * 企业用户导入数据异步处理监控操作表
     */
    public final HrImporterMonitor HR_IMPORTER_MONITOR = com.moseeker.baseorm.db.hrdb.tables.HrImporterMonitor.HR_IMPORTER_MONITOR;

    /**
     * 面试地址表
     */
    public final HrInterviewAddress HR_INTERVIEW_ADDRESS = com.moseeker.baseorm.db.hrdb.tables.HrInterviewAddress.HR_INTERVIEW_ADDRESS;

    /**
     * 面试安排表
     */
    public final HrInterviewConcrete HR_INTERVIEW_CONCRETE = com.moseeker.baseorm.db.hrdb.tables.HrInterviewConcrete.HR_INTERVIEW_CONCRETE;

    /**
     * 面试反馈结果
     */
    public final HrInterviewFeedbackResultAnswerSheet HR_INTERVIEW_FEEDBACK_RESULT_ANSWER_SHEET = com.moseeker.baseorm.db.hrdb.tables.HrInterviewFeedbackResultAnswerSheet.HR_INTERVIEW_FEEDBACK_RESULT_ANSWER_SHEET;

    /**
     * 面试反馈-每个反馈项的反馈结果
     */
    public final HrInterviewFeedbackResultItemAnswer HR_INTERVIEW_FEEDBACK_RESULT_ITEM_ANSWER = com.moseeker.baseorm.db.hrdb.tables.HrInterviewFeedbackResultItemAnswer.HR_INTERVIEW_FEEDBACK_RESULT_ITEM_ANSWER;

    /**
     * 面试反馈表模板
     */
    public final HrInterviewFeedbackTemplate HR_INTERVIEW_FEEDBACK_TEMPLATE = com.moseeker.baseorm.db.hrdb.tables.HrInterviewFeedbackTemplate.HR_INTERVIEW_FEEDBACK_TEMPLATE;

    /**
     * 面试反馈表反馈项
     */
    public final HrInterviewFeedbackTemplateItem HR_INTERVIEW_FEEDBACK_TEMPLATE_ITEM = com.moseeker.baseorm.db.hrdb.tables.HrInterviewFeedbackTemplateItem.HR_INTERVIEW_FEEDBACK_TEMPLATE_ITEM;

    /**
     * 面试反馈选项
     */
    public final HrInterviewFeedbackTemplateItemOption HR_INTERVIEW_FEEDBACK_TEMPLATE_ITEM_OPTION = com.moseeker.baseorm.db.hrdb.tables.HrInterviewFeedbackTemplateItemOption.HR_INTERVIEW_FEEDBACK_TEMPLATE_ITEM_OPTION;

    /**
     * 面试提醒表
     */
    public final HrInterviewNotice HR_INTERVIEW_NOTICE = com.moseeker.baseorm.db.hrdb.tables.HrInterviewNotice.HR_INTERVIEW_NOTICE;

    /**
     * 面试流程表
     */
    public final HrInterviewProcess HR_INTERVIEW_PROCESS = com.moseeker.baseorm.db.hrdb.tables.HrInterviewProcess.HR_INTERVIEW_PROCESS;

    /**
     * 面试阶段表
     */
    public final HrInterviewProcessRound HR_INTERVIEW_PROCESS_ROUND = com.moseeker.baseorm.db.hrdb.tables.HrInterviewProcessRound.HR_INTERVIEW_PROCESS_ROUND;

    /**
     * 榜单开关
     */
    public final HrLeaderBoard HR_LEADER_BOARD = com.moseeker.baseorm.db.hrdb.tables.HrLeaderBoard.HR_LEADER_BOARD;

    /**
     * nps打分推荐表
     */
    public final HrNps HR_NPS = com.moseeker.baseorm.db.hrdb.tables.HrNps.HR_NPS;

    /**
     * hr推荐同行表
     */
    public final HrNpsRecommend HR_NPS_RECOMMEND = com.moseeker.baseorm.db.hrdb.tables.HrNpsRecommend.HR_NPS_RECOMMEND;

    /**
     * 简历操作历史表
     */
    public final HrOperationAllRecord HR_OPERATION_ALL_RECORD = com.moseeker.baseorm.db.hrdb.tables.HrOperationAllRecord.HR_OPERATION_ALL_RECORD;

    /**
     * hr申请状态操作记录
     */
    public final HrOperationRecord HR_OPERATION_RECORD = com.moseeker.baseorm.db.hrdb.tables.HrOperationRecord.HR_OPERATION_RECORD;

    /**
     * 雇主积分规则配置表
     */
    public final HrPointsConf HR_POINTS_CONF = com.moseeker.baseorm.db.hrdb.tables.HrPointsConf.HR_POINTS_CONF;

    /**
     * 招聘数据次数统计表
     */
    public final HrRecruitStatistics HR_RECRUIT_STATISTICS = com.moseeker.baseorm.db.hrdb.tables.HrRecruitStatistics.HR_RECRUIT_STATISTICS;

    /**
     * 招聘数据去重信息统计表
     */
    public final HrRecruitUniqueStatistics HR_RECRUIT_UNIQUE_STATISTICS = com.moseeker.baseorm.db.hrdb.tables.HrRecruitUniqueStatistics.HR_RECRUIT_UNIQUE_STATISTICS;

    /**
     * HR内推管理员工直接内推方式配置
     */
    public final HrReferralRuleConfig HR_REFERRAL_RULE_CONFIG = com.moseeker.baseorm.db.hrdb.tables.HrReferralRuleConfig.HR_REFERRAL_RULE_CONFIG;

    /**
     * 内推统计表
     */
    public final HrReferralStatistics HR_REFERRAL_STATISTICS = com.moseeker.baseorm.db.hrdb.tables.HrReferralStatistics.HR_REFERRAL_STATISTICS;

    /**
     * 资源集合表
     */
    public final HrResource HR_RESOURCE = com.moseeker.baseorm.db.hrdb.tables.HrResource.HR_RESOURCE;

    /**
     * 微信图文传播次数统计表
     */
    public final HrRuleStatistics HR_RULE_STATISTICS = com.moseeker.baseorm.db.hrdb.tables.HrRuleStatistics.HR_RULE_STATISTICS;

    /**
     * 微信图文传播去重信息统计表
     */
    public final HrRuleUniqueStatistics HR_RULE_UNIQUE_STATISTICS = com.moseeker.baseorm.db.hrdb.tables.HrRuleUniqueStatistics.HR_RULE_UNIQUE_STATISTICS;

    /**
     * 候选人列表常用筛选项
     */
    public final HrSearchCondition HR_SEARCH_CONDITION = com.moseeker.baseorm.db.hrdb.tables.HrSearchCondition.HR_SEARCH_CONDITION;

    /**
     * 升级超级账号申请表
     */
    public final HrSuperaccountApply HR_SUPERACCOUNT_APPLY = com.moseeker.baseorm.db.hrdb.tables.HrSuperaccountApply.HR_SUPERACCOUNT_APPLY;

    /**
     * 人才库
     */
    public final HrTalentpool HR_TALENTPOOL = com.moseeker.baseorm.db.hrdb.tables.HrTalentpool.HR_TALENTPOOL;

    /**
     * 团队信息
     */
    public final HrTeam HR_TEAM = com.moseeker.baseorm.db.hrdb.tables.HrTeam.HR_TEAM;

    /**
     * 团队成员信息
     */
    public final HrTeamMember HR_TEAM_MEMBER = com.moseeker.baseorm.db.hrdb.tables.HrTeamMember.HR_TEAM_MEMBER;

    /**
     * 第三方渠道帐号
     */
    public final HrThirdPartyAccount HR_THIRD_PARTY_ACCOUNT = com.moseeker.baseorm.db.hrdb.tables.HrThirdPartyAccount.HR_THIRD_PARTY_ACCOUNT;

    /**
     * 第三方账号和hr表关联表，账号分配表，取消分配将status置为0，重新分配不修改记录而是新加分配记录
     */
    public final HrThirdPartyAccountHr HR_THIRD_PARTY_ACCOUNT_HR = com.moseeker.baseorm.db.hrdb.tables.HrThirdPartyAccountHr.HR_THIRD_PARTY_ACCOUNT_HR;

    /**
     * 第三方渠道同步的职位
     */
    public final HrThirdPartyPosition HR_THIRD_PARTY_POSITION = com.moseeker.baseorm.db.hrdb.tables.HrThirdPartyPosition.HR_THIRD_PARTY_POSITION;

    /**
     * 雇主主题活动表
     */
    public final HrTopic HR_TOPIC = com.moseeker.baseorm.db.hrdb.tables.HrTopic.HR_TOPIC;

    /**
     * 微信文本回复表
     */
    public final HrWxBasicReply HR_WX_BASIC_REPLY = com.moseeker.baseorm.db.hrdb.tables.HrWxBasicReply.HR_WX_BASIC_REPLY;

    /**
     * IM聊天
     */
    public final HrWxHrChat HR_WX_HR_CHAT = com.moseeker.baseorm.db.hrdb.tables.HrWxHrChat.HR_WX_HR_CHAT;

    /**
     * IM聊天人关系
     */
    public final HrWxHrChatList HR_WX_HR_CHAT_LIST = com.moseeker.baseorm.db.hrdb.tables.HrWxHrChatList.HR_WX_HR_CHAT_LIST;

    /**
     * 语音聊天的语音信息
     */
    public final HrWxHrChatVoice HR_WX_HR_CHAT_VOICE = com.moseeker.baseorm.db.hrdb.tables.HrWxHrChatVoice.HR_WX_HR_CHAT_VOICE;

    /**
     * 微信图片回复
     */
    public final HrWxImageReply HR_WX_IMAGE_REPLY = com.moseeker.baseorm.db.hrdb.tables.HrWxImageReply.HR_WX_IMAGE_REPLY;

    /**
     * 微信模块表
     */
    public final HrWxModule HR_WX_MODULE = com.moseeker.baseorm.db.hrdb.tables.HrWxModule.HR_WX_MODULE;

    /**
     * 微信图文回复表
     */
    public final HrWxNewsReply HR_WX_NEWS_REPLY = com.moseeker.baseorm.db.hrdb.tables.HrWxNewsReply.HR_WX_NEWS_REPLY;

    /**
     * 微信消息通知, first和remark文案暂不使用
     */
    public final HrWxNoticeMessage HR_WX_NOTICE_MESSAGE = com.moseeker.baseorm.db.hrdb.tables.HrWxNoticeMessage.HR_WX_NOTICE_MESSAGE;

    /**
     * 微信回复规则表
     */
    public final HrWxRule HR_WX_RULE = com.moseeker.baseorm.db.hrdb.tables.HrWxRule.HR_WX_RULE;

    /**
     * 微信模板消息
     */
    public final HrWxTemplateMessage HR_WX_TEMPLATE_MESSAGE = com.moseeker.baseorm.db.hrdb.tables.HrWxTemplateMessage.HR_WX_TEMPLATE_MESSAGE;

    /**
     * 微信公众号表
     */
    public final HrWxWechat HR_WX_WECHAT = com.moseeker.baseorm.db.hrdb.tables.HrWxWechat.HR_WX_WECHAT;

    /**
     * 微信消息通知同步状态
     */
    public final HrWxWechatNoticeSyncStatus HR_WX_WECHAT_NOTICE_SYNC_STATUS = com.moseeker.baseorm.db.hrdb.tables.HrWxWechatNoticeSyncStatus.HR_WX_WECHAT_NOTICE_SYNC_STATUS;

    /**
     * 微信公众号的场景二维码表(永久)
     */
    public final HrWxWechatQrcode HR_WX_WECHAT_QRCODE = com.moseeker.baseorm.db.hrdb.tables.HrWxWechatQrcode.HR_WX_WECHAT_QRCODE;

    /**
     * No further instances allowed
     */
    private Hrdb() {
        super("hrdb", null);
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
            HrAccountApplicationNotify.HR_ACCOUNT_APPLICATION_NOTIFY,
            HrAiConf.HR_AI_CONF,
            HrAppCvConf.HR_APP_CV_CONF,
            HrAppExportFields.HR_APP_EXPORT_FIELDS,
            HrAtsApplicationEmploy.HR_ATS_APPLICATION_EMPLOY,
            HrAtsApplicationOffer.HR_ATS_APPLICATION_OFFER,
            HrAtsApplicationRecommend.HR_ATS_APPLICATION_RECOMMEND,
            HrAtsApplicationShowField.HR_ATS_APPLICATION_SHOW_FIELD,
            HrAtsDepartment.HR_ATS_DEPARTMENT,
            HrAtsLastOperationRecord.HR_ATS_LAST_OPERATION_RECORD,
            HrAtsObsolete.HR_ATS_OBSOLETE,
            HrAtsPhaseBase.HR_ATS_PHASE_BASE,
            HrAtsPhaseBaseEvent.HR_ATS_PHASE_BASE_EVENT,
            HrAtsPhaseBaseItem.HR_ATS_PHASE_BASE_ITEM,
            HrAtsPhaseEvent.HR_ATS_PHASE_EVENT,
            HrAtsPhaseEventItems.HR_ATS_PHASE_EVENT_ITEMS,
            HrAtsProcessCompany.HR_ATS_PROCESS_COMPANY,
            HrAtsProcessCompanyItem.HR_ATS_PROCESS_COMPANY_ITEM,
            HrAtsProcessNewRecord.HR_ATS_PROCESS_NEW_RECORD,
            HrAtsRecommend.HR_ATS_RECOMMEND,
            HrChatUnreadCount.HR_CHAT_UNREAD_COUNT,
            HrCmsMedia.HR_CMS_MEDIA,
            HrCmsModule.HR_CMS_MODULE,
            HrCmsPages.HR_CMS_PAGES,
            HrCompany.HR_COMPANY,
            HrCompanyAccount.HR_COMPANY_ACCOUNT,
            HrCompanyAccountConf.HR_COMPANY_ACCOUNT_CONF,
            HrCompanyAddress.HR_COMPANY_ADDRESS,
            HrCompanyConf.HR_COMPANY_CONF,
            HrCompanyCs.HR_COMPANY_CS,
            HrCompanyEmailInfo.HR_COMPANY_EMAIL_INFO,
            HrCompanyFeature.HR_COMPANY_FEATURE,
            HrCompanyInterview.HR_COMPANY_INTERVIEW,
            HrCompanyRecruitProcess.HR_COMPANY_RECRUIT_PROCESS,
            HrCompanyRecruitProcessItems.HR_COMPANY_RECRUIT_PROCESS_ITEMS,
            HrCompanyReferralConf.HR_COMPANY_REFERRAL_CONF,
            HrCompanyWorkwxConf.HR_COMPANY_WORKWX_CONF,
            HrDashboardConfig.HR_DASHBOARD_CONFIG,
            HrEmployeeCertConf.HR_EMPLOYEE_CERT_CONF,
            HrEmployeeCustomFields.HR_EMPLOYEE_CUSTOM_FIELDS,
            HrEmployeePosition.HR_EMPLOYEE_POSITION,
            HrEmployeeSection.HR_EMPLOYEE_SECTION,
            HrFeedback.HR_FEEDBACK,
            HrGroupCompany.HR_GROUP_COMPANY,
            HrGroupCompanyRel.HR_GROUP_COMPANY_REL,
            HrHbConfig.HR_HB_CONFIG,
            HrHbItems.HR_HB_ITEMS,
            HrHbPositionBinding.HR_HB_POSITION_BINDING,
            HrHbScratchCard.HR_HB_SCRATCH_CARD,
            HrHbSendRecord.HR_HB_SEND_RECORD,
            HrHbTheme.HR_HB_THEME,
            HrHeadhunterAccount.HR_HEADHUNTER_ACCOUNT,
            HrHeadhunterCandidate.HR_HEADHUNTER_CANDIDATE,
            HrHeadhunterCompany.HR_HEADHUNTER_COMPANY,
            HrHeadhunterJob.HR_HEADHUNTER_JOB,
            HrHeadhunterOmsConf.HR_HEADHUNTER_OMS_CONF,
            HrHeadhunterProfile.HR_HEADHUNTER_PROFILE,
            HrHtml5Statistics.HR_HTML5_STATISTICS,
            HrHtml5UniqueStatistics.HR_HTML5_UNIQUE_STATISTICS,
            HrImporterMonitor.HR_IMPORTER_MONITOR,
            HrInterviewAddress.HR_INTERVIEW_ADDRESS,
            HrInterviewConcrete.HR_INTERVIEW_CONCRETE,
            HrInterviewFeedbackResultAnswerSheet.HR_INTERVIEW_FEEDBACK_RESULT_ANSWER_SHEET,
            HrInterviewFeedbackResultItemAnswer.HR_INTERVIEW_FEEDBACK_RESULT_ITEM_ANSWER,
            HrInterviewFeedbackTemplate.HR_INTERVIEW_FEEDBACK_TEMPLATE,
            HrInterviewFeedbackTemplateItem.HR_INTERVIEW_FEEDBACK_TEMPLATE_ITEM,
            HrInterviewFeedbackTemplateItemOption.HR_INTERVIEW_FEEDBACK_TEMPLATE_ITEM_OPTION,
            HrInterviewNotice.HR_INTERVIEW_NOTICE,
            HrInterviewProcess.HR_INTERVIEW_PROCESS,
            HrInterviewProcessRound.HR_INTERVIEW_PROCESS_ROUND,
            HrLeaderBoard.HR_LEADER_BOARD,
            HrNps.HR_NPS,
            HrNpsRecommend.HR_NPS_RECOMMEND,
            HrOperationAllRecord.HR_OPERATION_ALL_RECORD,
            HrOperationRecord.HR_OPERATION_RECORD,
            HrPointsConf.HR_POINTS_CONF,
            HrRecruitStatistics.HR_RECRUIT_STATISTICS,
            HrRecruitUniqueStatistics.HR_RECRUIT_UNIQUE_STATISTICS,
            HrReferralRuleConfig.HR_REFERRAL_RULE_CONFIG,
            HrReferralStatistics.HR_REFERRAL_STATISTICS,
            HrResource.HR_RESOURCE,
            HrRuleStatistics.HR_RULE_STATISTICS,
            HrRuleUniqueStatistics.HR_RULE_UNIQUE_STATISTICS,
            HrSearchCondition.HR_SEARCH_CONDITION,
            HrSuperaccountApply.HR_SUPERACCOUNT_APPLY,
            HrTalentpool.HR_TALENTPOOL,
            HrTeam.HR_TEAM,
            HrTeamMember.HR_TEAM_MEMBER,
            HrThirdPartyAccount.HR_THIRD_PARTY_ACCOUNT,
            HrThirdPartyAccountHr.HR_THIRD_PARTY_ACCOUNT_HR,
            HrThirdPartyPosition.HR_THIRD_PARTY_POSITION,
            HrTopic.HR_TOPIC,
            HrWxBasicReply.HR_WX_BASIC_REPLY,
            HrWxHrChat.HR_WX_HR_CHAT,
            HrWxHrChatList.HR_WX_HR_CHAT_LIST,
            HrWxHrChatVoice.HR_WX_HR_CHAT_VOICE,
            HrWxImageReply.HR_WX_IMAGE_REPLY,
            HrWxModule.HR_WX_MODULE,
            HrWxNewsReply.HR_WX_NEWS_REPLY,
            HrWxNoticeMessage.HR_WX_NOTICE_MESSAGE,
            HrWxRule.HR_WX_RULE,
            HrWxTemplateMessage.HR_WX_TEMPLATE_MESSAGE,
            HrWxWechat.HR_WX_WECHAT,
            HrWxWechatNoticeSyncStatus.HR_WX_WECHAT_NOTICE_SYNC_STATUS,
            HrWxWechatQrcode.HR_WX_WECHAT_QRCODE);
    }
}
