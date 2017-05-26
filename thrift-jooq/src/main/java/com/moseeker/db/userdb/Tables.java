/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.userdb;


import com.moseeker.db.userdb.tables.CandidateVJobPositionRecom;
import com.moseeker.db.userdb.tables.UserBdUser;
import com.moseeker.db.userdb.tables.UserCollectPosition;
import com.moseeker.db.userdb.tables.UserEmployee;
import com.moseeker.db.userdb.tables.UserEmployeePointsRecord;
import com.moseeker.db.userdb.tables.UserFavPosition;
import com.moseeker.db.userdb.tables.UserHrAccount;
import com.moseeker.db.userdb.tables.UserIntention;
import com.moseeker.db.userdb.tables.UserSearchCondition;
import com.moseeker.db.userdb.tables.UserSettings;
import com.moseeker.db.userdb.tables.UserThirdpartyUser;
import com.moseeker.db.userdb.tables.UserUser;
import com.moseeker.db.userdb.tables.UserUserNameEmail1128;
import com.moseeker.db.userdb.tables.UserUserTmp;
import com.moseeker.db.userdb.tables.UserViewedPosition;
import com.moseeker.db.userdb.tables.UserWxUser;
import com.moseeker.db.userdb.tables.UserWxViewer;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in userdb
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * VIEW
     */
    public static final CandidateVJobPositionRecom CANDIDATE_V_JOB_POSITION_RECOM = com.moseeker.db.userdb.tables.CandidateVJobPositionRecom.CANDIDATE_V_JOB_POSITION_RECOM;

    /**
     * 百度用户信息表
     */
    public static final UserBdUser USER_BD_USER = com.moseeker.db.userdb.tables.UserBdUser.USER_BD_USER;

    /**
     * 用户职位收藏
     */
    public static final UserCollectPosition USER_COLLECT_POSITION = com.moseeker.db.userdb.tables.UserCollectPosition.USER_COLLECT_POSITION;

    /**
     * The table <code>userdb.user_employee</code>.
     */
    public static final UserEmployee USER_EMPLOYEE = com.moseeker.db.userdb.tables.UserEmployee.USER_EMPLOYEE;

    /**
     * 员工积分记录表
     */
    public static final UserEmployeePointsRecord USER_EMPLOYEE_POINTS_RECORD = com.moseeker.db.userdb.tables.UserEmployeePointsRecord.USER_EMPLOYEE_POINTS_RECORD;

    /**
     * 用户职位收藏
     */
    public static final UserFavPosition USER_FAV_POSITION = com.moseeker.db.userdb.tables.UserFavPosition.USER_FAV_POSITION;

    /**
     * hr账号表
     */
    public static final UserHrAccount USER_HR_ACCOUNT = com.moseeker.db.userdb.tables.UserHrAccount.USER_HR_ACCOUNT;

    /**
     * 用户求职意向
     */
    public static final UserIntention USER_INTENTION = com.moseeker.db.userdb.tables.UserIntention.USER_INTENTION;

    /**
     * 用户搜索条件(qx职位搜索)
     */
    public static final UserSearchCondition USER_SEARCH_CONDITION = com.moseeker.db.userdb.tables.UserSearchCondition.USER_SEARCH_CONDITION;

    /**
     * 用户设置表
     */
    public static final UserSettings USER_SETTINGS = com.moseeker.db.userdb.tables.UserSettings.USER_SETTINGS;

    /**
     * 第三方关联帐号表
     */
    public static final UserThirdpartyUser USER_THIRDPARTY_USER = com.moseeker.db.userdb.tables.UserThirdpartyUser.USER_THIRDPARTY_USER;

    /**
     * 用户表
     */
    public static final UserUser USER_USER = com.moseeker.db.userdb.tables.UserUser.USER_USER;

    /**
     * The table <code>userdb.user_user_name_email1128</code>.
     */
    public static final UserUserNameEmail1128 USER_USER_NAME_EMAIL1128 = com.moseeker.db.userdb.tables.UserUserNameEmail1128.USER_USER_NAME_EMAIL1128;

    /**
     * The table <code>userdb.user_user_tmp</code>.
     */
    public static final UserUserTmp USER_USER_TMP = com.moseeker.db.userdb.tables.UserUserTmp.USER_USER_TMP;

    /**
     * 用户查看过的职位
     */
    public static final UserViewedPosition USER_VIEWED_POSITION = com.moseeker.db.userdb.tables.UserViewedPosition.USER_VIEWED_POSITION;

    /**
     * 微信用户表
     */
    public static final UserWxUser USER_WX_USER = com.moseeker.db.userdb.tables.UserWxUser.USER_WX_USER;

    /**
     * 用户浏览者记录
     */
    public static final UserWxViewer USER_WX_VIEWER = com.moseeker.db.userdb.tables.UserWxViewer.USER_WX_VIEWER;
}
