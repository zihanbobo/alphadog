package com.moseeker.useraccounts.domain;

import com.moseeker.baseorm.dao.historydb.CustomHistoryUpVoteDao;
import com.moseeker.baseorm.dao.userdb.CustomUpVoteDao;
import com.moseeker.baseorm.db.historydb.tables.records.HistoryUserEmployeeUpvoteRecord;
import com.moseeker.baseorm.db.userdb.tables.pojos.UserEmployeeUpvote;
import com.moseeker.baseorm.db.userdb.tables.records.UserEmployeeUpvoteRecord;
import com.moseeker.baseorm.redis.RedisClient;
import com.moseeker.common.annotation.iface.CounterIface;
import com.moseeker.common.constants.AppId;
import com.moseeker.common.constants.Constant;
import com.moseeker.common.thread.ThreadPool;
import com.moseeker.entity.EmployeeEntity;
import com.moseeker.entity.exception.EmployeeException;
import com.moseeker.thrift.gen.dao.struct.userdb.UserEmployeeDO;
import com.moseeker.useraccounts.domain.pojo.IntervalTime;
import com.moseeker.useraccounts.domain.pojo.UpVoteData;
import com.moseeker.useraccounts.exception.UserAccountException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @Author: jack
 * @Date: 2018/8/16
 */
@Component
@CounterIface
public class UpVoteEntity {

    @Autowired
    private CustomUpVoteDao upVoteDao;

    @Autowired
    private EmployeeEntity employeeEntity;

    @Autowired
    private CustomHistoryUpVoteDao customHistoryUpVoteDao;

    @Resource(name = "cacheClient")
    private RedisClient client;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 点赞
     * 如果第一次对员工点赞，则生成点赞记录。
     * 如果取消点赞再次点赞，则更新成点赞状态，并且更新点赞时间
     * @param receiver 被点赞的员工编号
     * @param sender 点赞的员工编号
     * @return 点赞记录编号
     * @throws UserAccountException 业务异常
     */
    public int upVote(UserEmployeeDO receiver, UserEmployeeDO sender) throws UserAccountException {

        IntervalTime intervalTime = IntervalTime.buildIntervalTime();
        UserEmployeeUpvote upVote = upVoteDao.fetchUpVote(receiver.getId(), sender.getId(), intervalTime.getStartTime(),
                intervalTime.getEndTime());
        if (upVote != null) {
            throw UserAccountException.EMPLOYEE_ALREADY_UP_VOTE;
        }

        int id = upVoteDao.insert(receiver.getCompanyId(), receiver.getId(), sender.getId(),
                intervalTime.getStartTime(), intervalTime.getEndTime());

        return id;
    }

    /**
     * 取消点赞
     * @param receiver 被点赞员工记录
     * @param sender 点赞员工记录
     */
    public void cancelUpVote(UserEmployeeDO receiver, UserEmployeeDO sender) throws UserAccountException {

        IntervalTime intervalTime = IntervalTime.buildIntervalTime();
        UserEmployeeUpvote upVote = upVoteDao.fetchUpVote(receiver.getId(), sender.getId(), intervalTime.getStartTime(),
                intervalTime.getEndTime());
        if (upVote == null) {
            return;
        }
        upVoteDao.cancelUpVote(upVote.getId());
    }

    /**
     * 校验是否做过点赞
     * @param sender 点赞人
     * @param receiver 被点赞人
     * @return 是否点过赞 true 点过赞 false 未点过赞
     */
    public boolean isPraise(int sender, int receiver) {

        IntervalTime intervalTime = IntervalTime.buildIntervalTime();

        UserEmployeeUpvoteRecord record = upVoteDao.fetchBySenderAndReceiver(sender, receiver,
                intervalTime.getStartTime(), intervalTime.getEndTime());
        return record != null;
    }

    /**
     * 计算未读的点赞数量
     * @param employeeId 员工编号
     * @return 未读点赞数
     * @throws EmployeeException 异常信息
     */
    public int countRecentUpVote(int employeeId) throws EmployeeException {
        //todo delete
        logger.info("countRecentUpVote employeeId:{}", employeeId);
        UserEmployeeDO employeeDO = employeeEntity.getEmployeeByID(employeeId);
        if (employeeDO == null) {
            throw EmployeeException.EMPLOYEE_NOT_EXISTS;
        }
        long now = System.currentTimeMillis();
        String viewTimeStr = client.get(AppId.APPID_ALPHADOG.getValue(),
                Constant.LEADER_BOARD_UPVOTE_COUNT, String.valueOf(employeeId));

        LocalDateTime nowLocalDateTime = LocalDateTime.now();

        long viewTime;
        if (org.apache.commons.lang.StringUtils.isNotBlank(viewTimeStr)) {
            viewTime = Long.parseLong(viewTimeStr);
        } else {
            viewTime = 0;
        }
        LocalDateTime currentFriday = nowLocalDateTime.with(DayOfWeek.FRIDAY).withHour(17).withMinute(0).withSecond(0).withNano(0);
        LocalDateTime lastFriday = nowLocalDateTime.with(DayOfWeek.MONDAY).minusDays(3).withHour(17).withMinute(0).withSecond(0).withNano(0);
        if (now > currentFriday.atZone(ZoneId.systemDefault()).toInstant().getEpochSecond()*1000 &&
                viewTime < currentFriday.atZone(ZoneId.systemDefault()).toInstant().getEpochSecond()*1000) {
            logger.info("now > currentFriday.atZone(ZoneId.systemDefault()).toInstant().getEpochSecond()*1000 ");
            viewTime = currentFriday.atZone(ZoneId.systemDefault()).toInstant().getEpochSecond()*1000;
        } else if (viewTime < lastFriday.atZone(ZoneId.systemDefault()).toInstant().getEpochSecond()*1000) {
            logger.info("viewTime < lastFriday.atZone(ZoneId.systemDefault()).toInstant().getEpochSecond()*1000 ");
            viewTime = lastFriday.atZone(ZoneId.systemDefault()).toInstant().getEpochSecond()*1000;
        }
        if (viewTime >= now) {
            logger.info("viewTime >= now");
            return 0;
        }
        logger.info("countRecentUpVote employeeId:{}, viewTime:{}, now:{}", employeeId, viewTime, now);

        logger.info("countRecentUpVote start:{}, end:{}", new Timestamp(viewTime), new Timestamp(now));
        return upVoteDao.countExceptSelfUpVote(employeeId, viewTime, now);
    }

    public int countUpVote(int id) {

        UserEmployeeDO employeeDO = employeeEntity.getEmployeeByID(id);
        if (employeeDO == null) {
            throw EmployeeException.EMPLOYEE_NOT_EXISTS;
        }
        IntervalTime intervalTime = IntervalTime.buildIntervalTime();
        return upVoteDao.countUpVote(id, intervalTime.getStartTime(), intervalTime.getEndTime());
    }



    /**
     *
     * @param employeeId
     * @param viewTime
     */
    public void logViewTime(int employeeId, long viewTime) {
        UserEmployeeDO employeeDO = employeeEntity.getEmployeeByID(employeeId);
        if (employeeDO == null) {
            throw EmployeeException.EMPLOYEE_NOT_EXISTS;
        }
        long now = System.currentTimeMillis();
        LocalDateTime nowLocalDateTime = LocalDateTime.now();
        LocalDateTime currentFriday = nowLocalDateTime.with(DayOfWeek.FRIDAY).withHour(17).withMinute(0).withSecond(0).withNano(0);
        long endTime;
        if (now > currentFriday.atZone(ZoneId.systemDefault()).toInstant().getEpochSecond()*1000) {
            endTime = currentFriday.plusDays(7).atZone(ZoneId.systemDefault()).toInstant().getEpochSecond()*1000;
        } else {
            endTime = currentFriday.atZone(ZoneId.systemDefault()).toInstant().getEpochSecond()*1000;
        }

        //计算过期时间
        int ttl = (int) ((endTime-now)/1000);

        client.set(AppId.APPID_ALPHADOG.getValue(), Constant.LEADER_BOARD_UPVOTE_COUNT, String.valueOf(employeeId),
                "", String.valueOf(viewTime), ttl);
    }

    /**
     * 清空本周的点赞数
     */
    public void clearUpVoteWeekly() {
        LocalDateTime nowLocalDateTime = LocalDateTime.now();

        LocalDateTime currentFriday = nowLocalDateTime.with(DayOfWeek.FRIDAY).withHour(17).withMinute(0).withSecond(0).withNano(0);
        long endTime;
        long startTime;
        if (System.currentTimeMillis() > currentFriday.atZone(ZoneId.systemDefault()).toInstant().getEpochSecond()*1000) {
            startTime = currentFriday.minusDays(7).atZone(ZoneId.systemDefault()).toInstant().getEpochSecond()*1000;
            endTime = currentFriday.atZone(ZoneId.systemDefault()).toInstant().getEpochSecond()*1000;
        } else {
            startTime = currentFriday.minusDays(14).atZone(ZoneId.systemDefault()).toInstant().getEpochSecond()*1000;
            endTime = currentFriday.minusDays(7).atZone(ZoneId.systemDefault()).toInstant().getEpochSecond()*1000;
        }

        ThreadPool threadPool = ThreadPool.Instance;
        threadPool.startTast(() -> {
            int count = upVoteDao.count(startTime, endTime);
            int totalExecute = 0;
            while (totalExecute < count) {
                clearUpVote(Constant.DATABASE_PAGE_SIZE, startTime, endTime);
                totalExecute += Constant.DATABASE_PAGE_SIZE;
            }
            return true;
        });

    }

    /**
     * 清空点赞数据，迁移到历史库中
     * @param size 数量
     * @param start 开始时间
     * @param end 结束时间
     */
    @Transactional
    private void clearUpVote(int size, long start, long end) {
        List<UserEmployeeUpvoteRecord> upvoteRecords = upVoteDao.fetchByInterval(size, start, end);
        if (upvoteRecords != null && upvoteRecords.size() > 0) {
            List<HistoryUserEmployeeUpvoteRecord> histories = new ArrayList<>();
            for (UserEmployeeUpvoteRecord upvoteRecord : upvoteRecords) {
                HistoryUserEmployeeUpvoteRecord historyUserEmployeeUpvoteRecord = new HistoryUserEmployeeUpvoteRecord();
                BeanUtils.copyProperties(upvoteRecord, historyUserEmployeeUpvoteRecord);
                histories.add(historyUserEmployeeUpvoteRecord);
            }
            customHistoryUpVoteDao.batchInsert(histories);
            upVoteDao.deleteById(upvoteRecords.stream().map(UserEmployeeUpvoteRecord::getId).collect(Collectors.toList()));
        }
    }

    /**
     * 查找点赞记录
     * @param sender 点赞人员工编号
     * @param receiverIdList 被点赞人员工编号
     */
    public List<UpVoteData> fetchUpVote(int sender, List<Integer> receiverIdList) {
        IntervalTime intervalTime = IntervalTime.buildIntervalTime();
        logger.info("fetchUpVote startTime:{}, endTime:{}", intervalTime.getStartTime(), intervalTime.getEndTime());
        List<UserEmployeeUpvote> upVoteList = upVoteDao.fetchBySenderAndReceiverList(sender, receiverIdList,
                intervalTime.getStartTime(), intervalTime.getEndTime());

        Map<Integer, Integer> upVoteCount = upVoteDao.countUpVoteByReceiverIdList(receiverIdList,
                intervalTime.getStartTime(), intervalTime.getEndTime());

        return receiverIdList.stream().map(receiver -> {
            UpVoteData upVoteData1 = new UpVoteData();
            upVoteData1.setReceiver(receiver);
            if (upVoteList != null && upVoteList.size() > 0) {
                Optional<UserEmployeeUpvote> upvoteOptional = upVoteList
                        .stream()
                        .filter(userEmployeeUpvote -> userEmployeeUpvote.getReceiver().equals(receiver))
                        .findAny();
                if (upvoteOptional.isPresent()) {
                    upVoteData1.setUpVote(true);
                }
            }
            Integer count = upVoteCount.get(receiver);
            if (count != null) {
                upVoteData1.setReceiverUpVoteCount(count);
            }

            return upVoteData1;
        }).collect(Collectors.toList());
    }
}
