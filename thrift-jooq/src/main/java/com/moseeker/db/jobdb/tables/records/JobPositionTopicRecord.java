/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.jobdb.tables.records;


import com.moseeker.db.jobdb.tables.JobPositionTopic;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.UInteger;


/**
 * 职位主题活动关系表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JobPositionTopicRecord extends TableRecordImpl<JobPositionTopicRecord> implements Record2<UInteger, UInteger> {

    private static final long serialVersionUID = 1672145423;

    /**
     * Setter for <code>jobDB.job_position_topic.position_id</code>. hr_position.id, 职位ID
     */
    public void setPositionId(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>jobDB.job_position_topic.position_id</code>. hr_position.id, 职位ID
     */
    public UInteger getPositionId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>jobDB.job_position_topic.topic_id</code>. hr_topic.id, 主题ID
     */
    public void setTopicId(UInteger value) {
        set(1, value);
    }

    /**
     * Getter for <code>jobDB.job_position_topic.topic_id</code>. hr_topic.id, 主题ID
     */
    public UInteger getTopicId() {
        return (UInteger) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<UInteger, UInteger> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<UInteger, UInteger> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return JobPositionTopic.JOB_POSITION_TOPIC.POSITION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field2() {
        return JobPositionTopic.JOB_POSITION_TOPIC.TOPIC_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value1() {
        return getPositionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value2() {
        return getTopicId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobPositionTopicRecord value1(UInteger value) {
        setPositionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobPositionTopicRecord value2(UInteger value) {
        setTopicId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobPositionTopicRecord values(UInteger value1, UInteger value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JobPositionTopicRecord
     */
    public JobPositionTopicRecord() {
        super(JobPositionTopic.JOB_POSITION_TOPIC);
    }

    /**
     * Create a detached, initialised JobPositionTopicRecord
     */
    public JobPositionTopicRecord(UInteger positionId, UInteger topicId) {
        super(JobPositionTopic.JOB_POSITION_TOPIC);

        set(0, positionId);
        set(1, topicId);
    }
}
