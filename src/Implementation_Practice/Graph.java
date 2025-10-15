package Implementation_Practice;
import java.util.*;

public class Graph {
	HashMap<Integer, HashMap<Integer,Integer>> map;
	Graph(int v){
		map = new HashMap<>();
		for(int i=1; i<=v; i++) {
			map.put(i, new HashMap<>());
		}
	}
	
	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2,cost);
		map.get(v2).put(v1, cost);
	}
	
	public boolean hasEdge(int v1, int v2) {
		if(map.containsKey(v1) && map.get(v1).containsKey(v2))
			return true;
		return false;
	}
	
	public boolean hasVertex(int v) {
		return map.containsKey(v);
	}
	
	public int noOfEdges() {
		int sum=0;
		for(int vrtx: map.keySet()) {
			sum += map.get(vrtx).size();
		}
		return sum/2;
	}
	
	public int noOfvrtx() {
		return map.size();
	}
	
	public void removeEdge(int v1, int v2) {
		map.get(v1).remove(v2);
		map.get(v2).remove(v1);
	}
	
	public void removeVertex(int v1) {
		for(int nbrs: map.get(v1).keySet()) {
			map.get(nbrs).remove(v1);
		}
		map.remove(v1);
	}
	
	//Display
	public void Display() {
		for(int vrtx: map.keySet()) {
			System.out.println(vrtx+" "+map.get(vrtx));
		}
	}
	
	//Has Path
	public boolean hasPath(int src, int des) {
		HashSet<Integer> visited = new HashSet<>();
		return hasPath(src, des, visited);
	}

	private boolean hasPath(int src, int des, HashSet<Integer> visited) {
		if(src == des) return true;
		
		visited.add(src);
		for(int nbrs: map.get(src).keySet()) {
			if(!visited.contains(nbrs)) {
				boolean ans = hasPath(nbrs,des,visited);
				if(ans) return ans;
			}
		}
		
		return false;
	}
	
	public void printPath(int src, int des) {
		HashSet<Integer> visited = new HashSet<>();
		printPath(src, des, visited,""+src);
	}

	private void printPath(int src, int des, HashSet<Integer> visited, String ans) {
		if(src == des) {
			System.out.println(ans);
			return;
		}
		visited.add(src);
		for(int nbrs: map.get(src).keySet()) {
			if(!visited.contains(nbrs)) {
				printPath(nbrs,des,visited,ans+nbrs);
			}
		}
		visited.remove(src);
	}
	
}
