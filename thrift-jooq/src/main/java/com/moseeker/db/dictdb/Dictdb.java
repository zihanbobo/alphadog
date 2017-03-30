/*
 * This file is generated by jOOQ.
*/
package com.moseeker.db.dictdb;


import com.moseeker.db.dictdb.tables.DictCity;
import com.moseeker.db.dictdb.tables.DictCityMap;
import com.moseeker.db.dictdb.tables.DictCityPostcode;
import com.moseeker.db.dictdb.tables.DictCollege;
import com.moseeker.db.dictdb.tables.DictConstant;
import com.moseeker.db.dictdb.tables.DictCountry;
import com.moseeker.db.dictdb.tables.DictIndustry;
import com.moseeker.db.dictdb.tables.DictIndustryType;
import com.moseeker.db.dictdb.tables.DictMajor;
import com.moseeker.db.dictdb.tables.DictPosition;
import com.moseeker.db.dictdb.tables.DictZhilianOccupation;
import com.moseeker.db.dictdb.tables.Dict_51jobOccupation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Dictdb extends SchemaImpl {

    private static final long serialVersionUID = -1162945603;

    /**
     * The reference instance of <code>dictdb</code>
     */
    public static final Dictdb DICTDB = new Dictdb();

    /**
     * 51的职位表
     */
    public final Dict_51jobOccupation DICT_51JOB_OCCUPATION = com.moseeker.db.dictdb.tables.Dict_51jobOccupation.DICT_51JOB_OCCUPATION;

    /**
     * 城市字典表
     */
    public final DictCity DICT_CITY = com.moseeker.db.dictdb.tables.DictCity.DICT_CITY;

    /**
     * 城市字典code映射表
     */
    public final DictCityMap DICT_CITY_MAP = com.moseeker.db.dictdb.tables.DictCityMap.DICT_CITY_MAP;

    /**
     * The table <code>dictdb.dict_city_postcode</code>.
     */
    public final DictCityPostcode DICT_CITY_POSTCODE = com.moseeker.db.dictdb.tables.DictCityPostcode.DICT_CITY_POSTCODE;

    /**
     * 学校字典表
     */
    public final DictCollege DICT_COLLEGE = com.moseeker.db.dictdb.tables.DictCollege.DICT_COLLEGE;

    /**
     * 常量字典表
     */
    public final DictConstant DICT_CONSTANT = com.moseeker.db.dictdb.tables.DictConstant.DICT_CONSTANT;

    /**
     * 城市字典表
     */
    public final DictCountry DICT_COUNTRY = com.moseeker.db.dictdb.tables.DictCountry.DICT_COUNTRY;

    /**
     * 行业二级分类字典表
     */
    public final DictIndustry DICT_INDUSTRY = com.moseeker.db.dictdb.tables.DictIndustry.DICT_INDUSTRY;

    /**
     * 行业一级分类字典表
     */
    public final DictIndustryType DICT_INDUSTRY_TYPE = com.moseeker.db.dictdb.tables.DictIndustryType.DICT_INDUSTRY_TYPE;

    /**
     * 专业字典表
     */
    public final DictMajor DICT_MAJOR = com.moseeker.db.dictdb.tables.DictMajor.DICT_MAJOR;

    /**
     * 职能分类字典表
     */
    public final DictPosition DICT_POSITION = com.moseeker.db.dictdb.tables.DictPosition.DICT_POSITION;

    /**
     * 智联的职位表
     */
    public final DictZhilianOccupation DICT_ZHILIAN_OCCUPATION = com.moseeker.db.dictdb.tables.DictZhilianOccupation.DICT_ZHILIAN_OCCUPATION;

    /**
     * No further instances allowed
     */
    private Dictdb() {
        super("dictdb", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Dict_51jobOccupation.DICT_51JOB_OCCUPATION,
            DictCity.DICT_CITY,
            DictCityMap.DICT_CITY_MAP,
            DictCityPostcode.DICT_CITY_POSTCODE,
            DictCollege.DICT_COLLEGE,
            DictConstant.DICT_CONSTANT,
            DictCountry.DICT_COUNTRY,
            DictIndustry.DICT_INDUSTRY,
            DictIndustryType.DICT_INDUSTRY_TYPE,
            DictMajor.DICT_MAJOR,
            DictPosition.DICT_POSITION,
            DictZhilianOccupation.DICT_ZHILIAN_OCCUPATION);
    }
}
