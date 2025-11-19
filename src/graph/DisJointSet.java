package graph;

import java.util.*;

public class DisJointSet {
	class Node {
		int data;
		Node parent;
		int rank;
	}

	private HashMap<Integer, Node> map = new HashMap<>();

	public void CreateSet(int v) {
		Node nn = new Node();
		nn.data = v;
		nn.parent = nn;
		nn.rank = 0;
		map.put(v, nn);
	}
	
	public int find(int v) {
		Node nn = map.get(v);
		return find(nn).data;
	}
	private Node find(Node nn) {
		if(nn.parent == nn) return nn;
		return find(nn.parent);
	}
	
	
	public void union(int v1, int v2) {
		Node nn1 = map.get(v1);
		Node nn2 = map.get(v2);
		Node rn1 = find(nn1);
		Node rn2 = find(nn2);
		if(rn1.rank == rn2.rank) {
			rn1.parent = rn2;
			rn2.rank++;
		}else if(rn1.rank > rn2.rank) {
			rn2.parent = rn1;
		}else {
			rn1.parent = rn2;
		}
		
	}


}
