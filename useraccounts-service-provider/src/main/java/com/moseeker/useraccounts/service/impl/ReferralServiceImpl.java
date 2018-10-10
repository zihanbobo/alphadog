package com.moseeker.useraccounts.service.impl;


import com.alibaba.fastjson.JSON;
import com.moseeker.baseorm.dao.hrdb.HrHbItemsDao;
import com.moseeker.baseorm.dao.referraldb.CustomReferralEmployeeBonusDao;
import com.moseeker.baseorm.dao.userdb.UserWxUserDao;
import com.moseeker.baseorm.db.hrdb.tables.pojos.HrHbItems;
import com.moseeker.baseorm.db.referraldb.tables.pojos.ReferralEmployeeBonusRecord;
import com.moseeker.baseorm.db.userdb.tables.records.UserWxUserRecord;
import com.moseeker.common.annotation.iface.CounterIface;
import com.moseeker.common.biztools.PageUtil;
import com.moseeker.common.constants.Constant;
import com.moseeker.entity.EmployeeEntity;
import com.moseeker.entity.ReferralEntity;
import com.moseeker.entity.pojos.BonusData;
import com.moseeker.entity.pojos.HBData;
import com.moseeker.thrift.gen.dao.struct.userdb.UserEmployeeDO;
import com.moseeker.useraccounts.exception.UserAccountException;
import com.moseeker.useraccounts.service.ReferralService;
import com.moseeker.useraccounts.service.impl.biztools.HBBizTool;
import com.moseeker.useraccounts.service.impl.vo.Bonus;
import com.moseeker.useraccounts.service.impl.vo.BonusList;
import com.moseeker.useraccounts.service.impl.vo.RedPacket;
import com.moseeker.useraccounts.service.impl.vo.RedPackets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: jack
 * @Date: 2018/9/26
 */
@Service
@CounterIface
public class ReferralServiceImpl implements ReferralService {

    @Autowired
    private HrHbItemsDao itemsDao;

    @Autowired
    private UserWxUserDao wxUserDao;

    @Autowired
    private CustomReferralEmployeeBonusDao referralEmployeeBonusDao;

    @Autowired
    private EmployeeEntity employeeEntity;

    @Autowired
    private ReferralEntity referralEntity;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public RedPackets getRedPackets(int id, int pageNum, int pageSize) throws UserAccountException {
        logger.info("ReferralServiceImpl getRedPackets id:{}, pageNum:{}, pageSize:{}", id, pageNum, pageSize);
        if (pageSize > Constant.DATABASE_PAGE_SIZE) {
            throw UserAccountException.PROGRAM_FETCH_TOO_MUCH;
        }
        RedPackets redPackets = new RedPackets();
        UserEmployeeDO userEmployeeDO = employeeEntity.getActiveEmployeeDOByUserId(id);
        if (userEmployeeDO != null) {
            BigDecimal bonus = new BigDecimal(userEmployeeDO.getBonus());
            redPackets.setTotalBonus(bonus.divide(new BigDecimal(100), 2, BigDecimal.ROUND_HALF_UP).doubleValue());
        }
        logger.info("ReferralServiceImpl getRedPackets userEmployeeDO:{}", userEmployeeDO);
        List<UserWxUserRecord> wxUserRecords = wxUserDao.getWXUsersByUserId(id);
        if (wxUserRecords != null && wxUserRecords.size() > 0) {


            List<Integer> wxUserIdList = wxUserRecords
                    .stream()
                    .map(userWxUserRecord -> userWxUserRecord.getId().intValue())
                    .collect(Collectors.toList());
            logger.info("ReferralServiceImpl getRedPackets wxUserIdList:{}", wxUserIdList
                    .stream()
                    .map(integer -> String.valueOf(integer))
                    .collect(Collectors.joining(",")));
            //计算红包总额
            redPackets.setTotalRedpackets(itemsDao.sumRedPacketsByWxUserIdList(wxUserIdList));
            logger.info("ReferralServiceImpl getRedPackets totalRedPackets:{}", redPackets.getTotalRedpackets());
            PageUtil pageUtil = new PageUtil(pageNum, pageSize);

            int count = itemsDao.countByWxUserIdList(wxUserIdList);
            redPackets.setTotalRedpackets(count);
            List<HrHbItems> itemsRecords = itemsDao.fetchItemsByWxUserIdList(wxUserIdList, pageUtil.getIndex(), pageUtil.getSize());
            if (itemsRecords != null && itemsRecords.size() > 0) {

                logger.info("ReferralServiceImpl getRedPackets itemsRecords.size:{}", itemsRecords.size());
                HBData data = referralEntity.fetchHBData(itemsRecords);
                logger.info("ReferralServiceImpl getRedPackets data:{}", data);

                List<RedPacket> list = new ArrayList<>();
                for (HrHbItems hrHbItems : itemsRecords) {
                    list.add(HBBizTool.packageRedPacket(hrHbItems, data.getCandidateNameMap(),
                            data.getConfigMap(), data.getTitleMap(), data.getCardNoMap()));
                }
                logger.info("ReferralServiceImpl getRedPackets list:{}", JSON.toJSONString(list));
                redPackets.setRedpackets(list);
            } else {
                logger.info("ReferralServiceImpl getRedPackets itemsRecords is null!");
            }
        }
        return redPackets;
    }

    @Override
    public BonusList getBonus(int userId, int pageNum, int pageSize) throws UserAccountException {
        if (pageSize > Constant.DATABASE_PAGE_SIZE) {
            throw UserAccountException.PROGRAM_FETCH_TOO_MUCH;
        }
        BonusList bonusList = new BonusList();
        UserEmployeeDO userEmployeeDO = employeeEntity.getActiveEmployeeDOByUserId(userId);
        if (userEmployeeDO != null) {
            BigDecimal bonus = new BigDecimal(userEmployeeDO.getBonus());
            bonusList.setTotalBonus(bonus.divide(new BigDecimal(100), 2, BigDecimal.ROUND_HALF_UP).doubleValue());

            PageUtil pageUtil = new PageUtil(pageNum, pageSize);

            List<ReferralEmployeeBonusRecord> referralEmployeeBonusRecordList
                    = referralEmployeeBonusDao.fetchByEmployeeIdOrderByClaim(userEmployeeDO.getId(), pageUtil.getIndex(), pageUtil.getSize());
            if (referralEmployeeBonusRecordList != null && referralEmployeeBonusRecordList.size() > 0) {

                BonusData bonusData = referralEntity.fetchBonusData(referralEmployeeBonusRecordList);

                List<Bonus> bonuses = new ArrayList<>();
                for (ReferralEmployeeBonusRecord referralEmployeeBonusRecord : referralEmployeeBonusRecordList) {
                    bonuses.add(HBBizTool.packageBonus(referralEmployeeBonusRecord, bonusData));
                }
                logger.info("ReferralServiceImpl getBonus bonuses:{}", JSON.toJSONString(bonuses));
                bonusList.setBonus(bonuses);
            }
        }
        List<UserWxUserRecord> wxUserRecords = wxUserDao.getWXUsersByUserId(userId);
        if (wxUserRecords != null && wxUserRecords.size() > 0) {
            List<Integer> wxUserIdList = wxUserRecords.stream().map(UserWxUserRecord::getSysuserId).collect(Collectors.toList());
            int count = itemsDao.countByWxUserIdList(wxUserIdList);
            bonusList.setTotalRedpackets(count);
        }
        return bonusList;
    }
}
