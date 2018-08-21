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
	private Car car;

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public User() {
		System.out.println ("User...");
	}
	public User(Car car, String name) {
		System.out.println ("--------->User(Car car, String name)");
		this.name = "香菇";
		this.car = car;
	}


	public User(String name, Car car) {
		System.out.println ("User(String name, Car car)");
		this.name = name;
		this.car = car;
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
				", car=" + car +
				'}';
	}
}
