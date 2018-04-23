/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrWxWechat_20180127chendi implements Serializable {

    private static final long serialVersionUID = 222577003;

    private Integer   id;
    private Integer   companyId;
    private Byte      type;
    private String    signature;
    private String    name;
    private String    alias;
    private String    username;
    private String    password;
    private String    token;
    private String    appid;
    private String    secret;
    private Integer   welcome;
    private Integer   default_;
    private String    qrcode;
    private Byte      passiveSeeker;
    private Byte      thirdOauth;
    private Byte      hrRegister;
    private Integer   accessTokenCreateTime;
    private Integer   accessTokenExpired;
    private String    accessToken;
    private String    jsapiTicket;
    private Byte      authorized;
    private Integer   unauthorizedTime;
    private String    authorizerRefreshToken;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Integer   showQxQrcode;
    private Integer   showCustomTheme;

    public HrWxWechat_20180127chendi() {}

    public HrWxWechat_20180127chendi(HrWxWechat_20180127chendi value) {
        this.id = value.id;
        this.companyId = value.companyId;
        this.type = value.type;
        this.signature = value.signature;
        this.name = value.name;
        this.alias = value.alias;
        this.username = value.username;
        this.password = value.password;
        this.token = value.token;
        this.appid = value.appid;
        this.secret = value.secret;
        this.welcome = value.welcome;
        this.default_ = value.default_;
        this.qrcode = value.qrcode;
        this.passiveSeeker = value.passiveSeeker;
        this.thirdOauth = value.thirdOauth;
        this.hrRegister = value.hrRegister;
        this.accessTokenCreateTime = value.accessTokenCreateTime;
        this.accessTokenExpired = value.accessTokenExpired;
        this.accessToken = value.accessToken;
        this.jsapiTicket = value.jsapiTicket;
        this.authorized = value.authorized;
        this.unauthorizedTime = value.unauthorizedTime;
        this.authorizerRefreshToken = value.authorizerRefreshToken;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
        this.showQxQrcode = value.showQxQrcode;
        this.showCustomTheme = value.showCustomTheme;
    }

    public HrWxWechat_20180127chendi(
        Integer   id,
        Integer   companyId,
        Byte      type,
        String    signature,
        String    name,
        String    alias,
        String    username,
        String    password,
        String    token,
        String    appid,
        String    secret,
        Integer   welcome,
        Integer   default_,
        String    qrcode,
        Byte      passiveSeeker,
        Byte      thirdOauth,
        Byte      hrRegister,
        Integer   accessTokenCreateTime,
        Integer   accessTokenExpired,
        String    accessToken,
        String    jsapiTicket,
        Byte      authorized,
        Integer   unauthorizedTime,
        String    authorizerRefreshToken,
        Timestamp createTime,
        Timestamp updateTime,
        Integer   showQxQrcode,
        Integer   showCustomTheme
    ) {
        this.id = id;
        this.companyId = companyId;
        this.type = type;
        this.signature = signature;
        this.name = name;
        this.alias = alias;
        this.username = username;
        this.password = password;
        this.token = token;
        this.appid = appid;
        this.secret = secret;
        this.welcome = welcome;
        this.default_ = default_;
        this.qrcode = qrcode;
        this.passiveSeeker = passiveSeeker;
        this.thirdOauth = thirdOauth;
        this.hrRegister = hrRegister;
        this.accessTokenCreateTime = accessTokenCreateTime;
        this.accessTokenExpired = accessTokenExpired;
        this.accessToken = accessToken;
        this.jsapiTicket = jsapiTicket;
        this.authorized = authorized;
        this.unauthorizedTime = unauthorizedTime;
        this.authorizerRefreshToken = authorizerRefreshToken;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.showQxQrcode = showQxQrcode;
        this.showCustomTheme = showCustomTheme;
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

    public Byte getType() {
        return this.type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getSignature() {
        return this.signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return this.alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
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

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getAppid() {
        return this.appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getSecret() {
        return this.secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public Integer getWelcome() {
        return this.welcome;
    }

    public void setWelcome(Integer welcome) {
        this.welcome = welcome;
    }

    public Integer getDefault() {
        return this.default_;
    }

    public void setDefault(Integer default_) {
        this.default_ = default_;
    }

    public String getQrcode() {
        return this.qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }

    public Byte getPassiveSeeker() {
        return this.passiveSeeker;
    }

    public void setPassiveSeeker(Byte passiveSeeker) {
        this.passiveSeeker = passiveSeeker;
    }

    public Byte getThirdOauth() {
        return this.thirdOauth;
    }

    public void setThirdOauth(Byte thirdOauth) {
        this.thirdOauth = thirdOauth;
    }

    public Byte getHrRegister() {
        return this.hrRegister;
    }

    public void setHrRegister(Byte hrRegister) {
        this.hrRegister = hrRegister;
    }

    public Integer getAccessTokenCreateTime() {
        return this.accessTokenCreateTime;
    }

    public void setAccessTokenCreateTime(Integer accessTokenCreateTime) {
        this.accessTokenCreateTime = accessTokenCreateTime;
    }

    public Integer getAccessTokenExpired() {
        return this.accessTokenExpired;
    }

    public void setAccessTokenExpired(Integer accessTokenExpired) {
        this.accessTokenExpired = accessTokenExpired;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getJsapiTicket() {
        return this.jsapiTicket;
    }

    public void setJsapiTicket(String jsapiTicket) {
        this.jsapiTicket = jsapiTicket;
    }

    public Byte getAuthorized() {
        return this.authorized;
    }

    public void setAuthorized(Byte authorized) {
        this.authorized = authorized;
    }

    public Integer getUnauthorizedTime() {
        return this.unauthorizedTime;
    }

    public void setUnauthorizedTime(Integer unauthorizedTime) {
        this.unauthorizedTime = unauthorizedTime;
    }

    public String getAuthorizerRefreshToken() {
        return this.authorizerRefreshToken;
    }

    public void setAuthorizerRefreshToken(String authorizerRefreshToken) {
        this.authorizerRefreshToken = authorizerRefreshToken;
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

    public Integer getShowQxQrcode() {
        return this.showQxQrcode;
    }

    public void setShowQxQrcode(Integer showQxQrcode) {
        this.showQxQrcode = showQxQrcode;
    }

    public Integer getShowCustomTheme() {
        return this.showCustomTheme;
    }

    public void setShowCustomTheme(Integer showCustomTheme) {
        this.showCustomTheme = showCustomTheme;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("HrWxWechat_20180127chendi (");

        sb.append(id);
        sb.append(", ").append(companyId);
        sb.append(", ").append(type);
        sb.append(", ").append(signature);
        sb.append(", ").append(name);
        sb.append(", ").append(alias);
        sb.append(", ").append(username);
        sb.append(", ").append(password);
        sb.append(", ").append(token);
        sb.append(", ").append(appid);
        sb.append(", ").append(secret);
        sb.append(", ").append(welcome);
        sb.append(", ").append(default_);
        sb.append(", ").append(qrcode);
        sb.append(", ").append(passiveSeeker);
        sb.append(", ").append(thirdOauth);
        sb.append(", ").append(hrRegister);
        sb.append(", ").append(accessTokenCreateTime);
        sb.append(", ").append(accessTokenExpired);
        sb.append(", ").append(accessToken);
        sb.append(", ").append(jsapiTicket);
        sb.append(", ").append(authorized);
        sb.append(", ").append(unauthorizedTime);
        sb.append(", ").append(authorizerRefreshToken);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(showQxQrcode);
        sb.append(", ").append(showCustomTheme);

        sb.append(")");
        return sb.toString();
    }
}
