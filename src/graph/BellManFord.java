package graph;

import java.util.*;

public class BellManFord {
	private HashMap<Integer, HashMap<Integer, Integer>> map;
	public BellManFord(int v) {
		map = new HashMap<>();
		for(int i = 1; i<=v; i++) {
			map.put(i, new HashMap<>());
		}
	}
	
	public void addEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
	}
	
	class EdgePair{
		int e1;
		int e2;
		int cost;
		public EdgePair(int e1, int e2, int cost) {
			this.e1 = e1;
			this.e2 = e2;
			this.cost = cost;
		}
	}
	public List<EdgePair> getAllEdge(){
		List<EdgePair> ll = new ArrayList<>();
		for(int e1 : map.keySet()) {
			for(int e2 : map.get(e1).keySet()) {
				int cost = map.get(e1).get(e2);
				ll.add(new EdgePair(e1, e2, cost));
			}
		}
		return ll;
	}
	public void BellManFord_algo() {
		int v = map.size();
		int[] dp = new int[v+1];
		// src = 1
		for(int i = 2; i<dp.length; i++) {
			dp[i] = 9999999;
			
		}
		List<EdgePair> ll = getAllEdge();
		for(int i = 1; i<=v; i++) {
			for(EdgePair e : ll) {
				if(i == v && dp[e.e2] > dp[e.e1] + e.cost) {
					System.out.println("-ve weight ka cycle");
					return;
				}
				if(dp[e.e2] > dp[e.e1] + e.cost) {
					dp[e.e2] = dp[e.e1] + e.cost;
				}
			}
		}//
		for(int i = 1; i<dp.length; i++) {
			System.out.print(dp[i] + " ");
		}
	}
	public static void main(String[] args) {
		BellManFord g = new BellManFord(7);			
		g.addEdge(1, 4, 7);				
		g.addEdge(1, 2, 4);	
		g.addEdge(2, 3, 1);	
		g.addEdge(3, 4, 1);	
		g.addEdge(4, 5, 5);	
		g.addEdge(5, 6, 5);	
		g.addEdge(5, 7, 3);	
		g.addEdge(6, 7, 1);
		g.BellManFord_algo();
	}
}