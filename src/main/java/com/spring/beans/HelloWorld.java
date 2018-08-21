package com.spring.beans;

/**
 * src.beans
 *
 * @author jh
 * @date 2018/8/21 9:22
 * description:
 */
public class HelloWorld {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public void hello(){
		System.out.println ("hello--->" + name);
	}

	public HelloWorld() {
		System.out.println ("HelloWorld...");
	}

}
