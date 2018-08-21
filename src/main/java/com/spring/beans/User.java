package com.spring.beans;

/**
 * com.spring.beans
 *
 * @author jh
 * @date 2018/8/21 10:03
 * description:
 */
public class User {
	private String name;
	private int age ;

	public User() {
		System.out.println ("User...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
