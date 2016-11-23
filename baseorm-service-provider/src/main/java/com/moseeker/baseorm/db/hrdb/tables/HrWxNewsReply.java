/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.hrdb.tables;


import com.moseeker.baseorm.db.hrdb.Hrdb;
import com.moseeker.baseorm.db.hrdb.Keys;
import com.moseeker.baseorm.db.hrdb.tables.records.HrWxNewsReplyRecord;

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
 * 微信图文回复表
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrWxNewsReply extends TableImpl<HrWxNewsReplyRecord> {

	private static final long serialVersionUID = 324416826;

	/**
	 * The reference instance of <code>hrdb.hr_wx_news_reply</code>
	 */
	public static final HrWxNewsReply HR_WX_NEWS_REPLY = new HrWxNewsReply();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<HrWxNewsReplyRecord> getRecordType() {
		return HrWxNewsReplyRecord.class;
	}

	/**
	 * The column <code>hrdb.hr_wx_news_reply.id</code>.
	 */
	public final TableField<HrWxNewsReplyRecord, UInteger> ID = createField("id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>hrdb.hr_wx_news_reply.rid</code>.
	 */
	public final TableField<HrWxNewsReplyRecord, UInteger> RID = createField("rid", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>hrdb.hr_wx_news_reply.parentid</code>.
	 */
	public final TableField<HrWxNewsReplyRecord, UInteger> PARENTID = createField("parentid", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>hrdb.hr_wx_news_reply.title</code>.
	 */
	public final TableField<HrWxNewsReplyRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR.length(150).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>hrdb.hr_wx_news_reply.description</code>.
	 */
	public final TableField<HrWxNewsReplyRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>hrdb.hr_wx_news_reply.thumb</code>.
	 */
	public final TableField<HrWxNewsReplyRecord, String> THUMB = createField("thumb", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>hrdb.hr_wx_news_reply.content</code>.
	 */
	public final TableField<HrWxNewsReplyRecord, String> CONTENT = createField("content", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * The column <code>hrdb.hr_wx_news_reply.url</code>.
	 */
	public final TableField<HrWxNewsReplyRecord, String> URL = createField("url", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>hrdb.hr_wx_news_reply</code> table reference
	 */
	public HrWxNewsReply() {
		this("hr_wx_news_reply", null);
	}

	/**
	 * Create an aliased <code>hrdb.hr_wx_news_reply</code> table reference
	 */
	public HrWxNewsReply(String alias) {
		this(alias, HR_WX_NEWS_REPLY);
	}

	private HrWxNewsReply(String alias, Table<HrWxNewsReplyRecord> aliased) {
		this(alias, aliased, null);
	}

	private HrWxNewsReply(String alias, Table<HrWxNewsReplyRecord> aliased, Field<?>[] parameters) {
		super(alias, Hrdb.HRDB, aliased, parameters, "微信图文回复表");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<HrWxNewsReplyRecord, UInteger> getIdentity() {
		return Keys.IDENTITY_HR_WX_NEWS_REPLY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<HrWxNewsReplyRecord> getPrimaryKey() {
		return Keys.KEY_HR_WX_NEWS_REPLY_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<HrWxNewsReplyRecord>> getKeys() {
		return Arrays.<UniqueKey<HrWxNewsReplyRecord>>asList(Keys.KEY_HR_WX_NEWS_REPLY_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrWxNewsReply as(String alias) {
		return new HrWxNewsReply(alias, this);
	}

	/**
	 * Rename this table
	 */
	public HrWxNewsReply rename(String name) {
		return new HrWxNewsReply(name, null);
	}
}
