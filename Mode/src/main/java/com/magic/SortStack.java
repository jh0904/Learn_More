package com.magic;

import java.util.Stack;

/**
 * com.magic
 *
 * @author jh
 * @date 2018/9/18 23:58
 * description:给栈排序
 */
public class SortStack {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<> ();
		stack.push (3);
		stack.push (5);
		stack.push (1);
		stack.push (9);
		stack.push (2);
		sortStackByStack (stack);
		stack.forEach (System.out::println);
	}

	public static void sortStackByStack(Stack<Integer> stack) {
		Stack<Integer> help = new Stack<> ();
		while (!stack.isEmpty ()) {
			int cur = stack.pop ();
			while (!help.isEmpty () && help.peek () > cur) {
				stack.push (help.pop ());
			}
			help.push (cur);
		}
		while (!help.isEmpty ()) {
			stack.push (help.pop ());
		}
	}
}
