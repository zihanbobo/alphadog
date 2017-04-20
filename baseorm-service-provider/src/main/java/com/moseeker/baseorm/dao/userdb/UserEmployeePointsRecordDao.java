package com.moseeker.baseorm.dao.userdb;

import com.moseeker.baseorm.db.userdb.tables.UserEmployeePointsRecord;
import com.moseeker.baseorm.db.userdb.tables.records.UserEmployeePointsRecordRecord;
import com.moseeker.baseorm.util.BaseDaoImpl;
import com.moseeker.common.dbutils.DBConnHelper;
import com.moseeker.thrift.gen.useraccounts.struct.UserEmployeePointSum;

import org.jooq.DSLContext;
import org.jooq.Record2;
import org.jooq.Result;
import org.jooq.SelectConditionStep;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import static org.jooq.impl.DSL.sum;
@Service
public class UserEmployeePointsRecordDao extends BaseDaoImpl<UserEmployeePointsRecordRecord, UserEmployeePointsRecord>{

	@Override
	protected void initJOOQEntity() {
		// TODO Auto-generated method stub
		this.tableLike=UserEmployeePointsRecord.USER_EMPLOYEE_POINTS_RECORD;
	}

	public List<UserEmployeePointSum> getSumRecord(List<Long> list) throws Exception{
		Connection conn = null;
		List<UserEmployeePointSum> points=new ArrayList<UserEmployeePointSum>();
		try {
			conn = DBConnHelper.DBConn.getConn();
			DSLContext create = DBConnHelper.DBConn.getJooqDSL(conn);
			SelectConditionStep<Record2<BigDecimal, Long>> table=create.select(
					sum(UserEmployeePointsRecord.USER_EMPLOYEE_POINTS_RECORD.AWARD),
					UserEmployeePointsRecord.USER_EMPLOYEE_POINTS_RECORD.EMPLOYEE_ID)
			.from(UserEmployeePointsRecord.USER_EMPLOYEE_POINTS_RECORD)
			.where(UserEmployeePointsRecord.USER_EMPLOYEE_POINTS_RECORD.EMPLOYEE_ID.in(list));
			Result<Record2<BigDecimal, Long>> result=table.fetch();
			if(result!=null&&result.size()>0){
				UserEmployeePointSum point=null;
				for(Record2<BigDecimal, Long> r:result){
					point=new UserEmployeePointSum();
					//由于可能没有记录，所以可能为null
					if(r.getValue(0)==null){
						point.setAward(0L);
					}else{
						point.setAward(Long.parseLong(r.getValue(0)+""));
					}
					//EMPLOYEE_ID不可能为null，所以不判断null
					point.setEmployee_id((long)r.getValue(1));
					points.add(point);
				}
			}
			
		}catch (Exception e) {
			logger.error("error", e);
			throw new Exception(e);
		} finally {
			if(conn != null && !conn.isClosed()) {
				conn.close();
			}
		}
		
		return points;
	}
}