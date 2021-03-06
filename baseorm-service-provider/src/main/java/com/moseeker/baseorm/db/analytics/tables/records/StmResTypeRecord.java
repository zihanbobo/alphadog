/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.analytics.tables.records;


import com.moseeker.baseorm.db.analytics.tables.StmResType;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 返回类型表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StmResTypeRecord extends UpdatableRecordImpl<StmResTypeRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = -1038672509;

    /**
     * Setter for <code>analytics.stm_res_type.id</code>. 主键
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>analytics.stm_res_type.id</code>. 主键
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>analytics.stm_res_type.res_type</code>. 返回类型(html,xml)
     */
    public void setResType(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>analytics.stm_res_type.res_type</code>. 返回类型(html,xml)
     */
    public String getResType() {
        return (String) get(1);
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
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return StmResType.STM_RES_TYPE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return StmResType.STM_RES_TYPE.RES_TYPE;
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
        return getResType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmResTypeRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmResTypeRecord value2(String value) {
        setResType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmResTypeRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StmResTypeRecord
     */
    public StmResTypeRecord() {
        super(StmResType.STM_RES_TYPE);
    }

    /**
     * Create a detached, initialised StmResTypeRecord
     */
    public StmResTypeRecord(Integer id, String resType) {
        super(StmResType.STM_RES_TYPE);

        set(0, id);
        set(1, resType);
    }
}
