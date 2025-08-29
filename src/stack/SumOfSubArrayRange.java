package stack;
import java.util.*;

public class SumOfSubArrayRange {
	
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
    
	static int[] nextLarger(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] nsrIndex = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                stack.pop();
            }
            nsrIndex[i] = stack.isEmpty() ? arr.length : stack.peek();
            stack.push(i);
        }
        return nsrIndex;
    }

    static int[] previousLarger(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] nslIndex = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            nslIndex[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        return nslIndex;
    }


	
	public static void main(String args[]) {
		int[] arr= {1,4,3,2};
		int[] nextSmaller = nextSmaller(arr);
		int[] previousSmaller = previousSmaller(arr);
		int[] nextLarger = nextLarger(arr);
		int[] previousLarger = previousLarger(arr);
		int mod = (int)1e9 + 7;
		int smallSum= 0,largeSum = 0;
		for(int i=0;i<arr.length; i++) {
			int left = i-previousSmaller[i];
			int right = nextSmaller[i] - i;
			smallSum = (smallSum + (arr[i] * left * right) % mod) % mod;
		}
		System.out.println(smallSum);
		for(int i=0;i<arr.length; i++) {
			int left = i-previousLarger[i];
			int right = nextLarger[i] - i;
			largeSum = (largeSum + (arr[i] * left * right) % mod) % mod;
		}
		System.out.println(largeSum);
	}
}
