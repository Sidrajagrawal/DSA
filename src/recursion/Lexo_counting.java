package recursion;

import java.util.*;

public class Lexo_counting {

	class Solution {
	    public List<Integer> lexicalOrder(int n) {
	        List<Integer> ans = new ArrayList<>();
	        for (int i = 1; i <= 9; i++) {  
	            order(n, i, ans);
	        }
	        return ans;
	    }

	    private void order(int n, int curr, List<Integer> ans) {
	        if (curr > n) return;

	        ans.add(curr);
	        for (int i = 0; i <= 9; i++) {
	            int next = curr * 10 + i;
	            if (next > n) return;  
	            order(n, next, ans);
	        }
	    }
	}


}
