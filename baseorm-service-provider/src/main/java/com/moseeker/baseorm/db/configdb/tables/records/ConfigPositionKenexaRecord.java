/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.configdb.tables.records;


import com.moseeker.baseorm.db.configdb.tables.ConfigPositionKenexa;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * kenexa职位字段映射表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ConfigPositionKenexaRecord extends UpdatableRecordImpl<ConfigPositionKenexaRecord> implements Record8<Integer, Integer, String, String, Integer, Timestamp, Timestamp, Integer> {

    private static final long serialVersionUID = 1151086708;

    /**
     * Setter for <code>configdb.config_position_kenexa.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>configdb.config_position_kenexa.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>configdb.config_position_kenexa.source_id</code>. ATS来源ID
     */
    public void setSourceId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>configdb.config_position_kenexa.source_id</code>. ATS来源ID
     */
    public Integer getSourceId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>configdb.config_position_kenexa.position_column</code>. 职位表字段名,  _ 暂未设置
     */
    public void setPositionColumn(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>configdb.config_position_kenexa.position_column</code>. 职位表字段名,  _ 暂未设置
     */
    public String getPositionColumn() {
        return (String) get(2);
    }

    /**
     * Setter for <code>configdb.config_position_kenexa.kenexa_job_id</code>. kenexa对应的JOB字段ID
     */
    public void setKenexaJobId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>configdb.config_position_kenexa.kenexa_job_id</code>. kenexa对应的JOB字段ID
     */
    public String getKenexaJobId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>configdb.config_position_kenexa.disable</code>. 是否有效，0：有效，1：无效
     */
    public void setDisable(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>configdb.config_position_kenexa.disable</code>. 是否有效，0：有效，1：无效
     */
    public Integer getDisable() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>configdb.config_position_kenexa.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>configdb.config_position_kenexa.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>configdb.config_position_kenexa.update_time</code>. 修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>configdb.config_position_kenexa.update_time</code>. 修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>configdb.config_position_kenexa.app_tpl_id</code>. 模板Id
     */
    public void setAppTplId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>configdb.config_position_kenexa.app_tpl_id</code>. 模板Id
     */
    public Integer getAppTplId() {
        return (Integer) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, String, String, Integer, Timestamp, Timestamp, Integer> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, String, String, Integer, Timestamp, Timestamp, Integer> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ConfigPositionKenexa.CONFIG_POSITION_KENEXA.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ConfigPositionKenexa.CONFIG_POSITION_KENEXA.SOURCE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ConfigPositionKenexa.CONFIG_POSITION_KENEXA.POSITION_COLUMN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ConfigPositionKenexa.CONFIG_POSITION_KENEXA.KENEXA_JOB_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return ConfigPositionKenexa.CONFIG_POSITION_KENEXA.DISABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return ConfigPositionKenexa.CONFIG_POSITION_KENEXA.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return ConfigPositionKenexa.CONFIG_POSITION_KENEXA.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return ConfigPositionKenexa.CONFIG_POSITION_KENEXA.APP_TPL_ID;
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
        return getSourceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPositionColumn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getKenexaJobId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getDisable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getAppTplId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigPositionKenexaRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigPositionKenexaRecord value2(Integer value) {
        setSourceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigPositionKenexaRecord value3(String value) {
        setPositionColumn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigPositionKenexaRecord value4(String value) {
        setKenexaJobId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigPositionKenexaRecord value5(Integer value) {
        setDisable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigPositionKenexaRecord value6(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigPositionKenexaRecord value7(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigPositionKenexaRecord value8(Integer value) {
        setAppTplId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigPositionKenexaRecord values(Integer value1, Integer value2, String value3, String value4, Integer value5, Timestamp value6, Timestamp value7, Integer value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ConfigPositionKenexaRecord
     */
    public ConfigPositionKenexaRecord() {
        super(ConfigPositionKenexa.CONFIG_POSITION_KENEXA);
    }

    /**
     * Create a detached, initialised ConfigPositionKenexaRecord
     */
    public ConfigPositionKenexaRecord(Integer id, Integer sourceId, String positionColumn, String kenexaJobId, Integer disable, Timestamp createTime, Timestamp updateTime, Integer appTplId) {
        super(ConfigPositionKenexa.CONFIG_POSITION_KENEXA);

        set(0, id);
        set(1, sourceId);
        set(2, positionColumn);
        set(3, kenexaJobId);
        set(4, disable);
        set(5, createTime);
        set(6, updateTime);
        set(7, appTplId);
    }
}
