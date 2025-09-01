package recursion;
import java.util.*;

public class Permutations_Number_II {
	class Solution {
	    public List<List<Integer>> permuteUnique(int[] nums) {
	    	List<Integer> ll = new ArrayList<>();
	    	List<List<Integer>> ans = new ArrayList<>();
	    	solve(nums,ll,ans);
	    	return ans;
	    }

		private void solve(int[] nums, List<Integer> ll, List<List<Integer>> ans) {
			// TODO Auto-generated method stub
			if(nums.length == 0) {
				ans.add(new ArrayList<>(ll));
				return;
			}
			
			for(int i=0;i<nums.length;i++) {
				int val = nums[i];
				boolean flag = true;
				for(int j=i+1;j<nums.length;j++) {
					if(nums[j] == val) {
						flag = false;
					}
				}
				
				if(flag) {
					ll.add(val);
					int[] arr = new int [nums.length-1];
					int idx = 0;
					for(int k=0;k<nums.length;k++) {
						if(k!=i) {	
							arr[idx++] = nums[k];
						}
					}
					solve(arr,ll,ans);
					ll.remove(ll.size()-1);
				}

			}
			
		}
	}
}
