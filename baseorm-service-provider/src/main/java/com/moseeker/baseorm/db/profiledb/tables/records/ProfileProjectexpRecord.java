/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.profiledb.tables.records;


import com.moseeker.baseorm.db.profiledb.tables.ProfileProjectexp;

import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record19;
import org.jooq.Row19;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Profile的项目经验
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProfileProjectexpRecord extends UpdatableRecordImpl<ProfileProjectexpRecord> implements Record19<Integer, Integer, Date, Date, Byte, String, String, Byte, String, String, String, String, String, String, String, String, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1564613695;

    /**
     * Setter for <code>profiledb.profile_projectexp.id</code>. 主key
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>profiledb.profile_projectexp.id</code>. 主key
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>profiledb.profile_projectexp.profile_id</code>. profile.id
     */
    public void setProfileId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>profiledb.profile_projectexp.profile_id</code>. profile.id
     */
    public Integer getProfileId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>profiledb.profile_projectexp.start</code>. 起止时间-起 yyyy-mm-dd
     */
    public void setStart(Date value) {
        set(2, value);
    }

    /**
     * Getter for <code>profiledb.profile_projectexp.start</code>. 起止时间-起 yyyy-mm-dd
     */
    public Date getStart() {
        return (Date) get(2);
    }

    /**
     * Setter for <code>profiledb.profile_projectexp.end</code>. 起止时间-止 yyyy-mm-dd
     */
    public void setEnd(Date value) {
        set(3, value);
    }

    /**
     * Getter for <code>profiledb.profile_projectexp.end</code>. 起止时间-止 yyyy-mm-dd
     */
    public Date getEnd() {
        return (Date) get(3);
    }

    /**
     * Setter for <code>profiledb.profile_projectexp.end_until_now</code>. 是否至今 0：否 1：是
     */
    public void setEndUntilNow(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>profiledb.profile_projectexp.end_until_now</code>. 是否至今 0：否 1：是
     */
    public Byte getEndUntilNow() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>profiledb.profile_projectexp.name</code>. 项目名称
     */
    public void setName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>profiledb.profile_projectexp.name</code>. 项目名称
     */
    public String getName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>profiledb.profile_projectexp.company_name</code>. 公司名称
     */
    public void setCompanyName(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>profiledb.profile_projectexp.company_name</code>. 公司名称
     */
    public String getCompanyName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>profiledb.profile_projectexp.is_it</code>. 是否IT项目, 0:没填写, 1:是, 2:否
     */
    public void setIsIt(Byte value) {
        set(7, value);
    }

    /**
     * Getter for <code>profiledb.profile_projectexp.is_it</code>. 是否IT项目, 0:没填写, 1:是, 2:否
     */
    public Byte getIsIt() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>profiledb.profile_projectexp.dev_tool</code>. 开发工具
     */
    public void setDevTool(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>profiledb.profile_projectexp.dev_tool</code>. 开发工具
     */
    public String getDevTool() {
        return (String) get(8);
    }

    /**
     * Setter for <code>profiledb.profile_projectexp.hardware</code>. 硬件环境
     */
    public void setHardware(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>profiledb.profile_projectexp.hardware</code>. 硬件环境
     */
    public String getHardware() {
        return (String) get(9);
    }

    /**
     * Setter for <code>profiledb.profile_projectexp.software</code>. 软件环境
     */
    public void setSoftware(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>profiledb.profile_projectexp.software</code>. 软件环境
     */
    public String getSoftware() {
        return (String) get(10);
    }

    /**
     * Setter for <code>profiledb.profile_projectexp.url</code>. 项目网址
     */
    public void setUrl(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>profiledb.profile_projectexp.url</code>. 项目网址
     */
    public String getUrl() {
        return (String) get(11);
    }

    /**
     * Setter for <code>profiledb.profile_projectexp.description</code>. 项目描述
     */
    public void setDescription(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>profiledb.profile_projectexp.description</code>. 项目描述
     */
    public String getDescription() {
        return (String) get(12);
    }

    /**
     * Setter for <code>profiledb.profile_projectexp.role</code>. 项目角色
     */
    public void setRole(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>profiledb.profile_projectexp.role</code>. 项目角色
     */
    public String getRole() {
        return (String) get(13);
    }

    /**
     * Setter for <code>profiledb.profile_projectexp.responsibility</code>. 项目职责
     */
    public void setResponsibility(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>profiledb.profile_projectexp.responsibility</code>. 项目职责
     */
    public String getResponsibility() {
        return (String) get(14);
    }

    /**
     * Setter for <code>profiledb.profile_projectexp.achievement</code>. 项目业绩
     */
    public void setAchievement(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>profiledb.profile_projectexp.achievement</code>. 项目业绩
     */
    public String getAchievement() {
        return (String) get(15);
    }

    /**
     * Setter for <code>profiledb.profile_projectexp.member</code>. 项目成员
     */
    public void setMember(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>profiledb.profile_projectexp.member</code>. 项目成员
     */
    public String getMember() {
        return (String) get(16);
    }

    /**
     * Setter for <code>profiledb.profile_projectexp.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(17, value);
    }

    /**
     * Getter for <code>profiledb.profile_projectexp.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(17);
    }

    /**
     * Setter for <code>profiledb.profile_projectexp.update_time</code>. 更新时间
     */
    public void setUpdateTime(Timestamp value) {
        set(18, value);
    }

    /**
     * Getter for <code>profiledb.profile_projectexp.update_time</code>. 更新时间
     */
    public Timestamp getUpdateTime() {
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
    public Row19<Integer, Integer, Date, Date, Byte, String, String, Byte, String, String, String, String, String, String, String, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row19<Integer, Integer, Date, Date, Byte, String, String, Byte, String, String, String, String, String, String, String, String, String, Timestamp, Timestamp> valuesRow() {
        return (Row19) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ProfileProjectexp.PROFILE_PROJECTEXP.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ProfileProjectexp.PROFILE_PROJECTEXP.PROFILE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field3() {
        return ProfileProjectexp.PROFILE_PROJECTEXP.START;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field4() {
        return ProfileProjectexp.PROFILE_PROJECTEXP.END;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return ProfileProjectexp.PROFILE_PROJECTEXP.END_UNTIL_NOW;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ProfileProjectexp.PROFILE_PROJECTEXP.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ProfileProjectexp.PROFILE_PROJECTEXP.COMPANY_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field8() {
        return ProfileProjectexp.PROFILE_PROJECTEXP.IS_IT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return ProfileProjectexp.PROFILE_PROJECTEXP.DEV_TOOL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return ProfileProjectexp.PROFILE_PROJECTEXP.HARDWARE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return ProfileProjectexp.PROFILE_PROJECTEXP.SOFTWARE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return ProfileProjectexp.PROFILE_PROJECTEXP.URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return ProfileProjectexp.PROFILE_PROJECTEXP.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return ProfileProjectexp.PROFILE_PROJECTEXP.ROLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return ProfileProjectexp.PROFILE_PROJECTEXP.RESPONSIBILITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return ProfileProjectexp.PROFILE_PROJECTEXP.ACHIEVEMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return ProfileProjectexp.PROFILE_PROJECTEXP.MEMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field18() {
        return ProfileProjectexp.PROFILE_PROJECTEXP.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field19() {
        return ProfileProjectexp.PROFILE_PROJECTEXP.UPDATE_TIME;
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
        return getProfileId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value3() {
        return getStart();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value4() {
        return getEnd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getEndUntilNow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getCompanyName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value8() {
        return getIsIt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getDevTool();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getHardware();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getSoftware();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getRole();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getResponsibility();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getAchievement();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getMember();
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
    public ProfileProjectexpRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfileProjectexpRecord value2(Integer value) {
        setProfileId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfileProjectexpRecord value3(Date value) {
        setStart(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfileProjectexpRecord value4(Date value) {
        setEnd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfileProjectexpRecord value5(Byte value) {
        setEndUntilNow(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfileProjectexpRecord value6(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfileProjectexpRecord value7(String value) {
        setCompanyName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfileProjectexpRecord value8(Byte value) {
        setIsIt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfileProjectexpRecord value9(String value) {
        setDevTool(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfileProjectexpRecord value10(String value) {
        setHardware(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfileProjectexpRecord value11(String value) {
        setSoftware(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfileProjectexpRecord value12(String value) {
        setUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfileProjectexpRecord value13(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfileProjectexpRecord value14(String value) {
        setRole(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfileProjectexpRecord value15(String value) {
        setResponsibility(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfileProjectexpRecord value16(String value) {
        setAchievement(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfileProjectexpRecord value17(String value) {
        setMember(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfileProjectexpRecord value18(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfileProjectexpRecord value19(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfileProjectexpRecord values(Integer value1, Integer value2, Date value3, Date value4, Byte value5, String value6, String value7, Byte value8, String value9, String value10, String value11, String value12, String value13, String value14, String value15, String value16, String value17, Timestamp value18, Timestamp value19) {
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
     * Create a detached ProfileProjectexpRecord
     */
    public ProfileProjectexpRecord() {
        super(ProfileProjectexp.PROFILE_PROJECTEXP);
    }

    /**
     * Create a detached, initialised ProfileProjectexpRecord
     */
    public ProfileProjectexpRecord(Integer id, Integer profileId, Date start, Date end, Byte endUntilNow, String name, String companyName, Byte isIt, String devTool, String hardware, String software, String url, String description, String role, String responsibility, String achievement, String member, Timestamp createTime, Timestamp updateTime) {
        super(ProfileProjectexp.PROFILE_PROJECTEXP);

        set(0, id);
        set(1, profileId);
        set(2, start);
        set(3, end);
        set(4, endUntilNow);
        set(5, name);
        set(6, companyName);
        set(7, isIt);
        set(8, devTool);
        set(9, hardware);
        set(10, software);
        set(11, url);
        set(12, description);
        set(13, role);
        set(14, responsibility);
        set(15, achievement);
        set(16, member);
        set(17, createTime);
        set(18, updateTime);
    }
}
