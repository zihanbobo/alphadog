package com.moseeker.position.pojo;

import com.moseeker.baseorm.db.userdb.tables.pojos.UserHrAccount;

/**
 * Created by zztaiwll on 18/1/25.
 * 用于组织小程序端职位列表的职位信息
 */
public class PositionMiniInfo {
    private int id;
    private boolean priority;
    private String title;
    private String department;
    private int resumeNum;
    private int pageView;
    private String updateTime;
    private UserHrAccount account;
    private int status;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isPriority() {
        return priority;
    }

    public void setPriority(boolean priority) {
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getResumeNum() {
        return resumeNum;
    }

    public void setResumeNum(int resumeNum) {
        this.resumeNum = resumeNum;
    }

    public int getPageView() {
        return pageView;
    }

    public void setPageView(int pageView) {
        this.pageView = pageView;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public UserHrAccount getAccount() {
        return account;
    }

    public void setAccount(UserHrAccount account) {
        this.account = account;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
