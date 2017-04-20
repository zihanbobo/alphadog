package com.moseeker.baseorm.dao.hrdb;

import org.springframework.stereotype.Repository;

import com.moseeker.baseorm.db.hrdb.tables.HrTeamMember;
import com.moseeker.baseorm.db.hrdb.tables.records.HrTeamMemberRecord;
import com.moseeker.baseorm.util.StructDaoImpl;
import com.moseeker.thrift.gen.dao.struct.hrdb.HrTeamMemberDO;

/**
* @author xxx
* HrTeamMemberDao 实现类 （groovy 生成）
* 2017-03-21
*/
@Repository
public class HrTeamMemberDao extends StructDaoImpl<HrTeamMemberDO, HrTeamMemberRecord, HrTeamMember> {


   @Override
   protected void initJOOQEntity() {
        this.tableLike = HrTeamMember.HR_TEAM_MEMBER;
   }
}