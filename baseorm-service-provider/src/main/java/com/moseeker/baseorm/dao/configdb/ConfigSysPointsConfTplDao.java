package com.moseeker.baseorm.dao.configdb;

import com.moseeker.baseorm.crud.JooqCrudImpl;
import com.moseeker.baseorm.db.configdb.tables.ConfigSysPointsConfTpl;
import com.moseeker.baseorm.db.configdb.tables.records.ConfigSysPointsConfTplRecord;
import com.moseeker.baseorm.db.hrdb.tables.HrPointsConf;
import com.moseeker.common.dbutils.DBConnHelper;
import com.moseeker.thrift.gen.config.HrAwardConfigTemplate;
import com.moseeker.thrift.gen.dao.struct.configdb.ConfigSysPointsConfTplDO;
import org.jooq.DSLContext;
import org.jooq.Record8;
import org.jooq.Result;
import org.jooq.SelectOnConditionStep;
import org.jooq.impl.TableImpl;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
* @author xxx
* ConfigSysPointsConfTplDao 实现类 （groovy 生成）
* 2017-03-20
*/
@Repository
public class ConfigSysPointsConfTplDao extends JooqCrudImpl<ConfigSysPointsConfTplDO, ConfigSysPointsConfTplRecord> {


	public ConfigSysPointsConfTplDao(TableImpl<ConfigSysPointsConfTplRecord> table, Class<ConfigSysPointsConfTplDO> configSysPointsConfTplDOClass) {
		super(table, configSysPointsConfTplDOClass);
	}

   public List<HrAwardConfigTemplate> findRecruitProcesses(int companyId) throws Exception{
		List<HrAwardConfigTemplate> list=new ArrayList<HrAwardConfigTemplate>();
		Connection conn = null;
		try {
			conn = DBConnHelper.DBConn.getConn();
			DSLContext create = DBConnHelper.DBConn.getJooqDSL(conn);
			SelectOnConditionStep<Record8<Integer, Integer, Integer, Integer, Integer, Integer, String, Long>> table =create.select(
					ConfigSysPointsConfTpl.CONFIG_SYS_POINTS_CONF_TPL.ID,
					ConfigSysPointsConfTpl.CONFIG_SYS_POINTS_CONF_TPL.AWARD, 
					ConfigSysPointsConfTpl.CONFIG_SYS_POINTS_CONF_TPL.DISABLE,
					ConfigSysPointsConfTpl.CONFIG_SYS_POINTS_CONF_TPL.PRIORITY, 
					ConfigSysPointsConfTpl.CONFIG_SYS_POINTS_CONF_TPL.RECRUIT_ORDER,
					ConfigSysPointsConfTpl.CONFIG_SYS_POINTS_CONF_TPL.TYPE_ID,
					ConfigSysPointsConfTpl.CONFIG_SYS_POINTS_CONF_TPL.STATUS,
					HrPointsConf.HR_POINTS_CONF.REWARD)
			.from(ConfigSysPointsConfTpl.CONFIG_SYS_POINTS_CONF_TPL)
			.leftJoin(HrPointsConf.HR_POINTS_CONF).on("hrdb.hr_points_conf.template_id=configdb.config_sys_points_conf_tpl.id ").and(HrPointsConf.HR_POINTS_CONF.COMPANY_ID.eq(companyId));
			Result<Record8<Integer, Integer, Integer, Integer, Integer, Integer, String, Long>> result=table.fetch();
			if(result!=null&&result.size()>0){
				HrAwardConfigTemplate config=null;
				for(Record8<Integer, Integer, Integer, Integer, Integer, Integer, String, Long> r:result){
					config=new HrAwardConfigTemplate();
				    config.setId(r.getValue(ConfigSysPointsConfTpl.CONFIG_SYS_POINTS_CONF_TPL.ID));
				    config.setAward(r.getValue(ConfigSysPointsConfTpl.CONFIG_SYS_POINTS_CONF_TPL.AWARD));
				    config.setDisable(r.getValue(ConfigSysPointsConfTpl.CONFIG_SYS_POINTS_CONF_TPL.DISABLE));
				    config.setPriority(r.getValue(ConfigSysPointsConfTpl.CONFIG_SYS_POINTS_CONF_TPL.PRIORITY));
				    config.setRecruit_order(r.getValue(ConfigSysPointsConfTpl.CONFIG_SYS_POINTS_CONF_TPL.RECRUIT_ORDER));
				    config.setType_id(r.getValue(ConfigSysPointsConfTpl.CONFIG_SYS_POINTS_CONF_TPL.TYPE_ID));
				    config.setStatus(r.getValue(ConfigSysPointsConfTpl.CONFIG_SYS_POINTS_CONF_TPL.STATUS));
				    if(r.getValue(HrPointsConf.HR_POINTS_CONF.REWARD)==null){
				    	 config.setReward(0);
				    }else{
				    	 config.setReward(r.getValue(HrPointsConf.HR_POINTS_CONF.REWARD));
				    }
				   
				    list.add(config);
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
