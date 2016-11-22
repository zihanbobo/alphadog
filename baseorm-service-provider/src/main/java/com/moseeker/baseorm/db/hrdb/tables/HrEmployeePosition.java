/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.hrdb.tables;


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

import com.moseeker.baseorm.db.hrdb.Hrdb;
import com.moseeker.baseorm.db.hrdb.Keys;
import com.moseeker.baseorm.db.hrdb.tables.records.HrEmployeePositionRecord;


/**
 * 员工职能表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrEmployeePosition extends TableImpl<HrEmployeePositionRecord> {

    private static final long serialVersionUID = -1169106063;

    /**
     * The reference instance of <code>hrdb.hr_employee_position</code>
     */
    public static final HrEmployeePosition HR_EMPLOYEE_POSITION = new HrEmployeePosition();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HrEmployeePositionRecord> getRecordType() {
        return HrEmployeePositionRecord.class;
    }

    /**
     * The column <code>hrdb.hr_employee_position.id</code>.
     */
    public final TableField<HrEmployeePositionRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>hrdb.hr_employee_position.company_id</code>. sys_company.id, 部门ID
     */
    public final TableField<HrEmployeePositionRecord, Integer> COMPANY_ID = createField("company_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "sys_company.id, 部门ID");

    /**
     * The column <code>hrdb.hr_employee_position.name</code>. 职能名称
     */
    public final TableField<HrEmployeePositionRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "职能名称");

    /**
     * The column <code>hrdb.hr_employee_position.priority</code>. 排序优先级
     */
    public final TableField<HrEmployeePositionRecord, Integer> PRIORITY = createField("priority", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "排序优先级");

    /**
     * The column <code>hrdb.hr_employee_position.status</code>. 1:有效, 0:无效
     */
    public final TableField<HrEmployeePositionRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.TINYINT)), this, "1:有效, 0:无效");

    /**
     * Create a <code>hrdb.hr_employee_position</code> table reference
     */
    public HrEmployeePosition() {
        this("hr_employee_position", null);
    }

    /**
     * Create an aliased <code>hrdb.hr_employee_position</code> table reference
     */
    public HrEmployeePosition(String alias) {
        this(alias, HR_EMPLOYEE_POSITION);
    }

    private HrEmployeePosition(String alias, Table<HrEmployeePositionRecord> aliased) {
        this(alias, aliased, null);
    }

    private HrEmployeePosition(String alias, Table<HrEmployeePositionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "员工职能表");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Hrdb.HRDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<HrEmployeePositionRecord, Integer> getIdentity() {
        return Keys.IDENTITY_HR_EMPLOYEE_POSITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<HrEmployeePositionRecord> getPrimaryKey() {
        return Keys.KEY_HR_EMPLOYEE_POSITION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<HrEmployeePositionRecord>> getKeys() {
        return Arrays.<UniqueKey<HrEmployeePositionRecord>>asList(Keys.KEY_HR_EMPLOYEE_POSITION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrEmployeePosition as(String alias) {
        return new HrEmployeePosition(alias, this);
    }

    /**
     * Rename this table
     */
    public HrEmployeePosition rename(String name) {
        return new HrEmployeePosition(name, null);
    }
}
