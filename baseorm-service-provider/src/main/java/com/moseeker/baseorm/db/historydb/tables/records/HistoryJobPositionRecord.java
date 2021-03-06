/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.historydb.tables.records;


import com.moseeker.baseorm.db.historydb.tables.HistoryJobPosition;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 职位归档表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HistoryJobPositionRecord extends UpdatableRecordImpl<HistoryJobPositionRecord> {

    private static final long serialVersionUID = -800582715;

    /**
     * Setter for <code>historydb.history_job_position.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>historydb.history_job_position.jobnumber</code>. 职位编号
     */
    public void setJobnumber(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.jobnumber</code>. 职位编号
     */
    public String getJobnumber() {
        return (String) get(1);
    }

    /**
     * Setter for <code>historydb.history_job_position.company_id</code>. company.id
     */
    public void setCompanyId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.company_id</code>. company.id
     */
    public Integer getCompanyId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>historydb.history_job_position.title</code>. 职位标题
     */
    public void setTitle(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.title</code>. 职位标题
     */
    public String getTitle() {
        return (String) get(3);
    }

    /**
     * Setter for <code>historydb.history_job_position.province</code>. 所在省
     */
    public void setProvince(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.province</code>. 所在省
     */
    public String getProvince() {
        return (String) get(4);
    }

    /**
     * Setter for <code>historydb.history_job_position.city</code>. 所在城市
     */
    public void setCity(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.city</code>. 所在城市
     */
    public String getCity() {
        return (String) get(5);
    }

    /**
     * Setter for <code>historydb.history_job_position.department</code>. 所在部门
     */
    public void setDepartment(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.department</code>. 所在部门
     */
    public String getDepartment() {
        return (String) get(6);
    }

    /**
     * Setter for <code>historydb.history_job_position.l_jobid</code>. jobid from ATS or other channel
     */
    public void setLJobid(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.l_jobid</code>. jobid from ATS or other channel
     */
    public Integer getLJobid() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>historydb.history_job_position.publish_date</code>. Default: now, set by js
     */
    public void setPublishDate(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.publish_date</code>. Default: now, set by js
     */
    public Timestamp getPublishDate() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>historydb.history_job_position.stop_date</code>. 截止日期
     */
    public void setStopDate(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.stop_date</code>. 截止日期
     */
    public Timestamp getStopDate() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>historydb.history_job_position.accountabilities</code>. Job responsibilities
     */
    public void setAccountabilities(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.accountabilities</code>. Job responsibilities
     */
    public String getAccountabilities() {
        return (String) get(10);
    }

    /**
     * Setter for <code>historydb.history_job_position.experience</code>. 工作经验
     */
    public void setExperience(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.experience</code>. 工作经验
     */
    public String getExperience() {
        return (String) get(11);
    }

    /**
     * Setter for <code>historydb.history_job_position.requirement</code>. 职位要求
     */
    public void setRequirement(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.requirement</code>. 职位要求
     */
    public String getRequirement() {
        return (String) get(12);
    }

    /**
     * Setter for <code>historydb.history_job_position.salary</code>. 薪水
     */
    public void setSalary(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.salary</code>. 薪水
     */
    public String getSalary() {
        return (String) get(13);
    }

    /**
     * Setter for <code>historydb.history_job_position.language</code>. 外语要求
     */
    public void setLanguage(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.language</code>. 外语要求
     */
    public String getLanguage() {
        return (String) get(14);
    }

    /**
     * Setter for <code>historydb.history_job_position.job_grade</code>. 优先级
     */
    public void setJobGrade(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.job_grade</code>. 优先级
     */
    public Integer getJobGrade() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>historydb.history_job_position.status</code>. 0 有效, 1 无效, 2 撤销
     */
    public void setStatus(Byte value) {
        set(16, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.status</code>. 0 有效, 1 无效, 2 撤销
     */
    public Byte getStatus() {
        return (Byte) get(16);
    }

    /**
     * Setter for <code>historydb.history_job_position.visitnum</code>.
     */
    public void setVisitnum(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.visitnum</code>.
     */
    public Integer getVisitnum() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>historydb.history_job_position.lastvisit</code>. openid of last visiter
     */
    public void setLastvisit(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.lastvisit</code>. openid of last visiter
     */
    public String getLastvisit() {
        return (String) get(18);
    }

    /**
     * Setter for <code>historydb.history_job_position.source_id</code>. 职位来源 0：Moseeker
     */
    public void setSourceId(Integer value) {
        set(19, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.source_id</code>. 职位来源 0：Moseeker
     */
    public Integer getSourceId() {
        return (Integer) get(19);
    }

    /**
     * Setter for <code>historydb.history_job_position.update_time</code>.
     */
    public void setUpdateTime(Timestamp value) {
        set(20, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(20);
    }

    /**
     * Setter for <code>historydb.history_job_position.business_group</code>. 事业群
     */
    public void setBusinessGroup(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.business_group</code>. 事业群
     */
    public String getBusinessGroup() {
        return (String) get(21);
    }

    /**
     * Setter for <code>historydb.history_job_position.employment_type</code>. 0:全职，1：兼职：2：合同工 3:实习 9:其他
     */
    public void setEmploymentType(Byte value) {
        set(22, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.employment_type</code>. 0:全职，1：兼职：2：合同工 3:实习 9:其他
     */
    public Byte getEmploymentType() {
        return (Byte) get(22);
    }

    /**
     * Setter for <code>historydb.history_job_position.hr_email</code>. HR联系人邮箱，申请通知
     */
    public void setHrEmail(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.hr_email</code>. HR联系人邮箱，申请通知
     */
    public String getHrEmail() {
        return (String) get(23);
    }

    /**
     * Setter for <code>historydb.history_job_position.benefits</code>. 职位福利
     */
    public void setBenefits(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.benefits</code>. 职位福利
     */
    public String getBenefits() {
        return (String) get(24);
    }

    /**
     * Setter for <code>historydb.history_job_position.degree</code>. 0:无 1:大专 2:本科 3:硕士 4:MBA 5:博士 6:中专 7:高中 8: 博士后 9:初中
     */
    public void setDegree(Byte value) {
        set(25, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.degree</code>. 0:无 1:大专 2:本科 3:硕士 4:MBA 5:博士 6:中专 7:高中 8: 博士后 9:初中
     */
    public Byte getDegree() {
        return (Byte) get(25);
    }

    /**
     * Setter for <code>historydb.history_job_position.feature</code>. 职位特色
     */
    public void setFeature(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.feature</code>. 职位特色
     */
    public String getFeature() {
        return (String) get(26);
    }

    /**
     * Setter for <code>historydb.history_job_position.email_notice</code>. application after email notice hr, 0:yes 1:no
     */
    public void setEmailNotice(Byte value) {
        set(27, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.email_notice</code>. application after email notice hr, 0:yes 1:no
     */
    public Byte getEmailNotice() {
        return (Byte) get(27);
    }

    /**
     * Setter for <code>historydb.history_job_position.candidate_source</code>. 0:社招 1：校招 2:定向招聘
     */
    public void setCandidateSource(Byte value) {
        set(28, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.candidate_source</code>. 0:社招 1：校招 2:定向招聘
     */
    public Byte getCandidateSource() {
        return (Byte) get(28);
    }

    /**
     * Setter for <code>historydb.history_job_position.occupation</code>. 职位职能
     */
    public void setOccupation(String value) {
        set(29, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.occupation</code>. 职位职能
     */
    public String getOccupation() {
        return (String) get(29);
    }

    /**
     * Setter for <code>historydb.history_job_position.is_recom</code>. 是否需要推荐0：需要 1：不需要
     */
    public void setIsRecom(Integer value) {
        set(30, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.is_recom</code>. 是否需要推荐0：需要 1：不需要
     */
    public Integer getIsRecom() {
        return (Integer) get(30);
    }

    /**
     * Setter for <code>historydb.history_job_position.industry</code>. 所属行业
     */
    public void setIndustry(String value) {
        set(31, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.industry</code>. 所属行业
     */
    public String getIndustry() {
        return (String) get(31);
    }

    /**
     * Setter for <code>historydb.history_job_position.hongbao_config_id</code>.
     */
    public void setHongbaoConfigId(Integer value) {
        set(32, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.hongbao_config_id</code>.
     */
    public Integer getHongbaoConfigId() {
        return (Integer) get(32);
    }

    /**
     * Setter for <code>historydb.history_job_position.hongbao_config_recom_id</code>.
     */
    public void setHongbaoConfigRecomId(Integer value) {
        set(33, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.hongbao_config_recom_id</code>.
     */
    public Integer getHongbaoConfigRecomId() {
        return (Integer) get(33);
    }

    /**
     * Setter for <code>historydb.history_job_position.hongbao_config_app_id</code>.
     */
    public void setHongbaoConfigAppId(Integer value) {
        set(34, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.hongbao_config_app_id</code>.
     */
    public Integer getHongbaoConfigAppId() {
        return (Integer) get(34);
    }

    /**
     * Setter for <code>historydb.history_job_position.email_resume_conf</code>. 0:允许使用email简历进行投递；1:不允许使用email简历投递
     */
    public void setEmailResumeConf(Byte value) {
        set(35, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.email_resume_conf</code>. 0:允许使用email简历进行投递；1:不允许使用email简历投递
     */
    public Byte getEmailResumeConf() {
        return (Byte) get(35);
    }

    /**
     * Setter for <code>historydb.history_job_position.l_PostingTargetId</code>. lumesse每一个职位会生成一个PostingTargetId,用来生成每个职位的投递邮箱地址
     */
    public void setLPostingtargetid(Integer value) {
        set(36, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.l_PostingTargetId</code>. lumesse每一个职位会生成一个PostingTargetId,用来生成每个职位的投递邮箱地址
     */
    public Integer getLPostingtargetid() {
        return (Integer) get(36);
    }

    /**
     * Setter for <code>historydb.history_job_position.priority</code>. 是否置顶
     */
    public void setPriority(Byte value) {
        set(37, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.priority</code>. 是否置顶
     */
    public Byte getPriority() {
        return (Byte) get(37);
    }

    /**
     * Setter for <code>historydb.history_job_position.share_tpl_id</code>. 分享分类0:无1:高大上2：小清新3：逗比
     */
    public void setShareTplId(Short value) {
        set(38, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.share_tpl_id</code>. 分享分类0:无1:高大上2：小清新3：逗比
     */
    public Short getShareTplId() {
        return (Short) get(38);
    }

    /**
     * Setter for <code>historydb.history_job_position.district</code>. 添加区(省市区的区)
     */
    public void setDistrict(String value) {
        set(39, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.district</code>. 添加区(省市区的区)
     */
    public String getDistrict() {
        return (String) get(39);
    }

    /**
     * Setter for <code>historydb.history_job_position.count</code>. 添加招聘人数, 0：不限
     */
    public void setCount(Short value) {
        set(40, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.count</code>. 添加招聘人数, 0：不限
     */
    public Short getCount() {
        return (Short) get(40);
    }

    /**
     * Setter for <code>historydb.history_job_position.salary_top</code>. 薪资上限（k）
     */
    public void setSalaryTop(Integer value) {
        set(41, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.salary_top</code>. 薪资上限（k）
     */
    public Integer getSalaryTop() {
        return (Integer) get(41);
    }

    /**
     * Setter for <code>historydb.history_job_position.salary_bottom</code>. 薪资下限（k）
     */
    public void setSalaryBottom(Integer value) {
        set(42, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.salary_bottom</code>. 薪资下限（k）
     */
    public Integer getSalaryBottom() {
        return (Integer) get(42);
    }

    /**
     * Setter for <code>historydb.history_job_position.experience_above</code>. 及以上 1：需要， 0：不需要
     */
    public void setExperienceAbove(Byte value) {
        set(43, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.experience_above</code>. 及以上 1：需要， 0：不需要
     */
    public Byte getExperienceAbove() {
        return (Byte) get(43);
    }

    /**
     * Setter for <code>historydb.history_job_position.degree_above</code>. 及以上 1：需要， 0：不需要
     */
    public void setDegreeAbove(Byte value) {
        set(44, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.degree_above</code>. 及以上 1：需要， 0：不需要
     */
    public Byte getDegreeAbove() {
        return (Byte) get(44);
    }

    /**
     * Setter for <code>historydb.history_job_position.management_experience</code>. 是否要求管理经验0：需要1：不需要
     */
    public void setManagementExperience(Byte value) {
        set(45, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.management_experience</code>. 是否要求管理经验0：需要1：不需要
     */
    public Byte getManagementExperience() {
        return (Byte) get(45);
    }

    /**
     * Setter for <code>historydb.history_job_position.gender</code>. 0-&gt; female, 1-&gt;male, 2-&gt;all
     */
    public void setGender(Byte value) {
        set(46, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.gender</code>. 0-&gt; female, 1-&gt;male, 2-&gt;all
     */
    public Byte getGender() {
        return (Byte) get(46);
    }

    /**
     * Setter for <code>historydb.history_job_position.publisher</code>. hr_account.id
     */
    public void setPublisher(Integer value) {
        set(47, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.publisher</code>. hr_account.id
     */
    public Integer getPublisher() {
        return (Integer) get(47);
    }

    /**
     * Setter for <code>historydb.history_job_position.app_cv_config_id</code>. 职位开启并配置自定义模板 hr_app_cv_conf.id
     */
    public void setAppCvConfigId(Integer value) {
        set(48, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.app_cv_config_id</code>. 职位开启并配置自定义模板 hr_app_cv_conf.id
     */
    public Integer getAppCvConfigId() {
        return (Integer) get(48);
    }

    /**
     * Setter for <code>historydb.history_job_position.source</code>. 0:手动创建, 1:导入, 9:ATS导入
     */
    public void setSource(Short value) {
        set(49, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.source</code>. 0:手动创建, 1:导入, 9:ATS导入
     */
    public Short getSource() {
        return (Short) get(49);
    }

    /**
     * Setter for <code>historydb.history_job_position.hb_status</code>. 是否正参加活动：0=未参加  1=正参加点击红包活动  2=正参加被申请红包活动  3=正参加1+2红包活动
     */
    public void setHbStatus(Byte value) {
        set(50, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.hb_status</code>. 是否正参加活动：0=未参加  1=正参加点击红包活动  2=正参加被申请红包活动  3=正参加1+2红包活动
     */
    public Byte getHbStatus() {
        return (Byte) get(50);
    }

    /**
     * Setter for <code>historydb.history_job_position.child_company_id</code>. hr_child_company.id
     */
    public void setChildCompanyId(Integer value) {
        set(51, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.child_company_id</code>. hr_child_company.id
     */
    public Integer getChildCompanyId() {
        return (Integer) get(51);
    }

    /**
     * Setter for <code>historydb.history_job_position.age</code>. 年龄要求, 0：无要求
     */
    public void setAge(Byte value) {
        set(52, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.age</code>. 年龄要求, 0：无要求
     */
    public Byte getAge() {
        return (Byte) get(52);
    }

    /**
     * Setter for <code>historydb.history_job_position.major_required</code>. 专业要求
     */
    public void setMajorRequired(String value) {
        set(53, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.major_required</code>. 专业要求
     */
    public String getMajorRequired() {
        return (String) get(53);
    }

    /**
     * Setter for <code>historydb.history_job_position.work_address</code>. 上班地址
     */
    public void setWorkAddress(String value) {
        set(54, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.work_address</code>. 上班地址
     */
    public String getWorkAddress() {
        return (String) get(54);
    }

    /**
     * Setter for <code>historydb.history_job_position.keyword</code>. 职位关键词
     */
    public void setKeyword(String value) {
        set(55, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.keyword</code>. 职位关键词
     */
    public String getKeyword() {
        return (String) get(55);
    }

    /**
     * Setter for <code>historydb.history_job_position.reporting_to</code>. 汇报对象
     */
    public void setReportingTo(String value) {
        set(56, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.reporting_to</code>. 汇报对象
     */
    public String getReportingTo() {
        return (String) get(56);
    }

    /**
     * Setter for <code>historydb.history_job_position.is_hiring</code>. 是否急招, 1:是 0:否
     */
    public void setIsHiring(Byte value) {
        set(57, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.is_hiring</code>. 是否急招, 1:是 0:否
     */
    public Byte getIsHiring() {
        return (Byte) get(57);
    }

    /**
     * Setter for <code>historydb.history_job_position.underlings</code>. 下属人数， 0:没有下属
     */
    public void setUnderlings(Byte value) {
        set(58, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.underlings</code>. 下属人数， 0:没有下属
     */
    public Byte getUnderlings() {
        return (Byte) get(58);
    }

    /**
     * Setter for <code>historydb.history_job_position.language_required</code>. 语言要求，1:是 0:否
     */
    public void setLanguageRequired(Byte value) {
        set(59, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.language_required</code>. 语言要求，1:是 0:否
     */
    public Byte getLanguageRequired() {
        return (Byte) get(59);
    }

    /**
     * Setter for <code>historydb.history_job_position.target_industry</code>. 期望人选所在行业
     */
    public void setTargetIndustry(Byte value) {
        set(60, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.target_industry</code>. 期望人选所在行业
     */
    public Byte getTargetIndustry() {
        return (Byte) get(60);
    }

    /**
     * Setter for <code>historydb.history_job_position.current_status</code>. 0:招募中, 1: 未发布, 2:暂停, 3:撤下, 4:关闭
     */
    public void setCurrentStatus(Byte value) {
        set(61, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.current_status</code>. 0:招募中, 1: 未发布, 2:暂停, 3:撤下, 4:关闭
     */
    public Byte getCurrentStatus() {
        return (Byte) get(61);
    }

    /**
     * Setter for <code>historydb.history_job_position.position_code</code>. 职能字典code, dict_position.code
     */
    public void setPositionCode(Integer value) {
        set(62, value);
    }

    /**
     * Getter for <code>historydb.history_job_position.position_code</code>. 职能字典code, dict_position.code
     */
    public Integer getPositionCode() {
        return (Integer) get(62);
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
     * Create a detached HistoryJobPositionRecord
     */
    public HistoryJobPositionRecord() {
        super(HistoryJobPosition.HISTORY_JOB_POSITION);
    }

    /**
     * Create a detached, initialised HistoryJobPositionRecord
     */
    public HistoryJobPositionRecord(Integer id, String jobnumber, Integer companyId, String title, String province, String city, String department, Integer lJobid, Timestamp publishDate, Timestamp stopDate, String accountabilities, String experience, String requirement, String salary, String language, Integer jobGrade, Byte status, Integer visitnum, String lastvisit, Integer sourceId, Timestamp updateTime, String businessGroup, Byte employmentType, String hrEmail, String benefits, Byte degree, String feature, Byte emailNotice, Byte candidateSource, String occupation, Integer isRecom, String industry, Integer hongbaoConfigId, Integer hongbaoConfigRecomId, Integer hongbaoConfigAppId, Byte emailResumeConf, Integer lPostingtargetid, Byte priority, Short shareTplId, String district, Short count, Integer salaryTop, Integer salaryBottom, Byte experienceAbove, Byte degreeAbove, Byte managementExperience, Byte gender, Integer publisher, Integer appCvConfigId, Short source, Byte hbStatus, Integer childCompanyId, Byte age, String majorRequired, String workAddress, String keyword, String reportingTo, Byte isHiring, Byte underlings, Byte languageRequired, Byte targetIndustry, Byte currentStatus, Integer positionCode) {
        super(HistoryJobPosition.HISTORY_JOB_POSITION);

        set(0, id);
        set(1, jobnumber);
        set(2, companyId);
        set(3, title);
        set(4, province);
        set(5, city);
        set(6, department);
        set(7, lJobid);
        set(8, publishDate);
        set(9, stopDate);
        set(10, accountabilities);
        set(11, experience);
        set(12, requirement);
        set(13, salary);
        set(14, language);
        set(15, jobGrade);
        set(16, status);
        set(17, visitnum);
        set(18, lastvisit);
        set(19, sourceId);
        set(20, updateTime);
        set(21, businessGroup);
        set(22, employmentType);
        set(23, hrEmail);
        set(24, benefits);
        set(25, degree);
        set(26, feature);
        set(27, emailNotice);
        set(28, candidateSource);
        set(29, occupation);
        set(30, isRecom);
        set(31, industry);
        set(32, hongbaoConfigId);
        set(33, hongbaoConfigRecomId);
        set(34, hongbaoConfigAppId);
        set(35, emailResumeConf);
        set(36, lPostingtargetid);
        set(37, priority);
        set(38, shareTplId);
        set(39, district);
        set(40, count);
        set(41, salaryTop);
        set(42, salaryBottom);
        set(43, experienceAbove);
        set(44, degreeAbove);
        set(45, managementExperience);
        set(46, gender);
        set(47, publisher);
        set(48, appCvConfigId);
        set(49, source);
        set(50, hbStatus);
        set(51, childCompanyId);
        set(52, age);
        set(53, majorRequired);
        set(54, workAddress);
        set(55, keyword);
        set(56, reportingTo);
        set(57, isHiring);
        set(58, underlings);
        set(59, languageRequired);
        set(60, targetIndustry);
        set(61, currentStatus);
        set(62, positionCode);
    }
}
