package com.Stack;
import java.util.*;

public class PracticeStack {
	public static void main(String args[]) {
		int[] arr = {4,5,2,10,8};
		Stack<Integer> stack = new Stack<>();
		int[] nsr = new int[arr.length];
		
		for(int i=arr.length-1; i>=0; i-- ) {
			while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
				stack.pop();
			}
			nsr[i] = stack.isEmpty() ? -1 : stack.peek();
			stack.push(i);
		}
		System.out.println(Arrays.toString(nsr));
		
	}
}
