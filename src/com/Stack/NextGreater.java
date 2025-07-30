package com.Stack;
import java.util.*;

public class NextGreater {
	public static void main(String[] args) {
		int[] arr = {3,1,2,4};
		Stack<Integer> stack = new Stack<>();
		int[] ng = new int[arr.length];
		for(int i=arr.length-1; i>=0; i--) {
			while(!stack.isEmpty() && arr[i] >= stack.peek()) {
				stack.pop();
			}
			ng[i] = stack.isEmpty() ? -1:stack.peek();
			stack.push(arr[i]);
		}
		System.out.println(Arrays.toString(ng));
	}
}
