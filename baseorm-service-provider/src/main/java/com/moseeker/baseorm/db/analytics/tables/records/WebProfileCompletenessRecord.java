/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.analytics.tables.records;


import com.moseeker.baseorm.db.analytics.tables.WebProfileCompleteness;

import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WebProfileCompletenessRecord extends UpdatableRecordImpl<WebProfileCompletenessRecord> implements Record4<Integer, Double, Integer, Date> {

    private static final long serialVersionUID = 739279853;

    /**
     * Setter for <code>analytics.web_profile_completeness.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>analytics.web_profile_completeness.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>analytics.web_profile_completeness.completeness_percent</code>.
     */
    public void setCompletenessPercent(Double value) {
        set(1, value);
    }

    /**
     * Getter for <code>analytics.web_profile_completeness.completeness_percent</code>.
     */
    public Double getCompletenessPercent() {
        return (Double) get(1);
    }

    /**
     * Setter for <code>analytics.web_profile_completeness.profile_count</code>.
     */
    public void setProfileCount(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>analytics.web_profile_completeness.profile_count</code>.
     */
    public Integer getProfileCount() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>analytics.web_profile_completeness.create_time</code>.
     */
    public void setCreateTime(Date value) {
        set(3, value);
    }

    /**
     * Getter for <code>analytics.web_profile_completeness.create_time</code>.
     */
    public Date getCreateTime() {
        return (Date) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Double, Integer, Date> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Double, Integer, Date> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return WebProfileCompleteness.WEB_PROFILE_COMPLETENESS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field2() {
        return WebProfileCompleteness.WEB_PROFILE_COMPLETENESS.COMPLETENESS_PERCENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return WebProfileCompleteness.WEB_PROFILE_COMPLETENESS.PROFILE_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field4() {
        return WebProfileCompleteness.WEB_PROFILE_COMPLETENESS.CREATE_TIME;
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
    public Double value2() {
        return getCompletenessPercent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getProfileCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value4() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebProfileCompletenessRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebProfileCompletenessRecord value2(Double value) {
        setCompletenessPercent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebProfileCompletenessRecord value3(Integer value) {
        setProfileCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebProfileCompletenessRecord value4(Date value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebProfileCompletenessRecord values(Integer value1, Double value2, Integer value3, Date value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached WebProfileCompletenessRecord
     */
    public WebProfileCompletenessRecord() {
        super(WebProfileCompleteness.WEB_PROFILE_COMPLETENESS);
    }

    /**
     * Create a detached, initialised WebProfileCompletenessRecord
     */
    public WebProfileCompletenessRecord(Integer id, Double completenessPercent, Integer profileCount, Date createTime) {
        super(WebProfileCompleteness.WEB_PROFILE_COMPLETENESS);

        set(0, id);
        set(1, completenessPercent);
        set(2, profileCount);
        set(3, createTime);
    }
}
