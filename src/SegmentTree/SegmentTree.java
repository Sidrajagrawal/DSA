package SegmentTree;

import java.util.*;

public class SegmentTree {
	static int[] tree;
	
	static void build(int idx, int s, int e, int[] arr) {
		if(s == e) {
			tree[idx] = arr[s];
			return;	
		}
		int mid = (s+e)/2;
		build(2*idx+1, s, mid, arr);
		build(2*idx+2, mid+1, e, arr);
		tree[idx] = tree[2*idx+1] + tree[2*idx+2];
	}
	
	static int query(int idx, int s, int e, int l, int r) {
		if(e<l || s>r) return 0;
		if(s>=l && e<=r) return tree[idx];
		int mid = (s+e)/2;
		int left = query(2*idx+1, s, mid, l, r);
		int right = query(2*idx+2, mid+1 , e, l, r);
		return left+right;
	}
	
	static void PointUpdate(int idx, int s, int e, int i, int val) {
		if(s == e) {
			tree[idx] =val;
			return;
		}
		int mid = (s+e)/2;
		if(i<=mid)
			PointUpdate(2*idx+1, s, mid, i, val);
		else
			PointUpdate(2*idx+2, mid+1, e, i, val);
		
		tree[idx] = tree[2*idx+1] + tree[2*idx+2];
	}
	
	public static void main(String[] args) {
		int[] arr = {0,1,3,5,-2,3};
		int n = arr.length;
		tree = new int[4*n];
		build(0,0,n-1,arr);
		System.out.println(query(0,0,n-1,0,4));
		PointUpdate(1, 0, n - 1, 1, 100);
        System.out.println(query(0, 0, n - 1, 0, 4));
	}

}
