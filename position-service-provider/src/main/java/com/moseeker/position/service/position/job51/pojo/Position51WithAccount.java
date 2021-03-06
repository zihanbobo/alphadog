package com.moseeker.position.service.position.job51.pojo;

import java.io.Serializable;

/**
 * Created by zhangdi on 2017/6/22.
 */
public class Position51WithAccount implements Serializable {

    public String user_name;
    public String password;
    public String member_name;
    public String position_id;
    public String channel;
    public Position51 position_info;
    public String company_name;
    public String account_id;

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMember_name() {
        return member_name;
    }

    public void setMember_name(String member_name) {
        this.member_name = member_name;
    }

    public String getPosition_id() {
        return position_id;
    }

    public void setPosition_id(String position_id) {
        this.position_id = position_id;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public Position51 getPosition_info() {
        return position_info;
    }

    public void setPosition_info(Position51 position_info) {
        this.position_info = position_info;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    @Override
    public String toString() {
        return "Position51SyncWithAccountPojo{" +
                "user_name='" + user_name + '\'' +
                ", password='" + password + '\'' +
                ", member_name='" + member_name + '\'' +
                ", position_id='" + position_id + '\'' +
                ", channel='" + channel + '\'' +
                ", position_info=" + position_info +
                ", company_name='" + company_name + '\'' +
                ", account_id='" + account_id + '\'' +
                '}';
    }
}
