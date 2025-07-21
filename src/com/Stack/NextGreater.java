package com.Stack;
import java.util.*;

public class NextGreater {
	public static void main(String[] args) {
		int[] arr = {4,12,5,3,1,2,5,3,1,2,4,6};
		Stack<Integer> stack = new Stack<>();
		int[] ng = new int[arr.length];
		for(int i=arr.length-1; i>=0; i--) {
			if(stack.isEmpty()) {
				ng[i] = -1;
				stack.push(arr[i]);
			}
			else {
				if(arr[i] < stack.peek()) {
					ng[i] = stack.peek();
				}else if(arr[i] >= stack.peek()) {
					while(!stack.isEmpty() && arr[i] > stack.peek()) {
						stack.pop();
					}
					if(stack.isEmpty()) ng[i] = -1;
					else ng[i] = stack.peek();
				}
				stack.push(arr[i]);
			}
		}
		System.out.println(Arrays.toString(ng));
	}
}
