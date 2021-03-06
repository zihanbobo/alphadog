/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.profiledb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * Profile的技能
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProfileSkill implements Serializable {

    private static final long serialVersionUID = -1056701982;

    private Integer   id;
    private Integer   profileId;
    private String    name;
    private Byte      level;
    private Integer   month;
    private Timestamp createTime;
    private Timestamp updateTime;

    public ProfileSkill() {}

    public ProfileSkill(ProfileSkill value) {
        this.id = value.id;
        this.profileId = value.profileId;
        this.name = value.name;
        this.level = value.level;
        this.month = value.month;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
    }

    public ProfileSkill(
        Integer   id,
        Integer   profileId,
        String    name,
        Byte      level,
        Integer   month,
        Timestamp createTime,
        Timestamp updateTime
    ) {
        this.id = id;
        this.profileId = profileId;
        this.name = name;
        this.level = level;
        this.month = month;
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

    public Byte getLevel() {
        return this.level;
    }

    public void setLevel(Byte level) {
        this.level = level;
    }

    public Integer getMonth() {
        return this.month;
    }

    public void setMonth(Integer month) {
        this.month = month;
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
        StringBuilder sb = new StringBuilder("ProfileSkill (");

        sb.append(id);
        sb.append(", ").append(profileId);
        sb.append(", ").append(name);
        sb.append(", ").append(level);
        sb.append(", ").append(month);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}
