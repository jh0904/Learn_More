package Redis1;

import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;

import java.util.Set;

/**
 * Redis1
 *
 * @author jh
 * @date 2018/8/17 22:21
 * description:
 */
public class RedisTest {
	Jedis jedis = new Jedis ("119.23.10.198");
	//测试连通?
	@Test
	public void test(){
		if(jedis.ping ().equals ("PONG")){
			System.out.println ("连接成功");
		}else{
			System.out.println ("连接失败");
		}
	}
	//键的操作
	@Test
	public void test1() throws InterruptedException {
		//keys *
		Set<String> keys = jedis.keys ("*");
		keys.stream ().forEach (System.out::println);
		//exists key的名字，判断某个key是否存在
		Boolean k1 = jedis.exists ("k1");
		System.out.println (k1);
		//move key db   --->当前库就没有了，被移除了
		/*jedis.move ("k1",1);
		jedis.select (1);
		String k11 = jedis.get ("k1");
		System.out.println (k11);*/
		//expire key 秒钟：为给定的key设置过期时间
		//jedis.select (0);
		jedis.set ("k1","asd");
		jedis.keys ("*").stream ().forEach ((a)-> System.out.print (a+"\t"));
		jedis.expire ("k1",10);
		System.out.println ("k2------->"+jedis.ttl ("k2"));
		//ttl key 查看还有多少秒过期，-1表示永不过期，-2表示已过期
		for (int i = 0; i < 20; i++) {
			Thread.sleep (1000);
			System.out.println (jedis.ttl ("k1"));
		}
		jedis.keys ("*").stream ().forEach ((a)-> System.out.print (a+"\t"));
		//type key 查看你的key是什么类型
		System.out.println ("查看类型");
		System.out.println (jedis.type ("k2"));
	}

	@Test
	public void test2(){

	}
}
