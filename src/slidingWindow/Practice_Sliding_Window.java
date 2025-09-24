package slidingWindow;

import java.util.*;

public class Practice_Sliding_Window {
	public static void main(String args[]) {
		int[] arr = { 10, 5, 2, 6 };
		int si = 0, ei = 0, p = 1, k = 100, ans = 0;
		while (ei < arr.length) {
			// Grow
			p = p * arr[ei];

			// Shrink
			while (p >= k && si <= ei) {
				p = p / arr[si];
				si++;
			}

			// ans
			ans = ans + (ei - si + 1);
			ei++;

		}
		System.out.println(ans);
	}
}
