package com.spring1.UserServiceProxyFactopry;

import com.spring1.Service.UserService;
import com.spring1.Service.UserServiceImpl;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * com.spring1.UserServiceProxyFactopry
 *
 * @author jh
 * @date 2018/8/21 16:58
 * description:实现CGlib动态代理,继承代理
 */
public class UserServiceProxyFactory2 implements MethodInterceptor {

	//生成CGlib
	public UserService getUserServiceProxy() {
		Enhancer enhancer = new Enhancer ();  //生成代理对象
		enhancer.setSuperclass (UserServiceImpl.class);//设置代理的对象
		enhancer.setCallback (this);//代理作什么
		UserService us = (UserService)enhancer.create ();
		return us;
	}

	@Override
	public Object intercept(Object obj, Method method, Object[] arg, MethodProxy methodProxy) throws Throwable {

		//打开事务
		System.out.println ("------>打开事务---->");
		//调用原有方法
		Object returnValue = methodProxy.invokeSuper (obj, arg);
		//提交事务
		System.out.println ("------>提交事务---->");
		return returnValue;
	}
}
