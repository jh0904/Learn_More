package com.magic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * com.magic
 *
 * @author jh
 * @date 2018/9/7 8:11
 * description:最简单的方法给ArrayList去重
 */
public class DuplicateListDemo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList<> ();
		list.add (1);
		list.add (2);
		list.add (2);
		list.add (2);
		list.add (3);
		list.add (4);
		list.add (5);

		System.out.println ("--------------->"+list.size ());
		System.out.println ("<><><><><><>"+DuplicateListDemo.dupDeal (list).size ());

		list = DuplicateListDemo.dupDeal (list);

		list.forEach (System.out::println);

	}

	private static ArrayList dupDeal(ArrayList<Integer> list) {
		Set<Integer> set = new HashSet<> ();
		set.addAll (list);

		return new ArrayList<> (set);


	}
}
