package com.Recursion;

public class Print_Reverse_order {
	public static void main(String args[]) {
		int n = 5;
		PD(n);
	}

	private static void PD(int n) {
		// TODO Auto-generated method stub
		if(n == 0) {
			return;
		}
		System.out.println(n);
		PD(n-1);
	}
	
}
