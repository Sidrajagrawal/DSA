package String;
import java.util.*;

public class IsomorphicStrings {
	public static void main(String args[]) {
		String s = "egg";
		String t ="add";  
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.get(ch) == null){
                map.put(ch,1);
            }else if(map.get(ch) != null){
                int val = map.get(ch);
            	map.put(ch,val+1);
            }
        }
        System.out.println("Original map: " + map);
        Map<Character,Integer> map2 = new HashMap<>();
		for(int i=0;i<t.length();i++) {
            char ch = t.charAt(i);
            if(map2.get(ch) == null){
                map2.put(ch,1);
            }else if(map2.get(ch) != null){
                int val = map2.get(ch);
            	map2.put(ch,val+1);
            }
		}
		for(int i=0;i<map.size();i++) {
	
		}
		System.out.println("Original map: " + map2);
	}
}
