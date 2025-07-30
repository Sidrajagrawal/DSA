package com.Stack;
import java.util.*;

public class MaximumRectangle {
	static int[] nextSmaller(int[]arr) {
		int[] ng = new int[arr.length];
		Stack<Integer> stack = new Stack<>();
		for(int i= arr.length-1;i>=0;i--) {
			while(!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
				stack.pop();
			}
			ng[i] = stack.isEmpty() ? arr.length : stack.peek();
			stack.push(i);
		}
		return ng;
	}
	
	static int[] prevSamller(int[] arr) {
		int[] ng = new int[arr.length];
		Stack<Integer> stack = new Stack<>();
		for(int i=0;i<arr.length;i++) {
			while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
				stack.pop();
			}
			ng[i] = stack.isEmpty() ? -1:stack.peek();
			stack.push(i);
		}
		return ng;
	}
	
	static int LargestRectangle(int[] height) {
		int[] prev = prevSamller(height);
		int[] next = nextSmaller(height);
		int max = Integer.MIN_VALUE;
		for(int i=0;i<height.length;i++) {
			int left = i-prev[i];
			int right = next[i] - i;
			max = max < height[i]*(left+right-1) ? height[i]*(left+right-1) : max;
		}
		return max;
		
	}
	
	public static void main(String args[]) {
		int[][] mat = {
				{1,0,1,0,1},
				{1,0,1,1,1},
				{1,1,1,1,1},
				{1,0,0,1,0}
		};
		for(int j=0;j<mat[0].length;j++) {
			int sum = 0;
			for(int i=0;i<mat.length;i++) {
				if(mat[i][j] != 0) {
					sum += mat[i][j];
					mat[i][j] = sum;
				}
			}
		}
		
		int ansMax = Integer.MIN_VALUE;
		for(int i=0;i<mat.length;i++) {
			int val = LargestRectangle(mat[i]);
			ansMax = ansMax < val ? val : ansMax;
		}
		System.out.print(ansMax);
	}
}
