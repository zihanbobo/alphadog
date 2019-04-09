/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.redpacketdb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 公司账户
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RedpacketCompanyBalance implements Serializable {

    private static final long serialVersionUID = 1921701355;

    private Integer   id;
    private Integer   companyId;
    private Integer   balance;
    private Integer   frozenCapital;
    private Integer   consumption;
    private Integer   rechargeTotalAmount;
    private Timestamp createTime;
    private Timestamp updateTime;

    public RedpacketCompanyBalance() {}

    public RedpacketCompanyBalance(RedpacketCompanyBalance value) {
        this.id = value.id;
        this.companyId = value.companyId;
        this.balance = value.balance;
        this.frozenCapital = value.frozenCapital;
        this.consumption = value.consumption;
        this.rechargeTotalAmount = value.rechargeTotalAmount;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
    }

    public RedpacketCompanyBalance(
        Integer   id,
        Integer   companyId,
        Integer   balance,
        Integer   frozenCapital,
        Integer   consumption,
        Integer   rechargeTotalAmount,
        Timestamp createTime,
        Timestamp updateTime
    ) {
        this.id = id;
        this.companyId = companyId;
        this.balance = balance;
        this.frozenCapital = frozenCapital;
        this.consumption = consumption;
        this.rechargeTotalAmount = rechargeTotalAmount;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getBalance() {
        return this.balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Integer getFrozenCapital() {
        return this.frozenCapital;
    }

    public void setFrozenCapital(Integer frozenCapital) {
        this.frozenCapital = frozenCapital;
    }

    public Integer getConsumption() {
        return this.consumption;
    }

    public void setConsumption(Integer consumption) {
        this.consumption = consumption;
    }

    public Integer getRechargeTotalAmount() {
        return this.rechargeTotalAmount;
    }

    public void setRechargeTotalAmount(Integer rechargeTotalAmount) {
        this.rechargeTotalAmount = rechargeTotalAmount;
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
        StringBuilder sb = new StringBuilder("RedpacketCompanyBalance (");

        sb.append(id);
        sb.append(", ").append(companyId);
        sb.append(", ").append(balance);
        sb.append(", ").append(frozenCapital);
        sb.append(", ").append(consumption);
        sb.append(", ").append(rechargeTotalAmount);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}