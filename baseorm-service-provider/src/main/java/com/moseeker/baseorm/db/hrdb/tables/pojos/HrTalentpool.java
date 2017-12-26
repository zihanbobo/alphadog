/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 人才库
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrTalentpool implements Serializable {

    private static final long serialVersionUID = 1403861448;

    private Integer   id;
    private Integer   hrAccountId;
    private Integer   applierId;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Integer   status;

    public HrTalentpool() {}

    public HrTalentpool(HrTalentpool value) {
        this.id = value.id;
        this.hrAccountId = value.hrAccountId;
        this.applierId = value.applierId;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
        this.status = value.status;
    }

    public HrTalentpool(
        Integer   id,
        Integer   hrAccountId,
        Integer   applierId,
        Timestamp createTime,
        Timestamp updateTime,
        Integer   status
    ) {
        this.id = id;
        this.hrAccountId = hrAccountId;
        this.applierId = applierId;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.status = status;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHrAccountId() {
        return this.hrAccountId;
    }

    public void setHrAccountId(Integer hrAccountId) {
        this.hrAccountId = hrAccountId;
    }

    public Integer getApplierId() {
        return this.applierId;
    }

    public void setApplierId(Integer applierId) {
        this.applierId = applierId;
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

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("HrTalentpool (");

        sb.append(id);
        sb.append(", ").append(hrAccountId);
        sb.append(", ").append(applierId);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(status);

        sb.append(")");
        return sb.toString();
    }
}