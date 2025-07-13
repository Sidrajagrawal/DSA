package com.LinkedList;
import com.LinkedList.LinkedList.Node;
import java.util.*;


public class Practice {
	
	public static void main(String args[]) {
		int[] arr = {1,2,3};
		int l =(int) Math.pow(2, arr.length);
		
		List<List<Integer>> ans = new ArrayList<>();
		
		for(int num=0;num<l-1;num++) {
			List<Integer> list = new ArrayList<>();
			for(int i=0; i<arr.length; i++) {
				if( (num&(1<<i)) != 0 ) {
					list.add(arr[i]);
				}
			}
			ans.add(list);
		}
		System.out.print(ans);
	}
}
