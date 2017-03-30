/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.userdb;


import com.moseeker.baseorm.db.userdb.tables.CandidateVJobPositionRecom;
import com.moseeker.baseorm.db.userdb.tables.UserBdUser;
import com.moseeker.baseorm.db.userdb.tables.UserCompanyFollow;
import com.moseeker.baseorm.db.userdb.tables.UserCompanyVisitReq;
import com.moseeker.baseorm.db.userdb.tables.UserEmployee;
import com.moseeker.baseorm.db.userdb.tables.UserEmployeePointsRecord;
import com.moseeker.baseorm.db.userdb.tables.UserFavPosition;
import com.moseeker.baseorm.db.userdb.tables.UserHrAccount;
import com.moseeker.baseorm.db.userdb.tables.UserIntention;
import com.moseeker.baseorm.db.userdb.tables.UserSettings;
import com.moseeker.baseorm.db.userdb.tables.UserThirdpartyUser;
import com.moseeker.baseorm.db.userdb.tables.UserUser;
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
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Userdb extends SchemaImpl {

    private static final long serialVersionUID = 300253156;

    /**
     * The reference instance of <code>userdb</code>
     */
    public static final Userdb USERDB = new Userdb();

    /**
     * VIEW
     */
    public final CandidateVJobPositionRecom CANDIDATE_V_JOB_POSITION_RECOM = com.moseeker.baseorm.db.userdb.tables.CandidateVJobPositionRecom.CANDIDATE_V_JOB_POSITION_RECOM;

    /**
     * 百度用户信息表
     */
    public final UserBdUser USER_BD_USER = com.moseeker.baseorm.db.userdb.tables.UserBdUser.USER_BD_USER;

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
     * 用户职位收藏
     */
    public final UserFavPosition USER_FAV_POSITION = com.moseeker.baseorm.db.userdb.tables.UserFavPosition.USER_FAV_POSITION;

    /**
     * hr账号表
     */
    public final UserHrAccount USER_HR_ACCOUNT = com.moseeker.baseorm.db.userdb.tables.UserHrAccount.USER_HR_ACCOUNT;

    /**
     * 用户求职意向
     */
    public final UserIntention USER_INTENTION = com.moseeker.baseorm.db.userdb.tables.UserIntention.USER_INTENTION;

    /**
     * 用户设置表
     */
    public final UserSettings USER_SETTINGS = com.moseeker.baseorm.db.userdb.tables.UserSettings.USER_SETTINGS;

    /**
     * The table <code>userdb.user_thirdparty_user</code>.
     */
    public final UserThirdpartyUser USER_THIRDPARTY_USER = com.moseeker.baseorm.db.userdb.tables.UserThirdpartyUser.USER_THIRDPARTY_USER;

    /**
     * 用户表
     */
    public final UserUser USER_USER = com.moseeker.baseorm.db.userdb.tables.UserUser.USER_USER;

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
            UserBdUser.USER_BD_USER,
            UserCompanyFollow.USER_COMPANY_FOLLOW,
            UserCompanyVisitReq.USER_COMPANY_VISIT_REQ,
            UserEmployee.USER_EMPLOYEE,
            UserEmployeePointsRecord.USER_EMPLOYEE_POINTS_RECORD,
            UserFavPosition.USER_FAV_POSITION,
            UserHrAccount.USER_HR_ACCOUNT,
            UserIntention.USER_INTENTION,
            UserSettings.USER_SETTINGS,
            UserThirdpartyUser.USER_THIRDPARTY_USER,
            UserUser.USER_USER,
            UserWxUser.USER_WX_USER,
            UserWxViewer.USER_WX_VIEWER);
    }
}
