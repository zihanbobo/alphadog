package com.moseeker.baseorm.dao.userdb;

import com.moseeker.baseorm.constant.ReferralScene;
import com.moseeker.baseorm.constant.TalentType;
import com.moseeker.baseorm.crud.JooqCrudImpl;
import com.moseeker.baseorm.db.talentpooldb.tables.TalentpoolTalent;
import com.moseeker.baseorm.db.userdb.tables.UserUser;
import com.moseeker.baseorm.db.userdb.tables.pojos.UserReferralRecord;
import com.moseeker.baseorm.db.userdb.tables.records.UserReferralRecordRecord;
import com.moseeker.common.constants.AbleFlag;
import com.moseeker.common.constants.UserSource;
import org.jooq.Param;
import org.jooq.impl.TableImpl;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

import static com.moseeker.baseorm.db.userdb.tables.UserReferralRecord.USER_REFERRAL_RECORD;
import static org.jooq.impl.DSL.*;

/**
 *
 * 员工主动内推表操作类
 * @Author: jack
 * @Date: 2018/8/3
 */
@Repository
public class UserReferralRecordDao extends JooqCrudImpl<UserReferralRecord, UserReferralRecordRecord> {

    public UserReferralRecordDao() {
        super(USER_REFERRAL_RECORD, UserReferralRecord.class);
    }

    public UserReferralRecordDao(TableImpl<UserReferralRecordRecord> table,
                                 Class<UserReferralRecord> clazz) {
        super(table, clazz);
    }

    /**
     * 根据用户编号和公司编号查找用户与公司的关系信息（员工上传的用户与公司的关系）
     * @param userIdList 用户编号
     * @param companyId 公司编号
     * @return 用户与公司的关系信息
     */
    public List<UserReferralRecordRecord> getRecordsByUserIdListCompanyId(List<Integer> userIdList, int companyId) {
        return create
                .selectFrom(USER_REFERRAL_RECORD)
                .where(USER_REFERRAL_RECORD.USER_ID.in(userIdList))
                .and(USER_REFERRAL_RECORD.COMPANY_ID.eq(companyId))
                .orderBy(USER_REFERRAL_RECORD.SCENE.asc())
                .fetch();
    }

    public UserReferralRecordRecord insertReferralTypeIfNotExist(int reference, int companyId, Long mobile, ReferralScene scene) {
        Param<Integer> refereeParam = param(USER_REFERRAL_RECORD.REFERENCE_ID.getName(), reference);
        Param<Integer> companyParam = param(USER_REFERRAL_RECORD.COMPANY_ID.getName(), companyId);
        Param<Byte> sceneParam = param(USER_REFERRAL_RECORD.SCENE.getName(), scene.getScene());

        List<Short> sources = new ArrayList<>(3);
        sources.add((short) UserSource.EMPLOYEE_REFERRAL.getValue());
        sources.add((short) UserSource.TALENT_UPLOAD.getValue());
        sources.add((short) UserSource.EMPLOYEE_REFERRAL_CHATBOT.getValue());

        UserReferralRecordRecord result = create.insertInto(
                USER_REFERRAL_RECORD,
                USER_REFERRAL_RECORD.REFERENCE_ID,
                USER_REFERRAL_RECORD.COMPANY_ID,
                USER_REFERRAL_RECORD.SCENE
        ).select(
                select(
                        refereeParam,
                        companyParam,
                        sceneParam
                ).whereNotExists(
                        selectOne()
                                .from(UserUser.USER_USER).innerJoin(USER_REFERRAL_RECORD)
                                    .on(UserUser.USER_USER.ID.eq(USER_REFERRAL_RECORD.USER_ID))
                                .where(UserUser.USER_USER.MOBILE.eq(mobile))
                                .and(UserUser.USER_USER.COUNTRY_CODE.eq("86"))
                                .and(UserUser.USER_USER.IS_DISABLE.eq((byte) AbleFlag.OLDENABLE.getValue()))
                                .and(UserUser.USER_USER.SOURCE.in(sources))
                                .and(USER_REFERRAL_RECORD.COMPANY_ID.eq(companyId))
                )
        ).returning().fetchOne();
        return result;

    }
}
