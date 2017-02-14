package com.moseeker.baseorm.Thriftservice;

import java.util.List;

import com.moseeker.thrift.gen.dao.struct.UserEmployeeDTO;
import com.moseeker.thrift.gen.dao.struct.UserFavPositionDTO;
import com.moseeker.thrift.gen.dao.struct.UserUserDTO;
import org.apache.thrift.TException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moseeker.baseorm.dao.userdb.UserDao;
import com.moseeker.baseorm.dao.userdb.UserEmployeeDao;
import com.moseeker.baseorm.dao.userdb.UserFavPositionDao;
import com.moseeker.baseorm.service.UserEmployeeService;
import com.moseeker.db.userdb.tables.records.UserUserRecord;
import com.moseeker.thrift.gen.common.struct.CommonQuery;
import com.moseeker.thrift.gen.common.struct.Response;
import com.moseeker.thrift.gen.dao.service.UserDBDao.Iface;
import com.moseeker.thrift.gen.useraccounts.struct.User;
import com.moseeker.thrift.gen.useraccounts.struct.UserEmployeePointStruct;
import com.moseeker.thrift.gen.useraccounts.struct.UserEmployeeStruct;

@Service
public class UserDBDaoThriftService implements Iface {
	
	Logger logger = LoggerFactory.getLogger(UserDBDaoThriftService.class);
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private UserFavPositionDao favPositionDao;
	
	@Autowired
	private UserEmployeeDao employeeDao;
	
	@Autowired
	private UserEmployeeService userEmployeeService; 

	@Override
	public UserUserDTO getUser(CommonQuery query) throws TException {
		UserUserDTO user = new UserUserDTO();
		try {
			UserUserRecord record = userDao.getResource(query);
			if(record != null) {
				user = record.into(UserUserDTO.class);
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage(), e);
		} finally {
			//do nothing
		}
		
		return user;
	}

	@Override
	public UserUserDTO saveUser(UserUserDTO user) throws TException {
		if(user.getPassword() == null) {
			user.setPassword("");
		}
		return userDao.saveUser(user);
	}

	@Override
	public List<UserFavPositionDTO> getUserFavPositions(CommonQuery query) throws TException {
		return favPositionDao.getUserFavPositions(query);
	}

	@Override
	public UserEmployeeDTO getEmployee(CommonQuery query) throws TException {
		return employeeDao.getEmployee(query);
	}
	/*
	 * @auth zzt
	 * 获取推荐者列表
	 * (non-Javadoc)
	 * @see com.moseeker.thrift.gen.dao.service.UserDao.Iface#getUserEmployee(int, java.util.List)
	 */
	@Override
	public Response getUserEmployee(int companyId, List<Integer> weChatIds) throws TException {
		return userEmployeeService.getUserEmployeeByWeChats(companyId, weChatIds);
	}

	@Override
	public Response postUserEmployeePoints(List<UserEmployeePointStruct> records) throws TException {
		return userEmployeeService.postUserEmployeePointsRecords(records);
	}

	@Override
	public Response getPointSum(List<Long> record) throws TException {
		return userEmployeeService.getSumPoint(record);
	}

	@Override
	public Response putUserEmployees(List<UserEmployeeStruct> records) throws TException {
		return userEmployeeService.putUserEmployees(records);
	}

	@Override
	public Response putUserEmployeePoints(List<UserEmployeePointStruct> records) throws TException {
		return userEmployeeService.putUserEmployeePointsRecords(records);
	}
}
