package com.moseeker.baseorm.Thriftservice;

import java.util.ArrayList;
import java.util.List;

import org.apache.thrift.TException;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moseeker.baseorm.dao.hr.HRThirdPartyAccountDao;
import com.moseeker.baseorm.dao.hr.HRThirdPartyPositionDao;
import com.moseeker.baseorm.db.hrdb.tables.records.HrThirdPartyAccountRecord;
import com.moseeker.thrift.gen.common.struct.CommonQuery;
import com.moseeker.thrift.gen.common.struct.Response;
import com.moseeker.thrift.gen.dao.service.CompanyDao.Iface;
import com.moseeker.thrift.gen.dao.struct.ThirdPartAccountData;
import com.moseeker.thrift.gen.dao.struct.ThirdPartyPositionData;

/**
 * 提供公司数据以及公司相关数据的查询
 * @author wjf
 *
 */
@Service
public class CompanyThriftService implements Iface {
	
	private Logger logger = LoggerFactory.getLogger(CompanyThriftService.class);
	
	@Autowired
	private HRThirdPartyAccountDao thirdPartyAccountDao;
	
	@Autowired
	private HRThirdPartyPositionDao thirdPartyPositionDao;

	@Override
	public ThirdPartAccountData getThirdPartyAccount(CommonQuery query) throws TException {
		ThirdPartAccountData data =  new ThirdPartAccountData();
		try {
			HrThirdPartyAccountRecord record = thirdPartyAccountDao.getResource(query);
			if(record != null) {
				copy(data, record);
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage(), e);
		} finally {
			//do nothing
		}
		return data;
	}
	
	@Override
	public List<ThirdPartAccountData> getThirdPartyBindingAccounts(CommonQuery query) throws TException {
		List<ThirdPartAccountData> datas = new ArrayList<>();
		try {
			List<HrThirdPartyAccountRecord> records = thirdPartyAccountDao.getThirdPartyBindingAccounts(query);
			if(records != null && records.size() > 0) {
				records.forEach(r -> {
					ThirdPartAccountData data = new ThirdPartAccountData();
					copy(data, r);
				});
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error(e.getMessage(), e);
		} finally {
			//do nothing
		}
		return datas;
	}
	
	/**
	 * 查询第三方职位
	 */
	@Override
	public List<ThirdPartyPositionData> getThirdPartyPositions(CommonQuery query) throws TException {
		
		return thirdPartyPositionDao.getThirdPartyPositions(query);
	}

	@Override
	public Response upsertThirdPartyPositions(List<ThirdPartyPositionData> positions) throws TException {
		
		return thirdPartyPositionDao.upsertThirdPartyPositions(positions);
	}

	private void copy(ThirdPartAccountData data, HrThirdPartyAccountRecord record) {
		data.setId(record.getId());
		data.setBinding(record.getBinding());
		data.setChannel(record.getChannel());
		data.setCompany_id(record.getCompanyId().intValue());
		data.setMembername(record.getMembername());
		data.setUsername(record.getUsername());
		data.setPassword(record.getPassword());
		data.setRemain_num(record.getRemainNum().intValue());
		data.setSync_time(new DateTime(record.getSyncTime()).toString("yyyy-MM-dd"));
		data.setUsername(record.getUsername());
	}
	
	public HRThirdPartyAccountDao getThirdPartyAccountDao() {
		return thirdPartyAccountDao;
	}

	public void setThirdPartyAccountDao(HRThirdPartyAccountDao thirdPartyAccountDao) {
		this.thirdPartyAccountDao = thirdPartyAccountDao;
	}

	public HRThirdPartyPositionDao getThirdPartyPositionDao() {
		return thirdPartyPositionDao;
	}

	public void setThirdPartyPositionDao(HRThirdPartyPositionDao thirdPartyPositionDao) {
		this.thirdPartyPositionDao = thirdPartyPositionDao;
	}
}
