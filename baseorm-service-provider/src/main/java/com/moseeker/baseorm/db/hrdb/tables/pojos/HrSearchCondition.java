/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 候选人列表常用筛选项
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrSearchCondition implements Serializable {

    private static final long serialVersionUID = -1329347160;

    private Integer   id;
    private String    name;
    private Integer   publisher;
    private Integer   positionId;
    private String    keyword;
    private String    submitTime;
    private String    workYears;
    private String    cityName;
    private String    degree;
    private String    pastPosition;
    private Integer   inLastJobSearchPosition;
    private Integer   minAge;
    private Integer   maxAge;
    private String    intentionCityName;
    private Integer   sex;
    private String    intentionSalaryCode;
    private String    companyName;
    private Integer   inLastJobSearchCompany;
    private Integer   hrAccountId;
    private Timestamp createTime;
    private Integer   updateTime;
    private Integer   type;

    public HrSearchCondition() {}

    public HrSearchCondition(HrSearchCondition value) {
        this.id = value.id;
        this.name = value.name;
        this.publisher = value.publisher;
        this.positionId = value.positionId;
        this.keyword = value.keyword;
        this.submitTime = value.submitTime;
        this.workYears = value.workYears;
        this.cityName = value.cityName;
        this.degree = value.degree;
        this.pastPosition = value.pastPosition;
        this.inLastJobSearchPosition = value.inLastJobSearchPosition;
        this.minAge = value.minAge;
        this.maxAge = value.maxAge;
        this.intentionCityName = value.intentionCityName;
        this.sex = value.sex;
        this.intentionSalaryCode = value.intentionSalaryCode;
        this.companyName = value.companyName;
        this.inLastJobSearchCompany = value.inLastJobSearchCompany;
        this.hrAccountId = value.hrAccountId;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
        this.type = value.type;
    }

    public HrSearchCondition(
        Integer   id,
        String    name,
        Integer   publisher,
        Integer   positionId,
        String    keyword,
        String    submitTime,
        String    workYears,
        String    cityName,
        String    degree,
        String    pastPosition,
        Integer   inLastJobSearchPosition,
        Integer   minAge,
        Integer   maxAge,
        String    intentionCityName,
        Integer   sex,
        String    intentionSalaryCode,
        String    companyName,
        Integer   inLastJobSearchCompany,
        Integer   hrAccountId,
        Timestamp createTime,
        Integer   updateTime,
        Integer   type
    ) {
        this.id = id;
        this.name = name;
        this.publisher = publisher;
        this.positionId = positionId;
        this.keyword = keyword;
        this.submitTime = submitTime;
        this.workYears = workYears;
        this.cityName = cityName;
        this.degree = degree;
        this.pastPosition = pastPosition;
        this.inLastJobSearchPosition = inLastJobSearchPosition;
        this.minAge = minAge;
        this.maxAge = maxAge;
        this.intentionCityName = intentionCityName;
        this.sex = sex;
        this.intentionSalaryCode = intentionSalaryCode;
        this.companyName = companyName;
        this.inLastJobSearchCompany = inLastJobSearchCompany;
        this.hrAccountId = hrAccountId;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.type = type;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPublisher() {
        return this.publisher;
    }

    public void setPublisher(Integer publisher) {
        this.publisher = publisher;
    }

    public Integer getPositionId() {
        return this.positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getSubmitTime() {
        return this.submitTime;
    }

    public void setSubmitTime(String submitTime) {
        this.submitTime = submitTime;
    }

    public String getWorkYears() {
        return this.workYears;
    }

    public void setWorkYears(String workYears) {
        this.workYears = workYears;
    }

    public String getCityName() {
        return this.cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDegree() {
        return this.degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getPastPosition() {
        return this.pastPosition;
    }

    public void setPastPosition(String pastPosition) {
        this.pastPosition = pastPosition;
    }

    public Integer getInLastJobSearchPosition() {
        return this.inLastJobSearchPosition;
    }

    public void setInLastJobSearchPosition(Integer inLastJobSearchPosition) {
        this.inLastJobSearchPosition = inLastJobSearchPosition;
    }

    public Integer getMinAge() {
        return this.minAge;
    }

    public void setMinAge(Integer minAge) {
        this.minAge = minAge;
    }

    public Integer getMaxAge() {
        return this.maxAge;
    }

    public void setMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
    }

    public String getIntentionCityName() {
        return this.intentionCityName;
    }

    public void setIntentionCityName(String intentionCityName) {
        this.intentionCityName = intentionCityName;
    }

    public Integer getSex() {
        return this.sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getIntentionSalaryCode() {
        return this.intentionSalaryCode;
    }

    public void setIntentionSalaryCode(String intentionSalaryCode) {
        this.intentionSalaryCode = intentionSalaryCode;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getInLastJobSearchCompany() {
        return this.inLastJobSearchCompany;
    }

    public void setInLastJobSearchCompany(Integer inLastJobSearchCompany) {
        this.inLastJobSearchCompany = inLastJobSearchCompany;
    }

    public Integer getHrAccountId() {
        return this.hrAccountId;
    }

    public void setHrAccountId(Integer hrAccountId) {
        this.hrAccountId = hrAccountId;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("HrSearchCondition (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(publisher);
        sb.append(", ").append(positionId);
        sb.append(", ").append(keyword);
        sb.append(", ").append(submitTime);
        sb.append(", ").append(workYears);
        sb.append(", ").append(cityName);
        sb.append(", ").append(degree);
        sb.append(", ").append(pastPosition);
        sb.append(", ").append(inLastJobSearchPosition);
        sb.append(", ").append(minAge);
        sb.append(", ").append(maxAge);
        sb.append(", ").append(intentionCityName);
        sb.append(", ").append(sex);
        sb.append(", ").append(intentionSalaryCode);
        sb.append(", ").append(companyName);
        sb.append(", ").append(inLastJobSearchCompany);
        sb.append(", ").append(hrAccountId);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(type);

        sb.append(")");
        return sb.toString();
    }
}
