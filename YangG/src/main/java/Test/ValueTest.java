package Test;

/**
 * Test
 *
 * @author jh
 * @date 2018/9/9 15:06
 * description:
 *  探索值传递与引用传递的区别
 * out:
 * 1
 * 2
 * Hellojava
 * Hello
 */
public class ValueTest {
	public static void main(String[] args) {
		Integer a=1;
		Integer b=a;
		b++;
		System.out.println (a);
		System.out.println (b);

		StringBuffer s1 = new StringBuffer ("Hello");
		StringBuffer s2 = new StringBuffer ("Hello");
		changeStringBuffer(s1,s2);
		System.out.println (s1);
		System.out.println (s2);
	}

	private static void changeStringBuffer(StringBuffer str1, StringBuffer str2) {
		str1.append ("java");
		str2=str1;//在这里s2已经改变。
		System.out.println ("--------"+str2);
	}
}
