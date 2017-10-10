/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.thirdpartydb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 第三方渠道的上班地址
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ThirdpartyAccountCompanyAddress implements Serializable {

    private static final long serialVersionUID = 773074286;

    private Integer   id;
    private Integer   accountId;
    private String    city;
    private String    address;
    private Timestamp createTime;
    private Timestamp updateTime;

    public ThirdpartyAccountCompanyAddress() {}

    public ThirdpartyAccountCompanyAddress(ThirdpartyAccountCompanyAddress value) {
        this.id = value.id;
        this.accountId = value.accountId;
        this.city = value.city;
        this.address = value.address;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
    }

    public ThirdpartyAccountCompanyAddress(
        Integer   id,
        Integer   accountId,
        String    city,
        String    address,
        Timestamp createTime,
        Timestamp updateTime
    ) {
        this.id = id;
        this.accountId = accountId;
        this.city = city;
        this.address = address;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAccountId() {
        return this.accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
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
        StringBuilder sb = new StringBuilder("ThirdpartyAccountCompanyAddress (");

        sb.append(id);
        sb.append(", ").append(accountId);
        sb.append(", ").append(city);
        sb.append(", ").append(address);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}
