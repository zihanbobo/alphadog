/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.thirdpartydb;


import com.moseeker.baseorm.db.thirdpartydb.tables.ThirdpartyAccountCity;
import com.moseeker.baseorm.db.thirdpartydb.tables.ThirdpartyAccountCompany;
import com.moseeker.baseorm.db.thirdpartydb.tables.ThirdpartyAccountCompanyAddress;
import com.moseeker.baseorm.db.thirdpartydb.tables.ThirdpartyAccountDepartment;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in thirdpartydb
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * 第三方渠道的可发布职位的地区
     */
    public static final ThirdpartyAccountCity THIRDPARTY_ACCOUNT_CITY = com.moseeker.baseorm.db.thirdpartydb.tables.ThirdpartyAccountCity.THIRDPARTY_ACCOUNT_CITY;

    /**
     * 第三方渠道的所属公司名称
     */
    public static final ThirdpartyAccountCompany THIRDPARTY_ACCOUNT_COMPANY = com.moseeker.baseorm.db.thirdpartydb.tables.ThirdpartyAccountCompany.THIRDPARTY_ACCOUNT_COMPANY;

    /**
     * 第三方渠道的上班地址
     */
    public static final ThirdpartyAccountCompanyAddress THIRDPARTY_ACCOUNT_COMPANY_ADDRESS = com.moseeker.baseorm.db.thirdpartydb.tables.ThirdpartyAccountCompanyAddress.THIRDPARTY_ACCOUNT_COMPANY_ADDRESS;

    /**
     * 第三方渠道的所属部门名称
     */
    public static final ThirdpartyAccountDepartment THIRDPARTY_ACCOUNT_DEPARTMENT = com.moseeker.baseorm.db.thirdpartydb.tables.ThirdpartyAccountDepartment.THIRDPARTY_ACCOUNT_DEPARTMENT;
}