package bitmasking;

import java.util.*;

public class Odd_Even {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 3, 5, 10, 111, 101, 115, 112 };
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] & 1) == 0) {
				System.out.println(arr[i]+" Even");
			} else {
				System.out.println(arr[i]+" Odd");
			}
		}
	}

}
