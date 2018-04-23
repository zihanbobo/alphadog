/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.jobdb.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * 简历筛选关联职位中间表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JobPositionProfileFilter implements Serializable {

    private static final long serialVersionUID = 233231670;

    private Integer pid;
    private Integer pfid;

    public JobPositionProfileFilter() {}

    public JobPositionProfileFilter(JobPositionProfileFilter value) {
        this.pid = value.pid;
        this.pfid = value.pfid;
    }

    public JobPositionProfileFilter(
        Integer pid,
        Integer pfid
    ) {
        this.pid = pid;
        this.pfid = pfid;
    }

    public Integer getPid() {
        return this.pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getPfid() {
        return this.pfid;
    }

    public void setPfid(Integer pfid) {
        this.pfid = pfid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("JobPositionProfileFilter (");

        sb.append(pid);
        sb.append(", ").append(pfid);

        sb.append(")");
        return sb.toString();
    }
}
