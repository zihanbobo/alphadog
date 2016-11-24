/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.dictdb;


import com.moseeker.baseorm.db.dictdb.tables.DictCity;
import com.moseeker.baseorm.db.dictdb.tables.DictCityMap;
import com.moseeker.baseorm.db.dictdb.tables.DictCollege;
import com.moseeker.baseorm.db.dictdb.tables.DictConstant;
import com.moseeker.baseorm.db.dictdb.tables.DictCountry;
import com.moseeker.baseorm.db.dictdb.tables.DictIndustry;
import com.moseeker.baseorm.db.dictdb.tables.DictIndustryType;
import com.moseeker.baseorm.db.dictdb.tables.DictMajor;
import com.moseeker.baseorm.db.dictdb.tables.DictPosition;
import com.moseeker.baseorm.db.dictdb.tables.DictZhilianOccupation;
import com.moseeker.baseorm.db.dictdb.tables.Dict_51jobOccupation;
import com.moseeker.baseorm.db.dictdb.tables.records.DictCityMapRecord;
import com.moseeker.baseorm.db.dictdb.tables.records.DictCityRecord;
import com.moseeker.baseorm.db.dictdb.tables.records.DictCollegeRecord;
import com.moseeker.baseorm.db.dictdb.tables.records.DictConstantRecord;
import com.moseeker.baseorm.db.dictdb.tables.records.DictCountryRecord;
import com.moseeker.baseorm.db.dictdb.tables.records.DictIndustryRecord;
import com.moseeker.baseorm.db.dictdb.tables.records.DictIndustryTypeRecord;
import com.moseeker.baseorm.db.dictdb.tables.records.DictMajorRecord;
import com.moseeker.baseorm.db.dictdb.tables.records.DictPositionRecord;
import com.moseeker.baseorm.db.dictdb.tables.records.DictZhilianOccupationRecord;
import com.moseeker.baseorm.db.dictdb.tables.records.Dict_51jobOccupationRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;
import org.jooq.types.UInteger;


/**
 * A class modelling foreign key relationships between tables of the <code>dictdb</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<Dict_51jobOccupationRecord, Integer> IDENTITY_DICT_51JOB_OCCUPATION = Identities0.IDENTITY_DICT_51JOB_OCCUPATION;
    public static final Identity<DictCityMapRecord, Integer> IDENTITY_DICT_CITY_MAP = Identities0.IDENTITY_DICT_CITY_MAP;
    public static final Identity<DictConstantRecord, UInteger> IDENTITY_DICT_CONSTANT = Identities0.IDENTITY_DICT_CONSTANT;
    public static final Identity<DictCountryRecord, UInteger> IDENTITY_DICT_COUNTRY = Identities0.IDENTITY_DICT_COUNTRY;
    public static final Identity<DictZhilianOccupationRecord, Integer> IDENTITY_DICT_ZHILIAN_OCCUPATION = Identities0.IDENTITY_DICT_ZHILIAN_OCCUPATION;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<Dict_51jobOccupationRecord> KEY_DICT_51JOB_OCCUPATION_PRIMARY = UniqueKeys0.KEY_DICT_51JOB_OCCUPATION_PRIMARY;
    public static final UniqueKey<DictCityRecord> KEY_DICT_CITY_CODE = UniqueKeys0.KEY_DICT_CITY_CODE;
    public static final UniqueKey<DictCityMapRecord> KEY_DICT_CITY_MAP_PRIMARY = UniqueKeys0.KEY_DICT_CITY_MAP_PRIMARY;
    public static final UniqueKey<DictCollegeRecord> KEY_DICT_COLLEGE_CODE = UniqueKeys0.KEY_DICT_COLLEGE_CODE;
    public static final UniqueKey<DictConstantRecord> KEY_DICT_CONSTANT_PRIMARY = UniqueKeys0.KEY_DICT_CONSTANT_PRIMARY;
    public static final UniqueKey<DictConstantRecord> KEY_DICT_CONSTANT_DICT_CONSTANT_TYPE_CODE = UniqueKeys0.KEY_DICT_CONSTANT_DICT_CONSTANT_TYPE_CODE;
    public static final UniqueKey<DictCountryRecord> KEY_DICT_COUNTRY_PRIMARY = UniqueKeys0.KEY_DICT_COUNTRY_PRIMARY;
    public static final UniqueKey<DictIndustryRecord> KEY_DICT_INDUSTRY_CODE = UniqueKeys0.KEY_DICT_INDUSTRY_CODE;
    public static final UniqueKey<DictIndustryTypeRecord> KEY_DICT_INDUSTRY_TYPE_CODE = UniqueKeys0.KEY_DICT_INDUSTRY_TYPE_CODE;
    public static final UniqueKey<DictMajorRecord> KEY_DICT_MAJOR_CODE = UniqueKeys0.KEY_DICT_MAJOR_CODE;
    public static final UniqueKey<DictPositionRecord> KEY_DICT_POSITION_CODE = UniqueKeys0.KEY_DICT_POSITION_CODE;
    public static final UniqueKey<DictZhilianOccupationRecord> KEY_DICT_ZHILIAN_OCCUPATION_PRIMARY = UniqueKeys0.KEY_DICT_ZHILIAN_OCCUPATION_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<Dict_51jobOccupationRecord, Integer> IDENTITY_DICT_51JOB_OCCUPATION = createIdentity(Dict_51jobOccupation.DICT_51JOB_OCCUPATION, Dict_51jobOccupation.DICT_51JOB_OCCUPATION.CODE);
        public static Identity<DictCityMapRecord, Integer> IDENTITY_DICT_CITY_MAP = createIdentity(DictCityMap.DICT_CITY_MAP, DictCityMap.DICT_CITY_MAP.ID);
        public static Identity<DictConstantRecord, UInteger> IDENTITY_DICT_CONSTANT = createIdentity(DictConstant.DICT_CONSTANT, DictConstant.DICT_CONSTANT.ID);
        public static Identity<DictCountryRecord, UInteger> IDENTITY_DICT_COUNTRY = createIdentity(DictCountry.DICT_COUNTRY, DictCountry.DICT_COUNTRY.ID);
        public static Identity<DictZhilianOccupationRecord, Integer> IDENTITY_DICT_ZHILIAN_OCCUPATION = createIdentity(DictZhilianOccupation.DICT_ZHILIAN_OCCUPATION, DictZhilianOccupation.DICT_ZHILIAN_OCCUPATION.CODE);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<Dict_51jobOccupationRecord> KEY_DICT_51JOB_OCCUPATION_PRIMARY = createUniqueKey(Dict_51jobOccupation.DICT_51JOB_OCCUPATION, "KEY_dict_51job_occupation_PRIMARY", Dict_51jobOccupation.DICT_51JOB_OCCUPATION.CODE);
        public static final UniqueKey<DictCityRecord> KEY_DICT_CITY_CODE = createUniqueKey(DictCity.DICT_CITY, "KEY_dict_city_code", DictCity.DICT_CITY.CODE);
        public static final UniqueKey<DictCityMapRecord> KEY_DICT_CITY_MAP_PRIMARY = createUniqueKey(DictCityMap.DICT_CITY_MAP, "KEY_dict_city_map_PRIMARY", DictCityMap.DICT_CITY_MAP.ID);
        public static final UniqueKey<DictCollegeRecord> KEY_DICT_COLLEGE_CODE = createUniqueKey(DictCollege.DICT_COLLEGE, "KEY_dict_college_code", DictCollege.DICT_COLLEGE.CODE);
        public static final UniqueKey<DictConstantRecord> KEY_DICT_CONSTANT_PRIMARY = createUniqueKey(DictConstant.DICT_CONSTANT, "KEY_dict_constant_PRIMARY", DictConstant.DICT_CONSTANT.ID);
        public static final UniqueKey<DictConstantRecord> KEY_DICT_CONSTANT_DICT_CONSTANT_TYPE_CODE = createUniqueKey(DictConstant.DICT_CONSTANT, "KEY_dict_constant_dict_constant_type_code", DictConstant.DICT_CONSTANT.PARENT_CODE, DictConstant.DICT_CONSTANT.CODE);
        public static final UniqueKey<DictCountryRecord> KEY_DICT_COUNTRY_PRIMARY = createUniqueKey(DictCountry.DICT_COUNTRY, "KEY_dict_country_PRIMARY", DictCountry.DICT_COUNTRY.ID);
        public static final UniqueKey<DictIndustryRecord> KEY_DICT_INDUSTRY_CODE = createUniqueKey(DictIndustry.DICT_INDUSTRY, "KEY_dict_industry_code", DictIndustry.DICT_INDUSTRY.CODE);
        public static final UniqueKey<DictIndustryTypeRecord> KEY_DICT_INDUSTRY_TYPE_CODE = createUniqueKey(DictIndustryType.DICT_INDUSTRY_TYPE, "KEY_dict_industry_type_code", DictIndustryType.DICT_INDUSTRY_TYPE.CODE);
        public static final UniqueKey<DictMajorRecord> KEY_DICT_MAJOR_CODE = createUniqueKey(DictMajor.DICT_MAJOR, "KEY_dict_major_code", DictMajor.DICT_MAJOR.CODE);
        public static final UniqueKey<DictPositionRecord> KEY_DICT_POSITION_CODE = createUniqueKey(DictPosition.DICT_POSITION, "KEY_dict_position_code", DictPosition.DICT_POSITION.CODE);
        public static final UniqueKey<DictZhilianOccupationRecord> KEY_DICT_ZHILIAN_OCCUPATION_PRIMARY = createUniqueKey(DictZhilianOccupation.DICT_ZHILIAN_OCCUPATION, "KEY_dict_zhilian_occupation_PRIMARY", DictZhilianOccupation.DICT_ZHILIAN_OCCUPATION.CODE);
    }
}
