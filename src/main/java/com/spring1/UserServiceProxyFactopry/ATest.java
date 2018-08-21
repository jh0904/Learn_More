package com.spring1.UserServiceProxyFactopry;

import com.spring1.Service.UserService;
import com.spring1.Service.UserServiceImpl;
import org.junit.Test;
/**
 * com.spring1.UserServiceProxyFactopry
 *
 * @author jh
 * @date 2018/8/21 17:06
 * description:
 */
public class ATest {


	@Test
	public void t1(){
		UserServiceImpl us = new UserServiceImpl ();
		UserServiceProxyFactory factory = new UserServiceProxyFactory (us);
		UserService proxy = factory.getUserServiceProxy ();
		proxy.save ();
		//代理对象与被代理对象实现了相同的接口
		System.out.println (proxy instanceof UserServiceImpl);
	}

	@Test
	public void t2(){
		UserServiceProxyFactory2 factory = new UserServiceProxyFactory2 ();
		UserService proxy = factory.getUserServiceProxy ();
		proxy.save ();

		System.out.println (proxy instanceof UserServiceImpl);//true
		//代理对象继承了被代理对象
	}
}
