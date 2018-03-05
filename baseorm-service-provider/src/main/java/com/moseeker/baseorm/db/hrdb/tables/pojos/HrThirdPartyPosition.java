/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 第三方渠道同步的职位
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrThirdPartyPosition implements Serializable {

    private static final long serialVersionUID = -1677950258;

    private Integer   id;
    private Integer   positionId;
    private String    thirdPartPositionId;
    private Short     isSynchronization;
    private Short     isRefresh;
    private Timestamp syncTime;
    private Timestamp refreshTime;
    private Timestamp updateTime;
    private String    address;
    private String    occupation;
    private String    syncFailReason;
    private Short     useCompanyAddress;
    private Integer   thirdPartyAccountId;
    private String    department;
    private Integer   salaryMonth;
    private Integer   feedbackPeriod;
    private Short     salaryDiscuss;
    private Integer   salaryBottom;
    private Integer   salaryTop;
    private Short     channel;
    private Integer   practiceSalary;
    private Byte      practicePerWeek;
    private Byte      practiceSalaryUnit;
    private Integer   companyId;
    private Integer   addressId;
    private Integer   departmentId;
    private String    companyName;
    private String    addressName;
    private String    departmentName;
    private Integer   count;

    public HrThirdPartyPosition() {}

    public HrThirdPartyPosition(HrThirdPartyPosition value) {
        this.id = value.id;
        this.positionId = value.positionId;
        this.thirdPartPositionId = value.thirdPartPositionId;
        this.isSynchronization = value.isSynchronization;
        this.isRefresh = value.isRefresh;
        this.syncTime = value.syncTime;
        this.refreshTime = value.refreshTime;
        this.updateTime = value.updateTime;
        this.address = value.address;
        this.occupation = value.occupation;
        this.syncFailReason = value.syncFailReason;
        this.useCompanyAddress = value.useCompanyAddress;
        this.thirdPartyAccountId = value.thirdPartyAccountId;
        this.department = value.department;
        this.salaryMonth = value.salaryMonth;
        this.feedbackPeriod = value.feedbackPeriod;
        this.salaryDiscuss = value.salaryDiscuss;
        this.salaryBottom = value.salaryBottom;
        this.salaryTop = value.salaryTop;
        this.channel = value.channel;
        this.practiceSalary = value.practiceSalary;
        this.practicePerWeek = value.practicePerWeek;
        this.practiceSalaryUnit = value.practiceSalaryUnit;
        this.companyId = value.companyId;
        this.addressId = value.addressId;
        this.departmentId = value.departmentId;
        this.companyName = value.companyName;
        this.addressName = value.addressName;
        this.departmentName = value.departmentName;
        this.count = value.count;
    }

    public HrThirdPartyPosition(
        Integer   id,
        Integer   positionId,
        String    thirdPartPositionId,
        Short     isSynchronization,
        Short     isRefresh,
        Timestamp syncTime,
        Timestamp refreshTime,
        Timestamp updateTime,
        String    address,
        String    occupation,
        String    syncFailReason,
        Short     useCompanyAddress,
        Integer   thirdPartyAccountId,
        String    department,
        Integer   salaryMonth,
        Integer   feedbackPeriod,
        Short     salaryDiscuss,
        Integer   salaryBottom,
        Integer   salaryTop,
        Short     channel,
        Integer   practiceSalary,
        Byte      practicePerWeek,
        Byte      practiceSalaryUnit,
        Integer   companyId,
        Integer   addressId,
        Integer   departmentId,
        String    companyName,
        String    addressName,
        String    departmentName,
        Integer   count
    ) {
        this.id = id;
        this.positionId = positionId;
        this.thirdPartPositionId = thirdPartPositionId;
        this.isSynchronization = isSynchronization;
        this.isRefresh = isRefresh;
        this.syncTime = syncTime;
        this.refreshTime = refreshTime;
        this.updateTime = updateTime;
        this.address = address;
        this.occupation = occupation;
        this.syncFailReason = syncFailReason;
        this.useCompanyAddress = useCompanyAddress;
        this.thirdPartyAccountId = thirdPartyAccountId;
        this.department = department;
        this.salaryMonth = salaryMonth;
        this.feedbackPeriod = feedbackPeriod;
        this.salaryDiscuss = salaryDiscuss;
        this.salaryBottom = salaryBottom;
        this.salaryTop = salaryTop;
        this.channel = channel;
        this.practiceSalary = practiceSalary;
        this.practicePerWeek = practicePerWeek;
        this.practiceSalaryUnit = practiceSalaryUnit;
        this.companyId = companyId;
        this.addressId = addressId;
        this.departmentId = departmentId;
        this.companyName = companyName;
        this.addressName = addressName;
        this.departmentName = departmentName;
        this.count = count;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPositionId() {
        return this.positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getThirdPartPositionId() {
        return this.thirdPartPositionId;
    }

    public void setThirdPartPositionId(String thirdPartPositionId) {
        this.thirdPartPositionId = thirdPartPositionId;
    }

    public Short getIsSynchronization() {
        return this.isSynchronization;
    }

    public void setIsSynchronization(Short isSynchronization) {
        this.isSynchronization = isSynchronization;
    }

    public Short getIsRefresh() {
        return this.isRefresh;
    }

    public void setIsRefresh(Short isRefresh) {
        this.isRefresh = isRefresh;
    }

    public Timestamp getSyncTime() {
        return this.syncTime;
    }

    public void setSyncTime(Timestamp syncTime) {
        this.syncTime = syncTime;
    }

    public Timestamp getRefreshTime() {
        return this.refreshTime;
    }

    public void setRefreshTime(Timestamp refreshTime) {
        this.refreshTime = refreshTime;
    }

    public Timestamp getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOccupation() {
        return this.occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getSyncFailReason() {
        return this.syncFailReason;
    }

    public void setSyncFailReason(String syncFailReason) {
        this.syncFailReason = syncFailReason;
    }

    public Short getUseCompanyAddress() {
        return this.useCompanyAddress;
    }

    public void setUseCompanyAddress(Short useCompanyAddress) {
        this.useCompanyAddress = useCompanyAddress;
    }

    public Integer getThirdPartyAccountId() {
        return this.thirdPartyAccountId;
    }

    public void setThirdPartyAccountId(Integer thirdPartyAccountId) {
        this.thirdPartyAccountId = thirdPartyAccountId;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getSalaryMonth() {
        return this.salaryMonth;
    }

    public void setSalaryMonth(Integer salaryMonth) {
        this.salaryMonth = salaryMonth;
    }

    public Integer getFeedbackPeriod() {
        return this.feedbackPeriod;
    }

    public void setFeedbackPeriod(Integer feedbackPeriod) {
        this.feedbackPeriod = feedbackPeriod;
    }

    public Short getSalaryDiscuss() {
        return this.salaryDiscuss;
    }

    public void setSalaryDiscuss(Short salaryDiscuss) {
        this.salaryDiscuss = salaryDiscuss;
    }

    public Integer getSalaryBottom() {
        return this.salaryBottom;
    }

    public void setSalaryBottom(Integer salaryBottom) {
        this.salaryBottom = salaryBottom;
    }

    public Integer getSalaryTop() {
        return this.salaryTop;
    }

    public void setSalaryTop(Integer salaryTop) {
        this.salaryTop = salaryTop;
    }

    public Short getChannel() {
        return this.channel;
    }

    public void setChannel(Short channel) {
        this.channel = channel;
    }

    public Integer getPracticeSalary() {
        return this.practiceSalary;
    }

    public void setPracticeSalary(Integer practiceSalary) {
        this.practiceSalary = practiceSalary;
    }

    public Byte getPracticePerWeek() {
        return this.practicePerWeek;
    }

    public void setPracticePerWeek(Byte practicePerWeek) {
        this.practicePerWeek = practicePerWeek;
    }

    public Byte getPracticeSalaryUnit() {
        return this.practiceSalaryUnit;
    }

    public void setPracticeSalaryUnit(Byte practiceSalaryUnit) {
        this.practiceSalaryUnit = practiceSalaryUnit;
    }

    public Integer getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getAddressId() {
        return this.addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddressName() {
        return this.addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public String getDepartmentName() {
        return this.departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getCount() {
        return this.count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("HrThirdPartyPosition (");

        sb.append(id);
        sb.append(", ").append(positionId);
        sb.append(", ").append(thirdPartPositionId);
        sb.append(", ").append(isSynchronization);
        sb.append(", ").append(isRefresh);
        sb.append(", ").append(syncTime);
        sb.append(", ").append(refreshTime);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(address);
        sb.append(", ").append(occupation);
        sb.append(", ").append(syncFailReason);
        sb.append(", ").append(useCompanyAddress);
        sb.append(", ").append(thirdPartyAccountId);
        sb.append(", ").append(department);
        sb.append(", ").append(salaryMonth);
        sb.append(", ").append(feedbackPeriod);
        sb.append(", ").append(salaryDiscuss);
        sb.append(", ").append(salaryBottom);
        sb.append(", ").append(salaryTop);
        sb.append(", ").append(channel);
        sb.append(", ").append(practiceSalary);
        sb.append(", ").append(practicePerWeek);
        sb.append(", ").append(practiceSalaryUnit);
        sb.append(", ").append(companyId);
        sb.append(", ").append(addressId);
        sb.append(", ").append(departmentId);
        sb.append(", ").append(companyName);
        sb.append(", ").append(addressName);
        sb.append(", ").append(departmentName);
        sb.append(", ").append(count);

        sb.append(")");
        return sb.toString();
    }
}
