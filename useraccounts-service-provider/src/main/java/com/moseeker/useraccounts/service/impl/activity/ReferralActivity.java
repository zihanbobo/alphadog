package com.moseeker.useraccounts.service.impl.activity;

import com.moseeker.baseorm.dao.hrdb.HrHbConfigDao;
import com.moseeker.baseorm.dao.hrdb.HrHbItemsDao;
import com.moseeker.baseorm.dao.hrdb.HrHbPositionBindingDao;

/**
 * @Author: jack
 * @Date: 2018/11/7
 */
public class ReferralActivity extends NonePositionActivity {
    public ReferralActivity(int id, HrHbConfigDao configDao, HrHbPositionBindingDao positionBindingDao, HrHbItemsDao itemsDao) {
        super(id, configDao, positionBindingDao, itemsDao);
        activityType = ActivityType.Referral;
    }
}
