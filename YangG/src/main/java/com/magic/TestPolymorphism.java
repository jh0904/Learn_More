package com.magic;

import java.util.Random;

/**
 * com.magic
 *
 * @author jh
 * @date 2018/9/6 14:14
 * description:对多态的理解.
 * 多态是运行时行为。
 */
interface Animal {
	public void eat();
}

class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println ("dog eat bone-------111");
	}
}

class Cat implements Animal {

	@Override
	public void eat() {
		System.out.println ("Cat eat aaa-------222");
	}
}

class Sheep implements Animal {
	@Override
	public void eat() {
		System.out.println ("Sheep eat grass-------3333");
	}
}

public class TestPolymorphism {

	public static Animal getInstance(int key) {
		Animal animal = null;
		switch (key) {
			case 0:
				animal = new Dog ();
				break;
			case 1:
				animal = new Cat ();
				break;
			default:
				animal = new Sheep ();
				break;
		}
		return animal;
	}

	public static void main(String[] args) {
		Animal animal = TestPolymorphism.getInstance (new Random ().nextInt (3));

		animal.eat ();
	}
}
