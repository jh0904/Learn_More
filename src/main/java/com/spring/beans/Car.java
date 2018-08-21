package com.spring.beans;

/**
 * com.spring.beans
 *
 * @author jh
 * @date 2018/8/21 11:01
 * description:
 */
public class Car {
	private String name;
	private String color;



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car{" +
				"name='" + name + '\'' +
				", color='" + color + '\'' +
				'}';
	}
}
