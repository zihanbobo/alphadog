/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.candidatedb.tables.records;


import com.moseeker.db.candidatedb.tables.JobPosition;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JobPositionRecord extends UpdatableRecordImpl<JobPositionRecord> {

	private static final long serialVersionUID = -1201936179;

	/**
	 * Setter for <code>candidatedb.job_position.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>candidatedb.job_position.jobnumber</code>. 职位编号
	 */
	public void setJobnumber(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.jobnumber</code>. 职位编号
	 */
	public String getJobnumber() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>candidatedb.job_position.company_id</code>. company.id
	 */
	public void setCompanyId(UInteger value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.company_id</code>. company.id
	 */
	public UInteger getCompanyId() {
		return (UInteger) getValue(2);
	}

	/**
	 * Setter for <code>candidatedb.job_position.title</code>. 职位标题
	 */
	public void setTitle(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.title</code>. 职位标题
	 */
	public String getTitle() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>candidatedb.job_position.province</code>. 所在省
	 */
	public void setProvince(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.province</code>. 所在省
	 */
	public String getProvince() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>candidatedb.job_position.city</code>. 所在城市
	 */
	public void setCity(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.city</code>. 所在城市
	 */
	public String getCity() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>candidatedb.job_position.department</code>. 所在部门
	 */
	public void setDepartment(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.department</code>. 所在部门
	 */
	public String getDepartment() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>candidatedb.job_position.l_jobid</code>. jobid from ATS or other channel
	 */
	public void setLJobid(Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.l_jobid</code>. jobid from ATS or other channel
	 */
	public Integer getLJobid() {
		return (Integer) getValue(7);
	}

	/**
	 * Setter for <code>candidatedb.job_position.publish_date</code>. Default: now, set by js
	 */
	public void setPublishDate(Timestamp value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.publish_date</code>. Default: now, set by js
	 */
	public Timestamp getPublishDate() {
		return (Timestamp) getValue(8);
	}

	/**
	 * Setter for <code>candidatedb.job_position.stop_date</code>. 截止日期
	 */
	public void setStopDate(Timestamp value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.stop_date</code>. 截止日期
	 */
	public Timestamp getStopDate() {
		return (Timestamp) getValue(9);
	}

	/**
	 * Setter for <code>candidatedb.job_position.accountabilities</code>. Job responsibilities
	 */
	public void setAccountabilities(String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.accountabilities</code>. Job responsibilities
	 */
	public String getAccountabilities() {
		return (String) getValue(10);
	}

	/**
	 * Setter for <code>candidatedb.job_position.experience</code>. 工作经验
	 */
	public void setExperience(String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.experience</code>. 工作经验
	 */
	public String getExperience() {
		return (String) getValue(11);
	}

	/**
	 * Setter for <code>candidatedb.job_position.requirement</code>. 职位要求
	 */
	public void setRequirement(String value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.requirement</code>. 职位要求
	 */
	public String getRequirement() {
		return (String) getValue(12);
	}

	/**
	 * Setter for <code>candidatedb.job_position.salary</code>. 薪水
	 */
	public void setSalary(String value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.salary</code>. 薪水
	 */
	public String getSalary() {
		return (String) getValue(13);
	}

	/**
	 * Setter for <code>candidatedb.job_position.language</code>. 外语要求
	 */
	public void setLanguage(String value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.language</code>. 外语要求
	 */
	public String getLanguage() {
		return (String) getValue(14);
	}

	/**
	 * Setter for <code>candidatedb.job_position.job_grade</code>. 优先级
	 */
	public void setJobGrade(Integer value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.job_grade</code>. 优先级
	 */
	public Integer getJobGrade() {
		return (Integer) getValue(15);
	}

	/**
	 * Setter for <code>candidatedb.job_position.status</code>. 0 有效, 1 无效, 2 撤销
	 */
	public void setStatus(Byte value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.status</code>. 0 有效, 1 无效, 2 撤销
	 */
	public Byte getStatus() {
		return (Byte) getValue(16);
	}

	/**
	 * Setter for <code>candidatedb.job_position.visitnum</code>.
	 */
	public void setVisitnum(Integer value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.visitnum</code>.
	 */
	public Integer getVisitnum() {
		return (Integer) getValue(17);
	}

	/**
	 * Setter for <code>candidatedb.job_position.lastvisit</code>. openid of last visiter
	 */
	public void setLastvisit(String value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.lastvisit</code>. openid of last visiter
	 */
	public String getLastvisit() {
		return (String) getValue(18);
	}

	/**
	 * Setter for <code>candidatedb.job_position.source_id</code>. 职位来源 0：Moseeker
	 */
	public void setSourceId(Integer value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.source_id</code>. 职位来源 0：Moseeker
	 */
	public Integer getSourceId() {
		return (Integer) getValue(19);
	}

	/**
	 * Setter for <code>candidatedb.job_position.update_time</code>.
	 */
	public void setUpdateTime(Timestamp value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.update_time</code>.
	 */
	public Timestamp getUpdateTime() {
		return (Timestamp) getValue(20);
	}

	/**
	 * Setter for <code>candidatedb.job_position.business_group</code>. 事业群
	 */
	public void setBusinessGroup(String value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.business_group</code>. 事业群
	 */
	public String getBusinessGroup() {
		return (String) getValue(21);
	}

	/**
	 * Setter for <code>candidatedb.job_position.employment_type</code>. 0:全职，1：兼职：2：合同工 3:实习 9:其他
	 */
	public void setEmploymentType(Byte value) {
		setValue(22, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.employment_type</code>. 0:全职，1：兼职：2：合同工 3:实习 9:其他
	 */
	public Byte getEmploymentType() {
		return (Byte) getValue(22);
	}

	/**
	 * Setter for <code>candidatedb.job_position.hr_email</code>. HR联系人邮箱，申请通知
	 */
	public void setHrEmail(String value) {
		setValue(23, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.hr_email</code>. HR联系人邮箱，申请通知
	 */
	public String getHrEmail() {
		return (String) getValue(23);
	}

	/**
	 * Setter for <code>candidatedb.job_position.benefits</code>. 职位福利
	 */
	public void setBenefits(String value) {
		setValue(24, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.benefits</code>. 职位福利
	 */
	public String getBenefits() {
		return (String) getValue(24);
	}

	/**
	 * Setter for <code>candidatedb.job_position.degree</code>. 0:无 1:大专 2:本科 3:硕士 4:MBA 5:博士
	 */
	public void setDegree(Byte value) {
		setValue(25, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.degree</code>. 0:无 1:大专 2:本科 3:硕士 4:MBA 5:博士
	 */
	public Byte getDegree() {
		return (Byte) getValue(25);
	}

	/**
	 * Setter for <code>candidatedb.job_position.feature</code>. 职位特色
	 */
	public void setFeature(String value) {
		setValue(26, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.feature</code>. 职位特色
	 */
	public String getFeature() {
		return (String) getValue(26);
	}

	/**
	 * Setter for <code>candidatedb.job_position.email_notice</code>. application after email notice hr, 0:yes 1:no
	 */
	public void setEmailNotice(Byte value) {
		setValue(27, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.email_notice</code>. application after email notice hr, 0:yes 1:no
	 */
	public Byte getEmailNotice() {
		return (Byte) getValue(27);
	}

	/**
	 * Setter for <code>candidatedb.job_position.candidate_source</code>. 0:社招 1：校招 2:定向招聘
	 */
	public void setCandidateSource(Byte value) {
		setValue(28, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.candidate_source</code>. 0:社招 1：校招 2:定向招聘
	 */
	public Byte getCandidateSource() {
		return (Byte) getValue(28);
	}

	/**
	 * Setter for <code>candidatedb.job_position.occupation</code>. 职位职能
	 */
	public void setOccupation(String value) {
		setValue(29, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.occupation</code>. 职位职能
	 */
	public String getOccupation() {
		return (String) getValue(29);
	}

	/**
	 * Setter for <code>candidatedb.job_position.is_recom</code>. 是否需要推荐0：需要 1：不需要
	 */
	public void setIsRecom(Integer value) {
		setValue(30, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.is_recom</code>. 是否需要推荐0：需要 1：不需要
	 */
	public Integer getIsRecom() {
		return (Integer) getValue(30);
	}

	/**
	 * Setter for <code>candidatedb.job_position.industry</code>. 所属行业
	 */
	public void setIndustry(String value) {
		setValue(31, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.industry</code>. 所属行业
	 */
	public String getIndustry() {
		return (String) getValue(31);
	}

	/**
	 * Setter for <code>candidatedb.job_position.hongbao_config_id</code>.
	 */
	public void setHongbaoConfigId(Integer value) {
		setValue(32, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.hongbao_config_id</code>.
	 */
	public Integer getHongbaoConfigId() {
		return (Integer) getValue(32);
	}

	/**
	 * Setter for <code>candidatedb.job_position.hongbao_config_recom_id</code>.
	 */
	public void setHongbaoConfigRecomId(Integer value) {
		setValue(33, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.hongbao_config_recom_id</code>.
	 */
	public Integer getHongbaoConfigRecomId() {
		return (Integer) getValue(33);
	}

	/**
	 * Setter for <code>candidatedb.job_position.hongbao_config_app_id</code>.
	 */
	public void setHongbaoConfigAppId(Integer value) {
		setValue(34, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.hongbao_config_app_id</code>.
	 */
	public Integer getHongbaoConfigAppId() {
		return (Integer) getValue(34);
	}

	/**
	 * Setter for <code>candidatedb.job_position.email_resume_conf</code>. 0:允许使用email简历进行投递；1:不允许使用email简历投递
	 */
	public void setEmailResumeConf(Byte value) {
		setValue(35, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.email_resume_conf</code>. 0:允许使用email简历进行投递；1:不允许使用email简历投递
	 */
	public Byte getEmailResumeConf() {
		return (Byte) getValue(35);
	}

	/**
	 * Setter for <code>candidatedb.job_position.l_PostingTargetId</code>. lumesse每一个职位会生成一个PostingTargetId,用来生成每个职位的投递邮箱地址
	 */
	public void setLPostingtargetid(Integer value) {
		setValue(36, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.l_PostingTargetId</code>. lumesse每一个职位会生成一个PostingTargetId,用来生成每个职位的投递邮箱地址
	 */
	public Integer getLPostingtargetid() {
		return (Integer) getValue(36);
	}

	/**
	 * Setter for <code>candidatedb.job_position.priority</code>. 是否置顶
	 */
	public void setPriority(Byte value) {
		setValue(37, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.priority</code>. 是否置顶
	 */
	public Byte getPriority() {
		return (Byte) getValue(37);
	}

	/**
	 * Setter for <code>candidatedb.job_position.share_tpl_id</code>. 分享分类0:无1:高大上2：小清新3：逗比
	 */
	public void setShareTplId(Short value) {
		setValue(38, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.share_tpl_id</code>. 分享分类0:无1:高大上2：小清新3：逗比
	 */
	public Short getShareTplId() {
		return (Short) getValue(38);
	}

	/**
	 * Setter for <code>candidatedb.job_position.district</code>. 添加区(省市区的区)
	 */
	public void setDistrict(String value) {
		setValue(39, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.district</code>. 添加区(省市区的区)
	 */
	public String getDistrict() {
		return (String) getValue(39);
	}

	/**
	 * Setter for <code>candidatedb.job_position.count</code>. 添加招聘人数, 0：不限
	 */
	public void setCount(Short value) {
		setValue(40, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.count</code>. 添加招聘人数, 0：不限
	 */
	public Short getCount() {
		return (Short) getValue(40);
	}

	/**
	 * Setter for <code>candidatedb.job_position.salary_top</code>. 薪资上限（k）
	 */
	public void setSalaryTop(Integer value) {
		setValue(41, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.salary_top</code>. 薪资上限（k）
	 */
	public Integer getSalaryTop() {
		return (Integer) getValue(41);
	}

	/**
	 * Setter for <code>candidatedb.job_position.salary_bottom</code>. 薪资下限（k）
	 */
	public void setSalaryBottom(Integer value) {
		setValue(42, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.salary_bottom</code>. 薪资下限（k）
	 */
	public Integer getSalaryBottom() {
		return (Integer) getValue(42);
	}

	/**
	 * Setter for <code>candidatedb.job_position.experience_above</code>. 及以上 1：需要， 0：不需要
	 */
	public void setExperienceAbove(Byte value) {
		setValue(43, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.experience_above</code>. 及以上 1：需要， 0：不需要
	 */
	public Byte getExperienceAbove() {
		return (Byte) getValue(43);
	}

	/**
	 * Setter for <code>candidatedb.job_position.degree_above</code>. 及以上 1：需要， 0：不需要
	 */
	public void setDegreeAbove(Byte value) {
		setValue(44, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.degree_above</code>. 及以上 1：需要， 0：不需要
	 */
	public Byte getDegreeAbove() {
		return (Byte) getValue(44);
	}

	/**
	 * Setter for <code>candidatedb.job_position.management_experience</code>. 是否要求管理经验0：需要1：不需要
	 */
	public void setManagementExperience(Byte value) {
		setValue(45, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.management_experience</code>. 是否要求管理经验0：需要1：不需要
	 */
	public Byte getManagementExperience() {
		return (Byte) getValue(45);
	}

	/**
	 * Setter for <code>candidatedb.job_position.gender</code>. 0-> female, 1->male, 2->all
	 */
	public void setGender(Byte value) {
		setValue(46, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.gender</code>. 0-> female, 1->male, 2->all
	 */
	public Byte getGender() {
		return (Byte) getValue(46);
	}

	/**
	 * Setter for <code>candidatedb.job_position.publisher</code>. hr_account.id
	 */
	public void setPublisher(Integer value) {
		setValue(47, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.publisher</code>. hr_account.id
	 */
	public Integer getPublisher() {
		return (Integer) getValue(47);
	}

	/**
	 * Setter for <code>candidatedb.job_position.app_cv_config_id</code>. 职位开启并配置自定义模板 hr_app_cv_conf.id
	 */
	public void setAppCvConfigId(Integer value) {
		setValue(48, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.app_cv_config_id</code>. 职位开启并配置自定义模板 hr_app_cv_conf.id
	 */
	public Integer getAppCvConfigId() {
		return (Integer) getValue(48);
	}

	/**
	 * Setter for <code>candidatedb.job_position.source</code>. 0:手动创建, 1:导入, 9:ATS导入
	 */
	public void setSource(Short value) {
		setValue(49, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.source</code>. 0:手动创建, 1:导入, 9:ATS导入
	 */
	public Short getSource() {
		return (Short) getValue(49);
	}

	/**
	 * Setter for <code>candidatedb.job_position.hb_status</code>. 是否正参加活动：0=未参加  1=正参加点击红包活动  2=正参加被申请红包活动  3=正参加1+2红包活动
	 */
	public void setHbStatus(Byte value) {
		setValue(50, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.hb_status</code>. 是否正参加活动：0=未参加  1=正参加点击红包活动  2=正参加被申请红包活动  3=正参加1+2红包活动
	 */
	public Byte getHbStatus() {
		return (Byte) getValue(50);
	}

	/**
	 * Setter for <code>candidatedb.job_position.child_company_id</code>. hr_child_company.id
	 */
	public void setChildCompanyId(Integer value) {
		setValue(51, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.child_company_id</code>. hr_child_company.id
	 */
	public Integer getChildCompanyId() {
		return (Integer) getValue(51);
	}

	/**
	 * Setter for <code>candidatedb.job_position.age</code>. 年龄要求, 0：无要求
	 */
	public void setAge(Byte value) {
		setValue(52, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.age</code>. 年龄要求, 0：无要求
	 */
	public Byte getAge() {
		return (Byte) getValue(52);
	}

	/**
	 * Setter for <code>candidatedb.job_position.major_required</code>. 专业要求
	 */
	public void setMajorRequired(String value) {
		setValue(53, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.major_required</code>. 专业要求
	 */
	public String getMajorRequired() {
		return (String) getValue(53);
	}

	/**
	 * Setter for <code>candidatedb.job_position.work_address</code>. 上班地址
	 */
	public void setWorkAddress(String value) {
		setValue(54, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.work_address</code>. 上班地址
	 */
	public String getWorkAddress() {
		return (String) getValue(54);
	}

	/**
	 * Setter for <code>candidatedb.job_position.keyword</code>. 职位关键词
	 */
	public void setKeyword(String value) {
		setValue(55, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.keyword</code>. 职位关键词
	 */
	public String getKeyword() {
		return (String) getValue(55);
	}

	/**
	 * Setter for <code>candidatedb.job_position.reporting_to</code>. 汇报对象
	 */
	public void setReportingTo(String value) {
		setValue(56, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.reporting_to</code>. 汇报对象
	 */
	public String getReportingTo() {
		return (String) getValue(56);
	}

	/**
	 * Setter for <code>candidatedb.job_position.is_hiring</code>. 是否急招, 1:是 0:否
	 */
	public void setIsHiring(Byte value) {
		setValue(57, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.is_hiring</code>. 是否急招, 1:是 0:否
	 */
	public Byte getIsHiring() {
		return (Byte) getValue(57);
	}

	/**
	 * Setter for <code>candidatedb.job_position.underlings</code>. 下属人数， 0:没有下属
	 */
	public void setUnderlings(Byte value) {
		setValue(58, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.underlings</code>. 下属人数， 0:没有下属
	 */
	public Byte getUnderlings() {
		return (Byte) getValue(58);
	}

	/**
	 * Setter for <code>candidatedb.job_position.language_required</code>. 语言要求，1:是 0:否
	 */
	public void setLanguageRequired(Byte value) {
		setValue(59, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.language_required</code>. 语言要求，1:是 0:否
	 */
	public Byte getLanguageRequired() {
		return (Byte) getValue(59);
	}

	/**
	 * Setter for <code>candidatedb.job_position.target_industry</code>. 期望人选所在行业
	 */
	public void setTargetIndustry(Byte value) {
		setValue(60, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.target_industry</code>. 期望人选所在行业
	 */
	public Byte getTargetIndustry() {
		return (Byte) getValue(60);
	}

	/**
	 * Setter for <code>candidatedb.job_position.current_status</code>. 0:招募中, 1: 未发布, 2:暂停, 3:撤下, 4:关闭
	 */
	public void setCurrentStatus(Byte value) {
		setValue(61, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.current_status</code>. 0:招募中, 1: 未发布, 2:暂停, 3:撤下, 4:关闭
	 */
	public Byte getCurrentStatus() {
		return (Byte) getValue(61);
	}

	/**
	 * Setter for <code>candidatedb.job_position.position_code</code>. 职能字典code, dict_position.code
	 */
	public void setPositionCode(UInteger value) {
		setValue(62, value);
	}

	/**
	 * Getter for <code>candidatedb.job_position.position_code</code>. 职能字典code, dict_position.code
	 */
	public UInteger getPositionCode() {
		return (UInteger) getValue(62);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached JobPositionRecord
	 */
	public JobPositionRecord() {
		super(JobPosition.JOB_POSITION);
	}

	/**
	 * Create a detached, initialised JobPositionRecord
	 */
	public JobPositionRecord(Integer id, String jobnumber, UInteger companyId, String title, String province, String city, String department, Integer lJobid, Timestamp publishDate, Timestamp stopDate, String accountabilities, String experience, String requirement, String salary, String language, Integer jobGrade, Byte status, Integer visitnum, String lastvisit, Integer sourceId, Timestamp updateTime, String businessGroup, Byte employmentType, String hrEmail, String benefits, Byte degree, String feature, Byte emailNotice, Byte candidateSource, String occupation, Integer isRecom, String industry, Integer hongbaoConfigId, Integer hongbaoConfigRecomId, Integer hongbaoConfigAppId, Byte emailResumeConf, Integer lPostingtargetid, Byte priority, Short shareTplId, String district, Short count, Integer salaryTop, Integer salaryBottom, Byte experienceAbove, Byte degreeAbove, Byte managementExperience, Byte gender, Integer publisher, Integer appCvConfigId, Short source, Byte hbStatus, Integer childCompanyId, Byte age, String majorRequired, String workAddress, String keyword, String reportingTo, Byte isHiring, Byte underlings, Byte languageRequired, Byte targetIndustry, Byte currentStatus, UInteger positionCode) {
		super(JobPosition.JOB_POSITION);

		setValue(0, id);
		setValue(1, jobnumber);
		setValue(2, companyId);
		setValue(3, title);
		setValue(4, province);
		setValue(5, city);
		setValue(6, department);
		setValue(7, lJobid);
		setValue(8, publishDate);
		setValue(9, stopDate);
		setValue(10, accountabilities);
		setValue(11, experience);
		setValue(12, requirement);
		setValue(13, salary);
		setValue(14, language);
		setValue(15, jobGrade);
		setValue(16, status);
		setValue(17, visitnum);
		setValue(18, lastvisit);
		setValue(19, sourceId);
		setValue(20, updateTime);
		setValue(21, businessGroup);
		setValue(22, employmentType);
		setValue(23, hrEmail);
		setValue(24, benefits);
		setValue(25, degree);
		setValue(26, feature);
		setValue(27, emailNotice);
		setValue(28, candidateSource);
		setValue(29, occupation);
		setValue(30, isRecom);
		setValue(31, industry);
		setValue(32, hongbaoConfigId);
		setValue(33, hongbaoConfigRecomId);
		setValue(34, hongbaoConfigAppId);
		setValue(35, emailResumeConf);
		setValue(36, lPostingtargetid);
		setValue(37, priority);
		setValue(38, shareTplId);
		setValue(39, district);
		setValue(40, count);
		setValue(41, salaryTop);
		setValue(42, salaryBottom);
		setValue(43, experienceAbove);
		setValue(44, degreeAbove);
		setValue(45, managementExperience);
		setValue(46, gender);
		setValue(47, publisher);
		setValue(48, appCvConfigId);
		setValue(49, source);
		setValue(50, hbStatus);
		setValue(51, childCompanyId);
		setValue(52, age);
		setValue(53, majorRequired);
		setValue(54, workAddress);
		setValue(55, keyword);
		setValue(56, reportingTo);
		setValue(57, isHiring);
		setValue(58, underlings);
		setValue(59, languageRequired);
		setValue(60, targetIndustry);
		setValue(61, currentStatus);
		setValue(62, positionCode);
	}
}
