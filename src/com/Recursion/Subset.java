package com.Recursion;

import java.util.*;

public class Subset {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		List<List<Integer>> list = new ArrayList<>();
		subset(arr,0,list,new ArrayList<Integer>());
		System.out.println(list);
	}
	
	static void subset(int[]arr,int i, List<List<Integer>> ans, ArrayList<Integer> current) {
		if(i==arr.length) {
			ans.add(new ArrayList<>(current));
			return ;
		}
		current.add(arr[i]);
		subset(arr,i+1,ans,current);
		current.remove(current.size()-1);
		subset(arr,i+1,ans,current);
	}
}
