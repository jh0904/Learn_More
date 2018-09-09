package Test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Test
 *
 * @author jh
 * @date 2018/9/7 20:04
 * description:根据坐标实现范围，
 */
class Position {
	int x;
	int y;

	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Demo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt ();
		int y = sc.nextInt ();
		Position person = new Position (x, y);
		System.out.println ("yes,0");
		int[] arr = new int[8];

		for (int i = 0; i < 8; i++) {
			arr[i] = sc.nextInt ();
		}

		boolean b = testPosition (person, arr);
	}

	private static boolean testPosition(Position person, int[] arr) {
		ArrayList<Position> list = new ArrayList<> ();
		for (int i = 0; i < arr.length; i = i + 2) {
			list.add (new Position (i, i + 1));
		}
		int minX = list.get (1).x;
		int maxX = list.get (0).x;
		int minY = list.get (0).x;
		int maxY = list.get (0).x;
		for (int i = 1; i < list.size (); i++) {
			minX = Math.min (minX, list.get (i).x);
			maxX = Math.max (maxX, list.get (i).x);
			minY = Math.min (minY, list.get (i).y);
			maxY = Math.max (maxY, list.get (i).y);
		}
		return true ;
	}
}
