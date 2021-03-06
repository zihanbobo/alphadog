/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.records;


import com.moseeker.baseorm.db.hrdb.tables.HrNpsRecommend;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * hr推荐同行表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrNpsRecommendRecord extends UpdatableRecordImpl<HrNpsRecommendRecord> implements Record6<Integer, Integer, String, String, String, Timestamp> {

    private static final long serialVersionUID = -1707605918;

    /**
     * Setter for <code>hrdb.hr_nps_recommend.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>hrdb.hr_nps_recommend.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>hrdb.hr_nps_recommend.hr_nps_id</code>. hr_nps调研id
     */
    public void setHrNpsId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>hrdb.hr_nps_recommend.hr_nps_id</code>. hr_nps调研id
     */
    public Integer getHrNpsId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>hrdb.hr_nps_recommend.username</code>. 推荐的用户
     */
    public void setUsername(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>hrdb.hr_nps_recommend.username</code>. 推荐的用户
     */
    public String getUsername() {
        return (String) get(2);
    }

    /**
     * Setter for <code>hrdb.hr_nps_recommend.mobile</code>.  推荐的用户的手机号
     */
    public void setMobile(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>hrdb.hr_nps_recommend.mobile</code>.  推荐的用户的手机号
     */
    public String getMobile() {
        return (String) get(3);
    }

    /**
     * Setter for <code>hrdb.hr_nps_recommend.company</code>. 推荐的用户所属公司
     */
    public void setCompany(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>hrdb.hr_nps_recommend.company</code>. 推荐的用户所属公司
     */
    public String getCompany() {
        return (String) get(4);
    }

    /**
     * Setter for <code>hrdb.hr_nps_recommend.create_time</code>. 推荐的时间
     */
    public void setCreateTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>hrdb.hr_nps_recommend.create_time</code>. 推荐的时间
     */
    public Timestamp getCreateTime() {
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
    public Row6<Integer, Integer, String, String, String, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, String, String, String, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return HrNpsRecommend.HR_NPS_RECOMMEND.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return HrNpsRecommend.HR_NPS_RECOMMEND.HR_NPS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return HrNpsRecommend.HR_NPS_RECOMMEND.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return HrNpsRecommend.HR_NPS_RECOMMEND.MOBILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return HrNpsRecommend.HR_NPS_RECOMMEND.COMPANY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return HrNpsRecommend.HR_NPS_RECOMMEND.CREATE_TIME;
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
        return getHrNpsId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getMobile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCompany();
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
    public HrNpsRecommendRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrNpsRecommendRecord value2(Integer value) {
        setHrNpsId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrNpsRecommendRecord value3(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrNpsRecommendRecord value4(String value) {
        setMobile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrNpsRecommendRecord value5(String value) {
        setCompany(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrNpsRecommendRecord value6(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrNpsRecommendRecord values(Integer value1, Integer value2, String value3, String value4, String value5, Timestamp value6) {
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
     * Create a detached HrNpsRecommendRecord
     */
    public HrNpsRecommendRecord() {
        super(HrNpsRecommend.HR_NPS_RECOMMEND);
    }

    /**
     * Create a detached, initialised HrNpsRecommendRecord
     */
    public HrNpsRecommendRecord(Integer id, Integer hrNpsId, String username, String mobile, String company, Timestamp createTime) {
        super(HrNpsRecommend.HR_NPS_RECOMMEND);

        set(0, id);
        set(1, hrNpsId);
        set(2, username);
        set(3, mobile);
        set(4, company);
        set(5, createTime);
    }
}
