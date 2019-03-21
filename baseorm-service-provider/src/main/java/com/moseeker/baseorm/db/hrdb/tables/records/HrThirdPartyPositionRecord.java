/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.records;


import com.moseeker.baseorm.db.hrdb.tables.HrThirdPartyPosition;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 第三方渠道同步的职位
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrThirdPartyPositionRecord extends UpdatableRecordImpl<HrThirdPartyPositionRecord> {

    private static final long serialVersionUID = 657874502;

    /**
     * Setter for <code>hrdb.hr_third_party_position.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_position.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_position.position_id</code>. jobdb.job_position.id
     */
    public void setPositionId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_position.position_id</code>. jobdb.job_position.id
     */
    public Integer getPositionId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_position.third_part_position_id</code>. 第三方渠道编号
     */
    public void setThirdPartPositionId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_position.third_part_position_id</code>. 第三方渠道编号
     */
    public String getThirdPartPositionId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_position.channel</code>. 1=51job,2=猎聘,3=智联,6=最佳东方,7=一览英才，8=JobsDB，9=民航招聘，10=脉脉，11=58同城，12=台湾104，13=千寻猎头
     */
    public void setChannel(Short value) {
        set(3, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_position.channel</code>. 1=51job,2=猎聘,3=智联,6=最佳东方,7=一览英才，8=JobsDB，9=民航招聘，10=脉脉，11=58同城，12=台湾104，13=千寻猎头
     */
    public Short getChannel() {
        return (Short) get(3);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_position.is_synchronization</code>. 是否同步:0=未同步,1=同步,2=同步中，3=同步失败，4=同步错误(发生不能给用户显示的错误)
     */
    public void setIsSynchronization(Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_position.is_synchronization</code>. 是否同步:0=未同步,1=同步,2=同步中，3=同步失败，4=同步错误(发生不能给用户显示的错误)
     */
    public Short getIsSynchronization() {
        return (Short) get(4);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_position.is_refresh</code>. 是否刷新:0=未刷新,1=刷新,2=刷新中
     */
    public void setIsRefresh(Short value) {
        set(5, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_position.is_refresh</code>. 是否刷新:0=未刷新,1=刷新,2=刷新中
     */
    public Short getIsRefresh() {
        return (Short) get(5);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_position.sync_time</code>. 职位同步时间
     */
    public void setSyncTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_position.sync_time</code>. 职位同步时间
     */
    public Timestamp getSyncTime() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_position.refresh_time</code>. 职位刷新时间
     */
    public void setRefreshTime(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_position.refresh_time</code>. 职位刷新时间
     */
    public Timestamp getRefreshTime() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_position.update_time</code>. 数据更新时间
     */
    public void setUpdateTime(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_position.update_time</code>. 数据更新时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_position.address</code>. 详细地址
     */
    public void setAddress(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_position.address</code>. 详细地址
     */
    public String getAddress() {
        return (String) get(9);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_position.occupation</code>. 同步时选中的第三方职位职能,智联，猎聘，51用逗号分隔，代表多个职能
     */
    public void setOccupation(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_position.occupation</code>. 同步时选中的第三方职位职能,智联，猎聘，51用逗号分隔，代表多个职能
     */
    public String getOccupation() {
        return (String) get(10);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_position.sync_fail_reason</code>. 失败原因
     */
    public void setSyncFailReason(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_position.sync_fail_reason</code>. 失败原因
     */
    public String getSyncFailReason() {
        return (String) get(11);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_position.use_company_address</code>. 使用企业地址
     */
    public void setUseCompanyAddress(Short value) {
        set(12, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_position.use_company_address</code>. 使用企业地址
     */
    public Short getUseCompanyAddress() {
        return (Short) get(12);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_position.third_party_account_id</code>. 第三方账号ID
     */
    public void setThirdPartyAccountId(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_position.third_party_account_id</code>. 第三方账号ID
     */
    public Integer getThirdPartyAccountId() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_position.department</code>. 同步时自定义或者匹配的部门名
     */
    public void setDepartment(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_position.department</code>. 同步时自定义或者匹配的部门名
     */
    public String getDepartment() {
        return (String) get(14);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_position.salary_month</code>. 发放月薪数
     */
    public void setSalaryMonth(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_position.salary_month</code>. 发放月薪数
     */
    public Integer getSalaryMonth() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_position.feedback_period</code>. 招聘反馈时长
     */
    public void setFeedbackPeriod(Integer value) {
        set(16, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_position.feedback_period</code>. 招聘反馈时长
     */
    public Integer getFeedbackPeriod() {
        return (Integer) get(16);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_position.salary_discuss</code>. 是否显示为面议0否1是
     */
    public void setSalaryDiscuss(Short value) {
        set(17, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_position.salary_discuss</code>. 是否显示为面议0否1是
     */
    public Short getSalaryDiscuss() {
        return (Short) get(17);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_position.salary_bottom</code>. 薪资底线
     */
    public void setSalaryBottom(Integer value) {
        set(18, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_position.salary_bottom</code>. 薪资底线
     */
    public Integer getSalaryBottom() {
        return (Integer) get(18);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_position.salary_top</code>. 薪资封顶
     */
    public void setSalaryTop(Integer value) {
        set(19, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_position.salary_top</code>. 薪资封顶
     */
    public Integer getSalaryTop() {
        return (Integer) get(19);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_position.practice_salary</code>. 实习薪资，完整薪资
     */
    public void setPracticeSalary(Integer value) {
        set(20, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_position.practice_salary</code>. 实习薪资，完整薪资
     */
    public Integer getPracticeSalary() {
        return (Integer) get(20);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_position.practice_per_week</code>. 每周实习天数
     */
    public void setPracticePerWeek(Byte value) {
        set(21, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_position.practice_per_week</code>. 每周实习天数
     */
    public Byte getPracticePerWeek() {
        return (Byte) get(21);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_position.practice_salary_unit</code>. 实习薪资单位，0：元/月，1：元/天
     */
    public void setPracticeSalaryUnit(Byte value) {
        set(22, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_position.practice_salary_unit</code>. 实习薪资单位，0：元/月，1：元/天
     */
    public Byte getPracticeSalaryUnit() {
        return (Byte) get(22);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_position.company_id</code>. 绑定第三方账号对应公司的id，关联thirdparty_account_city的id
     */
    public void setCompanyId(Integer value) {
        set(23, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_position.company_id</code>. 绑定第三方账号对应公司的id，关联thirdparty_account_city的id
     */
    public Integer getCompanyId() {
        return (Integer) get(23);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_position.address_id</code>. 绑定第三方账号对应地址的id，关联thirdparty_account_company_address的id
     */
    public void setAddressId(Integer value) {
        set(24, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_position.address_id</code>. 绑定第三方账号对应地址的id，关联thirdparty_account_company_address的id
     */
    public Integer getAddressId() {
        return (Integer) get(24);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_position.department_id</code>. 绑定第三方账号对应部门的id，关联thirdparty_account_department的id
     */
    public void setDepartmentId(Integer value) {
        set(25, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_position.department_id</code>. 绑定第三方账号对应部门的id，关联thirdparty_account_department的id
     */
    public Integer getDepartmentId() {
        return (Integer) get(25);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_position.company_name</code>. 绑定第三方账号对应公司的名称
     */
    public void setCompanyName(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_position.company_name</code>. 绑定第三方账号对应公司的名称
     */
    public String getCompanyName() {
        return (String) get(26);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_position.address_name</code>. 绑定第三方账号对应地址的名称
     */
    public void setAddressName(String value) {
        set(27, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_position.address_name</code>. 绑定第三方账号对应地址的名称
     */
    public String getAddressName() {
        return (String) get(27);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_position.department_name</code>. 绑定第三方账号对应部门的名称
     */
    public void setDepartmentName(String value) {
        set(28, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_position.department_name</code>. 绑定第三方账号对应部门的名称
     */
    public String getDepartmentName() {
        return (String) get(28);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_position.count</code>. 招聘人数
     */
    public void setCount(Integer value) {
        set(29, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_position.count</code>. 招聘人数
     */
    public Integer getCount() {
        return (Integer) get(29);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_position.feature</code>.
     */
    public void setFeature(String value) {
        set(30, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_position.feature</code>.
     */
    public String getFeature() {
        return (String) get(30);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_position.internship</code>. 是否使用实习职位的额度,0：不使用，1：使用
     */
    public void setInternship(Byte value) {
        set(31, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_position.internship</code>. 是否使用实习职位的额度,0：不使用，1：使用
     */
    public Byte getInternship() {
        return (Byte) get(31);
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
     * Create a detached HrThirdPartyPositionRecord
     */
    public HrThirdPartyPositionRecord() {
        super(HrThirdPartyPosition.HR_THIRD_PARTY_POSITION);
    }

    /**
     * Create a detached, initialised HrThirdPartyPositionRecord
     */
    public HrThirdPartyPositionRecord(Integer id, Integer positionId, String thirdPartPositionId, Short channel, Short isSynchronization, Short isRefresh, Timestamp syncTime, Timestamp refreshTime, Timestamp updateTime, String address, String occupation, String syncFailReason, Short useCompanyAddress, Integer thirdPartyAccountId, String department, Integer salaryMonth, Integer feedbackPeriod, Short salaryDiscuss, Integer salaryBottom, Integer salaryTop, Integer practiceSalary, Byte practicePerWeek, Byte practiceSalaryUnit, Integer companyId, Integer addressId, Integer departmentId, String companyName, String addressName, String departmentName, Integer count, String feature, Byte internship) {
        super(HrThirdPartyPosition.HR_THIRD_PARTY_POSITION);

        set(0, id);
        set(1, positionId);
        set(2, thirdPartPositionId);
        set(3, channel);
        set(4, isSynchronization);
        set(5, isRefresh);
        set(6, syncTime);
        set(7, refreshTime);
        set(8, updateTime);
        set(9, address);
        set(10, occupation);
        set(11, syncFailReason);
        set(12, useCompanyAddress);
        set(13, thirdPartyAccountId);
        set(14, department);
        set(15, salaryMonth);
        set(16, feedbackPeriod);
        set(17, salaryDiscuss);
        set(18, salaryBottom);
        set(19, salaryTop);
        set(20, practiceSalary);
        set(21, practicePerWeek);
        set(22, practiceSalaryUnit);
        set(23, companyId);
        set(24, addressId);
        set(25, departmentId);
        set(26, companyName);
        set(27, addressName);
        set(28, departmentName);
        set(29, count);
        set(30, feature);
        set(31, internship);
    }
}
