/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.referraldb;


import com.moseeker.baseorm.db.referraldb.tables.ReferralApplicationStatusCount;
import com.moseeker.baseorm.db.referraldb.tables.ReferralCompanyConf;
import com.moseeker.baseorm.db.referraldb.tables.ReferralEmployeeBonusRecord;
import com.moseeker.baseorm.db.referraldb.tables.ReferralEmployeeRegisterLog;
import com.moseeker.baseorm.db.referraldb.tables.ReferralLog;
import com.moseeker.baseorm.db.referraldb.tables.ReferralPositionBonus;
import com.moseeker.baseorm.db.referraldb.tables.ReferralPositionBonusStageDetail;
import com.moseeker.baseorm.db.referraldb.tables.ReferralRecomEvaluation;
import com.moseeker.baseorm.db.referraldb.tables.ReferralRecomHbPosition;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in referraldb
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
     * 红包活动职位申请状态统计
     */
    public static final ReferralApplicationStatusCount REFERRAL_APPLICATION_STATUS_COUNT = com.moseeker.baseorm.db.referraldb.tables.ReferralApplicationStatusCount.REFERRAL_APPLICATION_STATUS_COUNT;

    /**
     * The table <code>referraldb.referral_company_conf</code>.
     */
    public static final ReferralCompanyConf REFERRAL_COMPANY_CONF = com.moseeker.baseorm.db.referraldb.tables.ReferralCompanyConf.REFERRAL_COMPANY_CONF;

    /**
     * The table <code>referraldb.referral_employee_bonus_record</code>.
     */
    public static final ReferralEmployeeBonusRecord REFERRAL_EMPLOYEE_BONUS_RECORD = com.moseeker.baseorm.db.referraldb.tables.ReferralEmployeeBonusRecord.REFERRAL_EMPLOYEE_BONUS_RECORD;

    /**
     * 员工认证取消认证操作记录
     */
    public static final ReferralEmployeeRegisterLog REFERRAL_EMPLOYEE_REGISTER_LOG = com.moseeker.baseorm.db.referraldb.tables.ReferralEmployeeRegisterLog.REFERRAL_EMPLOYEE_REGISTER_LOG;

    /**
     * 内推记录
     */
    public static final ReferralLog REFERRAL_LOG = com.moseeker.baseorm.db.referraldb.tables.ReferralLog.REFERRAL_LOG;

    /**
     * The table <code>referraldb.referral_position_bonus</code>.
     */
    public static final ReferralPositionBonus REFERRAL_POSITION_BONUS = com.moseeker.baseorm.db.referraldb.tables.ReferralPositionBonus.REFERRAL_POSITION_BONUS;

    /**
     * The table <code>referraldb.referral_position_bonus_stage_detail</code>.
     */
    public static final ReferralPositionBonusStageDetail REFERRAL_POSITION_BONUS_STAGE_DETAIL = com.moseeker.baseorm.db.referraldb.tables.ReferralPositionBonusStageDetail.REFERRAL_POSITION_BONUS_STAGE_DETAIL;

    /**
     * 推荐人推荐理由信息
     */
    public static final ReferralRecomEvaluation REFERRAL_RECOM_EVALUATION = com.moseeker.baseorm.db.referraldb.tables.ReferralRecomEvaluation.REFERRAL_RECOM_EVALUATION;

    /**
     * 推荐类红包与被推荐人关系表
     */
    public static final ReferralRecomHbPosition REFERRAL_RECOM_HB_POSITION = com.moseeker.baseorm.db.referraldb.tables.ReferralRecomHbPosition.REFERRAL_RECOM_HB_POSITION;
}
