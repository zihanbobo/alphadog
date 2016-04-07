package com.moseeker.thrift.service.impl;

import static com.moseeker.db.userdb.tables.Companyfollowers.COMPANYFOLLOWERS;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

import org.apache.thrift.TException;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SelectJoinStep;

import com.moseeker.common.dbconnection.DatabaseConnectionHelper;
import com.moseeker.common.redis.RedisCallback;
import com.moseeker.common.redis.RedisClient;
import com.moseeker.common.redis.RedisClientFactory;
import com.moseeker.thrift.gen.companyfollowers.Companyfollower;
import com.moseeker.thrift.gen.companyfollowers.CompanyfollowerQuery;
import com.moseeker.thrift.gen.companyfollowers.CompanyfollowerServices;

public class CompanyfollowerServicesImpl implements CompanyfollowerServices.Iface {

	@Override
	public List<Companyfollower> getCompanyfollowers(CompanyfollowerQuery query) throws TException {
		// TODO Auto-generated method stub
		int appid = query.getAppid();
		List<Companyfollower> companyfollowers = new ArrayList<Companyfollower>();

		DSLContext create;
		try {
			create = DatabaseConnectionHelper.getConnection().getJooqDSL();

			SelectJoinStep<Record> table = create.select().from(COMPANYFOLLOWERS);

			if (query.getLimit() > 0) {
				table.limit(query.getLimit());
			} else {
				table.limit(10);
			}

			if (query.getUserid() > 0) {
				table.where(COMPANYFOLLOWERS.USERID.equal(query.getUserid()));
			}

			Result<Record> result = table.fetch();
			for (Record r : result) {
				// System.out.print(r);
				Companyfollower follower = new Companyfollower();
				follower.setId(r.getValue(COMPANYFOLLOWERS.ID));
				follower.setUserid(r.getValue(COMPANYFOLLOWERS.USERID));
				follower.setCompanyid(r.getValue(COMPANYFOLLOWERS.COMPANYID));
				companyfollowers.add(follower);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return companyfollowers;
	}

	@Override
	public int postCompanyfollowers(int userid, int companyid) throws TException {
		// TODO Auto-generated method stub

		int insertret = 0;
		// Connection is the only JDBC resource that we need
		// PreparedStatement and ResultSet are handled by jOOQ, internally
		DSLContext create;
		try {
			create = DatabaseConnectionHelper.getConnection().getJooqDSL();

			DateFormat dateFormatterChina = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);// 格式化输出
			TimeZone timeZoneChina = TimeZone.getTimeZone("Asia/Shanghai");// 获取时区
			dateFormatterChina.setTimeZone(timeZoneChina);// 设置系统时区

			// insert
			insertret = create
					.insertInto(COMPANYFOLLOWERS, COMPANYFOLLOWERS.USERID, COMPANYFOLLOWERS.COMPANYID,
							COMPANYFOLLOWERS.CREATE_TIME)
					.values(userid, companyid, new Timestamp(System.currentTimeMillis())).execute();
			System.out.println(create.insertInto(COMPANYFOLLOWERS, COMPANYFOLLOWERS.USERID, COMPANYFOLLOWERS.COMPANYID)
					.values(userid, companyid).getSQL());

			System.out.println("insert result: " + insertret);
		}
		// For the sake of this tutorial, let's keep exception handling simple
		catch (Exception e) {
			e.printStackTrace();
		}
		return insertret;
	}

	@Override
	public int delCompanyfollowers(int userid, int companyid) throws TException {
		// TODO Auto-generated method stub
		int delret = 0;
		// Connection is the only JDBC resource that we need
		// PreparedStatement and ResultSet are handled by jOOQ, internally
		DSLContext create;
		try {
			create = DatabaseConnectionHelper.getConnection().getJooqDSL();

			// delete
			delret = create.delete(COMPANYFOLLOWERS).where(COMPANYFOLLOWERS.USERID.equal(userid))
					.and(COMPANYFOLLOWERS.COMPANYID.equal(companyid)).execute();
			System.out.println("delete result: " + delret);

		}
		// For the sake of this tutorial, let's keep exception handling simple
		catch (Exception e) {
			e.printStackTrace();
		}
		return delret;
	}

	public static void main(String[] args) {

		RedisClient client = RedisClientFactory.getCacheClient();
		String str = client.get(0, "DEFAULT", "user1", new RedisCallback() {
			@Override
			public String call() {

				DSLContext create;
				try {
					create = DatabaseConnectionHelper.getConnection().getJooqDSL();

					Record ret = create.select().from(COMPANYFOLLOWERS).where(COMPANYFOLLOWERS.USERID.equal(11))
							.fetchAny();
					System.out.println("ret result: " + ret);
					return String.valueOf(ret.getValue(COMPANYFOLLOWERS.ID));

				}
				// For the sake of this tutorial, let's keep exception handling
				// simple
				catch (Exception e) {
					e.printStackTrace();
				}
				return null;
			}
		});

		System.out.print(str);
	}

}
