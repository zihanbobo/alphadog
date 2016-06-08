/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.hrdb;


import com.moseeker.db.hrdb.tables.HrAppCvConf;
import com.moseeker.db.hrdb.tables.HrChildCompany;
import com.moseeker.db.hrdb.tables.HrCompany;
import com.moseeker.db.hrdb.tables.HrCompanyAccount;
import com.moseeker.db.hrdb.tables.HrCompanyConf;
import com.moseeker.db.hrdb.tables.HrEmployeeCertConf;
import com.moseeker.db.hrdb.tables.HrEmployeePosition;
import com.moseeker.db.hrdb.tables.HrEmployeeSection;
import com.moseeker.db.hrdb.tables.HrFeedback;
import com.moseeker.db.hrdb.tables.HrHbConfig;
import com.moseeker.db.hrdb.tables.HrHbItems;
import com.moseeker.db.hrdb.tables.HrHbPositionBinding;
import com.moseeker.db.hrdb.tables.HrHbScratchCard;
import com.moseeker.db.hrdb.tables.HrHbSendRecord;
import com.moseeker.db.hrdb.tables.HrHtml5Statistics;
import com.moseeker.db.hrdb.tables.HrHtml5UniqueStatistics;
import com.moseeker.db.hrdb.tables.HrImporterMonitor;
import com.moseeker.db.hrdb.tables.HrOperationRecord;
import com.moseeker.db.hrdb.tables.HrPointsConf;
import com.moseeker.db.hrdb.tables.HrRecruitStatistics;
import com.moseeker.db.hrdb.tables.HrRecruitUniqueStatistics;
import com.moseeker.db.hrdb.tables.HrReferralStatistics;
import com.moseeker.db.hrdb.tables.HrRuleStatistics;
import com.moseeker.db.hrdb.tables.HrRuleUniqueStatistics;
import com.moseeker.db.hrdb.tables.HrSuperaccountApply;
import com.moseeker.db.hrdb.tables.HrTopic;
import com.moseeker.db.hrdb.tables.HrWxBasicReply;
import com.moseeker.db.hrdb.tables.HrWxHrChat;
import com.moseeker.db.hrdb.tables.HrWxHrChatList;
import com.moseeker.db.hrdb.tables.HrWxImageReply;
import com.moseeker.db.hrdb.tables.HrWxModule;
import com.moseeker.db.hrdb.tables.HrWxNewsReply;
import com.moseeker.db.hrdb.tables.HrWxNoticeMessage;
import com.moseeker.db.hrdb.tables.HrWxRule;
import com.moseeker.db.hrdb.tables.HrWxTemplateMessage;
import com.moseeker.db.hrdb.tables.HrWxWechat;
import com.moseeker.db.hrdb.tables.HrWxWechatNoticeSyncStatus;
import com.moseeker.db.hrdb.tables.SysWechatAppConf;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in hrdb
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

	/**
	 * 企业申请简历校验配置
	 */
	public static final HrAppCvConf HR_APP_CV_CONF = com.moseeker.db.hrdb.tables.HrAppCvConf.HR_APP_CV_CONF;

	/**
	 * 子公司表
	 */
	public static final HrChildCompany HR_CHILD_COMPANY = com.moseeker.db.hrdb.tables.HrChildCompany.HR_CHILD_COMPANY;

	/**
	 * 公司表
	 */
	public static final HrCompany HR_COMPANY = com.moseeker.db.hrdb.tables.HrCompany.HR_COMPANY;

	/**
	 * 账号公司关联记录
	 */
	public static final HrCompanyAccount HR_COMPANY_ACCOUNT = com.moseeker.db.hrdb.tables.HrCompanyAccount.HR_COMPANY_ACCOUNT;

	/**
	 * 公司级别的配置信息表
	 */
	public static final HrCompanyConf HR_COMPANY_CONF = com.moseeker.db.hrdb.tables.HrCompanyConf.HR_COMPANY_CONF;

	/**
	 * 部门员工配置表
	 */
	public static final HrEmployeeCertConf HR_EMPLOYEE_CERT_CONF = com.moseeker.db.hrdb.tables.HrEmployeeCertConf.HR_EMPLOYEE_CERT_CONF;

	/**
	 * 员工职能表
	 */
	public static final HrEmployeePosition HR_EMPLOYEE_POSITION = com.moseeker.db.hrdb.tables.HrEmployeePosition.HR_EMPLOYEE_POSITION;

	/**
	 * 员工部门表
	 */
	public static final HrEmployeeSection HR_EMPLOYEE_SECTION = com.moseeker.db.hrdb.tables.HrEmployeeSection.HR_EMPLOYEE_SECTION;

	/**
	 * HR反馈表
	 */
	public static final HrFeedback HR_FEEDBACK = com.moseeker.db.hrdb.tables.HrFeedback.HR_FEEDBACK;

	/**
	 * 红包配置表
	 */
	public static final HrHbConfig HR_HB_CONFIG = com.moseeker.db.hrdb.tables.HrHbConfig.HR_HB_CONFIG;

	/**
	 * 红包记录表
	 */
	public static final HrHbItems HR_HB_ITEMS = com.moseeker.db.hrdb.tables.HrHbItems.HR_HB_ITEMS;

	/**
	 * 红包配置和职位绑定表
	 */
	public static final HrHbPositionBinding HR_HB_POSITION_BINDING = com.moseeker.db.hrdb.tables.HrHbPositionBinding.HR_HB_POSITION_BINDING;

	/**
	 * 新红包刮刮卡记录表
	 */
	public static final HrHbScratchCard HR_HB_SCRATCH_CARD = com.moseeker.db.hrdb.tables.HrHbScratchCard.HR_HB_SCRATCH_CARD;

	/**
	 * 红包发送记录
	 */
	public static final HrHbSendRecord HR_HB_SEND_RECORD = com.moseeker.db.hrdb.tables.HrHbSendRecord.HR_HB_SEND_RECORD;

	/**
	 * 专题传播统计次数表
	 */
	public static final HrHtml5Statistics HR_HTML5_STATISTICS = com.moseeker.db.hrdb.tables.HrHtml5Statistics.HR_HTML5_STATISTICS;

	/**
	 * 专题传播统计去重信息表
	 */
	public static final HrHtml5UniqueStatistics HR_HTML5_UNIQUE_STATISTICS = com.moseeker.db.hrdb.tables.HrHtml5UniqueStatistics.HR_HTML5_UNIQUE_STATISTICS;

	/**
	 * 企业用户导入数据异步处理监控操作表
	 */
	public static final HrImporterMonitor HR_IMPORTER_MONITOR = com.moseeker.db.hrdb.tables.HrImporterMonitor.HR_IMPORTER_MONITOR;

	/**
	 * hr申请状态操作记录
	 */
	public static final HrOperationRecord HR_OPERATION_RECORD = com.moseeker.db.hrdb.tables.HrOperationRecord.HR_OPERATION_RECORD;

	/**
	 * 雇主积分规则配置表
	 */
	public static final HrPointsConf HR_POINTS_CONF = com.moseeker.db.hrdb.tables.HrPointsConf.HR_POINTS_CONF;

	/**
	 * 招聘数据次数统计表
	 */
	public static final HrRecruitStatistics HR_RECRUIT_STATISTICS = com.moseeker.db.hrdb.tables.HrRecruitStatistics.HR_RECRUIT_STATISTICS;

	/**
	 * 招聘数据去重信息统计表
	 */
	public static final HrRecruitUniqueStatistics HR_RECRUIT_UNIQUE_STATISTICS = com.moseeker.db.hrdb.tables.HrRecruitUniqueStatistics.HR_RECRUIT_UNIQUE_STATISTICS;

	/**
	 * 内推统计表
	 */
	public static final HrReferralStatistics HR_REFERRAL_STATISTICS = com.moseeker.db.hrdb.tables.HrReferralStatistics.HR_REFERRAL_STATISTICS;

	/**
	 * 微信图文传播次数统计表
	 */
	public static final HrRuleStatistics HR_RULE_STATISTICS = com.moseeker.db.hrdb.tables.HrRuleStatistics.HR_RULE_STATISTICS;

	/**
	 * 微信图文传播去重信息统计表
	 */
	public static final HrRuleUniqueStatistics HR_RULE_UNIQUE_STATISTICS = com.moseeker.db.hrdb.tables.HrRuleUniqueStatistics.HR_RULE_UNIQUE_STATISTICS;

	/**
	 * 升级超级账号申请表
	 */
	public static final HrSuperaccountApply HR_SUPERACCOUNT_APPLY = com.moseeker.db.hrdb.tables.HrSuperaccountApply.HR_SUPERACCOUNT_APPLY;

	/**
	 * 雇主主题活动表
	 */
	public static final HrTopic HR_TOPIC = com.moseeker.db.hrdb.tables.HrTopic.HR_TOPIC;

	/**
	 * 微信文本回复表
	 */
	public static final HrWxBasicReply HR_WX_BASIC_REPLY = com.moseeker.db.hrdb.tables.HrWxBasicReply.HR_WX_BASIC_REPLY;

	/**
	 * IM聊天
	 */
	public static final HrWxHrChat HR_WX_HR_CHAT = com.moseeker.db.hrdb.tables.HrWxHrChat.HR_WX_HR_CHAT;

	/**
	 * IM聊天人关系
	 */
	public static final HrWxHrChatList HR_WX_HR_CHAT_LIST = com.moseeker.db.hrdb.tables.HrWxHrChatList.HR_WX_HR_CHAT_LIST;

	/**
	 * 微信图片回复
	 */
	public static final HrWxImageReply HR_WX_IMAGE_REPLY = com.moseeker.db.hrdb.tables.HrWxImageReply.HR_WX_IMAGE_REPLY;

	/**
	 * 微信模块表
	 */
	public static final HrWxModule HR_WX_MODULE = com.moseeker.db.hrdb.tables.HrWxModule.HR_WX_MODULE;

	/**
	 * 微信图文回复表
	 */
	public static final HrWxNewsReply HR_WX_NEWS_REPLY = com.moseeker.db.hrdb.tables.HrWxNewsReply.HR_WX_NEWS_REPLY;

	/**
	 * 微信消息通知, first和remark文案暂不使用
	 */
	public static final HrWxNoticeMessage HR_WX_NOTICE_MESSAGE = com.moseeker.db.hrdb.tables.HrWxNoticeMessage.HR_WX_NOTICE_MESSAGE;

	/**
	 * 微信回复规则表
	 */
	public static final HrWxRule HR_WX_RULE = com.moseeker.db.hrdb.tables.HrWxRule.HR_WX_RULE;

	/**
	 * 微信模板消息
	 */
	public static final HrWxTemplateMessage HR_WX_TEMPLATE_MESSAGE = com.moseeker.db.hrdb.tables.HrWxTemplateMessage.HR_WX_TEMPLATE_MESSAGE;

	/**
	 * 微信公众号表
	 */
	public static final HrWxWechat HR_WX_WECHAT = com.moseeker.db.hrdb.tables.HrWxWechat.HR_WX_WECHAT;

	/**
	 * 微信消息通知同步状态
	 */
	public static final HrWxWechatNoticeSyncStatus HR_WX_WECHAT_NOTICE_SYNC_STATUS = com.moseeker.db.hrdb.tables.HrWxWechatNoticeSyncStatus.HR_WX_WECHAT_NOTICE_SYNC_STATUS;

	/**
	 * The table hrdb.sys_wechat_app_conf
	 */
	public static final SysWechatAppConf SYS_WECHAT_APP_CONF = com.moseeker.db.hrdb.tables.SysWechatAppConf.SYS_WECHAT_APP_CONF;
}