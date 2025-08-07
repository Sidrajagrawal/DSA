package com.Stack;
import java.util.*;

import com.Math;

public class AestroidCollisions {
	public static void main(String args[]) {
		int[] arr = {4,7,1,1,2,-3,-7,17,15,-16};
		int i=0;
		Stack<Integer> stack = new Stack<Integer>();
		while(i<arr.length) {
			if(arr[i] > 0) {
				stack.push(arr[i]);
				i++;
			}else {
				while(!stack.isEmpty() && Math.abs(arr[i]) > stack.peek()) {
					stack.pop();
				}
				if(!stack.isEmpty() && Math.abs(arr[i]) == stack.peek()) {
					stack.pop();
				}
				i++;
			}
		}
		while(!stack.isEmpty()) {
			System.out.print(stack.pop()+" ");
		}
	}
}
