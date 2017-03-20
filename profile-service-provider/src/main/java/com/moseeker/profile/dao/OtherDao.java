package com.moseeker.profile.dao;

import com.moseeker.common.providerutils.daoutils.BaseDao;
import com.moseeker.db.profiledb.tables.records.ProfileOtherRecord;



public interface OtherDao extends BaseDao<ProfileOtherRecord> {

	int delOtherByProfileId(int profileId);
}