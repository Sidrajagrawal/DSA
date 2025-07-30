package com.Stack;
import java.util.*;

public class PreviousSmaller {
	public static void main(String args[]) {
		int[] arr = {3,1,2,4};
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
