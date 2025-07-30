package com.Stack;
import java.util.*;

public class LargestRectangle {
	static int[] nextSmaller(int[]arr) {
		int[] ng = new int[arr.length];
		Stack<Integer> stack = new Stack<Integer>();
		for(int i=arr.length-1; i>=0;i--) {
			while(!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
				stack.pop();
			}
			ng[i] = stack.isEmpty() ? arr.length : stack.peek();
			stack.push(i);
		}
		
		return ng;
	}
	
	static int[] previousSmaller (int[] arr) {
		int[] ng = new int[arr.length];
		Stack<Integer> stack = new Stack<>();
		for(int i=0;i<arr.length;i++) {
			while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
				stack.pop();
			}
			ng[i] = stack.isEmpty() ? -1: stack.peek();
			stack.push(i);
		}
		return ng;
	}
	
	public static void main(String args[]) {
		int[] height = {2,1,5,6,2,3};
		int[] next = nextSmaller(height);
		int[] prev = previousSmaller(height);
		System.out.println(Arrays.toString(prev));
		System.out.println(Arrays.toString(next));
		int max = Integer.MIN_VALUE;
		for(int i=0;i<height.length; i++) {
			int left = i-prev[i];
			int right = next[i] - i;
			max = max < height[i]*(left+right-1) ?height[i]*(left+right-1):max;
			
		}
		System.out.print(max);
	}
}
