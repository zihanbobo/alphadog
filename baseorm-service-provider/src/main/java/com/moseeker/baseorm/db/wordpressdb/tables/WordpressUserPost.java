/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.wordpressdb.tables;


import com.moseeker.baseorm.db.wordpressdb.Keys;
import com.moseeker.baseorm.db.wordpressdb.Wordpressdb;
import com.moseeker.baseorm.db.wordpressdb.tables.records.WordpressUserPostRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


/**
 * 用户查看新版本
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WordpressUserPost extends TableImpl<WordpressUserPostRecord> {

	private static final long serialVersionUID = -389228129;

	/**
	 * The reference instance of <code>wordpressdb.wordpress_user_post</code>
	 */
	public static final WordpressUserPost WORDPRESS_USER_POST = new WordpressUserPost();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<WordpressUserPostRecord> getRecordType() {
		return WordpressUserPostRecord.class;
	}

	/**
	 * The column <code>wordpressdb.wordpress_user_post.user_id</code>. 用户编号
	 */
	public final TableField<WordpressUserPostRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "用户编号");

	/**
	 * The column <code>wordpressdb.wordpress_user_post.object_id</code>. 文章编号
	 */
	public final TableField<WordpressUserPostRecord, ULong> OBJECT_ID = createField("object_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "文章编号");

	/**
	 * Create a <code>wordpressdb.wordpress_user_post</code> table reference
	 */
	public WordpressUserPost() {
		this("wordpress_user_post", null);
	}

	/**
	 * Create an aliased <code>wordpressdb.wordpress_user_post</code> table reference
	 */
	public WordpressUserPost(String alias) {
		this(alias, WORDPRESS_USER_POST);
	}

	private WordpressUserPost(String alias, Table<WordpressUserPostRecord> aliased) {
		this(alias, aliased, null);
	}

	private WordpressUserPost(String alias, Table<WordpressUserPostRecord> aliased, Field<?>[] parameters) {
		super(alias, Wordpressdb.WORDPRESSDB, aliased, parameters, "用户查看新版本");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<WordpressUserPostRecord> getPrimaryKey() {
		return Keys.KEY_WORDPRESS_USER_POST_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<WordpressUserPostRecord>> getKeys() {
		return Arrays.<UniqueKey<WordpressUserPostRecord>>asList(Keys.KEY_WORDPRESS_USER_POST_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WordpressUserPost as(String alias) {
		return new WordpressUserPost(alias, this);
	}

	/**
	 * Rename this table
	 */
	public WordpressUserPost rename(String name) {
		return new WordpressUserPost(name, null);
	}
}