package com.Recursion;
import java.util.*;

public class First_occurance_key {
	public static void main(String args[]) {
		int[] arr = {2,30,5,30,7,3};
		System.out.print(search(arr,0,3));
	}

	private static int search(int[] arr,int i, int key) {
		// TODO Auto-generated method stub
		if(i==arr.length) {
			return -1;
		}
		if(arr[i] == key) {
			return i;
		}
		return search(arr,i+1,key);
	}
}
