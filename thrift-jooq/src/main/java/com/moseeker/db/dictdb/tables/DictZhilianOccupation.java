/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.dictdb.tables;


import com.moseeker.db.dictdb.Dictdb;
import com.moseeker.db.dictdb.Keys;
import com.moseeker.db.dictdb.tables.records.DictZhilianOccupationRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;
import org.jooq.types.UShort;


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
public class DictZhilianOccupation extends TableImpl<DictZhilianOccupationRecord> {

	private static final long serialVersionUID = -250122839;

	/**
	 * The reference instance of <code>dictdb.dict_zhilian_occupation</code>
	 */
	public static final DictZhilianOccupation DICT_ZHILIAN_OCCUPATION = new DictZhilianOccupation();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<DictZhilianOccupationRecord> getRecordType() {
		return DictZhilianOccupationRecord.class;
	}

	/**
	 * The column <code>dictdb.dict_zhilian_occupation.code</code>. 职能id
	 */
	public final TableField<DictZhilianOccupationRecord, Integer> CODE = createField("code", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "职能id");

	/**
	 * The column <code>dictdb.dict_zhilian_occupation.parent_id</code>. 父Id，上一级职能的ID
	 */
	public final TableField<DictZhilianOccupationRecord, UInteger> PARENT_ID = createField("parent_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaulted(true), this, "父Id，上一级职能的ID");

	/**
	 * The column <code>dictdb.dict_zhilian_occupation.name</code>. 职能名称
	 */
	public final TableField<DictZhilianOccupationRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaulted(true), this, "职能名称");

	/**
	 * The column <code>dictdb.dict_zhilian_occupation.code_other</code>.
	 */
	public final TableField<DictZhilianOccupationRecord, Integer> CODE_OTHER = createField("code_other", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>dictdb.dict_zhilian_occupation.level</code>. 职能级别 1是一级2是
	 */
	public final TableField<DictZhilianOccupationRecord, UShort> LEVEL = createField("level", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED.nullable(false).defaulted(true), this, "职能级别 1是一级2是");

	/**
	 * The column <code>dictdb.dict_zhilian_occupation.status</code>. 只能状态 0 是无效 1是有效
	 */
	public final TableField<DictZhilianOccupationRecord, UShort> STATUS = createField("status", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED.nullable(false).defaulted(true), this, "只能状态 0 是无效 1是有效");

	/**
	 * The column <code>dictdb.dict_zhilian_occupation.createTime</code>. 创建时间
	 */
	public final TableField<DictZhilianOccupationRecord, Timestamp> CREATETIME = createField("createTime", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "创建时间");

	/**
	 * Create a <code>dictdb.dict_zhilian_occupation</code> table reference
	 */
	public DictZhilianOccupation() {
		this("dict_zhilian_occupation", null);
	}

	/**
	 * Create an aliased <code>dictdb.dict_zhilian_occupation</code> table reference
	 */
	public DictZhilianOccupation(String alias) {
		this(alias, DICT_ZHILIAN_OCCUPATION);
	}

	private DictZhilianOccupation(String alias, Table<DictZhilianOccupationRecord> aliased) {
		this(alias, aliased, null);
	}

	private DictZhilianOccupation(String alias, Table<DictZhilianOccupationRecord> aliased, Field<?>[] parameters) {
		super(alias, Dictdb.DICTDB, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<DictZhilianOccupationRecord, Integer> getIdentity() {
		return Keys.IDENTITY_DICT_ZHILIAN_OCCUPATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<DictZhilianOccupationRecord> getPrimaryKey() {
		return Keys.KEY_DICT_ZHILIAN_OCCUPATION_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<DictZhilianOccupationRecord>> getKeys() {
		return Arrays.<UniqueKey<DictZhilianOccupationRecord>>asList(Keys.KEY_DICT_ZHILIAN_OCCUPATION_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DictZhilianOccupation as(String alias) {
		return new DictZhilianOccupation(alias, this);
	}

	/**
	 * Rename this table
	 */
	public DictZhilianOccupation rename(String name) {
		return new DictZhilianOccupation(name, null);
	}
}
