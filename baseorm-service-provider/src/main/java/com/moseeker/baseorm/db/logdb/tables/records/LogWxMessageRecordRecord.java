/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.logdb.tables.records;


import com.moseeker.baseorm.db.logdb.tables.LogWxMessageRecord;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 模板消息发送结果记录表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LogWxMessageRecordRecord extends UpdatableRecordImpl<LogWxMessageRecordRecord> implements Record15<Integer, Integer, Integer, Long, String, String, String, String, Integer, String, Timestamp, Timestamp, String, Integer, String> {

    private static final long serialVersionUID = 684710734;

    /**
     * Setter for <code>logdb.log_wx_message_record.id</code>. 主key
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>logdb.log_wx_message_record.id</code>. 主key
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>logdb.log_wx_message_record.template_id</code>. 我的模板ID
     */
    public void setTemplateId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>logdb.log_wx_message_record.template_id</code>. 我的模板ID
     */
    public Integer getTemplateId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>logdb.log_wx_message_record.wechat_id</code>. 所属公众号
     */
    public void setWechatId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>logdb.log_wx_message_record.wechat_id</code>. 所属公众号
     */
    public Integer getWechatId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>logdb.log_wx_message_record.msgid</code>. 发送消息ID
     */
    public void setMsgid(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>logdb.log_wx_message_record.msgid</code>. 发送消息ID
     */
    public Long getMsgid() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>logdb.log_wx_message_record.open_id</code>. 微信用户OPENID
     */
    public void setOpenId(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>logdb.log_wx_message_record.open_id</code>. 微信用户OPENID
     */
    public String getOpenId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>logdb.log_wx_message_record.url</code>. link
     */
    public void setUrl(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>logdb.log_wx_message_record.url</code>. link
     */
    public String getUrl() {
        return (String) get(5);
    }

    /**
     * Setter for <code>logdb.log_wx_message_record.topcolor</code>. 信息顶部颜色
     */
    public void setTopcolor(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>logdb.log_wx_message_record.topcolor</code>. 信息顶部颜色
     */
    public String getTopcolor() {
        return (String) get(6);
    }

    /**
     * Setter for <code>logdb.log_wx_message_record.jsondata</code>. 发送的json数据
     */
    public void setJsondata(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>logdb.log_wx_message_record.jsondata</code>. 发送的json数据
     */
    public String getJsondata() {
        return (String) get(7);
    }

    /**
     * Setter for <code>logdb.log_wx_message_record.errcode</code>. 返回结果值
     */
    public void setErrcode(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>logdb.log_wx_message_record.errcode</code>. 返回结果值
     */
    public Integer getErrcode() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>logdb.log_wx_message_record.errmsg</code>. 返回提示信息
     */
    public void setErrmsg(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>logdb.log_wx_message_record.errmsg</code>. 返回提示信息
     */
    public String getErrmsg() {
        return (String) get(9);
    }

    /**
     * Setter for <code>logdb.log_wx_message_record.sendtime</code>. 发送时间
     */
    public void setSendtime(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>logdb.log_wx_message_record.sendtime</code>. 发送时间
     */
    public Timestamp getSendtime() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>logdb.log_wx_message_record.updatetime</code>. 反馈状态时间
     */
    public void setUpdatetime(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>logdb.log_wx_message_record.updatetime</code>. 反馈状态时间
     */
    public Timestamp getUpdatetime() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>logdb.log_wx_message_record.sendstatus</code>. 发送状态
     */
    public void setSendstatus(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>logdb.log_wx_message_record.sendstatus</code>. 发送状态
     */
    public String getSendstatus() {
        return (String) get(12);
    }

    /**
     * Setter for <code>logdb.log_wx_message_record.sendtype</code>. 发送类型 0:微信 1:邮件 2:短信
     */
    public void setSendtype(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>logdb.log_wx_message_record.sendtype</code>. 发送类型 0:微信 1:邮件 2:短信
     */
    public Integer getSendtype() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>logdb.log_wx_message_record.access_token</code>. 发送时的access_token
     */
    public void setAccessToken(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>logdb.log_wx_message_record.access_token</code>. 发送时的access_token
     */
    public String getAccessToken() {
        return (String) get(14);
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
    // Record15 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Integer, Integer, Integer, Long, String, String, String, String, Integer, String, Timestamp, Timestamp, String, Integer, String> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Integer, Integer, Integer, Long, String, String, String, String, Integer, String, Timestamp, Timestamp, String, Integer, String> valuesRow() {
        return (Row15) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return LogWxMessageRecord.LOG_WX_MESSAGE_RECORD.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return LogWxMessageRecord.LOG_WX_MESSAGE_RECORD.TEMPLATE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return LogWxMessageRecord.LOG_WX_MESSAGE_RECORD.WECHAT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return LogWxMessageRecord.LOG_WX_MESSAGE_RECORD.MSGID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return LogWxMessageRecord.LOG_WX_MESSAGE_RECORD.OPEN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return LogWxMessageRecord.LOG_WX_MESSAGE_RECORD.URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return LogWxMessageRecord.LOG_WX_MESSAGE_RECORD.TOPCOLOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return LogWxMessageRecord.LOG_WX_MESSAGE_RECORD.JSONDATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return LogWxMessageRecord.LOG_WX_MESSAGE_RECORD.ERRCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return LogWxMessageRecord.LOG_WX_MESSAGE_RECORD.ERRMSG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return LogWxMessageRecord.LOG_WX_MESSAGE_RECORD.SENDTIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return LogWxMessageRecord.LOG_WX_MESSAGE_RECORD.UPDATETIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return LogWxMessageRecord.LOG_WX_MESSAGE_RECORD.SENDSTATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field14() {
        return LogWxMessageRecord.LOG_WX_MESSAGE_RECORD.SENDTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return LogWxMessageRecord.LOG_WX_MESSAGE_RECORD.ACCESS_TOKEN;
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
        return getTemplateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getWechatId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getMsgid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getOpenId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getTopcolor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getJsondata();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getErrcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getErrmsg();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getSendtime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getUpdatetime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getSendstatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value14() {
        return getSendtype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getAccessToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogWxMessageRecordRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogWxMessageRecordRecord value2(Integer value) {
        setTemplateId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogWxMessageRecordRecord value3(Integer value) {
        setWechatId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogWxMessageRecordRecord value4(Long value) {
        setMsgid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogWxMessageRecordRecord value5(String value) {
        setOpenId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogWxMessageRecordRecord value6(String value) {
        setUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogWxMessageRecordRecord value7(String value) {
        setTopcolor(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogWxMessageRecordRecord value8(String value) {
        setJsondata(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogWxMessageRecordRecord value9(Integer value) {
        setErrcode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogWxMessageRecordRecord value10(String value) {
        setErrmsg(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogWxMessageRecordRecord value11(Timestamp value) {
        setSendtime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogWxMessageRecordRecord value12(Timestamp value) {
        setUpdatetime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogWxMessageRecordRecord value13(String value) {
        setSendstatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogWxMessageRecordRecord value14(Integer value) {
        setSendtype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogWxMessageRecordRecord value15(String value) {
        setAccessToken(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogWxMessageRecordRecord values(Integer value1, Integer value2, Integer value3, Long value4, String value5, String value6, String value7, String value8, Integer value9, String value10, Timestamp value11, Timestamp value12, String value13, Integer value14, String value15) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LogWxMessageRecordRecord
     */
    public LogWxMessageRecordRecord() {
        super(LogWxMessageRecord.LOG_WX_MESSAGE_RECORD);
    }

    /**
     * Create a detached, initialised LogWxMessageRecordRecord
     */
    public LogWxMessageRecordRecord(Integer id, Integer templateId, Integer wechatId, Long msgid, String openId, String url, String topcolor, String jsondata, Integer errcode, String errmsg, Timestamp sendtime, Timestamp updatetime, String sendstatus, Integer sendtype, String accessToken) {
        super(LogWxMessageRecord.LOG_WX_MESSAGE_RECORD);

        set(0, id);
        set(1, templateId);
        set(2, wechatId);
        set(3, msgid);
        set(4, openId);
        set(5, url);
        set(6, topcolor);
        set(7, jsondata);
        set(8, errcode);
        set(9, errmsg);
        set(10, sendtime);
        set(11, updatetime);
        set(12, sendstatus);
        set(13, sendtype);
        set(14, accessToken);
    }
}
