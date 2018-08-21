package com.spring1.annotationAop;

import com.spring1.Service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * com.spring1.annotationAop
 *
 * @author jh
 * @date 2018/8/21 19:08
 * description:
 */
@RunWith(SpringJUnit4ClassRunner.class)  //spring与Junit测试
@ContextConfiguration("classpath:applicationContextAop1.xml")
public class Demo {
	@Resource(name = "userService")
	private UserService user;

	@Test
	public void fun1(){
		user.save ();

	}
}
