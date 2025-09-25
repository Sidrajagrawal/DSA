package slidingWindow;

import java.util.*;

public class Practice_Sliding_Window {
	public static void main(String args[]) {
		int[] arr = { 1,1,1,7,8,9 };
		int l = 0,k=3;
		int sum = 0,ans = 0;
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int r = 0; r<arr.length; r++) {
			//grow
			sum += arr[r];
			map.put(arr[r],map.getOrDefault(arr[r],0)+1);
			
			// Shrink
			if(r-l + 1 > k) {
				int removeVal = arr[l++];
				map.put(removeVal, map.get(removeVal)-1);
				if(map.get(removeVal) == 0) {
					map.remove(removeVal);
				}
				sum -= removeVal;
			}
				
			// Ans
			if(r-l+1 == k && map.size() == k) {
				ans = Math.max(ans, sum);
			}
		}
		System.out.println(ans);
	}
}
