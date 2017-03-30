/*
 * This file is generated by jOOQ.
*/
package com.moseeker.db.analytics.tables.records;


import com.moseeker.db.analytics.tables.StmEvent_02_03;

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
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StmEvent_02_03Record extends UpdatableRecordImpl<StmEvent_02_03Record> implements Record19<Integer, Integer, Integer, Integer, Integer, String, Integer, String, String, String, String, String, String, Integer, String, String, String, String, Timestamp> {

    private static final long serialVersionUID = -2039998527;

    /**
     * Setter for <code>analytics.stm_event_02_03.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>analytics.stm_event_02_03.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>analytics.stm_event_02_03.req_type_id</code>. 请求类型外键
     */
    public void setReqTypeId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>analytics.stm_event_02_03.req_type_id</code>. 请求类型外键
     */
    public Integer getReqTypeId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>analytics.stm_event_02_03.status_code</code>. 状态码 (200.404,etc)
     */
    public void setStatusCode(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>analytics.stm_event_02_03.status_code</code>. 状态码 (200.404,etc)
     */
    public Integer getStatusCode() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>analytics.stm_event_02_03.wechat_id</code>. 微信公共号id
     */
    public void setWechatId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>analytics.stm_event_02_03.wechat_id</code>. 微信公共号id
     */
    public Integer getWechatId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>analytics.stm_event_02_03.res_type_id</code>. 返回类型外键
     */
    public void setResTypeId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>analytics.stm_event_02_03.res_type_id</code>. 返回类型外键
     */
    public Integer getResTypeId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>analytics.stm_event_02_03.handler</code>. handler处理文件
     */
    public void setHandler(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>analytics.stm_event_02_03.handler</code>. handler处理文件
     */
    public String getHandler() {
        return (String) get(5);
    }

    /**
     * Setter for <code>analytics.stm_event_02_03.wechat_type</code>. 微信公共号类型
     */
    public void setWechatType(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>analytics.stm_event_02_03.wechat_type</code>. 微信公共号类型
     */
    public Integer getWechatType() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>analytics.stm_event_02_03.open_id</code>. 微信绑定id
     */
    public void setOpenId(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>analytics.stm_event_02_03.open_id</code>. 微信绑定id
     */
    public String getOpenId() {
        return (String) get(7);
    }

    /**
     * Setter for <code>analytics.stm_event_02_03.dquser_id</code>. Moseeker注册id
     */
    public void setDquserId(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>analytics.stm_event_02_03.dquser_id</code>. Moseeker注册id
     */
    public String getDquserId() {
        return (String) get(8);
    }

    /**
     * Setter for <code>analytics.stm_event_02_03.viewer_id</code>. 系统分配的访问者id
     */
    public void setViewerId(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>analytics.stm_event_02_03.viewer_id</code>. 系统分配的访问者id
     */
    public String getViewerId() {
        return (String) get(9);
    }

    /**
     * Setter for <code>analytics.stm_event_02_03.res_content</code>. 返回内容
     */
    public void setResContent(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>analytics.stm_event_02_03.res_content</code>. 返回内容
     */
    public String getResContent() {
        return (String) get(10);
    }

    /**
     * Setter for <code>analytics.stm_event_02_03.req_uri</code>. 请求uri
     */
    public void setReqUri(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>analytics.stm_event_02_03.req_uri</code>. 请求uri
     */
    public String getReqUri() {
        return (String) get(11);
    }

    /**
     * Setter for <code>analytics.stm_event_02_03.req_params</code>. 请求参数
     */
    public void setReqParams(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>analytics.stm_event_02_03.req_params</code>. 请求参数
     */
    public String getReqParams() {
        return (String) get(12);
    }

    /**
     * Setter for <code>analytics.stm_event_02_03.event_id</code>. 事件类型外键
     */
    public void setEventId(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>analytics.stm_event_02_03.event_id</code>. 事件类型外键
     */
    public Integer getEventId() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>analytics.stm_event_02_03.remote_ip</code>.
     */
    public void setRemoteIp(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>analytics.stm_event_02_03.remote_ip</code>.
     */
    public String getRemoteIp() {
        return (String) get(14);
    }

    /**
     * Setter for <code>analytics.stm_event_02_03.session_id</code>. session id
     */
    public void setSessionId(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>analytics.stm_event_02_03.session_id</code>. session id
     */
    public String getSessionId() {
        return (String) get(15);
    }

    /**
     * Setter for <code>analytics.stm_event_02_03.sys_user_cookie</code>. 用户的cookie内容
     */
    public void setSysUserCookie(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>analytics.stm_event_02_03.sys_user_cookie</code>. 用户的cookie内容
     */
    public String getSysUserCookie() {
        return (String) get(16);
    }

    /**
     * Setter for <code>analytics.stm_event_02_03.useragent</code>. 客户端user agent
     */
    public void setUseragent(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>analytics.stm_event_02_03.useragent</code>. 客户端user agent
     */
    public String getUseragent() {
        return (String) get(17);
    }

    /**
     * Setter for <code>analytics.stm_event_02_03.create_time</code>. 日志记录创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(18, value);
    }

    /**
     * Getter for <code>analytics.stm_event_02_03.create_time</code>. 日志记录创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(18);
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
    public Row19<Integer, Integer, Integer, Integer, Integer, String, Integer, String, String, String, String, String, String, Integer, String, String, String, String, Timestamp> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row19<Integer, Integer, Integer, Integer, Integer, String, Integer, String, String, String, String, String, String, Integer, String, String, String, String, Timestamp> valuesRow() {
        return (Row19) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return StmEvent_02_03.STM_EVENT_02_03.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return StmEvent_02_03.STM_EVENT_02_03.REQ_TYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return StmEvent_02_03.STM_EVENT_02_03.STATUS_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return StmEvent_02_03.STM_EVENT_02_03.WECHAT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return StmEvent_02_03.STM_EVENT_02_03.RES_TYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return StmEvent_02_03.STM_EVENT_02_03.HANDLER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return StmEvent_02_03.STM_EVENT_02_03.WECHAT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return StmEvent_02_03.STM_EVENT_02_03.OPEN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return StmEvent_02_03.STM_EVENT_02_03.DQUSER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return StmEvent_02_03.STM_EVENT_02_03.VIEWER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return StmEvent_02_03.STM_EVENT_02_03.RES_CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return StmEvent_02_03.STM_EVENT_02_03.REQ_URI;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return StmEvent_02_03.STM_EVENT_02_03.REQ_PARAMS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field14() {
        return StmEvent_02_03.STM_EVENT_02_03.EVENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return StmEvent_02_03.STM_EVENT_02_03.REMOTE_IP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return StmEvent_02_03.STM_EVENT_02_03.SESSION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return StmEvent_02_03.STM_EVENT_02_03.SYS_USER_COOKIE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field18() {
        return StmEvent_02_03.STM_EVENT_02_03.USERAGENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field19() {
        return StmEvent_02_03.STM_EVENT_02_03.CREATE_TIME;
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
        return getOpenId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getDquserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getViewerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getResContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getReqUri();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getReqParams();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value14() {
        return getEventId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getRemoteIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getSessionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getSysUserCookie();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value18() {
        return getUseragent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value19() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmEvent_02_03Record value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmEvent_02_03Record value2(Integer value) {
        setReqTypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmEvent_02_03Record value3(Integer value) {
        setStatusCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmEvent_02_03Record value4(Integer value) {
        setWechatId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmEvent_02_03Record value5(Integer value) {
        setResTypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmEvent_02_03Record value6(String value) {
        setHandler(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmEvent_02_03Record value7(Integer value) {
        setWechatType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmEvent_02_03Record value8(String value) {
        setOpenId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmEvent_02_03Record value9(String value) {
        setDquserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmEvent_02_03Record value10(String value) {
        setViewerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmEvent_02_03Record value11(String value) {
        setResContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmEvent_02_03Record value12(String value) {
        setReqUri(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmEvent_02_03Record value13(String value) {
        setReqParams(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmEvent_02_03Record value14(Integer value) {
        setEventId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmEvent_02_03Record value15(String value) {
        setRemoteIp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmEvent_02_03Record value16(String value) {
        setSessionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmEvent_02_03Record value17(String value) {
        setSysUserCookie(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmEvent_02_03Record value18(String value) {
        setUseragent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmEvent_02_03Record value19(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmEvent_02_03Record values(Integer value1, Integer value2, Integer value3, Integer value4, Integer value5, String value6, Integer value7, String value8, String value9, String value10, String value11, String value12, String value13, Integer value14, String value15, String value16, String value17, String value18, Timestamp value19) {
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
     * Create a detached StmEvent_02_03Record
     */
    public StmEvent_02_03Record() {
        super(StmEvent_02_03.STM_EVENT_02_03);
    }

    /**
     * Create a detached, initialised StmEvent_02_03Record
     */
    public StmEvent_02_03Record(Integer id, Integer reqTypeId, Integer statusCode, Integer wechatId, Integer resTypeId, String handler, Integer wechatType, String openId, String dquserId, String viewerId, String resContent, String reqUri, String reqParams, Integer eventId, String remoteIp, String sessionId, String sysUserCookie, String useragent, Timestamp createTime) {
        super(StmEvent_02_03.STM_EVENT_02_03);

        set(0, id);
        set(1, reqTypeId);
        set(2, statusCode);
        set(3, wechatId);
        set(4, resTypeId);
        set(5, handler);
        set(6, wechatType);
        set(7, openId);
        set(8, dquserId);
        set(9, viewerId);
        set(10, resContent);
        set(11, reqUri);
        set(12, reqParams);
        set(13, eventId);
        set(14, remoteIp);
        set(15, sessionId);
        set(16, sysUserCookie);
        set(17, useragent);
        set(18, createTime);
    }
}
