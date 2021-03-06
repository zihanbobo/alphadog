/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.userdb.tables.pojos;


import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 员工和候选人聊天的通知配置
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserChatTemplateMsg implements Serializable {

    private static final long serialVersionUID = 1742064507;

    private Integer   id;
    private Integer   companyId;
    private Integer   userId;
    private Integer   employeeId;
    private Byte      recvSwitch;
    private Date      sentDate;
    private Timestamp createTime;
    private Timestamp updateTime;

    public UserChatTemplateMsg() {}

    public UserChatTemplateMsg(UserChatTemplateMsg value) {
        this.id = value.id;
        this.companyId = value.companyId;
        this.userId = value.userId;
        this.employeeId = value.employeeId;
        this.recvSwitch = value.recvSwitch;
        this.sentDate = value.sentDate;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
    }

    public UserChatTemplateMsg(
        Integer   id,
        Integer   companyId,
        Integer   userId,
        Integer   employeeId,
        Byte      recvSwitch,
        Date      sentDate,
        Timestamp createTime,
        Timestamp updateTime
    ) {
        this.id = id;
        this.companyId = companyId;
        this.userId = userId;
        this.employeeId = employeeId;
        this.recvSwitch = recvSwitch;
        this.sentDate = sentDate;
        this.createTime = createTime;
        this.updateTime = updateTime;
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

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Byte getRecvSwitch() {
        return this.recvSwitch;
    }

    public void setRecvSwitch(Byte recvSwitch) {
        this.recvSwitch = recvSwitch;
    }

    public Date getSentDate() {
        return this.sentDate;
    }

    public void setSentDate(Date sentDate) {
        this.sentDate = sentDate;
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
        StringBuilder sb = new StringBuilder("UserChatTemplateMsg (");

        sb.append(id);
        sb.append(", ").append(companyId);
        sb.append(", ").append(userId);
        sb.append(", ").append(employeeId);
        sb.append(", ").append(recvSwitch);
        sb.append(", ").append(sentDate);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}
