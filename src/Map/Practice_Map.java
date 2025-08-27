package Map;
import java.util.*;

public class Practice_Map {
	class Solution {
	    public int longestConsecutive(int[] nums) {
	    	HashMap<Integer,Boolean> map = new HashMap<>();
	    	for(int i=0;i<nums.length;i++) {
	    		if(map.get(nums[i]-1)) {
	    			map.put(nums[i] , false);
	    		}else {
	    			map.put(nums[i] , false);	
	    		}if(map.get(nums[i] + 1)){
	    			map.put(nums[i]+1 , false);
	    		}
	    	}
	    	System.out.print(map);
	    	int ans = 0;
	    	for(int key: map.keySet()) {
	    		if(map.get(key)) {
	    			int count=0;
	    			while(map.containsKey(key)) {
	    				count++;
	    				key++;
	    			}
	    			ans = Math.max(ans, count);
	    		}
	    	}
	    	return ans;
	    }
	}
}
