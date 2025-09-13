package myMap;
import java.util.*;

public class Find_Most_Frequent_Vowel_and_Consonant {
	class Solution {
	    public int maxFreqSum(String s) {
	        HashMap<Character,Integer> map = new HashMap<>();
	        for(int i=0;i<s.length();i++){
	            char ch = s.charAt(i);
	            if(!map.containsKey(ch)){
	                map.put(ch,1);
	            }else{
	                int val = map.get(ch);
	                map.put(ch,val+1);
	            }
	        }
	        int vmax=0,cmax=0;
	        for(char key: map.keySet()){
	            if(key == 'a' || key == 'e' || key == 'i'|| key == 'o'|| key == 'u'){
	                vmax = Math.max(vmax,map.get(key));
	            }else{
	                cmax = Math.max(cmax,map.get(key));    
	            }
	        }
	        return vmax+cmax;
	    }
	}
}
