package com.Recursion;

public class Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		sub(s,"");
	}

	private static void sub(String s,String p) {
		// TODO Auto-generated method stub
		if(s.isEmpty()) {
			System.out.println(p);
			return;
		}
		char ch = s.charAt(0);
		sub(s.substring(1),p);
		sub(s.substring(1),p+ch);
	}

}
