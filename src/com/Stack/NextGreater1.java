package com.Stack;
import java.util.*;

public class NextGreater1 {
	public static void main(String args[]) {
		Map<Integer,Integer> map = new HashMap<>();
		Stack<Integer> stack = new Stack<>();
		int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
		for(int i=nums2.length-1;i>=0;i--) {
			int num = nums2[i];
			while(!stack.isEmpty() && num >= stack.peek()) {
				stack.pop();
			}
			map.put(num, stack.isEmpty() ? -1 : stack.peek());
			stack.push(num);
		}
		int[] result = new int[nums1.length];
		for(int i=0;i<nums1.length;i++) {
			result[i] = map.get(nums1[i]);
		}
		System.out.print(Arrays.toString(result));
	}
}
