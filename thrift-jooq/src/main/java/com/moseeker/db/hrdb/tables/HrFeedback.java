/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.hrdb.tables;


import com.moseeker.db.hrdb.Hrdb;
import com.moseeker.db.hrdb.Keys;
import com.moseeker.db.hrdb.tables.records.HrFeedbackRecord;

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


/**
 * HR反馈表
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrFeedback extends TableImpl<HrFeedbackRecord> {

	private static final long serialVersionUID = -230804639;

	/**
	 * The reference instance of <code>hrDB.hr_feedback</code>
	 */
	public static final HrFeedback HR_FEEDBACK = new HrFeedback();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<HrFeedbackRecord> getRecordType() {
		return HrFeedbackRecord.class;
	}

	/**
	 * The column <code>hrDB.hr_feedback.id</code>. ID
	 */
	public final TableField<HrFeedbackRecord, UInteger> ID = createField("id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "ID");

	/**
	 * The column <code>hrDB.hr_feedback.hraccount_id</code>. hr_account.id 账号编号
	 */
	public final TableField<HrFeedbackRecord, Integer> HRACCOUNT_ID = createField("hraccount_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "hr_account.id 账号编号");

	/**
	 * The column <code>hrDB.hr_feedback.name</code>. 姓名
	 */
	public final TableField<HrFeedbackRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false).defaulted(true), this, "姓名");

	/**
	 * The column <code>hrDB.hr_feedback.email</code>. 邮箱
	 */
	public final TableField<HrFeedbackRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false).defaulted(true), this, "邮箱");

	/**
	 * The column <code>hrDB.hr_feedback.images</code>. 反馈图片
	 */
	public final TableField<HrFeedbackRecord, String> IMAGES = createField("images", org.jooq.impl.SQLDataType.VARCHAR.length(300).nullable(false).defaulted(true), this, "反馈图片");

	/**
	 * The column <code>hrDB.hr_feedback.content</code>. 反馈内容
	 */
	public final TableField<HrFeedbackRecord, String> CONTENT = createField("content", org.jooq.impl.SQLDataType.VARCHAR.length(5000).nullable(false).defaulted(true), this, "反馈内容");

	/**
	 * The column <code>hrDB.hr_feedback.create_time</code>.
	 */
	public final TableField<HrFeedbackRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>hrDB.hr_feedback.update_time</code>.
	 */
	public final TableField<HrFeedbackRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>hrDB.hr_feedback</code> table reference
	 */
	public HrFeedback() {
		this("hr_feedback", null);
	}

	/**
	 * Create an aliased <code>hrDB.hr_feedback</code> table reference
	 */
	public HrFeedback(String alias) {
		this(alias, HR_FEEDBACK);
	}

	private HrFeedback(String alias, Table<HrFeedbackRecord> aliased) {
		this(alias, aliased, null);
	}

	private HrFeedback(String alias, Table<HrFeedbackRecord> aliased, Field<?>[] parameters) {
		super(alias, Hrdb.HRDB, aliased, parameters, "HR反馈表");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<HrFeedbackRecord, UInteger> getIdentity() {
		return Keys.IDENTITY_HR_FEEDBACK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<HrFeedbackRecord> getPrimaryKey() {
		return Keys.KEY_HR_FEEDBACK_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<HrFeedbackRecord>> getKeys() {
		return Arrays.<UniqueKey<HrFeedbackRecord>>asList(Keys.KEY_HR_FEEDBACK_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrFeedback as(String alias) {
		return new HrFeedback(alias, this);
	}

	/**
	 * Rename this table
	 */
	public HrFeedback rename(String name) {
		return new HrFeedback(name, null);
	}
}
