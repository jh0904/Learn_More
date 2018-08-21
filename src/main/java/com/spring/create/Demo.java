package com.spring.create;

import com.spring.beans.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * com.spring.create
 *
 * @author jh
 * @date 2018/8/21 10:25
 * description:
 */
public class Demo {
	@Test
	//空参构造方式
	public void test() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext ("applicationContext1.xml");

		User user = (User) applicationContext.getBean ("user");
		System.out.println (user);
	}

	@Test
	public void test2(){
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext ("applicationContext1.xml");

		User user = (User) applicationContext.getBean ("user2");
		System.out.println (user);
	}

	@Test
	public void test3(){
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext ("applicationContext1.xml");

		User user = (User) applicationContext.getBean ("user3");
		System.out.println (user);
	}


	@Test
	//空参构造方式
	public void fun() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext ("applicationContext1.xml");

		User user = (User) applicationContext.getBean ("user");
		User user1 = (User) applicationContext.getBean ("user");

		/*
		* 单例就是True
		* 多例就是false，可以看无参构造，都使用了两次
		* 绝大多数单例，但是再和Struts2时候使用多例
		* */
		System.out.println (user == user1);
	}

}
