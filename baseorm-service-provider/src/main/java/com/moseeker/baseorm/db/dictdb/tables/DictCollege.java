/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.dictdb.tables;


import com.moseeker.baseorm.db.dictdb.Dictdb;
import com.moseeker.baseorm.db.dictdb.Keys;
import com.moseeker.baseorm.db.dictdb.tables.records.DictCollegeRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
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
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DictCollege extends TableImpl<DictCollegeRecord> {

    private static final long serialVersionUID = 1075600708;

    /**
     * The reference instance of <code>dictdb.dict_college</code>
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
     * The column <code>dictdb.dict_college.code</code>. 字典code
     */
    public final TableField<DictCollegeRecord, UInteger> CODE = createField("code", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.field("00000", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "字典code");

    /**
     * The column <code>dictdb.dict_college.name</code>. 字典name
     */
    public final TableField<DictCollegeRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "字典name");

    /**
     * The column <code>dictdb.dict_college.province</code>. 院校所在地
     */
    public final TableField<DictCollegeRecord, UInteger> PROVINCE = createField("province", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.field("000000", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "院校所在地");

    /**
     * The column <code>dictdb.dict_college.logo</code>. 院校logo
     */
    public final TableField<DictCollegeRecord, String> LOGO = createField("logo", org.jooq.impl.SQLDataType.VARCHAR.length(256).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "院校logo");

    /**
     * Create a <code>dictdb.dict_college</code> table reference
     */
    public DictCollege() {
        this("dict_college", null);
    }

    /**
     * Create an aliased <code>dictdb.dict_college</code> table reference
     */
    public DictCollege(String alias) {
        this(alias, DICT_COLLEGE);
    }

    private DictCollege(String alias, Table<DictCollegeRecord> aliased) {
        this(alias, aliased, null);
    }

    private DictCollege(String alias, Table<DictCollegeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "学校字典表");
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
