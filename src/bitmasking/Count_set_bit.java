package bitmasking;

import java.util.*;

public class Count_set_bit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Method1(n));
		System.out.println(Method2(n)); // Remainder Method
		System.out.println(Method3(n)); // By n-1 approach
		
	}

	private static int Method3(int n) {
		int c =0;
		while(n>0) {
			c++;
			n = (n&(n-1));
		}
		return c;
	}

	private static int Method2(int n) {
		int c=0;
		while(n > 0) {
			if((n&1) != 0)c++;
			n=n>>1;
		}
		return c;
	}

	private static int Method1(int n) { 
		int c = 0;
		for (int i = 0; i < 32; i++) {
			int temp = 1 << i;
			if ((n & temp) != 0) {
				c++;
			}
		}
		return c;
	}

}
