package com.moseeker.baseorm.dao.userdb;

import com.moseeker.baseorm.crud.JooqCrudImpl;
import com.moseeker.baseorm.db.userdb.tables.UserEmployeePointsRecord;
import com.moseeker.baseorm.db.userdb.tables.records.UserEmployeePointsRecordRecord;
import com.moseeker.thrift.gen.dao.struct.userdb.UserEmployeePointsRecordDO;
import com.moseeker.thrift.gen.useraccounts.struct.UserEmployeePointSum;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import org.jooq.Record2;
import org.jooq.Result;
import org.jooq.SelectConditionStep;
import static org.jooq.impl.DSL.sum;
import org.jooq.impl.TableImpl;
import org.springframework.stereotype.Repository;

@Repository
public class UserEmployeePointsRecordDao extends JooqCrudImpl<UserEmployeePointsRecordDO, UserEmployeePointsRecordRecord> {

	public UserEmployeePointsRecordDao() {
		super(UserEmployeePointsRecord.USER_EMPLOYEE_POINTS_RECORD, UserEmployeePointsRecordDO.class);
	}

	public UserEmployeePointsRecordDao(TableImpl<UserEmployeePointsRecordRecord> table, Class<UserEmployeePointsRecordDO> userEmployeePointsRecordDOClass) {
		super(table, userEmployeePointsRecordDOClass);
	}

	public List<UserEmployeePointSum> getSumRecord(List<Long> list) throws Exception{
		List<UserEmployeePointSum> points=new ArrayList<UserEmployeePointSum>();
		SelectConditionStep<Record2<BigDecimal, Long>> table=create.select(
				sum(UserEmployeePointsRecord.USER_EMPLOYEE_POINTS_RECORD.AWARD),
				UserEmployeePointsRecord.USER_EMPLOYEE_POINTS_RECORD.EMPLOYEE_ID)
		.from(UserEmployeePointsRecord.USER_EMPLOYEE_POINTS_RECORD)
		.where(UserEmployeePointsRecord.USER_EMPLOYEE_POINTS_RECORD.EMPLOYEE_ID.in(list));
		Result<Record2<BigDecimal, Long>> result=table.fetch();
		if(result!=null&&result.size()>0){
			UserEmployeePointSum point=null;
			for(Record2<BigDecimal, Long> r:result){
				//由于可能没有记录，所以可能为null
				if(r.getValue(1)!=null){
					point=new UserEmployeePointSum();
					point.setEmployee_id((long)r.getValue(1));
					if(r.getValue(0)==null){
						point.setAward(0L);
					}else{
						point.setAward(Long.parseLong(r.getValue(0)+""));
					}
					points.add(point);
				}
			}
		}
		return points;
	}

	public Result<Record2<Long,BigDecimal>> countEmployeeAwards(List<Integer> employeeIdList, LocalDateTime lastFriday,
																LocalDateTime currentFriday) {
		return create
				.select(
						UserEmployeePointsRecord.USER_EMPLOYEE_POINTS_RECORD.EMPLOYEE_ID,
						sum(UserEmployeePointsRecord.USER_EMPLOYEE_POINTS_RECORD.AWARD)
				)
				.from(UserEmployeePointsRecord.USER_EMPLOYEE_POINTS_RECORD)
				.where(UserEmployeePointsRecord.USER_EMPLOYEE_POINTS_RECORD.EMPLOYEE_ID.in(employeeIdList))
				.and(UserEmployeePointsRecord.USER_EMPLOYEE_POINTS_RECORD._CREATE_TIME.gt(new Timestamp(lastFriday.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli())))
				.and(UserEmployeePointsRecord.USER_EMPLOYEE_POINTS_RECORD._CREATE_TIME.le(new Timestamp(currentFriday.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli())))
				.groupBy(UserEmployeePointsRecord.USER_EMPLOYEE_POINTS_RECORD.EMPLOYEE_ID)
				.fetch();
	}
}
