/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.dqv4.tables;


import com.moseeker.db.dqv4.Dqv4;
import com.moseeker.db.dqv4.Keys;
import com.moseeker.db.dqv4.tables.records.DictCollegeRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;


/**
 * 学校字典表
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DictCollege extends TableImpl<DictCollegeRecord> {

	private static final long serialVersionUID = 1739225595;

	/**
	 * The reference instance of <code>dqv4.dict_college</code>
	 */
	public static final DictCollege DICT_COLLEGE = new DictCollege();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<DictCollegeRecord> getRecordType() {
		return DictCollegeRecord.class;
	}

	/**
	 * The column <code>dqv4.dict_college.code</code>. 字典code
	 */
	public final TableField<DictCollegeRecord, UInteger> CODE = createField("code", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaulted(true), this, "字典code");

	/**
	 * The column <code>dqv4.dict_college.name</code>. 字典name
	 */
	public final TableField<DictCollegeRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false).defaulted(true), this, "字典name");

	/**
	 * The column <code>dqv4.dict_college.level</code>. 字典level
	 */
	public final TableField<DictCollegeRecord, Byte> LEVEL = createField("level", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaulted(true), this, "字典level");

	/**
	 * The column <code>dqv4.dict_college.logo</code>. 学校logo
	 */
	public final TableField<DictCollegeRecord, String> LOGO = createField("logo", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "学校logo");

	/**
	 * Create a <code>dqv4.dict_college</code> table reference
	 */
	public DictCollege() {
		this("dict_college", null);
	}

	/**
	 * Create an aliased <code>dqv4.dict_college</code> table reference
	 */
	public DictCollege(String alias) {
		this(alias, DICT_COLLEGE);
	}

	private DictCollege(String alias, Table<DictCollegeRecord> aliased) {
		this(alias, aliased, null);
	}

	private DictCollege(String alias, Table<DictCollegeRecord> aliased, Field<?>[] parameters) {
		super(alias, Dqv4.DQV4, aliased, parameters, "学校字典表");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<DictCollegeRecord>> getKeys() {
		return Arrays.<UniqueKey<DictCollegeRecord>>asList(Keys.KEY_DICT_COLLEGE_CODE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DictCollege as(String alias) {
		return new DictCollege(alias, this);
	}

	/**
	 * Rename this table
	 */
	public DictCollege rename(String name) {
		return new DictCollege(name, null);
	}
}
