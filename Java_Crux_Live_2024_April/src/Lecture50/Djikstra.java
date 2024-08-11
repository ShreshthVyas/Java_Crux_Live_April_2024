package Lecture50;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;


public class Djikstra {
	
	private HashMap<Integer, HashMap<Integer, Integer>> g;

	public Djikstra(int v) {
		g = new HashMap<>();

		for (int i = 1; i <= v; i++) {
			g.put(i, new HashMap<>());
		}
	}

	public void addEdge(int v1, int v2, int w) {
		g.get(v1).put(v2, w);
		g.get(v2).put(v1, w);
	}
	
	public class dpair{
		int vtx;
		String path;
		int cost;
		
		public dpair(int v1, String p, int c) {
			vtx = v1;
			path = p;
			cost = c;
		}	
		
		@Override
		public String toString() {
			return vtx + ":" + path + " @ " + cost;
		}
	}
	
	public void DjikstraAlgo(int src){
		PriorityQueue<dpair>  pq =  new PriorityQueue<>(new Comparator<dpair>() {
			@Override
			public int compare(dpair o1, dpair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}
		});
		HashSet<Integer>  visited = new HashSet<>();
		pq.add(new dpair(src, ""+ src, 0));
		while(!pq.isEmpty()) {
			dpair rv = pq.poll();// remove
			
			if(visited.contains(rv.vtx)) { // ignore if visted
				continue;
			}
			
			visited.add(rv.vtx);
			System.out.println(rv);
			
			for (int nbrs : g.get(rv.vtx).keySet()) {
				int c = g.get(rv.vtx).get(nbrs) + rv.cost; // Cost till now
				if(!visited.contains(nbrs)) {
					pq.add(new dpair(nbrs, rv.path +"=>" + nbrs, c));
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Djikstra g = new Djikstra(7);
		g.addEdge(1, 2, 100);
		g.addEdge(1, 3, 400);
		g.addEdge(3, 4, 300);
		g.addEdge(2, 4, 700);
		g.addEdge(2, 5, 800);
		g.addEdge(5, 6, 1000);
		g.addEdge(5, 7, 900);
		g.addEdge(6, 7, 200);
		
		g.DjikstraAlgo(1);
	}

}
