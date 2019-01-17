/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.pojos;


import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 公司表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrCompany implements Serializable {

    private static final long serialVersionUID = -223300201;

    private Integer   id;
    private Byte      type;
    private String    name;
    private String    introduction;
    private Byte      scale;
    private String    address;
    private Byte      property;
    private String    industry;
    private String    homepage;
    private String    logo;
    private String    abbreviation;
    private String    impression;
    private String    banner;
    private Integer   parentId;
    private Integer   hraccountId;
    private Byte      disable;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Byte      source;
    private String    slogan;
    private String    feature;
    private Byte      fortune;
    private Byte      fortuneScale;
    private Date      fortuneYear;

    public HrCompany() {}

    public HrCompany(HrCompany value) {
        this.id = value.id;
        this.type = value.type;
        this.name = value.name;
        this.introduction = value.introduction;
        this.scale = value.scale;
        this.address = value.address;
        this.property = value.property;
        this.industry = value.industry;
        this.homepage = value.homepage;
        this.logo = value.logo;
        this.abbreviation = value.abbreviation;
        this.impression = value.impression;
        this.banner = value.banner;
        this.parentId = value.parentId;
        this.hraccountId = value.hraccountId;
        this.disable = value.disable;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
        this.source = value.source;
        this.slogan = value.slogan;
        this.feature = value.feature;
        this.fortune = value.fortune;
        this.fortuneScale = value.fortuneScale;
        this.fortuneYear = value.fortuneYear;
    }

    public HrCompany(
        Integer   id,
        Byte      type,
        String    name,
        String    introduction,
        Byte      scale,
        String    address,
        Byte      property,
        String    industry,
        String    homepage,
        String    logo,
        String    abbreviation,
        String    impression,
        String    banner,
        Integer   parentId,
        Integer   hraccountId,
        Byte      disable,
        Timestamp createTime,
        Timestamp updateTime,
        Byte      source,
        String    slogan,
        String    feature,
        Byte      fortune,
        Byte      fortuneScale,
        Date      fortuneYear
    ) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.introduction = introduction;
        this.scale = scale;
        this.address = address;
        this.property = property;
        this.industry = industry;
        this.homepage = homepage;
        this.logo = logo;
        this.abbreviation = abbreviation;
        this.impression = impression;
        this.banner = banner;
        this.parentId = parentId;
        this.hraccountId = hraccountId;
        this.disable = disable;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.source = source;
        this.slogan = slogan;
        this.feature = feature;
        this.fortune = fortune;
        this.fortuneScale = fortuneScale;
        this.fortuneYear = fortuneYear;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getType() {
        return this.type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduction() {
        return this.introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Byte getScale() {
        return this.scale;
    }

    public void setScale(Byte scale) {
        this.scale = scale;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Byte getProperty() {
        return this.property;
    }

    public void setProperty(Byte property) {
        this.property = property;
    }

    public String getIndustry() {
        return this.industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getHomepage() {
        return this.homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public String getLogo() {
        return this.logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getAbbreviation() {
        return this.abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getImpression() {
        return this.impression;
    }

    public void setImpression(String impression) {
        this.impression = impression;
    }

    public String getBanner() {
        return this.banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public Integer getParentId() {
        return this.parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getHraccountId() {
        return this.hraccountId;
    }

    public void setHraccountId(Integer hraccountId) {
        this.hraccountId = hraccountId;
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

    public Byte getSource() {
        return this.source;
    }

    public void setSource(Byte source) {
        this.source = source;
    }

    public String getSlogan() {
        return this.slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getFeature() {
        return this.feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public Byte getFortune() {
        return this.fortune;
    }

    public void setFortune(Byte fortune) {
        this.fortune = fortune;
    }

    public Byte getFortuneScale() {
        return this.fortuneScale;
    }

    public void setFortuneScale(Byte fortuneScale) {
        this.fortuneScale = fortuneScale;
    }

    public Date getFortuneYear() {
        return this.fortuneYear;
    }

    public void setFortuneYear(Date fortuneYear) {
        this.fortuneYear = fortuneYear;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("HrCompany (");

        sb.append(id);
        sb.append(", ").append(type);
        sb.append(", ").append(name);
        sb.append(", ").append(introduction);
        sb.append(", ").append(scale);
        sb.append(", ").append(address);
        sb.append(", ").append(property);
        sb.append(", ").append(industry);
        sb.append(", ").append(homepage);
        sb.append(", ").append(logo);
        sb.append(", ").append(abbreviation);
        sb.append(", ").append(impression);
        sb.append(", ").append(banner);
        sb.append(", ").append(parentId);
        sb.append(", ").append(hraccountId);
        sb.append(", ").append(disable);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(source);
        sb.append(", ").append(slogan);
        sb.append(", ").append(feature);
        sb.append(", ").append(fortune);
        sb.append(", ").append(fortuneScale);
        sb.append(", ").append(fortuneYear);

        sb.append(")");
        return sb.toString();
    }
}
