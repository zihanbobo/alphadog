package com.moseeker.baseorm.Thriftservice;

import java.util.List;

import com.moseeker.thrift.gen.dao.struct.*;
import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moseeker.baseorm.service.HrDBService;
import com.moseeker.baseorm.service.HrDaoService;
import com.moseeker.thrift.gen.application.struct.ProcessValidationStruct;
import com.moseeker.thrift.gen.common.struct.CommonQuery;
import com.moseeker.thrift.gen.common.struct.Response;
import com.moseeker.thrift.gen.dao.service.HrDBDao.Iface;

@Service
public class HrDBThriftService implements Iface {
	
	@Autowired
	private HrDBService hrDBService;
	
	@Autowired
    private HrDaoService hrDaoService;
	
	@Override
	public Response getHrHistoryOperations(List<ProcessValidationStruct> record) throws TException {
		return hrDBService.getHrHistoryOpertation(record);
	}

	@Override
	public HrEmployeeCertConfPojo getEmployeeCertConf(CommonQuery query) throws TException {
		return hrDaoService.getEmployeeCertConf(query);
	}

	@Override
	public List<HrEmployeeCustomFieldsPojo> getEmployeeCustomFields(CommonQuery query) throws TException {
		return hrDaoService.getEmployeeCustomFields(query);
	}

	@Override
	public HrHbConfigPojo getHbConfig(CommonQuery query) throws TException {
		return hrDaoService.getHbConfig(query);
	}

	@Override
	public List<HrHbConfigPojo> getHbConfigs(CommonQuery query) throws TException {
		return hrDaoService.getHbConfigs(query);
	}

	@Override
	public HrHbPositionBindingPojo getHbPositionBinding(CommonQuery query) throws TException {
		return hrDaoService.getHbPositionBinding(query);
	}

	@Override
	public List<HrHbPositionBindingPojo> getHbPositionBindings(CommonQuery query) throws TException {
		return hrDaoService.getHbPositionBindings(query);
	}

	@Override
	public HrHbItemsPojo getHbItem(CommonQuery query) throws TException {
		return hrDaoService.getHbItem(query);
	}

	@Override
	public List<HrHbItemsPojo> getHbItems(CommonQuery query) throws TException {
		return hrDaoService.getHbItems(query);
	}

	@Override
	public HrHbScratchCardPojo getHbScratchCard(CommonQuery query) throws TException {
		return hrDaoService.getHbScratchCard(query);
	}

	@Override
	public HrHbSendRecordPojo getHbSendRecord(CommonQuery query) throws TException {
		return hrDaoService.getHbSendRecord(query);
	}

	@Override
	public Response postHrOperationrecords(List<HrOperationrecordDO> record)
			throws TException {
		return hrDBService.postHrOperations(record);
	}

	@Override
	public Response postHrOperationrecord(HrOperationrecordDO record)
			throws TException {
		return hrDBService.postHrOperation(record);
	}
}
