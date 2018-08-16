package redis;

import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;

import java.util.Set;

/**
 * redis
 *
 * @author jh
 * @date 2018/8/16 13:22
 * description:
 */
public class RedisTest {

	//测试连接
	@Test
	public void test() {
		//连接本地的 Redis 服务
		Jedis jedis = new Jedis ("119.23.10.198");
		System.out.println ("连接成功");
		//查看服务是否运行
		System.out.println ("服务正在运行: " + jedis.ping ());
		Set<String> keys = jedis.keys ("*");
		for (String key : keys) {
			System.out.println (key);
		}
		/*jedis.set ("jh","Javaer");
		System.out.println (jedis.get ("jh"));*/
	}
}
