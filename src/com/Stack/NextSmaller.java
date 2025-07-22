package com.Stack;
import java.util.*;

public class NextSmaller {
	public static void main(String args[]) {
		int[] arr = {5,7,9,6,7,5,4,1,3,7};
		int[] ng = new int[arr.length];
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0;i<arr.length; i++) {
			while(!stack.isEmpty() && arr[i] <= stack.peek()) {
				stack.pop();
			}
			ng[i] = stack.isEmpty() ? -1 : stack.peek();
			
			stack.push(arr[i]);
		}
		
		System.out.print(Arrays.toString(ng));
	}
}
