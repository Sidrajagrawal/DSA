package math;

public class Minimum_Operations_to_Make_the_Integer_Zero {
	class Solution {
	    public int makeTheIntegerZero(int num1, int num2) {
	        for (int k = 1; k <= 60; k++) {
	            long x = 1L * num1 - 1L * num2 * k;
	            if (x < k) {
	                return -1;
	            }
	            if (k >= Long.bitCount(x)) {
	                return k;
	            }
	        }
	        return -1;
	    }
	}
}
