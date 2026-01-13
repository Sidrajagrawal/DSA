package bitmasking;

import java.util.*;

public class pos_set_unset {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int pos = sc.nextInt();
		int temp = n >> pos;
		method1(temp);
		method2(n, pos);
	}

	private static void method1(int temp) {
		if ((temp & 1) == 1) {
			System.out.println("Set");
		} else {
			System.out.println("Unset");
		}
	}

	private static void method2(int n, int pos) {
		int temp = 1 << pos;
		if ((n & temp) != 0) {
			System.out.println("Set");
		} else {
			System.out.println("Unset");
		}
	}
}
