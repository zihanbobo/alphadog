/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.userdb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 用户表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserUser implements Serializable {

    private static final long serialVersionUID = 969910713;

    private Integer   id;
    private String    countryCode;
    private String    username;
    private String    password;
    private Byte      isDisable;
    private Integer   rank;
    private Timestamp registerTime;
    private String    registerIp;
    private Timestamp lastLoginTime;
    private String    lastLoginIp;
    private Integer   loginCount;
    private Long      mobile;
    private String    email;
    private Byte      activation;
    private String    activationCode;
    private String    token;
    private String    name;
    private String    headimg;
    private Integer   nationalCodeId;
    private Integer   wechatId;
    private String    unionid;
    private Short     source;
    private String    company;
    private String    position;
    private Integer   parentid;
    private String    nickname;
    private Byte      emailVerified;
    private Timestamp updateTime;

    public UserUser() {}

    public UserUser(UserUser value) {
        this.id = value.id;
        this.countryCode = value.countryCode;
        this.username = value.username;
        this.password = value.password;
        this.isDisable = value.isDisable;
        this.rank = value.rank;
        this.registerTime = value.registerTime;
        this.registerIp = value.registerIp;
        this.lastLoginTime = value.lastLoginTime;
        this.lastLoginIp = value.lastLoginIp;
        this.loginCount = value.loginCount;
        this.mobile = value.mobile;
        this.email = value.email;
        this.activation = value.activation;
        this.activationCode = value.activationCode;
        this.token = value.token;
        this.name = value.name;
        this.headimg = value.headimg;
        this.nationalCodeId = value.nationalCodeId;
        this.wechatId = value.wechatId;
        this.unionid = value.unionid;
        this.source = value.source;
        this.company = value.company;
        this.position = value.position;
        this.parentid = value.parentid;
        this.nickname = value.nickname;
        this.emailVerified = value.emailVerified;
        this.updateTime = value.updateTime;
    }

    public UserUser(
        Integer   id,
        String    countryCode,
        String    username,
        String    password,
        Byte      isDisable,
        Integer   rank,
        Timestamp registerTime,
        String    registerIp,
        Timestamp lastLoginTime,
        String    lastLoginIp,
        Integer   loginCount,
        Long      mobile,
        String    email,
        Byte      activation,
        String    activationCode,
        String    token,
        String    name,
        String    headimg,
        Integer   nationalCodeId,
        Integer   wechatId,
        String    unionid,
        Short     source,
        String    company,
        String    position,
        Integer   parentid,
        String    nickname,
        Byte      emailVerified,
        Timestamp updateTime
    ) {
        this.id = id;
        this.countryCode = countryCode;
        this.username = username;
        this.password = password;
        this.isDisable = isDisable;
        this.rank = rank;
        this.registerTime = registerTime;
        this.registerIp = registerIp;
        this.lastLoginTime = lastLoginTime;
        this.lastLoginIp = lastLoginIp;
        this.loginCount = loginCount;
        this.mobile = mobile;
        this.email = email;
        this.activation = activation;
        this.activationCode = activationCode;
        this.token = token;
        this.name = name;
        this.headimg = headimg;
        this.nationalCodeId = nationalCodeId;
        this.wechatId = wechatId;
        this.unionid = unionid;
        this.source = source;
        this.company = company;
        this.position = position;
        this.parentid = parentid;
        this.nickname = nickname;
        this.emailVerified = emailVerified;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Byte getIsDisable() {
        return this.isDisable;
    }

    public void setIsDisable(Byte isDisable) {
        this.isDisable = isDisable;
    }

    public Integer getRank() {
        return this.rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Timestamp getRegisterTime() {
        return this.registerTime;
    }

    public void setRegisterTime(Timestamp registerTime) {
        this.registerTime = registerTime;
    }

    public String getRegisterIp() {
        return this.registerIp;
    }

    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp;
    }

    public Timestamp getLastLoginTime() {
        return this.lastLoginTime;
    }

    public void setLastLoginTime(Timestamp lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getLastLoginIp() {
        return this.lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public Integer getLoginCount() {
        return this.loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    public Long getMobile() {
        return this.mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Byte getActivation() {
        return this.activation;
    }

    public void setActivation(Byte activation) {
        this.activation = activation;
    }

    public String getActivationCode() {
        return this.activationCode;
    }

    public void setActivationCode(String activationCode) {
        this.activationCode = activationCode;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeadimg() {
        return this.headimg;
    }

    public void setHeadimg(String headimg) {
        this.headimg = headimg;
    }

    public Integer getNationalCodeId() {
        return this.nationalCodeId;
    }

    public void setNationalCodeId(Integer nationalCodeId) {
        this.nationalCodeId = nationalCodeId;
    }

    public Integer getWechatId() {
        return this.wechatId;
    }

    public void setWechatId(Integer wechatId) {
        this.wechatId = wechatId;
    }

    public String getUnionid() {
        return this.unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public Short getSource() {
        return this.source;
    }

    public void setSource(Short source) {
        this.source = source;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getParentid() {
        return this.parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Byte getEmailVerified() {
        return this.emailVerified;
    }

    public void setEmailVerified(Byte emailVerified) {
        this.emailVerified = emailVerified;
    }

    public Timestamp getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserUser (");

        sb.append(id);
        sb.append(", ").append(countryCode);
        sb.append(", ").append(username);
        sb.append(", ").append(password);
        sb.append(", ").append(isDisable);
        sb.append(", ").append(rank);
        sb.append(", ").append(registerTime);
        sb.append(", ").append(registerIp);
        sb.append(", ").append(lastLoginTime);
        sb.append(", ").append(lastLoginIp);
        sb.append(", ").append(loginCount);
        sb.append(", ").append(mobile);
        sb.append(", ").append(email);
        sb.append(", ").append(activation);
        sb.append(", ").append(activationCode);
        sb.append(", ").append(token);
        sb.append(", ").append(name);
        sb.append(", ").append(headimg);
        sb.append(", ").append(nationalCodeId);
        sb.append(", ").append(wechatId);
        sb.append(", ").append(unionid);
        sb.append(", ").append(source);
        sb.append(", ").append(company);
        sb.append(", ").append(position);
        sb.append(", ").append(parentid);
        sb.append(", ").append(nickname);
        sb.append(", ").append(emailVerified);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}
