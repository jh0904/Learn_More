package day9_10;

import java.util.Arrays;

/**
 * day9_10
 *
 * @author jh
 * @date 2018/9/10 18:59
 * description:10个数字，实现先反转后，按照降序排序。
 */
public class Demo {
	public static void main(String[] args) {
		/*StringBuffer s=new StringBuffer ("123");
		System.out.println (s.reverse ());*/
		int[] a={125,234,345};
		int[] ints = descInt (a);
		for (int anInt : ints) {
			System.out.println (anInt);
		}
	}

	public static int[] reverseInt(int[] a){
		for (int i = 0; i < a.length; i++) {
			int i1 = Integer.parseInt (new StringBuffer ().append (a[i]).reverse ().toString ());
			a[i]=i1;
		}
		return a;
	}

	public static int[] descInt(int[] a){
		reverseInt (a);
		Arrays.sort (a);
		int[] arr=new int[a.length];
		for (int i = 0; i < a.length; i++) {
			// 反转后数组的第一个元素等于源数组的最后一个元素：
			arr[i] = a[a.length - i - 1];
		}
		return arr;
	}
}
