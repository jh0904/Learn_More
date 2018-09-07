package com.magic;

import java.util.HashMap;

/**
 * com.magic
 *
 * @author jh
 * @date 2018/9/7 8:19
 * description:
 */
public class Hello {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<> ();
		map.put ("a",11);
		map.put ("a",22);
		map.put ("a",33);
		map.put ("a",44);
		map.put (null,12);
		map.put ("a",55);
		System.out.println (map.get (null));
		System.out.println (map.get ("a"));
	}
}
