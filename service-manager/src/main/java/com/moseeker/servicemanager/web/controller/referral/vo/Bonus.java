package com.moseeker.servicemanager.web.controller.referral.vo;

/**
 * 奖金
 * @Author: jack
 * @Date: 2018/9/27
 */
public class Bonus {

    private int id;
    private java.lang.String name;
    private String value;
    private java.lang.String positionTitle;
    private java.lang.String candidateName;
    private long employmentDate;
    private boolean open;
    private int type;
    private boolean cancel;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getPositionTitle() {
        return positionTitle;
    }

    public void setPositionTitle(String positionTitle) {
        this.positionTitle = positionTitle;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public long getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(long employmentDate) {
        this.employmentDate = employmentDate;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public boolean isCancel() {
        return cancel;
    }

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }
}
