package com.test;
import com.util.RedisUtil;

import redis.clients.jedis.Jedis;

public class Test {
	public static void main(String[] args) {
		Jedis redis=RedisUtil.getJedis();
		
		redis.set("username", "张三");
		
		redis.append("username", "是个好学生");
		System.out.println(redis.get("username"));
		
		
		//testString();
	}

	public static void testString() {
		Jedis redis = new Jedis("localhost", 6379);
		redis.auth("root");
		redis.set("username", "张三");
		redis.get("username");
		redis.append("username", "是个好学生");
		redis.del("user");
		redis.mset("userName", "小青","password","123","note","这是备注");
		System.out.println("redis连接服务器成功：" + redis.ping());// PONE
		redis.close();

	}
}
