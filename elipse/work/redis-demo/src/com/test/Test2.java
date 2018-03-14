package com.test;

import com.util.RedisUtil;

import redis.clients.jedis.Jedis;

public class Test2 {
	public static void main(String[] args) {
		testList();
	}
	
	static void testList() {
		Jedis redis=RedisUtil.getJedis();
		redis.del("xxx");
		redis.lpush("xxx", "猫");
		redis.lpush("xxx", "狗");
		redis.lpush("xxx", "兔");
		redis.lpush("xxx", "猪");
		System.out.println(redis.lrange("xxx", 0, -1));
		redis.del("xxx");
		redis.rpush("xxx", "猫");
		redis.rpush("xxx", "狗");
		redis.rpush("xxx", "兔");
		redis.rpush("xxx", "猪");
		System.out.println(redis.lrange("xxx", 0, -1));
		RedisUtil.close(redis);
	}
	static void testSort() {
		
	}
	
}
