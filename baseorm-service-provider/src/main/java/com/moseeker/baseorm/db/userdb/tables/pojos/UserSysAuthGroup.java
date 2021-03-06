/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.userdb.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * sysplat用户权限
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserSysAuthGroup implements Serializable {

    private static final long serialVersionUID = -335549741;

    private Integer id;
    private String  name;
    private Integer authcode;

    public UserSysAuthGroup() {}

    public UserSysAuthGroup(UserSysAuthGroup value) {
        this.id = value.id;
        this.name = value.name;
        this.authcode = value.authcode;
    }

    public UserSysAuthGroup(
        Integer id,
        String  name,
        Integer authcode
    ) {
        this.id = id;
        this.name = name;
        this.authcode = authcode;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAuthcode() {
        return this.authcode;
    }

    public void setAuthcode(Integer authcode) {
        this.authcode = authcode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserSysAuthGroup (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(authcode);

        sb.append(")");
        return sb.toString();
    }
}
