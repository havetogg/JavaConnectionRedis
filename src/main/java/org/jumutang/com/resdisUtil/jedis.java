package org.jumutang.com.resdisUtil;

import org.jumutang.com.entity.Car;
import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.Map;

public class jedis {

	private static Jedis jedis; 
	      
		  //手动获取jedit实例连接数据库
	      public void setup() {
	          //连接redis服务器，192.168.0.100:6379
	          ///jedis = new Jedis("www.amumu.xin", 6379);
	          jedis = new Jedis("localhost", 6379);
	          //权限认证
	          //jedis.auth("admin");  
	      }
	      
	      /**
	      * redis存储字符串
	      */
           public void testString() {
               //-----添加数据----------  
               /*jedis.set("name","xinxin");//向key-->name中放入了value-->xinxin
               System.out.println(jedis.get("name"));//执行结果：xinxin  
               
               jedis.append("name", " is my lover"); //拼接
               System.out.println(jedis.get("name")); 
               
               jedis.del("name");  //删除某个键
               System.out.println(jedis.get("name"));
               //设置多个键值对
               jedis.mset("name","liuling","age","23","qq","476777XXX");
               jedis.incr("age"); //进行加1操作
               System.out.println(jedis.get("name") + "-" + jedis.get("age") + "-" + jedis.get("qq"));*/

               Map<String,Object> jedisMap = new HashMap<>();
               jedisMap.put("No1",new Car("123","50","500"));
			   String returnStr = jedis.get("No1");
			   System.out.println(returnStr);
		   }


           
           
           public static void main (String args []){
        	   
        	   jedis j = new jedis();
        	   
        	   //获取jedis连接实例
        	   //j.setup();
        	   
        	   //传入String参数
        	   //j.testString();
        	   
        	   // --------------------------------------
        	   
        	   //从jedis连接池中获取jedis对象实例操作数据库
        	   redisUtil util = new redisUtil();
        	   
        	   jedis= util.getJedis();
        	   
        	   j.testString();
        	   
        	   
           }
	           
	      
	      
	
}
