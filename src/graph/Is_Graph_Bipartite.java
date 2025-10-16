package graph;
import java.util.*;

public class Is_Graph_Bipartite {
	class Solution {
	    public boolean isBipartite(int[][] graph) {
	    	Queue<BipartitePair> q = new LinkedList<>();
	    	HashMap<Integer, Integer> visited = new HashMap<>();
	    	for(int i=0; i<graph.length; i++) { //vtx
	    		if(visited.containsKey(i)) continue;
	    		q.add(new BipartitePair(i,0));
	    	}
	    	
	    	while(!q.isEmpty()) {
	    		//Remove
	    		BipartitePair rv = q.poll();
	    		//ignore
	    		if(visited.containsKey(rv.vtx)) {
	    			if(rv.dis != visited.get(rv.dis)) return true; 
	    		}
	    		
	    		//Marks as visited
	    		visited.put(rv.vtx,rv.dis);
	    		
	    		//self work
	    		
	    		//Add unvisited nbrs
	    		for(int nbrs : graph[rv.vtx]) {
	    			if(!visited.containsKey(nbrs)) {
	    				q.add(new BipartitePair(nbrs,rv.dis+1));
	    			}
	    		}
	    		
	    	}
	    	
	    }
	}
	
	class BipartitePair{
		int vtx;
		int dis;
		public BipartitePair(int vtx,int dis) {
			this.vtx = vtx;
			this.dis = dis;
		}
		
	}
	
	public static void main(String[] args) {
		

	}
}
