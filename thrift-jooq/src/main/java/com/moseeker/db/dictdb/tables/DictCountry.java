/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.dictdb.tables;


import com.moseeker.db.dictdb.Dictdb;
import com.moseeker.db.dictdb.Keys;
import com.moseeker.db.dictdb.tables.records.DictCountryRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;


/**
 * 城市字典表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DictCountry extends TableImpl<DictCountryRecord> {

    private static final long serialVersionUID = 378848103;

    /**
     * The reference instance of <code>dictDB.dict_country</code>
     */
    public static final DictCountry DICT_COUNTRY = new DictCountry();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DictCountryRecord> getRecordType() {
        return DictCountryRecord.class;
    }

    /**
     * The column <code>dictDB.dict_country.id</code>. 主key
     */
    public final TableField<DictCountryRecord, UInteger> ID = createField("id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "主key");

    /**
     * The column <code>dictDB.dict_country.name</code>. 国家中文名称
     */
    public final TableField<DictCountryRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "国家中文名称");

    /**
     * The column <code>dictDB.dict_country.ename</code>. 国家英文名称
     */
    public final TableField<DictCountryRecord, String> ENAME = createField("ename", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "国家英文名称");

    /**
     * The column <code>dictDB.dict_country.iso_code_2</code>. iso_code_2
     */
    public final TableField<DictCountryRecord, String> ISO_CODE_2 = createField("iso_code_2", org.jooq.impl.SQLDataType.CHAR.length(2).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.CHAR)), this, "iso_code_2");

    /**
     * The column <code>dictDB.dict_country.iso_code_3</code>. iso_code_3
     */
    public final TableField<DictCountryRecord, String> ISO_CODE_3 = createField("iso_code_3", org.jooq.impl.SQLDataType.CHAR.length(3).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.CHAR)), this, "iso_code_3");

    /**
     * The column <code>dictDB.dict_country.code</code>. COUNTRY CODE
     */
    public final TableField<DictCountryRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.CHAR.length(11).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.CHAR)), this, "COUNTRY CODE");

    /**
     * The column <code>dictDB.dict_country.icon_class</code>. 国旗样式
     */
    public final TableField<DictCountryRecord, String> ICON_CLASS = createField("icon_class", org.jooq.impl.SQLDataType.CHAR.length(3).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.CHAR)), this, "国旗样式");

    /**
     * Create a <code>dictDB.dict_country</code> table reference
     */
    public DictCountry() {
        this("dict_country", null);
    }

    /**
     * Create an aliased <code>dictDB.dict_country</code> table reference
     */
    public DictCountry(String alias) {
        this(alias, DICT_COUNTRY);
    }

    private DictCountry(String alias, Table<DictCountryRecord> aliased) {
        this(alias, aliased, null);
    }

    private DictCountry(String alias, Table<DictCountryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "城市字典表");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Dictdb.DICTDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<DictCountryRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_DICT_COUNTRY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DictCountryRecord> getPrimaryKey() {
        return Keys.KEY_DICT_COUNTRY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DictCountryRecord>> getKeys() {
        return Arrays.<UniqueKey<DictCountryRecord>>asList(Keys.KEY_DICT_COUNTRY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictCountry as(String alias) {
        return new DictCountry(alias, this);
    }

    /**
     * Rename this table
     */
    public DictCountry rename(String name) {
        return new DictCountry(name, null);
    }
}
