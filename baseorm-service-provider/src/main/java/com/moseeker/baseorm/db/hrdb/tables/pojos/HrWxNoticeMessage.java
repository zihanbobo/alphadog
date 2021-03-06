/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.pojos;


import java.io.Serializable;
import java.sql.Date;

import javax.annotation.Generated;


/**
 * 微信消息通知, first和remark文案暂不使用
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrWxNoticeMessage implements Serializable {

    private static final long serialVersionUID = -987571876;

    private Integer id;
    private Integer wechatId;
    private Integer noticeId;
    private String  first;
    private String  remark;
    private Byte    status;
    private Byte    disable;
    private String  sendFrequency;
    private Date    sentDate;

    public HrWxNoticeMessage() {}

    public HrWxNoticeMessage(HrWxNoticeMessage value) {
        this.id = value.id;
        this.wechatId = value.wechatId;
        this.noticeId = value.noticeId;
        this.first = value.first;
        this.remark = value.remark;
        this.status = value.status;
        this.disable = value.disable;
        this.sendFrequency = value.sendFrequency;
        this.sentDate = value.sentDate;
    }

    public HrWxNoticeMessage(
        Integer id,
        Integer wechatId,
        Integer noticeId,
        String  first,
        String  remark,
        Byte    status,
        Byte    disable,
        String  sendFrequency,
        Date    sentDate
    ) {
        this.id = id;
        this.wechatId = wechatId;
        this.noticeId = noticeId;
        this.first = first;
        this.remark = remark;
        this.status = status;
        this.disable = disable;
        this.sendFrequency = sendFrequency;
        this.sentDate = sentDate;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWechatId() {
        return this.wechatId;
    }

    public void setWechatId(Integer wechatId) {
        this.wechatId = wechatId;
    }

    public Integer getNoticeId() {
        return this.noticeId;
    }

    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    public String getFirst() {
        return this.first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Byte getStatus() {
        return this.status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getDisable() {
        return this.disable;
    }

    public void setDisable(Byte disable) {
        this.disable = disable;
    }

    public String getSendFrequency() {
        return this.sendFrequency;
    }

    public void setSendFrequency(String sendFrequency) {
        this.sendFrequency = sendFrequency;
    }

    public Date getSentDate() {
        return this.sentDate;
    }

    public void setSentDate(Date sentDate) {
        this.sentDate = sentDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("HrWxNoticeMessage (");

        sb.append(id);
        sb.append(", ").append(wechatId);
        sb.append(", ").append(noticeId);
        sb.append(", ").append(first);
        sb.append(", ").append(remark);
        sb.append(", ").append(status);
        sb.append(", ").append(disable);
        sb.append(", ").append(sendFrequency);
        sb.append(", ").append(sentDate);

        sb.append(")");
        return sb.toString();
    }
}
