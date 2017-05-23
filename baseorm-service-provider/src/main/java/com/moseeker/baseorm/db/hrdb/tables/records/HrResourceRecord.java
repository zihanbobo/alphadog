/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.hrdb.tables.records;


import com.moseeker.baseorm.db.hrdb.tables.HrResource;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 资源集合表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrResourceRecord extends UpdatableRecordImpl<HrResourceRecord> implements Record10<Integer, String, Integer, String, Integer, String, Integer, Timestamp, Timestamp, String> {

    private static final long serialVersionUID = -840309327;

    /**
     * Setter for <code>hrdb.hr_resource.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>hrdb.hr_resource.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>hrdb.hr_resource.res_url</code>. 资源链接
     */
    public void setResUrl(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>hrdb.hr_resource.res_url</code>. 资源链接
     */
    public String getResUrl() {
        return (String) get(1);
    }

    /**
     * Setter for <code>hrdb.hr_resource.res_type</code>. 0: image  1: video
     */
    public void setResType(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>hrdb.hr_resource.res_type</code>. 0: image  1: video
     */
    public Integer getResType() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>hrdb.hr_resource.remark</code>. 备注资源
     */
    public void setRemark(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>hrdb.hr_resource.remark</code>. 备注资源
     */
    public String getRemark() {
        return (String) get(3);
    }

    /**
     * Setter for <code>hrdb.hr_resource.company_id</code>. 企业id
     */
    public void setCompanyId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>hrdb.hr_resource.company_id</code>. 企业id
     */
    public Integer getCompanyId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>hrdb.hr_resource.title</code>. 资源名称
     */
    public void setTitle(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>hrdb.hr_resource.title</code>. 资源名称
     */
    public String getTitle() {
        return (String) get(5);
    }

    /**
     * Setter for <code>hrdb.hr_resource.disable</code>. 0是正常1是删除
     */
    public void setDisable(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>hrdb.hr_resource.disable</code>. 0是正常1是删除
     */
    public Integer getDisable() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>hrdb.hr_resource.create_time</code>. 资源创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>hrdb.hr_resource.create_time</code>. 资源创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>hrdb.hr_resource.update_time</code>. 资源修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>hrdb.hr_resource.update_time</code>. 资源修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>hrdb.hr_resource.cover</code>. 视频封面
     */
    public void setCover(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>hrdb.hr_resource.cover</code>. 视频封面
     */
    public String getCover() {
        return (String) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, Integer, String, Integer, String, Integer, Timestamp, Timestamp, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, Integer, String, Integer, String, Integer, Timestamp, Timestamp, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return HrResource.HR_RESOURCE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return HrResource.HR_RESOURCE.RES_URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return HrResource.HR_RESOURCE.RES_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return HrResource.HR_RESOURCE.REMARK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return HrResource.HR_RESOURCE.COMPANY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return HrResource.HR_RESOURCE.TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return HrResource.HR_RESOURCE.DISABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return HrResource.HR_RESOURCE.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return HrResource.HR_RESOURCE.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return HrResource.HR_RESOURCE.COVER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getResUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getResType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getCompanyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getDisable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getCover();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrResourceRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrResourceRecord value2(String value) {
        setResUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrResourceRecord value3(Integer value) {
        setResType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrResourceRecord value4(String value) {
        setRemark(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrResourceRecord value5(Integer value) {
        setCompanyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrResourceRecord value6(String value) {
        setTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrResourceRecord value7(Integer value) {
        setDisable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrResourceRecord value8(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrResourceRecord value9(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrResourceRecord value10(String value) {
        setCover(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrResourceRecord values(Integer value1, String value2, Integer value3, String value4, Integer value5, String value6, Integer value7, Timestamp value8, Timestamp value9, String value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HrResourceRecord
     */
    public HrResourceRecord() {
        super(HrResource.HR_RESOURCE);
    }

    /**
     * Create a detached, initialised HrResourceRecord
     */
    public HrResourceRecord(Integer id, String resUrl, Integer resType, String remark, Integer companyId, String title, Integer disable, Timestamp createTime, Timestamp updateTime, String cover) {
        super(HrResource.HR_RESOURCE);

        set(0, id);
        set(1, resUrl);
        set(2, resType);
        set(3, remark);
        set(4, companyId);
        set(5, title);
        set(6, disable);
        set(7, createTime);
        set(8, updateTime);
        set(9, cover);
    }
}
