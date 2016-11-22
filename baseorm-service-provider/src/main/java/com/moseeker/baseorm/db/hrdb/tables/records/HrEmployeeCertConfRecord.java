/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.hrdb.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;

import com.moseeker.baseorm.db.hrdb.tables.HrEmployeeCertConf;


/**
 * 部门员工配置表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrEmployeeCertConfRecord extends UpdatableRecordImpl<HrEmployeeCertConfRecord> implements Record14<Integer, Integer, Byte, String, Timestamp, Timestamp, Byte, Byte, Integer, Byte, String, String, String, String> {

    private static final long serialVersionUID = -1617818935;

    /**
     * Setter for <code>hrdb.hr_employee_cert_conf.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>hrdb.hr_employee_cert_conf.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>hrdb.hr_employee_cert_conf.company_id</code>. 所属公司 hr_company.id
     */
    public void setCompanyId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>hrdb.hr_employee_cert_conf.company_id</code>. 所属公司 hr_company.id
     */
    public Integer getCompanyId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>hrdb.hr_employee_cert_conf.is_strict</code>. 是否严格0：严格，1：不严格
     */
    public void setIsStrict(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>hrdb.hr_employee_cert_conf.is_strict</code>. 是否严格0：严格，1：不严格
     */
    public Byte getIsStrict() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>hrdb.hr_employee_cert_conf.email_suffix</code>. 邮箱后缀
     */
    public void setEmailSuffix(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>hrdb.hr_employee_cert_conf.email_suffix</code>. 邮箱后缀
     */
    public String getEmailSuffix() {
        return (String) get(3);
    }

    /**
     * Setter for <code>hrdb.hr_employee_cert_conf.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>hrdb.hr_employee_cert_conf.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>hrdb.hr_employee_cert_conf.update_time</code>. 修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>hrdb.hr_employee_cert_conf.update_time</code>. 修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>hrdb.hr_employee_cert_conf.disable</code>. 是否启用 0：启用1：禁用
     */
    public void setDisable(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>hrdb.hr_employee_cert_conf.disable</code>. 是否启用 0：启用1：禁用
     */
    public Byte getDisable() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>hrdb.hr_employee_cert_conf.bd_add_group</code>. 用户绑定时需要加入员工组Flag, 0:需要添加到员工组 1:不需要添加到员工组
     */
    public void setBdAddGroup(Byte value) {
        set(7, value);
    }

    /**
     * Getter for <code>hrdb.hr_employee_cert_conf.bd_add_group</code>. 用户绑定时需要加入员工组Flag, 0:需要添加到员工组 1:不需要添加到员工组
     */
    public Byte getBdAddGroup() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>hrdb.hr_employee_cert_conf.bd_use_group_id</code>. 用户绑定时需要加入员工组的分组编号
     */
    public void setBdUseGroupId(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>hrdb.hr_employee_cert_conf.bd_use_group_id</code>. 用户绑定时需要加入员工组的分组编号
     */
    public Integer getBdUseGroupId() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>hrdb.hr_employee_cert_conf.auth_mode</code>. 认证方式，0:不启用员工认证, 1:邮箱认证, 2:自定义认证, 3:姓名手机号认证, 4:邮箱自定义两种认证
     */
    public void setAuthMode(Byte value) {
        set(9, value);
    }

    /**
     * Getter for <code>hrdb.hr_employee_cert_conf.auth_mode</code>. 认证方式，0:不启用员工认证, 1:邮箱认证, 2:自定义认证, 3:姓名手机号认证, 4:邮箱自定义两种认证
     */
    public Byte getAuthMode() {
        return (Byte) get(9);
    }

    /**
     * Setter for <code>hrdb.hr_employee_cert_conf.auth_code</code>. 认证码（6到20位， 字母和数字组成，区分大小写）  默认为空
     */
    public void setAuthCode(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>hrdb.hr_employee_cert_conf.auth_code</code>. 认证码（6到20位， 字母和数字组成，区分大小写）  默认为空
     */
    public String getAuthCode() {
        return (String) get(10);
    }

    /**
     * Setter for <code>hrdb.hr_employee_cert_conf.custom</code>. 配置的自定义认证名称
     */
    public void setCustom(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>hrdb.hr_employee_cert_conf.custom</code>. 配置的自定义认证名称
     */
    public String getCustom() {
        return (String) get(11);
    }

    /**
     * Setter for <code>hrdb.hr_employee_cert_conf.questions</code>. 问答列表(json)
     */
    public void setQuestions(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>hrdb.hr_employee_cert_conf.questions</code>. 问答列表(json)
     */
    public String getQuestions() {
        return (String) get(12);
    }

    /**
     * Setter for <code>hrdb.hr_employee_cert_conf.custom_hint</code>. 自定义认证提示
     */
    public void setCustomHint(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>hrdb.hr_employee_cert_conf.custom_hint</code>. 自定义认证提示
     */
    public String getCustomHint() {
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
    public Row14<Integer, Integer, Byte, String, Timestamp, Timestamp, Byte, Byte, Integer, Byte, String, String, String, String> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Integer, Integer, Byte, String, Timestamp, Timestamp, Byte, Byte, Integer, Byte, String, String, String, String> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return HrEmployeeCertConf.HR_EMPLOYEE_CERT_CONF.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return HrEmployeeCertConf.HR_EMPLOYEE_CERT_CONF.COMPANY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return HrEmployeeCertConf.HR_EMPLOYEE_CERT_CONF.IS_STRICT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return HrEmployeeCertConf.HR_EMPLOYEE_CERT_CONF.EMAIL_SUFFIX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return HrEmployeeCertConf.HR_EMPLOYEE_CERT_CONF.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return HrEmployeeCertConf.HR_EMPLOYEE_CERT_CONF.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field7() {
        return HrEmployeeCertConf.HR_EMPLOYEE_CERT_CONF.DISABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field8() {
        return HrEmployeeCertConf.HR_EMPLOYEE_CERT_CONF.BD_ADD_GROUP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return HrEmployeeCertConf.HR_EMPLOYEE_CERT_CONF.BD_USE_GROUP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field10() {
        return HrEmployeeCertConf.HR_EMPLOYEE_CERT_CONF.AUTH_MODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return HrEmployeeCertConf.HR_EMPLOYEE_CERT_CONF.AUTH_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return HrEmployeeCertConf.HR_EMPLOYEE_CERT_CONF.CUSTOM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return HrEmployeeCertConf.HR_EMPLOYEE_CERT_CONF.QUESTIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return HrEmployeeCertConf.HR_EMPLOYEE_CERT_CONF.CUSTOM_HINT;
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
    public Byte value3() {
        return getIsStrict();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getEmailSuffix();
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
    public Byte value7() {
        return getDisable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value8() {
        return getBdAddGroup();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getBdUseGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value10() {
        return getAuthMode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getAuthCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getCustom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getQuestions();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getCustomHint();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrEmployeeCertConfRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrEmployeeCertConfRecord value2(Integer value) {
        setCompanyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrEmployeeCertConfRecord value3(Byte value) {
        setIsStrict(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrEmployeeCertConfRecord value4(String value) {
        setEmailSuffix(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrEmployeeCertConfRecord value5(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrEmployeeCertConfRecord value6(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrEmployeeCertConfRecord value7(Byte value) {
        setDisable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrEmployeeCertConfRecord value8(Byte value) {
        setBdAddGroup(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrEmployeeCertConfRecord value9(Integer value) {
        setBdUseGroupId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrEmployeeCertConfRecord value10(Byte value) {
        setAuthMode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrEmployeeCertConfRecord value11(String value) {
        setAuthCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrEmployeeCertConfRecord value12(String value) {
        setCustom(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrEmployeeCertConfRecord value13(String value) {
        setQuestions(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrEmployeeCertConfRecord value14(String value) {
        setCustomHint(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrEmployeeCertConfRecord values(Integer value1, Integer value2, Byte value3, String value4, Timestamp value5, Timestamp value6, Byte value7, Byte value8, Integer value9, Byte value10, String value11, String value12, String value13, String value14) {
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
     * Create a detached HrEmployeeCertConfRecord
     */
    public HrEmployeeCertConfRecord() {
        super(HrEmployeeCertConf.HR_EMPLOYEE_CERT_CONF);
    }

    /**
     * Create a detached, initialised HrEmployeeCertConfRecord
     */
    public HrEmployeeCertConfRecord(Integer id, Integer companyId, Byte isStrict, String emailSuffix, Timestamp createTime, Timestamp updateTime, Byte disable, Byte bdAddGroup, Integer bdUseGroupId, Byte authMode, String authCode, String custom, String questions, String customHint) {
        super(HrEmployeeCertConf.HR_EMPLOYEE_CERT_CONF);

        set(0, id);
        set(1, companyId);
        set(2, isStrict);
        set(3, emailSuffix);
        set(4, createTime);
        set(5, updateTime);
        set(6, disable);
        set(7, bdAddGroup);
        set(8, bdUseGroupId);
        set(9, authMode);
        set(10, authCode);
        set(11, custom);
        set(12, questions);
        set(13, customHint);
    }
}
