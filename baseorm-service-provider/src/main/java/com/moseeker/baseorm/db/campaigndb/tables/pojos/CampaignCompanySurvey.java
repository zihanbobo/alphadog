/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.campaigndb.tables.pojos;


import java.io.Serializable;
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
public class CampaignCompanySurvey implements Serializable {

    private static final long serialVersionUID = 1400357925;

    private Integer   id;
    private Integer   sysuserId;
    private Integer   companyId;
    private String    selected;
    private String    other;
    private Timestamp createTime;

    public CampaignCompanySurvey() {}

    public CampaignCompanySurvey(CampaignCompanySurvey value) {
        this.id = value.id;
        this.sysuserId = value.sysuserId;
        this.companyId = value.companyId;
        this.selected = value.selected;
        this.other = value.other;
        this.createTime = value.createTime;
    }

    public CampaignCompanySurvey(
        Integer   id,
        Integer   sysuserId,
        Integer   companyId,
        String    selected,
        String    other,
        Timestamp createTime
    ) {
        this.id = id;
        this.sysuserId = sysuserId;
        this.companyId = companyId;
        this.selected = selected;
        this.other = other;
        this.createTime = createTime;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSysuserId() {
        return this.sysuserId;
    }

    public void setSysuserId(Integer sysuserId) {
        this.sysuserId = sysuserId;
    }

    public Integer getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getSelected() {
        return this.selected;
    }

    public void setSelected(String selected) {
        this.selected = selected;
    }

    public String getOther() {
        return this.other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CampaignCompanySurvey (");

        sb.append(id);
        sb.append(", ").append(sysuserId);
        sb.append(", ").append(companyId);
        sb.append(", ").append(selected);
        sb.append(", ").append(other);
        sb.append(", ").append(createTime);

        sb.append(")");
        return sb.toString();
    }
}
