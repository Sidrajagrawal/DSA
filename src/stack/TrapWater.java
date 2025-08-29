package stack;
import java.util.*;

// sigma( min(leftMax,rightMax) - arr[i]);  

public class TrapWater {
	
	static int[] suffixMax(int[] arr) {
		int[] rightMax = new int[arr.length];
		int l = arr.length-1;
		rightMax[l] = arr[l];
		for(int i = l-1; i>= 0; i--) {
			if(arr[i] > rightMax[i+1]) {
				rightMax[i] = arr[i];
			}else {
				rightMax[i] = rightMax[i+1];
			}
		}
		
		return rightMax;
	}
	
	static int Method1(int[] arr) {
		int total = 0,leftMax = arr[0];
		int[] rightMax = suffixMax(arr);
		for(int i=0;i<arr.length;i++) {
			leftMax = arr[i] > leftMax ? arr[i] : leftMax;
			total += (Math.min(leftMax, rightMax[i])) - arr[i];
		}
		
		return total;
	}
	
	static int Method2(int[] arr) {
	    int l = 0, r = arr.length - 1;
	    int leftMax = 0, rightMax = 0, total = 0;

	    while (l < r) {
	        if (arr[l] <= arr[r]) {
	            if (arr[l] >= leftMax) {
	                leftMax = arr[l];
	            } else {
	                total += leftMax - arr[l];
	            }
	            l++;
	        } else {
	            if (arr[r] >= rightMax) {
	                rightMax = arr[r];
	            } else {
	                total += rightMax - arr[r];
	            }
	            r--;
	        }
	    }

	    return total;
	}

	
	public static void main(String args[]) {
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println("Total: "+Method1(height));
		System.out.println("Total: "+Method2(height));
	}
}
