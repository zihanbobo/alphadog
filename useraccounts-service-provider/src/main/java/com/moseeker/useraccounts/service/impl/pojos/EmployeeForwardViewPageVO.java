package com.moseeker.useraccounts.service.impl.pojos;

import com.moseeker.entity.pojos.RadarUserInfo;
import java.util.List;

/**
 * Created by moseeker on 2019/1/4.
 */
public class EmployeeForwardViewPageVO {

    public int userId;
    public String nickname;
    public int viewCount;
    public int connection;
    public int depth;
    public String headimgurl;
    public String positionTitle;
    public int positionId;
    public String forwardName;
    public boolean forwardSourceWx;
    public String clickTime;
    public int invitationStatus;
    public List<RadarUserInfo> chain;
    public int status;
    public int chainStatus;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public int getConnection() {
        return connection;
    }

    public void setConnection(int connection) {
        this.connection = connection;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public String getHeadimgurl() {
        return headimgurl;
    }

    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl;
    }

    public String getPositionTitle() {
        return positionTitle;
    }

    public void setPositionTitle(String positionTitle) {
        this.positionTitle = positionTitle;
    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public String getForwardName() {
        return forwardName;
    }

    public void setForwardName(String forwardName) {
        this.forwardName = forwardName;
    }

    public boolean isForwardSourceWx() {
        return forwardSourceWx;
    }

    public void setForwardSourceWx(boolean forwardSourceWx) {
        this.forwardSourceWx = forwardSourceWx;
    }

    public String getClickTime() {
        return clickTime;
    }

    public void setClickTime(String clickTime) {
        this.clickTime = clickTime;
    }

    public int getInvitationStatus() {
        return invitationStatus;
    }

    public void setInvitationStatus(int invitationStatus) {
        this.invitationStatus = invitationStatus;
    }

    public List<RadarUserInfo> getChain() {
        return chain;
    }

    public void setChain(List<RadarUserInfo> chain) {
        this.chain = chain;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getChainStatus() {
        return chainStatus;
    }

    public void setChainStatus(int chainStatus) {
        this.chainStatus = chainStatus;
    }
}