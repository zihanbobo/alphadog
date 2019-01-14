/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.redpacketdb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 红包记录和职位的相关记录
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RedpacketRedpacketPosition implements Serializable {

    private static final long serialVersionUID = 946939707;

    private Integer   id;
    private Integer   redpacketLogId;
    private Integer   positionId;
    private Timestamp createTime;
    private Timestamp updateTime;

    public RedpacketRedpacketPosition() {}

    public RedpacketRedpacketPosition(RedpacketRedpacketPosition value) {
        this.id = value.id;
        this.redpacketLogId = value.redpacketLogId;
        this.positionId = value.positionId;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
    }

    public RedpacketRedpacketPosition(
        Integer   id,
        Integer   redpacketLogId,
        Integer   positionId,
        Timestamp createTime,
        Timestamp updateTime
    ) {
        this.id = id;
        this.redpacketLogId = redpacketLogId;
        this.positionId = positionId;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRedpacketLogId() {
        return this.redpacketLogId;
    }

    public void setRedpacketLogId(Integer redpacketLogId) {
        this.redpacketLogId = redpacketLogId;
    }

    public Integer getPositionId() {
        return this.positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
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
        StringBuilder sb = new StringBuilder("RedpacketRedpacketPosition (");

        sb.append(id);
        sb.append(", ").append(redpacketLogId);
        sb.append(", ").append(positionId);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}
