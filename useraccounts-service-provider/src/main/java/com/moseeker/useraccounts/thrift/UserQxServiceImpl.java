package com.moseeker.useraccounts.thrift;

import com.moseeker.baseorm.exception.ExceptionConvertUtil;
import com.moseeker.common.exception.CommonException;
import com.moseeker.thrift.gen.common.struct.SysBIZException;
import com.moseeker.thrift.gen.dao.struct.userdb.UserSearchConditionDO;
import com.moseeker.thrift.gen.useraccounts.struct.*;
import com.moseeker.useraccounts.service.impl.UserQxService;
import org.apache.thrift.TException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lucky8987 on 17/4/20.
 */
@Service
public class UserQxServiceImpl implements com.moseeker.thrift.gen.useraccounts.service.UserQxService.Iface {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserQxService service;

    @Override
    public UserSearchConditionListVO userSearchConditionList(int userId) throws TException {
        try {
            return service.userSearchConditionList(userId);
        } catch (CommonException e) {
            throw ExceptionConvertUtil.convertCommonException(e);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw new SysBIZException();
        }
    }

    @Override
    public UserSearchConditionVO postUserSearchCondition(UserSearchConditionDO userSearchCondition) throws TException {
        try {
            return service.postUserSearchCondition(userSearchCondition);
        } catch (CommonException e) {
            throw ExceptionConvertUtil.convertCommonException(e);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw new SysBIZException();
        }
    }

    @Override
    public UserSearchConditionVO delUserSearchCondition(int userId, int id) throws TException {
        try {
            return service.delUserSearchCondition(userId, id);
        } catch (CommonException e) {
            throw ExceptionConvertUtil.convertCommonException(e);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw new SysBIZException();
        }
    }

    @Override
    public UserCollectPositionVO getUserCollectPosition(int userId, int positionId) throws TException {
        try {
            return service.getUserCollectPosition(userId, positionId);
        } catch (CommonException e) {
            throw ExceptionConvertUtil.convertCommonException(e);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw new SysBIZException();
        }
    }

    @Override
    public UserCollectPositionListVO getUserCollectPositions(int userId) throws TException {
        try {
            return service.getUserCollectPositions(userId);
        } catch (CommonException e) {
            throw ExceptionConvertUtil.convertCommonException(e);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw new SysBIZException();
        }
    }

    @Override
    public UserCollectPositionVO postUserCollectPosition(int userId, int positionId) throws TException {
        try {
            return service.putUserCollectPosition(userId, positionId, 0);
        } catch (CommonException e) {
            throw ExceptionConvertUtil.convertCommonException(e);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw new SysBIZException();
        }
    }

    @Override
    public UserCollectPositionVO delUserCollectPosition(int userId, int positionId) throws TException {
        try {
            return service.putUserCollectPosition(userId, positionId, 1);
        } catch (CommonException e) {
            throw ExceptionConvertUtil.convertCommonException(e);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw new SysBIZException();
        }
    }

    @Override
    public UserPositionStatusVO getUserPositionStatus(int userId, List<Integer> positionIds) throws TException {
        try {
            return service.getUserPositionStatus(userId, positionIds);
        } catch (CommonException e) {
            throw ExceptionConvertUtil.convertCommonException(e);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw new SysBIZException();
        }
    }

    @Override
    public UserViewedPositionVO userViewedPosition(int userId, int positionId) throws TException {
        try {
            return service.userViewedPosition(userId, positionId);
        } catch (CommonException e) {
            throw ExceptionConvertUtil.convertCommonException(e);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw new SysBIZException();
        }
    }
}
