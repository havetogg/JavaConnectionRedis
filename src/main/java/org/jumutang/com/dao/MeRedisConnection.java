package org.jumutang.com.dao;

import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

import org.redisson.Config;
import org.redisson.Redisson;

public class MeRedisConnection {

	public static void main(String[] args) {  
		MeRedisConnection main = new MeRedisConnection();
		
		main.SetRedis("TestGo");
		
    } 
	

	//获取Redis连接
	public  Redisson  getConnectionRedis(){
		 // 1.初始化  
        Config config = new Config();  
        config.setConnectionPoolSize(10);  
        //config.addAddress("localhost:6379");   //本地使用redis数据库
        config.addAddress("www.amumu.xin:6379");     //远程redis数据库
        //config.setPassword("123456");  //有密码验证
        Redisson redisson = Redisson.create(config);  
        
        System.out.println("获取Redis的连接.....");  
		
		return redisson;
	}
	
	//关闭Redis连接
	public void EndConnectionRedis(Redisson redisson){
		
		System.out.println("关闭Redis连接....");
		
		//关闭连接 redis
		redisson.shutdown();
	}
	
	
	//Set集合存入数据
	public void SetRedis(String strs ){
		
		Redisson redis = getConnectionRedis();

		Set<String> set = redis.getSet("keySet");
		
		set.add(strs);
		
		Set<String> resultSet = redis.getSet("keySet");
		
		 for(String str : resultSet){
			 System.out.println("Redis中获取数据:"+str.toString());
		 }
		
		EndConnectionRedis(redis);
		
	}
	
	
}
