/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.dictdb.tables.daos;


import com.moseeker.baseorm.db.dictdb.tables.DictCityPostcode;
import com.moseeker.baseorm.db.dictdb.tables.records.DictCityPostcodeRecord;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


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
public class DictCityPostcodeDao extends DAOImpl<DictCityPostcodeRecord, com.moseeker.baseorm.db.dictdb.tables.pojos.DictCityPostcode, Integer> {

    /**
     * Create a new DictCityPostcodeDao without any configuration
     */
    public DictCityPostcodeDao() {
        super(DictCityPostcode.DICT_CITY_POSTCODE, com.moseeker.baseorm.db.dictdb.tables.pojos.DictCityPostcode.class);
    }

    /**
     * Create a new DictCityPostcodeDao with an attached configuration
     */
    public DictCityPostcodeDao(Configuration configuration) {
        super(DictCityPostcode.DICT_CITY_POSTCODE, com.moseeker.baseorm.db.dictdb.tables.pojos.DictCityPostcode.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.dictdb.tables.pojos.DictCityPostcode object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.dictdb.tables.pojos.DictCityPostcode> fetchById(Integer... values) {
        return fetch(DictCityPostcode.DICT_CITY_POSTCODE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.dictdb.tables.pojos.DictCityPostcode fetchOneById(Integer value) {
        return fetchOne(DictCityPostcode.DICT_CITY_POSTCODE.ID, value);
    }

    /**
     * Fetch records that have <code>postcode IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.dictdb.tables.pojos.DictCityPostcode> fetchByPostcode(String... values) {
        return fetch(DictCityPostcode.DICT_CITY_POSTCODE.POSTCODE, values);
    }

    /**
     * Fetch a unique record that has <code>postcode = value</code>
     */
    public com.moseeker.baseorm.db.dictdb.tables.pojos.DictCityPostcode fetchOneByPostcode(String value) {
        return fetchOne(DictCityPostcode.DICT_CITY_POSTCODE.POSTCODE, value);
    }

    /**
     * Fetch records that have <code>province IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.dictdb.tables.pojos.DictCityPostcode> fetchByProvince(String... values) {
        return fetch(DictCityPostcode.DICT_CITY_POSTCODE.PROVINCE, values);
    }

    /**
     * Fetch records that have <code>city IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.dictdb.tables.pojos.DictCityPostcode> fetchByCity(String... values) {
        return fetch(DictCityPostcode.DICT_CITY_POSTCODE.CITY, values);
    }

    /**
     * Fetch records that have <code>district IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.dictdb.tables.pojos.DictCityPostcode> fetchByDistrict(String... values) {
        return fetch(DictCityPostcode.DICT_CITY_POSTCODE.DISTRICT, values);
    }

    /**
     * Fetch records that have <code>code IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.dictdb.tables.pojos.DictCityPostcode> fetchByCode(String... values) {
        return fetch(DictCityPostcode.DICT_CITY_POSTCODE.CODE, values);
    }
}
