/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.malldb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 商品申请记录
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MallOrder implements Serializable {

    private static final long serialVersionUID = 470318449;

    private Integer   id;
    private String    orderId;
    private Integer   employeeId;
    private Integer   goodsId;
    private Integer   companyId;
    private String    name;
    private Integer   credit;
    private String    title;
    private String    picUrl;
    private Integer   count;
    private Byte      state;
    private Timestamp assignTime;
    private Integer   mailId;
    private Timestamp createTime;
    private Timestamp updateTime;

    public MallOrder() {}

    public MallOrder(MallOrder value) {
        this.id = value.id;
        this.orderId = value.orderId;
        this.employeeId = value.employeeId;
        this.goodsId = value.goodsId;
        this.companyId = value.companyId;
        this.name = value.name;
        this.credit = value.credit;
        this.title = value.title;
        this.picUrl = value.picUrl;
        this.count = value.count;
        this.state = value.state;
        this.assignTime = value.assignTime;
        this.mailId = value.mailId;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
    }

    public MallOrder(
        Integer   id,
        String    orderId,
        Integer   employeeId,
        Integer   goodsId,
        Integer   companyId,
        String    name,
        Integer   credit,
        String    title,
        String    picUrl,
        Integer   count,
        Byte      state,
        Timestamp assignTime,
        Integer   mailId,
        Timestamp createTime,
        Timestamp updateTime
    ) {
        this.id = id;
        this.orderId = orderId;
        this.employeeId = employeeId;
        this.goodsId = goodsId;
        this.companyId = companyId;
        this.name = name;
        this.credit = credit;
        this.title = title;
        this.picUrl = picUrl;
        this.count = count;
        this.state = state;
        this.assignTime = assignTime;
        this.mailId = mailId;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getGoodsId() {
        return this.goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCredit() {
        return this.credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPicUrl() {
        return this.picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public Integer getCount() {
        return this.count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Byte getState() {
        return this.state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Timestamp getAssignTime() {
        return this.assignTime;
    }

    public void setAssignTime(Timestamp assignTime) {
        this.assignTime = assignTime;
    }

    public Integer getMailId() {
        return this.mailId;
    }

    public void setMailId(Integer mailId) {
        this.mailId = mailId;
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
        StringBuilder sb = new StringBuilder("MallOrder (");

        sb.append(id);
        sb.append(", ").append(orderId);
        sb.append(", ").append(employeeId);
        sb.append(", ").append(goodsId);
        sb.append(", ").append(companyId);
        sb.append(", ").append(name);
        sb.append(", ").append(credit);
        sb.append(", ").append(title);
        sb.append(", ").append(picUrl);
        sb.append(", ").append(count);
        sb.append(", ").append(state);
        sb.append(", ").append(assignTime);
        sb.append(", ").append(mailId);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}
