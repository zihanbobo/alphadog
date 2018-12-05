/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.records;


import com.moseeker.baseorm.db.hrdb.tables.HrCompanyAccountCopy;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 账号公司关联记录
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrCompanyAccountCopyRecord extends UpdatableRecordImpl<HrCompanyAccountCopyRecord> implements Record2<Integer, Integer> {

    private static final long serialVersionUID = 1503900696;

    /**
     * Setter for <code>hrdb.hr_company_account_copy.company_id</code>. hr_company.id
     */
    public void setCompanyId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>hrdb.hr_company_account_copy.company_id</code>. hr_company.id
     */
    public Integer getCompanyId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>hrdb.hr_company_account_copy.account_id</code>. user_hr_account.id
     */
    public void setAccountId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>hrdb.hr_company_account_copy.account_id</code>. user_hr_account.id
     */
    public Integer getAccountId() {
        return (Integer) get(1);
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
    public Row2<Integer, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, Integer> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return HrCompanyAccountCopy.HR_COMPANY_ACCOUNT_COPY.COMPANY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return HrCompanyAccountCopy.HR_COMPANY_ACCOUNT_COPY.ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getCompanyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCompanyAccountCopyRecord value1(Integer value) {
        setCompanyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCompanyAccountCopyRecord value2(Integer value) {
        setAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCompanyAccountCopyRecord values(Integer value1, Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HrCompanyAccountCopyRecord
     */
    public HrCompanyAccountCopyRecord() {
        super(HrCompanyAccountCopy.HR_COMPANY_ACCOUNT_COPY);
    }

    /**
     * Create a detached, initialised HrCompanyAccountCopyRecord
     */
    public HrCompanyAccountCopyRecord(Integer companyId, Integer accountId) {
        super(HrCompanyAccountCopy.HR_COMPANY_ACCOUNT_COPY);

        set(0, companyId);
        set(1, accountId);
    }
}