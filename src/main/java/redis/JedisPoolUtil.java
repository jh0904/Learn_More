package redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * redis
 *
 * @author jh
 * @date 2018/8/16 20:05
 * description:实现一个双端检索。
 */
public class JedisPoolUtil {
	private static volatile JedisPool jedisPool = null;

	private JedisPoolUtil() {

	}

	public static JedisPool getJedisPoolInstance() {
		if (jedisPool == null) {
			synchronized (JedisPoolUtil.class) {
				if (jedisPool == null) {
					JedisPoolConfig poolConfig = new JedisPoolConfig ();
					poolConfig.setMaxTotal (1000);
					poolConfig.setMaxIdle (32);
					poolConfig.setMaxWaitMillis (100*1000);
					poolConfig.setTestOnBorrow (true);

					jedisPool=new JedisPool (poolConfig,"119.23.10.198",6379);
				}
			}
		}
		return jedisPool;
	}

	public static void release(JedisPool jedisPool, Jedis jedis){
		if(jedis!=null){
			jedis.close ();
			jedisPool.close ();
		}
	}
}
