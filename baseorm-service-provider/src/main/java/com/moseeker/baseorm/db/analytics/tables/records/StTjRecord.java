/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.analytics.tables.records;


import com.moseeker.baseorm.db.analytics.tables.StTj;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 记录推荐结果的点击信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StTjRecord extends UpdatableRecordImpl<StTjRecord> implements Record6<Integer, Timestamp, Integer, String, String, String> {

    private static final long serialVersionUID = -223176073;

    /**
     * Setter for <code>analytics.st_tj.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>analytics.st_tj.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>analytics.st_tj.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>analytics.st_tj.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>analytics.st_tj.pid</code>. 职位id,对应hr_position的id
     */
    public void setPid(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>analytics.st_tj.pid</code>. 职位id,对应hr_position的id
     */
    public Integer getPid() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>analytics.st_tj.tj</code>. 推荐类型,当前只有plist
     */
    public void setTj(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>analytics.st_tj.tj</code>. 推荐类型,当前只有plist
     */
    public String getTj() {
        return (String) get(3);
    }

    /**
     * Setter for <code>analytics.st_tj.remote_ip</code>.
     */
    public void setRemoteIp(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>analytics.st_tj.remote_ip</code>.
     */
    public String getRemoteIp() {
        return (String) get(4);
    }

    /**
     * Setter for <code>analytics.st_tj.viewer_id</code>. viewer_id，生成的访问者id
     */
    public void setViewerId(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>analytics.st_tj.viewer_id</code>. viewer_id，生成的访问者id
     */
    public String getViewerId() {
        return (String) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Timestamp, Integer, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Timestamp, Integer, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return StTj.ST_TJ.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return StTj.ST_TJ.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return StTj.ST_TJ.PID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return StTj.ST_TJ.TJ;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return StTj.ST_TJ.REMOTE_IP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return StTj.ST_TJ.VIEWER_ID;
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
    public Timestamp value2() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getPid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getTj();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getRemoteIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getViewerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StTjRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StTjRecord value2(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StTjRecord value3(Integer value) {
        setPid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StTjRecord value4(String value) {
        setTj(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StTjRecord value5(String value) {
        setRemoteIp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StTjRecord value6(String value) {
        setViewerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StTjRecord values(Integer value1, Timestamp value2, Integer value3, String value4, String value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StTjRecord
     */
    public StTjRecord() {
        super(StTj.ST_TJ);
    }

    /**
     * Create a detached, initialised StTjRecord
     */
    public StTjRecord(Integer id, Timestamp createTime, Integer pid, String tj, String remoteIp, String viewerId) {
        super(StTj.ST_TJ);

        set(0, id);
        set(1, createTime);
        set(2, pid);
        set(3, tj);
        set(4, remoteIp);
        set(5, viewerId);
    }
}
