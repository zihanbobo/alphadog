/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.logdb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 模板消息发送结果记录表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LogWxMessageRecord implements Serializable {

    private static final long serialVersionUID = 1183133879;

    private Integer   id;
    private Integer   templateId;
    private Integer   wechatId;
    private Long      msgid;
    private String    openId;
    private String    url;
    private String    topcolor;
    private String    jsondata;
    private Integer   errcode;
    private String    errmsg;
    private Timestamp sendtime;
    private Timestamp updatetime;
    private String    sendstatus;
    private Integer   sendtype;
    private String    accessToken;

    public LogWxMessageRecord() {}

    public LogWxMessageRecord(LogWxMessageRecord value) {
        this.id = value.id;
        this.templateId = value.templateId;
        this.wechatId = value.wechatId;
        this.msgid = value.msgid;
        this.openId = value.openId;
        this.url = value.url;
        this.topcolor = value.topcolor;
        this.jsondata = value.jsondata;
        this.errcode = value.errcode;
        this.errmsg = value.errmsg;
        this.sendtime = value.sendtime;
        this.updatetime = value.updatetime;
        this.sendstatus = value.sendstatus;
        this.sendtype = value.sendtype;
        this.accessToken = value.accessToken;
    }

    public LogWxMessageRecord(
        Integer   id,
        Integer   templateId,
        Integer   wechatId,
        Long      msgid,
        String    openId,
        String    url,
        String    topcolor,
        String    jsondata,
        Integer   errcode,
        String    errmsg,
        Timestamp sendtime,
        Timestamp updatetime,
        String    sendstatus,
        Integer   sendtype,
        String    accessToken
    ) {
        this.id = id;
        this.templateId = templateId;
        this.wechatId = wechatId;
        this.msgid = msgid;
        this.openId = openId;
        this.url = url;
        this.topcolor = topcolor;
        this.jsondata = jsondata;
        this.errcode = errcode;
        this.errmsg = errmsg;
        this.sendtime = sendtime;
        this.updatetime = updatetime;
        this.sendstatus = sendstatus;
        this.sendtype = sendtype;
        this.accessToken = accessToken;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTemplateId() {
        return this.templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public Integer getWechatId() {
        return this.wechatId;
    }

    public void setWechatId(Integer wechatId) {
        this.wechatId = wechatId;
    }

    public Long getMsgid() {
        return this.msgid;
    }

    public void setMsgid(Long msgid) {
        this.msgid = msgid;
    }

    public String getOpenId() {
        return this.openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTopcolor() {
        return this.topcolor;
    }

    public void setTopcolor(String topcolor) {
        this.topcolor = topcolor;
    }

    public String getJsondata() {
        return this.jsondata;
    }

    public void setJsondata(String jsondata) {
        this.jsondata = jsondata;
    }

    public Integer getErrcode() {
        return this.errcode;
    }

    public void setErrcode(Integer errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return this.errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public Timestamp getSendtime() {
        return this.sendtime;
    }

    public void setSendtime(Timestamp sendtime) {
        this.sendtime = sendtime;
    }

    public Timestamp getUpdatetime() {
        return this.updatetime;
    }

    public void setUpdatetime(Timestamp updatetime) {
        this.updatetime = updatetime;
    }

    public String getSendstatus() {
        return this.sendstatus;
    }

    public void setSendstatus(String sendstatus) {
        this.sendstatus = sendstatus;
    }

    public Integer getSendtype() {
        return this.sendtype;
    }

    public void setSendtype(Integer sendtype) {
        this.sendtype = sendtype;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("LogWxMessageRecord (");

        sb.append(id);
        sb.append(", ").append(templateId);
        sb.append(", ").append(wechatId);
        sb.append(", ").append(msgid);
        sb.append(", ").append(openId);
        sb.append(", ").append(url);
        sb.append(", ").append(topcolor);
        sb.append(", ").append(jsondata);
        sb.append(", ").append(errcode);
        sb.append(", ").append(errmsg);
        sb.append(", ").append(sendtime);
        sb.append(", ").append(updatetime);
        sb.append(", ").append(sendstatus);
        sb.append(", ").append(sendtype);
        sb.append(", ").append(accessToken);

        sb.append(")");
        return sb.toString();
    }
}
