package com.moseeker.application.domain.component.state;

import com.moseeker.application.domain.ApplicationBatchEntity;
import com.moseeker.application.infrastructure.DaoManagement;

/**
 * 申请状态
 * Created by jack on 16/01/2018.
 */
public abstract class ApplicationState {

    //招聘进度流程
    protected ApplicationStatus applicationStatus = null;

    protected ApplicationBatchEntity applicationBatchEntity;
    protected DaoManagement daoManagement;

    public ApplicationState(ApplicationBatchEntity applicationBatchEntity, DaoManagement daoManagement) {
        this.applicationBatchEntity = applicationBatchEntity;
        this.daoManagement = daoManagement;
    }

    /**
     * 拒绝
     */
    public abstract void refuse();

    /**
     * 通过
     * @return 下一个状态
     */
    public abstract ApplicationState pass();

    /**
     * 回到上一个阶段
     * @return 上一个状态
     */
    public abstract ApplicationState backTo();

    /**
     * 恢复
     */
    abstract void recover();

    /**
     * 获取当前进度
     * @return 申请进度
     */
    public ApplicationStatus getStatus() {
        return applicationStatus;
    }

    protected ApplicationState getNext() {
        return applicationStatus.getNextNode(applicationStatus).buildState(applicationBatchEntity, daoManagement);
    }

    protected ApplicationState getPre() {
        return applicationStatus.getPreNode(applicationStatus).buildState(applicationBatchEntity, daoManagement);
    }
}
