package array;
import java.util.*;

public class Difference_Array_technique {
	public static void main(String[] args) {
		int n = 5;
		int[][] updates = {{1,3,2},{2,4,3},{0,2,-2}};
		int[] arr = new int[n];
		for(int i=0; i<updates.length; i++) {
			int s = updates[i][0];
			int e = updates[i][1]+1; 
			int val = updates[i][2];
			arr[s] += val;
			if(e<n) arr[e] -= val;
		}
		
		for(int i = 1; i<arr.length; i++) {
			arr[i] += arr[i-1];
		}
		System.out.println(Arrays.toString(arr));
	}

}
