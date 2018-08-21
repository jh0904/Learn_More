package com.spring.beans;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * src.beans
 *
 * @author jh
 * @date 2018/8/21 9:23
 * description:
 */
public class Main {
	public static void main(String[] args) {
	/*	HelloWorld helloWorld = new HelloWorld ();
		helloWorld.setName ("jh");
		helloWorld.hello ();*/

		//创建spring IOC容器对象  首先创建出容器中的所有对象
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext ("applicationContext.xml");
		//从IOC中获取Bean实例
		HelloWorld bean = (HelloWorld) applicationContext.getBean ("helloWorld");
		//调用hello方法
		bean.hello ();

		User user = (User) applicationContext.getBean ("user");
		System.out.println (user);
	}
}
