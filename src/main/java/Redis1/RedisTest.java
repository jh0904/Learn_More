package Redis1;

import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.HashMap;
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

	public static void show() {
		Jedis jedis = new Jedis ("119.23.10.198");
		jedis.keys ("*").forEach ((a) -> System.out.print (a + "\t"));
	}

	//深入学习键的操作
	@Test
	public void demo() {
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

		jedis.set ("sy", "521");
		System.out.println (jedis.incr ("sy"));
		System.out.println (jedis.decr ("sy"));
		System.out.println (jedis.incrBy ("sy", 2));
		System.out.println (jedis.decrBy ("sy", 2));
		//getrange/setrange

		System.out.println (jedis.getrange ("magic", 0, 2));

		//setex(set with expire)键秒值/setnx(set if not exist)

		jedis.set ("magic", "hehe");
		System.out.println (jedis.setex ("magic", 5, "magic"));
		//就是动态设值
		for (int i = 0; i < 100; i++) {
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
		System.out.println (jedis.lpush ("list", "1", "2", "3"));//左增加
		System.out.println (jedis.rpush ("list", "4"));//右增加
		System.out.println (jedis.lrange ("list", 0, -1));//查询，从0到-1就是查询全部
		//lpop/rpop  出一个元素，左出或者右出
		System.out.println (jedis.lpop ("list"));
		System.out.println (jedis.lrange ("list", 0, -1));
		//lindex，按照索引下标获得元素(从上到下)
		System.out.println (jedis.lindex ("list", 5));
		//llen
		System.out.println (jedis.llen ("list"));
	}

	//实现Redis中set的操作
	@Test
	public void test4() {
		//sadd/smembers/sismember(判断元素是否在集合中)

		jedis.sadd ("set", "a", "b", "c", "d");
		System.out.println (jedis.smembers ("set"));
		System.out.println (jedis.sismember ("set", "a"));
		//scard，获取集合里面的元素个数

		System.out.println (jedis.scard ("set"));
		//srem key value 删除集合中元素

		jedis.srem ("set", "b");
		System.out.println (jedis.smembers ("set"));
		//srandmember key 某个整数(随机出count个数)

		System.out.println (jedis.srandmember ("set", 2));
		//spop key 随机出栈

		System.out.println (jedis.spop ("set"));
	}

	//实现Redis中hash的操作
	@Test
	public void test5() {
		//hset/hget/hmset/hmget/hgetall/hdel

		jedis.hset ("hash","a","1");
		System.out.println (jedis.hget ("hash", "a"));
		HashMap<String, String> map = new HashMap<> ();
		map.put ("4","a");
		map.put ("5","s");
		map.put ("6","d");
		map.put ("7","f");
		System.out.println (jedis.hmset ("hash1", map));
		System.out.println (jedis.hmget ("hash1", "4","5"));
		System.out.println (jedis.hgetAll ("hash1"));
		jedis.hdel ("hash1","4");
		System.out.println (jedis.hgetAll ("hash1"));
		//hlen 获取长度

		System.out.println (jedis.hlen ("hash1"));

		//hexists key 在key里面的某个值的key

		System.out.println (jedis.hexists ("hash1", "6"));
		//hkeys/hvals

		System.out.println (jedis.hkeys ("hash1"));
		System.out.println (jedis.hvals ("hash1"));
	}

	//实现Redis中zset的操作
	@Test
	public void test6() {
		//zadd/zrange

		System.out.println (jedis.zadd ("zset", 20.0, "v5"));
		System.out.println (jedis.zadd ("zset", 40.0, "v4"));
		System.out.println (jedis.zadd ("zset", 60.0, "v3"));
		System.out.println (jedis.zadd ("zset", 80.0, "v2"));
		System.out.println (jedis.zadd ("zset", 100.0, "v1"));
		System.out.println (jedis.zrange ("zset", 0, -1));

		//Withscores

		System.out.println (jedis.zrangeWithScores ("zset", 0, -1));

		//zrangebyscore key 开始score 结束score

		System.out.println (jedis.zrangeByScoreWithScores ("zset", "60", "90"));

		//zrem key 某score下对应的value值，作用是删除元素

		System.out.println (jedis.zrem ("zset", "5"));

		//zcard/zcount key score区间/zrank key values值，作用是获得下标值/zscore key 对应值,获得分数

		System.out.println (jedis.zcard ("zset"));

		System.out.println (jedis.zcount ("zset", 0, 80));

		System.out.println (jedis.zscore ("zset", "v2"));
	}
}
