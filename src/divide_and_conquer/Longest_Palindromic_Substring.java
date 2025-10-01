package divide_and_conquer;

import java.util.*;

public class Longest_Palindromic_Substring {
	class Solution {
		public String longestPalindrome(String s) {
			return findLongestPalindrome(s);
		}

		private String findLongestPalindrome(String s) {
			String res = "";

			for (int axis = 0; axis < s.length(); axis++) {
				String odd = "";
				for (int orbit = 0; axis - orbit >= 0 && axis + orbit < s.length(); orbit++) {
					if (s.charAt(axis - orbit) != s.charAt(axis + orbit))
						break;
					odd = s.substring(axis - orbit, axis + orbit + 1);
				}
				res = odd.length() > res.length() ? odd : res;
			}

			for (double axis = 0.5; axis < s.length(); axis++) {
				String even = "";
				for (double orbit = 0.5; axis - orbit >= 0 && axis + orbit < s.length(); orbit++) {
					if (s.charAt((int) (axis - orbit)) != s.charAt((int) (axis + orbit)))
						break;
					even = s.substring((int) (axis - orbit), (int) (axis + orbit + 1));
				}
				res = even.length() > res.length() ? even : res;
			}

			return res;
		}
	}

}
