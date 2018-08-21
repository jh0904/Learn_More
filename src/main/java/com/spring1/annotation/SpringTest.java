package com.spring1.annotation;

import com.spring1.beans.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * com.spring1.annotation
 *
 * @author jh
 * @date 2018/8/21 15:26
 * description:
 */
@RunWith(SpringJUnit4ClassRunner.class)  //spring与Junit测试
@ContextConfiguration("classpath:applicationContext11.xml")
public class SpringTest {

	@Test
	public void test1() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext ("applicationContext11.xml");
		User user = (User) applicationContext.getBean ("user");
		System.out.println (user);
	}

	@Test
	//scope测试
	public void test2() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext ("applicationContext11.xml");
		User user1 = (User) applicationContext.getBean ("user");
		User user2 = (User) applicationContext.getBean ("user");
		System.out.println (user1 == user2);
	}

	@Resource(name = "user")
	private User user;
	@Test
	public void test3() {
		System.out.println (user);
	}
}
