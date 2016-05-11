package com.moseeker.profile.dao.impl;

import org.springframework.stereotype.Repository;

import com.moseeker.common.providerutils.daoutils.BaseDaoImpl;
import com.moseeker.db.profiledb.tables.ProfileEducationExt;
import com.moseeker.db.profiledb.tables.records.ProfileEducationExtRecord;
import com.moseeker.profile.dao.EducationExtDao;

@Repository
public class EducationExtDaoImpl extends
		BaseDaoImpl<ProfileEducationExtRecord, ProfileEducationExt> implements
		EducationExtDao {

	@Override
	protected void initJOOQEntity() {
		this.tableLike = ProfileEducationExt.PROFILE_EDUCATION_EXT;
	}
}
