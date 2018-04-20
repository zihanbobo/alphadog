/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.configdb.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * 申请字段模板表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ConfigSysAppTemplate implements Serializable {

    private static final long serialVersionUID = -1043727684;

    private Integer id;
    private String  enname;
    private String  chname;
    private Byte    priority;
    private Byte    display;
    private Byte    required;
    private Byte    type;
    private String  remark;
    private String  entitle;
    private Integer parentId;

    public ConfigSysAppTemplate() {}

    public ConfigSysAppTemplate(ConfigSysAppTemplate value) {
        this.id = value.id;
        this.enname = value.enname;
        this.chname = value.chname;
        this.priority = value.priority;
        this.display = value.display;
        this.required = value.required;
        this.type = value.type;
        this.remark = value.remark;
        this.entitle = value.entitle;
        this.parentId = value.parentId;
    }

    public ConfigSysAppTemplate(
        Integer id,
        String  enname,
        String  chname,
        Byte    priority,
        Byte    display,
        Byte    required,
        Byte    type,
        String  remark,
        String  entitle,
        Integer parentId
    ) {
        this.id = id;
        this.enname = enname;
        this.chname = chname;
        this.priority = priority;
        this.display = display;
        this.required = required;
        this.type = type;
        this.remark = remark;
        this.entitle = entitle;
        this.parentId = parentId;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEnname() {
        return this.enname;
    }

    public void setEnname(String enname) {
        this.enname = enname;
    }

    public String getChname() {
        return this.chname;
    }

    public void setChname(String chname) {
        this.chname = chname;
    }

    public Byte getPriority() {
        return this.priority;
    }

    public void setPriority(Byte priority) {
        this.priority = priority;
    }

    public Byte getDisplay() {
        return this.display;
    }

    public void setDisplay(Byte display) {
        this.display = display;
    }

    public Byte getRequired() {
        return this.required;
    }

    public void setRequired(Byte required) {
        this.required = required;
    }

    public Byte getType() {
        return this.type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getEntitle() {
        return this.entitle;
    }

    public void setEntitle(String entitle) {
        this.entitle = entitle;
    }

    public Integer getParentId() {
        return this.parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ConfigSysAppTemplate (");

        sb.append(id);
        sb.append(", ").append(enname);
        sb.append(", ").append(chname);
        sb.append(", ").append(priority);
        sb.append(", ").append(display);
        sb.append(", ").append(required);
        sb.append(", ").append(type);
        sb.append(", ").append(remark);
        sb.append(", ").append(entitle);
        sb.append(", ").append(parentId);

        sb.append(")");
        return sb.toString();
    }
}
