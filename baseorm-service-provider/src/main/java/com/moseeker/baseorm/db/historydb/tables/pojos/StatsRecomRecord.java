/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.historydb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 推荐记录表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StatsRecomRecord implements Serializable {

    private static final long serialVersionUID = -1528061090;

    private Integer   id;
    private Integer   positionId;
    private Integer   appId;
    private Integer   presenteeId;
    private Timestamp clickTime;
    private Integer   depth;
    private Integer   recomId_2;
    private Integer   recomId;
    private String    realname;
    private String    company;
    private String    position;
    private String    recomReason;
    private Timestamp recomTime;
    private Integer   isRecom;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Integer   lastRecomId;

    public StatsRecomRecord() {}

    public StatsRecomRecord(StatsRecomRecord value) {
        this.id = value.id;
        this.positionId = value.positionId;
        this.appId = value.appId;
        this.presenteeId = value.presenteeId;
        this.clickTime = value.clickTime;
        this.depth = value.depth;
        this.recomId_2 = value.recomId_2;
        this.recomId = value.recomId;
        this.realname = value.realname;
        this.company = value.company;
        this.position = value.position;
        this.recomReason = value.recomReason;
        this.recomTime = value.recomTime;
        this.isRecom = value.isRecom;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
        this.lastRecomId = value.lastRecomId;
    }

    public StatsRecomRecord(
        Integer   id,
        Integer   positionId,
        Integer   appId,
        Integer   presenteeId,
        Timestamp clickTime,
        Integer   depth,
        Integer   recomId_2,
        Integer   recomId,
        String    realname,
        String    company,
        String    position,
        String    recomReason,
        Timestamp recomTime,
        Integer   isRecom,
        Timestamp createTime,
        Timestamp updateTime,
        Integer   lastRecomId
    ) {
        this.id = id;
        this.positionId = positionId;
        this.appId = appId;
        this.presenteeId = presenteeId;
        this.clickTime = clickTime;
        this.depth = depth;
        this.recomId_2 = recomId_2;
        this.recomId = recomId;
        this.realname = realname;
        this.company = company;
        this.position = position;
        this.recomReason = recomReason;
        this.recomTime = recomTime;
        this.isRecom = isRecom;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.lastRecomId = lastRecomId;
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

    public Integer getAppId() {
        return this.appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public Integer getPresenteeId() {
        return this.presenteeId;
    }

    public void setPresenteeId(Integer presenteeId) {
        this.presenteeId = presenteeId;
    }

    public Timestamp getClickTime() {
        return this.clickTime;
    }

    public void setClickTime(Timestamp clickTime) {
        this.clickTime = clickTime;
    }

    public Integer getDepth() {
        return this.depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    public Integer getRecomId_2() {
        return this.recomId_2;
    }

    public void setRecomId_2(Integer recomId_2) {
        this.recomId_2 = recomId_2;
    }

    public Integer getRecomId() {
        return this.recomId;
    }

    public void setRecomId(Integer recomId) {
        this.recomId = recomId;
    }

    public String getRealname() {
        return this.realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getRecomReason() {
        return this.recomReason;
    }

    public void setRecomReason(String recomReason) {
        this.recomReason = recomReason;
    }

    public Timestamp getRecomTime() {
        return this.recomTime;
    }

    public void setRecomTime(Timestamp recomTime) {
        this.recomTime = recomTime;
    }

    public Integer getIsRecom() {
        return this.isRecom;
    }

    public void setIsRecom(Integer isRecom) {
        this.isRecom = isRecom;
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

    public Integer getLastRecomId() {
        return this.lastRecomId;
    }

    public void setLastRecomId(Integer lastRecomId) {
        this.lastRecomId = lastRecomId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("StatsRecomRecord (");

        sb.append(id);
        sb.append(", ").append(positionId);
        sb.append(", ").append(appId);
        sb.append(", ").append(presenteeId);
        sb.append(", ").append(clickTime);
        sb.append(", ").append(depth);
        sb.append(", ").append(recomId_2);
        sb.append(", ").append(recomId);
        sb.append(", ").append(realname);
        sb.append(", ").append(company);
        sb.append(", ").append(position);
        sb.append(", ").append(recomReason);
        sb.append(", ").append(recomTime);
        sb.append(", ").append(isRecom);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(lastRecomId);

        sb.append(")");
        return sb.toString();
    }
}
