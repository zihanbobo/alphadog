/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.dictdb.tables.records;


import com.moseeker.baseorm.db.dictdb.tables.DictCityMap;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DictCityMapRecord extends UpdatableRecordImpl<DictCityMapRecord> implements Record6<Integer, Integer, Integer, Short, Short, Timestamp> {

	private static final long serialVersionUID = -1502159425;

	/**
	 * Setter for <code>dictdb.dict_city_map.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>dictdb.dict_city_map.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>dictdb.dict_city_map.code</code>.
	 */
	public void setCode(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>dictdb.dict_city_map.code</code>.
	 */
	public Integer getCode() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>dictdb.dict_city_map.code_other</code>.
	 */
	public void setCodeOther(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>dictdb.dict_city_map.code_other</code>.
	 */
	public Integer getCodeOther() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>dictdb.dict_city_map.channel</code>.
	 */
	public void setChannel(Short value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>dictdb.dict_city_map.channel</code>.
	 */
	public Short getChannel() {
		return (Short) getValue(3);
	}

	/**
	 * Setter for <code>dictdb.dict_city_map.status</code>.
	 */
	public void setStatus(Short value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>dictdb.dict_city_map.status</code>.
	 */
	public Short getStatus() {
		return (Short) getValue(4);
	}

	/**
	 * Setter for <code>dictdb.dict_city_map.create_time</code>.
	 */
	public void setCreateTime(Timestamp value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>dictdb.dict_city_map.create_time</code>.
	 */
	public Timestamp getCreateTime() {
		return (Timestamp) getValue(5);
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
	public Row6<Integer, Integer, Integer, Short, Short, Timestamp> fieldsRow() {
		return (Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Integer, Integer, Integer, Short, Short, Timestamp> valuesRow() {
		return (Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return DictCityMap.DICT_CITY_MAP.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return DictCityMap.DICT_CITY_MAP.CODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return DictCityMap.DICT_CITY_MAP.CODE_OTHER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Short> field4() {
		return DictCityMap.DICT_CITY_MAP.CHANNEL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Short> field5() {
		return DictCityMap.DICT_CITY_MAP.STATUS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field6() {
		return DictCityMap.DICT_CITY_MAP.CREATE_TIME;
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
		return getCode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getCodeOther();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Short value4() {
		return getChannel();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Short value5() {
		return getStatus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value6() {
		return getCreateTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DictCityMapRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DictCityMapRecord value2(Integer value) {
		setCode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DictCityMapRecord value3(Integer value) {
		setCodeOther(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DictCityMapRecord value4(Short value) {
		setChannel(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DictCityMapRecord value5(Short value) {
		setStatus(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DictCityMapRecord value6(Timestamp value) {
		setCreateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DictCityMapRecord values(Integer value1, Integer value2, Integer value3, Short value4, Short value5, Timestamp value6) {
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
	 * Create a detached DictCityMapRecord
	 */
	public DictCityMapRecord() {
		super(DictCityMap.DICT_CITY_MAP);
	}

	/**
	 * Create a detached, initialised DictCityMapRecord
	 */
	public DictCityMapRecord(Integer id, Integer code, Integer codeOther, Short channel, Short status, Timestamp createTime) {
		super(DictCityMap.DICT_CITY_MAP);

		setValue(0, id);
		setValue(1, code);
		setValue(2, codeOther);
		setValue(3, channel);
		setValue(4, status);
		setValue(5, createTime);
	}
}