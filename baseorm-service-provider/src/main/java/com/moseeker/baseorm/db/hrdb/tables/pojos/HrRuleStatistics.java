/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.pojos;


import java.io.Serializable;
import java.sql.Date;

import javax.annotation.Generated;


/**
 * 微信图文传播次数统计表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrRuleStatistics implements Serializable {

    private static final long serialVersionUID = -1526340130;

    private Integer id;
    private Integer wxruleId;
    private String  menuName;
    private Integer type;
    private Integer companyId;
    private Integer viewNumPv;
    private Date    createDate;

    public HrRuleStatistics() {}

    public HrRuleStatistics(HrRuleStatistics value) {
        this.id = value.id;
        this.wxruleId = value.wxruleId;
        this.menuName = value.menuName;
        this.type = value.type;
        this.companyId = value.companyId;
        this.viewNumPv = value.viewNumPv;
        this.createDate = value.createDate;
    }

    public HrRuleStatistics(
        Integer id,
        Integer wxruleId,
        String  menuName,
        Integer type,
        Integer companyId,
        Integer viewNumPv,
        Date    createDate
    ) {
        this.id = id;
        this.wxruleId = wxruleId;
        this.menuName = menuName;
        this.type = type;
        this.companyId = companyId;
        this.viewNumPv = viewNumPv;
        this.createDate = createDate;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWxruleId() {
        return this.wxruleId;
    }

    public void setWxruleId(Integer wxruleId) {
        this.wxruleId = wxruleId;
    }

    public String getMenuName() {
        return this.menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
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

    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("HrRuleStatistics (");

        sb.append(id);
        sb.append(", ").append(wxruleId);
        sb.append(", ").append(menuName);
        sb.append(", ").append(type);
        sb.append(", ").append(companyId);
        sb.append(", ").append(viewNumPv);
        sb.append(", ").append(createDate);

        sb.append(")");
        return sb.toString();
    }
}