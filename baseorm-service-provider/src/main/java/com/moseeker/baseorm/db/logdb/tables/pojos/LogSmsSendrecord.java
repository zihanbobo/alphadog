/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.logdb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 短信发送记录表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LogSmsSendrecord implements Serializable {

    private static final long serialVersionUID = -1485973859;

    private Integer   id;
    private String    countryCode;
    private Byte      sys;
    private Long      mobile;
    private String    msg;
    private String    ip;
    private Timestamp createTime;

    public LogSmsSendrecord() {}

    public LogSmsSendrecord(LogSmsSendrecord value) {
        this.id = value.id;
        this.countryCode = value.countryCode;
        this.sys = value.sys;
        this.mobile = value.mobile;
        this.msg = value.msg;
        this.ip = value.ip;
        this.createTime = value.createTime;
    }

    public LogSmsSendrecord(
        Integer   id,
        String    countryCode,
        Byte      sys,
        Long      mobile,
        String    msg,
        String    ip,
        Timestamp createTime
    ) {
        this.id = id;
        this.countryCode = countryCode;
        this.sys = sys;
        this.mobile = mobile;
        this.msg = msg;
        this.ip = ip;
        this.createTime = createTime;
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

    public Byte getSys() {
        return this.sys;
    }

    public void setSys(Byte sys) {
        this.sys = sys;
    }

    public Long getMobile() {
        return this.mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("LogSmsSendrecord (");

        sb.append(id);
        sb.append(", ").append(countryCode);
        sb.append(", ").append(sys);
        sb.append(", ").append(mobile);
        sb.append(", ").append(msg);
        sb.append(", ").append(ip);
        sb.append(", ").append(createTime);

        sb.append(")");
        return sb.toString();
    }
}