/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.referraldb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 企业用户导入数据异步处理监控操作表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrImporterMonitor implements Serializable {

    private static final long serialVersionUID = -1197028318;

    private Integer   id;
    private Integer   companyId;
    private Integer   hraccountId;
    private Byte      type;
    private String    file;
    private Short     status;
    private String    message;
    private Timestamp createTime;
    private Timestamp updateTime;
    private String    name;
    private Byte      sys;

    public HrImporterMonitor() {}

    public HrImporterMonitor(HrImporterMonitor value) {
        this.id = value.id;
        this.companyId = value.companyId;
        this.hraccountId = value.hraccountId;
        this.type = value.type;
        this.file = value.file;
        this.status = value.status;
        this.message = value.message;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
        this.name = value.name;
        this.sys = value.sys;
    }

    public HrImporterMonitor(
        Integer   id,
        Integer   companyId,
        Integer   hraccountId,
        Byte      type,
        String    file,
        Short     status,
        String    message,
        Timestamp createTime,
        Timestamp updateTime,
        String    name,
        Byte      sys
    ) {
        this.id = id;
        this.companyId = companyId;
        this.hraccountId = hraccountId;
        this.type = type;
        this.file = file;
        this.status = status;
        this.message = message;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.name = name;
        this.sys = sys;
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

    public Integer getHraccountId() {
        return this.hraccountId;
    }

    public void setHraccountId(Integer hraccountId) {
        this.hraccountId = hraccountId;
    }

    public Byte getType() {
        return this.type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getFile() {
        return this.file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public Short getStatus() {
        return this.status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
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

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getSys() {
        return this.sys;
    }

    public void setSys(Byte sys) {
        this.sys = sys;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("HrImporterMonitor (");

        sb.append(id);
        sb.append(", ").append(companyId);
        sb.append(", ").append(hraccountId);
        sb.append(", ").append(type);
        sb.append(", ").append(file);
        sb.append(", ").append(status);
        sb.append(", ").append(message);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(name);
        sb.append(", ").append(sys);

        sb.append(")");
        return sb.toString();
    }
}
