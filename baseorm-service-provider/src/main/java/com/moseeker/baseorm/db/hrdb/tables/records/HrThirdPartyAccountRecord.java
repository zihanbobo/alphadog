/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.records;


import com.moseeker.baseorm.db.hrdb.tables.HrThirdPartyAccount;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 第三方渠道帐号
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrThirdPartyAccountRecord extends UpdatableRecordImpl<HrThirdPartyAccountRecord> implements Record14<Integer, Short, String, String, String, Short, Integer, Integer, Timestamp, Timestamp, Timestamp, Integer, String, String> {

    private static final long serialVersionUID = 325754320;

    /**
     * Setter for <code>hrdb.hr_third_party_account.id</code>. 编号
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_account.id</code>. 编号
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_account.channel</code>. 1=51job,2=猎聘,3=智联,4=linkedin
     */
    public void setChannel(Short value) {
        set(1, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_account.channel</code>. 1=51job,2=猎聘,3=智联,4=linkedin
     */
    public Short getChannel() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_account.username</code>. 帐号
     */
    public void setUsername(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_account.username</code>. 帐号
     */
    public String getUsername() {
        return (String) get(2);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_account.password</code>. 密码
     */
    public void setPassword(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_account.password</code>. 密码
     */
    public String getPassword() {
        return (String) get(3);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_account.membername</code>. 会员名称
     */
    public void setMembername(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_account.membername</code>. 会员名称
     */
    public String getMembername() {
        return (String) get(4);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_account.binding</code>. 0=未绑定,1=绑定,2=绑定中，3=绑定失败
     */
    public void setBinding(Short value) {
        set(5, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_account.binding</code>. 0=未绑定,1=绑定,2=绑定中，3=绑定失败
     */
    public Short getBinding() {
        return (Short) get(5);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_account.company_id</code>. hrdb.hr_company.id
     */
    public void setCompanyId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_account.company_id</code>. hrdb.hr_company.id
     */
    public Integer getCompanyId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_account.remain_num</code>. 点数
     */
    public void setRemainNum(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_account.remain_num</code>. 点数
     */
    public Integer getRemainNum() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_account.sync_time</code>. 同步时间
     */
    public void setSyncTime(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_account.sync_time</code>. 同步时间
     */
    public Timestamp getSyncTime() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_account.update_time</code>. 数据更新时间
     */
    public void setUpdateTime(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_account.update_time</code>. 数据更新时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_account.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_account.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_account.remain_profile_num</code>. 第三方账号剩余简历数
     */
    public void setRemainProfileNum(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_account.remain_profile_num</code>. 第三方账号剩余简历数
     */
    public Integer getRemainProfileNum() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_account.error_message</code>. 同步刷新失败的理由
     */
    public void setErrorMessage(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_account.error_message</code>. 同步刷新失败的理由
     */
    public String getErrorMessage() {
        return (String) get(12);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_account.ext</code>. 扩展字段，以防在登录时需要除了账号密码以外的信息。一揽人才：安全码、51job：会员名称
     */
    public void setExt(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_account.ext</code>. 扩展字段，以防在登录时需要除了账号密码以外的信息。一揽人才：安全码、51job：会员名称
     */
    public String getExt() {
        return (String) get(13);
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
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Integer, Short, String, String, String, Short, Integer, Integer, Timestamp, Timestamp, Timestamp, Integer, String, String> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Integer, Short, String, String, String, Short, Integer, Integer, Timestamp, Timestamp, Timestamp, Integer, String, String> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return HrThirdPartyAccount.HR_THIRD_PARTY_ACCOUNT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field2() {
        return HrThirdPartyAccount.HR_THIRD_PARTY_ACCOUNT.CHANNEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return HrThirdPartyAccount.HR_THIRD_PARTY_ACCOUNT.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return HrThirdPartyAccount.HR_THIRD_PARTY_ACCOUNT.PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return HrThirdPartyAccount.HR_THIRD_PARTY_ACCOUNT.MEMBERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field6() {
        return HrThirdPartyAccount.HR_THIRD_PARTY_ACCOUNT.BINDING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return HrThirdPartyAccount.HR_THIRD_PARTY_ACCOUNT.COMPANY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return HrThirdPartyAccount.HR_THIRD_PARTY_ACCOUNT.REMAIN_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return HrThirdPartyAccount.HR_THIRD_PARTY_ACCOUNT.SYNC_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return HrThirdPartyAccount.HR_THIRD_PARTY_ACCOUNT.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return HrThirdPartyAccount.HR_THIRD_PARTY_ACCOUNT.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return HrThirdPartyAccount.HR_THIRD_PARTY_ACCOUNT.REMAIN_PROFILE_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return HrThirdPartyAccount.HR_THIRD_PARTY_ACCOUNT.ERROR_MESSAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return HrThirdPartyAccount.HR_THIRD_PARTY_ACCOUNT.EXT;
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
    public Short value2() {
        return getChannel();
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
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getMembername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value6() {
        return getBinding();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getCompanyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getRemainNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getSyncTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getRemainProfileNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getErrorMessage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getExt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrThirdPartyAccountRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrThirdPartyAccountRecord value2(Short value) {
        setChannel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrThirdPartyAccountRecord value3(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrThirdPartyAccountRecord value4(String value) {
        setPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrThirdPartyAccountRecord value5(String value) {
        setMembername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrThirdPartyAccountRecord value6(Short value) {
        setBinding(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrThirdPartyAccountRecord value7(Integer value) {
        setCompanyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrThirdPartyAccountRecord value8(Integer value) {
        setRemainNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrThirdPartyAccountRecord value9(Timestamp value) {
        setSyncTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrThirdPartyAccountRecord value10(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrThirdPartyAccountRecord value11(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrThirdPartyAccountRecord value12(Integer value) {
        setRemainProfileNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrThirdPartyAccountRecord value13(String value) {
        setErrorMessage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrThirdPartyAccountRecord value14(String value) {
        setExt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrThirdPartyAccountRecord values(Integer value1, Short value2, String value3, String value4, String value5, Short value6, Integer value7, Integer value8, Timestamp value9, Timestamp value10, Timestamp value11, Integer value12, String value13, String value14) {
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
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HrThirdPartyAccountRecord
     */
    public HrThirdPartyAccountRecord() {
        super(HrThirdPartyAccount.HR_THIRD_PARTY_ACCOUNT);
    }

    /**
     * Create a detached, initialised HrThirdPartyAccountRecord
     */
    public HrThirdPartyAccountRecord(Integer id, Short channel, String username, String password, String membername, Short binding, Integer companyId, Integer remainNum, Timestamp syncTime, Timestamp updateTime, Timestamp createTime, Integer remainProfileNum, String errorMessage, String ext) {
        super(HrThirdPartyAccount.HR_THIRD_PARTY_ACCOUNT);

        set(0, id);
        set(1, channel);
        set(2, username);
        set(3, password);
        set(4, membername);
        set(5, binding);
        set(6, companyId);
        set(7, remainNum);
        set(8, syncTime);
        set(9, updateTime);
        set(10, createTime);
        set(11, remainProfileNum);
        set(12, errorMessage);
        set(13, ext);
    }
}
