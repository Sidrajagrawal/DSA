package dynamic_programming;

import java.util.*;

public class Practice_dp {
	static int max = 0;
	public static void main(String args[]) {
		String s1 = "abc";
		String s2 = "def";
		List<String> ls1 = new ArrayList<>();
		List<String> ls2 = new ArrayList<>();
		sub(s1,"",ls1);
		sub(s2,"",ls2);
		if(ls1.size() < ls2.size()) {
			travel(ls1,ls2);
		}else {
			travel(ls2,ls1);
		}
		System.out.println(max);
	}

	private static void travel(List<String> minLs,List<String> maxLS) {
		// TODO Auto-generated method stub
		for(String s: minLs) {
			for(String s1: maxLS) {
				if(s.equals(s1)) {
					max = Math.max(max,s.length());
					break;
				}
			}
		}
	}

	private static void sub(String s, String ans,List<String> ls) {
		// TODO Auto-generated method stub
		if(s.isEmpty()) {
			if(!ans.equals("")) {
				ls.add(ans);	
			}
			return;
		}
		
		char ch = s.charAt(0);
		sub(s.substring(1),ans,ls);
		sub(s.substring(1),ans+ch,ls);
		
	}

}
