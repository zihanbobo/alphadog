/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.dictdb.tables.daos;


import com.moseeker.baseorm.db.dictdb.tables.DictCityLiepin;
import com.moseeker.baseorm.db.dictdb.tables.records.DictCityLiepinRecord;

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
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DictCityLiepinDao extends DAOImpl<DictCityLiepinRecord, com.moseeker.baseorm.db.dictdb.tables.pojos.DictCityLiepin, Integer> {

    /**
     * Create a new DictCityLiepinDao without any configuration
     */
    public DictCityLiepinDao() {
        super(DictCityLiepin.DICT_CITY_LIEPIN, com.moseeker.baseorm.db.dictdb.tables.pojos.DictCityLiepin.class);
    }

    /**
     * Create a new DictCityLiepinDao with an attached configuration
     */
    public DictCityLiepinDao(Configuration configuration) {
        super(DictCityLiepin.DICT_CITY_LIEPIN, com.moseeker.baseorm.db.dictdb.tables.pojos.DictCityLiepin.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.dictdb.tables.pojos.DictCityLiepin object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.dictdb.tables.pojos.DictCityLiepin> fetchById(Integer... values) {
        return fetch(DictCityLiepin.DICT_CITY_LIEPIN.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.dictdb.tables.pojos.DictCityLiepin fetchOneById(Integer value) {
        return fetchOne(DictCityLiepin.DICT_CITY_LIEPIN.ID, value);
    }

    /**
     * Fetch records that have <code>code IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.dictdb.tables.pojos.DictCityLiepin> fetchByCode(String... values) {
        return fetch(DictCityLiepin.DICT_CITY_LIEPIN.CODE, values);
    }

    /**
     * Fetch records that have <code>cname IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.dictdb.tables.pojos.DictCityLiepin> fetchByCname(String... values) {
        return fetch(DictCityLiepin.DICT_CITY_LIEPIN.CNAME, values);
    }

    /**
     * Fetch records that have <code>ename IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.dictdb.tables.pojos.DictCityLiepin> fetchByEname(String... values) {
        return fetch(DictCityLiepin.DICT_CITY_LIEPIN.ENAME, values);
    }

    /**
     * Fetch records that have <code>flag IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.dictdb.tables.pojos.DictCityLiepin> fetchByFlag(Byte... values) {
        return fetch(DictCityLiepin.DICT_CITY_LIEPIN.FLAG, values);
    }

    /**
     * Fetch records that have <code>pcode IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.dictdb.tables.pojos.DictCityLiepin> fetchByPcode(String... values) {
        return fetch(DictCityLiepin.DICT_CITY_LIEPIN.PCODE, values);
    }

    /**
     * Fetch records that have <code>seouri IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.dictdb.tables.pojos.DictCityLiepin> fetchBySeouri(String... values) {
        return fetch(DictCityLiepin.DICT_CITY_LIEPIN.SEOURI, values);
    }

    /**
     * Fetch records that have <code>shortname IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.dictdb.tables.pojos.DictCityLiepin> fetchByShortname(String... values) {
        return fetch(DictCityLiepin.DICT_CITY_LIEPIN.SHORTNAME, values);
    }

    /**
     * Fetch records that have <code>othercode IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.dictdb.tables.pojos.DictCityLiepin> fetchByOthercode(String... values) {
        return fetch(DictCityLiepin.DICT_CITY_LIEPIN.OTHERCODE, values);
    }
}
