/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.talentpooldb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 企业标签表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TalentpoolCompanyTag implements Serializable {

    private static final long serialVersionUID = -92382487;

    private Integer   id;
    private Integer   companyId;
    private String    name;
    private String    color;
    private String    origins;
    private String    workYears;
    private String    submitTime;
    private String    cityName;
    private String    cityCode;
    private String    degree;
    private String    pastPosition;
    private Integer   inLastJobSearchPosition;
    private Integer   minAge;
    private Integer   maxAge;
    private String    intentionCityName;
    private String    intentionCityCode;
    private String    intentionSalaryCode;
    private Integer   sex;
    private Integer   isRecommend;
    private String    companyName;
    private Integer   inLastJobSearchCompany;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Integer   disable;

    public TalentpoolCompanyTag() {}

    public TalentpoolCompanyTag(TalentpoolCompanyTag value) {
        this.id = value.id;
        this.companyId = value.companyId;
        this.name = value.name;
        this.color = value.color;
        this.origins = value.origins;
        this.workYears = value.workYears;
        this.submitTime = value.submitTime;
        this.cityName = value.cityName;
        this.cityCode = value.cityCode;
        this.degree = value.degree;
        this.pastPosition = value.pastPosition;
        this.inLastJobSearchPosition = value.inLastJobSearchPosition;
        this.minAge = value.minAge;
        this.maxAge = value.maxAge;
        this.intentionCityName = value.intentionCityName;
        this.intentionCityCode = value.intentionCityCode;
        this.intentionSalaryCode = value.intentionSalaryCode;
        this.sex = value.sex;
        this.isRecommend = value.isRecommend;
        this.companyName = value.companyName;
        this.inLastJobSearchCompany = value.inLastJobSearchCompany;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
        this.disable = value.disable;
    }

    public TalentpoolCompanyTag(
        Integer   id,
        Integer   companyId,
        String    name,
        String    color,
        String    origins,
        String    workYears,
        String    submitTime,
        String    cityName,
        String    cityCode,
        String    degree,
        String    pastPosition,
        Integer   inLastJobSearchPosition,
        Integer   minAge,
        Integer   maxAge,
        String    intentionCityName,
        String    intentionCityCode,
        String    intentionSalaryCode,
        Integer   sex,
        Integer   isRecommend,
        String    companyName,
        Integer   inLastJobSearchCompany,
        Timestamp createTime,
        Timestamp updateTime,
        Integer   disable
    ) {
        this.id = id;
        this.companyId = companyId;
        this.name = name;
        this.color = color;
        this.origins = origins;
        this.workYears = workYears;
        this.submitTime = submitTime;
        this.cityName = cityName;
        this.cityCode = cityCode;
        this.degree = degree;
        this.pastPosition = pastPosition;
        this.inLastJobSearchPosition = inLastJobSearchPosition;
        this.minAge = minAge;
        this.maxAge = maxAge;
        this.intentionCityName = intentionCityName;
        this.intentionCityCode = intentionCityCode;
        this.intentionSalaryCode = intentionSalaryCode;
        this.sex = sex;
        this.isRecommend = isRecommend;
        this.companyName = companyName;
        this.inLastJobSearchCompany = inLastJobSearchCompany;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.disable = disable;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOrigins() {
        return this.origins;
    }

    public void setOrigins(String origins) {
        this.origins = origins;
    }

    public String getWorkYears() {
        return this.workYears;
    }

    public void setWorkYears(String workYears) {
        this.workYears = workYears;
    }

    public String getSubmitTime() {
        return this.submitTime;
    }

    public void setSubmitTime(String submitTime) {
        this.submitTime = submitTime;
    }

    public String getCityName() {
        return this.cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityCode() {
        return this.cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
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

    public String getIntentionCityCode() {
        return this.intentionCityCode;
    }

    public void setIntentionCityCode(String intentionCityCode) {
        this.intentionCityCode = intentionCityCode;
    }

    public String getIntentionSalaryCode() {
        return this.intentionSalaryCode;
    }

    public void setIntentionSalaryCode(String intentionSalaryCode) {
        this.intentionSalaryCode = intentionSalaryCode;
    }

    public Integer getSex() {
        return this.sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getIsRecommend() {
        return this.isRecommend;
    }

    public void setIsRecommend(Integer isRecommend) {
        this.isRecommend = isRecommend;
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

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getDisable() {
        return this.disable;
    }

    public void setDisable(Integer disable) {
        this.disable = disable;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TalentpoolCompanyTag (");

        sb.append(id);
        sb.append(", ").append(companyId);
        sb.append(", ").append(name);
        sb.append(", ").append(color);
        sb.append(", ").append(origins);
        sb.append(", ").append(workYears);
        sb.append(", ").append(submitTime);
        sb.append(", ").append(cityName);
        sb.append(", ").append(cityCode);
        sb.append(", ").append(degree);
        sb.append(", ").append(pastPosition);
        sb.append(", ").append(inLastJobSearchPosition);
        sb.append(", ").append(minAge);
        sb.append(", ").append(maxAge);
        sb.append(", ").append(intentionCityName);
        sb.append(", ").append(intentionCityCode);
        sb.append(", ").append(intentionSalaryCode);
        sb.append(", ").append(sex);
        sb.append(", ").append(isRecommend);
        sb.append(", ").append(companyName);
        sb.append(", ").append(inLastJobSearchCompany);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(disable);

        sb.append(")");
        return sb.toString();
    }
}
