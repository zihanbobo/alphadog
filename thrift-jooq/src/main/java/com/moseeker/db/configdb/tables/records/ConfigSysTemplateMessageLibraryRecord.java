/*
 * This file is generated by jOOQ.
*/
package com.moseeker.db.configdb.tables.records;


import com.moseeker.db.configdb.tables.ConfigSysTemplateMessageLibrary;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record19;
import org.jooq.Row19;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 模板消息库
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ConfigSysTemplateMessageLibraryRecord extends UpdatableRecordImpl<ConfigSysTemplateMessageLibraryRecord> implements Record19<Integer, String, String, String, String, String, Integer, Integer, Integer, Byte, String, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1006903660;

    /**
     * Setter for <code>configdb.config_sys_template_message_library.id</code>. 主key
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>configdb.config_sys_template_message_library.id</code>. 主key
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>configdb.config_sys_template_message_library.title</code>. 模板标题
     */
    public void setTitle(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>configdb.config_sys_template_message_library.title</code>. 模板标题
     */
    public String getTitle() {
        return (String) get(1);
    }

    /**
     * Setter for <code>configdb.config_sys_template_message_library.primary_industry</code>. 一级行业
     */
    public void setPrimaryIndustry(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>configdb.config_sys_template_message_library.primary_industry</code>. 一级行业
     */
    public String getPrimaryIndustry() {
        return (String) get(2);
    }

    /**
     * Setter for <code>configdb.config_sys_template_message_library.two_industry</code>. 二级行业
     */
    public void setTwoIndustry(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>configdb.config_sys_template_message_library.two_industry</code>. 二级行业
     */
    public String getTwoIndustry() {
        return (String) get(3);
    }

    /**
     * Setter for <code>configdb.config_sys_template_message_library.content</code>. 详细内容
     */
    public void setContent(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>configdb.config_sys_template_message_library.content</code>. 详细内容
     */
    public String getContent() {
        return (String) get(4);
    }

    /**
     * Setter for <code>configdb.config_sys_template_message_library.sample</code>. 内容示例
     */
    public void setSample(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>configdb.config_sys_template_message_library.sample</code>. 内容示例
     */
    public String getSample() {
        return (String) get(5);
    }

    /**
     * Setter for <code>configdb.config_sys_template_message_library.display</code>. 是否显示
     */
    public void setDisplay(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>configdb.config_sys_template_message_library.display</code>. 是否显示
     */
    public Integer getDisplay() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>configdb.config_sys_template_message_library.priority</code>. 排序
     */
    public void setPriority(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>configdb.config_sys_template_message_library.priority</code>. 排序
     */
    public Integer getPriority() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>configdb.config_sys_template_message_library.disable</code>. 是否可用
     */
    public void setDisable(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>configdb.config_sys_template_message_library.disable</code>. 是否可用
     */
    public Integer getDisable() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>configdb.config_sys_template_message_library.type</code>. 模板类别 0:微信 1:邮件 2:短信 3:申请模板 4:其他
     */
    public void setType(Byte value) {
        set(9, value);
    }

    /**
     * Getter for <code>configdb.config_sys_template_message_library.type</code>. 模板类别 0:微信 1:邮件 2:短信 3:申请模板 4:其他
     */
    public Byte getType() {
        return (Byte) get(9);
    }

    /**
     * Setter for <code>configdb.config_sys_template_message_library.template_id_short</code>. 模板库中模板的编号
     */
    public void setTemplateIdShort(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>configdb.config_sys_template_message_library.template_id_short</code>. 模板库中模板的编号
     */
    public String getTemplateIdShort() {
        return (String) get(10);
    }

    /**
     * Setter for <code>configdb.config_sys_template_message_library.send_condition</code>. 触发条件
     */
    public void setSendCondition(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>configdb.config_sys_template_message_library.send_condition</code>. 触发条件
     */
    public String getSendCondition() {
        return (String) get(11);
    }

    /**
     * Setter for <code>configdb.config_sys_template_message_library.sendtime</code>. 发送时间
     */
    public void setSendtime(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>configdb.config_sys_template_message_library.sendtime</code>. 发送时间
     */
    public String getSendtime() {
        return (String) get(12);
    }

    /**
     * Setter for <code>configdb.config_sys_template_message_library.sendto</code>. 发送对象
     */
    public void setSendto(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>configdb.config_sys_template_message_library.sendto</code>. 发送对象
     */
    public String getSendto() {
        return (String) get(13);
    }

    /**
     * Setter for <code>configdb.config_sys_template_message_library.first</code>. 消息模板first文案
     */
    public void setFirst(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>configdb.config_sys_template_message_library.first</code>. 消息模板first文案
     */
    public String getFirst() {
        return (String) get(14);
    }

    /**
     * Setter for <code>configdb.config_sys_template_message_library.remark</code>. 消息模板remark文案
     */
    public void setRemark(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>configdb.config_sys_template_message_library.remark</code>. 消息模板remark文案
     */
    public String getRemark() {
        return (String) get(15);
    }

    /**
     * Setter for <code>configdb.config_sys_template_message_library.url</code>. 跳转页面
     */
    public void setUrl(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>configdb.config_sys_template_message_library.url</code>. 跳转页面
     */
    public String getUrl() {
        return (String) get(16);
    }

    /**
     * Setter for <code>configdb.config_sys_template_message_library.from_name</code>.
     */
    public void setFromName(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>configdb.config_sys_template_message_library.from_name</code>.
     */
    public String getFromName() {
        return (String) get(17);
    }

    /**
     * Setter for <code>configdb.config_sys_template_message_library.subject</code>.
     */
    public void setSubject(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>configdb.config_sys_template_message_library.subject</code>.
     */
    public String getSubject() {
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
    public Row19<Integer, String, String, String, String, String, Integer, Integer, Integer, Byte, String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row19<Integer, String, String, String, String, String, Integer, Integer, Integer, Byte, String, String, String, String, String, String, String, String, String> valuesRow() {
        return (Row19) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ConfigSysTemplateMessageLibrary.CONFIG_SYS_TEMPLATE_MESSAGE_LIBRARY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ConfigSysTemplateMessageLibrary.CONFIG_SYS_TEMPLATE_MESSAGE_LIBRARY.TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ConfigSysTemplateMessageLibrary.CONFIG_SYS_TEMPLATE_MESSAGE_LIBRARY.PRIMARY_INDUSTRY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ConfigSysTemplateMessageLibrary.CONFIG_SYS_TEMPLATE_MESSAGE_LIBRARY.TWO_INDUSTRY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ConfigSysTemplateMessageLibrary.CONFIG_SYS_TEMPLATE_MESSAGE_LIBRARY.CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ConfigSysTemplateMessageLibrary.CONFIG_SYS_TEMPLATE_MESSAGE_LIBRARY.SAMPLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return ConfigSysTemplateMessageLibrary.CONFIG_SYS_TEMPLATE_MESSAGE_LIBRARY.DISPLAY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return ConfigSysTemplateMessageLibrary.CONFIG_SYS_TEMPLATE_MESSAGE_LIBRARY.PRIORITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return ConfigSysTemplateMessageLibrary.CONFIG_SYS_TEMPLATE_MESSAGE_LIBRARY.DISABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field10() {
        return ConfigSysTemplateMessageLibrary.CONFIG_SYS_TEMPLATE_MESSAGE_LIBRARY.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return ConfigSysTemplateMessageLibrary.CONFIG_SYS_TEMPLATE_MESSAGE_LIBRARY.TEMPLATE_ID_SHORT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return ConfigSysTemplateMessageLibrary.CONFIG_SYS_TEMPLATE_MESSAGE_LIBRARY.SEND_CONDITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return ConfigSysTemplateMessageLibrary.CONFIG_SYS_TEMPLATE_MESSAGE_LIBRARY.SENDTIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return ConfigSysTemplateMessageLibrary.CONFIG_SYS_TEMPLATE_MESSAGE_LIBRARY.SENDTO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return ConfigSysTemplateMessageLibrary.CONFIG_SYS_TEMPLATE_MESSAGE_LIBRARY.FIRST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return ConfigSysTemplateMessageLibrary.CONFIG_SYS_TEMPLATE_MESSAGE_LIBRARY.REMARK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return ConfigSysTemplateMessageLibrary.CONFIG_SYS_TEMPLATE_MESSAGE_LIBRARY.URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field18() {
        return ConfigSysTemplateMessageLibrary.CONFIG_SYS_TEMPLATE_MESSAGE_LIBRARY.FROM_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field19() {
        return ConfigSysTemplateMessageLibrary.CONFIG_SYS_TEMPLATE_MESSAGE_LIBRARY.SUBJECT;
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
    public String value2() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPrimaryIndustry();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getTwoIndustry();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getSample();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getDisplay();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getPriority();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getDisable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value10() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getTemplateIdShort();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getSendCondition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getSendtime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getSendto();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getFirst();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value18() {
        return getFromName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value19() {
        return getSubject();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysTemplateMessageLibraryRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysTemplateMessageLibraryRecord value2(String value) {
        setTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysTemplateMessageLibraryRecord value3(String value) {
        setPrimaryIndustry(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysTemplateMessageLibraryRecord value4(String value) {
        setTwoIndustry(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysTemplateMessageLibraryRecord value5(String value) {
        setContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysTemplateMessageLibraryRecord value6(String value) {
        setSample(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysTemplateMessageLibraryRecord value7(Integer value) {
        setDisplay(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysTemplateMessageLibraryRecord value8(Integer value) {
        setPriority(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysTemplateMessageLibraryRecord value9(Integer value) {
        setDisable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysTemplateMessageLibraryRecord value10(Byte value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysTemplateMessageLibraryRecord value11(String value) {
        setTemplateIdShort(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysTemplateMessageLibraryRecord value12(String value) {
        setSendCondition(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysTemplateMessageLibraryRecord value13(String value) {
        setSendtime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysTemplateMessageLibraryRecord value14(String value) {
        setSendto(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysTemplateMessageLibraryRecord value15(String value) {
        setFirst(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysTemplateMessageLibraryRecord value16(String value) {
        setRemark(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysTemplateMessageLibraryRecord value17(String value) {
        setUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysTemplateMessageLibraryRecord value18(String value) {
        setFromName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysTemplateMessageLibraryRecord value19(String value) {
        setSubject(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysTemplateMessageLibraryRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, Integer value7, Integer value8, Integer value9, Byte value10, String value11, String value12, String value13, String value14, String value15, String value16, String value17, String value18, String value19) {
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
     * Create a detached ConfigSysTemplateMessageLibraryRecord
     */
    public ConfigSysTemplateMessageLibraryRecord() {
        super(ConfigSysTemplateMessageLibrary.CONFIG_SYS_TEMPLATE_MESSAGE_LIBRARY);
    }

    /**
     * Create a detached, initialised ConfigSysTemplateMessageLibraryRecord
     */
    public ConfigSysTemplateMessageLibraryRecord(Integer id, String title, String primaryIndustry, String twoIndustry, String content, String sample, Integer display, Integer priority, Integer disable, Byte type, String templateIdShort, String sendCondition, String sendtime, String sendto, String first, String remark, String url, String fromName, String subject) {
        super(ConfigSysTemplateMessageLibrary.CONFIG_SYS_TEMPLATE_MESSAGE_LIBRARY);

        set(0, id);
        set(1, title);
        set(2, primaryIndustry);
        set(3, twoIndustry);
        set(4, content);
        set(5, sample);
        set(6, display);
        set(7, priority);
        set(8, disable);
        set(9, type);
        set(10, templateIdShort);
        set(11, sendCondition);
        set(12, sendtime);
        set(13, sendto);
        set(14, first);
        set(15, remark);
        set(16, url);
        set(17, fromName);
        set(18, subject);
    }
}
