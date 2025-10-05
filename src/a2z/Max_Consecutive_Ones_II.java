package a2z;
import java.util.*;

public class Max_Consecutive_Ones_II {
	public static void main(String[] args) {
		int[] nums = {1,0,1,1,0,1};
		int i=0,max=0,temp=0;
		while(i<nums.length) {
			if(nums[i] == 1) {
				int j=i+1;
				int c=1;
				temp = i+1;
				while(j<nums.length && (c!=0 || nums[j] == 1)) {
					if(nums[j] == 0) {
						c--;
						temp = j+1;
					}
					j++;
				}
				max = Math.max(max, j-i);
				i = temp;
			}
			else i++;
		}
		System.out.println(max);
	}

}
