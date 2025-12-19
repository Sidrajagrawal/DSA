package graph;

import java.util.*;

public class Graph {
	private HashMap<Integer, HashMap<Integer, Integer>> map;

	Graph(int v) {
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	public boolean ContainsEdge(int v1, int v2) {
		return map.get(v1).containsKey(v2);
	}

	public boolean ContainsVertex(int v1) {
		return map.containsKey(v1);
	}

	// Number of Edge
	public int noofEdge() {
		int sum = 0;
		for (int vtx : map.keySet()) {
			sum += map.get(vtx).size();
		}
		return sum / 2;
	}

	// Remove Edge
	public void removeEdge(int v1, int v2) {
		map.get(v1).remove(v2);
		map.get(v2).remove(v1);
	}

	// Remove Vertex
	public void removeVertex(int v1) {
		for (int nbrs : map.get(v1).keySet()) {
			map.get(nbrs).remove(v1);
		}
		map.remove(v1);
	}

	// Display
	public void Display() {
		for (int v : map.keySet()) {
			System.out.println(v + " " + map.get(v));
		}
	}
	
	// Check Path exists or not
	public boolean HasPath(int src,int des) {
		HashSet<Integer> visited = new HashSet<>();
		return HasPath(src,des,visited);
	}
	
	private boolean HasPath(int src, int des, HashSet<Integer> visited) {
		if (src == des) {
			return true;
		}
		visited.add(src);
		for (int nbrs : map.get(src).keySet()) {
			if (!visited.contains(nbrs)) {
				boolean ans = HasPath(nbrs, des, visited);
				if (ans) {
					return true;
				}
			}
		}
		return false;
	}

	// Print All Possible Path
	public void PrintPath(int src, int des) {
		HashSet<Integer> visited = new HashSet<>();
		PrintPath(src,des,visited,"");
	}
	private void PrintPath(int src, int des,HashSet<Integer> visited,String ans) {
		if(src == des) {
			System.out.println(ans+des);
			return;
		}
		visited.add(src);
		for(int nbrs: map.get(src).keySet()) {
			if(!visited.contains(nbrs)) {
				PrintPath(nbrs,des,visited,ans+src);
				
			}
		}
		visited.remove(src);
		
	}
	
	public HashMap<Integer,HashMap<Integer,Integer>> dataStructure(){
		return map;
	}//
	
	public static void main(String[] args) {

	}
}
