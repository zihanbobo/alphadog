/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.userdb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 微信用户表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserWxUser implements Serializable {

    private static final long serialVersionUID = 2075899077;

    private Long      id;
    private Integer   wechatId;
    private Integer   groupId;
    private Integer   sysuserId;
    private Byte      isSubscribe;
    private String    openid;
    private String    nickname;
    private Integer   sex;
    private String    city;
    private String    country;
    private String    province;
    private String    language;
    private String    headimgurl;
    private Timestamp subscribeTime;
    private Timestamp unsubscibeTime;
    private String    unionid;
    private Integer   reward;
    private Byte      autoSyncInfo;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Byte      source;

    public UserWxUser() {}

    public UserWxUser(UserWxUser value) {
        this.id = value.id;
        this.wechatId = value.wechatId;
        this.groupId = value.groupId;
        this.sysuserId = value.sysuserId;
        this.isSubscribe = value.isSubscribe;
        this.openid = value.openid;
        this.nickname = value.nickname;
        this.sex = value.sex;
        this.city = value.city;
        this.country = value.country;
        this.province = value.province;
        this.language = value.language;
        this.headimgurl = value.headimgurl;
        this.subscribeTime = value.subscribeTime;
        this.unsubscibeTime = value.unsubscibeTime;
        this.unionid = value.unionid;
        this.reward = value.reward;
        this.autoSyncInfo = value.autoSyncInfo;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
        this.source = value.source;
    }

    public UserWxUser(
        Long      id,
        Integer   wechatId,
        Integer   groupId,
        Integer   sysuserId,
        Byte      isSubscribe,
        String    openid,
        String    nickname,
        Integer   sex,
        String    city,
        String    country,
        String    province,
        String    language,
        String    headimgurl,
        Timestamp subscribeTime,
        Timestamp unsubscibeTime,
        String    unionid,
        Integer   reward,
        Byte      autoSyncInfo,
        Timestamp createTime,
        Timestamp updateTime,
        Byte      source
    ) {
        this.id = id;
        this.wechatId = wechatId;
        this.groupId = groupId;
        this.sysuserId = sysuserId;
        this.isSubscribe = isSubscribe;
        this.openid = openid;
        this.nickname = nickname;
        this.sex = sex;
        this.city = city;
        this.country = country;
        this.province = province;
        this.language = language;
        this.headimgurl = headimgurl;
        this.subscribeTime = subscribeTime;
        this.unsubscibeTime = unsubscibeTime;
        this.unionid = unionid;
        this.reward = reward;
        this.autoSyncInfo = autoSyncInfo;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.source = source;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getWechatId() {
        return this.wechatId;
    }

    public void setWechatId(Integer wechatId) {
        this.wechatId = wechatId;
    }

    public Integer getGroupId() {
        return this.groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getSysuserId() {
        return this.sysuserId;
    }

    public void setSysuserId(Integer sysuserId) {
        this.sysuserId = sysuserId;
    }

    public Byte getIsSubscribe() {
        return this.isSubscribe;
    }

    public void setIsSubscribe(Byte isSubscribe) {
        this.isSubscribe = isSubscribe;
    }

    public String getOpenid() {
        return this.openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getSex() {
        return this.sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return this.province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getHeadimgurl() {
        return this.headimgurl;
    }

    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl;
    }

    public Timestamp getSubscribeTime() {
        return this.subscribeTime;
    }

    public void setSubscribeTime(Timestamp subscribeTime) {
        this.subscribeTime = subscribeTime;
    }

    public Timestamp getUnsubscibeTime() {
        return this.unsubscibeTime;
    }

    public void setUnsubscibeTime(Timestamp unsubscibeTime) {
        this.unsubscibeTime = unsubscibeTime;
    }

    public String getUnionid() {
        return this.unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public Integer getReward() {
        return this.reward;
    }

    public void setReward(Integer reward) {
        this.reward = reward;
    }

    public Byte getAutoSyncInfo() {
        return this.autoSyncInfo;
    }

    public void setAutoSyncInfo(Byte autoSyncInfo) {
        this.autoSyncInfo = autoSyncInfo;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserWxUser (");

        sb.append(id);
        sb.append(", ").append(wechatId);
        sb.append(", ").append(groupId);
        sb.append(", ").append(sysuserId);
        sb.append(", ").append(isSubscribe);
        sb.append(", ").append(openid);
        sb.append(", ").append(nickname);
        sb.append(", ").append(sex);
        sb.append(", ").append(city);
        sb.append(", ").append(country);
        sb.append(", ").append(province);
        sb.append(", ").append(language);
        sb.append(", ").append(headimgurl);
        sb.append(", ").append(subscribeTime);
        sb.append(", ").append(unsubscibeTime);
        sb.append(", ").append(unionid);
        sb.append(", ").append(reward);
        sb.append(", ").append(autoSyncInfo);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(source);

        sb.append(")");
        return sb.toString();
    }
}
