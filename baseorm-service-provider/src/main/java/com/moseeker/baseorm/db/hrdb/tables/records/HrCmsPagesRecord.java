/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.records;


import com.moseeker.baseorm.db.hrdb.tables.HrCmsPages;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 微信端新jd配置表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrCmsPagesRecord extends UpdatableRecordImpl<HrCmsPagesRecord> implements Record6<Integer, Integer, Integer, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1051165712;

    /**
     * Setter for <code>hrdb.hr_cms_pages.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>hrdb.hr_cms_pages.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>hrdb.hr_cms_pages.config_id</code>.
     */
    public void setConfigId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>hrdb.hr_cms_pages.config_id</code>.
     */
    public Integer getConfigId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>hrdb.hr_cms_pages.type</code>. 0,默认值暂无意义，1为企业首页(config_id为company_id)2，团队详情（config_id为team_id） ，3，详情职位详情(config_id为team_id)
     */
    public void setType(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>hrdb.hr_cms_pages.type</code>. 0,默认值暂无意义，1为企业首页(config_id为company_id)2，团队详情（config_id为team_id） ，3，详情职位详情(config_id为team_id)
     */
    public Integer getType() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>hrdb.hr_cms_pages.disable</code>. 状态 0 是有效 1是无效
     */
    public void setDisable(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>hrdb.hr_cms_pages.disable</code>. 状态 0 是有效 1是无效
     */
    public Integer getDisable() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>hrdb.hr_cms_pages.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>hrdb.hr_cms_pages.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>hrdb.hr_cms_pages.update_time</code>.
     */
    public void setUpdateTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>hrdb.hr_cms_pages.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Integer, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Integer, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return HrCmsPages.HR_CMS_PAGES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return HrCmsPages.HR_CMS_PAGES.CONFIG_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return HrCmsPages.HR_CMS_PAGES.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return HrCmsPages.HR_CMS_PAGES.DISABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return HrCmsPages.HR_CMS_PAGES.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return HrCmsPages.HR_CMS_PAGES.UPDATE_TIME;
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
    public Integer value2() {
        return getConfigId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getDisable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCmsPagesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCmsPagesRecord value2(Integer value) {
        setConfigId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCmsPagesRecord value3(Integer value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCmsPagesRecord value4(Integer value) {
        setDisable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCmsPagesRecord value5(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCmsPagesRecord value6(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCmsPagesRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Timestamp value5, Timestamp value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HrCmsPagesRecord
     */
    public HrCmsPagesRecord() {
        super(HrCmsPages.HR_CMS_PAGES);
    }

    /**
     * Create a detached, initialised HrCmsPagesRecord
     */
    public HrCmsPagesRecord(Integer id, Integer configId, Integer type, Integer disable, Timestamp createTime, Timestamp updateTime) {
        super(HrCmsPages.HR_CMS_PAGES);

        set(0, id);
        set(1, configId);
        set(2, type);
        set(3, disable);
        set(4, createTime);
        set(5, updateTime);
    }
}
