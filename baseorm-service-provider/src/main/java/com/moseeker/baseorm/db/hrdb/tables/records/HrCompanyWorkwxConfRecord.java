/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.records;


import com.moseeker.baseorm.db.hrdb.tables.HrCompanyWorkwxConf;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * ä¼ä¸šå¾®ä¿¡é…ç½®
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrCompanyWorkwxConfRecord extends UpdatableRecordImpl<HrCompanyWorkwxConfRecord> implements Record12<Integer, Integer, String, String, String, Timestamp, Timestamp, Integer, String, Timestamp, Timestamp, Byte> {

    private static final long serialVersionUID = 603357593;

    /**
     * Setter for <code>hrdb.hr_company_workwx_conf.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>hrdb.hr_company_workwx_conf.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>hrdb.hr_company_workwx_conf.company_id</code>. å…³è”hr_company.id
     */
    public void setCompanyId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>hrdb.hr_company_workwx_conf.company_id</code>. å…³è”hr_company.id
     */
    public Integer getCompanyId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>hrdb.hr_company_workwx_conf.corpid</code>. ä¼ä¸šå¾®ä¿¡corpidï¼Œæ¥æºäºŽä¼ä¸šå¾®ä¿¡åŽå°é…ç½®
     */
    public void setCorpid(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>hrdb.hr_company_workwx_conf.corpid</code>. ä¼ä¸šå¾®ä¿¡corpidï¼Œæ¥æºäºŽä¼ä¸šå¾®ä¿¡åŽå°é…ç½®
     */
    public String getCorpid() {
        return (String) get(2);
    }

    /**
     * Setter for <code>hrdb.hr_company_workwx_conf.secret</code>. ä¼ä¸šå¾®ä¿¡corpsecretï¼Œæ¥æºäºŽä¼ä¸šå¾®ä¿¡åŽå°é…ç½®
     */
    public void setSecret(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>hrdb.hr_company_workwx_conf.secret</code>. ä¼ä¸šå¾®ä¿¡corpsecretï¼Œæ¥æºäºŽä¼ä¸šå¾®ä¿¡åŽå°é…ç½®
     */
    public String getSecret() {
        return (String) get(3);
    }

    /**
     * Setter for <code>hrdb.hr_company_workwx_conf.access_token</code>. access_token
     */
    public void setAccessToken(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>hrdb.hr_company_workwx_conf.access_token</code>. access_token
     */
    public String getAccessToken() {
        return (String) get(4);
    }

    /**
     * Setter for <code>hrdb.hr_company_workwx_conf.token_update_time</code>. access_tokenæœ€è¿‘èŽ·å–æ—¶é—´
     */
    public void setTokenUpdateTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>hrdb.hr_company_workwx_conf.token_update_time</code>. access_tokenæœ€è¿‘èŽ·å–æ—¶é—´
     */
    public Timestamp getTokenUpdateTime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>hrdb.hr_company_workwx_conf.token_expire_time</code>. access_tokenè¿‡æœŸæ—¶é—´
     */
    public void setTokenExpireTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>hrdb.hr_company_workwx_conf.token_expire_time</code>. access_tokenè¿‡æœŸæ—¶é—´
     */
    public Timestamp getTokenExpireTime() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>hrdb.hr_company_workwx_conf.error_code</code>. èŽ·å–tokenå¤±è´¥
     */
    public void setErrorCode(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>hrdb.hr_company_workwx_conf.error_code</code>. èŽ·å–tokenå¤±è´¥
     */
    public Integer getErrorCode() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>hrdb.hr_company_workwx_conf.error_msg</code>. èŽ·å–tokenå¤±è´¥
     */
    public void setErrorMsg(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>hrdb.hr_company_workwx_conf.error_msg</code>. èŽ·å–tokenå¤±è´¥
     */
    public String getErrorMsg() {
        return (String) get(8);
    }

    /**
     * Setter for <code>hrdb.hr_company_workwx_conf.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>hrdb.hr_company_workwx_conf.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>hrdb.hr_company_workwx_conf.update_time</code>.
     */
    public void setUpdateTime(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>hrdb.hr_company_workwx_conf.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>hrdb.hr_company_workwx_conf.disable</code>. æ˜¯å¦æœ‰æ•ˆ 1:æ— æ•ˆ 0ï¼šæœ‰æ•ˆ
     */
    public void setDisable(Byte value) {
        set(11, value);
    }

    /**
     * Getter for <code>hrdb.hr_company_workwx_conf.disable</code>. æ˜¯å¦æœ‰æ•ˆ 1:æ— æ•ˆ 0ï¼šæœ‰æ•ˆ
     */
    public Byte getDisable() {
        return (Byte) get(11);
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
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, Integer, String, String, String, Timestamp, Timestamp, Integer, String, Timestamp, Timestamp, Byte> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, Integer, String, String, String, Timestamp, Timestamp, Integer, String, Timestamp, Timestamp, Byte> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return HrCompanyWorkwxConf.HR_COMPANY_WORKWX_CONF.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return HrCompanyWorkwxConf.HR_COMPANY_WORKWX_CONF.COMPANY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return HrCompanyWorkwxConf.HR_COMPANY_WORKWX_CONF.CORPID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return HrCompanyWorkwxConf.HR_COMPANY_WORKWX_CONF.SECRET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return HrCompanyWorkwxConf.HR_COMPANY_WORKWX_CONF.ACCESS_TOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return HrCompanyWorkwxConf.HR_COMPANY_WORKWX_CONF.TOKEN_UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return HrCompanyWorkwxConf.HR_COMPANY_WORKWX_CONF.TOKEN_EXPIRE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return HrCompanyWorkwxConf.HR_COMPANY_WORKWX_CONF.ERROR_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return HrCompanyWorkwxConf.HR_COMPANY_WORKWX_CONF.ERROR_MSG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return HrCompanyWorkwxConf.HR_COMPANY_WORKWX_CONF.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return HrCompanyWorkwxConf.HR_COMPANY_WORKWX_CONF.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field12() {
        return HrCompanyWorkwxConf.HR_COMPANY_WORKWX_CONF.DISABLE;
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
        return getCompanyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCorpid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSecret();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getAccessToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getTokenUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getTokenExpireTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getErrorCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getErrorMsg();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value12() {
        return getDisable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCompanyWorkwxConfRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCompanyWorkwxConfRecord value2(Integer value) {
        setCompanyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCompanyWorkwxConfRecord value3(String value) {
        setCorpid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCompanyWorkwxConfRecord value4(String value) {
        setSecret(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCompanyWorkwxConfRecord value5(String value) {
        setAccessToken(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCompanyWorkwxConfRecord value6(Timestamp value) {
        setTokenUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCompanyWorkwxConfRecord value7(Timestamp value) {
        setTokenExpireTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCompanyWorkwxConfRecord value8(Integer value) {
        setErrorCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCompanyWorkwxConfRecord value9(String value) {
        setErrorMsg(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCompanyWorkwxConfRecord value10(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCompanyWorkwxConfRecord value11(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCompanyWorkwxConfRecord value12(Byte value) {
        setDisable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCompanyWorkwxConfRecord values(Integer value1, Integer value2, String value3, String value4, String value5, Timestamp value6, Timestamp value7, Integer value8, String value9, Timestamp value10, Timestamp value11, Byte value12) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HrCompanyWorkwxConfRecord
     */
    public HrCompanyWorkwxConfRecord() {
        super(HrCompanyWorkwxConf.HR_COMPANY_WORKWX_CONF);
    }

    /**
     * Create a detached, initialised HrCompanyWorkwxConfRecord
     */
    public HrCompanyWorkwxConfRecord(Integer id, Integer companyId, String corpid, String secret, String accessToken, Timestamp tokenUpdateTime, Timestamp tokenExpireTime, Integer errorCode, String errorMsg, Timestamp createTime, Timestamp updateTime, Byte disable) {
        super(HrCompanyWorkwxConf.HR_COMPANY_WORKWX_CONF);

        set(0, id);
        set(1, companyId);
        set(2, corpid);
        set(3, secret);
        set(4, accessToken);
        set(5, tokenUpdateTime);
        set(6, tokenExpireTime);
        set(7, errorCode);
        set(8, errorMsg);
        set(9, createTime);
        set(10, updateTime);
        set(11, disable);
    }
}
