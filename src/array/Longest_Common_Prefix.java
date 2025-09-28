package array;

public class Longest_Common_Prefix {
	public static void main(String args[]) {
		String[] strs = {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(strs));
	}

	 public static String longestCommonPrefix(String[] strs) {
	        if(strs == null || strs.length == 0) return "";
	        String ans = strs[0];
	        for(int i = 1; i<strs.length ; i++){
	            while(!strs[i].startsWith(ans)){
	            	System.out.println("Befor: "+ans);
	                ans = ans.substring(0,ans.length()-1);
	            	System.out.println("After: "+ans);
	                if(ans.length()==0) return "";
	            }
	        }
	        return ans;
	        
	    }
	
}
