package divide_and_conquer;

import java.util.Arrays;

public class Merge_two_sorted_array {
	public static void main(String args[]) {
		int[] a = { 1, 5, 9, 10, 15, 20 };
		int[] b = { 2, 3, 8, 13 };
		
		int n = a.length, m = b.length;
		int[] arr = new int[n+m];
		int i=0,j=0,idx=0;
		
		while(i<n && j<m) {
			if(a[i] < b[j]) {
				arr[idx++] = a[i++];
			}else if(b[j] < a[i]) {
				arr[idx++] = b[j++];
			}else {
				arr[idx++] = a[i++];
				arr[idx++] = b[j++];
			}
		}
		while(i<n) {
			arr[idx++] = a[i++];
		}
		while(j<m) {
			arr[idx++] = b[j++];
		}
		System.out.println(Arrays.toString(arr));
	}
}
