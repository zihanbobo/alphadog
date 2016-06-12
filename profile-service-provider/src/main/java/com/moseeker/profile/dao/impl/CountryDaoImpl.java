package com.moseeker.profile.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.jooq.DSLContext;
import org.jooq.Result;
import org.jooq.SelectConditionStep;
import org.jooq.SelectWhereStep;
import org.jooq.types.UInteger;
import org.springframework.stereotype.Repository;

import com.moseeker.common.dbutils.DBConnHelper;
import com.moseeker.common.providerutils.daoutils.BaseDaoImpl;
import com.moseeker.db.dictdb.tables.DictCountry;
import com.moseeker.db.dictdb.tables.records.DictCountryRecord;
import com.moseeker.profile.dao.CountryDao;

@Repository
public class CountryDaoImpl extends
		BaseDaoImpl<DictCountryRecord, DictCountry> implements
		CountryDao {

	@Override
	protected void initJOOQEntity() {
		this.tableLike = DictCountry.DICT_COUNTRY;
	}

	@Override
	public List<DictCountryRecord> getCountresByIDs(List<Integer> ids) {
		
		List<DictCountryRecord> records = new ArrayList<>();
		Connection conn = null;
		try {
			if(ids != null && ids.size() > 0) {
				conn = DBConnHelper.DBConn.getConn();
				DSLContext create = DBConnHelper.DBConn.getJooqDSL(conn);
				SelectWhereStep<DictCountryRecord> select = create.selectFrom(DictCountry.DICT_COUNTRY);
				SelectConditionStep<DictCountryRecord> selectCondition = null;
				for(int i=0; i<ids.size(); i++) {
					if(i == 0) {
						selectCondition = select.where(DictCountry.DICT_COUNTRY.ID.equal(UInteger.valueOf(ids.get(i))));
					} else {
						selectCondition.or(DictCountry.DICT_COUNTRY.ID.equal(UInteger.valueOf(ids.get(i))));
					}
				}
				records = selectCondition.fetch();
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		} finally {
			try {
				if(conn != null && !conn.isClosed()) {
					conn.close();
				}
			} catch (SQLException e) {
				logger.error(e.getMessage(), e);
			} finally {
				//do nothing
			}
		}
		
		return records;
	}

	@Override
	public DictCountryRecord getCountryByID(int nationality_code) {
		DictCountryRecord record = null;
		Connection conn = null;
		try {
			if(nationality_code > 0) {
				conn = DBConnHelper.DBConn.getConn();
				DSLContext create = DBConnHelper.DBConn.getJooqDSL(conn);
				Result<DictCountryRecord> result = create.selectFrom(DictCountry.DICT_COUNTRY)
						.where(DictCountry.DICT_COUNTRY.ID.equal(UInteger.valueOf(nationality_code))).limit(1).fetch();
				if(result != null && result.size() > 0) {
					record = result.get(0);
				}
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		} finally {
			try {
				if(conn != null && !conn.isClosed()) {
					conn.close();
				}
			} catch (SQLException e) {
				logger.error(e.getMessage(), e);
			} finally {
				//do nothing
			}
		}
		return record;
	}
}
