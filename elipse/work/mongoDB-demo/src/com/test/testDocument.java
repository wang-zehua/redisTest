package com.test;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

/**
 * 测试文档操作
 * 
 * @author Administrator
 *
 */
public class testDocument {
	public static void main(String args[]) {

	}

	// 连接到 mongodb 服务
	static MongoClient mongoClient = new MongoClient("localhost", 27017);
	// 连接到数据库
	static MongoDatabase mongoDatabase = mongoClient.getDatabase("mycol");

	/**
	 * 
	 * 测试获取、插入文档
	 */
	public void testGetDocment() {
		// 获取集合test
		MongoCollection<Document> collection = mongoDatabase.getCollection("test");
		System.out.println("集合 test 选择成功");
		// 插入文档
		/**
		 * 1. 创建文档 org.bson.Document 参数为key-value的格式 2. 创建文档集合List<Document> 3.
		 * 将文档集合插入数据库集合中 mongoCollection.insertMany(List<Document>) 插入单个文档可以用
		 * mongoCollection.insertOne(Document)
		 */
		Document document = new Document("title", "MongoDB").append("description", "database").append("likes", 100)
				.append("by", "Fly");
		List<Document> documents = new ArrayList<Document>();
		documents.add(document);
		collection.insertMany(documents);
		System.out.println("文档插入成功");

	}

	/**
	 * 测试检索文档
	 */
	public void selectDocument() {

		// 检索所有文档
		/**
		 * 1. 获取迭代器FindIterable<Document> 2. 获取游标MongoCursor<Document> 3. 通过游标遍历检索出的文档集合
		 */
		// 获取集合test
		MongoCollection<Document> collection = mongoDatabase.getCollection("test");
		// 集合中检索文档
		FindIterable<Document> findIterable = collection.find();
		MongoCursor<Document> mongoCursor = findIterable.iterator();
		while (mongoCursor.hasNext()) {
			System.out.println(mongoCursor.next());
		}
	}
	/**
	 * 删除文档
	 */
	public void delDocument() {
		 MongoCollection<Document> collection = mongoDatabase.getCollection("test");
         System.out.println("集合 test 选择成功");

         //删除符合条件的第一个文档  
         collection.deleteOne(Filters.eq("likes", 200));  
         //删除所有符合条件的文档  
         collection.deleteMany (Filters.eq("likes", 200));  
         //检索查看结果  
         FindIterable<Document> findIterable = collection.find();  
         MongoCursor<Document> mongoCursor = findIterable.iterator();  
         while(mongoCursor.hasNext()){  
           System.out.println(mongoCursor.next());  
         }  
	}

}
