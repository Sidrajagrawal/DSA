package stack;
import java.util.*;

public class StockSpan {
	public static void main(String args[]) {
		int[] num = {100,80,60,70,60,75,85};
		int[] prevIndx = prevGreater(num);
		int[] ans = new int[num.length];
		for(int i=0;i<num.length;i++) {
			ans[i] = i-(prevIndx[i]);
		}
		System.out.println(Arrays.toString(ans));
	}

	private static int[] prevGreater(int[] num) {
		Stack<Integer> stack = new Stack<>();
		int[] pg = new int[num.length];
		for(int i=0;i<num.length;i++) {
			while(!stack.isEmpty() && num[stack.peek()] < num[i]) {
				stack.pop();
			}
			pg[i] = stack.isEmpty() ? -1 : stack.peek();
			stack.push(i);
		}
		return pg;
	}
}
