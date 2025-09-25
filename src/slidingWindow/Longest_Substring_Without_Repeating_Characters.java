package slidingWindow;

import java.util.*;

public class Longest_Substring_Without_Repeating_Characters {

	public static int lengthOfLongestSubstring(String s) {
		int si = 0, ei = 0, ans = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		while (ei < s.length()) {

			// grow
			char ch = s.charAt(ei);
			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			}

			// Shrink
			else {
				map.put(ch, map.get(ch) + 1);
				map.put(s.charAt(si), map.get(ch) - 1);
				if (map.get(s.charAt(si)) == 0)
					map.remove(s.charAt(si));
				si++;
			}
			// Ans
			if (unique(map)) {
				ans = Math.max(ans, (ei - si + 1));
			}
			ei++;
		}

	}

	private static boolean unique(HashMap<Character, Integer> map) {
		for (char key : map.keySet()) {
			if (map.get(key) > 1) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

	}

}
