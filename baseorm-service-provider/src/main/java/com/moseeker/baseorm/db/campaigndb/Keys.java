/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.campaigndb;


import com.moseeker.baseorm.db.campaigndb.tables.CampaignCompanySurvey;
import com.moseeker.baseorm.db.campaigndb.tables.CampaignEdmCampaign;
import com.moseeker.baseorm.db.campaigndb.tables.CampaignEdmUserrecommendedPositions;
import com.moseeker.baseorm.db.campaigndb.tables.CampaignEdmUsers;
import com.moseeker.baseorm.db.campaigndb.tables.CampaignEmailAgentdelivery;
import com.moseeker.baseorm.db.campaigndb.tables.CampaignHeadImage;
import com.moseeker.baseorm.db.campaigndb.tables.CampaignPcBanner;
import com.moseeker.baseorm.db.campaigndb.tables.CampaignPcRecommendCompany;
import com.moseeker.baseorm.db.campaigndb.tables.CampaignPcRecommendPosition;
import com.moseeker.baseorm.db.campaigndb.tables.CampaignPersonaRecom;
import com.moseeker.baseorm.db.campaigndb.tables.CampaignRecommendCompany;
import com.moseeker.baseorm.db.campaigndb.tables.CampaignRecommendPosition;
import com.moseeker.baseorm.db.campaigndb.tables.records.CampaignCompanySurveyRecord;
import com.moseeker.baseorm.db.campaigndb.tables.records.CampaignEdmCampaignRecord;
import com.moseeker.baseorm.db.campaigndb.tables.records.CampaignEdmUserrecommendedPositionsRecord;
import com.moseeker.baseorm.db.campaigndb.tables.records.CampaignEdmUsersRecord;
import com.moseeker.baseorm.db.campaigndb.tables.records.CampaignEmailAgentdeliveryRecord;
import com.moseeker.baseorm.db.campaigndb.tables.records.CampaignHeadImageRecord;
import com.moseeker.baseorm.db.campaigndb.tables.records.CampaignPcBannerRecord;
import com.moseeker.baseorm.db.campaigndb.tables.records.CampaignPcRecommendCompanyRecord;
import com.moseeker.baseorm.db.campaigndb.tables.records.CampaignPcRecommendPositionRecord;
import com.moseeker.baseorm.db.campaigndb.tables.records.CampaignPersonaRecomRecord;
import com.moseeker.baseorm.db.campaigndb.tables.records.CampaignRecommendCompanyRecord;
import com.moseeker.baseorm.db.campaigndb.tables.records.CampaignRecommendPositionRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>campaigndb</code> 
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

    public static final Identity<CampaignCompanySurveyRecord, Integer> IDENTITY_CAMPAIGN_COMPANY_SURVEY = Identities0.IDENTITY_CAMPAIGN_COMPANY_SURVEY;
    public static final Identity<CampaignEdmCampaignRecord, Integer> IDENTITY_CAMPAIGN_EDM_CAMPAIGN = Identities0.IDENTITY_CAMPAIGN_EDM_CAMPAIGN;
    public static final Identity<CampaignEdmUserrecommendedPositionsRecord, Integer> IDENTITY_CAMPAIGN_EDM_USERRECOMMENDED_POSITIONS = Identities0.IDENTITY_CAMPAIGN_EDM_USERRECOMMENDED_POSITIONS;
    public static final Identity<CampaignEdmUsersRecord, Integer> IDENTITY_CAMPAIGN_EDM_USERS = Identities0.IDENTITY_CAMPAIGN_EDM_USERS;
    public static final Identity<CampaignEmailAgentdeliveryRecord, Integer> IDENTITY_CAMPAIGN_EMAIL_AGENTDELIVERY = Identities0.IDENTITY_CAMPAIGN_EMAIL_AGENTDELIVERY;
    public static final Identity<CampaignHeadImageRecord, Integer> IDENTITY_CAMPAIGN_HEAD_IMAGE = Identities0.IDENTITY_CAMPAIGN_HEAD_IMAGE;
    public static final Identity<CampaignPcBannerRecord, Integer> IDENTITY_CAMPAIGN_PC_BANNER = Identities0.IDENTITY_CAMPAIGN_PC_BANNER;
    public static final Identity<CampaignPcRecommendCompanyRecord, Integer> IDENTITY_CAMPAIGN_PC_RECOMMEND_COMPANY = Identities0.IDENTITY_CAMPAIGN_PC_RECOMMEND_COMPANY;
    public static final Identity<CampaignPcRecommendPositionRecord, Integer> IDENTITY_CAMPAIGN_PC_RECOMMEND_POSITION = Identities0.IDENTITY_CAMPAIGN_PC_RECOMMEND_POSITION;
    public static final Identity<CampaignPersonaRecomRecord, Integer> IDENTITY_CAMPAIGN_PERSONA_RECOM = Identities0.IDENTITY_CAMPAIGN_PERSONA_RECOM;
    public static final Identity<CampaignRecommendCompanyRecord, Integer> IDENTITY_CAMPAIGN_RECOMMEND_COMPANY = Identities0.IDENTITY_CAMPAIGN_RECOMMEND_COMPANY;
    public static final Identity<CampaignRecommendPositionRecord, Integer> IDENTITY_CAMPAIGN_RECOMMEND_POSITION = Identities0.IDENTITY_CAMPAIGN_RECOMMEND_POSITION;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<CampaignCompanySurveyRecord> KEY_CAMPAIGN_COMPANY_SURVEY_PRIMARY = UniqueKeys0.KEY_CAMPAIGN_COMPANY_SURVEY_PRIMARY;
    public static final UniqueKey<CampaignEdmCampaignRecord> KEY_CAMPAIGN_EDM_CAMPAIGN_PRIMARY = UniqueKeys0.KEY_CAMPAIGN_EDM_CAMPAIGN_PRIMARY;
    public static final UniqueKey<CampaignEdmUserrecommendedPositionsRecord> KEY_CAMPAIGN_EDM_USERRECOMMENDED_POSITIONS_PRIMARY = UniqueKeys0.KEY_CAMPAIGN_EDM_USERRECOMMENDED_POSITIONS_PRIMARY;
    public static final UniqueKey<CampaignEdmUsersRecord> KEY_CAMPAIGN_EDM_USERS_PRIMARY = UniqueKeys0.KEY_CAMPAIGN_EDM_USERS_PRIMARY;
    public static final UniqueKey<CampaignEmailAgentdeliveryRecord> KEY_CAMPAIGN_EMAIL_AGENTDELIVERY_PRIMARY = UniqueKeys0.KEY_CAMPAIGN_EMAIL_AGENTDELIVERY_PRIMARY;
    public static final UniqueKey<CampaignHeadImageRecord> KEY_CAMPAIGN_HEAD_IMAGE_PRIMARY = UniqueKeys0.KEY_CAMPAIGN_HEAD_IMAGE_PRIMARY;
    public static final UniqueKey<CampaignPcBannerRecord> KEY_CAMPAIGN_PC_BANNER_PRIMARY = UniqueKeys0.KEY_CAMPAIGN_PC_BANNER_PRIMARY;
    public static final UniqueKey<CampaignPcRecommendCompanyRecord> KEY_CAMPAIGN_PC_RECOMMEND_COMPANY_PRIMARY = UniqueKeys0.KEY_CAMPAIGN_PC_RECOMMEND_COMPANY_PRIMARY;
    public static final UniqueKey<CampaignPcRecommendPositionRecord> KEY_CAMPAIGN_PC_RECOMMEND_POSITION_PRIMARY = UniqueKeys0.KEY_CAMPAIGN_PC_RECOMMEND_POSITION_PRIMARY;
    public static final UniqueKey<CampaignPersonaRecomRecord> KEY_CAMPAIGN_PERSONA_RECOM_PRIMARY = UniqueKeys0.KEY_CAMPAIGN_PERSONA_RECOM_PRIMARY;
    public static final UniqueKey<CampaignPersonaRecomRecord> KEY_CAMPAIGN_PERSONA_RECOM_CAMPAIGN_PERSONA_RECOM_UINDEX = UniqueKeys0.KEY_CAMPAIGN_PERSONA_RECOM_CAMPAIGN_PERSONA_RECOM_UINDEX;
    public static final UniqueKey<CampaignRecommendCompanyRecord> KEY_CAMPAIGN_RECOMMEND_COMPANY_PRIMARY = UniqueKeys0.KEY_CAMPAIGN_RECOMMEND_COMPANY_PRIMARY;
    public static final UniqueKey<CampaignRecommendPositionRecord> KEY_CAMPAIGN_RECOMMEND_POSITION_PRIMARY = UniqueKeys0.KEY_CAMPAIGN_RECOMMEND_POSITION_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<CampaignCompanySurveyRecord, Integer> IDENTITY_CAMPAIGN_COMPANY_SURVEY = createIdentity(CampaignCompanySurvey.CAMPAIGN_COMPANY_SURVEY, CampaignCompanySurvey.CAMPAIGN_COMPANY_SURVEY.ID);
        public static Identity<CampaignEdmCampaignRecord, Integer> IDENTITY_CAMPAIGN_EDM_CAMPAIGN = createIdentity(CampaignEdmCampaign.CAMPAIGN_EDM_CAMPAIGN, CampaignEdmCampaign.CAMPAIGN_EDM_CAMPAIGN.ID);
        public static Identity<CampaignEdmUserrecommendedPositionsRecord, Integer> IDENTITY_CAMPAIGN_EDM_USERRECOMMENDED_POSITIONS = createIdentity(CampaignEdmUserrecommendedPositions.CAMPAIGN_EDM_USERRECOMMENDED_POSITIONS, CampaignEdmUserrecommendedPositions.CAMPAIGN_EDM_USERRECOMMENDED_POSITIONS.ID);
        public static Identity<CampaignEdmUsersRecord, Integer> IDENTITY_CAMPAIGN_EDM_USERS = createIdentity(CampaignEdmUsers.CAMPAIGN_EDM_USERS, CampaignEdmUsers.CAMPAIGN_EDM_USERS.ID);
        public static Identity<CampaignEmailAgentdeliveryRecord, Integer> IDENTITY_CAMPAIGN_EMAIL_AGENTDELIVERY = createIdentity(CampaignEmailAgentdelivery.CAMPAIGN_EMAIL_AGENTDELIVERY, CampaignEmailAgentdelivery.CAMPAIGN_EMAIL_AGENTDELIVERY.ID);
        public static Identity<CampaignHeadImageRecord, Integer> IDENTITY_CAMPAIGN_HEAD_IMAGE = createIdentity(CampaignHeadImage.CAMPAIGN_HEAD_IMAGE, CampaignHeadImage.CAMPAIGN_HEAD_IMAGE.ID);
        public static Identity<CampaignPcBannerRecord, Integer> IDENTITY_CAMPAIGN_PC_BANNER = createIdentity(CampaignPcBanner.CAMPAIGN_PC_BANNER, CampaignPcBanner.CAMPAIGN_PC_BANNER.ID);
        public static Identity<CampaignPcRecommendCompanyRecord, Integer> IDENTITY_CAMPAIGN_PC_RECOMMEND_COMPANY = createIdentity(CampaignPcRecommendCompany.CAMPAIGN_PC_RECOMMEND_COMPANY, CampaignPcRecommendCompany.CAMPAIGN_PC_RECOMMEND_COMPANY.ID);
        public static Identity<CampaignPcRecommendPositionRecord, Integer> IDENTITY_CAMPAIGN_PC_RECOMMEND_POSITION = createIdentity(CampaignPcRecommendPosition.CAMPAIGN_PC_RECOMMEND_POSITION, CampaignPcRecommendPosition.CAMPAIGN_PC_RECOMMEND_POSITION.ID);
        public static Identity<CampaignPersonaRecomRecord, Integer> IDENTITY_CAMPAIGN_PERSONA_RECOM = createIdentity(CampaignPersonaRecom.CAMPAIGN_PERSONA_RECOM, CampaignPersonaRecom.CAMPAIGN_PERSONA_RECOM.ID);
        public static Identity<CampaignRecommendCompanyRecord, Integer> IDENTITY_CAMPAIGN_RECOMMEND_COMPANY = createIdentity(CampaignRecommendCompany.CAMPAIGN_RECOMMEND_COMPANY, CampaignRecommendCompany.CAMPAIGN_RECOMMEND_COMPANY.ID);
        public static Identity<CampaignRecommendPositionRecord, Integer> IDENTITY_CAMPAIGN_RECOMMEND_POSITION = createIdentity(CampaignRecommendPosition.CAMPAIGN_RECOMMEND_POSITION, CampaignRecommendPosition.CAMPAIGN_RECOMMEND_POSITION.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<CampaignCompanySurveyRecord> KEY_CAMPAIGN_COMPANY_SURVEY_PRIMARY = createUniqueKey(CampaignCompanySurvey.CAMPAIGN_COMPANY_SURVEY, "KEY_campaign_company_survey_PRIMARY", CampaignCompanySurvey.CAMPAIGN_COMPANY_SURVEY.ID);
        public static final UniqueKey<CampaignEdmCampaignRecord> KEY_CAMPAIGN_EDM_CAMPAIGN_PRIMARY = createUniqueKey(CampaignEdmCampaign.CAMPAIGN_EDM_CAMPAIGN, "KEY_campaign_edm_campaign_PRIMARY", CampaignEdmCampaign.CAMPAIGN_EDM_CAMPAIGN.ID);
        public static final UniqueKey<CampaignEdmUserrecommendedPositionsRecord> KEY_CAMPAIGN_EDM_USERRECOMMENDED_POSITIONS_PRIMARY = createUniqueKey(CampaignEdmUserrecommendedPositions.CAMPAIGN_EDM_USERRECOMMENDED_POSITIONS, "KEY_campaign_edm_userrecommended_positions_PRIMARY", CampaignEdmUserrecommendedPositions.CAMPAIGN_EDM_USERRECOMMENDED_POSITIONS.ID);
        public static final UniqueKey<CampaignEdmUsersRecord> KEY_CAMPAIGN_EDM_USERS_PRIMARY = createUniqueKey(CampaignEdmUsers.CAMPAIGN_EDM_USERS, "KEY_campaign_edm_users_PRIMARY", CampaignEdmUsers.CAMPAIGN_EDM_USERS.ID);
        public static final UniqueKey<CampaignEmailAgentdeliveryRecord> KEY_CAMPAIGN_EMAIL_AGENTDELIVERY_PRIMARY = createUniqueKey(CampaignEmailAgentdelivery.CAMPAIGN_EMAIL_AGENTDELIVERY, "KEY_campaign_email_agentdelivery_PRIMARY", CampaignEmailAgentdelivery.CAMPAIGN_EMAIL_AGENTDELIVERY.ID);
        public static final UniqueKey<CampaignHeadImageRecord> KEY_CAMPAIGN_HEAD_IMAGE_PRIMARY = createUniqueKey(CampaignHeadImage.CAMPAIGN_HEAD_IMAGE, "KEY_campaign_head_image_PRIMARY", CampaignHeadImage.CAMPAIGN_HEAD_IMAGE.ID);
        public static final UniqueKey<CampaignPcBannerRecord> KEY_CAMPAIGN_PC_BANNER_PRIMARY = createUniqueKey(CampaignPcBanner.CAMPAIGN_PC_BANNER, "KEY_campaign_pc_banner_PRIMARY", CampaignPcBanner.CAMPAIGN_PC_BANNER.ID);
        public static final UniqueKey<CampaignPcRecommendCompanyRecord> KEY_CAMPAIGN_PC_RECOMMEND_COMPANY_PRIMARY = createUniqueKey(CampaignPcRecommendCompany.CAMPAIGN_PC_RECOMMEND_COMPANY, "KEY_campaign_pc_recommend_company_PRIMARY", CampaignPcRecommendCompany.CAMPAIGN_PC_RECOMMEND_COMPANY.ID);
        public static final UniqueKey<CampaignPcRecommendPositionRecord> KEY_CAMPAIGN_PC_RECOMMEND_POSITION_PRIMARY = createUniqueKey(CampaignPcRecommendPosition.CAMPAIGN_PC_RECOMMEND_POSITION, "KEY_campaign_pc_recommend_position_PRIMARY", CampaignPcRecommendPosition.CAMPAIGN_PC_RECOMMEND_POSITION.ID);
        public static final UniqueKey<CampaignPersonaRecomRecord> KEY_CAMPAIGN_PERSONA_RECOM_PRIMARY = createUniqueKey(CampaignPersonaRecom.CAMPAIGN_PERSONA_RECOM, "KEY_campaign_persona_recom_PRIMARY", CampaignPersonaRecom.CAMPAIGN_PERSONA_RECOM.ID);
        public static final UniqueKey<CampaignPersonaRecomRecord> KEY_CAMPAIGN_PERSONA_RECOM_CAMPAIGN_PERSONA_RECOM_UINDEX = createUniqueKey(CampaignPersonaRecom.CAMPAIGN_PERSONA_RECOM, "KEY_campaign_persona_recom_campaign_persona_recom_uindex", CampaignPersonaRecom.CAMPAIGN_PERSONA_RECOM.USER_ID, CampaignPersonaRecom.CAMPAIGN_PERSONA_RECOM.POSITION_ID, CampaignPersonaRecom.CAMPAIGN_PERSONA_RECOM.COMPANY_ID, CampaignPersonaRecom.CAMPAIGN_PERSONA_RECOM.TYPE);
        public static final UniqueKey<CampaignRecommendCompanyRecord> KEY_CAMPAIGN_RECOMMEND_COMPANY_PRIMARY = createUniqueKey(CampaignRecommendCompany.CAMPAIGN_RECOMMEND_COMPANY, "KEY_campaign_recommend_company_PRIMARY", CampaignRecommendCompany.CAMPAIGN_RECOMMEND_COMPANY.ID);
        public static final UniqueKey<CampaignRecommendPositionRecord> KEY_CAMPAIGN_RECOMMEND_POSITION_PRIMARY = createUniqueKey(CampaignRecommendPosition.CAMPAIGN_RECOMMEND_POSITION, "KEY_campaign_recommend_position_PRIMARY", CampaignRecommendPosition.CAMPAIGN_RECOMMEND_POSITION.ID);
    }
}
