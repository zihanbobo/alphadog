package com.moseeker.useraccounts.context;

import com.moseeker.baseorm.db.userdb.tables.pojos.UserEmployeePointsRecord;
import com.moseeker.entity.SearchengineEntity;
import com.moseeker.useraccounts.context.aggregate.ApplicationsAggregateId;
import com.moseeker.useraccounts.context.constant.AwardEvent;
import com.moseeker.useraccounts.domain.AwardEntity;
import com.moseeker.useraccounts.infrastructure.DaoManagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 积分上下文管理
 * Created by jack on 22/01/2018.
 */
@Component
public class AwardContext {

    @Autowired
    DaoManagement daoManagement;

    @Autowired
    SearchengineEntity searchengineEntity;

    public void addEmployeeAward(List<Integer> applicationIdList, int eventType) {

        /** 初始化业务编号 */
        AwardEvent awardEvent = AwardEvent.initFromSate(eventType);
        ApplicationsAggregateId applicationsAggregateId = new ApplicationsAggregateId(applicationIdList, awardEvent);
        List<UserEmployeePointsRecord> userEmployeePointsRecordList
                = daoManagement.fetchEmployeePointsByApplicationIdList(applicationsAggregateId.getApplicationIdList(),
                applicationsAggregateId.getAwardEvent());

        //添加积分
        AwardEntity awardEntity = new AwardEntity(daoManagement, searchengineEntity, userEmployeePointsRecordList);
        awardEntity.addAward();
    }
}
