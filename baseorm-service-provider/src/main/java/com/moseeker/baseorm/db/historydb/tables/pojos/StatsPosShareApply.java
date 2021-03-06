/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.historydb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 分享贡献表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StatsPosShareApply implements Serializable {

    private static final long serialVersionUID = 1918490615;

    private Integer   id;
    private Integer   positionId;
    private Integer   recomId;
    private Timestamp shareTime;
    private Integer   sharePv;
    private Integer   shareUv;
    private Integer   applyCount;

    public StatsPosShareApply() {}

    public StatsPosShareApply(StatsPosShareApply value) {
        this.id = value.id;
        this.positionId = value.positionId;
        this.recomId = value.recomId;
        this.shareTime = value.shareTime;
        this.sharePv = value.sharePv;
        this.shareUv = value.shareUv;
        this.applyCount = value.applyCount;
    }

    public StatsPosShareApply(
        Integer   id,
        Integer   positionId,
        Integer   recomId,
        Timestamp shareTime,
        Integer   sharePv,
        Integer   shareUv,
        Integer   applyCount
    ) {
        this.id = id;
        this.positionId = positionId;
        this.recomId = recomId;
        this.shareTime = shareTime;
        this.sharePv = sharePv;
        this.shareUv = shareUv;
        this.applyCount = applyCount;
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

    public Integer getRecomId() {
        return this.recomId;
    }

    public void setRecomId(Integer recomId) {
        this.recomId = recomId;
    }

    public Timestamp getShareTime() {
        return this.shareTime;
    }

    public void setShareTime(Timestamp shareTime) {
        this.shareTime = shareTime;
    }

    public Integer getSharePv() {
        return this.sharePv;
    }

    public void setSharePv(Integer sharePv) {
        this.sharePv = sharePv;
    }

    public Integer getShareUv() {
        return this.shareUv;
    }

    public void setShareUv(Integer shareUv) {
        this.shareUv = shareUv;
    }

    public Integer getApplyCount() {
        return this.applyCount;
    }

    public void setApplyCount(Integer applyCount) {
        this.applyCount = applyCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("StatsPosShareApply (");

        sb.append(id);
        sb.append(", ").append(positionId);
        sb.append(", ").append(recomId);
        sb.append(", ").append(shareTime);
        sb.append(", ").append(sharePv);
        sb.append(", ").append(shareUv);
        sb.append(", ").append(applyCount);

        sb.append(")");
        return sb.toString();
    }
}
