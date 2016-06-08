/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.analytics.tables.records;


import com.moseeker.db.analytics.tables.StPositionPuv;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
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
public class StPositionPuvRecord extends UpdatableRecordImpl<StPositionPuvRecord> implements Record15<Integer, Integer, Timestamp, Integer, Integer, String, Integer, Integer, Integer, String, Integer, Integer, Integer, String, Integer> {

	private static final long serialVersionUID = -1980446519;

	/**
	 * Setter for <code>analytics.st_position_puv.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>analytics.st_position_puv.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>analytics.st_position_puv.pid</code>.
	 */
	public void setPid(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>analytics.st_position_puv.pid</code>.
	 */
	public Integer getPid() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>analytics.st_position_puv.create_time</code>.
	 */
	public void setCreateTime(Timestamp value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>analytics.st_position_puv.create_time</code>.
	 */
	public Timestamp getCreateTime() {
		return (Timestamp) getValue(2);
	}

	/**
	 * Setter for <code>analytics.st_position_puv.ip_count</code>.
	 */
	public void setIpCount(Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>analytics.st_position_puv.ip_count</code>.
	 */
	public Integer getIpCount() {
		return (Integer) getValue(3);
	}

	/**
	 * Setter for <code>analytics.st_position_puv.ip_unique</code>.
	 */
	public void setIpUnique(Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>analytics.st_position_puv.ip_unique</code>.
	 */
	public Integer getIpUnique() {
		return (Integer) getValue(4);
	}

	/**
	 * Setter for <code>analytics.st_position_puv.ip_top</code>.
	 */
	public void setIpTop(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>analytics.st_position_puv.ip_top</code>.
	 */
	public String getIpTop() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>analytics.st_position_puv.ip_freq</code>.
	 */
	public void setIpFreq(Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>analytics.st_position_puv.ip_freq</code>.
	 */
	public Integer getIpFreq() {
		return (Integer) getValue(6);
	}

	/**
	 * Setter for <code>analytics.st_position_puv.viewer_count</code>.
	 */
	public void setViewerCount(Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>analytics.st_position_puv.viewer_count</code>.
	 */
	public Integer getViewerCount() {
		return (Integer) getValue(7);
	}

	/**
	 * Setter for <code>analytics.st_position_puv.viewer_unique</code>.
	 */
	public void setViewerUnique(Integer value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>analytics.st_position_puv.viewer_unique</code>.
	 */
	public Integer getViewerUnique() {
		return (Integer) getValue(8);
	}

	/**
	 * Setter for <code>analytics.st_position_puv.viewer_top</code>.
	 */
	public void setViewerTop(String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>analytics.st_position_puv.viewer_top</code>.
	 */
	public String getViewerTop() {
		return (String) getValue(9);
	}

	/**
	 * Setter for <code>analytics.st_position_puv.viewer_freq</code>.
	 */
	public void setViewerFreq(Integer value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>analytics.st_position_puv.viewer_freq</code>.
	 */
	public Integer getViewerFreq() {
		return (Integer) getValue(10);
	}

	/**
	 * Setter for <code>analytics.st_position_puv.recom_count</code>.
	 */
	public void setRecomCount(Integer value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>analytics.st_position_puv.recom_count</code>.
	 */
	public Integer getRecomCount() {
		return (Integer) getValue(11);
	}

	/**
	 * Setter for <code>analytics.st_position_puv.recom_unique</code>.
	 */
	public void setRecomUnique(Integer value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>analytics.st_position_puv.recom_unique</code>.
	 */
	public Integer getRecomUnique() {
		return (Integer) getValue(12);
	}

	/**
	 * Setter for <code>analytics.st_position_puv.recom_top</code>.
	 */
	public void setRecomTop(String value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>analytics.st_position_puv.recom_top</code>.
	 */
	public String getRecomTop() {
		return (String) getValue(13);
	}

	/**
	 * Setter for <code>analytics.st_position_puv.recom_freq</code>.
	 */
	public void setRecomFreq(Integer value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>analytics.st_position_puv.recom_freq</code>.
	 */
	public Integer getRecomFreq() {
		return (Integer) getValue(14);
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
	public Row15<Integer, Integer, Timestamp, Integer, Integer, String, Integer, Integer, Integer, String, Integer, Integer, Integer, String, Integer> fieldsRow() {
		return (Row15) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row15<Integer, Integer, Timestamp, Integer, Integer, String, Integer, Integer, Integer, String, Integer, Integer, Integer, String, Integer> valuesRow() {
		return (Row15) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return StPositionPuv.ST_POSITION_PUV.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return StPositionPuv.ST_POSITION_PUV.PID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field3() {
		return StPositionPuv.ST_POSITION_PUV.CREATE_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return StPositionPuv.ST_POSITION_PUV.IP_COUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field5() {
		return StPositionPuv.ST_POSITION_PUV.IP_UNIQUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return StPositionPuv.ST_POSITION_PUV.IP_TOP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field7() {
		return StPositionPuv.ST_POSITION_PUV.IP_FREQ;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field8() {
		return StPositionPuv.ST_POSITION_PUV.VIEWER_COUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field9() {
		return StPositionPuv.ST_POSITION_PUV.VIEWER_UNIQUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field10() {
		return StPositionPuv.ST_POSITION_PUV.VIEWER_TOP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field11() {
		return StPositionPuv.ST_POSITION_PUV.VIEWER_FREQ;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field12() {
		return StPositionPuv.ST_POSITION_PUV.RECOM_COUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field13() {
		return StPositionPuv.ST_POSITION_PUV.RECOM_UNIQUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field14() {
		return StPositionPuv.ST_POSITION_PUV.RECOM_TOP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field15() {
		return StPositionPuv.ST_POSITION_PUV.RECOM_FREQ;
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
		return getPid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value3() {
		return getCreateTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value4() {
		return getIpCount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value5() {
		return getIpUnique();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getIpTop();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value7() {
		return getIpFreq();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value8() {
		return getViewerCount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value9() {
		return getViewerUnique();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value10() {
		return getViewerTop();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value11() {
		return getViewerFreq();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value12() {
		return getRecomCount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value13() {
		return getRecomUnique();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value14() {
		return getRecomTop();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value15() {
		return getRecomFreq();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StPositionPuvRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StPositionPuvRecord value2(Integer value) {
		setPid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StPositionPuvRecord value3(Timestamp value) {
		setCreateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StPositionPuvRecord value4(Integer value) {
		setIpCount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StPositionPuvRecord value5(Integer value) {
		setIpUnique(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StPositionPuvRecord value6(String value) {
		setIpTop(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StPositionPuvRecord value7(Integer value) {
		setIpFreq(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StPositionPuvRecord value8(Integer value) {
		setViewerCount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StPositionPuvRecord value9(Integer value) {
		setViewerUnique(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StPositionPuvRecord value10(String value) {
		setViewerTop(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StPositionPuvRecord value11(Integer value) {
		setViewerFreq(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StPositionPuvRecord value12(Integer value) {
		setRecomCount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StPositionPuvRecord value13(Integer value) {
		setRecomUnique(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StPositionPuvRecord value14(String value) {
		setRecomTop(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StPositionPuvRecord value15(Integer value) {
		setRecomFreq(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StPositionPuvRecord values(Integer value1, Integer value2, Timestamp value3, Integer value4, Integer value5, String value6, Integer value7, Integer value8, Integer value9, String value10, Integer value11, Integer value12, Integer value13, String value14, Integer value15) {
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
	 * Create a detached StPositionPuvRecord
	 */
	public StPositionPuvRecord() {
		super(StPositionPuv.ST_POSITION_PUV);
	}

	/**
	 * Create a detached, initialised StPositionPuvRecord
	 */
	public StPositionPuvRecord(Integer id, Integer pid, Timestamp createTime, Integer ipCount, Integer ipUnique, String ipTop, Integer ipFreq, Integer viewerCount, Integer viewerUnique, String viewerTop, Integer viewerFreq, Integer recomCount, Integer recomUnique, String recomTop, Integer recomFreq) {
		super(StPositionPuv.ST_POSITION_PUV);

		setValue(0, id);
		setValue(1, pid);
		setValue(2, createTime);
		setValue(3, ipCount);
		setValue(4, ipUnique);
		setValue(5, ipTop);
		setValue(6, ipFreq);
		setValue(7, viewerCount);
		setValue(8, viewerUnique);
		setValue(9, viewerTop);
		setValue(10, viewerFreq);
		setValue(11, recomCount);
		setValue(12, recomUnique);
		setValue(13, recomTop);
		setValue(14, recomFreq);
	}
}