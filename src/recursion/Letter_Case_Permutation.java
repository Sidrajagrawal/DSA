package recursion;
import java.util.*;

public class Letter_Case_Permutation {
	class Solution {
	    public List<String> letterCasePermutation(String s) {
	    	List<String> res = new ArrayList<>();
	    	permute(s,"",res);
	    	return res;
	    }

		private void permute(String s, String ans,List<String> res) {
			// TODO Auto-generated method stub
			if(s.isEmpty()) {
				res.add(ans);
				return;
			}
			
			char ch = s.charAt(0);
			if(Character.isAlphabetic(ch)) {
				
				String s1 = (ch+"").toLowerCase();
				permute(s.substring(1),ans+s1,res);

				String s2 = (ch+"").toUpperCase();
				permute(s.substring(1),ans+s2,res);
			}else {
				permute(s.substring(1),ans+ch,res);
			}
		}
	}
}
