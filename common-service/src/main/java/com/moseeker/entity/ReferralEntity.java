package com.moseeker.entity;

import com.moseeker.baseorm.dao.candidatedb.CandidateShareChainDao;
import com.moseeker.baseorm.dao.userdb.UserEmployeePointsRecordDao;
import com.moseeker.common.annotation.iface.CounterIface;
import org.jooq.Record2;
import org.jooq.Record4;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author: jack
 * @Date: 2018/7/18
 */
@Service
@CounterIface
public class ReferralEntity {

    @Autowired
    CandidateShareChainDao shareChainDao;

    @Autowired
    UserEmployeePointsRecordDao pointsRecordDao;


    /**
     * 计算给定时间内的员工内推带来的转发次数
     * @param userIdList 用户编号
     * @param positionIdList 职位编号
     * @param lastFriday 开始时间 (大于开始时间)
     * @param currentFriday 结束时间 （小于等于结束时间）
     * @return 员工与转发次数的关系
     */
    public Map<Integer, Integer> countEmployeeForward(List<Integer> userIdList, List<Integer> positionIdList, LocalDateTime lastFriday,
                                                      LocalDateTime currentFriday) {

        Result<Record2<Integer, Integer>> result = shareChainDao.countEmployeeForward(userIdList, positionIdList,
                lastFriday, currentFriday);

        if (result != null && result.size() > 0) {


            Map<Integer, Integer> employeeForward = result
                    .stream()
                    .collect(Collectors.toMap(Record2::value1, Record2::value2));

            //重复推荐数量
            Result<Record2<Integer, Integer>> repeatRecommand = shareChainDao.countRepeatRecommend(userIdList,
                    positionIdList, lastFriday, currentFriday);
            if (repeatRecommand != null && repeatRecommand.size() > 0) {
                repeatRecommand.forEach(integerIntegerRecord2 -> {
                    if (employeeForward.get(integerIntegerRecord2.value1()) != null) {
                        employeeForward.put(integerIntegerRecord2.value1(),
                                employeeForward.get(integerIntegerRecord2.value1())
                                        - integerIntegerRecord2.value2() + 1);
                    }
                });
            }

            return employeeForward;
        } else {
            return new HashMap<>();
        }
    }

    public Map<Integer,Integer> countEmployeeAwards(List<Integer> employeeIdList, LocalDateTime lastFriday,
                                                    LocalDateTime currentFriday) {
        Result<Record2<Long, BigDecimal>> result = pointsRecordDao.countEmployeeAwards(employeeIdList, lastFriday,
                currentFriday);

        if (result != null && result.size() > 0) {
            return result
                    .stream()
                    .filter(longBigDecimalRecord2 -> longBigDecimalRecord2.value1() != null)
                    .collect(Collectors.toMap(record->record.value1().intValue(),
                    record -> record.value2().intValue()));
        } else {
            return new HashMap<>();
        }
    }
}