/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.employeedb;


import com.moseeker.baseorm.db.employeedb.tables.EmployeeCustomDisplay;
import com.moseeker.baseorm.db.employeedb.tables.EmployeeOptionValue;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in employeedb
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * 员工认证-自定义显示表
     */
    public static final EmployeeCustomDisplay EMPLOYEE_CUSTOM_DISPLAY = com.moseeker.baseorm.db.employeedb.tables.EmployeeCustomDisplay.EMPLOYEE_CUSTOM_DISPLAY;

    /**
     * 自定义字段的下拉选项表
     */
    public static final EmployeeOptionValue EMPLOYEE_OPTION_VALUE = com.moseeker.baseorm.db.employeedb.tables.EmployeeOptionValue.EMPLOYEE_OPTION_VALUE;
}
