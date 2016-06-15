/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.analytics.tables.records;


import com.moseeker.db.analytics.tables.StmEventType;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 请求事件类型表
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StmEventTypeRecord extends UpdatableRecordImpl<StmEventTypeRecord> implements Record2<Integer, String> {

	private static final long serialVersionUID = 606424955;

	/**
	 * Setter for <code>analytics.stm_event_type.id</code>. 主键
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>analytics.stm_event_type.id</code>. 主键
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>analytics.stm_event_type.event</code>. 事件类型
	 */
	public void setEvent(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>analytics.stm_event_type.event</code>. 事件类型
	 */
	public String getEvent() {
		return (String) getValue(1);
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
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Integer, String> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Integer, String> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return StmEventType.STM_EVENT_TYPE.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return StmEventType.STM_EVENT_TYPE.EVENT;
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
		return getEvent();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StmEventTypeRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StmEventTypeRecord value2(String value) {
		setEvent(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StmEventTypeRecord values(Integer value1, String value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached StmEventTypeRecord
	 */
	public StmEventTypeRecord() {
		super(StmEventType.STM_EVENT_TYPE);
	}

	/**
	 * Create a detached, initialised StmEventTypeRecord
	 */
	public StmEventTypeRecord(Integer id, String event) {
		super(StmEventType.STM_EVENT_TYPE);

		setValue(0, id);
		setValue(1, event);
	}
}
