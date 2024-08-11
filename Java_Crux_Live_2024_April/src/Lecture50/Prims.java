package Lecture50;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Prims {

	private HashMap<Integer, HashMap<Integer, Integer>> g;

	public Prims(int v) {
		g = new HashMap<>();

		for (int i = 1; i <= v; i++) {
			g.put(i, new HashMap<>());
		}
	}

	public void addEdge(int v1, int v2, int w) {
		g.get(v1).put(v2, w);
		g.get(v2).put(v1, w);
	}
	
	public class primspair{
		int vtx;
		int acqvtx;
		int cost;
		
		public primspair(int v1, int v2, int c) {
			vtx = v1;
			acqvtx = v2;
			cost = c;
		}	
		
		@Override
		public String toString() {
			return vtx + " => " + acqvtx + " @ " + cost;
		}
	}
	
	public int PrimsAlgo() {
		PriorityQueue<primspair>  pq =  new PriorityQueue<>(new Comparator<primspair>() {
			@Override
			public int compare(primspair o1, primspair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}
		});
		HashSet<Integer>  visited = new HashSet<>();
		int mst = 0;
		pq.add(new primspair(1, 1, 0));
		while(!pq.isEmpty()) {
			primspair rv = pq.poll();// remove
			
			if(visited.contains(rv.vtx)) { // ignore if visted
				continue;
			}
			
			visited.add(rv.vtx);
			mst+= rv.cost;
			System.out.println(rv);
			
			for (int nbrs : g.get(rv.vtx).keySet()) {
				int c = g.get(rv.vtx).get(nbrs);
				if(!visited.contains(nbrs)) {
					pq.add(new primspair(nbrs, rv.vtx, c));
				}
			}
		}
		
		return mst;
	}
	
	public static void main(String[] args) {
		Prims g = new Prims(7);
		g.addEdge(1, 2, 100);
		g.addEdge(1, 3, 400);
		g.addEdge(3, 4, 300);
		g.addEdge(2, 4, 700);
		g.addEdge(2, 5, 800);
		g.addEdge(5, 6, 1000);
		g.addEdge(5, 7, 900);
		g.addEdge(6, 7, 200);
		
		System.out.println(g.PrimsAlgo());;
	}
}
