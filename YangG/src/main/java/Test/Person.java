package Test;

/**
 * Test
 *
 * @author jh
 * @date 2018/9/9 18:51
 * description:
 */
public class Person {
	private String name="hello";
	int age=0;
}
class Child extends  Person{
	public static void main(String[] args) {
		Person child = new Child ();
		//child.age
	}
}
