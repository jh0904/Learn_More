package jvm.test;

/**
 * jvm.test
 *
 * @author jh
 * @date 2018/8/27 14:18
 * description:JVM的内存区域，以及各自的线程安全性。以及基本的GC算法，以及优化的简单分析。
 */
public class Demo2 {
	public static void main(String[] args) {
		long maxMemory = Runtime.getRuntime ().maxMemory ();//返回 Java 虚拟机试图使用的最大内存量。
		long totalMemory = Runtime.getRuntime ().totalMemory ();//返回 Java 虚拟机中的内存总量。
		System.out.println ("MAX_MEMORY = " + maxMemory + "（字节）、" + (maxMemory / (double) 1024 / 1024) + "MB");
		System.out.println ("TOTAL_MEMORY = " + totalMemory + "（字节）、" + (totalMemory / (double) 1024 / 1024) + "MB");
	}

}
