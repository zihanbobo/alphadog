/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.candidatedb.tables.records;


import com.moseeker.baseorm.db.candidatedb.tables.CandidateApplicationPsc;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 申请时员工一度的链路
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CandidateApplicationPscRecord extends UpdatableRecordImpl<CandidateApplicationPscRecord> implements Record3<Integer, Integer, Integer> {

    private static final long serialVersionUID = -388062517;

    /**
     * Setter for <code>candidatedb.candidate_application_psc.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>candidatedb.candidate_application_psc.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>candidatedb.candidate_application_psc.application_id</code>. job_application.id
     */
    public void setApplicationId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>candidatedb.candidate_application_psc.application_id</code>. job_application.id
     */
    public Integer getApplicationId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>candidatedb.candidate_application_psc.psc_id</code>. candidate_share_chain.id
     */
    public void setPscId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>candidatedb.candidate_application_psc.psc_id</code>. candidate_share_chain.id
     */
    public Integer getPscId() {
        return (Integer) get(2);
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
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CandidateApplicationPsc.CANDIDATE_APPLICATION_PSC.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return CandidateApplicationPsc.CANDIDATE_APPLICATION_PSC.APPLICATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return CandidateApplicationPsc.CANDIDATE_APPLICATION_PSC.PSC_ID;
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
        return getApplicationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getPscId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CandidateApplicationPscRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CandidateApplicationPscRecord value2(Integer value) {
        setApplicationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CandidateApplicationPscRecord value3(Integer value) {
        setPscId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CandidateApplicationPscRecord values(Integer value1, Integer value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CandidateApplicationPscRecord
     */
    public CandidateApplicationPscRecord() {
        super(CandidateApplicationPsc.CANDIDATE_APPLICATION_PSC);
    }

    /**
     * Create a detached, initialised CandidateApplicationPscRecord
     */
    public CandidateApplicationPscRecord(Integer id, Integer applicationId, Integer pscId) {
        super(CandidateApplicationPsc.CANDIDATE_APPLICATION_PSC);

        set(0, id);
        set(1, applicationId);
        set(2, pscId);
    }
}