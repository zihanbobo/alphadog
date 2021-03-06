/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.configdb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 短信模板配置（包括发送渠道）
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ConfigSmsTemplate implements Serializable {

    private static final long serialVersionUID = -1478603782;

    private Integer   id;
    private String    name;
    private String    code;
    private String    contentAli;
    private String    content_253;
    private String    variableOrder_253;
    private Byte      channelType;
    private String    remark;
    private Timestamp createTime;
    private Timestamp updateTime;

    public ConfigSmsTemplate() {}

    public ConfigSmsTemplate(ConfigSmsTemplate value) {
        this.id = value.id;
        this.name = value.name;
        this.code = value.code;
        this.contentAli = value.contentAli;
        this.content_253 = value.content_253;
        this.variableOrder_253 = value.variableOrder_253;
        this.channelType = value.channelType;
        this.remark = value.remark;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
    }

    public ConfigSmsTemplate(
        Integer   id,
        String    name,
        String    code,
        String    contentAli,
        String    content_253,
        String    variableOrder_253,
        Byte      channelType,
        String    remark,
        Timestamp createTime,
        Timestamp updateTime
    ) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.contentAli = contentAli;
        this.content_253 = content_253;
        this.variableOrder_253 = variableOrder_253;
        this.channelType = channelType;
        this.remark = remark;
        this.createTime = createTime;
        this.updateTime = updateTime;
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

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getContentAli() {
        return this.contentAli;
    }

    public void setContentAli(String contentAli) {
        this.contentAli = contentAli;
    }

    public String getContent_253() {
        return this.content_253;
    }

    public void setContent_253(String content_253) {
        this.content_253 = content_253;
    }

    public String getVariableOrder_253() {
        return this.variableOrder_253;
    }

    public void setVariableOrder_253(String variableOrder_253) {
        this.variableOrder_253 = variableOrder_253;
    }

    public Byte getChannelType() {
        return this.channelType;
    }

    public void setChannelType(Byte channelType) {
        this.channelType = channelType;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
        StringBuilder sb = new StringBuilder("ConfigSmsTemplate (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(code);
        sb.append(", ").append(contentAli);
        sb.append(", ").append(content_253);
        sb.append(", ").append(variableOrder_253);
        sb.append(", ").append(channelType);
        sb.append(", ").append(remark);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}
