/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 微信端新jd内容模块配置项
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrCmsModule implements Serializable {

    private static final long serialVersionUID = -1083311160;

    private Integer   id;
    private Integer   pageId;
    private String    moduleName;
    private Integer   type;
    private Integer   orders;
    private String    link;
    private Integer   limit;
    private Integer   disable;
    private Timestamp createTime;
    private Timestamp updateTime;

    public HrCmsModule() {}

    public HrCmsModule(HrCmsModule value) {
        this.id = value.id;
        this.pageId = value.pageId;
        this.moduleName = value.moduleName;
        this.type = value.type;
        this.orders = value.orders;
        this.link = value.link;
        this.limit = value.limit;
        this.disable = value.disable;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
    }

    public HrCmsModule(
        Integer   id,
        Integer   pageId,
        String    moduleName,
        Integer   type,
        Integer   orders,
        String    link,
        Integer   limit,
        Integer   disable,
        Timestamp createTime,
        Timestamp updateTime
    ) {
        this.id = id;
        this.pageId = pageId;
        this.moduleName = moduleName;
        this.type = type;
        this.orders = orders;
        this.link = link;
        this.limit = limit;
        this.disable = disable;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPageId() {
        return this.pageId;
    }

    public void setPageId(Integer pageId) {
        this.pageId = pageId;
    }

    public String getModuleName() {
        return this.moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getOrders() {
        return this.orders;
    }

    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    public String getLink() {
        return this.link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
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

    public Timestamp getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("HrCmsModule (");

        sb.append(id);
        sb.append(", ").append(pageId);
        sb.append(", ").append(moduleName);
        sb.append(", ").append(type);
        sb.append(", ").append(orders);
        sb.append(", ").append(link);
        sb.append(", ").append(limit);
        sb.append(", ").append(disable);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}
