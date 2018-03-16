package com.test;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
/**
 * 测试集合操作
 * @author Administrator
 *
 */
public class testCollection {
	public static void main( String args[] ){
	      try{   
	      // 连接到 mongodb 服务
	      MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
	         
	       
	      // 连接到数据库
	      MongoDatabase mongoDatabase = mongoClient.getDatabase("mtest");  
	      System.out.println("Connect to database successfully");
	      //创建集合
	      mongoDatabase.createCollection("test");
	      System.out.println("集合创建成功");
	      //获取test数据库集合
	      MongoCollection<Document> collection = mongoDatabase.getCollection("test");
	       System.out.println("集合 test 选择成功");
	       
	      }catch(Exception e){
	        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	     }
	   }
}
