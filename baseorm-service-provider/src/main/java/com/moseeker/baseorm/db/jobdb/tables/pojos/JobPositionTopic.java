/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.jobdb.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * 职位主题活动关系表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JobPositionTopic implements Serializable {

    private static final long serialVersionUID = 146404807;

    private Integer positionId;
    private Integer topicId;

    public JobPositionTopic() {}

    public JobPositionTopic(JobPositionTopic value) {
        this.positionId = value.positionId;
        this.topicId = value.topicId;
    }

    public JobPositionTopic(
        Integer positionId,
        Integer topicId
    ) {
        this.positionId = positionId;
        this.topicId = topicId;
    }

    public Integer getPositionId() {
        return this.positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public Integer getTopicId() {
        return this.topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("JobPositionTopic (");

        sb.append(positionId);
        sb.append(", ").append(topicId);

        sb.append(")");
        return sb.toString();
    }
}
