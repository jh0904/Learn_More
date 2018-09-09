package Test;

/**
 * Test
 *
 * @author jh
 * @date 2018/9/9 15:25
 * description:对于Math类的round、ceil、floor方法的探究
 */
public class MathTest {
	public static void main(String[] args) {
		float m=6.4f;
		float n = -6.4f;

		System.out.println ("Math.round(" + m + ")= " + Math.round (m));
		System.out.println ("Math.round(" + n + ")= " + Math.round (n));
		System.out.println ("Math.ceil(" + m + ")= " + Math.ceil (m));
		System.out.println ("Math.ceil(" + n + ")= " + Math.ceil (n));
		System.out.println ("Math.floor(" + m + ")= " + Math.floor (m));
		System.out.println ("Math.floor(" + n + ")= " + Math.floor (n));
	}
}
