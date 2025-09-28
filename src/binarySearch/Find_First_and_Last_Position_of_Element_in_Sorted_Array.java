package binarySearch;
import java.util.*;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {
	class Solution {
	    public int[] searchRange(int[] nums, int target) {
	        int[] indx = {-1, -1};
	        int start = search(nums, target, true);
	        int end = search(nums, target, false);
	        indx[0] = start;
	        indx[1] = end;
	        return indx;        
	    }    
	    static int search(int[] nums, int target, boolean StartIndx) {
	        int s = 0, e = nums.length - 1;
	        int ans = -1;
	        while (s <= e) {
	            int m = s + (e - s) / 2;
	            if (target < nums[m]) {
	                e = m - 1;
	            } else if (target > nums[m]) {
	                s = m + 1;
	            } else {
	                ans = m;
	                if (StartIndx) {
	                    e = m - 1;  
	                } else {
	                    s = m + 1;
	                }
	            }
	        }
	        return ans;
	    }
	}

}
