/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.dictdb.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * 学校字典表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DictCollege implements Serializable {

    private static final long serialVersionUID = -557724829;

    private Integer code;
    private String  name;
    private Integer province;
    private String  logo;
    private Integer countryCode;

    public DictCollege() {}

    public DictCollege(DictCollege value) {
        this.code = value.code;
        this.name = value.name;
        this.province = value.province;
        this.logo = value.logo;
        this.countryCode = value.countryCode;
    }

    public DictCollege(
        Integer code,
        String  name,
        Integer province,
        String  logo,
        Integer countryCode
    ) {
        this.code = code;
        this.name = name;
        this.province = province;
        this.logo = logo;
        this.countryCode = countryCode;
    }

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getProvince() {
        return this.province;
    }

    public void setProvince(Integer province) {
        this.province = province;
    }

    public String getLogo() {
        return this.logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Integer getCountryCode() {
        return this.countryCode;
    }

    public void setCountryCode(Integer countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DictCollege (");

        sb.append(code);
        sb.append(", ").append(name);
        sb.append(", ").append(province);
        sb.append(", ").append(logo);
        sb.append(", ").append(countryCode);

        sb.append(")");
        return sb.toString();
    }
}
