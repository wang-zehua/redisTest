package com.util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisUtil {

	private static JedisPool pool;
	private static String ip = "localhost";
	private static int port = 6379;
	private static int timeout = 10000;
	private static String auth = "root";
	private RedisUtil() {
		super();
	}

	static {
		JedisPoolConfig config = new JedisPoolConfig();
		// 最大连接数默认50000
		config.setMaxTotal(1024);
		config.setMaxIdle(200);// 最大空闲时间
		config.setMaxWaitMillis(10000);// 等连接池给连接的最大时间，毫秒、设-1永远不超时
		config.setTestOnBorrow(true);// borrow一个实例的时候，是否提亲进行validate验证

	pool = new JedisPool(config, ip, port, timeout, auth);
	}

	// 得到redis连接
	public static Jedis getJedis() {
		if (pool != null) {
			return pool.getResource();
		}else {
			return null;
		}

		
	}

	// 关闭redis连接
	public static void close(final Jedis redis) {
		if (redis != null) {
			redis.close();
		}
	}

}
