package cp;

import java.util.*;

public class Be_Positive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			int one = 0, zero = 0;
			for (int i = 0; i < n; i++) {
				if (arr[i] == 0)
					zero++;
				if (arr[i] == -1)
					one++;
			}

			int res = ((one % 2) * 2) + zero;
			System.out.println(res);
		}

	}

}
