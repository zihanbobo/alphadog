package com.moseeker.position.service.position.carnoc.pojo;

public class PositionCarnocWithAccount {
    private PositionCarnoc position_info;
    private int account_id;
    private String channel;
    private String password;
    private int position_id;
    private String user_name;

    public PositionCarnoc getPosition_info() {
        return position_info;
    }

    public void setPosition_info(PositionCarnoc position_info) {
        this.position_info = position_info;
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPosition_id() {
        return position_id;
    }

    public void setPosition_id(int position_id) {
        this.position_id = position_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
}
