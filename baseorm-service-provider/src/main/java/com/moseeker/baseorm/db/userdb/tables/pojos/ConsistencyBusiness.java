/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.userdb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 消息业务表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ConsistencyBusiness implements Serializable {

    private static final long serialVersionUID = -1464256488;

    private Integer   id;
    private Timestamp createTime;
    private Timestamp updateTime;
    private String    name;
    private Byte      finish;
    private String    messageId;

    public ConsistencyBusiness() {}

    public ConsistencyBusiness(ConsistencyBusiness value) {
        this.id = value.id;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
        this.name = value.name;
        this.finish = value.finish;
        this.messageId = value.messageId;
    }

    public ConsistencyBusiness(
        Integer   id,
        Timestamp createTime,
        Timestamp updateTime,
        String    name,
        Byte      finish,
        String    messageId
    ) {
        this.id = id;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.name = name;
        this.finish = finish;
        this.messageId = messageId;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getFinish() {
        return this.finish;
    }

    public void setFinish(Byte finish) {
        this.finish = finish;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ConsistencyBusiness (");

        sb.append(id);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(name);
        sb.append(", ").append(finish);
        sb.append(", ").append(messageId);

        sb.append(")");
        return sb.toString();
    }
}