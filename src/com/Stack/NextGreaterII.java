package com.Stack;
import java.util.*;

public class NextGreaterII {
    public static void main(String args[]) {
        int[] arr = {2, 10, 12, 1, 11};
        int n = arr.length;
        int[] ng = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i % n] >= stack.peek()) {
                stack.pop();
            }

            if (i < n) {
                ng[i] = stack.isEmpty() ? -1 : stack.peek();
            }

            stack.push(arr[i % n]);
        }

        System.out.println(Arrays.toString(ng));
    }
}
