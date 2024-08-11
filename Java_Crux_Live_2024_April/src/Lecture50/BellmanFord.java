package Lecture50;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BellmanFord {
	
	private HashMap<Integer, HashMap<Integer, Integer>> g;

	public BellmanFord(int v) {
		g = new HashMap<>();

		for (int i = 1; i <= v; i++) {
			g.put(i, new HashMap<>());
		}
	}

	public void addEdge(int v1, int v2, int w) {
		g.get(v1).put(v2, w);
	}
	
	public class edgepair{
		int v1;
		int v2;
		int cost;
		
		public edgepair(int v1,int v2, int c) {
			this.v1 = v1;
			this.v2 = v2;
			this.cost = c;
		}
	}
	
	public List<edgepair>  getallEdge(){ // Edge table
		List<edgepair> list = new ArrayList<>();
		
		for (int v1  : g.keySet()) {
			for (int v2 : g.get(v1).keySet()) {
				int c = g.get(v1).get(v2);
				list.add(new edgepair(v1, v2, c));
			}
		}
		
		return list;
	}
	
	public void bellmanford() {
		int v = g.size();
		int ans[] = new int[v+1];
		List<edgepair> list = getallEdge();
		for (int i = 2; i < ans.length; i++) {
			ans[i] = 9999999; // infinity Note: Avoid MAX VAL to prevent iteger overflow
		}
		
		for (int i = 1; i <= v; i++) { // To relax edges v-1 times	
			for (edgepair e : list) { // to get each edge one by one
				
				if(i == v && ans[e.v2] > ans[e.v1] + e.cost) { // vth itheration
					System.out.println("-v3 Cycle"); // -negetive Cycle
					return;
				}
				if(ans[e.v2] > ans[e.v1] + e.cost) { // edge relaxation
					ans[e.v2] = ans[e.v1] + e.cost; // update value
				}
			}
		}
		
		for (int i = 1; i < ans.length; i++) {
			System.out.println( i + " : " + ans[i]);
		}	
	}
	
	public static void main(String[] args) {
		BellmanFord g =  new BellmanFord(4);
//		g.addEdge(1, 2, 8);
//		g.addEdge(1, 3, 3);
//		g.addEdge(3, 4, -3);
//		g.addEdge(1, 4, 5);
//		g.addEdge(2, 5, 6);
//		g.addEdge(4, 5, 4);
		
		g.addEdge(1, 2, -1);
		g.addEdge(2, 3, 2);
		g.addEdge(3, 4, -3);
		g.addEdge(4, 1, -4);
		
		g.bellmanford();
		
	}
	
}
