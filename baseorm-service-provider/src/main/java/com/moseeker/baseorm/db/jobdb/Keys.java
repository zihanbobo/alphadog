/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.jobdb;


import com.moseeker.baseorm.db.jobdb.tables.JobApplication;
import com.moseeker.baseorm.db.jobdb.tables.JobCustom;
import com.moseeker.baseorm.db.jobdb.tables.JobOccupation;
import com.moseeker.baseorm.db.jobdb.tables.JobPcAdvertisement;
import com.moseeker.baseorm.db.jobdb.tables.JobPcRecommendPositionItem;
import com.moseeker.baseorm.db.jobdb.tables.JobPcRecommendPositionsModule;
import com.moseeker.baseorm.db.jobdb.tables.JobPcReported;
import com.moseeker.baseorm.db.jobdb.tables.JobPosition;
import com.moseeker.baseorm.db.jobdb.tables.JobPositionCity;
import com.moseeker.baseorm.db.jobdb.tables.JobPositionExt;
import com.moseeker.baseorm.db.jobdb.tables.JobPositionShareTplConf;
import com.moseeker.baseorm.db.jobdb.tables.JobResumeOther;
import com.moseeker.baseorm.db.jobdb.tables.records.JobApplicationRecord;
import com.moseeker.baseorm.db.jobdb.tables.records.JobCustomRecord;
import com.moseeker.baseorm.db.jobdb.tables.records.JobOccupationRecord;
import com.moseeker.baseorm.db.jobdb.tables.records.JobPcAdvertisementRecord;
import com.moseeker.baseorm.db.jobdb.tables.records.JobPcRecommendPositionItemRecord;
import com.moseeker.baseorm.db.jobdb.tables.records.JobPcRecommendPositionsModuleRecord;
import com.moseeker.baseorm.db.jobdb.tables.records.JobPcReportedRecord;
import com.moseeker.baseorm.db.jobdb.tables.records.JobPositionCityRecord;
import com.moseeker.baseorm.db.jobdb.tables.records.JobPositionExtRecord;
import com.moseeker.baseorm.db.jobdb.tables.records.JobPositionRecord;
import com.moseeker.baseorm.db.jobdb.tables.records.JobPositionShareTplConfRecord;
import com.moseeker.baseorm.db.jobdb.tables.records.JobResumeOtherRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>jobdb</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<JobApplicationRecord, Integer> IDENTITY_JOB_APPLICATION = Identities0.IDENTITY_JOB_APPLICATION;
    public static final Identity<JobCustomRecord, Integer> IDENTITY_JOB_CUSTOM = Identities0.IDENTITY_JOB_CUSTOM;
    public static final Identity<JobOccupationRecord, Integer> IDENTITY_JOB_OCCUPATION = Identities0.IDENTITY_JOB_OCCUPATION;
    public static final Identity<JobPcAdvertisementRecord, Integer> IDENTITY_JOB_PC_ADVERTISEMENT = Identities0.IDENTITY_JOB_PC_ADVERTISEMENT;
    public static final Identity<JobPcRecommendPositionsModuleRecord, Integer> IDENTITY_JOB_PC_RECOMMEND_POSITIONS_MODULE = Identities0.IDENTITY_JOB_PC_RECOMMEND_POSITIONS_MODULE;
    public static final Identity<JobPcRecommendPositionItemRecord, Integer> IDENTITY_JOB_PC_RECOMMEND_POSITION_ITEM = Identities0.IDENTITY_JOB_PC_RECOMMEND_POSITION_ITEM;
    public static final Identity<JobPcReportedRecord, Integer> IDENTITY_JOB_PC_REPORTED = Identities0.IDENTITY_JOB_PC_REPORTED;
    public static final Identity<JobPositionRecord, Integer> IDENTITY_JOB_POSITION = Identities0.IDENTITY_JOB_POSITION;
    public static final Identity<JobPositionShareTplConfRecord, Integer> IDENTITY_JOB_POSITION_SHARE_TPL_CONF = Identities0.IDENTITY_JOB_POSITION_SHARE_TPL_CONF;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<JobApplicationRecord> KEY_JOB_APPLICATION_PRIMARY = UniqueKeys0.KEY_JOB_APPLICATION_PRIMARY;
    public static final UniqueKey<JobCustomRecord> KEY_JOB_CUSTOM_PRIMARY = UniqueKeys0.KEY_JOB_CUSTOM_PRIMARY;
    public static final UniqueKey<JobOccupationRecord> KEY_JOB_OCCUPATION_PRIMARY = UniqueKeys0.KEY_JOB_OCCUPATION_PRIMARY;
    public static final UniqueKey<JobPcAdvertisementRecord> KEY_JOB_PC_ADVERTISEMENT_PRIMARY = UniqueKeys0.KEY_JOB_PC_ADVERTISEMENT_PRIMARY;
    public static final UniqueKey<JobPcRecommendPositionsModuleRecord> KEY_JOB_PC_RECOMMEND_POSITIONS_MODULE_PRIMARY = UniqueKeys0.KEY_JOB_PC_RECOMMEND_POSITIONS_MODULE_PRIMARY;
    public static final UniqueKey<JobPcRecommendPositionItemRecord> KEY_JOB_PC_RECOMMEND_POSITION_ITEM_PRIMARY = UniqueKeys0.KEY_JOB_PC_RECOMMEND_POSITION_ITEM_PRIMARY;
    public static final UniqueKey<JobPcReportedRecord> KEY_JOB_PC_REPORTED_PRIMARY = UniqueKeys0.KEY_JOB_PC_REPORTED_PRIMARY;
    public static final UniqueKey<JobPositionRecord> KEY_JOB_POSITION_PRIMARY = UniqueKeys0.KEY_JOB_POSITION_PRIMARY;
    public static final UniqueKey<JobPositionCityRecord> KEY_JOB_POSITION_CITY_IDX_PID_CODE = UniqueKeys0.KEY_JOB_POSITION_CITY_IDX_PID_CODE;
    public static final UniqueKey<JobPositionExtRecord> KEY_JOB_POSITION_EXT_PRIMARY = UniqueKeys0.KEY_JOB_POSITION_EXT_PRIMARY;
    public static final UniqueKey<JobPositionShareTplConfRecord> KEY_JOB_POSITION_SHARE_TPL_CONF_PRIMARY = UniqueKeys0.KEY_JOB_POSITION_SHARE_TPL_CONF_PRIMARY;
    public static final UniqueKey<JobResumeOtherRecord> KEY_JOB_RESUME_OTHER_PRIMARY = UniqueKeys0.KEY_JOB_RESUME_OTHER_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<JobApplicationRecord, Integer> IDENTITY_JOB_APPLICATION = createIdentity(JobApplication.JOB_APPLICATION, JobApplication.JOB_APPLICATION.ID);
        public static Identity<JobCustomRecord, Integer> IDENTITY_JOB_CUSTOM = createIdentity(JobCustom.JOB_CUSTOM, JobCustom.JOB_CUSTOM.ID);
        public static Identity<JobOccupationRecord, Integer> IDENTITY_JOB_OCCUPATION = createIdentity(JobOccupation.JOB_OCCUPATION, JobOccupation.JOB_OCCUPATION.ID);
        public static Identity<JobPcAdvertisementRecord, Integer> IDENTITY_JOB_PC_ADVERTISEMENT = createIdentity(JobPcAdvertisement.JOB_PC_ADVERTISEMENT, JobPcAdvertisement.JOB_PC_ADVERTISEMENT.ID);
        public static Identity<JobPcRecommendPositionsModuleRecord, Integer> IDENTITY_JOB_PC_RECOMMEND_POSITIONS_MODULE = createIdentity(JobPcRecommendPositionsModule.JOB_PC_RECOMMEND_POSITIONS_MODULE, JobPcRecommendPositionsModule.JOB_PC_RECOMMEND_POSITIONS_MODULE.ID);
        public static Identity<JobPcRecommendPositionItemRecord, Integer> IDENTITY_JOB_PC_RECOMMEND_POSITION_ITEM = createIdentity(JobPcRecommendPositionItem.JOB_PC_RECOMMEND_POSITION_ITEM, JobPcRecommendPositionItem.JOB_PC_RECOMMEND_POSITION_ITEM.ID);
        public static Identity<JobPcReportedRecord, Integer> IDENTITY_JOB_PC_REPORTED = createIdentity(JobPcReported.JOB_PC_REPORTED, JobPcReported.JOB_PC_REPORTED.ID);
        public static Identity<JobPositionRecord, Integer> IDENTITY_JOB_POSITION = createIdentity(JobPosition.JOB_POSITION, JobPosition.JOB_POSITION.ID);
        public static Identity<JobPositionShareTplConfRecord, Integer> IDENTITY_JOB_POSITION_SHARE_TPL_CONF = createIdentity(JobPositionShareTplConf.JOB_POSITION_SHARE_TPL_CONF, JobPositionShareTplConf.JOB_POSITION_SHARE_TPL_CONF.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<JobApplicationRecord> KEY_JOB_APPLICATION_PRIMARY = createUniqueKey(JobApplication.JOB_APPLICATION, "KEY_job_application_PRIMARY", JobApplication.JOB_APPLICATION.ID);
        public static final UniqueKey<JobCustomRecord> KEY_JOB_CUSTOM_PRIMARY = createUniqueKey(JobCustom.JOB_CUSTOM, "KEY_job_custom_PRIMARY", JobCustom.JOB_CUSTOM.ID);
        public static final UniqueKey<JobOccupationRecord> KEY_JOB_OCCUPATION_PRIMARY = createUniqueKey(JobOccupation.JOB_OCCUPATION, "KEY_job_occupation_PRIMARY", JobOccupation.JOB_OCCUPATION.ID);
        public static final UniqueKey<JobPcAdvertisementRecord> KEY_JOB_PC_ADVERTISEMENT_PRIMARY = createUniqueKey(JobPcAdvertisement.JOB_PC_ADVERTISEMENT, "KEY_job_pc_advertisement_PRIMARY", JobPcAdvertisement.JOB_PC_ADVERTISEMENT.ID);
        public static final UniqueKey<JobPcRecommendPositionsModuleRecord> KEY_JOB_PC_RECOMMEND_POSITIONS_MODULE_PRIMARY = createUniqueKey(JobPcRecommendPositionsModule.JOB_PC_RECOMMEND_POSITIONS_MODULE, "KEY_job_pc_recommend_positions_module_PRIMARY", JobPcRecommendPositionsModule.JOB_PC_RECOMMEND_POSITIONS_MODULE.ID);
        public static final UniqueKey<JobPcRecommendPositionItemRecord> KEY_JOB_PC_RECOMMEND_POSITION_ITEM_PRIMARY = createUniqueKey(JobPcRecommendPositionItem.JOB_PC_RECOMMEND_POSITION_ITEM, "KEY_job_pc_recommend_position_item_PRIMARY", JobPcRecommendPositionItem.JOB_PC_RECOMMEND_POSITION_ITEM.ID);
        public static final UniqueKey<JobPcReportedRecord> KEY_JOB_PC_REPORTED_PRIMARY = createUniqueKey(JobPcReported.JOB_PC_REPORTED, "KEY_job_pc_reported_PRIMARY", JobPcReported.JOB_PC_REPORTED.ID);
        public static final UniqueKey<JobPositionRecord> KEY_JOB_POSITION_PRIMARY = createUniqueKey(JobPosition.JOB_POSITION, "KEY_job_position_PRIMARY", JobPosition.JOB_POSITION.ID);
        public static final UniqueKey<JobPositionCityRecord> KEY_JOB_POSITION_CITY_IDX_PID_CODE = createUniqueKey(JobPositionCity.JOB_POSITION_CITY, "KEY_job_position_city_idx_pid_code", JobPositionCity.JOB_POSITION_CITY.PID, JobPositionCity.JOB_POSITION_CITY.CODE);
        public static final UniqueKey<JobPositionExtRecord> KEY_JOB_POSITION_EXT_PRIMARY = createUniqueKey(JobPositionExt.JOB_POSITION_EXT, "KEY_job_position_ext_PRIMARY", JobPositionExt.JOB_POSITION_EXT.PID);
        public static final UniqueKey<JobPositionShareTplConfRecord> KEY_JOB_POSITION_SHARE_TPL_CONF_PRIMARY = createUniqueKey(JobPositionShareTplConf.JOB_POSITION_SHARE_TPL_CONF, "KEY_job_position_share_tpl_conf_PRIMARY", JobPositionShareTplConf.JOB_POSITION_SHARE_TPL_CONF.ID);
        public static final UniqueKey<JobResumeOtherRecord> KEY_JOB_RESUME_OTHER_PRIMARY = createUniqueKey(JobResumeOther.JOB_RESUME_OTHER, "KEY_job_resume_other_PRIMARY", JobResumeOther.JOB_RESUME_OTHER.APP_ID);
    }
}
