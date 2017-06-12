/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.analytics.tables.records;


import com.moseeker.baseorm.db.analytics.tables.StmHrEvent;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record19;
import org.jooq.Row19;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 请求事件元数据表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StmHrEventRecord extends UpdatableRecordImpl<StmHrEventRecord> implements Record19<Integer, Integer, Integer, Integer, Integer, String, Integer, String, String, String, String, String, Integer, String, String, String, String, Timestamp, String> {

    private static final long serialVersionUID = 98814714;

    /**
     * Setter for <code>analytics.stm_hr_event.id</code>. primary key
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>analytics.stm_hr_event.id</code>. primary key
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>analytics.stm_hr_event.req_type_id</code>. 请求类型外键
     */
    public void setReqTypeId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>analytics.stm_hr_event.req_type_id</code>. 请求类型外键
     */
    public Integer getReqTypeId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>analytics.stm_hr_event.status_code</code>. 状态码 (200.404,etc)
     */
    public void setStatusCode(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>analytics.stm_hr_event.status_code</code>. 状态码 (200.404,etc)
     */
    public Integer getStatusCode() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>analytics.stm_hr_event.wechat_id</code>. 微信公共号id
     */
    public void setWechatId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>analytics.stm_hr_event.wechat_id</code>. 微信公共号id
     */
    public Integer getWechatId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>analytics.stm_hr_event.res_type_id</code>. 返回类型外键
     */
    public void setResTypeId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>analytics.stm_hr_event.res_type_id</code>. 返回类型外键
     */
    public Integer getResTypeId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>analytics.stm_hr_event.handler</code>. handler处理文件
     */
    public void setHandler(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>analytics.stm_hr_event.handler</code>. handler处理文件
     */
    public String getHandler() {
        return (String) get(5);
    }

    /**
     * Setter for <code>analytics.stm_hr_event.wechat_type</code>. 微信公共号类型
     */
    public void setWechatType(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>analytics.stm_hr_event.wechat_type</code>. 微信公共号类型
     */
    public Integer getWechatType() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>analytics.stm_hr_event.department_id</code>. 部门id
     */
    public void setDepartmentId(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>analytics.stm_hr_event.department_id</code>. 部门id
     */
    public String getDepartmentId() {
        return (String) get(7);
    }

    /**
     * Setter for <code>analytics.stm_hr_event.employee_id</code>. 职员id
     */
    public void setEmployeeId(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>analytics.stm_hr_event.employee_id</code>. 职员id
     */
    public String getEmployeeId() {
        return (String) get(8);
    }

    /**
     * Setter for <code>analytics.stm_hr_event.res_content</code>. 返回内容
     */
    public void setResContent(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>analytics.stm_hr_event.res_content</code>. 返回内容
     */
    public String getResContent() {
        return (String) get(9);
    }

    /**
     * Setter for <code>analytics.stm_hr_event.req_uri</code>. 请求uri
     */
    public void setReqUri(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>analytics.stm_hr_event.req_uri</code>. 请求uri
     */
    public String getReqUri() {
        return (String) get(10);
    }

    /**
     * Setter for <code>analytics.stm_hr_event.req_params</code>. 请求参数
     */
    public void setReqParams(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>analytics.stm_hr_event.req_params</code>. 请求参数
     */
    public String getReqParams() {
        return (String) get(11);
    }

    /**
     * Setter for <code>analytics.stm_hr_event.event_id</code>. 事件类型外键
     */
    public void setEventId(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>analytics.stm_hr_event.event_id</code>. 事件类型外键
     */
    public Integer getEventId() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>analytics.stm_hr_event.remote_ip</code>.
     */
    public void setRemoteIp(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>analytics.stm_hr_event.remote_ip</code>.
     */
    public String getRemoteIp() {
        return (String) get(13);
    }

    /**
     * Setter for <code>analytics.stm_hr_event.session_id</code>. session id
     */
    public void setSessionId(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>analytics.stm_hr_event.session_id</code>. session id
     */
    public String getSessionId() {
        return (String) get(14);
    }

    /**
     * Setter for <code>analytics.stm_hr_event.sys_user_cookie</code>. 用户的cookie内容
     */
    public void setSysUserCookie(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>analytics.stm_hr_event.sys_user_cookie</code>. 用户的cookie内容
     */
    public String getSysUserCookie() {
        return (String) get(15);
    }

    /**
     * Setter for <code>analytics.stm_hr_event.useragent</code>. 客户端user agent
     */
    public void setUseragent(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>analytics.stm_hr_event.useragent</code>. 客户端user agent
     */
    public String getUseragent() {
        return (String) get(16);
    }

    /**
     * Setter for <code>analytics.stm_hr_event.create_time</code>. 日志记录创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(17, value);
    }

    /**
     * Getter for <code>analytics.stm_hr_event.create_time</code>. 日志记录创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(17);
    }

    /**
     * Setter for <code>analytics.stm_hr_event.referer</code>. 来源
     */
    public void setReferer(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>analytics.stm_hr_event.referer</code>. 来源
     */
    public String getReferer() {
        return (String) get(18);
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
    // Record19 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row19<Integer, Integer, Integer, Integer, Integer, String, Integer, String, String, String, String, String, Integer, String, String, String, String, Timestamp, String> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row19<Integer, Integer, Integer, Integer, Integer, String, Integer, String, String, String, String, String, Integer, String, String, String, String, Timestamp, String> valuesRow() {
        return (Row19) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return StmHrEvent.STM_HR_EVENT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return StmHrEvent.STM_HR_EVENT.REQ_TYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return StmHrEvent.STM_HR_EVENT.STATUS_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return StmHrEvent.STM_HR_EVENT.WECHAT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return StmHrEvent.STM_HR_EVENT.RES_TYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return StmHrEvent.STM_HR_EVENT.HANDLER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return StmHrEvent.STM_HR_EVENT.WECHAT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return StmHrEvent.STM_HR_EVENT.DEPARTMENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return StmHrEvent.STM_HR_EVENT.EMPLOYEE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return StmHrEvent.STM_HR_EVENT.RES_CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return StmHrEvent.STM_HR_EVENT.REQ_URI;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return StmHrEvent.STM_HR_EVENT.REQ_PARAMS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field13() {
        return StmHrEvent.STM_HR_EVENT.EVENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return StmHrEvent.STM_HR_EVENT.REMOTE_IP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return StmHrEvent.STM_HR_EVENT.SESSION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return StmHrEvent.STM_HR_EVENT.SYS_USER_COOKIE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return StmHrEvent.STM_HR_EVENT.USERAGENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field18() {
        return StmHrEvent.STM_HR_EVENT.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field19() {
        return StmHrEvent.STM_HR_EVENT.REFERER;
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
        return getReqTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getStatusCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getWechatId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getResTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getHandler();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getWechatType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getDepartmentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getEmployeeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getResContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getReqUri();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getReqParams();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value13() {
        return getEventId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getRemoteIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getSessionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getSysUserCookie();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getUseragent();
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
    public String value19() {
        return getReferer();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmHrEventRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmHrEventRecord value2(Integer value) {
        setReqTypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmHrEventRecord value3(Integer value) {
        setStatusCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmHrEventRecord value4(Integer value) {
        setWechatId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmHrEventRecord value5(Integer value) {
        setResTypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmHrEventRecord value6(String value) {
        setHandler(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmHrEventRecord value7(Integer value) {
        setWechatType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmHrEventRecord value8(String value) {
        setDepartmentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmHrEventRecord value9(String value) {
        setEmployeeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmHrEventRecord value10(String value) {
        setResContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmHrEventRecord value11(String value) {
        setReqUri(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmHrEventRecord value12(String value) {
        setReqParams(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmHrEventRecord value13(Integer value) {
        setEventId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmHrEventRecord value14(String value) {
        setRemoteIp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmHrEventRecord value15(String value) {
        setSessionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmHrEventRecord value16(String value) {
        setSysUserCookie(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmHrEventRecord value17(String value) {
        setUseragent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmHrEventRecord value18(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmHrEventRecord value19(String value) {
        setReferer(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmHrEventRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Integer value5, String value6, Integer value7, String value8, String value9, String value10, String value11, String value12, Integer value13, String value14, String value15, String value16, String value17, Timestamp value18, String value19) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StmHrEventRecord
     */
    public StmHrEventRecord() {
        super(StmHrEvent.STM_HR_EVENT);
    }

    /**
     * Create a detached, initialised StmHrEventRecord
     */
    public StmHrEventRecord(Integer id, Integer reqTypeId, Integer statusCode, Integer wechatId, Integer resTypeId, String handler, Integer wechatType, String departmentId, String employeeId, String resContent, String reqUri, String reqParams, Integer eventId, String remoteIp, String sessionId, String sysUserCookie, String useragent, Timestamp createTime, String referer) {
        super(StmHrEvent.STM_HR_EVENT);

        set(0, id);
        set(1, reqTypeId);
        set(2, statusCode);
        set(3, wechatId);
        set(4, resTypeId);
        set(5, handler);
        set(6, wechatType);
        set(7, departmentId);
        set(8, employeeId);
        set(9, resContent);
        set(10, reqUri);
        set(11, reqParams);
        set(12, eventId);
        set(13, remoteIp);
        set(14, sessionId);
        set(15, sysUserCookie);
        set(16, useragent);
        set(17, createTime);
        set(18, referer);
    }
}
