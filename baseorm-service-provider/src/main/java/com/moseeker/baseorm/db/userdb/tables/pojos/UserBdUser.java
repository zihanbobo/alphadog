/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.userdb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 百度用户信息表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserBdUser implements Serializable {

    private static final long serialVersionUID = -118686137;

    private Long      id;
    private Long      uid;
    private Integer   userId;
    private String    username;
    private Integer   sex;
    private String    headimgurl;
    private Timestamp createTime;
    private Timestamp updateTime;

    public UserBdUser() {}

    public UserBdUser(UserBdUser value) {
        this.id = value.id;
        this.uid = value.uid;
        this.userId = value.userId;
        this.username = value.username;
        this.sex = value.sex;
        this.headimgurl = value.headimgurl;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
    }

    public UserBdUser(
        Long      id,
        Long      uid,
        Integer   userId,
        String    username,
        Integer   sex,
        String    headimgurl,
        Timestamp createTime,
        Timestamp updateTime
    ) {
        this.id = id;
        this.uid = uid;
        this.userId = userId;
        this.username = username;
        this.sex = sex;
        this.headimgurl = headimgurl;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUid() {
        return this.uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getSex() {
        return this.sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getHeadimgurl() {
        return this.headimgurl;
    }

    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl;
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
        StringBuilder sb = new StringBuilder("UserBdUser (");

        sb.append(id);
        sb.append(", ").append(uid);
        sb.append(", ").append(userId);
        sb.append(", ").append(username);
        sb.append(", ").append(sex);
        sb.append(", ").append(headimgurl);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}
