/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * hr推荐同行表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrNpsRecommend implements Serializable {

    private static final long serialVersionUID = 1712388054;

    private Integer   id;
    private Integer   hrNpsId;
    private String    username;
    private String    mobile;
    private String    company;
    private Timestamp createTime;

    public HrNpsRecommend() {}

    public HrNpsRecommend(HrNpsRecommend value) {
        this.id = value.id;
        this.hrNpsId = value.hrNpsId;
        this.username = value.username;
        this.mobile = value.mobile;
        this.company = value.company;
        this.createTime = value.createTime;
    }

    public HrNpsRecommend(
        Integer   id,
        Integer   hrNpsId,
        String    username,
        String    mobile,
        String    company,
        Timestamp createTime
    ) {
        this.id = id;
        this.hrNpsId = hrNpsId;
        this.username = username;
        this.mobile = mobile;
        this.company = company;
        this.createTime = createTime;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHrNpsId() {
        return this.hrNpsId;
    }

    public void setHrNpsId(Integer hrNpsId) {
        this.hrNpsId = hrNpsId;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("HrNpsRecommend (");

        sb.append(id);
        sb.append(", ").append(hrNpsId);
        sb.append(", ").append(username);
        sb.append(", ").append(mobile);
        sb.append(", ").append(company);
        sb.append(", ").append(createTime);

        sb.append(")");
        return sb.toString();
    }
}
