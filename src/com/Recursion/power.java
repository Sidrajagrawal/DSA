package com.Recursion;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = 5;
		
		System.out.print(power(a,b));
	}

	private static int power(int a, int b) {
		// TODO Auto-generated method stub
		if(b == 1) {
			return a;
		}
		int res = a * power(a,b-1);
		return res;
	}

}
