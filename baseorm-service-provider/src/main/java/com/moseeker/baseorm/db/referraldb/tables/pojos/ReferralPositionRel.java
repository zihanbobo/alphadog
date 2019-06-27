/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.referraldb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ReferralPositionRel implements Serializable {

    private static final long serialVersionUID = -689843379;

    private Integer   id;
    private Integer   positionId;
    private Integer   companyId;
    private Timestamp createTime;
    private Timestamp updateTime;

    public ReferralPositionRel() {}

    public ReferralPositionRel(ReferralPositionRel value) {
        this.id = value.id;
        this.positionId = value.positionId;
        this.companyId = value.companyId;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
    }

    public ReferralPositionRel(
        Integer   id,
        Integer   positionId,
        Integer   companyId,
        Timestamp createTime,
        Timestamp updateTime
    ) {
        this.id = id;
        this.positionId = positionId;
        this.companyId = companyId;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPositionId() {
        return this.positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public Integer getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
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
        StringBuilder sb = new StringBuilder("ReferralPositionRel (");

        sb.append(id);
        sb.append(", ").append(positionId);
        sb.append(", ").append(companyId);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}