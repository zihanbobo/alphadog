/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.pojos;


import java.io.Serializable;
import java.sql.Date;

import javax.annotation.Generated;


/**
 * 专题传播统计次数表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrHtml5Statistics implements Serializable {

    private static final long serialVersionUID = 1256040588;

    private Integer id;
    private Integer topicId;
    private Integer companyId;
    private Integer viewNumPv;
    private Integer recomViewNumPv;
    private Date    createDate;

    public HrHtml5Statistics() {}

    public HrHtml5Statistics(HrHtml5Statistics value) {
        this.id = value.id;
        this.topicId = value.topicId;
        this.companyId = value.companyId;
        this.viewNumPv = value.viewNumPv;
        this.recomViewNumPv = value.recomViewNumPv;
        this.createDate = value.createDate;
    }

    public HrHtml5Statistics(
        Integer id,
        Integer topicId,
        Integer companyId,
        Integer viewNumPv,
        Integer recomViewNumPv,
        Date    createDate
    ) {
        this.id = id;
        this.topicId = topicId;
        this.companyId = companyId;
        this.viewNumPv = viewNumPv;
        this.recomViewNumPv = recomViewNumPv;
        this.createDate = createDate;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTopicId() {
        return this.topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public Integer getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getViewNumPv() {
        return this.viewNumPv;
    }

    public void setViewNumPv(Integer viewNumPv) {
        this.viewNumPv = viewNumPv;
    }

    public Integer getRecomViewNumPv() {
        return this.recomViewNumPv;
    }

    public void setRecomViewNumPv(Integer recomViewNumPv) {
        this.recomViewNumPv = recomViewNumPv;
    }

    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("HrHtml5Statistics (");

        sb.append(id);
        sb.append(", ").append(topicId);
        sb.append(", ").append(companyId);
        sb.append(", ").append(viewNumPv);
        sb.append(", ").append(recomViewNumPv);
        sb.append(", ").append(createDate);

        sb.append(")");
        return sb.toString();
    }
}