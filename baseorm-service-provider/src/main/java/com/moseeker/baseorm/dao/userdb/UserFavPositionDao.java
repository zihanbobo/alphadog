package com.moseeker.baseorm.dao.userdb;

import com.moseeker.baseorm.crud.JooqCrudImpl;
import com.moseeker.common.util.BeanUtils;
import com.moseeker.common.util.query.Query;
import com.moseeker.db.userdb.tables.records.UserFavPositionRecord;
import com.moseeker.thrift.gen.dao.struct.UserFavPositionDO;
import org.jooq.impl.TableImpl;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserFavPositionDao extends JooqCrudImpl<UserFavPositionDO, UserFavPositionRecord> {

	public UserFavPositionDao(TableImpl<UserFavPositionRecord> table, Class<UserFavPositionDO> userFavPositionDOClass) {
		super(table, userFavPositionDOClass);
	}

	/**
	 * 查询用户感兴趣职位的记录
	 * @param query
	 * @return
	 */
	public List<UserFavPositionDO> getUserFavPositions(Query query) {
		return getDatas(query);
	}

}
