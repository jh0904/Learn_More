package com.magic;

/**
 * com.magic
 *
 * @author jh
 * @date 2018/9/18 22:01
 * description:测试多态的特性
 */
public class Main {
	public static void main(String[] args) {
		Father f = new Son ();
		f.show ();
		System.out.println (f.i);
	}
}
