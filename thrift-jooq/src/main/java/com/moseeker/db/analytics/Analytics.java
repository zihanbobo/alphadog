/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.analytics;


import com.moseeker.db.analytics.tables.JdResumeSimilarity;
import com.moseeker.db.analytics.tables.RecommendedResumes;
import com.moseeker.db.analytics.tables.StApplication;
import com.moseeker.db.analytics.tables.StDquserLogin;
import com.moseeker.db.analytics.tables.StHrLogin;
import com.moseeker.db.analytics.tables.StInterest;
import com.moseeker.db.analytics.tables.StJobSimilarity;
import com.moseeker.db.analytics.tables.StList;
import com.moseeker.db.analytics.tables.StLoadResume;
import com.moseeker.db.analytics.tables.StLoadResumeRaw;
import com.moseeker.db.analytics.tables.StOfficialPuv;
import com.moseeker.db.analytics.tables.StPhone;
import com.moseeker.db.analytics.tables.StPositionPuv;
import com.moseeker.db.analytics.tables.StTj;
import com.moseeker.db.analytics.tables.StTjApplication;
import com.moseeker.db.analytics.tables.StmAbapplyPid;
import com.moseeker.db.analytics.tables.StmButtonPid;
import com.moseeker.db.analytics.tables.StmEvent;
import com.moseeker.db.analytics.tables.StmEventType;
import com.moseeker.db.analytics.tables.StmEvent_0113;
import com.moseeker.db.analytics.tables.StmEvent_01_02;
import com.moseeker.db.analytics.tables.StmEvent_02_03;
import com.moseeker.db.analytics.tables.StmEvent_03_04;
import com.moseeker.db.analytics.tables.StmEvent_04_05;
import com.moseeker.db.analytics.tables.StmEvent_05_06;
import com.moseeker.db.analytics.tables.StmEvent_06_07;
import com.moseeker.db.analytics.tables.StmEvent_07_08;
import com.moseeker.db.analytics.tables.StmEvent_11_01;
import com.moseeker.db.analytics.tables.StmGroupvPid;
import com.moseeker.db.analytics.tables.StmHrEvent;
import com.moseeker.db.analytics.tables.StmLeavePhonePid;
import com.moseeker.db.analytics.tables.StmPcEvent;
import com.moseeker.db.analytics.tables.StmPosition;
import com.moseeker.db.analytics.tables.StmPvPid;
import com.moseeker.db.analytics.tables.StmRecom;
import com.moseeker.db.analytics.tables.StmRecomAbgroup;
import com.moseeker.db.analytics.tables.StmReqType;
import com.moseeker.db.analytics.tables.StmResType;
import com.moseeker.db.analytics.tables.StmRouah;
import com.moseeker.db.analytics.tables.StmWxouah;
import com.moseeker.db.analytics.tables.SysUser;
import com.moseeker.db.analytics.tables.ViewResumeImport;
import com.moseeker.db.analytics.tables.WebAdmin;
import com.moseeker.db.analytics.tables.WebHrfCore;
import com.moseeker.db.analytics.tables.WebHrpCore;
import com.moseeker.db.analytics.tables.WebIm;
import com.moseeker.db.analytics.tables.WebPlaDaily;
import com.moseeker.db.analytics.tables.WebPositionShare;
import com.moseeker.db.analytics.tables.WebUserResume;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Analytics extends SchemaImpl {

	private static final long serialVersionUID = 411537026;

	/**
	 * The reference instance of <code>analytics</code>
	 */
	public static final Analytics ANALYTICS = new Analytics();

	/**
	 * No further instances allowed
	 */
	private Analytics() {
		super("analytics");
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
			StmPcEvent.STM_PC_EVENT,
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
			StJobSimilarity.ST_JOB_SIMILARITY,
			StList.ST_LIST,
			StLoadResume.ST_LOAD_RESUME,
			StLoadResumeRaw.ST_LOAD_RESUME_RAW,
			StOfficialPuv.ST_OFFICIAL_PUV,
			StPhone.ST_PHONE,
			StPositionPuv.ST_POSITION_PUV,
			StTj.ST_TJ,
			StTjApplication.ST_TJ_APPLICATION,
			SysUser.SYS_USER,
			ViewResumeImport.VIEW_RESUME_IMPORT,
			WebAdmin.WEB_ADMIN,
			WebHrfCore.WEB_HRF_CORE,
			WebHrpCore.WEB_HRP_CORE,
			WebIm.WEB_IM,
			WebPlaDaily.WEB_PLA_DAILY,
			WebPositionShare.WEB_POSITION_SHARE,
			WebUserResume.WEB_USER_RESUME);
	}
}