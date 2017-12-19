/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * 自定义简历模板导出字段表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrAppExportFields implements Serializable {

    private static final long serialVersionUID = -1389647646;

    private Integer id;
    private String  fieldName;
    private String  fieldTitle;
    private Integer displayOrder;
    private Integer selected;
    private Integer showed;
    private String  sample;

    public HrAppExportFields() {}

    public HrAppExportFields(HrAppExportFields value) {
        this.id = value.id;
        this.fieldName = value.fieldName;
        this.fieldTitle = value.fieldTitle;
        this.displayOrder = value.displayOrder;
        this.selected = value.selected;
        this.showed = value.showed;
        this.sample = value.sample;
    }

    public HrAppExportFields(
        Integer id,
        String  fieldName,
        String  fieldTitle,
        Integer displayOrder,
        Integer selected,
        Integer showed,
        String  sample
    ) {
        this.id = id;
        this.fieldName = fieldName;
        this.fieldTitle = fieldTitle;
        this.displayOrder = displayOrder;
        this.selected = selected;
        this.showed = showed;
        this.sample = sample;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldTitle() {
        return this.fieldTitle;
    }

    public void setFieldTitle(String fieldTitle) {
        this.fieldTitle = fieldTitle;
    }

    public Integer getDisplayOrder() {
        return this.displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    public Integer getSelected() {
        return this.selected;
    }

    public void setSelected(Integer selected) {
        this.selected = selected;
    }

    public Integer getShowed() {
        return this.showed;
    }

    public void setShowed(Integer showed) {
        this.showed = showed;
    }

    public String getSample() {
        return this.sample;
    }

    public void setSample(String sample) {
        this.sample = sample;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("HrAppExportFields (");

        sb.append(id);
        sb.append(", ").append(fieldName);
        sb.append(", ").append(fieldTitle);
        sb.append(", ").append(displayOrder);
        sb.append(", ").append(selected);
        sb.append(", ").append(showed);
        sb.append(", ").append(sample);

        sb.append(")");
        return sb.toString();
    }
}
