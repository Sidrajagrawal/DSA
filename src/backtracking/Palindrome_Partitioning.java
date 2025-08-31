package backtracking;
import java.util.*;

public class Palindrome_Partitioning {
	class Solution {
	    public List<List<String>> partition(String s) {
	    	List<String> ll = new ArrayList<>();
	    	List<List<String>> res = new ArrayList<>();
	    	Partitioning(s,ll,res);
	    	return res;
	    }

		private void Partitioning(String ques,List<String> ll,List<List<String>> res ) {
			// TODO Auto-generated method stub
			if(ques.isEmpty()) {
				res.add(new ArrayList<>(ll));
				return;
			}
			
			for(int i =1; i<ques.length();i++) {
				String s = ques.substring(0,i);
				if(isPallindrome(s)) {
					ll.add(s);
					Partitioning(ques.substring(i),ll,res);
					ll.remove(ll.size()-1);
				}
			}
			
		}

		private boolean isPallindrome(String s) {
			// TODO Auto-generated method stub
			int l=0,r=s.length()-1;
			while(l<r) {
				if(s.charAt(l)!=s.charAt(r)) return false;
				l++;
				r--;
			}
			return true;
		}
	}
}
