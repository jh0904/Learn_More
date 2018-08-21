package com.spring1.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * com.spring1.Service
 *
 * @author jh
 * @date 2018/8/21 18:05
 * description:通知类
 */
public class MyAdvice {

	//前置通知 ->目标方法之前调用
	//后置通知（出现异常不会调用）->目标方法之后调用
	//环绕通知 ->目标方法之前和之后都调用
	//异常拦截通知 ->如果出现异常就会调用
	//后置通知（无论是否出现异常都会调用） ->目标方法之后调用

	//前置通知
	public void before() {
		System.out.println ("前置通知");
	}

	//后置通知(出现异常不调用)
	public void afterReturning() {
		System.out.println ("后置通知--->出现异常不会调用");
	}

	//环绕通知
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println ("环绕通知   ——————————》前");
		Object proceed = pjp.proceed (); //调用目标方法
		System.out.println ("环绕通知   ——————————》后");
		return proceed;
	}
	//异常拦截通知

	public void afterEx() {
		System.out.println ("异常通知");
	}
	//后置通知
	public void after() {
		System.out.println ("后置通知出现异常会调用");
	}
}
