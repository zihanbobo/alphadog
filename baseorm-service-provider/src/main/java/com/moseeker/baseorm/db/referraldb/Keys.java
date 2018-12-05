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
import com.moseeker.baseorm.db.referraldb.tables.records.ReferralApplicationStatusCountRecord;
import com.moseeker.baseorm.db.referraldb.tables.records.ReferralCompanyConfRecord;
import com.moseeker.baseorm.db.referraldb.tables.records.ReferralEmployeeBonusRecordRecord;
import com.moseeker.baseorm.db.referraldb.tables.records.ReferralEmployeeRegisterLogRecord;
import com.moseeker.baseorm.db.referraldb.tables.records.ReferralLogRecord;
import com.moseeker.baseorm.db.referraldb.tables.records.ReferralPositionBonusRecord;
import com.moseeker.baseorm.db.referraldb.tables.records.ReferralPositionBonusStageDetailRecord;
import com.moseeker.baseorm.db.referraldb.tables.records.ReferralRecomEvaluationRecord;
import com.moseeker.baseorm.db.referraldb.tables.records.ReferralRecomHbPositionRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>referraldb</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<ReferralApplicationStatusCountRecord, Integer> IDENTITY_REFERRAL_APPLICATION_STATUS_COUNT = Identities0.IDENTITY_REFERRAL_APPLICATION_STATUS_COUNT;
    public static final Identity<ReferralCompanyConfRecord, Integer> IDENTITY_REFERRAL_COMPANY_CONF = Identities0.IDENTITY_REFERRAL_COMPANY_CONF;
    public static final Identity<ReferralEmployeeBonusRecordRecord, Integer> IDENTITY_REFERRAL_EMPLOYEE_BONUS_RECORD = Identities0.IDENTITY_REFERRAL_EMPLOYEE_BONUS_RECORD;
    public static final Identity<ReferralEmployeeRegisterLogRecord, Integer> IDENTITY_REFERRAL_EMPLOYEE_REGISTER_LOG = Identities0.IDENTITY_REFERRAL_EMPLOYEE_REGISTER_LOG;
    public static final Identity<ReferralLogRecord, Integer> IDENTITY_REFERRAL_LOG = Identities0.IDENTITY_REFERRAL_LOG;
    public static final Identity<ReferralPositionBonusRecord, Integer> IDENTITY_REFERRAL_POSITION_BONUS = Identities0.IDENTITY_REFERRAL_POSITION_BONUS;
    public static final Identity<ReferralPositionBonusStageDetailRecord, Integer> IDENTITY_REFERRAL_POSITION_BONUS_STAGE_DETAIL = Identities0.IDENTITY_REFERRAL_POSITION_BONUS_STAGE_DETAIL;
    public static final Identity<ReferralRecomEvaluationRecord, Integer> IDENTITY_REFERRAL_RECOM_EVALUATION = Identities0.IDENTITY_REFERRAL_RECOM_EVALUATION;
    public static final Identity<ReferralRecomHbPositionRecord, Integer> IDENTITY_REFERRAL_RECOM_HB_POSITION = Identities0.IDENTITY_REFERRAL_RECOM_HB_POSITION;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<ReferralApplicationStatusCountRecord> KEY_REFERRAL_APPLICATION_STATUS_COUNT_PRIMARY = UniqueKeys0.KEY_REFERRAL_APPLICATION_STATUS_COUNT_PRIMARY;
    public static final UniqueKey<ReferralApplicationStatusCountRecord> KEY_REFERRAL_APPLICATION_STATUS_COUNT_REFERRAL_APPLICATION_STATUS_APPLICATION_ID_TPL_STATUS_PK = UniqueKeys0.KEY_REFERRAL_APPLICATION_STATUS_COUNT_REFERRAL_APPLICATION_STATUS_APPLICATION_ID_TPL_STATUS_PK;
    public static final UniqueKey<ReferralCompanyConfRecord> KEY_REFERRAL_COMPANY_CONF_PRIMARY = UniqueKeys0.KEY_REFERRAL_COMPANY_CONF_PRIMARY;
    public static final UniqueKey<ReferralEmployeeBonusRecordRecord> KEY_REFERRAL_EMPLOYEE_BONUS_RECORD_PRIMARY = UniqueKeys0.KEY_REFERRAL_EMPLOYEE_BONUS_RECORD_PRIMARY;
    public static final UniqueKey<ReferralEmployeeRegisterLogRecord> KEY_REFERRAL_EMPLOYEE_REGISTER_LOG_PRIMARY = UniqueKeys0.KEY_REFERRAL_EMPLOYEE_REGISTER_LOG_PRIMARY;
    public static final UniqueKey<ReferralLogRecord> KEY_REFERRAL_LOG_PRIMARY = UniqueKeys0.KEY_REFERRAL_LOG_PRIMARY;
    public static final UniqueKey<ReferralLogRecord> KEY_REFERRAL_LOG_REFERRAL_LOG_UNIQUE = UniqueKeys0.KEY_REFERRAL_LOG_REFERRAL_LOG_UNIQUE;
    public static final UniqueKey<ReferralPositionBonusRecord> KEY_REFERRAL_POSITION_BONUS_PRIMARY = UniqueKeys0.KEY_REFERRAL_POSITION_BONUS_PRIMARY;
    public static final UniqueKey<ReferralPositionBonusRecord> KEY_REFERRAL_POSITION_BONUS_UNIQUE_IDX = UniqueKeys0.KEY_REFERRAL_POSITION_BONUS_UNIQUE_IDX;
    public static final UniqueKey<ReferralPositionBonusStageDetailRecord> KEY_REFERRAL_POSITION_BONUS_STAGE_DETAIL_PRIMARY = UniqueKeys0.KEY_REFERRAL_POSITION_BONUS_STAGE_DETAIL_PRIMARY;
    public static final UniqueKey<ReferralRecomEvaluationRecord> KEY_REFERRAL_RECOM_EVALUATION_PRIMARY = UniqueKeys0.KEY_REFERRAL_RECOM_EVALUATION_PRIMARY;
    public static final UniqueKey<ReferralRecomEvaluationRecord> KEY_REFERRAL_RECOM_EVALUATION_REFERRAL_RECOM_EVALUATION_POSITION_ID_POS_ID_PRESENTEE_PK = UniqueKeys0.KEY_REFERRAL_RECOM_EVALUATION_REFERRAL_RECOM_EVALUATION_POSITION_ID_POS_ID_PRESENTEE_PK;
    public static final UniqueKey<ReferralRecomHbPositionRecord> KEY_REFERRAL_RECOM_HB_POSITION_PRIMARY = UniqueKeys0.KEY_REFERRAL_RECOM_HB_POSITION_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<ReferralApplicationStatusCountRecord, Integer> IDENTITY_REFERRAL_APPLICATION_STATUS_COUNT = createIdentity(ReferralApplicationStatusCount.REFERRAL_APPLICATION_STATUS_COUNT, ReferralApplicationStatusCount.REFERRAL_APPLICATION_STATUS_COUNT.ID);
        public static Identity<ReferralCompanyConfRecord, Integer> IDENTITY_REFERRAL_COMPANY_CONF = createIdentity(ReferralCompanyConf.REFERRAL_COMPANY_CONF, ReferralCompanyConf.REFERRAL_COMPANY_CONF.ID);
        public static Identity<ReferralEmployeeBonusRecordRecord, Integer> IDENTITY_REFERRAL_EMPLOYEE_BONUS_RECORD = createIdentity(ReferralEmployeeBonusRecord.REFERRAL_EMPLOYEE_BONUS_RECORD, ReferralEmployeeBonusRecord.REFERRAL_EMPLOYEE_BONUS_RECORD.ID);
        public static Identity<ReferralEmployeeRegisterLogRecord, Integer> IDENTITY_REFERRAL_EMPLOYEE_REGISTER_LOG = createIdentity(ReferralEmployeeRegisterLog.REFERRAL_EMPLOYEE_REGISTER_LOG, ReferralEmployeeRegisterLog.REFERRAL_EMPLOYEE_REGISTER_LOG.ID);
        public static Identity<ReferralLogRecord, Integer> IDENTITY_REFERRAL_LOG = createIdentity(ReferralLog.REFERRAL_LOG, ReferralLog.REFERRAL_LOG.ID);
        public static Identity<ReferralPositionBonusRecord, Integer> IDENTITY_REFERRAL_POSITION_BONUS = createIdentity(ReferralPositionBonus.REFERRAL_POSITION_BONUS, ReferralPositionBonus.REFERRAL_POSITION_BONUS.ID);
        public static Identity<ReferralPositionBonusStageDetailRecord, Integer> IDENTITY_REFERRAL_POSITION_BONUS_STAGE_DETAIL = createIdentity(ReferralPositionBonusStageDetail.REFERRAL_POSITION_BONUS_STAGE_DETAIL, ReferralPositionBonusStageDetail.REFERRAL_POSITION_BONUS_STAGE_DETAIL.ID);
        public static Identity<ReferralRecomEvaluationRecord, Integer> IDENTITY_REFERRAL_RECOM_EVALUATION = createIdentity(ReferralRecomEvaluation.REFERRAL_RECOM_EVALUATION, ReferralRecomEvaluation.REFERRAL_RECOM_EVALUATION.ID);
        public static Identity<ReferralRecomHbPositionRecord, Integer> IDENTITY_REFERRAL_RECOM_HB_POSITION = createIdentity(ReferralRecomHbPosition.REFERRAL_RECOM_HB_POSITION, ReferralRecomHbPosition.REFERRAL_RECOM_HB_POSITION.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<ReferralApplicationStatusCountRecord> KEY_REFERRAL_APPLICATION_STATUS_COUNT_PRIMARY = createUniqueKey(ReferralApplicationStatusCount.REFERRAL_APPLICATION_STATUS_COUNT, "KEY_referral_application_status_count_PRIMARY", ReferralApplicationStatusCount.REFERRAL_APPLICATION_STATUS_COUNT.ID);
        public static final UniqueKey<ReferralApplicationStatusCountRecord> KEY_REFERRAL_APPLICATION_STATUS_COUNT_REFERRAL_APPLICATION_STATUS_APPLICATION_ID_TPL_STATUS_PK = createUniqueKey(ReferralApplicationStatusCount.REFERRAL_APPLICATION_STATUS_COUNT, "KEY_referral_application_status_count_referral_application_status_application_id_tpl_status_pk", ReferralApplicationStatusCount.REFERRAL_APPLICATION_STATUS_COUNT.APPLICATION_ID, ReferralApplicationStatusCount.REFERRAL_APPLICATION_STATUS_COUNT.APPICATION_TPL_STATUS);
        public static final UniqueKey<ReferralCompanyConfRecord> KEY_REFERRAL_COMPANY_CONF_PRIMARY = createUniqueKey(ReferralCompanyConf.REFERRAL_COMPANY_CONF, "KEY_referral_company_conf_PRIMARY", ReferralCompanyConf.REFERRAL_COMPANY_CONF.ID);
        public static final UniqueKey<ReferralEmployeeBonusRecordRecord> KEY_REFERRAL_EMPLOYEE_BONUS_RECORD_PRIMARY = createUniqueKey(ReferralEmployeeBonusRecord.REFERRAL_EMPLOYEE_BONUS_RECORD, "KEY_referral_employee_bonus_record_PRIMARY", ReferralEmployeeBonusRecord.REFERRAL_EMPLOYEE_BONUS_RECORD.ID);
        public static final UniqueKey<ReferralEmployeeRegisterLogRecord> KEY_REFERRAL_EMPLOYEE_REGISTER_LOG_PRIMARY = createUniqueKey(ReferralEmployeeRegisterLog.REFERRAL_EMPLOYEE_REGISTER_LOG, "KEY_referral_employee_register_log_PRIMARY", ReferralEmployeeRegisterLog.REFERRAL_EMPLOYEE_REGISTER_LOG.ID);
        public static final UniqueKey<ReferralLogRecord> KEY_REFERRAL_LOG_PRIMARY = createUniqueKey(ReferralLog.REFERRAL_LOG, "KEY_referral_log_PRIMARY", ReferralLog.REFERRAL_LOG.ID);
        public static final UniqueKey<ReferralLogRecord> KEY_REFERRAL_LOG_REFERRAL_LOG_UNIQUE = createUniqueKey(ReferralLog.REFERRAL_LOG, "KEY_referral_log_referral_log_unique", ReferralLog.REFERRAL_LOG.EMPLOYEE_ID, ReferralLog.REFERRAL_LOG.REFERENCE_ID, ReferralLog.REFERRAL_LOG.POSITION_ID);
        public static final UniqueKey<ReferralPositionBonusRecord> KEY_REFERRAL_POSITION_BONUS_PRIMARY = createUniqueKey(ReferralPositionBonus.REFERRAL_POSITION_BONUS, "KEY_referral_position_bonus_PRIMARY", ReferralPositionBonus.REFERRAL_POSITION_BONUS.ID);
        public static final UniqueKey<ReferralPositionBonusRecord> KEY_REFERRAL_POSITION_BONUS_UNIQUE_IDX = createUniqueKey(ReferralPositionBonus.REFERRAL_POSITION_BONUS, "KEY_referral_position_bonus_unique_idx", ReferralPositionBonus.REFERRAL_POSITION_BONUS.POSITION_ID);
        public static final UniqueKey<ReferralPositionBonusStageDetailRecord> KEY_REFERRAL_POSITION_BONUS_STAGE_DETAIL_PRIMARY = createUniqueKey(ReferralPositionBonusStageDetail.REFERRAL_POSITION_BONUS_STAGE_DETAIL, "KEY_referral_position_bonus_stage_detail_PRIMARY", ReferralPositionBonusStageDetail.REFERRAL_POSITION_BONUS_STAGE_DETAIL.ID);
        public static final UniqueKey<ReferralRecomEvaluationRecord> KEY_REFERRAL_RECOM_EVALUATION_PRIMARY = createUniqueKey(ReferralRecomEvaluation.REFERRAL_RECOM_EVALUATION, "KEY_referral_recom_evaluation_PRIMARY", ReferralRecomEvaluation.REFERRAL_RECOM_EVALUATION.ID);
        public static final UniqueKey<ReferralRecomEvaluationRecord> KEY_REFERRAL_RECOM_EVALUATION_REFERRAL_RECOM_EVALUATION_POSITION_ID_POS_ID_PRESENTEE_PK = createUniqueKey(ReferralRecomEvaluation.REFERRAL_RECOM_EVALUATION, "KEY_referral_recom_evaluation_referral_recom_evaluation_position_id_pos_id_presentee_pk", ReferralRecomEvaluation.REFERRAL_RECOM_EVALUATION.POSITION_ID, ReferralRecomEvaluation.REFERRAL_RECOM_EVALUATION.POST_USER_ID, ReferralRecomEvaluation.REFERRAL_RECOM_EVALUATION.PRESENTEE_USER_ID);
        public static final UniqueKey<ReferralRecomHbPositionRecord> KEY_REFERRAL_RECOM_HB_POSITION_PRIMARY = createUniqueKey(ReferralRecomHbPosition.REFERRAL_RECOM_HB_POSITION, "KEY_referral_recom_hb_position_PRIMARY", ReferralRecomHbPosition.REFERRAL_RECOM_HB_POSITION.ID);
    }
}
