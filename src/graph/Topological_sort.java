package graph;

import java.util.*;

public class Topological_sort {

	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public Topological_sort(int v) {
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2) {
		map.get(v1).put(v2, 0);
	}

	public void TopologicalSort() {
		Queue<Integer> q = new LinkedList<>();
		int[] ind = indegree();
		for (int i = 1; i < ind.length; i++) {
			if (ind[i] == 0) {
				q.add(i);
			}
		}

		while (!q.isEmpty()) {
			// remove
			int rv = q.poll();
			// work
			System.out.print(rv+" ");
			// nbrs
			for (int nbrs : map.get(rv).keySet()) {
				ind[nbrs]--;
				if (ind[nbrs] == 0)
					q.add(nbrs);
			}
//
		}
	}
	
	public boolean icCylce() {
		Queue<Integer> q = new LinkedList<Integer>();
		int[] ind = indegree();
		for(int i=1; i<ind.length; i++) {
			if(ind[i] == 0) q.add(i);
		}
		int c=0;
		while(!q.isEmpty()) {
			//remove
			int rv = q.poll();
			//work
			c++;
			//nbrs
			for(int nbrs: map.get(rv).keySet()) {
				ind[nbrs]--;
				if(ind[nbrs] == 0) q.add(nbrs);
			}
		}
		return c != map.size();
	}

	public int[] indegree() {
		int[] arr = new int[map.size() + 1];
		for (int vrtx : map.keySet()) {
			for (int nbrs : map.get(vrtx).keySet()) {
				arr[nbrs]++;
			}
		}

		return arr;
	}

	public static void main(String[] args) {
		Topological_sort ts = new Topological_sort(7);
		ts.AddEdge(1, 2);
		ts.AddEdge(1, 4);
		ts.AddEdge(4, 3);
		ts.AddEdge(3, 2);
		ts.AddEdge(4, 5);
		ts.AddEdge(5, 6);
		ts.AddEdge(7, 3);
		ts.AddEdge(7, 6);
		ts.TopologicalSort();
		System.out.println(ts.icCylce());

	}
}
