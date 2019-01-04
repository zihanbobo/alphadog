/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.referraldb;


import com.moseeker.baseorm.db.referraldb.tables.EmployeeReferralRecord;
import com.moseeker.baseorm.db.referraldb.tables.HistoryReferralPositionRel;
import com.moseeker.baseorm.db.referraldb.tables.HrEmployeeCertConf;
import com.moseeker.baseorm.db.referraldb.tables.HrEmployeeCustomFields;
import com.moseeker.baseorm.db.referraldb.tables.HrGroupCompany;
import com.moseeker.baseorm.db.referraldb.tables.HrGroupCompanyRel;
import com.moseeker.baseorm.db.referraldb.tables.HrImporterMonitor;
import com.moseeker.baseorm.db.referraldb.tables.ReferralApplicationStatusCount;
import com.moseeker.baseorm.db.referraldb.tables.ReferralCompanyConf;
import com.moseeker.baseorm.db.referraldb.tables.ReferralConnectionChain;
import com.moseeker.baseorm.db.referraldb.tables.ReferralConnectionLog;
import com.moseeker.baseorm.db.referraldb.tables.ReferralEmployeeBonusRecord;
import com.moseeker.baseorm.db.referraldb.tables.ReferralEmployeeNetworkResources;
import com.moseeker.baseorm.db.referraldb.tables.ReferralEmployeeRegisterLog;
import com.moseeker.baseorm.db.referraldb.tables.ReferralLog;
import com.moseeker.baseorm.db.referraldb.tables.ReferralPositionBonus;
import com.moseeker.baseorm.db.referraldb.tables.ReferralPositionBonusStageDetail;
import com.moseeker.baseorm.db.referraldb.tables.ReferralPositionRel;
import com.moseeker.baseorm.db.referraldb.tables.ReferralRecomEvaluation;
import com.moseeker.baseorm.db.referraldb.tables.ReferralRecomHbPosition;
import com.moseeker.baseorm.db.referraldb.tables.ReferralSeekRecommend;
import com.moseeker.baseorm.db.referraldb.tables.TestTable;
import com.moseeker.baseorm.db.referraldb.tables.UserEmployee;
import com.moseeker.baseorm.db.referraldb.tables.records.EmployeeReferralRecordRecord;
import com.moseeker.baseorm.db.referraldb.tables.records.HistoryReferralPositionRelRecord;
import com.moseeker.baseorm.db.referraldb.tables.records.HrEmployeeCertConfRecord;
import com.moseeker.baseorm.db.referraldb.tables.records.HrEmployeeCustomFieldsRecord;
import com.moseeker.baseorm.db.referraldb.tables.records.HrGroupCompanyRecord;
import com.moseeker.baseorm.db.referraldb.tables.records.HrGroupCompanyRelRecord;
import com.moseeker.baseorm.db.referraldb.tables.records.HrImporterMonitorRecord;
import com.moseeker.baseorm.db.referraldb.tables.records.ReferralApplicationStatusCountRecord;
import com.moseeker.baseorm.db.referraldb.tables.records.ReferralCompanyConfRecord;
import com.moseeker.baseorm.db.referraldb.tables.records.ReferralConnectionChainRecord;
import com.moseeker.baseorm.db.referraldb.tables.records.ReferralConnectionLogRecord;
import com.moseeker.baseorm.db.referraldb.tables.records.ReferralEmployeeBonusRecordRecord;
import com.moseeker.baseorm.db.referraldb.tables.records.ReferralEmployeeNetworkResourcesRecord;
import com.moseeker.baseorm.db.referraldb.tables.records.ReferralEmployeeRegisterLogRecord;
import com.moseeker.baseorm.db.referraldb.tables.records.ReferralLogRecord;
import com.moseeker.baseorm.db.referraldb.tables.records.ReferralPositionBonusRecord;
import com.moseeker.baseorm.db.referraldb.tables.records.ReferralPositionBonusStageDetailRecord;
import com.moseeker.baseorm.db.referraldb.tables.records.ReferralPositionRelRecord;
import com.moseeker.baseorm.db.referraldb.tables.records.ReferralRecomEvaluationRecord;
import com.moseeker.baseorm.db.referraldb.tables.records.ReferralRecomHbPositionRecord;
import com.moseeker.baseorm.db.referraldb.tables.records.ReferralSeekRecommendRecord;
import com.moseeker.baseorm.db.referraldb.tables.records.TestTableRecord;
import com.moseeker.baseorm.db.referraldb.tables.records.UserEmployeeRecord;

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

    public static final Identity<EmployeeReferralRecordRecord, Integer> IDENTITY_EMPLOYEE_REFERRAL_RECORD = Identities0.IDENTITY_EMPLOYEE_REFERRAL_RECORD;
    public static final Identity<HistoryReferralPositionRelRecord, Integer> IDENTITY_HISTORY_REFERRAL_POSITION_REL = Identities0.IDENTITY_HISTORY_REFERRAL_POSITION_REL;
    public static final Identity<HrEmployeeCertConfRecord, Integer> IDENTITY_HR_EMPLOYEE_CERT_CONF = Identities0.IDENTITY_HR_EMPLOYEE_CERT_CONF;
    public static final Identity<HrEmployeeCustomFieldsRecord, Integer> IDENTITY_HR_EMPLOYEE_CUSTOM_FIELDS = Identities0.IDENTITY_HR_EMPLOYEE_CUSTOM_FIELDS;
    public static final Identity<HrGroupCompanyRecord, Integer> IDENTITY_HR_GROUP_COMPANY = Identities0.IDENTITY_HR_GROUP_COMPANY;
    public static final Identity<HrGroupCompanyRelRecord, Integer> IDENTITY_HR_GROUP_COMPANY_REL = Identities0.IDENTITY_HR_GROUP_COMPANY_REL;
    public static final Identity<HrImporterMonitorRecord, Integer> IDENTITY_HR_IMPORTER_MONITOR = Identities0.IDENTITY_HR_IMPORTER_MONITOR;
    public static final Identity<ReferralApplicationStatusCountRecord, Integer> IDENTITY_REFERRAL_APPLICATION_STATUS_COUNT = Identities0.IDENTITY_REFERRAL_APPLICATION_STATUS_COUNT;
    public static final Identity<ReferralCompanyConfRecord, Integer> IDENTITY_REFERRAL_COMPANY_CONF = Identities0.IDENTITY_REFERRAL_COMPANY_CONF;
    public static final Identity<ReferralConnectionChainRecord, Integer> IDENTITY_REFERRAL_CONNECTION_CHAIN = Identities0.IDENTITY_REFERRAL_CONNECTION_CHAIN;
    public static final Identity<ReferralConnectionLogRecord, Integer> IDENTITY_REFERRAL_CONNECTION_LOG = Identities0.IDENTITY_REFERRAL_CONNECTION_LOG;
    public static final Identity<ReferralEmployeeBonusRecordRecord, Integer> IDENTITY_REFERRAL_EMPLOYEE_BONUS_RECORD = Identities0.IDENTITY_REFERRAL_EMPLOYEE_BONUS_RECORD;
    public static final Identity<ReferralEmployeeNetworkResourcesRecord, Integer> IDENTITY_REFERRAL_EMPLOYEE_NETWORK_RESOURCES = Identities0.IDENTITY_REFERRAL_EMPLOYEE_NETWORK_RESOURCES;
    public static final Identity<ReferralEmployeeRegisterLogRecord, Integer> IDENTITY_REFERRAL_EMPLOYEE_REGISTER_LOG = Identities0.IDENTITY_REFERRAL_EMPLOYEE_REGISTER_LOG;
    public static final Identity<ReferralLogRecord, Integer> IDENTITY_REFERRAL_LOG = Identities0.IDENTITY_REFERRAL_LOG;
    public static final Identity<ReferralPositionBonusRecord, Integer> IDENTITY_REFERRAL_POSITION_BONUS = Identities0.IDENTITY_REFERRAL_POSITION_BONUS;
    public static final Identity<ReferralPositionBonusStageDetailRecord, Integer> IDENTITY_REFERRAL_POSITION_BONUS_STAGE_DETAIL = Identities0.IDENTITY_REFERRAL_POSITION_BONUS_STAGE_DETAIL;
    public static final Identity<ReferralPositionRelRecord, Integer> IDENTITY_REFERRAL_POSITION_REL = Identities0.IDENTITY_REFERRAL_POSITION_REL;
    public static final Identity<ReferralRecomEvaluationRecord, Integer> IDENTITY_REFERRAL_RECOM_EVALUATION = Identities0.IDENTITY_REFERRAL_RECOM_EVALUATION;
    public static final Identity<ReferralRecomHbPositionRecord, Integer> IDENTITY_REFERRAL_RECOM_HB_POSITION = Identities0.IDENTITY_REFERRAL_RECOM_HB_POSITION;
    public static final Identity<ReferralSeekRecommendRecord, Integer> IDENTITY_REFERRAL_SEEK_RECOMMEND = Identities0.IDENTITY_REFERRAL_SEEK_RECOMMEND;
    public static final Identity<TestTableRecord, Integer> IDENTITY_TEST_TABLE = Identities0.IDENTITY_TEST_TABLE;
    public static final Identity<UserEmployeeRecord, Integer> IDENTITY_USER_EMPLOYEE = Identities0.IDENTITY_USER_EMPLOYEE;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<EmployeeReferralRecordRecord> KEY_EMPLOYEE_REFERRAL_RECORD_PRIMARY = UniqueKeys0.KEY_EMPLOYEE_REFERRAL_RECORD_PRIMARY;
    public static final UniqueKey<HistoryReferralPositionRelRecord> KEY_HISTORY_REFERRAL_POSITION_REL_PRIMARY = UniqueKeys0.KEY_HISTORY_REFERRAL_POSITION_REL_PRIMARY;
    public static final UniqueKey<HrEmployeeCertConfRecord> KEY_HR_EMPLOYEE_CERT_CONF_PRIMARY = UniqueKeys0.KEY_HR_EMPLOYEE_CERT_CONF_PRIMARY;
    public static final UniqueKey<HrEmployeeCustomFieldsRecord> KEY_HR_EMPLOYEE_CUSTOM_FIELDS_PRIMARY = UniqueKeys0.KEY_HR_EMPLOYEE_CUSTOM_FIELDS_PRIMARY;
    public static final UniqueKey<HrGroupCompanyRecord> KEY_HR_GROUP_COMPANY_PRIMARY = UniqueKeys0.KEY_HR_GROUP_COMPANY_PRIMARY;
    public static final UniqueKey<HrGroupCompanyRelRecord> KEY_HR_GROUP_COMPANY_REL_PRIMARY = UniqueKeys0.KEY_HR_GROUP_COMPANY_REL_PRIMARY;
    public static final UniqueKey<HrGroupCompanyRelRecord> KEY_HR_GROUP_COMPANY_REL_COMPANY_ID = UniqueKeys0.KEY_HR_GROUP_COMPANY_REL_COMPANY_ID;
    public static final UniqueKey<HrImporterMonitorRecord> KEY_HR_IMPORTER_MONITOR_PRIMARY = UniqueKeys0.KEY_HR_IMPORTER_MONITOR_PRIMARY;
    public static final UniqueKey<ReferralApplicationStatusCountRecord> KEY_REFERRAL_APPLICATION_STATUS_COUNT_PRIMARY = UniqueKeys0.KEY_REFERRAL_APPLICATION_STATUS_COUNT_PRIMARY;
    public static final UniqueKey<ReferralApplicationStatusCountRecord> KEY_REFERRAL_APPLICATION_STATUS_COUNT_REFERRAL_APPLICATION_STATUS_APPLICATION_ID_TPL_STATUS_PK = UniqueKeys0.KEY_REFERRAL_APPLICATION_STATUS_COUNT_REFERRAL_APPLICATION_STATUS_APPLICATION_ID_TPL_STATUS_PK;
    public static final UniqueKey<ReferralCompanyConfRecord> KEY_REFERRAL_COMPANY_CONF_PRIMARY = UniqueKeys0.KEY_REFERRAL_COMPANY_CONF_PRIMARY;
    public static final UniqueKey<ReferralConnectionChainRecord> KEY_REFERRAL_CONNECTION_CHAIN_PRIMARY = UniqueKeys0.KEY_REFERRAL_CONNECTION_CHAIN_PRIMARY;
    public static final UniqueKey<ReferralConnectionLogRecord> KEY_REFERRAL_CONNECTION_LOG_PRIMARY = UniqueKeys0.KEY_REFERRAL_CONNECTION_LOG_PRIMARY;
    public static final UniqueKey<ReferralEmployeeBonusRecordRecord> KEY_REFERRAL_EMPLOYEE_BONUS_RECORD_PRIMARY = UniqueKeys0.KEY_REFERRAL_EMPLOYEE_BONUS_RECORD_PRIMARY;
    public static final UniqueKey<ReferralEmployeeNetworkResourcesRecord> KEY_REFERRAL_EMPLOYEE_NETWORK_RESOURCES_PRIMARY = UniqueKeys0.KEY_REFERRAL_EMPLOYEE_NETWORK_RESOURCES_PRIMARY;
    public static final UniqueKey<ReferralEmployeeRegisterLogRecord> KEY_REFERRAL_EMPLOYEE_REGISTER_LOG_PRIMARY = UniqueKeys0.KEY_REFERRAL_EMPLOYEE_REGISTER_LOG_PRIMARY;
    public static final UniqueKey<ReferralLogRecord> KEY_REFERRAL_LOG_PRIMARY = UniqueKeys0.KEY_REFERRAL_LOG_PRIMARY;
    public static final UniqueKey<ReferralLogRecord> KEY_REFERRAL_LOG_REFERRAL_LOG_UNIQUE = UniqueKeys0.KEY_REFERRAL_LOG_REFERRAL_LOG_UNIQUE;
    public static final UniqueKey<ReferralPositionBonusRecord> KEY_REFERRAL_POSITION_BONUS_PRIMARY = UniqueKeys0.KEY_REFERRAL_POSITION_BONUS_PRIMARY;
    public static final UniqueKey<ReferralPositionBonusRecord> KEY_REFERRAL_POSITION_BONUS_UNIQUE_IDX = UniqueKeys0.KEY_REFERRAL_POSITION_BONUS_UNIQUE_IDX;
    public static final UniqueKey<ReferralPositionBonusStageDetailRecord> KEY_REFERRAL_POSITION_BONUS_STAGE_DETAIL_PRIMARY = UniqueKeys0.KEY_REFERRAL_POSITION_BONUS_STAGE_DETAIL_PRIMARY;
    public static final UniqueKey<ReferralPositionRelRecord> KEY_REFERRAL_POSITION_REL_PRIMARY = UniqueKeys0.KEY_REFERRAL_POSITION_REL_PRIMARY;
    public static final UniqueKey<ReferralPositionRelRecord> KEY_REFERRAL_POSITION_REL_IDX_POSITION_COMPANY = UniqueKeys0.KEY_REFERRAL_POSITION_REL_IDX_POSITION_COMPANY;
    public static final UniqueKey<ReferralRecomEvaluationRecord> KEY_REFERRAL_RECOM_EVALUATION_PRIMARY = UniqueKeys0.KEY_REFERRAL_RECOM_EVALUATION_PRIMARY;
    public static final UniqueKey<ReferralRecomEvaluationRecord> KEY_REFERRAL_RECOM_EVALUATION_REFERRAL_RECOM_EVALUATION_POSITION_ID_POS_ID_PRESENTEE_PK = UniqueKeys0.KEY_REFERRAL_RECOM_EVALUATION_REFERRAL_RECOM_EVALUATION_POSITION_ID_POS_ID_PRESENTEE_PK;
    public static final UniqueKey<ReferralRecomHbPositionRecord> KEY_REFERRAL_RECOM_HB_POSITION_PRIMARY = UniqueKeys0.KEY_REFERRAL_RECOM_HB_POSITION_PRIMARY;
    public static final UniqueKey<ReferralSeekRecommendRecord> KEY_REFERRAL_SEEK_RECOMMEND_PRIMARY = UniqueKeys0.KEY_REFERRAL_SEEK_RECOMMEND_PRIMARY;
    public static final UniqueKey<TestTableRecord> KEY_TEST_TABLE_PRIMARY = UniqueKeys0.KEY_TEST_TABLE_PRIMARY;
    public static final UniqueKey<UserEmployeeRecord> KEY_USER_EMPLOYEE_PRIMARY = UniqueKeys0.KEY_USER_EMPLOYEE_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<EmployeeReferralRecordRecord, Integer> IDENTITY_EMPLOYEE_REFERRAL_RECORD = createIdentity(EmployeeReferralRecord.EMPLOYEE_REFERRAL_RECORD, EmployeeReferralRecord.EMPLOYEE_REFERRAL_RECORD.ID);
        public static Identity<HistoryReferralPositionRelRecord, Integer> IDENTITY_HISTORY_REFERRAL_POSITION_REL = createIdentity(HistoryReferralPositionRel.HISTORY_REFERRAL_POSITION_REL, HistoryReferralPositionRel.HISTORY_REFERRAL_POSITION_REL.ID);
        public static Identity<HrEmployeeCertConfRecord, Integer> IDENTITY_HR_EMPLOYEE_CERT_CONF = createIdentity(HrEmployeeCertConf.HR_EMPLOYEE_CERT_CONF, HrEmployeeCertConf.HR_EMPLOYEE_CERT_CONF.ID);
        public static Identity<HrEmployeeCustomFieldsRecord, Integer> IDENTITY_HR_EMPLOYEE_CUSTOM_FIELDS = createIdentity(HrEmployeeCustomFields.HR_EMPLOYEE_CUSTOM_FIELDS, HrEmployeeCustomFields.HR_EMPLOYEE_CUSTOM_FIELDS.ID);
        public static Identity<HrGroupCompanyRecord, Integer> IDENTITY_HR_GROUP_COMPANY = createIdentity(HrGroupCompany.HR_GROUP_COMPANY, HrGroupCompany.HR_GROUP_COMPANY.ID);
        public static Identity<HrGroupCompanyRelRecord, Integer> IDENTITY_HR_GROUP_COMPANY_REL = createIdentity(HrGroupCompanyRel.HR_GROUP_COMPANY_REL, HrGroupCompanyRel.HR_GROUP_COMPANY_REL.ID);
        public static Identity<HrImporterMonitorRecord, Integer> IDENTITY_HR_IMPORTER_MONITOR = createIdentity(HrImporterMonitor.HR_IMPORTER_MONITOR, HrImporterMonitor.HR_IMPORTER_MONITOR.ID);
        public static Identity<ReferralApplicationStatusCountRecord, Integer> IDENTITY_REFERRAL_APPLICATION_STATUS_COUNT = createIdentity(ReferralApplicationStatusCount.REFERRAL_APPLICATION_STATUS_COUNT, ReferralApplicationStatusCount.REFERRAL_APPLICATION_STATUS_COUNT.ID);
        public static Identity<ReferralCompanyConfRecord, Integer> IDENTITY_REFERRAL_COMPANY_CONF = createIdentity(ReferralCompanyConf.REFERRAL_COMPANY_CONF, ReferralCompanyConf.REFERRAL_COMPANY_CONF.ID);
        public static Identity<ReferralConnectionChainRecord, Integer> IDENTITY_REFERRAL_CONNECTION_CHAIN = createIdentity(ReferralConnectionChain.REFERRAL_CONNECTION_CHAIN, ReferralConnectionChain.REFERRAL_CONNECTION_CHAIN.ID);
        public static Identity<ReferralConnectionLogRecord, Integer> IDENTITY_REFERRAL_CONNECTION_LOG = createIdentity(ReferralConnectionLog.REFERRAL_CONNECTION_LOG, ReferralConnectionLog.REFERRAL_CONNECTION_LOG.ID);
        public static Identity<ReferralEmployeeBonusRecordRecord, Integer> IDENTITY_REFERRAL_EMPLOYEE_BONUS_RECORD = createIdentity(ReferralEmployeeBonusRecord.REFERRAL_EMPLOYEE_BONUS_RECORD, ReferralEmployeeBonusRecord.REFERRAL_EMPLOYEE_BONUS_RECORD.ID);
        public static Identity<ReferralEmployeeNetworkResourcesRecord, Integer> IDENTITY_REFERRAL_EMPLOYEE_NETWORK_RESOURCES = createIdentity(ReferralEmployeeNetworkResources.REFERRAL_EMPLOYEE_NETWORK_RESOURCES, ReferralEmployeeNetworkResources.REFERRAL_EMPLOYEE_NETWORK_RESOURCES.ID);
        public static Identity<ReferralEmployeeRegisterLogRecord, Integer> IDENTITY_REFERRAL_EMPLOYEE_REGISTER_LOG = createIdentity(ReferralEmployeeRegisterLog.REFERRAL_EMPLOYEE_REGISTER_LOG, ReferralEmployeeRegisterLog.REFERRAL_EMPLOYEE_REGISTER_LOG.ID);
        public static Identity<ReferralLogRecord, Integer> IDENTITY_REFERRAL_LOG = createIdentity(ReferralLog.REFERRAL_LOG, ReferralLog.REFERRAL_LOG.ID);
        public static Identity<ReferralPositionBonusRecord, Integer> IDENTITY_REFERRAL_POSITION_BONUS = createIdentity(ReferralPositionBonus.REFERRAL_POSITION_BONUS, ReferralPositionBonus.REFERRAL_POSITION_BONUS.ID);
        public static Identity<ReferralPositionBonusStageDetailRecord, Integer> IDENTITY_REFERRAL_POSITION_BONUS_STAGE_DETAIL = createIdentity(ReferralPositionBonusStageDetail.REFERRAL_POSITION_BONUS_STAGE_DETAIL, ReferralPositionBonusStageDetail.REFERRAL_POSITION_BONUS_STAGE_DETAIL.ID);
        public static Identity<ReferralPositionRelRecord, Integer> IDENTITY_REFERRAL_POSITION_REL = createIdentity(ReferralPositionRel.REFERRAL_POSITION_REL, ReferralPositionRel.REFERRAL_POSITION_REL.ID);
        public static Identity<ReferralRecomEvaluationRecord, Integer> IDENTITY_REFERRAL_RECOM_EVALUATION = createIdentity(ReferralRecomEvaluation.REFERRAL_RECOM_EVALUATION, ReferralRecomEvaluation.REFERRAL_RECOM_EVALUATION.ID);
        public static Identity<ReferralRecomHbPositionRecord, Integer> IDENTITY_REFERRAL_RECOM_HB_POSITION = createIdentity(ReferralRecomHbPosition.REFERRAL_RECOM_HB_POSITION, ReferralRecomHbPosition.REFERRAL_RECOM_HB_POSITION.ID);
        public static Identity<ReferralSeekRecommendRecord, Integer> IDENTITY_REFERRAL_SEEK_RECOMMEND = createIdentity(ReferralSeekRecommend.REFERRAL_SEEK_RECOMMEND, ReferralSeekRecommend.REFERRAL_SEEK_RECOMMEND.ID);
        public static Identity<TestTableRecord, Integer> IDENTITY_TEST_TABLE = createIdentity(TestTable.TEST_TABLE, TestTable.TEST_TABLE.ID);
        public static Identity<UserEmployeeRecord, Integer> IDENTITY_USER_EMPLOYEE = createIdentity(UserEmployee.USER_EMPLOYEE, UserEmployee.USER_EMPLOYEE.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<EmployeeReferralRecordRecord> KEY_EMPLOYEE_REFERRAL_RECORD_PRIMARY = createUniqueKey(EmployeeReferralRecord.EMPLOYEE_REFERRAL_RECORD, "KEY_employee_referral_record_PRIMARY", EmployeeReferralRecord.EMPLOYEE_REFERRAL_RECORD.ID);
        public static final UniqueKey<HistoryReferralPositionRelRecord> KEY_HISTORY_REFERRAL_POSITION_REL_PRIMARY = createUniqueKey(HistoryReferralPositionRel.HISTORY_REFERRAL_POSITION_REL, "KEY_history_referral_position_rel_PRIMARY", HistoryReferralPositionRel.HISTORY_REFERRAL_POSITION_REL.ID);
        public static final UniqueKey<HrEmployeeCertConfRecord> KEY_HR_EMPLOYEE_CERT_CONF_PRIMARY = createUniqueKey(HrEmployeeCertConf.HR_EMPLOYEE_CERT_CONF, "KEY_hr_employee_cert_conf_PRIMARY", HrEmployeeCertConf.HR_EMPLOYEE_CERT_CONF.ID);
        public static final UniqueKey<HrEmployeeCustomFieldsRecord> KEY_HR_EMPLOYEE_CUSTOM_FIELDS_PRIMARY = createUniqueKey(HrEmployeeCustomFields.HR_EMPLOYEE_CUSTOM_FIELDS, "KEY_hr_employee_custom_fields_PRIMARY", HrEmployeeCustomFields.HR_EMPLOYEE_CUSTOM_FIELDS.ID);
        public static final UniqueKey<HrGroupCompanyRecord> KEY_HR_GROUP_COMPANY_PRIMARY = createUniqueKey(HrGroupCompany.HR_GROUP_COMPANY, "KEY_hr_group_company_PRIMARY", HrGroupCompany.HR_GROUP_COMPANY.ID);
        public static final UniqueKey<HrGroupCompanyRelRecord> KEY_HR_GROUP_COMPANY_REL_PRIMARY = createUniqueKey(HrGroupCompanyRel.HR_GROUP_COMPANY_REL, "KEY_hr_group_company_rel_PRIMARY", HrGroupCompanyRel.HR_GROUP_COMPANY_REL.ID);
        public static final UniqueKey<HrGroupCompanyRelRecord> KEY_HR_GROUP_COMPANY_REL_COMPANY_ID = createUniqueKey(HrGroupCompanyRel.HR_GROUP_COMPANY_REL, "KEY_hr_group_company_rel_company_id", HrGroupCompanyRel.HR_GROUP_COMPANY_REL.COMPANY_ID, HrGroupCompanyRel.HR_GROUP_COMPANY_REL.GROUP_ID);
        public static final UniqueKey<HrImporterMonitorRecord> KEY_HR_IMPORTER_MONITOR_PRIMARY = createUniqueKey(HrImporterMonitor.HR_IMPORTER_MONITOR, "KEY_hr_importer_monitor_PRIMARY", HrImporterMonitor.HR_IMPORTER_MONITOR.ID);
        public static final UniqueKey<ReferralApplicationStatusCountRecord> KEY_REFERRAL_APPLICATION_STATUS_COUNT_PRIMARY = createUniqueKey(ReferralApplicationStatusCount.REFERRAL_APPLICATION_STATUS_COUNT, "KEY_referral_application_status_count_PRIMARY", ReferralApplicationStatusCount.REFERRAL_APPLICATION_STATUS_COUNT.ID);
        public static final UniqueKey<ReferralApplicationStatusCountRecord> KEY_REFERRAL_APPLICATION_STATUS_COUNT_REFERRAL_APPLICATION_STATUS_APPLICATION_ID_TPL_STATUS_PK = createUniqueKey(ReferralApplicationStatusCount.REFERRAL_APPLICATION_STATUS_COUNT, "KEY_referral_application_status_count_referral_application_status_application_id_tpl_status_pk", ReferralApplicationStatusCount.REFERRAL_APPLICATION_STATUS_COUNT.APPLICATION_ID, ReferralApplicationStatusCount.REFERRAL_APPLICATION_STATUS_COUNT.APPICATION_TPL_STATUS);
        public static final UniqueKey<ReferralCompanyConfRecord> KEY_REFERRAL_COMPANY_CONF_PRIMARY = createUniqueKey(ReferralCompanyConf.REFERRAL_COMPANY_CONF, "KEY_referral_company_conf_PRIMARY", ReferralCompanyConf.REFERRAL_COMPANY_CONF.ID);
        public static final UniqueKey<ReferralConnectionChainRecord> KEY_REFERRAL_CONNECTION_CHAIN_PRIMARY = createUniqueKey(ReferralConnectionChain.REFERRAL_CONNECTION_CHAIN, "KEY_referral_connection_chain_PRIMARY", ReferralConnectionChain.REFERRAL_CONNECTION_CHAIN.ID);
        public static final UniqueKey<ReferralConnectionLogRecord> KEY_REFERRAL_CONNECTION_LOG_PRIMARY = createUniqueKey(ReferralConnectionLog.REFERRAL_CONNECTION_LOG, "KEY_referral_connection_log_PRIMARY", ReferralConnectionLog.REFERRAL_CONNECTION_LOG.ID);
        public static final UniqueKey<ReferralEmployeeBonusRecordRecord> KEY_REFERRAL_EMPLOYEE_BONUS_RECORD_PRIMARY = createUniqueKey(ReferralEmployeeBonusRecord.REFERRAL_EMPLOYEE_BONUS_RECORD, "KEY_referral_employee_bonus_record_PRIMARY", ReferralEmployeeBonusRecord.REFERRAL_EMPLOYEE_BONUS_RECORD.ID);
        public static final UniqueKey<ReferralEmployeeNetworkResourcesRecord> KEY_REFERRAL_EMPLOYEE_NETWORK_RESOURCES_PRIMARY = createUniqueKey(ReferralEmployeeNetworkResources.REFERRAL_EMPLOYEE_NETWORK_RESOURCES, "KEY_referral_employee_network_resources_PRIMARY", ReferralEmployeeNetworkResources.REFERRAL_EMPLOYEE_NETWORK_RESOURCES.ID);
        public static final UniqueKey<ReferralEmployeeRegisterLogRecord> KEY_REFERRAL_EMPLOYEE_REGISTER_LOG_PRIMARY = createUniqueKey(ReferralEmployeeRegisterLog.REFERRAL_EMPLOYEE_REGISTER_LOG, "KEY_referral_employee_register_log_PRIMARY", ReferralEmployeeRegisterLog.REFERRAL_EMPLOYEE_REGISTER_LOG.ID);
        public static final UniqueKey<ReferralLogRecord> KEY_REFERRAL_LOG_PRIMARY = createUniqueKey(ReferralLog.REFERRAL_LOG, "KEY_referral_log_PRIMARY", ReferralLog.REFERRAL_LOG.ID);
        public static final UniqueKey<ReferralLogRecord> KEY_REFERRAL_LOG_REFERRAL_LOG_UNIQUE = createUniqueKey(ReferralLog.REFERRAL_LOG, "KEY_referral_log_referral_log_unique", ReferralLog.REFERRAL_LOG.EMPLOYEE_ID, ReferralLog.REFERRAL_LOG.REFERENCE_ID, ReferralLog.REFERRAL_LOG.POSITION_ID);
        public static final UniqueKey<ReferralPositionBonusRecord> KEY_REFERRAL_POSITION_BONUS_PRIMARY = createUniqueKey(ReferralPositionBonus.REFERRAL_POSITION_BONUS, "KEY_referral_position_bonus_PRIMARY", ReferralPositionBonus.REFERRAL_POSITION_BONUS.ID);
        public static final UniqueKey<ReferralPositionBonusRecord> KEY_REFERRAL_POSITION_BONUS_UNIQUE_IDX = createUniqueKey(ReferralPositionBonus.REFERRAL_POSITION_BONUS, "KEY_referral_position_bonus_unique_idx", ReferralPositionBonus.REFERRAL_POSITION_BONUS.POSITION_ID);
        public static final UniqueKey<ReferralPositionBonusStageDetailRecord> KEY_REFERRAL_POSITION_BONUS_STAGE_DETAIL_PRIMARY = createUniqueKey(ReferralPositionBonusStageDetail.REFERRAL_POSITION_BONUS_STAGE_DETAIL, "KEY_referral_position_bonus_stage_detail_PRIMARY", ReferralPositionBonusStageDetail.REFERRAL_POSITION_BONUS_STAGE_DETAIL.ID);
        public static final UniqueKey<ReferralPositionRelRecord> KEY_REFERRAL_POSITION_REL_PRIMARY = createUniqueKey(ReferralPositionRel.REFERRAL_POSITION_REL, "KEY_referral_position_rel_PRIMARY", ReferralPositionRel.REFERRAL_POSITION_REL.ID);
        public static final UniqueKey<ReferralPositionRelRecord> KEY_REFERRAL_POSITION_REL_IDX_POSITION_COMPANY = createUniqueKey(ReferralPositionRel.REFERRAL_POSITION_REL, "KEY_referral_position_rel_idx_position_company", ReferralPositionRel.REFERRAL_POSITION_REL.POSITION_ID, ReferralPositionRel.REFERRAL_POSITION_REL.COMPANY_ID);
        public static final UniqueKey<ReferralRecomEvaluationRecord> KEY_REFERRAL_RECOM_EVALUATION_PRIMARY = createUniqueKey(ReferralRecomEvaluation.REFERRAL_RECOM_EVALUATION, "KEY_referral_recom_evaluation_PRIMARY", ReferralRecomEvaluation.REFERRAL_RECOM_EVALUATION.ID);
        public static final UniqueKey<ReferralRecomEvaluationRecord> KEY_REFERRAL_RECOM_EVALUATION_REFERRAL_RECOM_EVALUATION_POSITION_ID_POS_ID_PRESENTEE_PK = createUniqueKey(ReferralRecomEvaluation.REFERRAL_RECOM_EVALUATION, "KEY_referral_recom_evaluation_referral_recom_evaluation_position_id_pos_id_presentee_pk", ReferralRecomEvaluation.REFERRAL_RECOM_EVALUATION.POSITION_ID, ReferralRecomEvaluation.REFERRAL_RECOM_EVALUATION.POST_USER_ID, ReferralRecomEvaluation.REFERRAL_RECOM_EVALUATION.PRESENTEE_USER_ID);
        public static final UniqueKey<ReferralRecomHbPositionRecord> KEY_REFERRAL_RECOM_HB_POSITION_PRIMARY = createUniqueKey(ReferralRecomHbPosition.REFERRAL_RECOM_HB_POSITION, "KEY_referral_recom_hb_position_PRIMARY", ReferralRecomHbPosition.REFERRAL_RECOM_HB_POSITION.ID);
        public static final UniqueKey<ReferralSeekRecommendRecord> KEY_REFERRAL_SEEK_RECOMMEND_PRIMARY = createUniqueKey(ReferralSeekRecommend.REFERRAL_SEEK_RECOMMEND, "KEY_referral_seek_recommend_PRIMARY", ReferralSeekRecommend.REFERRAL_SEEK_RECOMMEND.ID);
        public static final UniqueKey<TestTableRecord> KEY_TEST_TABLE_PRIMARY = createUniqueKey(TestTable.TEST_TABLE, "KEY_test_table_PRIMARY", TestTable.TEST_TABLE.ID);
        public static final UniqueKey<UserEmployeeRecord> KEY_USER_EMPLOYEE_PRIMARY = createUniqueKey(UserEmployee.USER_EMPLOYEE, "KEY_user_employee_PRIMARY", UserEmployee.USER_EMPLOYEE.ID);
    }
}
