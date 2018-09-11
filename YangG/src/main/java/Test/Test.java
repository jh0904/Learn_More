package Test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Test
 *
 * @author jh
 * @date 2018/9/9 20:32
 * description:
 */
public class Test {
	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a,b,c;
		ArrayList<Numss> list = new ArrayList<> ();
		int num=0;
		for (int i = 0; i < n; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();

			Numss numss = new Numss (a,b,c);
			list.add (numss);
		}
		for (int k = 0; k < n; ++k) {
			for (int i1 = 0; i1 < n; ++i1) {
				if (k == i1) {
					continue;
				}
				if (list.get(i1).a < list.get(k).a && list.get(i1).b < list.get(k).b && list.get(i1).c < list.get(k).b) {
					++num;
				}
			}
		}
		System.out.println(num);

	}
	static class Numss{
		int a,b,c;

		public Numss(int a, int b, int c) {
			this.a = a;
			this.b = b;
			this.c = c;
		}
	}
}
