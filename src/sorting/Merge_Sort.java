package sorting;

import java.util.Arrays;

public class Merge_Sort {


	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		System.out.println(Arrays.toString(Sort(arr, 0, arr.length - 1)));
	}

	public static int[] Sort(int[] arr, int si, int ei) {

		if (si == ei) {
			int[] bs = new int[1];
			bs[0] = arr[si];
			return bs;
		}

		int mid = (si + ei) / 2;
		int[] fa = Sort(arr, si, mid);
		int[] sa = Sort(arr, mid + 1, ei);

		return Merge(fa, sa);
	}

	private static int[] Merge(int[] a, int[] b) {
		int n = a.length, m = b.length;
		int[] arr = new int[n + m];
		int i = 0, j = 0, idx = 0;

		while (i < n && j < m) {
			if (a[i] < b[j]) {
				arr[idx++] = a[i++];
			} else if (b[j] < a[i]) {
				arr[idx++] = b[j++];
			} else {
				arr[idx++] = a[i++];
				arr[idx++] = b[j++];
			}
		}
		while (i < n) {
			arr[idx++] = a[i++];
		}
		while (j < m) {
			arr[idx++] = b[j++];
		}
		return arr;
	}

}
