package com.moseeker.profile.dao.impl;

import java.sql.Connection;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.jooq.DSLContext;
import org.jooq.Record1;
import org.jooq.Result;

import org.springframework.stereotype.Repository;

import com.moseeker.common.dbutils.DBConnHelper;
import com.moseeker.common.providerutils.daoutils.BaseDaoImpl;
import com.moseeker.common.util.StringUtils;
import com.moseeker.db.dictdb.tables.DictCity;
import com.moseeker.db.dictdb.tables.DictIndustry;
import com.moseeker.db.dictdb.tables.DictPosition;
import com.moseeker.db.dictdb.tables.records.DictCityRecord;
import com.moseeker.db.dictdb.tables.records.DictIndustryRecord;
import com.moseeker.db.dictdb.tables.records.DictPositionRecord;
import com.moseeker.db.profiledb.tables.ProfileCompleteness;
import com.moseeker.db.profiledb.tables.ProfileIntention;
import com.moseeker.db.profiledb.tables.ProfileIntentionCity;
import com.moseeker.db.profiledb.tables.ProfileIntentionIndustry;
import com.moseeker.db.profiledb.tables.ProfileIntentionPosition;
import com.moseeker.db.profiledb.tables.ProfileProfile;
import com.moseeker.db.profiledb.tables.records.ProfileCompletenessRecord;
import com.moseeker.db.profiledb.tables.records.ProfileIntentionCityRecord;
import com.moseeker.db.profiledb.tables.records.ProfileIntentionPositionRecord;
import com.moseeker.db.profiledb.tables.records.ProfileIntentionRecord;
import com.moseeker.profile.dao.IntentionDao;
import com.moseeker.profile.service.impl.serviceutils.CompletenessCalculator;

@Repository
public class IntentionDaoImpl extends BaseDaoImpl<ProfileIntentionRecord, ProfileIntention> implements IntentionDao {
	
	private CompletenessCalculator completenessCalculator = new CompletenessCalculator();

	@Override
	protected void initJOOQEntity() {
		this.tableLike = ProfileIntention.PROFILE_INTENTION;
	}

	@Override
	public int updateProfileUpdateTime(HashSet<Integer> intentionIds) {
		int status = 0;
		try (Connection conn = DBConnHelper.DBConn.getConn();
				DSLContext create = DBConnHelper.DBConn.getJooqDSL(conn)) {

			Timestamp updateTime = new Timestamp(System.currentTimeMillis());
			status = create.update(ProfileProfile.PROFILE_PROFILE)
					.set(ProfileProfile.PROFILE_PROFILE.UPDATE_TIME, updateTime)
					.where(ProfileProfile.PROFILE_PROFILE.ID
							.in(create.select(ProfileIntention.PROFILE_INTENTION.PROFILE_ID)
									.from(ProfileIntention.PROFILE_INTENTION)
									.where(ProfileIntention.PROFILE_INTENTION.ID.in(intentionIds))))
					.execute();

		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return status;
	}

	@Override
	public int delIntentionsByProfileId(int profileId) {
		int count = 0;
		try (Connection conn = DBConnHelper.DBConn.getConn();
				DSLContext create = DBConnHelper.DBConn.getJooqDSL(conn)) {
			
			Result<Record1<Integer>> intentionIds = create.select(ProfileIntention.PROFILE_INTENTION.ID).from(ProfileIntention.PROFILE_INTENTION).where(
					ProfileIntention.PROFILE_INTENTION.PROFILE_ID.equal((int)(profileId))).fetch();

			create.deleteFrom(ProfileIntentionCity.PROFILE_INTENTION_CITY)
					.where(ProfileIntentionCity.PROFILE_INTENTION_CITY.PROFILE_INTENTION_ID
							.in(intentionIds))
					.execute();
			
			create.deleteFrom(ProfileIntentionPosition.PROFILE_INTENTION_POSITION)
			.where(ProfileIntentionPosition.PROFILE_INTENTION_POSITION.PROFILE_INTENTION_ID
					.in(intentionIds))
					.execute();
			
			create.deleteFrom(ProfileIntentionIndustry.PROFILE_INTENTION_INDUSTRY)
			.where(ProfileIntentionIndustry.PROFILE_INTENTION_INDUSTRY.PROFILE_INTENTION_ID
					.in(intentionIds))
			.execute();
			
			count = create.deleteFrom(ProfileIntention.PROFILE_INTENTION).where(
					ProfileIntention.PROFILE_INTENTION.PROFILE_ID.equal((int)(profileId))).execute();

		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		} finally {
			// do nothing
		}
		return count;
	}

	@Override
	public int postIntentions(List<IntentionRecord> intentionRecords) {
		try (Connection conn = DBConnHelper.DBConn.getConn();
				DSLContext create = DBConnHelper.DBConn.getJooqDSL(conn)) {
			if (intentionRecords != null && intentionRecords.size() > 0) {
				
				ProfileCompletenessRecord completenessRecord = create.selectFrom(ProfileCompleteness.PROFILE_COMPLETENESS).where(ProfileCompleteness.PROFILE_COMPLETENESS.PROFILE_ID.equal(intentionRecords.get(0).getProfileId())).fetchOne();
				if(completenessRecord == null) {
					completenessRecord = new ProfileCompletenessRecord();
					completenessRecord.setProfileId(intentionRecords.get(0).getProfileId());
				}
				
				Result<DictCityRecord> cities = create.selectFrom(DictCity.DICT_CITY).fetch();
				Result<DictPositionRecord> positions = create.selectFrom(DictPosition.DICT_POSITION).fetch();
				Result<DictIndustryRecord> industries = create.selectFrom(DictIndustry.DICT_INDUSTRY).fetch();
				
				List<ProfileIntentionCityRecord> intentionCityRecords = new ArrayList<>();
				List<ProfileIntentionPositionRecord> intentionPositionRecords = new ArrayList<>();
				intentionRecords.forEach(intentionRecord -> {
					intentionRecord.setCreateTime(new Timestamp(System.currentTimeMillis()));
					create.attach(intentionRecord);
					intentionRecord.insert();
					if (intentionRecord.getCities().size() > 0) {
						intentionRecord.getCities().forEach(city -> {
							city.setProfileIntentionId(intentionRecord.getId());
							if (!StringUtils.isNullOrEmpty(city.getCityName())) {
								for (DictCityRecord cityRecord : cities) {
									if (city.getCityName().equals(cityRecord.getName())) {
										city.setCityCode(cityRecord.getCode());
										intentionCityRecords.add(city);
										break;
									}
								}
							}
							create.attach(city);
							city.insert();
						});
					}
					if (intentionRecord.getPositions().size() > 0) {
						intentionRecord.getPositions().forEach(position -> {
							position.setProfileIntentionId(intentionRecord.getId());
							if (!StringUtils.isNullOrEmpty(position.getPositionName())) {
								for (DictPositionRecord positionRecord : positions) {
									if (positionRecord.getName().equals(position.getPositionName())) {
										position.setPositionCode(positionRecord.getCode());
										intentionPositionRecords.add(position);
										break;
									}
								}
							}
							create.attach(position);
							position.insert();
						});
					}
					if (intentionRecord.getIndustries().size() > 0) {
						intentionRecord.getIndustries().forEach(industry -> {
							industry.setProfileIntentionId(intentionRecord.getId());
							if (!StringUtils.isNullOrEmpty(industry.getIndustryName())) {
								for (DictIndustryRecord industryRecord : industries) {
									if (industry.getIndustryName().equals(industryRecord.getName())) {
										industry.setIndustryCode(industryRecord.getCode());
										break;
									}
								}
							}
							create.attach(industry);
							industry.insert();
						});
					}
				});
				int intentionCompleteness = completenessCalculator.calculateIntentions(intentionRecords,
						intentionCityRecords, intentionPositionRecords);
				completenessRecord.setProfileIntention(intentionCompleteness);
			}

		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		} finally {
			// do nothing
		}
		return 0;
	}
}
