package Heap;
import java.util.*;

public class Minimum_Sum_Pair_CB {
	public static void main(String args[]) {
		int[] arr = {2,3,4,3,2};
		PriorityQueue<Integer> hp = new PriorityQueue<>();
		for(int i=0;i<arr.length;i++) {
			hp.add(arr[i]);
		}
		int sum=0;
		while(hp.size() > 1) {
			int a = hp.poll();
			int b = hp.poll();
			sum += a+b;
			hp.add(a+b);
		}
		System.out.print(sum);
	}
}
