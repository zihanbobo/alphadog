/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.configdb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 操作记录模版配置表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ConfigOperationLogTemplate implements Serializable {

    private static final long serialVersionUID = 382797372;

    private Long      id;
    private Integer   businessType;
    private Integer   businessSubType;
    private Integer   operationType;
    private String    operationLogTemplate;
    private String    operationLogTemplateDiscription;
    private Timestamp createTime;
    private Timestamp updateTime;
    private String    applicationLogTemplate;

    public ConfigOperationLogTemplate() {}

    public ConfigOperationLogTemplate(ConfigOperationLogTemplate value) {
        this.id = value.id;
        this.businessType = value.businessType;
        this.businessSubType = value.businessSubType;
        this.operationType = value.operationType;
        this.operationLogTemplate = value.operationLogTemplate;
        this.operationLogTemplateDiscription = value.operationLogTemplateDiscription;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
        this.applicationLogTemplate = value.applicationLogTemplate;
    }

    public ConfigOperationLogTemplate(
        Long      id,
        Integer   businessType,
        Integer   businessSubType,
        Integer   operationType,
        String    operationLogTemplate,
        String    operationLogTemplateDiscription,
        Timestamp createTime,
        Timestamp updateTime,
        String    applicationLogTemplate
    ) {
        this.id = id;
        this.businessType = businessType;
        this.businessSubType = businessSubType;
        this.operationType = operationType;
        this.operationLogTemplate = operationLogTemplate;
        this.operationLogTemplateDiscription = operationLogTemplateDiscription;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.applicationLogTemplate = applicationLogTemplate;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getBusinessType() {
        return this.businessType;
    }

    public void setBusinessType(Integer businessType) {
        this.businessType = businessType;
    }

    public Integer getBusinessSubType() {
        return this.businessSubType;
    }

    public void setBusinessSubType(Integer businessSubType) {
        this.businessSubType = businessSubType;
    }

    public Integer getOperationType() {
        return this.operationType;
    }

    public void setOperationType(Integer operationType) {
        this.operationType = operationType;
    }

    public String getOperationLogTemplate() {
        return this.operationLogTemplate;
    }

    public void setOperationLogTemplate(String operationLogTemplate) {
        this.operationLogTemplate = operationLogTemplate;
    }

    public String getOperationLogTemplateDiscription() {
        return this.operationLogTemplateDiscription;
    }

    public void setOperationLogTemplateDiscription(String operationLogTemplateDiscription) {
        this.operationLogTemplateDiscription = operationLogTemplateDiscription;
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

    public String getApplicationLogTemplate() {
        return this.applicationLogTemplate;
    }

    public void setApplicationLogTemplate(String applicationLogTemplate) {
        this.applicationLogTemplate = applicationLogTemplate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ConfigOperationLogTemplate (");

        sb.append(id);
        sb.append(", ").append(businessType);
        sb.append(", ").append(businessSubType);
        sb.append(", ").append(operationType);
        sb.append(", ").append(operationLogTemplate);
        sb.append(", ").append(operationLogTemplateDiscription);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(applicationLogTemplate);

        sb.append(")");
        return sb.toString();
    }
}
