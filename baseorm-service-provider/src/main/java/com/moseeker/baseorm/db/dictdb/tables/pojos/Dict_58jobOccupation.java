/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.dictdb.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * 58职能表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Dict_58jobOccupation implements Serializable {

    private static final long serialVersionUID = -613166437;

    private Integer code;
    private String  parentId;
    private String  name;
    private String  codeOther;
    private Short   level;
    private Short   status;

    public Dict_58jobOccupation() {}

    public Dict_58jobOccupation(Dict_58jobOccupation value) {
        this.code = value.code;
        this.parentId = value.parentId;
        this.name = value.name;
        this.codeOther = value.codeOther;
        this.level = value.level;
        this.status = value.status;
    }

    public Dict_58jobOccupation(
        Integer code,
        String  parentId,
        String  name,
        String  codeOther,
        Short   level,
        Short   status
    ) {
        this.code = code;
        this.parentId = parentId;
        this.name = name;
        this.codeOther = codeOther;
        this.level = level;
        this.status = status;
    }

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getParentId() {
        return this.parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCodeOther() {
        return this.codeOther;
    }

    public void setCodeOther(String codeOther) {
        this.codeOther = codeOther;
    }

    public Short getLevel() {
        return this.level;
    }

    public void setLevel(Short level) {
        this.level = level;
    }

    public Short getStatus() {
        return this.status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Dict_58jobOccupation (");

        sb.append(code);
        sb.append(", ").append(parentId);
        sb.append(", ").append(name);
        sb.append(", ").append(codeOther);
        sb.append(", ").append(level);
        sb.append(", ").append(status);

        sb.append(")");
        return sb.toString();
    }
}
