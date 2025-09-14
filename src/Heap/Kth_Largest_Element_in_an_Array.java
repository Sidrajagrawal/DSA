package Heap;
import java.util.*;

public class Kth_Largest_Element_in_an_Array {
	class Solution {
	    public int findKthLargest(int[] nums, int k) {
	    	PriorityQueue<Integer> pq = new PriorityQueue<>();
	    	for(int i=0;i<k;i++) {
	    		pq.add(nums[i]);
	    	}
	    	for(int i=k;i<nums.length;i++) {
	    		if(nums[i] > pq.peek()) {
	    			pq.poll();
	    			pq.add(nums[i]);
	    		}
	    	}
	    	return pq.peek();
	    }
	}
}