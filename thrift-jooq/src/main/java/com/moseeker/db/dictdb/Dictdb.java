/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.dictdb;


import com.moseeker.db.dictdb.tables.DictCity;
import com.moseeker.db.dictdb.tables.DictCollege;
import com.moseeker.db.dictdb.tables.DictIndustry;
import com.moseeker.db.dictdb.tables.DictMajor;
import com.moseeker.db.dictdb.tables.DictPositionName;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Dictdb extends SchemaImpl {

	private static final long serialVersionUID = 1070047349;

	/**
	 * The reference instance of <code>dictDB</code>
	 */
	public static final Dictdb DICTDB = new Dictdb();

	/**
	 * No further instances allowed
	 */
	private Dictdb() {
		super("dictDB");
	}

	@Override
	public final List<Table<?>> getTables() {
		List result = new ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final List<Table<?>> getTables0() {
		return Arrays.<Table<?>>asList(
			DictCity.DICT_CITY,
			DictCollege.DICT_COLLEGE,
			DictIndustry.DICT_INDUSTRY,
			DictMajor.DICT_MAJOR,
			DictPositionName.DICT_POSITION_NAME);
	}
}
