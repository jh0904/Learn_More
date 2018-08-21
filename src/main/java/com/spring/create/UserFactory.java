package com.spring.create;

import com.spring.beans.User;

/**
 * com.spring.create
 *
 * @author jh
 * @date 2018/8/21 10:28
 * description:
 */
public class UserFactory {
	public static User createUser(){
		System.out.println ("静态工厂创建User");
		return new User();
	}

	public  User createUser2(){
		System.out.println ("动态工厂创建User");
		return new User();
	}
}
