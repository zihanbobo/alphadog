/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.configdb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * redis缓存配置表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ConfigCacheconfigRediskey implements Serializable {

    private static final long serialVersionUID = -829357034;

    private Integer   id;
    private Integer   projectAppid;
    private String    keyIdentifier;
    private Byte      type;
    private String    pattern;
    private String    jsonExtraparams;
    private Integer   ttl;
    private String    desc;
    private Timestamp createTime;

    public ConfigCacheconfigRediskey() {}

    public ConfigCacheconfigRediskey(ConfigCacheconfigRediskey value) {
        this.id = value.id;
        this.projectAppid = value.projectAppid;
        this.keyIdentifier = value.keyIdentifier;
        this.type = value.type;
        this.pattern = value.pattern;
        this.jsonExtraparams = value.jsonExtraparams;
        this.ttl = value.ttl;
        this.desc = value.desc;
        this.createTime = value.createTime;
    }

    public ConfigCacheconfigRediskey(
        Integer   id,
        Integer   projectAppid,
        String    keyIdentifier,
        Byte      type,
        String    pattern,
        String    jsonExtraparams,
        Integer   ttl,
        String    desc,
        Timestamp createTime
    ) {
        this.id = id;
        this.projectAppid = projectAppid;
        this.keyIdentifier = keyIdentifier;
        this.type = type;
        this.pattern = pattern;
        this.jsonExtraparams = jsonExtraparams;
        this.ttl = ttl;
        this.desc = desc;
        this.createTime = createTime;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProjectAppid() {
        return this.projectAppid;
    }

    public void setProjectAppid(Integer projectAppid) {
        this.projectAppid = projectAppid;
    }

    public String getKeyIdentifier() {
        return this.keyIdentifier;
    }

    public void setKeyIdentifier(String keyIdentifier) {
        this.keyIdentifier = keyIdentifier;
    }

    public Byte getType() {
        return this.type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getPattern() {
        return this.pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getJsonExtraparams() {
        return this.jsonExtraparams;
    }

    public void setJsonExtraparams(String jsonExtraparams) {
        this.jsonExtraparams = jsonExtraparams;
    }

    public Integer getTtl() {
        return this.ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ConfigCacheconfigRediskey (");

        sb.append(id);
        sb.append(", ").append(projectAppid);
        sb.append(", ").append(keyIdentifier);
        sb.append(", ").append(type);
        sb.append(", ").append(pattern);
        sb.append(", ").append(jsonExtraparams);
        sb.append(", ").append(ttl);
        sb.append(", ").append(desc);
        sb.append(", ").append(createTime);

        sb.append(")");
        return sb.toString();
    }
}
