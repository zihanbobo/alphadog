package com.moseeker.common.cache;

import org.junit.Test;

import com.google.common.base.Stopwatch;
import com.moseeker.common.redis.RedisClient;
import com.moseeker.common.redis.RedisClientFactory;

public class RedisClusterTest {

	/*@Test
	public void connPoolTest() {
		RedisClient redisClient = RedisClientFactory.getCacheClient();
		String key = "DEFAULT";
		Stopwatch stopWatch = Stopwatch.createStarted();
    	String redisValue = "";
    	String redisKey = "";
		try {
			redisKey = redisClient.set(0, key, "test", "test value");
			redisValue = redisClient.get(0, key, "test");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		stopWatch.stop();
    	System.out.println("redisKey:"+redisKey);
    	System.out.println("redisValue:"+redisValue);
    	System.out.println(stopWatch.toString());
	}*/
}
