package slidingWindow;

public class Find_All_Anagrams_String {
	class Solution {
	    public List<Integer> findAnagrams(String s, String p) {
	        List<Integer> lst = new ArrayList<>();
	        if (p.length() > s.length()) return lst;
	        int[] count1 = new int[26];
	        int[] count2 = new int[26];
	        for(char ch: p.toCharArray()){
	            count1[ch-'a']++;
	        }
	        int k = p.length();
	        for(int i=0; i<k; i++){
	            count2[s.charAt(i)-'a']++;
	        }
	        if(isMatch(count1,count2)) lst.add(0);

	        for(int i=k; i<s.length(); i++){
	            count2[s.charAt(i)-'a']++;
	            count2[s.charAt(i-k)-'a']--;
	            if(isMatch(count1,count2)) lst.add(i-k+1);
	        }
	        return lst;
	    }
	    public static boolean isMatch(int[] count1, int[] count2){
	        for(int i=0; i<26; i++){
	            if(count1[i] != count2[i]) return false;
	        }
	        return true;
	    }
	}
}
