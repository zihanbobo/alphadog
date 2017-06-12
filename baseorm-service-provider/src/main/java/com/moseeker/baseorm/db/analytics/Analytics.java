/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.analytics;


import com.moseeker.baseorm.db.analytics.tables.JdResumeSimilarity;
import com.moseeker.baseorm.db.analytics.tables.RecommendedResumes;
import com.moseeker.baseorm.db.analytics.tables.StApplication;
import com.moseeker.baseorm.db.analytics.tables.StDquserLogin;
import com.moseeker.baseorm.db.analytics.tables.StHrLogin;
import com.moseeker.baseorm.db.analytics.tables.StInterest;
import com.moseeker.baseorm.db.analytics.tables.StJdProfileLabel;
import com.moseeker.baseorm.db.analytics.tables.StJobSimilarity;
import com.moseeker.baseorm.db.analytics.tables.StList;
import com.moseeker.baseorm.db.analytics.tables.StLoadResumeRaw;
import com.moseeker.baseorm.db.analytics.tables.StOfficialPuv;
import com.moseeker.baseorm.db.analytics.tables.StPhone;
import com.moseeker.baseorm.db.analytics.tables.StPositionPuv;
import com.moseeker.baseorm.db.analytics.tables.StTj;
import com.moseeker.baseorm.db.analytics.tables.StTjApplication;
import com.moseeker.baseorm.db.analytics.tables.StmAbapplyPid;
import com.moseeker.baseorm.db.analytics.tables.StmButtonPid;
import com.moseeker.baseorm.db.analytics.tables.StmEvent;
import com.moseeker.baseorm.db.analytics.tables.StmEventType;
import com.moseeker.baseorm.db.analytics.tables.StmEvent_0113;
import com.moseeker.baseorm.db.analytics.tables.StmEvent_01_02;
import com.moseeker.baseorm.db.analytics.tables.StmEvent_02_03;
import com.moseeker.baseorm.db.analytics.tables.StmEvent_03_04;
import com.moseeker.baseorm.db.analytics.tables.StmEvent_04_05;
import com.moseeker.baseorm.db.analytics.tables.StmEvent_05_06;
import com.moseeker.baseorm.db.analytics.tables.StmEvent_06_07;
import com.moseeker.baseorm.db.analytics.tables.StmEvent_07_08;
import com.moseeker.baseorm.db.analytics.tables.StmEvent_11_01;
import com.moseeker.baseorm.db.analytics.tables.StmGroupvPid;
import com.moseeker.baseorm.db.analytics.tables.StmHrEvent;
import com.moseeker.baseorm.db.analytics.tables.StmLeavePhonePid;
import com.moseeker.baseorm.db.analytics.tables.StmPosition;
import com.moseeker.baseorm.db.analytics.tables.StmPvPid;
import com.moseeker.baseorm.db.analytics.tables.StmRecom;
import com.moseeker.baseorm.db.analytics.tables.StmRecomAbgroup;
import com.moseeker.baseorm.db.analytics.tables.StmReqType;
import com.moseeker.baseorm.db.analytics.tables.StmResType;
import com.moseeker.baseorm.db.analytics.tables.StmRouah;
import com.moseeker.baseorm.db.analytics.tables.StmWxouah;
import com.moseeker.baseorm.db.analytics.tables.SysUser;
import com.moseeker.baseorm.db.analytics.tables.WebAdmin;
import com.moseeker.baseorm.db.analytics.tables.WebHrfCore;
import com.moseeker.baseorm.db.analytics.tables.WebHrpCore;
import com.moseeker.baseorm.db.analytics.tables.WebIm;
import com.moseeker.baseorm.db.analytics.tables.WebPlaDaily;
import com.moseeker.baseorm.db.analytics.tables.WebPositionShare;
import com.moseeker.baseorm.db.analytics.tables.WebProfileCompleteness;

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
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Analytics extends SchemaImpl {

    private static final long serialVersionUID = 1747093808;

    /**
     * The reference instance of <code>analytics</code>
     */
    public static final Analytics ANALYTICS = new Analytics();

    /**
     * The table <code>analytics.jd_resume_similarity</code>.
     */
    public final JdResumeSimilarity JD_RESUME_SIMILARITY = com.moseeker.baseorm.db.analytics.tables.JdResumeSimilarity.JD_RESUME_SIMILARITY;

    /**
     * The table <code>analytics.recommended_resumes</code>.
     */
    public final RecommendedResumes RECOMMENDED_RESUMES = com.moseeker.baseorm.db.analytics.tables.RecommendedResumes.RECOMMENDED_RESUMES;

    /**
     * The table <code>analytics.stm_abapply_pid</code>.
     */
    public final StmAbapplyPid STM_ABAPPLY_PID = com.moseeker.baseorm.db.analytics.tables.StmAbapplyPid.STM_ABAPPLY_PID;

    /**
     * The table <code>analytics.stm_button_pid</code>.
     */
    public final StmButtonPid STM_BUTTON_PID = com.moseeker.baseorm.db.analytics.tables.StmButtonPid.STM_BUTTON_PID;

    /**
     * 请求事件元数据表
     */
    public final StmEvent STM_EVENT = com.moseeker.baseorm.db.analytics.tables.StmEvent.STM_EVENT;

    /**
     * 请求事件元数据表
     */
    public final StmEvent_0113 STM_EVENT_0113 = com.moseeker.baseorm.db.analytics.tables.StmEvent_0113.STM_EVENT_0113;

    /**
     * 请求事件元数据表
     */
    public final StmEvent_01_02 STM_EVENT_01_02 = com.moseeker.baseorm.db.analytics.tables.StmEvent_01_02.STM_EVENT_01_02;

    /**
     * 请求事件元数据表
     */
    public final StmEvent_02_03 STM_EVENT_02_03 = com.moseeker.baseorm.db.analytics.tables.StmEvent_02_03.STM_EVENT_02_03;

    /**
     * 请求事件元数据表
     */
    public final StmEvent_03_04 STM_EVENT_03_04 = com.moseeker.baseorm.db.analytics.tables.StmEvent_03_04.STM_EVENT_03_04;

    /**
     * 请求事件元数据表
     */
    public final StmEvent_04_05 STM_EVENT_04_05 = com.moseeker.baseorm.db.analytics.tables.StmEvent_04_05.STM_EVENT_04_05;

    /**
     * 请求事件元数据表
     */
    public final StmEvent_05_06 STM_EVENT_05_06 = com.moseeker.baseorm.db.analytics.tables.StmEvent_05_06.STM_EVENT_05_06;

    /**
     * 请求事件元数据表
     */
    public final StmEvent_06_07 STM_EVENT_06_07 = com.moseeker.baseorm.db.analytics.tables.StmEvent_06_07.STM_EVENT_06_07;

    /**
     * 请求事件元数据表
     */
    public final StmEvent_07_08 STM_EVENT_07_08 = com.moseeker.baseorm.db.analytics.tables.StmEvent_07_08.STM_EVENT_07_08;

    /**
     * 请求事件元数据表
     */
    public final StmEvent_11_01 STM_EVENT_11_01 = com.moseeker.baseorm.db.analytics.tables.StmEvent_11_01.STM_EVENT_11_01;

    /**
     * 请求事件类型表
     */
    public final StmEventType STM_EVENT_TYPE = com.moseeker.baseorm.db.analytics.tables.StmEventType.STM_EVENT_TYPE;

    /**
     * The table <code>analytics.stm_groupv_pid</code>.
     */
    public final StmGroupvPid STM_GROUPV_PID = com.moseeker.baseorm.db.analytics.tables.StmGroupvPid.STM_GROUPV_PID;

    /**
     * 请求事件元数据表
     */
    public final StmHrEvent STM_HR_EVENT = com.moseeker.baseorm.db.analytics.tables.StmHrEvent.STM_HR_EVENT;

    /**
     * The table <code>analytics.stm_leave_phone_pid</code>.
     */
    public final StmLeavePhonePid STM_LEAVE_PHONE_PID = com.moseeker.baseorm.db.analytics.tables.StmLeavePhonePid.STM_LEAVE_PHONE_PID;

    /**
     * The table <code>analytics.stm_position</code>.
     */
    public final StmPosition STM_POSITION = com.moseeker.baseorm.db.analytics.tables.StmPosition.STM_POSITION;

    /**
     * The table <code>analytics.stm_pv_pid</code>.
     */
    public final StmPvPid STM_PV_PID = com.moseeker.baseorm.db.analytics.tables.StmPvPid.STM_PV_PID;

    /**
     * The table <code>analytics.stm_recom</code>.
     */
    public final StmRecom STM_RECOM = com.moseeker.baseorm.db.analytics.tables.StmRecom.STM_RECOM;

    /**
     * The table <code>analytics.stm_recom_abgroup</code>.
     */
    public final StmRecomAbgroup STM_RECOM_ABGROUP = com.moseeker.baseorm.db.analytics.tables.StmRecomAbgroup.STM_RECOM_ABGROUP;

    /**
     * 请求类型表
     */
    public final StmReqType STM_REQ_TYPE = com.moseeker.baseorm.db.analytics.tables.StmReqType.STM_REQ_TYPE;

    /**
     * 返回类型表
     */
    public final StmResType STM_RES_TYPE = com.moseeker.baseorm.db.analytics.tables.StmResType.STM_RES_TYPE;

    /**
     * The table <code>analytics.stm_rouah</code>.
     */
    public final StmRouah STM_ROUAH = com.moseeker.baseorm.db.analytics.tables.StmRouah.STM_ROUAH;

    /**
     * The table <code>analytics.stm_wxouah</code>.
     */
    public final StmWxouah STM_WXOUAH = com.moseeker.baseorm.db.analytics.tables.StmWxouah.STM_WXOUAH;

    /**
     * 记录推荐结果的点击信息
     */
    public final StApplication ST_APPLICATION = com.moseeker.baseorm.db.analytics.tables.StApplication.ST_APPLICATION;

    /**
     * 用于统计C端用户登录
     */
    public final StDquserLogin ST_DQUSER_LOGIN = com.moseeker.baseorm.db.analytics.tables.StDquserLogin.ST_DQUSER_LOGIN;

    /**
     * 用于统计雇主登录
     */
    public final StHrLogin ST_HR_LOGIN = com.moseeker.baseorm.db.analytics.tables.StHrLogin.ST_HR_LOGIN;

    /**
     * 记录留点击我感兴趣用户信息
     */
    public final StInterest ST_INTEREST = com.moseeker.baseorm.db.analytics.tables.StInterest.ST_INTEREST;

    /**
     * The table <code>analytics.st_jd_profile_label</code>.
     */
    public final StJdProfileLabel ST_JD_PROFILE_LABEL = com.moseeker.baseorm.db.analytics.tables.StJdProfileLabel.ST_JD_PROFILE_LABEL;

    /**
     * The table <code>analytics.st_job_similarity</code>.
     */
    public final StJobSimilarity ST_JOB_SIMILARITY = com.moseeker.baseorm.db.analytics.tables.StJobSimilarity.ST_JOB_SIMILARITY;

    /**
     * 记录joblist点击信息
     */
    public final StList ST_LIST = com.moseeker.baseorm.db.analytics.tables.StList.ST_LIST;

    /**
     * The table <code>analytics.st_load_resume_raw</code>.
     */
    public final StLoadResumeRaw ST_LOAD_RESUME_RAW = com.moseeker.baseorm.db.analytics.tables.StLoadResumeRaw.ST_LOAD_RESUME_RAW;

    /**
     * The table <code>analytics.st_official_puv</code>.
     */
    public final StOfficialPuv ST_OFFICIAL_PUV = com.moseeker.baseorm.db.analytics.tables.StOfficialPuv.ST_OFFICIAL_PUV;

    /**
     * 记录留手机用户信息
     */
    public final StPhone ST_PHONE = com.moseeker.baseorm.db.analytics.tables.StPhone.ST_PHONE;

    /**
     * The table <code>analytics.st_position_puv</code>.
     */
    public final StPositionPuv ST_POSITION_PUV = com.moseeker.baseorm.db.analytics.tables.StPositionPuv.ST_POSITION_PUV;

    /**
     * 记录推荐结果的点击信息
     */
    public final StTj ST_TJ = com.moseeker.baseorm.db.analytics.tables.StTj.ST_TJ;

    /**
     * 记录推荐结果的点击信息
     */
    public final StTjApplication ST_TJ_APPLICATION = com.moseeker.baseorm.db.analytics.tables.StTjApplication.ST_TJ_APPLICATION;

    /**
     * The table <code>analytics.sys_user</code>.
     */
    public final SysUser SYS_USER = com.moseeker.baseorm.db.analytics.tables.SysUser.SYS_USER;

    /**
     * The table <code>analytics.web_admin</code>.
     */
    public final WebAdmin WEB_ADMIN = com.moseeker.baseorm.db.analytics.tables.WebAdmin.WEB_ADMIN;

    /**
     * The table <code>analytics.web_hrf_core</code>.
     */
    public final WebHrfCore WEB_HRF_CORE = com.moseeker.baseorm.db.analytics.tables.WebHrfCore.WEB_HRF_CORE;

    /**
     * The table <code>analytics.web_hrp_core</code>.
     */
    public final WebHrpCore WEB_HRP_CORE = com.moseeker.baseorm.db.analytics.tables.WebHrpCore.WEB_HRP_CORE;

    /**
     * The table <code>analytics.web_im</code>.
     */
    public final WebIm WEB_IM = com.moseeker.baseorm.db.analytics.tables.WebIm.WEB_IM;

    /**
     * 每日浏览申请统计表
     */
    public final WebPlaDaily WEB_PLA_DAILY = com.moseeker.baseorm.db.analytics.tables.WebPlaDaily.WEB_PLA_DAILY;

    /**
     * 转发效果统计表
     */
    public final WebPositionShare WEB_POSITION_SHARE = com.moseeker.baseorm.db.analytics.tables.WebPositionShare.WEB_POSITION_SHARE;

    /**
     * The table <code>analytics.web_profile_completeness</code>.
     */
    public final WebProfileCompleteness WEB_PROFILE_COMPLETENESS = com.moseeker.baseorm.db.analytics.tables.WebProfileCompleteness.WEB_PROFILE_COMPLETENESS;

    /**
     * No further instances allowed
     */
    private Analytics() {
        super("analytics", null);
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
            JdResumeSimilarity.JD_RESUME_SIMILARITY,
            RecommendedResumes.RECOMMENDED_RESUMES,
            StmAbapplyPid.STM_ABAPPLY_PID,
            StmButtonPid.STM_BUTTON_PID,
            StmEvent.STM_EVENT,
            StmEvent_0113.STM_EVENT_0113,
            StmEvent_01_02.STM_EVENT_01_02,
            StmEvent_02_03.STM_EVENT_02_03,
            StmEvent_03_04.STM_EVENT_03_04,
            StmEvent_04_05.STM_EVENT_04_05,
            StmEvent_05_06.STM_EVENT_05_06,
            StmEvent_06_07.STM_EVENT_06_07,
            StmEvent_07_08.STM_EVENT_07_08,
            StmEvent_11_01.STM_EVENT_11_01,
            StmEventType.STM_EVENT_TYPE,
            StmGroupvPid.STM_GROUPV_PID,
            StmHrEvent.STM_HR_EVENT,
            StmLeavePhonePid.STM_LEAVE_PHONE_PID,
            StmPosition.STM_POSITION,
            StmPvPid.STM_PV_PID,
            StmRecom.STM_RECOM,
            StmRecomAbgroup.STM_RECOM_ABGROUP,
            StmReqType.STM_REQ_TYPE,
            StmResType.STM_RES_TYPE,
            StmRouah.STM_ROUAH,
            StmWxouah.STM_WXOUAH,
            StApplication.ST_APPLICATION,
            StDquserLogin.ST_DQUSER_LOGIN,
            StHrLogin.ST_HR_LOGIN,
            StInterest.ST_INTEREST,
            StJdProfileLabel.ST_JD_PROFILE_LABEL,
            StJobSimilarity.ST_JOB_SIMILARITY,
            StList.ST_LIST,
            StLoadResumeRaw.ST_LOAD_RESUME_RAW,
            StOfficialPuv.ST_OFFICIAL_PUV,
            StPhone.ST_PHONE,
            StPositionPuv.ST_POSITION_PUV,
            StTj.ST_TJ,
            StTjApplication.ST_TJ_APPLICATION,
            SysUser.SYS_USER,
            WebAdmin.WEB_ADMIN,
            WebHrfCore.WEB_HRF_CORE,
            WebHrpCore.WEB_HRP_CORE,
            WebIm.WEB_IM,
            WebPlaDaily.WEB_PLA_DAILY,
            WebPositionShare.WEB_POSITION_SHARE,
            WebProfileCompleteness.WEB_PROFILE_COMPLETENESS);
    }
}
