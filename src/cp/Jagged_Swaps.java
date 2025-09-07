package cp;

import java.util.*;

public class Jagged_Swaps {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = sc.nextInt();
			}

			int[] temp = Arrays.copyOfRange(arr, 1, n - 1);
			Arrays.sort(temp);
			boolean flag = true;
			if (arr[0] > temp[0]) {
			}
		}
	}
}
