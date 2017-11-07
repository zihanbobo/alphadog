package com.moseeker.entity.biz;

import com.alibaba.fastjson.JSON;
import com.moseeker.baseorm.dao.dictdb.DictCityDao;
import com.moseeker.baseorm.dao.dictdb.DictIndustryDao;
import com.moseeker.baseorm.dao.dictdb.DictPositionDao;
import com.moseeker.baseorm.dao.profiledb.*;
import com.moseeker.baseorm.dao.profiledb.entity.ProfileWorkexpEntity;
import com.moseeker.baseorm.db.dictdb.tables.records.DictCityRecord;
import com.moseeker.baseorm.db.dictdb.tables.records.DictConstantRecord;
import com.moseeker.baseorm.db.dictdb.tables.records.DictIndustryRecord;
import com.moseeker.baseorm.db.dictdb.tables.records.DictPositionRecord;
import com.moseeker.baseorm.db.hrdb.tables.records.HrCompanyRecord;
import com.moseeker.baseorm.db.profiledb.tables.records.*;
import com.moseeker.baseorm.db.userdb.tables.records.UserUserRecord;
import com.moseeker.baseorm.util.BeanUtils;
import com.moseeker.common.constants.Constant;
import com.moseeker.common.providerutils.QueryUtil;
import com.moseeker.common.util.DateUtils;
import com.moseeker.common.util.Pagination;
import com.moseeker.common.util.StringUtils;
import com.moseeker.common.util.query.Query;
import org.joda.time.field.ImpreciseDateTimeField;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ProfileUtils {

	protected Logger logger = LoggerFactory.getLogger(ProfileUtils.class);

	public List<ProfileWorksRecord> mapToWorksRecords(List<Map<String, Object>> works) {
		List<ProfileWorksRecord> worksRecords = new ArrayList<>();
		if (works != null && works.size() > 0) {
			works.forEach(work -> {
				ProfileWorksRecord record = BeanUtils.MapToRecord(work, ProfileWorksRecord.class);
				if (record != null) {
					if(StringUtils.isNotNullOrEmpty(record.getDescription()) && record.getDescription().length() > Constant.DESCRIPTION_LENGTH) {
						record.setDescription(record.getDescription().substring(0, Constant.DESCRIPTION_LENGTH));
					}
					worksRecords.add(record);
				}
			});
		}
		return worksRecords;
	}

	public List<ProfileWorkexpEntity> mapToWorkexpRecords(List<Map<String, Object>> workexps, int source) {
		List<ProfileWorkexpEntity> workexpRecords = new ArrayList<>();
		if (workexps != null && workexps.size() > 0) {
			workexps.forEach(workexp -> {
				ProfileWorkexpEntity record = BeanUtils.MapToRecord(workexp, ProfileWorkexpEntity.class);
				if (record != null) {
					if (workexp.get("start_date") != null) {
						record.setStart(BeanUtils.convertToSQLDate(workexp.get("start_date")));
					} else if (workexp.get("startDate") != null) {
                        record.setStart(BeanUtils.convertToSQLDate(workexp.get("startDate")));
                    }
					if (workexp.get("end_date") != null) {
						record.setEnd(BeanUtils.convertToSQLDate(workexp.get("end_date")));
					} else if (workexp.get("endDate") != null) {
                        record.setEnd(BeanUtils.convertToSQLDate(workexp.get("endDate")));
                    }
					if(StringUtils.isNotNullOrEmpty(record.getDescription()) && record.getDescription().length() > Constant.DESCRIPTION_LENGTH) {
						record.setDescription(record.getDescription().substring(0, Constant.DESCRIPTION_LENGTH));
					}
					if (workexp.get("company") != null) {
						@SuppressWarnings("unchecked")
						Map<String, Object> company = (Map<String, Object>) workexp.get("company");
						if (company != null) {
							HrCompanyRecord hrCompany = new HrCompanyRecord();
							if (company.get("company_name") != null) {
								hrCompany.setName(BeanUtils.converToString(company.get("company_name")));
							} else if (company.get("companyName") != null) {
                                hrCompany.setName(BeanUtils.converToString(company.get("companyName")));
                            }
							if (company.get("company_industry") != null) {
								hrCompany.setIndustry(BeanUtils.converToString(company.get("company_industry")));
							} else if (company.get("companyIndustry") != null) {
                                hrCompany.setIndustry(BeanUtils.converToString(company.get("companyIndustry")));
                            }
							if (company.get("company_introduction") != null) {
								hrCompany
										.setIntroduction(BeanUtils.converToString(company.get("company_introduction")));
							} else if (company.get("companyIntroduction") != null) {
                                hrCompany
                                        .setIntroduction(BeanUtils.converToString(company.get("companyIntroduction")));
                            }
							if (company.get("scale") != null) {
								hrCompany.setScale(BeanUtils.converToByte(company.get("scale")));
							} else if ((company.get("companyScale") != null)) {
                                hrCompany.setScale(BeanUtils.converToByte(company.get("companyScale")));
                            }
							if (company.get("company_property") != null) {
								hrCompany.setProperty(BeanUtils.converToByte(company.get("company_property")));
							} else if (company.get("companyProperty") != null) {
                                hrCompany.setProperty(BeanUtils.converToByte(company.get("companyProperty")));
                            }
							hrCompany.setType((byte)(Constant.COMPANY_TYPE_FREE));
							switch(source) {
								case Constant.PROFILE_SOURCE_WEIXIN_TEGETHER_IMPORT:
								case Constant.PROFILE_SOURCE_WEIXIN_COMPANY_IMPORT:
									hrCompany.setSource((byte)(Constant.COMPANY_SOURCE_WX_IMPORT));
									break;
								case Constant.PROFILE_SOURCE_PC_IMPORT:
									hrCompany.setSource((byte)(Constant.COMPANY_SOURCE_PC_IMPORT));
									break;
								default:
							}
							record.setCompany(hrCompany);
						}
					}
					ValidationMessage<ProfileWorkexpEntity> vm = ProfileValidation.verifyWorkExp(record);
					if(vm.isPass()) {
						workexpRecords.add(record);
					}
				}
			});
		}
		return workexpRecords;
	}

	public List<ProfileSkillRecord> mapToSkillRecords(List<Map<String, Object>> skills) {
		List<ProfileSkillRecord> skillRecords = new ArrayList<>();
		if (skills != null && skills.size() > 0) {
			skills.forEach(skill -> {
				ProfileSkillRecord record = BeanUtils.MapToRecord(skill, ProfileSkillRecord.class);
				ValidationMessage<ProfileSkillRecord> vm = ProfileValidation.verifySkill(record);
				if (record != null && vm.isPass()) {
					skillRecords.add(record);
				}
			});
		}
		return skillRecords;
	}

	public List<ProfileProjectexpRecord> mapToProjectExpsRecords(List<Map<String, Object>> projectexps) {
		List<ProfileProjectexpRecord> projectExpRecords = new ArrayList<>();
		if (projectexps != null && projectexps.size() > 0) {
			projectexps.forEach(projectexp -> {
				ProfileProjectexpRecord record = BeanUtils.MapToRecord(projectexp, ProfileProjectexpRecord.class);
				if (record != null) {
					if(StringUtils.isNotNullOrEmpty(record.getDescription()) && record.getDescription().length() > Constant.DESCRIPTION_LENGTH) {
						record.setDescription(record.getDescription().substring(0, Constant.DESCRIPTION_LENGTH));
					}
					if (projectexp.get("start_date") != null) {
						record.setStart(BeanUtils.convertToSQLDate(projectexp.get("start_date")));
					} else if (projectexp.get("startDate") != null) {
                        record.setStart(BeanUtils.convertToSQLDate(projectexp.get("startDate")));
                    }
					if (projectexp.get("end_date") != null) {
						record.setEnd(BeanUtils.convertToSQLDate(projectexp.get("end_date")));
					} else if (projectexp.get("endDate") != null) {
                        record.setEnd(BeanUtils.convertToSQLDate(projectexp.get("endDate")));
                    }
					if (record.getResponsibility() != null && record.getResponsibility().length() >1000) {
						record.setResponsibility(record.getResponsibility().substring(0, 995)+"...");
					}
					ValidationMessage<ProfileProjectexpRecord> vm = ProfileValidation.verifyProjectExp(record);
					if(vm.isPass()) {
						projectExpRecords.add(record);
					}
				}
			});
		}
		return projectExpRecords;
	}

	public ProfileOtherRecord mapToOtherRecord(Map<String, Object> other) {
		ProfileOtherRecord otherRecord = null;
		if (other != null) {
			otherRecord = new ProfileOtherRecord();
			otherRecord.setOther(JSON.toJSONString(other));
			ValidationMessage<ProfileOtherRecord> vm = ProfileValidation.verifyCustomizeResume(otherRecord);
			if(!vm.isPass()) {
				otherRecord = null;
			}
		}
		return otherRecord;
	}

	public List<ProfileLanguageRecord> mapToLanguageRecord(List<Map<String, Object>> languages) {
		List<ProfileLanguageRecord> languageRecords = new ArrayList<>();
		if (languages != null && languages.size() > 0) {
			languages.forEach(language -> {
				ProfileLanguageRecord record = BeanUtils.MapToRecord(language, ProfileLanguageRecord.class);
				ValidationMessage<ProfileLanguageRecord> vm = ProfileValidation.verifyLanguage(record);
				if (record != null && vm.isPass()) {
					languageRecords.add(record);
				}
			});
		}
		return languageRecords;
	}

	@SuppressWarnings("unchecked")
	public List<IntentionRecord> mapToIntentionRecord(List<Map<String, Object>> intentions) {
		List<IntentionRecord> intentionRecords = new ArrayList<>();
		if (intentions != null && intentions.size() > 0) {
			intentions.forEach(intention -> {
				IntentionRecord record = BeanUtils.MapToRecord(intention, IntentionRecord.class);
				record.getCities().clear();
				record.getPositions().clear();
				record.getIndustries().clear();
				if (record != null) {
					if (intention.get("cities") != null) {
						List<Map<String, Object>> cities = (List<Map<String, Object>>) intention.get("cities");
						if (cities != null && cities.size() > 0) {
							for (Map<String, Object> city : cities) {
								ProfileIntentionCityRecord cityRecord = BeanUtils.MapToRecord(city,
										ProfileIntentionCityRecord.class);
								if (cityRecord != null && ((cityRecord.getCityCode() != null
										&& cityRecord.getCityCode().intValue() != 0)
										|| !StringUtils.isNullOrEmpty(cityRecord.getCityName()))) {
									record.getCities().add(cityRecord);
									break;
								}
							}
						}
					}

					if (intention.get("positions") != null) {
						List<Map<String, Object>> positions = (List<Map<String, Object>>) intention.get("positions");
						if (positions != null && positions.size() > 0) {
							for (Map<String, Object> position : positions) {
								ProfileIntentionPositionRecord positionRecord = BeanUtils.MapToRecord(position,
										ProfileIntentionPositionRecord.class);
								if (positionRecord != null && ((positionRecord.getPositionCode() != null
										&& positionRecord.getPositionCode().intValue() != 0)
										|| !StringUtils.isNullOrEmpty(positionRecord.getPositionName()))) {
									record.getPositions().add(positionRecord);
									break;
								}
							}
						}
					}

					if (intention.get("industries") != null) {
						List<Map<String, Object>> industries = (List<Map<String, Object>>) intention.get("industries");
						if (industries != null && industries.size() > 0) {
							for (Map<String, Object> industry : industries) {
								ProfileIntentionIndustryRecord industryRecord = BeanUtils.MapToRecord(industry,
										ProfileIntentionIndustryRecord.class);
								if (industryRecord != null && ((industryRecord.getIndustryCode() != null
										&& industryRecord.getIndustryCode().intValue() != 0)
										|| !StringUtils.isNullOrEmpty(industryRecord.getIndustryName()))) {
									record.getIndustries().add(industryRecord);
									break;
								}
							}
						}
					}
					intentionRecords.add(record);
				}
			});
		}
		return intentionRecords;
	}

	public ProfileImportRecord mapToImportRecord(Map<String, Object> importMap) {
		ProfileImportRecord record = null;
		if (importMap != null) {
			record = BeanUtils.MapToRecord(importMap, ProfileImportRecord.class);
			if (importMap.get("data") != null) {
				record.setData(JSON.toJSONString(importMap.get("data")));
			}
			return record;
		}
		return record;
	}

	public List<ProfileEducationRecord> mapToEducationRecords(List<Map<String, Object>> educations) {
		List<ProfileEducationRecord> educationRecords = new ArrayList<>();
		if (educations != null && educations.size() > 0) {
			educations.forEach(education -> {
				ProfileEducationRecord record = BeanUtils.MapToRecord(education, ProfileEducationRecord.class);
				if (record != null) {
					if(StringUtils.isNotNullOrEmpty(record.getDescription()) && record.getDescription().length() > Constant.DESCRIPTION_LENGTH) {
						record.setDescription(record.getDescription().substring(0, Constant.DESCRIPTION_LENGTH));
					}
					if (education.get("start_date") != null) {
						record.setStart(BeanUtils.convertToSQLDate(education.get("start_date")));
					} else if (education.get("startDate") != null) {
						record.setStart(BeanUtils.convertToSQLDate(education.get("startDate")));
					}

					if (education.get("end_date") != null) {
						record.setEnd(BeanUtils.convertToSQLDate(education.get("end_date")));
					} else if (education.get("endDate") != null) {
						record.setEnd(BeanUtils.convertToSQLDate(education.get("endDate")));
					}

					ValidationMessage<ProfileEducationRecord> vm = ProfileValidation.verifyEducation(record);
					if(vm.isPass()) {
						educationRecords.add(record);
					}
				}
			});
		}
		return educationRecords;
	}

	public List<ProfileCredentialsRecord> mapToCredentialsRecords(List<Map<String, Object>> credentials) {
		List<ProfileCredentialsRecord> credentialRecords = new ArrayList<>();
		if (credentials != null && credentials.size() > 0) {
			credentials.forEach(credential -> {
				ProfileCredentialsRecord record = BeanUtils.MapToRecord(credential, ProfileCredentialsRecord.class);
				ValidationMessage<ProfileCredentialsRecord> vm = ProfileValidation.verifyCredential(record);
				if (record != null && vm.isPass()) {
					credentialRecords.add(record);
				}
			});
		}
		return credentialRecords;
	}

	public List<ProfileAwardsRecord> mapToAwardsRecords(List<Map<String, Object>> awards) {
		List<ProfileAwardsRecord> awardsRecords = new ArrayList<>();
		if (awards != null && awards.size() > 0) {
			awards.forEach(award -> {
				ProfileAwardsRecord record = BeanUtils.MapToRecord(award, ProfileAwardsRecord.class);
				if (record != null) {
					if(StringUtils.isNotNullOrEmpty(record.getDescription()) && record.getDescription().length() > Constant.DESCRIPTION_LENGTH) {
						record.setDescription(record.getDescription().substring(0, Constant.DESCRIPTION_LENGTH));
					}
					awardsRecords.add(record);
				}
			});
		}
		return awardsRecords;
	}

	public List<ProfileAttachmentRecord> mapToAttachmentRecords(List<Map<String, Object>> attachments) {
		List<ProfileAttachmentRecord> attchmentRecords = new ArrayList<>();
		if (attachments != null && attachments.size() > 0) {
			attachments.forEach(attachment -> {
				ProfileAttachmentRecord record = BeanUtils.MapToRecord(attachment, ProfileAttachmentRecord.class);
				if (record != null) {
					if(StringUtils.isNotNullOrEmpty(record.getDescription()) && record.getDescription().length() > Constant.DESCRIPTION_LENGTH) {
						record.setDescription(record.getDescription().substring(0, Constant.DESCRIPTION_LENGTH));
					}
					attchmentRecords.add(record);
				}
			});
		}
		return attchmentRecords;
	}

	public ProfileBasicRecord mapToBasicRecord(Map<String, Object> basic) {
		ProfileBasicRecord record = null;
		if (basic != null) {
			record = BeanUtils.MapToRecord(basic, ProfileBasicRecord.class);
			if(StringUtils.isNotNullOrEmpty(record.getSelfIntroduction()) && record.getSelfIntroduction().length() > Constant.DESCRIPTION_LENGTH) {
				record.setSelfIntroduction(record.getSelfIntroduction().substring(0, Constant.DESCRIPTION_LENGTH));
			}
			return record;
		}
		return record;
	}

	public ProfileProfileRecord mapToProfileRecord(Map<String, Object> profile) {
		ProfileProfileRecord record = null;
		if (profile != null && (profile.get("user_id") != null || profile.get("userId") != null) ) {
			record = new ProfileProfileRecord();
			record.setUuid((String) profile.get("uuid"));
			if (profile.get("lang") != null) {
				byte lang = ((Integer)profile.get("lang")).byteValue();
				record.setLang(lang);
			}
			if (profile.get("source") != null) {
				record.setSource((Integer) profile.get("source"));
			}
			if (profile.get("completeness") != null) {
				byte completeness = ((Integer)profile.get("completeness")).byteValue();
				record.setCompleteness(completeness);
			}
			if (profile.get("userId") != null) {
				record.setUserId((Integer) profile.get("userId"));
			} else {
				record.setUserId((Integer) profile.get("user_id"));
			}
			if (profile.get("disable") != null) {
				record.setDisable((byte)(profile.get("disable")));
			} else {
				record.setDisable((byte)(1));
			}
			if(profile.get("origin") != null) {
				record.setOrigin((String)profile.get("origin"));
			}
			return record;
		}
		return record;
	}

	public List<Map<String, Object>> buildOthers(ProfileProfileRecord profileRecord, List<ProfileOtherRecord> records) {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		try {
			if (profileRecord != null && records != null && records.size() > 0) {
				records.forEach(record -> {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("profile_id", record.getProfileId().intValue());
					map.put("other", record.getOther());
					if (record.getCreateTime() != null) {
						map.put("create_time", DateUtils.dateToShortTime(record.getCreateTime()));
					}
					if (record.getUpdateTime() != null) {
						map.put("update_time", DateUtils.dateToShortTime(record.getUpdateTime()));
					}
					list.add(map);
				});
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		} finally {
			// do nothing
		}
		return list;
	}

	public List<Map<String, Object>> buildImports(ProfileProfileRecord profileRecord,
			List<ProfileImportRecord> records) {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		try {
			if (profileRecord != null && records != null && records.size() > 0) {
				records.forEach(record -> {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("source", record.getSource().intValue());
					if (record.getLastUpdateTime() != null) {
						map.put("last_update_time", DateUtils.dateToShortTime(record.getLastUpdateTime()));
					}
					map.put("account_id", record.getAccountId());
					map.put("resume_id", record.getResumeId());
					map.put("user_name", record.getUserName());
					if (record.getCreateTime() != null) {
						map.put("create_time", DateUtils.dateToShortTime(record.getCreateTime()));
					}
					if (record.getUpdateTime() != null) {
						map.put("update_time", DateUtils.dateToShortTime(record.getUpdateTime()));
					}
					list.add(map);
				});
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		} finally {
			// do nothing
		}
		return list;
	}

	public List<Map<String, Object>> buildAttachments(ProfileProfileRecord profileRecord,
			List<ProfileAttachmentRecord> records) {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		try {
			if (records != null && records.size() > 0) {
				records.forEach(record -> {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("id", record.getId().intValue());
					if (record.getProfileId() != null) {
						map.put("profile_id", record.getProfileId().intValue());
					}
					map.put("name", record.getName());
					map.put("path", record.getPath());
					if (record.getCreateTime() != null) {
						map.put("create_time", DateUtils.dateToShortTime(record.getCreateTime()));
					}
					if (record.getUpdateTime() != null) {
						map.put("update_time", DateUtils.dateToShortTime(record.getUpdateTime()));
					}
					list.add(map);
				});
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		} finally {
			// do nothing
		}
		return list;
	}

	public UserUserRecord mapToUserUserRecord(Map<String, Object> map) {
		UserUserRecord record = null;
		if (map != null) {
			record = BeanUtils.MapToRecord(map, UserUserRecord.class);
			return record;
		}
		return record;
	}

	public List<Map<String, Object>> buildsIntentions(ProfileProfileRecord profileRecord, Query query,
													  List<DictConstantRecord> constantRecords, ProfileIntentionDao intentionDao, ProfileIntentionCityDao intentionCityDao,
													  ProfileIntentionIndustryDao intentionIndustryDao, ProfileIntentionPositionDao intentionPositionDao, DictCityDao dictCityDao,
													  DictIndustryDao dictIndustryDao, DictPositionDao dictPositionDao) {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		try {
			List<ProfileIntentionRecord> records = intentionDao.getRecords(query);
			if (records != null && records.size() > 0) {
				QueryUtil dictQuery = new QueryUtil();
				dictQuery.setPageSize(Integer.MAX_VALUE);
				List<DictCityRecord> dictCities = dictCityDao.getRecords(dictQuery);
				List<DictIndustryRecord> dictIndustries = dictIndustryDao.getRecords(dictQuery);
				List<DictPositionRecord> dictPositions = dictPositionDao.getRecords(dictQuery);
				List<Integer> intentionIds = new ArrayList<>();
				records.forEach(record -> {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("id", record.getId().intValue());
					map.put("worktype", record.getWorktype().intValue());
					for (DictConstantRecord constantRecord : constantRecords) {
						if (constantRecord.getParentCode().intValue() == 3105
								&& constantRecord.getCode().intValue() == record.getWorktype().intValue()) {
							map.put("worktype_name", constantRecord.getName());
							break;
						}
					}
					map.put("workstate", record.getWorkstate().intValue());
					for (DictConstantRecord constantRecord : constantRecords) {
						if (constantRecord.getParentCode().intValue() == 3102
								&& constantRecord.getCode().intValue() == record.getWorkstate().intValue()) {
							map.put("workstate_name", constantRecord.getName());
							break;
						}
					}
					map.put("salary_code", record.getSalaryCode().intValue());
					for (DictConstantRecord constantRecord : constantRecords) {
						if (constantRecord.getParentCode().intValue() == 3114
								&& constantRecord.getCode().intValue() == record.getSalaryCode().intValue()) {
							map.put("salary_code_name", constantRecord.getName());
							break;
						}
					}
					map.put("tag", record.getTag());
					map.put("consider_venture_company_opportunities",
							record.getConsiderVentureCompanyOpportunities().intValue());
					for (DictConstantRecord constantRecord : constantRecords) {
						if (constantRecord.getParentCode().intValue() == 3120
								&& constantRecord.getCode().intValue() == record.getSalaryCode().intValue()) {
							map.put("consider_venture_company_opportunities_name", constantRecord.getName());
							break;
						}
					}
					intentionIds.add(record.getId().intValue());
					list.add(map);
				});
				List<ProfileIntentionCityRecord> cityRecords = intentionCityDao.getIntentionCities(intentionIds);
				List<ProfileIntentionIndustryRecord> industryRecords = intentionIndustryDao
						.getIntentionIndustries(intentionIds);
				List<ProfileIntentionPositionRecord> positionRecords = intentionPositionDao
						.getIntentionPositions(intentionIds);
				list.forEach(map -> {
					if (cityRecords != null) {
						List<Map<String, Object>> cities = new ArrayList<>();
						cityRecords.forEach(cityRecord -> {
							Map<String, Object> cityMap = new HashMap<>();
							cityMap.put("city_code", cityRecord.getCityCode().intValue());
							if(StringUtils.isNullOrEmpty(cityRecord.getCityName())) {
								for(DictCityRecord dictCity : dictCities) {
									if(cityRecord.getCityCode().intValue() == dictCity.getCode().intValue()) {
										cityMap.put("city_name", dictCity.getName());
										break;
									}
								}
							} else {
								cityMap.put("city_name", cityRecord.getCityName());
							}
							cities.add(cityMap);
						});
						map.put("cities", cities);
					}
					if (industryRecords != null) {
						List<Map<String, Object>> industries = new ArrayList<>();
						industryRecords.forEach(record -> {
							Map<String, Object> industryMap = new HashMap<>();
							industryMap.put("industry_code", record.getIndustryCode().intValue());
							if(StringUtils.isNullOrEmpty(record.getIndustryName())) {
								for(DictIndustryRecord dictIndustry : dictIndustries) {
									if(dictIndustry.getCode().intValue() == record.getIndustryCode().intValue()) {
										industryMap.put("industry_name", dictIndustry.getName());
										break;
									}
								}
							} else {
								industryMap.put("industry_name", record.getIndustryName());
							}
							industries.add(industryMap);
						});
						map.put("industries", industries);
					}
					if (positionRecords != null) {
						List<Map<String, Object>> positions = new ArrayList<>();
						positionRecords.forEach(record -> {
							Map<String, Object> positionMap = new HashMap<>();
							if(StringUtils.isNullOrEmpty(record.getPositionName())) {
								for(DictPositionRecord dictPosition : dictPositions) {
									if(dictPosition.getCode().intValue() == record.getPositionCode().intValue()) {
										positionMap.put("position_name", dictPosition.getName());
										break;
									}
								}
							} else {
								positionMap.put("position_name", record.getPositionName());
							}
							positionMap.put("position_code", record.getPositionCode().intValue());
							positions.add(positionMap);
						});
						map.put("positions", positions);
					}
				});
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		} finally {
			// do nothing
		}
		return list;
	}

	/**
	 * 更新用户信息
	 * @param userRecord 数据持久化的用户信息
	 * @param basicRecord 解析出来的简历基本信息
	 * @param crawlerUser 解析出来的用户信息
	 */
	public void updateUser(UserUserRecord userRecord, ProfileBasicRecord basicRecord, UserUserRecord crawlerUser) {
		if(userRecord != null && crawlerUser != null) {
			if ((userRecord.getMobile() == null || userRecord.getMobile() == 0) && crawlerUser != null && crawlerUser.getMobile() != null) {
				userRecord.setMobile(crawlerUser.getMobile());
			}
			if (StringUtils.isNullOrEmpty(userRecord.getName()) && crawlerUser != null && !StringUtils.isNullOrEmpty(crawlerUser.getName())) {
				userRecord.setName(crawlerUser.getName());
			}
			if (StringUtils.isNullOrEmpty(userRecord.getHeadimg()) && crawlerUser != null && !StringUtils.isNullOrEmpty(crawlerUser.getHeadimg())) {
				userRecord.setHeadimg(crawlerUser.getHeadimg());
			}
			if (StringUtils.isNullOrEmpty(userRecord.getEmail()) && crawlerUser != null && !StringUtils.isNullOrEmpty(crawlerUser.getEmail())) {
				userRecord.setEmail(crawlerUser.getEmail());
			}
		}
		if(userRecord != null && basicRecord != null) {
			if (StringUtils.isNullOrEmpty(userRecord.getName()) && basicRecord != null && !StringUtils.isNullOrEmpty(basicRecord.getName())) {
				userRecord.setName(basicRecord.getName());
			}
		}
	}

	public static Pagination getPagination(int totalRow, int pageNo1, int pageSize1, List list) {
		Pagination pagination = new Pagination();
		int pageNo = 1;
		int pageSize = 10;
		if (pageNo1 > 1) {
			pageNo = pageNo1;
		}
		if (pageSize1 > 0) {
			pageSize = pageSize1;
		}
		int totalPage = totalRow / pageSize;
		if (totalRow % pageSize != 0) {
			totalPage++;
		}

		pagination.setPageNo(pageNo);
		pagination.setPageSize(pageSize);
		pagination.setTotalPage(totalPage);
		pagination.setTotalRow(totalRow);
		pagination.setResults(list);
		return pagination;
	}
}