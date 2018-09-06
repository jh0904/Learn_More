package com.magic;

import java.util.HashSet;

/**
 * com.magic
 *
 * @author jh
 * @date 2018/9/6 8:34
 * description:
 */
public class EqualsTest {
	public static void main(String[] args) {
		String s1=new String("aa");
		String s2=new String("aa");
		System.out.println (s1 == s2);//f
		System.out.println (s1.equals (s2));//t
		HashSet<String> set = new HashSet<> ();
		set.add (s1);
		set.add (s2);
		System.out.println (set.size ());//1
		System.out.println ("------------------------");

		Person p1=new Person("aa");
		Person p2=new Person("aa");
		System.out.println (p1 == p2);//f
		System.out.println (p1.equals (p2));//f
		HashSet<Person> set1 = new HashSet<> ();
		set1.add (p1);
		set1.add (p2);

		System.out.println (set1.size ());//2

	}
}
