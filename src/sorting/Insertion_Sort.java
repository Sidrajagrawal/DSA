package sorting;

import java.util.Arrays;

public class Insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,5,3,2,1};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void sort(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=1; i<arr.length; i++) {
			insertLastElement(arr,i);
		}
	}
	
	public static void insertLastElement(int[]arr , int i) {
		int item = arr[i];
		int j = i-1;
		while(j >=0 && arr[j] > item) {
			arr[j+1] = arr[j];
			j--;
		}
		arr[j+1] = item;
	}

}
