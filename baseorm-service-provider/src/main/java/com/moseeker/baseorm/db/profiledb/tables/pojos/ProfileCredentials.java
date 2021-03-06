/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.profiledb.tables.pojos;


import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * Profile的证书表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProfileCredentials implements Serializable {

    private static final long serialVersionUID = -475976505;

    private Integer   id;
    private Integer   profileId;
    private String    name;
    private String    organization;
    private String    code;
    private String    url;
    private Date      getDate;
    private String    score;
    private Timestamp createTime;
    private Timestamp updateTime;

    public ProfileCredentials() {}

    public ProfileCredentials(ProfileCredentials value) {
        this.id = value.id;
        this.profileId = value.profileId;
        this.name = value.name;
        this.organization = value.organization;
        this.code = value.code;
        this.url = value.url;
        this.getDate = value.getDate;
        this.score = value.score;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
    }

    public ProfileCredentials(
        Integer   id,
        Integer   profileId,
        String    name,
        String    organization,
        String    code,
        String    url,
        Date      getDate,
        String    score,
        Timestamp createTime,
        Timestamp updateTime
    ) {
        this.id = id;
        this.profileId = profileId;
        this.name = name;
        this.organization = organization;
        this.code = code;
        this.url = url;
        this.getDate = getDate;
        this.score = score;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProfileId() {
        return this.profileId;
    }

    public void setProfileId(Integer profileId) {
        this.profileId = profileId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrganization() {
        return this.organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getGetDate() {
        return this.getDate;
    }

    public void setGetDate(Date getDate) {
        this.getDate = getDate;
    }

    public String getScore() {
        return this.score;
    }

    public void setScore(String score) {
        this.score = score;
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
        StringBuilder sb = new StringBuilder("ProfileCredentials (");

        sb.append(id);
        sb.append(", ").append(profileId);
        sb.append(", ").append(name);
        sb.append(", ").append(organization);
        sb.append(", ").append(code);
        sb.append(", ").append(url);
        sb.append(", ").append(getDate);
        sb.append(", ").append(score);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}
