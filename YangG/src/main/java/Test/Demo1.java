package Test;

import java.util.Random;
import java.util.Scanner;

/**
 * Test
 *
 * @author jh
 * @date 2018/9/7 18:57
 * description:
 */
public class Demo1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=Integer.parseInt (sc.nextLine ());

		for (int i = 0; i < n; i++) {
			if(new Random ().nextInt (2)==1){
				System.out.println ("Yes");
			}else{
				System.out.println ("No");
			}

		}
	}

}
