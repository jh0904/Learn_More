package jvm.test;

/**
 * jvm.test
 *
 * @author jh
 * @date 2018/8/26 11:19
 * description:
 */
public class Demo {
	public static void main(String[] args) {
		Object o = new Object ();
		Demo demo = new Demo ();

		System.out.println (o.getClass ().getClassLoader ());
		System.out.println ("---------------------------");
		System.out.println (demo.getClass ().getClassLoader ().getParent ().getParent ());
		System.out.println (demo.getClass ().getClassLoader ().getParent ());
		System.out.println (demo.getClass ().getClassLoader ());
	}
}
