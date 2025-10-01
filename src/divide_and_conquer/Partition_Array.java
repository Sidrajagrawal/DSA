package divide_and_conquer;

import java.util.*;

public class Partition_Array {
	public static void main(String[] args) {
		int[] arr = {5,7,2,1,8,3,4};
		int idx = partition(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
		System.out.println(idx);
	}

	private static int partition(int[] arr, int si, int ei) {
		int item = arr[ei];
		int idx = si;
		for(int i=si; i<ei; i++) {
			if(arr[i] < item) {
				swap(arr,i,idx);
				idx++;
			}
		}
		swap(arr,ei,idx);
		return idx;
	}

	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
