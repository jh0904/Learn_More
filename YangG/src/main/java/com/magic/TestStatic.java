package com.magic;

/**
 * com.magic
 *
 * @author jh
 * @date 2018/9/6 18:20
 * description:
 */
class Father {
	public Father() {
		System.out.println ("111111");
	}
	{
		System.out.println ("222222");
	}
	static {
		System.out.println ("333333");
	}
}

class Son extends Father{
	public Son() {
		System.out.println ("444444");
	}
	{
		System.out.println ("555555");
	}
	static {
		System.out.println ("666666");
	}

}
public class TestStatic {


	public static void main(String[] args) {
		//从父到子，静态先行（从父类的class先开始，所以静态块先加载。），局部代码块，构造函数
		new Son ();
	}
}
