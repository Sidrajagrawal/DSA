package slidingWindow;

import java.util.*;

public class Kartik_Bhaiya_And_Strings {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int k = sc.nextInt();
		int flipA = maxLen(s, k, 'a');
		int flipB = maxLen(s, k, 'b');
		System.out.println(Math.max(flipA, flipB));
	}

	private static int maxLen(String str, int k, char ch) {
		int si = 0, ei = 0, ans = 0, flip = 0;
		while (ei < str.length()) {
			// grow
			if (str.charAt(ei) != si) { 
				flip++;
			}
			// shrink
			while (flip > k) {
				if (str.charAt(si) == ch) {
					flip--;
				}
				si++;
			}
			// ans
			ans = Math.max(ans, (ei - si + 1));
			ei++;
		}
		return ans;
	}
}
