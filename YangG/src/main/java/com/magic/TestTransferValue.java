package com.magic;

/**
 * com.magic
 *
 * @author jh
 * @date 2018/9/6 14:32
 * description:
 */
public class TestTransferValue {
	public void changeValue1(int age) {
		age = 30;
	}

	public void changeValue2(Person person) {
		person.setName ("xxx");
	}

	public void changeValue3(String str) {
		str = "xxx";
	}

	public static void main(String[] args) {
		TestTransferValue test = new TestTransferValue ();
		int age = 20;
		test.changeValue1 (age);
		System.out.println ("age-------" + age);

		Person person = new Person ("abc");
		test.changeValue2 (person);
		System.out.println ("personName----->" + person.getName ());

		String str="abc";
		test.changeValue3 (str);
		System.out.println ("String------>" + str);
	}
}
