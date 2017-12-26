/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.jobdb.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * VIEW
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserProfileJobapply implements Serializable {

    private static final long serialVersionUID = -991717482;

    private Integer 用户id;
    private Integer 同上1;
    private Integer 同上2;
    private String  投递职位jobnumer;
    private Integer 同上3;
    private Integer 投递状态;
    private Byte    来源;
    private Integer ats来源是9;
    private String  姓名;

    public UserProfileJobapply() {}

    public UserProfileJobapply(UserProfileJobapply value) {
        this.用户id = value.用户id;
        this.同上1 = value.同上1;
        this.同上2 = value.同上2;
        this.投递职位jobnumer = value.投递职位jobnumer;
        this.同上3 = value.同上3;
        this.投递状态 = value.投递状态;
        this.来源 = value.来源;
        this.ats来源是9 = value.ats来源是9;
        this.姓名 = value.姓名;
    }

    public UserProfileJobapply(
        Integer 用户id,
        Integer 同上1,
        Integer 同上2,
        String  投递职位jobnumer,
        Integer 同上3,
        Integer 投递状态,
        Byte    来源,
        Integer ats来源是9,
        String  姓名
    ) {
        this.用户id = 用户id;
        this.同上1 = 同上1;
        this.同上2 = 同上2;
        this.投递职位jobnumer = 投递职位jobnumer;
        this.同上3 = 同上3;
        this.投递状态 = 投递状态;
        this.来源 = 来源;
        this.ats来源是9 = ats来源是9;
        this.姓名 = 姓名;
    }

    public Integer get用户id() {
        return this.用户id;
    }

    public void set用户id(Integer 用户id) {
        this.用户id = 用户id;
    }

    public Integer get同上1() {
        return this.同上1;
    }

    public void set同上1(Integer 同上1) {
        this.同上1 = 同上1;
    }

    public Integer get同上2() {
        return this.同上2;
    }

    public void set同上2(Integer 同上2) {
        this.同上2 = 同上2;
    }

    public String get投递职位jobnumer() {
        return this.投递职位jobnumer;
    }

    public void set投递职位jobnumer(String 投递职位jobnumer) {
        this.投递职位jobnumer = 投递职位jobnumer;
    }

    public Integer get同上3() {
        return this.同上3;
    }

    public void set同上3(Integer 同上3) {
        this.同上3 = 同上3;
    }

    public Integer get投递状态() {
        return this.投递状态;
    }

    public void set投递状态(Integer 投递状态) {
        this.投递状态 = 投递状态;
    }

    public Byte get来源() {
        return this.来源;
    }

    public void set来源(Byte 来源) {
        this.来源 = 来源;
    }

    public Integer getAts来源是9() {
        return this.ats来源是9;
    }

    public void setAts来源是9(Integer ats来源是9) {
        this.ats来源是9 = ats来源是9;
    }

    public String get姓名() {
        return this.姓名;
    }

    public void set姓名(String 姓名) {
        this.姓名 = 姓名;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserProfileJobapply (");

        sb.append(用户id);
        sb.append(", ").append(同上1);
        sb.append(", ").append(同上2);
        sb.append(", ").append(投递职位jobnumer);
        sb.append(", ").append(同上3);
        sb.append(", ").append(投递状态);
        sb.append(", ").append(来源);
        sb.append(", ").append(ats来源是9);
        sb.append(", ").append(姓名);

        sb.append(")");
        return sb.toString();
    }
}