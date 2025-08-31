package backtracking;

public class Practice_backtracking {
	public static void main(String args[]) {
		String ques = "nitin";
		permutation(ques,"");
	}

	private static void permutation(String ques, String ans) {
		// TODO Auto-generated method stub
		if(ques.isEmpty()) {
			System.out.println(ans);
			return;
		}
		for(int i=1;i<=ques.length();i++) {
			String s = ques.substring(0,i);
			if(isPallindrom(s)) {
				permutation(ques.substring(i),ans+s+"|");
			}
		}
		
	}
	private static boolean isPallindrom(String s) {
		int l = 0,r=s.length()-1;
		while(l<=r) {
			if(s.charAt(l) != s.charAt(r)) return false;
			l++;
			r--;
		}
		return true;
	}
}
