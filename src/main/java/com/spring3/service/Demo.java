package com.spring3.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * com.spring3.service
 *
 * @author jh
 * @date 2018/8/22 15:30
 * description:
 * 三种事务：
 * 编码式
 * XML配置
 * 注解配置
 */
@RunWith (SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContextTX.xml")
public class Demo {

	//@Resource(name="accountService")
	@Autowired
	private AccountService as;

	@Test
	public void test(){
		as.transFer (1,2,100d);
	}
}
