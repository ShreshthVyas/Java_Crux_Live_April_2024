package Lecture51;

import java.util.HashMap;

public class DisjointSetUnion {
	class Node{ // Node  
		int val; // vtx
		Node parent;
		int rank;
	}
	
	private HashMap<Integer, Node> map = new HashMap<>();
	
	//O(1)
	public void createSet(int vtx) { // add vertice to set
		Node nn =  new Node();
		nn.val = vtx;
		nn.parent = nn;
		nn.rank = 0;
		map.put(vtx, nn);
	}
	
	public int Find(int v) { // Return Parent vtx
		Node nn  = map.get(v);//O(1)
		return find(nn).val;
	}
	
	//O(1)
	private Node find(Node nn) { // find parent node(CR)
		if(nn.parent == nn) {
			return nn;
		}
		Node n = find(nn.parent);
		nn.parent = n; // Path Compression
		return n;
	}
	
	public void Union(int v1, int v2) { // O(1)
		Node nn1 = map.get(v1);
		Node nn2 = map.get(v2);
		
		Node cr1 = find(nn1);
		Node cr2 = find(nn2);
		
		if(cr1.rank == cr2.rank) {
			cr1.parent = cr2; // cr2 becomes parent of cr1
			cr2.rank++; // hence rank of c2 is increased by one
		}
		else if(cr1.rank>cr2.rank) {
			cr2.parent = cr1;
		}
		else {
			cr1.parent = cr2;
		}
	}
	
	
}
