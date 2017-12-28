/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrHbScratchCard implements Serializable {

    private static final long serialVersionUID = 16896769;

    private Integer    id;
    private Integer    wechatId;
    private String     cardno;
    private Integer    status;
    private BigDecimal amount;
    private Integer    hbConfigId;
    private String     baggingOpenid;
    private Timestamp  createTime;
    private Integer    hbItemId;
    private Byte       tips;

    public HrHbScratchCard() {}

    public HrHbScratchCard(HrHbScratchCard value) {
        this.id = value.id;
        this.wechatId = value.wechatId;
        this.cardno = value.cardno;
        this.status = value.status;
        this.amount = value.amount;
        this.hbConfigId = value.hbConfigId;
        this.baggingOpenid = value.baggingOpenid;
        this.createTime = value.createTime;
        this.hbItemId = value.hbItemId;
        this.tips = value.tips;
    }

    public HrHbScratchCard(
        Integer    id,
        Integer    wechatId,
        String     cardno,
        Integer    status,
        BigDecimal amount,
        Integer    hbConfigId,
        String     baggingOpenid,
        Timestamp  createTime,
        Integer    hbItemId,
        Byte       tips
    ) {
        this.id = id;
        this.wechatId = wechatId;
        this.cardno = cardno;
        this.status = status;
        this.amount = amount;
        this.hbConfigId = hbConfigId;
        this.baggingOpenid = baggingOpenid;
        this.createTime = createTime;
        this.hbItemId = hbItemId;
        this.tips = tips;
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

    public String getCardno() {
        return this.cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getHbConfigId() {
        return this.hbConfigId;
    }

    public void setHbConfigId(Integer hbConfigId) {
        this.hbConfigId = hbConfigId;
    }

    public String getBaggingOpenid() {
        return this.baggingOpenid;
    }

    public void setBaggingOpenid(String baggingOpenid) {
        this.baggingOpenid = baggingOpenid;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Integer getHbItemId() {
        return this.hbItemId;
    }

    public void setHbItemId(Integer hbItemId) {
        this.hbItemId = hbItemId;
    }

    public Byte getTips() {
        return this.tips;
    }

    public void setTips(Byte tips) {
        this.tips = tips;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("HrHbScratchCard (");

        sb.append(id);
        sb.append(", ").append(wechatId);
        sb.append(", ").append(cardno);
        sb.append(", ").append(status);
        sb.append(", ").append(amount);
        sb.append(", ").append(hbConfigId);
        sb.append(", ").append(baggingOpenid);
        sb.append(", ").append(createTime);
        sb.append(", ").append(hbItemId);
        sb.append(", ").append(tips);

        sb.append(")");
        return sb.toString();
    }
}
