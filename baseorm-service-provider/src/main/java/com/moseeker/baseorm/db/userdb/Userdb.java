/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.userdb;


import com.moseeker.baseorm.db.userdb.tables.CandidateVJobPositionRecom;
import com.moseeker.baseorm.db.userdb.tables.UserAliUser;
import com.moseeker.baseorm.db.userdb.tables.UserBdUser;
import com.moseeker.baseorm.db.userdb.tables.UserCollectPosition;
import com.moseeker.baseorm.db.userdb.tables.UserCompanyFollow;
import com.moseeker.baseorm.db.userdb.tables.UserCompanyVisitReq;
import com.moseeker.baseorm.db.userdb.tables.UserEmployee;
import com.moseeker.baseorm.db.userdb.tables.UserEmployeePointsRecord;
import com.moseeker.baseorm.db.userdb.tables.UserEmployeePointsRecordCompanyRel;
import com.moseeker.baseorm.db.userdb.tables.UserEmployeeReferralPolicy;
import com.moseeker.baseorm.db.userdb.tables.UserEmployeeTemp;
import com.moseeker.baseorm.db.userdb.tables.UserEmployeeUpvote;
import com.moseeker.baseorm.db.userdb.tables.UserFavPosition;
import com.moseeker.baseorm.db.userdb.tables.UserFormerEmployee;
import com.moseeker.baseorm.db.userdb.tables.UserHrAccount;
import com.moseeker.baseorm.db.userdb.tables.UserIntention;
import com.moseeker.baseorm.db.userdb.tables.UserPositionEmail;
import com.moseeker.baseorm.db.userdb.tables.UserPrivacyRecord;
import com.moseeker.baseorm.db.userdb.tables.UserRecommendRefusal;
import com.moseeker.baseorm.db.userdb.tables.UserReferralRecord;
import com.moseeker.baseorm.db.userdb.tables.UserSearchCondition;
import com.moseeker.baseorm.db.userdb.tables.UserSettings;
import com.moseeker.baseorm.db.userdb.tables.UserSysAuthGroup;
import com.moseeker.baseorm.db.userdb.tables.UserThirdpartyUser;
import com.moseeker.baseorm.db.userdb.tables.UserUser;
import com.moseeker.baseorm.db.userdb.tables.UserViewedPosition;
import com.moseeker.baseorm.db.userdb.tables.UserWxUser;
import com.moseeker.baseorm.db.userdb.tables.UserWxViewer;

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
public class Userdb extends SchemaImpl {

    private static final long serialVersionUID = 715017960;

    /**
     * The reference instance of <code>userdb</code>
     */
    public static final Userdb USERDB = new Userdb();

    /**
     * VIEW
     */
    public final CandidateVJobPositionRecom CANDIDATE_V_JOB_POSITION_RECOM = com.moseeker.baseorm.db.userdb.tables.CandidateVJobPositionRecom.CANDIDATE_V_JOB_POSITION_RECOM;

    /**
     * 阿里用户信息表
     */
    public final UserAliUser USER_ALI_USER = com.moseeker.baseorm.db.userdb.tables.UserAliUser.USER_ALI_USER;

    /**
     * 百度用户信息表
     */
    public final UserBdUser USER_BD_USER = com.moseeker.baseorm.db.userdb.tables.UserBdUser.USER_BD_USER;

    /**
     * 用户职位收藏
     */
    public final UserCollectPosition USER_COLLECT_POSITION = com.moseeker.baseorm.db.userdb.tables.UserCollectPosition.USER_COLLECT_POSITION;

    /**
     * 公司关注表
     */
    public final UserCompanyFollow USER_COMPANY_FOLLOW = com.moseeker.baseorm.db.userdb.tables.UserCompanyFollow.USER_COMPANY_FOLLOW;

    /**
     * C端用户申请参观记录表
     */
    public final UserCompanyVisitReq USER_COMPANY_VISIT_REQ = com.moseeker.baseorm.db.userdb.tables.UserCompanyVisitReq.USER_COMPANY_VISIT_REQ;

    /**
     * The table <code>userdb.user_employee</code>.
     */
    public final UserEmployee USER_EMPLOYEE = com.moseeker.baseorm.db.userdb.tables.UserEmployee.USER_EMPLOYEE;

    /**
     * 员工积分记录表
     */
    public final UserEmployeePointsRecord USER_EMPLOYEE_POINTS_RECORD = com.moseeker.baseorm.db.userdb.tables.UserEmployeePointsRecord.USER_EMPLOYEE_POINTS_RECORD;

    /**
     * The table <code>userdb.user_employee_points_record_company_rel</code>.
     */
    public final UserEmployeePointsRecordCompanyRel USER_EMPLOYEE_POINTS_RECORD_COMPANY_REL = com.moseeker.baseorm.db.userdb.tables.UserEmployeePointsRecordCompanyRel.USER_EMPLOYEE_POINTS_RECORD_COMPANY_REL;

    /**
     * 员工想要了解内推政策点击次数表
     */
    public final UserEmployeeReferralPolicy USER_EMPLOYEE_REFERRAL_POLICY = com.moseeker.baseorm.db.userdb.tables.UserEmployeeReferralPolicy.USER_EMPLOYEE_REFERRAL_POLICY;

    /**
     * The table <code>userdb.user_employee_temp</code>.
     */
    public final UserEmployeeTemp USER_EMPLOYEE_TEMP = com.moseeker.baseorm.db.userdb.tables.UserEmployeeTemp.USER_EMPLOYEE_TEMP;

    /**
     * 员工点赞记录
     */
    public final UserEmployeeUpvote USER_EMPLOYEE_UPVOTE = com.moseeker.baseorm.db.userdb.tables.UserEmployeeUpvote.USER_EMPLOYEE_UPVOTE;

    /**
     * 用户职位收藏
     */
    public final UserFavPosition USER_FAV_POSITION = com.moseeker.baseorm.db.userdb.tables.UserFavPosition.USER_FAV_POSITION;

    /**
     * The table <code>userdb.user_former_employee</code>.
     */
    public final UserFormerEmployee USER_FORMER_EMPLOYEE = com.moseeker.baseorm.db.userdb.tables.UserFormerEmployee.USER_FORMER_EMPLOYEE;

    /**
     * hr账号表
     */
    public final UserHrAccount USER_HR_ACCOUNT = com.moseeker.baseorm.db.userdb.tables.UserHrAccount.USER_HR_ACCOUNT;

    /**
     * 用户求职意向
     */
    public final UserIntention USER_INTENTION = com.moseeker.baseorm.db.userdb.tables.UserIntention.USER_INTENTION;

    /**
     * 用户订阅职位推荐邮件
     */
    public final UserPositionEmail USER_POSITION_EMAIL = com.moseeker.baseorm.db.userdb.tables.UserPositionEmail.USER_POSITION_EMAIL;

    /**
     * 用户隐私协议状态表
     */
    public final UserPrivacyRecord USER_PRIVACY_RECORD = com.moseeker.baseorm.db.userdb.tables.UserPrivacyRecord.USER_PRIVACY_RECORD;

    /**
     * 用户拒绝推荐信息表
     */
    public final UserRecommendRefusal USER_RECOMMEND_REFUSAL = com.moseeker.baseorm.db.userdb.tables.UserRecommendRefusal.USER_RECOMMEND_REFUSAL;

    /**
     * 员工主动推荐记录
     */
    public final UserReferralRecord USER_REFERRAL_RECORD = com.moseeker.baseorm.db.userdb.tables.UserReferralRecord.USER_REFERRAL_RECORD;

    /**
     * 用户搜索条件(qx职位搜索)
     */
    public final UserSearchCondition USER_SEARCH_CONDITION = com.moseeker.baseorm.db.userdb.tables.UserSearchCondition.USER_SEARCH_CONDITION;

    /**
     * 用户设置表
     */
    public final UserSettings USER_SETTINGS = com.moseeker.baseorm.db.userdb.tables.UserSettings.USER_SETTINGS;

    /**
     * sysplat用户权限
     */
    public final UserSysAuthGroup USER_SYS_AUTH_GROUP = com.moseeker.baseorm.db.userdb.tables.UserSysAuthGroup.USER_SYS_AUTH_GROUP;

    /**
     * 第三方关联帐号表
     */
    public final UserThirdpartyUser USER_THIRDPARTY_USER = com.moseeker.baseorm.db.userdb.tables.UserThirdpartyUser.USER_THIRDPARTY_USER;

    /**
     * 用户表
     */
    public final UserUser USER_USER = com.moseeker.baseorm.db.userdb.tables.UserUser.USER_USER;

    /**
     * 用户查看过的职位
     */
    public final UserViewedPosition USER_VIEWED_POSITION = com.moseeker.baseorm.db.userdb.tables.UserViewedPosition.USER_VIEWED_POSITION;

    /**
     * 微信用户表
     */
    public final UserWxUser USER_WX_USER = com.moseeker.baseorm.db.userdb.tables.UserWxUser.USER_WX_USER;

    /**
     * 用户浏览者记录
     */
    public final UserWxViewer USER_WX_VIEWER = com.moseeker.baseorm.db.userdb.tables.UserWxViewer.USER_WX_VIEWER;

    /**
     * No further instances allowed
     */
    private Userdb() {
        super("userdb", null);
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
            CandidateVJobPositionRecom.CANDIDATE_V_JOB_POSITION_RECOM,
            UserAliUser.USER_ALI_USER,
            UserBdUser.USER_BD_USER,
            UserCollectPosition.USER_COLLECT_POSITION,
            UserCompanyFollow.USER_COMPANY_FOLLOW,
            UserCompanyVisitReq.USER_COMPANY_VISIT_REQ,
            UserEmployee.USER_EMPLOYEE,
            UserEmployeePointsRecord.USER_EMPLOYEE_POINTS_RECORD,
            UserEmployeePointsRecordCompanyRel.USER_EMPLOYEE_POINTS_RECORD_COMPANY_REL,
            UserEmployeeReferralPolicy.USER_EMPLOYEE_REFERRAL_POLICY,
            UserEmployeeTemp.USER_EMPLOYEE_TEMP,
            UserEmployeeUpvote.USER_EMPLOYEE_UPVOTE,
            UserFavPosition.USER_FAV_POSITION,
            UserFormerEmployee.USER_FORMER_EMPLOYEE,
            UserHrAccount.USER_HR_ACCOUNT,
            UserIntention.USER_INTENTION,
            UserPositionEmail.USER_POSITION_EMAIL,
            UserPrivacyRecord.USER_PRIVACY_RECORD,
            UserRecommendRefusal.USER_RECOMMEND_REFUSAL,
            UserReferralRecord.USER_REFERRAL_RECORD,
            UserSearchCondition.USER_SEARCH_CONDITION,
            UserSettings.USER_SETTINGS,
            UserSysAuthGroup.USER_SYS_AUTH_GROUP,
            UserThirdpartyUser.USER_THIRDPARTY_USER,
            UserUser.USER_USER,
            UserViewedPosition.USER_VIEWED_POSITION,
            UserWxUser.USER_WX_USER,
            UserWxViewer.USER_WX_VIEWER);
    }
}
