/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.hrdb.tables.records;


import com.moseeker.db.hrdb.tables.HrResource;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 资源集合表
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrResourceRecord extends UpdatableRecordImpl<HrResourceRecord> implements Record7<Integer, String, Integer, String, Integer, Integer, String> {

	private static final long serialVersionUID = 2120526901;

	/**
	 * Setter for <code>hrdb.hr_resource.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>hrdb.hr_resource.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>hrdb.hr_resource.res_url</code>. 资源链接
	 */
	public void setResUrl(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>hrdb.hr_resource.res_url</code>. 资源链接
	 */
	public String getResUrl() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>hrdb.hr_resource.res_type</code>. 0: image  1: video
	 */
	public void setResType(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>hrdb.hr_resource.res_type</code>. 0: image  1: video
	 */
	public Integer getResType() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>hrdb.hr_resource.remark</code>. 备注资源
	 */
	public void setRemark(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>hrdb.hr_resource.remark</code>. 备注资源
	 */
	public String getRemark() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>hrdb.hr_resource.disable</code>. 0是正常1是删除
	 */
	public void setDisable(Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>hrdb.hr_resource.disable</code>. 0是正常1是删除
	 */
	public Integer getDisable() {
		return (Integer) getValue(4);
	}

	/**
	 * Setter for <code>hrdb.hr_resource.company_id</code>. 企业id
	 */
	public void setCompanyId(Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>hrdb.hr_resource.company_id</code>. 企业id
	 */
	public Integer getCompanyId() {
		return (Integer) getValue(5);
	}

	/**
	 * Setter for <code>hrdb.hr_resource.title</code>. 资源名称
	 */
	public void setTitle(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>hrdb.hr_resource.title</code>. 资源名称
	 */
	public String getTitle() {
		return (String) getValue(6);
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
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<Integer, String, Integer, String, Integer, Integer, String> fieldsRow() {
		return (Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<Integer, String, Integer, String, Integer, Integer, String> valuesRow() {
		return (Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return HrResource.HR_RESOURCE.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return HrResource.HR_RESOURCE.RES_URL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return HrResource.HR_RESOURCE.RES_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return HrResource.HR_RESOURCE.REMARK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field5() {
		return HrResource.HR_RESOURCE.DISABLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field6() {
		return HrResource.HR_RESOURCE.COMPANY_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return HrResource.HR_RESOURCE.TITLE;
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
		return getResUrl();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getResType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getRemark();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value5() {
		return getDisable();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value6() {
		return getCompanyId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getTitle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrResourceRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrResourceRecord value2(String value) {
		setResUrl(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrResourceRecord value3(Integer value) {
		setResType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrResourceRecord value4(String value) {
		setRemark(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrResourceRecord value5(Integer value) {
		setDisable(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrResourceRecord value6(Integer value) {
		setCompanyId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrResourceRecord value7(String value) {
		setTitle(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrResourceRecord values(Integer value1, String value2, Integer value3, String value4, Integer value5, Integer value6, String value7) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached HrResourceRecord
	 */
	public HrResourceRecord() {
		super(HrResource.HR_RESOURCE);
	}

	/**
	 * Create a detached, initialised HrResourceRecord
	 */
	public HrResourceRecord(Integer id, String resUrl, Integer resType, String remark, Integer disable, Integer companyId, String title) {
		super(HrResource.HR_RESOURCE);

		setValue(0, id);
		setValue(1, resUrl);
		setValue(2, resType);
		setValue(3, remark);
		setValue(4, disable);
		setValue(5, companyId);
		setValue(6, title);
	}
}
