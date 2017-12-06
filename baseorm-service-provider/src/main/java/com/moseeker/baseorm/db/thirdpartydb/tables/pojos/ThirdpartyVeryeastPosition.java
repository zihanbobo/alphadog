/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.thirdpartydb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 的第三方职位子表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ThirdpartyVeryeastPosition implements Serializable {

    private static final long serialVersionUID = 72184569;

    private Integer   id;
    private Integer   pid;
    private Integer   accommodation;
    private Integer   ageTop;
    private Integer   ageBottom;
    private Integer   languagetype1;
    private Integer   languagelevel1;
    private Integer   languagetype2;
    private Integer   languagelevel2;
    private Integer   languagetype3;
    private Integer   languagelevel3;
    private Integer   computerlevel;
    private Integer   indate;
    private Timestamp createtime;
    private Short     status;

    public ThirdpartyVeryeastPosition() {}

    public ThirdpartyVeryeastPosition(ThirdpartyVeryeastPosition value) {
        this.id = value.id;
        this.pid = value.pid;
        this.accommodation = value.accommodation;
        this.ageTop = value.ageTop;
        this.ageBottom = value.ageBottom;
        this.languagetype1 = value.languagetype1;
        this.languagelevel1 = value.languagelevel1;
        this.languagetype2 = value.languagetype2;
        this.languagelevel2 = value.languagelevel2;
        this.languagetype3 = value.languagetype3;
        this.languagelevel3 = value.languagelevel3;
        this.computerlevel = value.computerlevel;
        this.indate = value.indate;
        this.createtime = value.createtime;
        this.status = value.status;
    }

    public ThirdpartyVeryeastPosition(
        Integer   id,
        Integer   pid,
        Integer   accommodation,
        Integer   ageTop,
        Integer   ageBottom,
        Integer   languagetype1,
        Integer   languagelevel1,
        Integer   languagetype2,
        Integer   languagelevel2,
        Integer   languagetype3,
        Integer   languagelevel3,
        Integer   computerlevel,
        Integer   indate,
        Timestamp createtime,
        Short     status
    ) {
        this.id = id;
        this.pid = pid;
        this.accommodation = accommodation;
        this.ageTop = ageTop;
        this.ageBottom = ageBottom;
        this.languagetype1 = languagetype1;
        this.languagelevel1 = languagelevel1;
        this.languagetype2 = languagetype2;
        this.languagelevel2 = languagelevel2;
        this.languagetype3 = languagetype3;
        this.languagelevel3 = languagelevel3;
        this.computerlevel = computerlevel;
        this.indate = indate;
        this.createtime = createtime;
        this.status = status;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return this.pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getAccommodation() {
        return this.accommodation;
    }

    public void setAccommodation(Integer accommodation) {
        this.accommodation = accommodation;
    }

    public Integer getAgeTop() {
        return this.ageTop;
    }

    public void setAgeTop(Integer ageTop) {
        this.ageTop = ageTop;
    }

    public Integer getAgeBottom() {
        return this.ageBottom;
    }

    public void setAgeBottom(Integer ageBottom) {
        this.ageBottom = ageBottom;
    }

    public Integer getLanguagetype1() {
        return this.languagetype1;
    }

    public void setLanguagetype1(Integer languagetype1) {
        this.languagetype1 = languagetype1;
    }

    public Integer getLanguagelevel1() {
        return this.languagelevel1;
    }

    public void setLanguagelevel1(Integer languagelevel1) {
        this.languagelevel1 = languagelevel1;
    }

    public Integer getLanguagetype2() {
        return this.languagetype2;
    }

    public void setLanguagetype2(Integer languagetype2) {
        this.languagetype2 = languagetype2;
    }

    public Integer getLanguagelevel2() {
        return this.languagelevel2;
    }

    public void setLanguagelevel2(Integer languagelevel2) {
        this.languagelevel2 = languagelevel2;
    }

    public Integer getLanguagetype3() {
        return this.languagetype3;
    }

    public void setLanguagetype3(Integer languagetype3) {
        this.languagetype3 = languagetype3;
    }

    public Integer getLanguagelevel3() {
        return this.languagelevel3;
    }

    public void setLanguagelevel3(Integer languagelevel3) {
        this.languagelevel3 = languagelevel3;
    }

    public Integer getComputerlevel() {
        return this.computerlevel;
    }

    public void setComputerlevel(Integer computerlevel) {
        this.computerlevel = computerlevel;
    }

    public Integer getIndate() {
        return this.indate;
    }

    public void setIndate(Integer indate) {
        this.indate = indate;
    }

    public Timestamp getCreatetime() {
        return this.createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    public Short getStatus() {
        return this.status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ThirdpartyVeryeastPosition (");

        sb.append(id);
        sb.append(", ").append(pid);
        sb.append(", ").append(accommodation);
        sb.append(", ").append(ageTop);
        sb.append(", ").append(ageBottom);
        sb.append(", ").append(languagetype1);
        sb.append(", ").append(languagelevel1);
        sb.append(", ").append(languagetype2);
        sb.append(", ").append(languagelevel2);
        sb.append(", ").append(languagetype3);
        sb.append(", ").append(languagelevel3);
        sb.append(", ").append(computerlevel);
        sb.append(", ").append(indate);
        sb.append(", ").append(createtime);
        sb.append(", ").append(status);

        sb.append(")");
        return sb.toString();
    }
}
