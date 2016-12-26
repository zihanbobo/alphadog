package com.moseeker.baseorm.dao.jobdb;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Record5;
import org.jooq.Record8;
import org.jooq.Record9;
import org.jooq.Result;
import org.jooq.SelectJoinStep;
import org.jooq.types.UInteger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.moseeker.baseorm.db.jobdb.tables.JobApplication;
import com.moseeker.baseorm.db.jobdb.tables.JobPosition;
import com.moseeker.baseorm.db.jobdb.tables.records.JobApplicationRecord;
import com.moseeker.baseorm.util.BaseDaoImpl;
import com.moseeker.common.dbutils.DBConnHelper;
import com.moseeker.db.configdb.tables.ConfigSysPointsConfTpl;
import com.moseeker.thrift.gen.application.struct.ProcessValidationStruct;
@Service
public class JobApplicationDao extends BaseDaoImpl<JobApplicationRecord, JobApplication>{
	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	@Override
	protected void initJOOQEntity() {
		// TODO Auto-generated method stub
		this.tableLike=JobApplication.JOB_APPLICATION;
	}
	
	public List<ProcessValidationStruct> getAuth(List<UInteger> appIds,Integer companyId,Integer progressStatus) throws Exception{
		List<ProcessValidationStruct> list=new ArrayList<ProcessValidationStruct>();
		Connection conn = null;
		try {
			conn = DBConnHelper.DBConn.getConn();
			DSLContext create = DBConnHelper.DBConn.getJooqDSL(conn);
			SelectJoinStep<Record9<UInteger, UInteger, UInteger, UInteger, String, UInteger, Integer, Integer, String>> table=create.select(
					JobApplication.JOB_APPLICATION.ID, 
					JobApplication.JOB_APPLICATION.COMPANY_ID, 
					JobApplication.JOB_APPLICATION.RECOMMENDER_ID,
					JobApplication.JOB_APPLICATION.APPLIER_ID,
					JobApplication.JOB_APPLICATION.APPLIER_NAME,
					JobApplication.JOB_APPLICATION.RECOMMENDER_USER_ID,
					ConfigSysPointsConfTpl.CONFIG_SYS_POINTS_CONF_TPL.ID ,
					ConfigSysPointsConfTpl.CONFIG_SYS_POINTS_CONF_TPL.RECRUIT_ORDER,
					JobPosition.JOB_POSITION.TITLE
					).from(JobApplication.JOB_APPLICATION);
			table.leftJoin(ConfigSysPointsConfTpl.CONFIG_SYS_POINTS_CONF_TPL)
			.on("jobdb.job_application.app_tpl_id=configdb.config_sys_points_conf_tpl.id");
			table.leftJoin(JobPosition.JOB_POSITION).on("jobdb.job_application.position_id=jobdb.job_position.id");
			table.where(JobApplication.JOB_APPLICATION.ID.in(appIds)
					.and(JobApplication.JOB_APPLICATION.COMPANY_ID.eq(UInteger.valueOf(companyId))));
			if(progressStatus==13){
				table.where().and(JobApplication.JOB_APPLICATION.APP_TPL_ID.notEqual(UInteger.valueOf(4)));
			}else if(progressStatus==99){
				table.where().and(JobApplication.JOB_APPLICATION.APP_TPL_ID.equal(UInteger.valueOf(4)));
			}
			Result<Record9<UInteger, UInteger, UInteger, UInteger, String, UInteger, Integer, Integer, String>> result=table.fetch();
			if(result!=null&&result.size()>0){
				ProcessValidationStruct data= null;
				for(Record9<UInteger, UInteger, UInteger, UInteger, String, UInteger, Integer, Integer, String> record:result){
					data=new ProcessValidationStruct();
					data.setCompany_id(record.getValue(JobApplication.JOB_APPLICATION.COMPANY_ID).intValue());
					data.setId(record.getValue(JobApplication.JOB_APPLICATION.ID).intValue());
					data.setRecommender_id(record.getValue(JobApplication.JOB_APPLICATION.RECOMMENDER_ID).intValue());
					data.setRecruit_order(record.getValue(ConfigSysPointsConfTpl.CONFIG_SYS_POINTS_CONF_TPL.RECRUIT_ORDER).intValue());
					data.setTemplate_id(record.getValue(ConfigSysPointsConfTpl.CONFIG_SYS_POINTS_CONF_TPL.ID).intValue());
					data.setApplier_id(record.getValue(JobApplication.JOB_APPLICATION.APPLIER_ID).intValue());
					data.setApplier_name(record.getValue(JobApplication.JOB_APPLICATION.APPLIER_NAME));
					data.setPosition_name(record.getValue(JobPosition.JOB_POSITION.TITLE));
					data.setRecommender_user_id(record.getValue(JobApplication.JOB_APPLICATION.RECOMMENDER_USER_ID).intValue());
					list.add(data);
				}
			}
			
		}catch(Exception e){
			logger.error("error", e);
			throw new Exception(e);
		}finally{
			if(conn!=null&&!conn.isClosed()){
				conn.close();
				conn=null;
			}
		}
		return list;
	}
}
