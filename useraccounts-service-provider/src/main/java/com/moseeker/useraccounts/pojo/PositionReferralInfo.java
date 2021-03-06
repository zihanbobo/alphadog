package com.moseeker.useraccounts.pojo;

/**
 * Created by moseeker on 2018/12/10.
 */
public class PositionReferralInfo {

    public int userId; // optional
    public String employeeName; // optional
    public int employeeId; // optional
    public String positionName; // optional
    public int positionId; // optional
    public String employeeIcon;
    public String nickname;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public String getEmployeeIcon() {
        return employeeIcon;
    }

    public void setEmployeeIcon(String employeeIcon) {
        this.employeeIcon = employeeIcon;
    }
}
