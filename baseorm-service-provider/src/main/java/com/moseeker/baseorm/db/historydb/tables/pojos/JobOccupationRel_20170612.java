/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.historydb.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * 职位与职能关系表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JobOccupationRel_20170612 implements Serializable {

    private static final long serialVersionUID = -75608595;

    private Integer pid;
    private Integer code;

    public JobOccupationRel_20170612() {}

    public JobOccupationRel_20170612(JobOccupationRel_20170612 value) {
        this.pid = value.pid;
        this.code = value.code;
    }

    public JobOccupationRel_20170612(
        Integer pid,
        Integer code
    ) {
        this.pid = pid;
        this.code = code;
    }

    public Integer getPid() {
        return this.pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("JobOccupationRel_20170612 (");

        sb.append(pid);
        sb.append(", ").append(code);

        sb.append(")");
        return sb.toString();
    }
}
