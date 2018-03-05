/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 第三方账号和hr表关联表，账号分配表，取消分配将status置为0，重新分配不修改记录而是新加分配记录
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrThirdPartyAccountHr implements Serializable {

    private static final long serialVersionUID = -1855529811;

    private Integer   id;
    private Integer   thirdPartyAccountId;
    private Integer   hrAccountId;
    private Byte      status;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Short     channel;

    public HrThirdPartyAccountHr() {}

    public HrThirdPartyAccountHr(HrThirdPartyAccountHr value) {
        this.id = value.id;
        this.thirdPartyAccountId = value.thirdPartyAccountId;
        this.hrAccountId = value.hrAccountId;
        this.status = value.status;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
        this.channel = value.channel;
    }

    public HrThirdPartyAccountHr(
        Integer   id,
        Integer   thirdPartyAccountId,
        Integer   hrAccountId,
        Byte      status,
        Timestamp createTime,
        Timestamp updateTime,
        Short     channel
    ) {
        this.id = id;
        this.thirdPartyAccountId = thirdPartyAccountId;
        this.hrAccountId = hrAccountId;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.channel = channel;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getThirdPartyAccountId() {
        return this.thirdPartyAccountId;
    }

    public void setThirdPartyAccountId(Integer thirdPartyAccountId) {
        this.thirdPartyAccountId = thirdPartyAccountId;
    }

    public Integer getHrAccountId() {
        return this.hrAccountId;
    }

    public void setHrAccountId(Integer hrAccountId) {
        this.hrAccountId = hrAccountId;
    }

    public Byte getStatus() {
        return this.status;
    }

    public void setStatus(Byte status) {
        this.status = status;
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

    public Short getChannel() {
        return this.channel;
    }

    public void setChannel(Short channel) {
        this.channel = channel;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("HrThirdPartyAccountHr (");

        sb.append(id);
        sb.append(", ").append(thirdPartyAccountId);
        sb.append(", ").append(hrAccountId);
        sb.append(", ").append(status);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(channel);

        sb.append(")");
        return sb.toString();
    }
}
