package com.magic;

/**
 * com.magic
 *
 * @author jh
 * @date 2018/9/6 9:33
 * description:
 */
public class StringDemo {
	public static void main(String[] args) {
		String s1=new String("abc");
		String s2="abc";
		String s3=new String("abc");

		System.out.println (s1 == s2);
		System.out.println (s1 == s3);
		System.out.println (s3 == s2);


		System.out.println ("========================");

		System.out.println (s1 == s1.intern ());
		System.out.println (s2 == s2.intern ());
		System.out.println (s1.intern () == s2.intern ());

		System.out.println ("========================");

		String s4="java";
		String s5="ja";
		String s6="va";
		//常量找池，变量（+）找堆
		System.out.println (s4 == "java");
		System.out.println (s4 == s5+s6);
		System.out.println (s4 ==("ja" + s6));
		System.out.println (s4 ==("ja" + "va"));
	}
}
