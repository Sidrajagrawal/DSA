package recursion;

import java.util.*;

public class Generate_Parentheses {
	class Solution {
		public List<String> generateParenthesis(int n) {
			List<String> ans = new ArrayList<>();
			generate(n, 0, 0, ans, "");
			return ans;
		}

		private void generate(int n, int open, int close, List<String> res, String ans) {
			// TODO Auto-generated method stub
			if (open == n && close == n) {
				res.add(ans);
			}
			if (close > open || open > n) {
				return;
			}
			generate(n, open + 1, close, res, ans + "(");
			generate(n, open, close + 1, res, ans + ")");

		}
	}
}
