package com.spring1.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * com.spring.beans
 *
 * @author jh
 * @date 2018/8/21 11:01
 * description:
 */
@Component("car")
public class Car {
	@Value("宝马")
	private String name;
	@Value("蓝色")
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

	@PostConstruct// 创建后调用
	public void init() {
		System.out.println ("初始化");
	}
	@PreDestroy //在销毁之前调用
	public void destory(){
		System.out.println ("销毁");
	}
}
