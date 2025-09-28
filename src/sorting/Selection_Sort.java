package sorting;

import java.util.Arrays;

public class Selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,3,-7,4,8,2};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void sort(int[] arr) {
		int n = arr.length;
		for(int i=0; i<n; i++) {
			int min = min(i+1,arr,i);
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
	private static int min(int s, int[] arr, int minPos) {
		
		for(int i=s; i<arr.length; i++) {
			if(arr[i] < arr[minPos] ) {
				minPos = i;
			}
		}
		return minPos;
	}
}
