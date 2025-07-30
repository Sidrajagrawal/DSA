package com.Stack;
import java.util.*;

public class SumOfSubArrayMin {

    static int[] nextSmaller(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] nsrIndex = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            nsrIndex[i] = stack.isEmpty() ? arr.length : stack.peek();
            stack.push(i);
        }
        return nsrIndex;
    }

    static int[] previousSmaller(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] nslIndex = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            nslIndex[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        return nslIndex;
    }

    public static void main(String args[]) {
        int[] arr = {3, 1, 2, 4};

        int[] next = nextSmaller(arr);
        int[] prev = previousSmaller(arr);

        System.out.println("Next Smaller Index:   " + Arrays.toString(next));
        System.out.println("Previous Smaller Index: " + Arrays.toString(prev));

        long sum = 0;
        int mod = (int)1e9 + 7;

        for (int i = 0; i < arr.length; i++) {
            long left = i - prev[i];
            long right = next[i] - i;
            sum = (sum + (arr[i] * left * right) % mod) % mod;
        }

        System.out.println("Sum of Subarray Minimums = " + sum);
    }
}
