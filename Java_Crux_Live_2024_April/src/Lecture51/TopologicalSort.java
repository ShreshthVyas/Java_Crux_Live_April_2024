package Lecture51;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSort {
	private HashMap<Integer, HashMap<Integer, Integer>> g;

	public TopologicalSort(int v) {
		g = new HashMap<>();

		for (int i = 0; i < v; i++) {
			g.put(i, new HashMap<>());
		}
	}

	public void addEdge(int v1, int v2, int w) {
		g.get(v1).put(v2, w);
	}
	
	public int[]  Indegree() {
		int in[] = new int[g.size()];
		for (int v1 : g.keySet()) {
			for (int v2 : g.get(v1).keySet()) {  
				in[v2]++; // Edge is directed toward v2
			}
		}
		return in;
	}
	
	public void TopoSort() {
		int in[] = Indegree();
		Queue<Integer>  q = new LinkedList<>();
		
		for (int i = 0; i < in.length; i++) {
			if(in[i] == 0) { // add only those vertices to queue who have 0 Indegree
				q.offer(i);
			}
		}
		 // BFS
		while(!q.isEmpty()) {
			int rv = q.poll();
			System.out.print(rv + " ");
			
			for (int nbrs : g.get(rv).keySet()) {
				in[nbrs]--; // remove edge
				if(in[nbrs] == 0) {
					q.add(nbrs);
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TopologicalSort g = new TopologicalSort(6);
		g.addEdge(4, 0, 0);
		g.addEdge(1, 0, 0);
		g.addEdge(2, 3, 0);
		g.addEdge(5, 4, 0);
		g.addEdge(5, 3, 0);
		g.addEdge(1, 2, 0);
		
		g.TopoSort();
	}

}
 