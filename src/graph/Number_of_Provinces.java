package graph;
import java.util.*;

public class Number_of_Provinces {
	class Solution {
	    public int findCircleNum(int[][] isConnected) {
	        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
	        for(int i=1; i<=isConnected.length; i++){
	            map.put(i,new ArrayList<>());
	        }
	        for(int i=0; i<isConnected.length; i++){
	            for(int j=0; j<isConnected.length; j++){
	                if(i==j) continue;
	                else if(isConnected[i][j] == 1){
	                    map.get(i+1).add(j+1);
	                }
	            }
	        }
	        Queue<Integer> q = new LinkedList<>();
	        HashSet<Integer> visited = new HashSet<>();
	        int c=0;
	        for(int vrtx: map.keySet()){
	            if(visited.contains(vrtx)) continue;
	            q.add(vrtx);
	            c++;
	            while(!q.isEmpty()){
	                //Remove
	                int rv = q.poll();
	                //Ignore
	                if(visited.contains(rv)) continue;
	                //Marked as visited
	                visited.add(rv);
	                //SelfWork
	                //Add unvisited nbrs
	                for(int nbrs: map.get(rv)){
	                    if(!visited.contains(nbrs)) q.add(nbrs);
	                }
	            }
	        }
	        return c;
	    }
	}
}
