package com.magic;

import org.junit.Test;

import java.util.ArrayList;

/**
 * com.magic
 *
 * @author jh
 * @date 2018/9/7 13:56
 * description:
 */
public class IteratorDemo {
	static ArrayList<Integer> list = new ArrayList<> ();

	static {
		list.add (1);
		list.add (4);
		list.add (231);
		list.add (34);
	}

	@Test
	public void test1() {
		//removeIf  Java8新出现的功能
		list.removeIf (obj -> obj > 4);
		/**
		 * it.remove();            √
		 * list.remove(obj);       ×
		 * list.remove(index);     ×
		 * list.remove(obj,index); ×
		 * */

		list.forEach (System.out::println);
	}


}
