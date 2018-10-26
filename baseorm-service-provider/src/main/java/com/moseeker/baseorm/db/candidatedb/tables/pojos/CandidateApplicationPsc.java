/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.candidatedb.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * 申请时员工一度的链路
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CandidateApplicationPsc implements Serializable {

    private static final long serialVersionUID = -1682715769;

    private Integer id;
    private Integer applicationId;
    private Integer pscId;

    public CandidateApplicationPsc() {}

    public CandidateApplicationPsc(CandidateApplicationPsc value) {
        this.id = value.id;
        this.applicationId = value.applicationId;
        this.pscId = value.pscId;
    }

    public CandidateApplicationPsc(
        Integer id,
        Integer applicationId,
        Integer pscId
    ) {
        this.id = id;
        this.applicationId = applicationId;
        this.pscId = pscId;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getApplicationId() {
        return this.applicationId;
    }

    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }

    public Integer getPscId() {
        return this.pscId;
    }

    public void setPscId(Integer pscId) {
        this.pscId = pscId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CandidateApplicationPsc (");

        sb.append(id);
        sb.append(", ").append(applicationId);
        sb.append(", ").append(pscId);

        sb.append(")");
        return sb.toString();
    }
}