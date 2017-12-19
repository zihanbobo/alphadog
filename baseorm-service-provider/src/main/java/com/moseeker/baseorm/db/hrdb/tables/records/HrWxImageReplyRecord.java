/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.records;


import com.moseeker.baseorm.db.hrdb.tables.HrWxImageReply;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 微信图片回复
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrWxImageReplyRecord extends UpdatableRecordImpl<HrWxImageReplyRecord> implements Record5<Integer, Integer, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1030925218;

    /**
     * Setter for <code>hrdb.hr_wx_image_reply.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>hrdb.hr_wx_image_reply.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>hrdb.hr_wx_image_reply.rid</code>. wx_rule.id, 规则ID
     */
    public void setRid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>hrdb.hr_wx_image_reply.rid</code>. wx_rule.id, 规则ID
     */
    public Integer getRid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>hrdb.hr_wx_image_reply.image</code>. 回复图片的相对路径
     */
    public void setImage(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>hrdb.hr_wx_image_reply.image</code>. 回复图片的相对路径
     */
    public String getImage() {
        return (String) get(2);
    }

    /**
     * Setter for <code>hrdb.hr_wx_image_reply.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>hrdb.hr_wx_image_reply.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>hrdb.hr_wx_image_reply.update_time</code>.
     */
    public void setUpdateTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>hrdb.hr_wx_image_reply.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, String, Timestamp, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, String, Timestamp, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return HrWxImageReply.HR_WX_IMAGE_REPLY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return HrWxImageReply.HR_WX_IMAGE_REPLY.RID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return HrWxImageReply.HR_WX_IMAGE_REPLY.IMAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return HrWxImageReply.HR_WX_IMAGE_REPLY.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return HrWxImageReply.HR_WX_IMAGE_REPLY.UPDATE_TIME;
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
        return getRid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getImage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrWxImageReplyRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrWxImageReplyRecord value2(Integer value) {
        setRid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrWxImageReplyRecord value3(String value) {
        setImage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrWxImageReplyRecord value4(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrWxImageReplyRecord value5(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrWxImageReplyRecord values(Integer value1, Integer value2, String value3, Timestamp value4, Timestamp value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HrWxImageReplyRecord
     */
    public HrWxImageReplyRecord() {
        super(HrWxImageReply.HR_WX_IMAGE_REPLY);
    }

    /**
     * Create a detached, initialised HrWxImageReplyRecord
     */
    public HrWxImageReplyRecord(Integer id, Integer rid, String image, Timestamp createTime, Timestamp updateTime) {
        super(HrWxImageReply.HR_WX_IMAGE_REPLY);

        set(0, id);
        set(1, rid);
        set(2, image);
        set(3, createTime);
        set(4, updateTime);
    }
}
