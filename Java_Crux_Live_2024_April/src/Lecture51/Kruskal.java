package Lecture51;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import Lecture50.BellmanFord.edgepair;

public class Kruskal {
	
	private HashMap<Integer, HashMap<Integer, Integer>> g;

	public Kruskal(int v) {
		g = new HashMap<>();

		for (int i = 1; i <= v; i++) {
			g.put(i, new HashMap<>());
		}
	}

	public void addEdge(int v1, int v2, int w) {
		g.get(v1).put(v2, w);
		g.get(v2).put(v1, w);
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
		@Override
		public String toString() {
			return v1 + " " + v2 + " @ " + cost;
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
	
	public int KruskalAlgo() {
		List<edgepair> list = getallEdge();
		Collections.sort(list , new Comparator<edgepair>() {

			@Override
			public int compare(edgepair o1, edgepair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}
			
		});
		
		int sum =0;
		DisjointSetUnion dsu = new DisjointSetUnion();
		for (int v : g.keySet()) {// add all vertex to map in dsu (vtx -> Node)
			dsu.createSet(v);
		}
		
		for (edgepair e : list) {
			int cr1 = dsu.Find(e.v1);
			int cr2 = dsu.Find(e.v2);
			
			if(cr1 == cr2) {
				// same set
			}
			else {
				dsu.Union(e.v1, e.v2); // Union of both vertices
				sum+= e.cost; // add cost for MST
				System.out.println(e);
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Kruskal g =  new Kruskal(7);
		g.addEdge(1, 2, 100);
		g.addEdge(1, 3, 400);
		g.addEdge(3, 4, 300);
		g.addEdge(2, 4, 700);
		g.addEdge(2, 5, 800);
		g.addEdge(5, 6, 1000);
		g.addEdge(5, 7, 900);
		g.addEdge(6, 7, 200);
		
		System.out.println(g.KruskalAlgo());
	}
	
}
