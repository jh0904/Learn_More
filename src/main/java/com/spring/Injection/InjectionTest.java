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
}
