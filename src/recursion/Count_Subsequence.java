package recursion;

public class Count_Subsequence {
	
	static int count=0;
	
	public static void main(String args[]) {
		String s = "abc";
		subI(s,"");
		System.out.println("Count using Static variable: "+count);
		System.out.println("Count using  Recursion: "+subII(s,""));
	}

	private static void subI(String s, String ans) {
		// TODO Auto-generated method stub
		if(s.isEmpty()) {
			count++;
			return;
		}
		char ch = s.charAt(0);
		subI(s.substring(1),ans);
		subI(s.substring(1),ans+ch);
	}
	private static int subII(String s, String ans) {
		// TODO Auto-generated method stub
		if(s.isEmpty()) {
			return 1;
		}
		char ch = s.charAt(0);
		int lc = subII(s.substring(1),ans);
		int rc = subII(s.substring(1),ans+ch);
		return lc+rc;
	}
}
