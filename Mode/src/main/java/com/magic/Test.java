package com.magic;

import java.util.Random;

/**
 * com.magic
 *
 * @author jh
 * @date 2018/9/21 15:52
 * description:
 */
public class Test {
	public static void main(String[] args) {
		String a1 = aa ("2");
		String a2 = aa ("3");
		System.out.println (a1+a2);
	}
	public static String aa(String a){
		Random random = new Random ();
		int i = random.nextInt (2)+2;
		StringBuffer str=new StringBuffer ();
		for (int i1 = 0; i1 < i; i1++) {
			str.append (a);
		}
		return str.toString ();
	}
}
