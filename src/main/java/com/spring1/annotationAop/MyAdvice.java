package com.spring1.annotationAop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * com.spring1.Service
 *
 * @author jh
 * @date 2018/8/21 18:05
 * description:通知类
 */
@Aspect
//表示该类是一个通知类

public class MyAdvice {
	@Pointcut("execution(* com.spring1.Service..*ServiceImpl.*(..))")
	public void pc(){}

	//前置通知
	//指定该方法是前置通知，并制定切入点
	@Before("MyAdvice.pc()")
	public void before() {
		System.out.println ("前置通知");
	}

	//后置通知(出现异常不调用)
	@AfterReturning("execution(* com.spring1.Service..*ServiceImpl.*(..))")
	public void afterReturning() {
		System.out.println ("后置通知--->出现异常不会调用");
	}

	//环绕通知
	@Around("execution(* com.spring1.Service..*ServiceImpl.*(..))")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println ("环绕通知   ——————————》前");
		Object proceed = pjp.proceed (); //调用目标方法
		System.out.println ("环绕通知   ——————————》后");
		return proceed;
	}

	//异常拦截通知
	@AfterThrowing("execution(* com.spring1.Service..*ServiceImpl.*(..))")
	public void afterEx() {
		System.out.println ("异常通知");
	}

	//后置通知
	@After ("execution(* com.spring1.Service..*ServiceImpl.*(..))")
	public void after() {
		System.out.println ("后置通知出现异常会调用");
	}
}
