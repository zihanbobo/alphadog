/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb;


import com.moseeker.baseorm.db.hrdb.tables.HrAiConf;
import com.moseeker.baseorm.db.hrdb.tables.HrAppCvConf;
import com.moseeker.baseorm.db.hrdb.tables.HrAppExportFields;
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
import com.moseeker.baseorm.db.hrdb.tables.HrCompanyReferralConf;
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
import com.moseeker.baseorm.db.hrdb.tables.HrHtml5Statistics;
import com.moseeker.baseorm.db.hrdb.tables.HrHtml5UniqueStatistics;
import com.moseeker.baseorm.db.hrdb.tables.HrImporterMonitor;
import com.moseeker.baseorm.db.hrdb.tables.HrLeaderBoard;
import com.moseeker.baseorm.db.hrdb.tables.HrNps;
import com.moseeker.baseorm.db.hrdb.tables.HrNpsRecommend;
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
import com.moseeker.baseorm.db.hrdb.tables.HrWxWechat_20180127chendi;

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

    private static final long serialVersionUID = 758895117;

    /**
     * The reference instance of <code>hrdb</code>
     */
    public static final Hrdb HRDB = new Hrdb();

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
     * 公司内推配置表
     */
    public final HrCompanyReferralConf HR_COMPANY_REFERRAL_CONF = com.moseeker.baseorm.db.hrdb.tables.HrCompanyReferralConf.HR_COMPANY_REFERRAL_CONF;

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
     * The table <code>hrdb.hr_hb_items_backup_chendi_180625</code>.
     */
    public final HrHbItemsBackupChendi_180625 HR_HB_ITEMS_BACKUP_CHENDI_180625 = com.moseeker.baseorm.db.hrdb.tables.HrHbItemsBackupChendi_180625.HR_HB_ITEMS_BACKUP_CHENDI_180625;

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
     * The table <code>hrdb.hr_team_20180118_chendi</code>.
     */
    public final HrTeam_20180118Chendi HR_TEAM_20180118_CHENDI = com.moseeker.baseorm.db.hrdb.tables.HrTeam_20180118Chendi.HR_TEAM_20180118_CHENDI;

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
     * The table <code>hrdb.hr_wx_wechat_20180127chendi</code>.
     */
    public final HrWxWechat_20180127chendi HR_WX_WECHAT_20180127CHENDI = com.moseeker.baseorm.db.hrdb.tables.HrWxWechat_20180127chendi.HR_WX_WECHAT_20180127CHENDI;

    /**
     * 微信消息通知同步状态
     */
    public final HrWxWechatNoticeSyncStatus HR_WX_WECHAT_NOTICE_SYNC_STATUS = com.moseeker.baseorm.db.hrdb.tables.HrWxWechatNoticeSyncStatus.HR_WX_WECHAT_NOTICE_SYNC_STATUS;

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
            HrAiConf.HR_AI_CONF,
            HrAppCvConf.HR_APP_CV_CONF,
            HrAppExportFields.HR_APP_EXPORT_FIELDS,
            HrChatUnreadCount.HR_CHAT_UNREAD_COUNT,
            HrCmsMedia.HR_CMS_MEDIA,
            HrCmsModule.HR_CMS_MODULE,
            HrCmsPages.HR_CMS_PAGES,
            HrCompany.HR_COMPANY,
            HrCompanyAccount.HR_COMPANY_ACCOUNT,
            HrCompanyConf.HR_COMPANY_CONF,
            HrCompanyCs.HR_COMPANY_CS,
            HrCompanyEmailInfo.HR_COMPANY_EMAIL_INFO,
            HrCompanyFeature.HR_COMPANY_FEATURE,
            HrCompanyReferralConf.HR_COMPANY_REFERRAL_CONF,
            HrEmployeeCertConf.HR_EMPLOYEE_CERT_CONF,
            HrEmployeeCustomFields.HR_EMPLOYEE_CUSTOM_FIELDS,
            HrEmployeePosition.HR_EMPLOYEE_POSITION,
            HrEmployeeSection.HR_EMPLOYEE_SECTION,
            HrFeedback.HR_FEEDBACK,
            HrGroupCompany.HR_GROUP_COMPANY,
            HrGroupCompanyRel.HR_GROUP_COMPANY_REL,
            HrHbConfig.HR_HB_CONFIG,
            HrHbItems.HR_HB_ITEMS,
            HrHbItemsBackupChendi_180625.HR_HB_ITEMS_BACKUP_CHENDI_180625,
            HrHbPositionBinding.HR_HB_POSITION_BINDING,
            HrHbScratchCard.HR_HB_SCRATCH_CARD,
            HrHbSendRecord.HR_HB_SEND_RECORD,
            HrHtml5Statistics.HR_HTML5_STATISTICS,
            HrHtml5UniqueStatistics.HR_HTML5_UNIQUE_STATISTICS,
            HrImporterMonitor.HR_IMPORTER_MONITOR,
            HrLeaderBoard.HR_LEADER_BOARD,
            HrNps.HR_NPS,
            HrNpsRecommend.HR_NPS_RECOMMEND,
            HrOperationRecord.HR_OPERATION_RECORD,
            HrPointsConf.HR_POINTS_CONF,
            HrRecruitStatistics.HR_RECRUIT_STATISTICS,
            HrRecruitUniqueStatistics.HR_RECRUIT_UNIQUE_STATISTICS,
            HrReferralStatistics.HR_REFERRAL_STATISTICS,
            HrResource.HR_RESOURCE,
            HrRuleStatistics.HR_RULE_STATISTICS,
            HrRuleUniqueStatistics.HR_RULE_UNIQUE_STATISTICS,
            HrSearchCondition.HR_SEARCH_CONDITION,
            HrSuperaccountApply.HR_SUPERACCOUNT_APPLY,
            HrTalentpool.HR_TALENTPOOL,
            HrTeam.HR_TEAM,
            HrTeam_20180118Chendi.HR_TEAM_20180118_CHENDI,
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
            HrWxWechat_20180127chendi.HR_WX_WECHAT_20180127CHENDI,
            HrWxWechatNoticeSyncStatus.HR_WX_WECHAT_NOTICE_SYNC_STATUS);
    }
}
