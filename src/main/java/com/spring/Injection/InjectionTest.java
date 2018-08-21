package com.spring.Injection;

import com.spring.beans.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * com.spring.Injection
 *
 * @author jh
 * @date 2018/8/21 10:58
 * description:
 */
public class InjectionTest {
	@Test
	public void test(){
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext ("applicationContext2.xml");

		User user = (User) applicationContext.getBean ("user");
		System.out.println (user);
	}

	@Test
	public void test1(){
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext ("applicationContext2.xml");

		User user = (User) applicationContext.getBean ("user1");
		System.out.println (user);
	}


	@Test
	public void test2(){
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext ("applicationContext2.xml");

		User user = (User) applicationContext.getBean ("user3");
		System.out.println (user);
	}
	@Test
	public void test3(){
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext ("applicationContext2.xml");

		User user = (User) applicationContext.getBean ("user4");
		System.out.println (user);
	}

	@Test
	public void t1(){
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext ("applicationContext2.xml");

		CollectionBean cb = (CollectionBean) applicationContext.getBean ("cb");
		System.out.println (cb);
	}

	@Test
	public void t2(){
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext ("applicationContext2.xml");

		CollectionBean cb = (CollectionBean) applicationContext.getBean ("list");
		System.out.println (cb);
	}

	@Test
	public void t3(){
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext ("applicationContext2.xml");

		CollectionBean cb = (CollectionBean) applicationContext.getBean ("map");
		System.out.println (cb);
	}
	@Test
	public void t4(){
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext ("applicationContext2.xml");

		CollectionBean cb = (CollectionBean) applicationContext.getBean ("properties");
		System.out.println (cb);
	}
}
