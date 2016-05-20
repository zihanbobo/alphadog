package com.moseeker.profile.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.thrift.TException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.moseeker.common.util.Constant;
import com.moseeker.common.util.DateUtils;
import com.moseeker.db.dictdb.tables.records.DictCountryRecord;
import com.moseeker.db.profiledb.tables.records.ProfileAwardsRecord;
import com.moseeker.db.profiledb.tables.records.ProfileBasicRecord;
import com.moseeker.db.profiledb.tables.records.ProfileCredentialsRecord;
import com.moseeker.db.profiledb.tables.records.ProfileEducationRecord;
import com.moseeker.db.profiledb.tables.records.ProfileIntentionCityRecord;
import com.moseeker.db.profiledb.tables.records.ProfileIntentionIndustryRecord;
import com.moseeker.db.profiledb.tables.records.ProfileIntentionPositionRecord;
import com.moseeker.db.profiledb.tables.records.ProfileIntentionRecord;
import com.moseeker.db.profiledb.tables.records.ProfileLanguageRecord;
import com.moseeker.db.profiledb.tables.records.ProfileProfileRecord;
import com.moseeker.db.profiledb.tables.records.ProfileProjectexpRecord;
import com.moseeker.db.profiledb.tables.records.ProfileSkillRecord;
import com.moseeker.db.profiledb.tables.records.ProfileWorkexpRecord;
import com.moseeker.db.profiledb.tables.records.ProfileWorksRecord;
import com.moseeker.db.userdb.tables.records.UserUserRecord;
import com.moseeker.profile.dao.AttachmentDao;
import com.moseeker.profile.dao.AwardsDao;
import com.moseeker.profile.dao.CountryDao;
import com.moseeker.profile.dao.CredentialsDao;
import com.moseeker.profile.dao.EducationDao;
import com.moseeker.profile.dao.IntentionCityDao;
import com.moseeker.profile.dao.IntentionDao;
import com.moseeker.profile.dao.IntentionIndustryDao;
import com.moseeker.profile.dao.IntentionPositionDao;
import com.moseeker.profile.dao.LanguageDao;
import com.moseeker.profile.dao.ProfileBasicDao;
import com.moseeker.profile.dao.ProfileDao;
import com.moseeker.profile.dao.ProfileImportDao;
import com.moseeker.profile.dao.ProjectExpDao;
import com.moseeker.profile.dao.SkillDao;
import com.moseeker.profile.dao.UserDao;
import com.moseeker.profile.dao.WorkExpDao;
import com.moseeker.profile.dao.WorksDao;
import com.moseeker.thrift.gen.common.struct.CommonQuery;
import com.moseeker.thrift.gen.common.struct.Response;
import com.moseeker.thrift.gen.profile.service.WholeProfileServices.Iface;

@Service
public class WholeProfileServicesImpl implements Iface {

	Logger logger = LoggerFactory.getLogger(WholeProfileServicesImpl.class);

	@Override
	public Response getResource(int userId, int profileId) throws TException {
		Response response = new Response();
		try {
			HashMap<String, Object> profile = new HashMap<String, Object>();
			
			ProfileProfileRecord profileRecord = profileDao.getProfileByIdOrUserId(userId, profileId);
			if(profileRecord != null) {
				CommonQuery query = new CommonQuery();
				HashMap<String, String> equalFilter = new HashMap<String, String>();
				equalFilter.put("profile_id", String.valueOf(profileRecord.getId()));
				query.setEqualFilter(equalFilter);
				
				CommonQuery profileQuery = new CommonQuery();
				HashMap<String, String> profileEqualFilter = new HashMap<String, String>();
				profileEqualFilter.put("id", String.valueOf(profileRecord.getId()));
				profileQuery.setEqualFilter(profileEqualFilter);
				
				Map<String, Object> basic = buildBasic(profileRecord, query);
				profile.put("basic", basic);
				
				List<Map<String, Object>> workexps = buildWorkexps(profileRecord, query);
				profile.put("workexps", workexps);
				
				List<Map<String, Object>> educations = buildEducations(profileRecord, query);
				profile.put("educations", educations);
				
				List<Map<String, Object>> projectexps = buildProjectexps(profileRecord, query);
				profile.put("projectexps", projectexps);
				
				List<Map<String, Object>> languages = buildLanguage(profileRecord, query);
				profile.put("languages", languages);
				
				List<Map<String, Object>> skills = buildskills(profileRecord, query);
				profile.put("skills", skills);
				
				List<Map<String, Object>> credentials = buildsCredentials(profileRecord, query);
				profile.put("credentials", credentials);
				
				List<Map<String, Object>> awards = buildsAwards(profileRecord, query);
				profile.put("awards", awards);
				
				List<Map<String, Object>> works = buildsWorks(profileRecord, query);
				profile.put("works", works);
				
				List<Map<String, Object>> intentions = buildsIntentions(profileRecord, query);
				profile.put("intentions", intentions);
			}
			response.setStatus(0);
			response.setMessage(Constant.TIPS_SUCCESS);
			//Gson gson = new Gson();
			response.setData(JSON.toJSONString(profile));
			//response.setData(gson.toJson(profile));
		} catch (Exception e) {
			logger.error("//todo",e);
			response.setStatus(0);
			response.setMessage(Constant.TIPS_ERROR);
			response.setData(Constant.NONE_JSON);
		}
		return response;
	}
	
	private List<Map<String, Object>> buildsIntentions(ProfileProfileRecord profileRecord, CommonQuery query) {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		try {
			List<ProfileIntentionRecord> records = intentionDao.getResources(query);
			if(records != null && records.size() > 0) {
				List<Integer> intentionIds = new ArrayList<>();
				records.forEach(record -> {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("id", record.getId());
					map.put("worktype", record.getWorktype());
					map.put("workstate", record.getWorkstate());
					map.put("salary_type", record.getSalaryType());
					map.put("salary_code", record.getSalaryCode());
					intentionIds.add(record.getId().intValue());
					list.add(map);
				});
				List<ProfileIntentionCityRecord> cityRecords = intentionCityDao.getIntentionCities(intentionIds);
				List<ProfileIntentionIndustryRecord> industryRecords = intentionIndustryDao.getIntentionIndustries(intentionIds);
				List<ProfileIntentionPositionRecord> positionRecords = intentionPositionDao.getIntentionPositions(intentionIds);
				list.forEach(map -> {
					if(cityRecords != null) {
						List<Map<String, Object>> cities = new ArrayList<>();
						cityRecords.forEach(cityRecord -> {
							Map<String, Object> cityMap = new HashMap<>();
							cityMap.put("city_code", cityRecord.getCityCode());
							cityMap.put("city_name", cityRecord.getCityName());
							cities.add(cityMap);
						});
						map.put("cities", cities);
					}
					if(industryRecords != null) {
						List<Map<String, Object>> industries = new ArrayList<>();
						industryRecords.forEach(record -> {
							Map<String, Object> industryMap = new HashMap<>();
							industryMap.put("industry_code", record.getIndustryCode());
							industryMap.put("industry_name", record.getIndustryName());
							industries.add(industryMap);
						});
						map.put("industries", industries);
					}
					if(positionRecords != null) {
						List<Map<String, Object>> positions = new ArrayList<>();
						positionRecords.forEach(record -> {
							Map<String, Object> positionMap = new HashMap<>();
							positionMap.put("position_name", record.getPositionName());
							positionMap.put("position_code", record.getPositionCode());
							positions.add(positionMap);
						});
						map.put("positions", positions);
					}
				});
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		} finally {
			//do nothing
		}
		return list;
	}

	private List<Map<String, Object>> buildsWorks(ProfileProfileRecord profileRecord, CommonQuery query) {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		try {
			List<ProfileWorksRecord> records = worksDao.getResources(query);
			if(records != null && records.size() > 0) {
				records.forEach(record -> {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("id", record.getId());
					map.put("name", record.getName());
					map.put("cover", record.getCover());
					map.put("url", record.getUrl());
					map.put("description", record.getDescription());
					list.add(map);
				});
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		} finally {
			//do nothing
		}
		return list;
	}

	private List<Map<String, Object>> buildsAwards(ProfileProfileRecord profileRecord, CommonQuery query) {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		try {
			List<ProfileAwardsRecord> records = awardsDao.getResources(query);
			if(records != null && records.size() > 0) {
				records.forEach(record -> {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("id", record.getId());
					map.put("name", record.getName());
					if(record.getRewardDate() != null) {
						map.put("reward_date", DateUtils.dateToNormalDate(record.getRewardDate()));
					}
					list.add(map);
				});
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		} finally {
			//do nothing
		}
		return list;
	}

	private List<Map<String, Object>> buildsCredentials(ProfileProfileRecord profileRecord, CommonQuery query) {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		try {
			List<ProfileCredentialsRecord> records = credentialsDao.getResources(query);
			if(records != null && records.size() > 0) {
				records.forEach(record -> {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("id", record.getId());
					map.put("name", record.getName());
					list.add(map);
				});
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		} finally {
			//do nothing
		}
		return list;
	}

	private List<Map<String, Object>> buildskills(ProfileProfileRecord profileRecord, CommonQuery query) {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		try {
			List<ProfileSkillRecord> records = skillDao.getResources(query);
			if(records != null && records.size() > 0) {
				records.forEach(record -> {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("id", record.getId());
					map.put("name", record.getName());
					map.put("level", record.getLevel());
					list.add(map);
				});
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		} finally {
			//do nothing
		}
		return list;
	}

	private List<Map<String, Object>> buildLanguage(ProfileProfileRecord profileRecord, CommonQuery query) {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		try {
			List<ProfileLanguageRecord> records = languageDao.getResources(query);
			if(records != null && records.size() > 0) {
				records.forEach(record -> {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("id", record.getId());
					map.put("name", record.getName());
					map.put("level", record.getLevel());
					list.add(map);
				});
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		} finally {
			//do nothing
		}
		return list;
	}

	private List<Map<String, Object>> buildProjectexps(ProfileProfileRecord profileRecord, CommonQuery query) {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		try {
			List<ProfileProjectexpRecord> records = projectExpDao.getResources(query);
			if(records != null && records.size() > 0) {
				records.forEach(record -> {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("id", record.getId());
					map.put("name", record.getName());
					map.put("company_name", record.getCompanyName());
					if(record.getStart() != null) {
						map.put("start_date", DateUtils.dateToNormalDate(record.getStart()));
					}
					if(record.getEnd() != null) {
						map.put("end_date", DateUtils.dateToNormalDate(record.getEnd()));
					}
					map.put("end_until_now", record.getEndUntilNow());
					map.put("description", record.getDescription());
					map.put("member", record.getMember());
					map.put("role", record.getRole());
					list.add(map);
				});
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		} finally {
			//do nothing
		}
		return list;
	}

	private List<Map<String, Object>> buildEducations(ProfileProfileRecord profileRecord, CommonQuery query) {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		try {
			List<ProfileEducationRecord> records = educationDao.getResources(query);
			if(records != null && records.size() > 0) {
				records.forEach(record -> {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("id", record.getId());
					map.put("school_name", record.getSchoolName());
					map.put("school_code", record.getSchoolCode());
					map.put("major_name", record.getMajorName());
					map.put("major_code", record.getMajorCode());
					map.put("degree", record.getDegree());
					if(record.getStart() != null) {
						map.put("start_date", DateUtils.dateToNormalDate(record.getStart()));
					}
					if(record.getEnd() != null) {
						map.put("end_date", DateUtils.dateToNormalDate(record.getEnd()));
					}
					map.put("end_until_now", record.getEndUntilNow());
					map.put("description", record.getDescription());
					list.add(map);
				});
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		} finally {
			//do nothing
		}
		return list;
	}

	private List<Map<String, Object>> buildWorkexps(ProfileProfileRecord profileRecord, CommonQuery query) {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		try {
			List<ProfileWorkexpRecord> records = workExpDao.getResources(query);
			if(records != null && records.size() > 0) {
				records.forEach(record -> {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("id", record.getId().intValue());
					map.put("company_name", record.getCompanyName());
					map.put("position_name", record.getPositionName());
					map.put("position_code", record.getPositionCode());
					map.put("department_name", record.getDepartmentName());
					//map.put("logo", record.getlo)
					if(record.getStart() != null) {
						map.put("start_date", DateUtils.dateToNormalDate(record.getStart()));
					}
					if(record.getEnd() != null) {
						map.put("end_date", DateUtils.dateToNormalDate(record.getEnd()));
					}
					map.put("end_until_now", record.getEndUntilNow());
					map.put("description", record.getDescription());
					list.add(map);
				});
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		} finally {
			//do nothing
		}
		return list;
	}

	private Map<String, Object> buildBasic(ProfileProfileRecord profileRecord, CommonQuery query) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			ProfileBasicRecord basicRecord = profileBasicDao.getResource(query);
			UserUserRecord userRecord = userDao.getUserById(profileRecord.getUserId().intValue());
			ProfileWorkexpRecord lastWorkExp = workExpDao.getLastWorkExp(profileRecord.getUserId().intValue());
			if(userRecord != null) {
				map.put("headimg", userRecord.getHeadimg());
				map.put("mobile", userRecord.getMobile());
				map.put("email", userRecord.getEmail());
			}
			if(lastWorkExp != null) {
				map.put("company_name", lastWorkExp.getCompanyName());
				map.put("industry_name", lastWorkExp.getIndustryName());
				map.put("industry_code", lastWorkExp.getIndustryCode());
				map.put("company_scale", lastWorkExp.getCompanyScale());
				map.put("location_code", lastWorkExp.getCityCode());
				map.put("position_name", lastWorkExp.getPositionName());
				map.put("city_name", lastWorkExp.getCityName());
				map.put("city_code", lastWorkExp.getCityCode());
			}
			if(basicRecord != null) {
				map.put("username", basicRecord.getName());
				map.put("gender", basicRecord.getGender().intValue());
				map.put("nationality_name", basicRecord.getNationalityName());
				map.put("nationality_code", basicRecord.getNationalityCode());
				DictCountryRecord countryRecord = countryDao.getCountryByID(basicRecord.getNationalityCode());
				if(countryRecord != null) {
					map.put("icon_class", countryRecord.getIconClass());
				}
				map.put("motto", basicRecord.getMotto());
				if(basicRecord.getBirth() != null) {
					map.put("birth", DateUtils.dateToNormalDate(basicRecord.getBirth()));
				}
				map.put("self_introduction", basicRecord.getSelfIntroduction());
				
				map.put("qq", basicRecord.getQq());
				map.put("weixin", basicRecord.getWeixin());
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		} finally {
			
		}
		return map;
	}
	
	@Autowired
	private IntentionCityDao intentionCityDao;
	
	@Autowired
	private IntentionPositionDao intentionPositionDao;
	
	@Autowired
	private IntentionIndustryDao intentionIndustryDao;
	
	@Autowired
	private AwardsDao awardsDao;
	
	@Autowired
	private CredentialsDao credentialsDao;
	
	@Autowired
	private CountryDao countryDao;
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private AttachmentDao attachmentDao;
	
	@Autowired
	private WorksDao worksDao;
	
	@Autowired
	private EducationDao educationDao;
	
	@Autowired
	private IntentionDao intentionDao;

	@Autowired
	private LanguageDao languageDao;
	
	@Autowired
	private ProfileBasicDao profileBasicDao;
	
	@Autowired
	private ProfileDao profileDao;
	
	@Autowired
	private ProfileImportDao profileImportDao;
	
	@Autowired
	private ProjectExpDao projectExpDao;
	
	@Autowired
	private SkillDao skillDao;
	
	@Autowired
	private WorkExpDao workExpDao;

	public Logger getLogger() {
		return logger;
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}

	public AttachmentDao getAttachmentDao() {
		return attachmentDao;
	}

	public void setAttachmentDao(AttachmentDao attachmentDao) {
		this.attachmentDao = attachmentDao;
	}

	public WorksDao getWorksDao() {
		return worksDao;
	}

	public void setWorksDao(WorksDao worksDao) {
		this.worksDao = worksDao;
	}

	public EducationDao getEducationDao() {
		return educationDao;
	}

	public void setEducationDao(EducationDao educationDao) {
		this.educationDao = educationDao;
	}

	public IntentionDao getIntentionDao() {
		return intentionDao;
	}

	public void setIntentionDao(IntentionDao intentionDao) {
		this.intentionDao = intentionDao;
	}

	public LanguageDao getLanguageDao() {
		return languageDao;
	}

	public void setLanguageDao(LanguageDao languageDao) {
		this.languageDao = languageDao;
	}

	public ProfileBasicDao getProfileBasicDao() {
		return profileBasicDao;
	}

	public void setProfileBasicDao(ProfileBasicDao profileBasicDao) {
		this.profileBasicDao = profileBasicDao;
	}

	public ProfileDao getProfileDao() {
		return profileDao;
	}

	public void setProfileDao(ProfileDao profileDao) {
		this.profileDao = profileDao;
	}

	public ProfileImportDao getProfileImportDao() {
		return profileImportDao;
	}

	public void setProfileImportDao(ProfileImportDao profileImportDao) {
		this.profileImportDao = profileImportDao;
	}

	public ProjectExpDao getProjectExpDao() {
		return projectExpDao;
	}

	public void setProjectExpDao(ProjectExpDao projectExpDao) {
		this.projectExpDao = projectExpDao;
	}

	public SkillDao getSkillDao() {
		return skillDao;
	}

	public void setSkillDao(SkillDao skillDao) {
		this.skillDao = skillDao;
	}

	public WorkExpDao getWorkExpDao() {
		return workExpDao;
	}

	public void setWorkExpDao(WorkExpDao workExpDao) {
		this.workExpDao = workExpDao;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public CountryDao getCountryDao() {
		return countryDao;
	}

	public void setCountryDao(CountryDao countryDao) {
		this.countryDao = countryDao;
	}

	public CredentialsDao getCredentialsDao() {
		return credentialsDao;
	}

	public void setCredentialsDao(CredentialsDao credentialsDao) {
		this.credentialsDao = credentialsDao;
	}

	public AwardsDao getAwardsDao() {
		return awardsDao;
	}

	public void setAwardsDao(AwardsDao awardsDao) {
		this.awardsDao = awardsDao;
	}

	public IntentionCityDao getIntentionCityDao() {
		return intentionCityDao;
	}

	public void setIntentionCityDao(IntentionCityDao intentionCityDao) {
		this.intentionCityDao = intentionCityDao;
	}

	public IntentionPositionDao getIntentionPositionDao() {
		return intentionPositionDao;
	}

	public void setIntentionPositionDao(IntentionPositionDao intentionPositionDao) {
		this.intentionPositionDao = intentionPositionDao;
	}

	public IntentionIndustryDao getIntentionIndustryDao() {
		return intentionIndustryDao;
	}

	public void setIntentionIndustryDao(IntentionIndustryDao intentionIndustryDao) {
		this.intentionIndustryDao = intentionIndustryDao;
	}
}
