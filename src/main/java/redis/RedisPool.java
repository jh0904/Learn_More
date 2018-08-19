package redis;

import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisSentinelPool;

import java.util.HashSet;

/**
 * redis
 *
 * @author jh
 * @date 2018/8/19 23:37
 * description:实现一个哨兵池
 */
public class RedisPool {
	public static void main(String[] args) {
		JedisPoolConfig poolConfig = new JedisPoolConfig ();
		poolConfig.setMaxTotal (200);
		poolConfig.setMaxIdle (32);
		poolConfig.setMaxWaitMillis (100 * 1000);
		poolConfig.setBlockWhenExhausted (true);
		poolConfig.setTestOnBorrow (true);

		HashSet<String> set = new HashSet<> ();
		set.add ("119.23.10.198:6379");
		JedisSentinelPool pool = new JedisSentinelPool ("mymaster", set, poolConfig);
	}
}
