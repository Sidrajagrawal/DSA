package myMap;

import java.util.*;

public class Group_Anagrams {
	class Solution {
		   public List<List<String>> groupAnagrams(String[] str) {
		        HashMap<String, List<String>> map = new HashMap<>();
		        
		        for (String word : str) {
		            String key = key(word);
		            map.putIfAbsent(key, new ArrayList<>());
		            map.get(key).add(word);
		        }
		        
		        return new ArrayList<>(map.values());
		    }
		    
		    public static String key(String s) {
		        int[] freq = new int[26];
		        for (int i = 0; i < s.length(); i++) {
		            freq[s.charAt(i) - 'a']++;
		        }
		        
		        StringBuilder key = new StringBuilder();
		        for (int f : freq) {
		            key.append("#").append(f);
		        }
		        return key.toString();
		    }
	}
}
