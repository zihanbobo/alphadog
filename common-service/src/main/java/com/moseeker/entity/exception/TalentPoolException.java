package com.moseeker.entity.exception;

import com.moseeker.common.exception.CommonException;

/**
 * Created by jack on 2018/4/25.
 */
public class TalentPoolException extends CommonException {

    public static final TalentPoolException TALENT_POOL_COMPANY_NOT_EXIST = new TalentPoolException(34101,"公司信息错误！");

    public static final TalentPoolException TALENT_POOL_EMAIL_ACCOUNT_BALANCE_UPDATE_FIALED = new TalentPoolException(34102,"公司邮箱额度更新失败！");

    public static final TalentPoolException TALENT_POOL_EMAIL_ACCOUNT_OVER_BALANCE = new TalentPoolException(34103,"公司邮箱额度不足！");

    public TalentPoolException(int i, String s) {
        super(i, s);
    }
}
