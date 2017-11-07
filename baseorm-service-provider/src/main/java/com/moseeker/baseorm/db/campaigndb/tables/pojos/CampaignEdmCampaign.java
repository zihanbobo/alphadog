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
public class CampaignEdmCampaign implements Serializable {

    private static final long serialVersionUID = 1795372160;

    private Integer   id;
    private String    name;
    private String    desc;
    private Timestamp sendTime;
    private Timestamp createTime;

    public CampaignEdmCampaign() {}

    public CampaignEdmCampaign(CampaignEdmCampaign value) {
        this.id = value.id;
        this.name = value.name;
        this.desc = value.desc;
        this.sendTime = value.sendTime;
        this.createTime = value.createTime;
    }

    public CampaignEdmCampaign(
        Integer   id,
        String    name,
        String    desc,
        Timestamp sendTime,
        Timestamp createTime
    ) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.sendTime = sendTime;
        this.createTime = createTime;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Timestamp getSendTime() {
        return this.sendTime;
    }

    public void setSendTime(Timestamp sendTime) {
        this.sendTime = sendTime;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CampaignEdmCampaign (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(desc);
        sb.append(", ").append(sendTime);
        sb.append(", ").append(createTime);

        sb.append(")");
        return sb.toString();
    }
}