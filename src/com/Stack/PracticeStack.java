package com.Stack;
import java.util.*;
public class PracticeStack {
	static int[] nextSmaller(int[] arr) {
		int[] ns = new int[arr.length];
		Stack<Integer> stack = new Stack<>();
		for(int i=arr.length-1;i>=0;i--) {
			while(!stack.isEmpty() && arr[stack.peek()] > arr[i] ) {
				stack.pop();
			}
			ns[i] = stack.isEmpty() ? arr.length : stack.peek();
			stack.push(i);
		}
		return ns;
	}
	static int[] prevSmaller(int[] arr) {
		int[] ps = new int[arr.length];
		Stack<Integer> stack = new Stack<>();
		for(int i=0;i<arr.length;i++) {
			while(!stack.isEmpty() && arr[stack.peek()] >= arr[i] ) {
				stack.pop();
			}
			ps[i] = stack.isEmpty() ? arr.length : stack.peek();
			stack.push(i);
		}
		return ps;
	}
	static int LargestRectangle(int[] height) {
		int[] prevIndx = prevSmaller(height);
		int[] nextIndx = nextSmaller(height);
		int max = Integer.MIN_VALUE;
		for(int i=0;i<height.length;i++) {
			int left = i-prevIndx[i];
			int right = nextIndx[i] - i;
			int val = height[i]*(left+right-1);
			max = max < val ? val : max;
		}
		return max;
	}
	public static void main(String args[]) {
		int[][] matrix = {{1,0,1,0,0},{1,0,1,1,1},{1,1,1,1,1},{1,0,0,1,0}};
		for(int j=0;j<matrix[0].length;j++) {
			int sum = 0;
			for(int i=0;i<matrix.length;i++) {
				sum += matrix[i][j];
				matrix[i][j] = sum;
			}
		}
		int ans_max = Integer.MIN_VALUE;
		for(int i=0;i<matrix.length;i++) {
			int val = LargestRectangle(matrix[i]);
			ans_max = ans_max < val ? val : ans_max;
		}
		System.out.print(ans_max);
		
	}
}