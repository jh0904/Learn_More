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
	public void test() {
		if (jedis.ping ().equals ("PONG")) {
			System.out.println ("连接成功");
		} else {
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
		jedis.set ("k1", "asd");
		jedis.keys ("*").stream ().forEach ((a) -> System.out.print (a + "\t"));
		jedis.expire ("k1", 10);
		System.out.println ("k2------->" + jedis.ttl ("k2"));
		//ttl key 查看还有多少秒过期，-1表示永不过期，-2表示已过期
		for (int i = 0; i < 20; i++) {
			Thread.sleep (1000);
			System.out.println (jedis.ttl ("k1"));
		}
		jedis.keys ("*").forEach ((a) -> System.out.print (a + "\t"));
		//type key 查看你的key是什么类型
		System.out.println ();
		System.out.println ("查看类型");
		System.out.println (jedis.type ("k2"));
	}

	public static void show(){
		Jedis jedis = new Jedis ("119.23.10.198");
		jedis.keys ("*").forEach ((a) -> System.out.print (a + "\t"));
	}

	//深入学习键的操作
	@Test
	public void demo(){
		//重命名
		//String rename = jedis.rename ("k4", "kkkkk");
		//System.out.println (rename);
		//计算长度
		//System.out.println (jedis.llen ("k1"));

	}


	//实现Redis中String的操作
	@Test
	public void test2() {
		//set/get/del/append/strlen

		System.out.println (jedis.set ("magic", "ma"));
		System.out.println (jedis.get ("magic"));
		jedis.del ("magic");
		jedis.keys ("*").forEach ((a) -> System.out.print (a + "\t"));
		System.out.println (jedis.set ("magic", "ma"));
		System.out.println (jedis.append ("magic", "heheda"));//返回的是字符串长度
		System.out.println (jedis.get ("magic"));
		System.out.println (jedis.strlen ("magic"));
		//Incr/decr/incrby/decrby,一定要是数字才能进行加减

		jedis.set ("sy","521");
		System.out.println (jedis.incr ("sy"));
		System.out.println (jedis.decr ("sy"));
		System.out.println (jedis.incrBy ("sy", 2));
		System.out.println (jedis.decrBy ("sy", 2));
		//getrange/setrange

		System.out.println (jedis.getrange ("magic", 0, 2));

		//setex(set with expire)键秒值/setnx(set if not exist)

		jedis.set ("magic","hehe");
		System.out.println (jedis.setex ("magic", 5, "magic"));
		//就是动态设值
		for (int i = 0; i <100 ; i++) {
			jedis.keys ("*").forEach ((a) -> System.out.print (a + "\t"));
			System.out.println ();
		}
		//当不存在时设值
		System.out.println (jedis.setnx ("k123", "123"));
		//mset/mget/msetnx
		//mset:同时设置一个或多个 key-value 对。
		System.out.println (jedis.mset ("b1", "1", "b2", "2", "b3", "3"));
		jedis.keys ("*").forEach ((a) -> System.out.print (a + "\t"));

		//getset(先get再set)
		//getset:将给定 key 的值设为 value ，并返回 key 的旧值(old value)。
		System.out.println (jedis.getSet ("magic", "123"));

	}

	//实现Redis中list的操作
	@Test
	public void test3() {
		//lpush/rpush/lrange
		System.out.println (jedis.lpush ("list", "1", "2", "3"));
		System.out.println (jedis.rpush ("list", "4"));
		System.out.println (jedis.lrange ("list", 0, -1));

		//lpop/rpop
		//lindex，按照索引下标获得元素(从上到下)
		//llen
	}

	//实现Redis中set的操作
	@Test
	public void test4() {

	}

	//实现Redis中hash的操作
	@Test
	public void test5() {

	}

	//实现Redis中zset的操作
	@Test
	public void test6() {

	}
}
