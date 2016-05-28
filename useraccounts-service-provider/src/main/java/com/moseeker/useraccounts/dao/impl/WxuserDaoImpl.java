package com.moseeker.useraccounts.dao.impl;

import org.springframework.stereotype.Repository;

import com.moseeker.common.providerutils.daoutils.BaseDaoImpl;
import com.moseeker.db.userdb.tables.UserWxUser;
import com.moseeker.db.userdb.tables.records.UserWxUserRecord;

@Repository
public class WxuserDaoImpl extends BaseDaoImpl<UserWxUserRecord, UserWxUser> {

	@Override
	protected void initJOOQEntity() {
		this.tableLike = UserWxUser.USER_WX_USER;
	}
}
