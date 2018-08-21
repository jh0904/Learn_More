package com.spring1.UserServiceProxyFactopry;

import com.spring1.Service.UserService;
import com.spring1.Service.UserServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * com.spring1.UserServiceProxyFactopry
 *
 * @author jh
 * @date 2018/8/21 16:58
 * description:实现动态代理
 */
public class UserServiceProxyFactory implements InvocationHandler {
	private UserService us;

	public UserServiceProxyFactory(UserService us) {
		super ();
		this.us = us;
	}

	//生成动态代理
	public UserService getUserServiceProxy() {
		UserService service = (UserService) Proxy.newProxyInstance (UserServiceProxyFactory.class.getClassLoader (),
				UserServiceImpl.class.getInterfaces (),
				this
		);
		return service;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println ("打开事务---->");

		Object invoke = method.invoke (us, args);

		System.out.println ("提交事务---->");
		return invoke;
	}
}
