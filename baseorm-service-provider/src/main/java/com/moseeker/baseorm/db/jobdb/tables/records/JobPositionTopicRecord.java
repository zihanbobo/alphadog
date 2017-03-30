/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.jobdb.tables.records;


import com.moseeker.baseorm.db.jobdb.tables.JobPositionTopic;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;;


/**
 * 职位主题活动关系表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JobPositionTopicRecord extends UpdatableRecordImpl<JobPositionTopicRecord> implements Record2<Integer, Integer> {

    private static final long serialVersionUID = 593709762;

    /**
     * Setter for <code>jobdb.job_position_topic.position_id</code>. hr_position.id, 职位ID
     */
    public void setPositionId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>jobdb.job_position_topic.position_id</code>. hr_position.id, 职位ID
     */
    public Integer getPositionId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>jobdb.job_position_topic.topic_id</code>. hr_topic.id, 主题ID
     */
    public void setTopicId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>jobdb.job_position_topic.topic_id</code>. hr_topic.id, 主题ID
     */
    public Integer getTopicId() {
        return (Integer) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, Integer> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return JobPositionTopic.JOB_POSITION_TOPIC.POSITION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return JobPositionTopic.JOB_POSITION_TOPIC.TOPIC_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getPositionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getTopicId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobPositionTopicRecord value1(Integer value) {
        setPositionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobPositionTopicRecord value2(Integer value) {
        setTopicId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobPositionTopicRecord values(Integer value1, Integer value2) {
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
    public JobPositionTopicRecord(Integer positionId, Integer topicId) {
        super(JobPositionTopic.JOB_POSITION_TOPIC);

        set(0, positionId);
        set(1, topicId);
    }
}
