/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.userdb.tables.records;


import com.moseeker.baseorm.db.userdb.tables.UserHrAccount;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record22;
import org.jooq.Row22;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * hr账号表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserHrAccountRecord extends UpdatableRecordImpl<UserHrAccountRecord> implements Record22<Integer, Integer, String, String, Integer, String, String, Integer, Byte, Integer, Timestamp, String, Timestamp, String, Integer, Integer, String, Timestamp, Timestamp, String, Byte, String> {

    private static final long serialVersionUID = -108594834;

    /**
     * Setter for <code>userdb.user_hr_account.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>userdb.user_hr_account.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>userdb.user_hr_account.company_id</code>. company.id
     */
    public void setCompanyId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>userdb.user_hr_account.company_id</code>. company.id
     */
    public Integer getCompanyId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>userdb.user_hr_account.mobile</code>. 手机号码
     */
    public void setMobile(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>userdb.user_hr_account.mobile</code>. 手机号码
     */
    public String getMobile() {
        return (String) get(2);
    }

    /**
     * Setter for <code>userdb.user_hr_account.email</code>. 邮箱
     */
    public void setEmail(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>userdb.user_hr_account.email</code>. 邮箱
     */
    public String getEmail() {
        return (String) get(3);
    }

    /**
     * Setter for <code>userdb.user_hr_account.wxuser_id</code>. 绑定的微信账号
     */
    public void setWxuserId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>userdb.user_hr_account.wxuser_id</code>. 绑定的微信账号
     */
    public Integer getWxuserId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>userdb.user_hr_account.password</code>. 登录密码
     */
    public void setPassword(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>userdb.user_hr_account.password</code>. 登录密码
     */
    public String getPassword() {
        return (String) get(5);
    }

    /**
     * Setter for <code>userdb.user_hr_account.username</code>. 企业联系人
     */
    public void setUsername(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>userdb.user_hr_account.username</code>. 企业联系人
     */
    public String getUsername() {
        return (String) get(6);
    }

    /**
     * Setter for <code>userdb.user_hr_account.account_type</code>. 0 超级账号；1：子账号; 2：普通账号
     */
    public void setAccountType(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>userdb.user_hr_account.account_type</code>. 0 超级账号；1：子账号; 2：普通账号
     */
    public Integer getAccountType() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>userdb.user_hr_account.activation</code>. 子账号邀请使用，账号是否激活，1：激活；0：未激活
     */
    public void setActivation(Byte value) {
        set(8, value);
    }

    /**
     * Getter for <code>userdb.user_hr_account.activation</code>. 子账号邀请使用，账号是否激活，1：激活；0：未激活
     */
    public Byte getActivation() {
        return (Byte) get(8);
    }

    /**
     * Setter for <code>userdb.user_hr_account.disable</code>. 1：可用账号；0禁用账号 ） 遵循数据库整体的设计习惯，1表示可用，0表示不可用
     */
    public void setDisable(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>userdb.user_hr_account.disable</code>. 1：可用账号；0禁用账号 ） 遵循数据库整体的设计习惯，1表示可用，0表示不可用
     */
    public Integer getDisable() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>userdb.user_hr_account.register_time</code>. 注册时间
     */
    public void setRegisterTime(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>userdb.user_hr_account.register_time</code>. 注册时间
     */
    public Timestamp getRegisterTime() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>userdb.user_hr_account.register_ip</code>. 注册时的IP地址
     */
    public void setRegisterIp(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>userdb.user_hr_account.register_ip</code>. 注册时的IP地址
     */
    public String getRegisterIp() {
        return (String) get(11);
    }

    /**
     * Setter for <code>userdb.user_hr_account.last_login_time</code>. 最后的登录时间
     */
    public void setLastLoginTime(Timestamp value) {
        set(12, value);
    }

    /**
     * Getter for <code>userdb.user_hr_account.last_login_time</code>. 最后的登录时间
     */
    public Timestamp getLastLoginTime() {
        return (Timestamp) get(12);
    }

    /**
     * Setter for <code>userdb.user_hr_account.last_login_ip</code>. 最后一次登录的IP
     */
    public void setLastLoginIp(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>userdb.user_hr_account.last_login_ip</code>. 最后一次登录的IP
     */
    public String getLastLoginIp() {
        return (String) get(13);
    }

    /**
     * Setter for <code>userdb.user_hr_account.login_count</code>. 登录次数
     */
    public void setLoginCount(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>userdb.user_hr_account.login_count</code>. 登录次数
     */
    public Integer getLoginCount() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>userdb.user_hr_account.source</code>. 来源1:雇主 2:官网 3:微信扫描 4:我也要招人(聚合号) 5:我也要招人(企业号) 6:我也要招人(手机官网)
     */
    public void setSource(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>userdb.user_hr_account.source</code>. 来源1:雇主 2:官网 3:微信扫描 4:我也要招人(聚合号) 5:我也要招人(企业号) 6:我也要招人(手机官网)
     */
    public Integer getSource() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>userdb.user_hr_account.download_token</code>. 下载行业报告校验码
     */
    public void setDownloadToken(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>userdb.user_hr_account.download_token</code>. 下载行业报告校验码
     */
    public String getDownloadToken() {
        return (String) get(16);
    }

    /**
     * Setter for <code>userdb.user_hr_account.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(17, value);
    }

    /**
     * Getter for <code>userdb.user_hr_account.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(17);
    }

    /**
     * Setter for <code>userdb.user_hr_account.update_time</code>. 修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(18, value);
    }

    /**
     * Getter for <code>userdb.user_hr_account.update_time</code>. 修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(18);
    }

    /**
     * Setter for <code>userdb.user_hr_account.headimgurl</code>. 头像 url
     */
    public void setHeadimgurl(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>userdb.user_hr_account.headimgurl</code>. 头像 url
     */
    public String getHeadimgurl() {
        return (String) get(19);
    }

    /**
     * Setter for <code>userdb.user_hr_account.leave_to_mobot</code>. HR聊天是否托管给智能招聘助手，0 不托管，1 托管
     */
    public void setLeaveToMobot(Byte value) {
        set(20, value);
    }

    /**
     * Getter for <code>userdb.user_hr_account.leave_to_mobot</code>. HR聊天是否托管给智能招聘助手，0 不托管，1 托管
     */
    public Byte getLeaveToMobot() {
        return (Byte) get(20);
    }

    /**
     * Setter for <code>userdb.user_hr_account.remark_name</code>. 备注名，是由HR主账号设置的对外显示名称，暂时在微信端聊天时使用到，即C端用户看到的HR名称
     */
    public void setRemarkName(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>userdb.user_hr_account.remark_name</code>. 备注名，是由HR主账号设置的对外显示名称，暂时在微信端聊天时使用到，即C端用户看到的HR名称
     */
    public String getRemarkName() {
        return (String) get(21);
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
    // Record22 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row22<Integer, Integer, String, String, Integer, String, String, Integer, Byte, Integer, Timestamp, String, Timestamp, String, Integer, Integer, String, Timestamp, Timestamp, String, Byte, String> fieldsRow() {
        return (Row22) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row22<Integer, Integer, String, String, Integer, String, String, Integer, Byte, Integer, Timestamp, String, Timestamp, String, Integer, Integer, String, Timestamp, Timestamp, String, Byte, String> valuesRow() {
        return (Row22) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return UserHrAccount.USER_HR_ACCOUNT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return UserHrAccount.USER_HR_ACCOUNT.COMPANY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return UserHrAccount.USER_HR_ACCOUNT.MOBILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return UserHrAccount.USER_HR_ACCOUNT.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return UserHrAccount.USER_HR_ACCOUNT.WXUSER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return UserHrAccount.USER_HR_ACCOUNT.PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return UserHrAccount.USER_HR_ACCOUNT.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return UserHrAccount.USER_HR_ACCOUNT.ACCOUNT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field9() {
        return UserHrAccount.USER_HR_ACCOUNT.ACTIVATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return UserHrAccount.USER_HR_ACCOUNT.DISABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return UserHrAccount.USER_HR_ACCOUNT.REGISTER_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return UserHrAccount.USER_HR_ACCOUNT.REGISTER_IP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field13() {
        return UserHrAccount.USER_HR_ACCOUNT.LAST_LOGIN_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return UserHrAccount.USER_HR_ACCOUNT.LAST_LOGIN_IP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field15() {
        return UserHrAccount.USER_HR_ACCOUNT.LOGIN_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field16() {
        return UserHrAccount.USER_HR_ACCOUNT.SOURCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return UserHrAccount.USER_HR_ACCOUNT.DOWNLOAD_TOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field18() {
        return UserHrAccount.USER_HR_ACCOUNT.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field19() {
        return UserHrAccount.USER_HR_ACCOUNT.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field20() {
        return UserHrAccount.USER_HR_ACCOUNT.HEADIMGURL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field21() {
        return UserHrAccount.USER_HR_ACCOUNT.LEAVE_TO_MOBOT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field22() {
        return UserHrAccount.USER_HR_ACCOUNT.REMARK_NAME;
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
        return getMobile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getWxuserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getAccountType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value9() {
        return getActivation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getDisable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getRegisterTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getRegisterIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value13() {
        return getLastLoginTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getLastLoginIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value15() {
        return getLoginCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value16() {
        return getSource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getDownloadToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value18() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value19() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value20() {
        return getHeadimgurl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value21() {
        return getLeaveToMobot();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value22() {
        return getRemarkName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserHrAccountRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserHrAccountRecord value2(Integer value) {
        setCompanyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserHrAccountRecord value3(String value) {
        setMobile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserHrAccountRecord value4(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserHrAccountRecord value5(Integer value) {
        setWxuserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserHrAccountRecord value6(String value) {
        setPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserHrAccountRecord value7(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserHrAccountRecord value8(Integer value) {
        setAccountType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserHrAccountRecord value9(Byte value) {
        setActivation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserHrAccountRecord value10(Integer value) {
        setDisable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserHrAccountRecord value11(Timestamp value) {
        setRegisterTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserHrAccountRecord value12(String value) {
        setRegisterIp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserHrAccountRecord value13(Timestamp value) {
        setLastLoginTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserHrAccountRecord value14(String value) {
        setLastLoginIp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserHrAccountRecord value15(Integer value) {
        setLoginCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserHrAccountRecord value16(Integer value) {
        setSource(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserHrAccountRecord value17(String value) {
        setDownloadToken(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserHrAccountRecord value18(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserHrAccountRecord value19(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserHrAccountRecord value20(String value) {
        setHeadimgurl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserHrAccountRecord value21(Byte value) {
        setLeaveToMobot(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserHrAccountRecord value22(String value) {
        setRemarkName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserHrAccountRecord values(Integer value1, Integer value2, String value3, String value4, Integer value5, String value6, String value7, Integer value8, Byte value9, Integer value10, Timestamp value11, String value12, Timestamp value13, String value14, Integer value15, Integer value16, String value17, Timestamp value18, Timestamp value19, String value20, Byte value21, String value22) {
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
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        value22(value22);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserHrAccountRecord
     */
    public UserHrAccountRecord() {
        super(UserHrAccount.USER_HR_ACCOUNT);
    }

    /**
     * Create a detached, initialised UserHrAccountRecord
     */
    public UserHrAccountRecord(Integer id, Integer companyId, String mobile, String email, Integer wxuserId, String password, String username, Integer accountType, Byte activation, Integer disable, Timestamp registerTime, String registerIp, Timestamp lastLoginTime, String lastLoginIp, Integer loginCount, Integer source, String downloadToken, Timestamp createTime, Timestamp updateTime, String headimgurl, Byte leaveToMobot, String remarkName) {
        super(UserHrAccount.USER_HR_ACCOUNT);

        set(0, id);
        set(1, companyId);
        set(2, mobile);
        set(3, email);
        set(4, wxuserId);
        set(5, password);
        set(6, username);
        set(7, accountType);
        set(8, activation);
        set(9, disable);
        set(10, registerTime);
        set(11, registerIp);
        set(12, lastLoginTime);
        set(13, lastLoginIp);
        set(14, loginCount);
        set(15, source);
        set(16, downloadToken);
        set(17, createTime);
        set(18, updateTime);
        set(19, headimgurl);
        set(20, leaveToMobot);
        set(21, remarkName);
    }
}
