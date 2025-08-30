package backtracking;

public class Partition_String {
	public static void main(String args[]) {
		String ques = "nitin";
		partition(ques,"");
	}

	private static void partition(String ques, String ans) {
		// TODO Auto-generated method stub
		if(ques.isEmpty()) {
			System.out.println(ans);
			return;
		}
		for(int i=1;i<=ques.length();i++) {
			String s = ques.substring(0,i);
			partition(ques.substring(i),ans+s+"|");
		}
	}
}
