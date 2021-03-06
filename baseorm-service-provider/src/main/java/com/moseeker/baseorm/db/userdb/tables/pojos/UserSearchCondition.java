/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.userdb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 用户搜索条件(qx职位搜索)
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserSearchCondition implements Serializable {

    private static final long serialVersionUID = 83922342;

    private Integer   id;
    private String    name;
    private String    keywords;
    private String    cityName;
    private Integer   salaryTop;
    private Integer   salaryBottom;
    private Byte      salaryNegotiable;
    private String    industry;
    private Integer   userId;
    private Byte      disable;
    private Timestamp createTime;
    private Timestamp updateTime;

    public UserSearchCondition() {}

    public UserSearchCondition(UserSearchCondition value) {
        this.id = value.id;
        this.name = value.name;
        this.keywords = value.keywords;
        this.cityName = value.cityName;
        this.salaryTop = value.salaryTop;
        this.salaryBottom = value.salaryBottom;
        this.salaryNegotiable = value.salaryNegotiable;
        this.industry = value.industry;
        this.userId = value.userId;
        this.disable = value.disable;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
    }

    public UserSearchCondition(
        Integer   id,
        String    name,
        String    keywords,
        String    cityName,
        Integer   salaryTop,
        Integer   salaryBottom,
        Byte      salaryNegotiable,
        String    industry,
        Integer   userId,
        Byte      disable,
        Timestamp createTime,
        Timestamp updateTime
    ) {
        this.id = id;
        this.name = name;
        this.keywords = keywords;
        this.cityName = cityName;
        this.salaryTop = salaryTop;
        this.salaryBottom = salaryBottom;
        this.salaryNegotiable = salaryNegotiable;
        this.industry = industry;
        this.userId = userId;
        this.disable = disable;
        this.createTime = createTime;
        this.updateTime = updateTime;
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

    public String getKeywords() {
        return this.keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getCityName() {
        return this.cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getSalaryTop() {
        return this.salaryTop;
    }

    public void setSalaryTop(Integer salaryTop) {
        this.salaryTop = salaryTop;
    }

    public Integer getSalaryBottom() {
        return this.salaryBottom;
    }

    public void setSalaryBottom(Integer salaryBottom) {
        this.salaryBottom = salaryBottom;
    }

    public Byte getSalaryNegotiable() {
        return this.salaryNegotiable;
    }

    public void setSalaryNegotiable(Byte salaryNegotiable) {
        this.salaryNegotiable = salaryNegotiable;
    }

    public String getIndustry() {
        return this.industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Byte getDisable() {
        return this.disable;
    }

    public void setDisable(Byte disable) {
        this.disable = disable;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserSearchCondition (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(keywords);
        sb.append(", ").append(cityName);
        sb.append(", ").append(salaryTop);
        sb.append(", ").append(salaryBottom);
        sb.append(", ").append(salaryNegotiable);
        sb.append(", ").append(industry);
        sb.append(", ").append(userId);
        sb.append(", ").append(disable);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}
