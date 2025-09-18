package a2z;
import java.util.*;

public class Minimum_Jumps {
	public static int minJumps(int[] arr) {
		// code here
		int c = 0, i = 0;
		while (i < arr.length-1) {
			int max = Integer.MIN_VALUE;
			for (int j = 1; j <= arr[i]; j++) {
				if(i+j > arr.length){
                    break;
                }else if (arr[i + j] > max) {
					max = i+j;
				}
			}
			i += max;
			c++;
		}
		
		return c;
	}
	public static void main(String args[]) {
		int[] arr = {9, 10, 1, 2, 3, 4, 8, 0, 0, 0, 0, 0, 0, 0, 1};
		System.out.println(minJumps(arr));
	}
}
