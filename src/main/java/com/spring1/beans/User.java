package com.spring1.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * com.spring.beans
 *
 * @author jh
 * @date 2018/8/21 10:03
 * description:
 */
//@Component("user")
//<bean name="user" class=...>
//@Service("user") //service层的
//@Controller("user") //web层
@Repository("user") //dao层的

//@Scope("prototype")
public class User {
	@Value ("Tom")//通过反射赋值
	private String name;

	private int age;
	//自动装配   将匹配多个类型一致的对象，将无法选择对象
	//@Autowired
	//@Qualifier("car1")

	//手动注入 ------------------->推荐使用
	@Resource(name="car1")
	private Car car;


	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
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
	@Value ("22") //适用set方法赋值
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
