package recursion;
import java.util.*;

public class Combinations_Number {
	class Solution {
	    public List<List<Integer>> combine(int n, int k) {
	    	List<Integer> ll = new ArrayList<>();
	    	List<List<Integer>> ans = new ArrayList<>();
	    	int[] nums = new int[n];
	    	for(int i=1;i<=n;i++) {
	    		nums[i-1] = i;
	    	}
	    	solve(nums,ll,ans,k,0);
	    	return ans;
	    }

		private void solve(int[] nums, List<Integer> ll, List<List<Integer>> ans,int k,int start) {
			// TODO Auto-generated method stub
			if(ll.size() == k) {
				ans.add(new ArrayList<>(ll));
				return;
			}
			
			for(int i=start;i<nums.length;i++) {
				int val = nums[i];
				ll.add(val);
				
				int[] arr = new int[nums.length-1];
				int idx = 0;
				for(int j=0;j<nums.length;j++) {
					if(j!=i) {
						arr[idx++] = nums[j];
					}
				}
				
				solve(arr,ll,ans,k,i+1);
				ll.remove(ll.size()-1);
			}
			
			
		}
	}
}
