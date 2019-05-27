/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.dictdb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 玛氏专业常量表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DictMarsMajor implements Serializable {

    private static final long serialVersionUID = -345378717;

    private Integer   id;
    private String    name;
    private Integer   parentId;
    private Integer   disable;
    private Timestamp createTime;

    public DictMarsMajor() {}

    public DictMarsMajor(DictMarsMajor value) {
        this.id = value.id;
        this.name = value.name;
        this.parentId = value.parentId;
        this.disable = value.disable;
        this.createTime = value.createTime;
    }

    public DictMarsMajor(
        Integer   id,
        String    name,
        Integer   parentId,
        Integer   disable,
        Timestamp createTime
    ) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.disable = disable;
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

    public Integer getParentId() {
        return this.parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getDisable() {
        return this.disable;
    }

    public void setDisable(Integer disable) {
        this.disable = disable;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DictMarsMajor (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(parentId);
        sb.append(", ").append(disable);
        sb.append(", ").append(createTime);

        sb.append(")");
        return sb.toString();
    }
}
