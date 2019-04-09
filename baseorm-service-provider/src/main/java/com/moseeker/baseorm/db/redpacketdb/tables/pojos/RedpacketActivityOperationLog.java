/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.redpacketdb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 红包活动变更记录
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RedpacketActivityOperationLog implements Serializable {

    private static final long serialVersionUID = -196770321;

    private Integer   id;
    private Integer   activityId;
    private Byte      type;
    private Integer   userId;
    private String    desc;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Integer   storage;

    public RedpacketActivityOperationLog() {}

    public RedpacketActivityOperationLog(RedpacketActivityOperationLog value) {
        this.id = value.id;
        this.activityId = value.activityId;
        this.type = value.type;
        this.userId = value.userId;
        this.desc = value.desc;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
        this.storage = value.storage;
    }

    public RedpacketActivityOperationLog(
        Integer   id,
        Integer   activityId,
        Byte      type,
        Integer   userId,
        String    desc,
        Timestamp createTime,
        Timestamp updateTime,
        Integer   storage
    ) {
        this.id = id;
        this.activityId = activityId;
        this.type = type;
        this.userId = userId;
        this.desc = desc;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.storage = storage;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActivityId() {
        return this.activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Byte getType() {
        return this.type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
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

    public Integer getStorage() {
        return this.storage;
    }

    public void setStorage(Integer storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RedpacketActivityOperationLog (");

        sb.append(id);
        sb.append(", ").append(activityId);
        sb.append(", ").append(type);
        sb.append(", ").append(userId);
        sb.append(", ").append(desc);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(storage);

        sb.append(")");
        return sb.toString();
    }
}