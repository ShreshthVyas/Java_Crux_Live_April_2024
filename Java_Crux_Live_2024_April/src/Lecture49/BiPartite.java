package Lecture49;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BiPartite {
	public boolean isBipartite(int[][] graph) {
		Queue<bipair> q = new LinkedList<>();
		HashMap<Integer, Integer> visited = new  HashMap<>();
		
		for (int i = 0; i < graph.length; i++) { // equivalent to loop in map's keyset
			if(visited.containsKey(i)) { // disconnected case
				continue;
			}
			q.add(new bipair(i, 0));
			
			while(!q.isEmpty()) {
				bipair rv =  q.poll();
				if(visited.containsKey(rv.vtx)) { // contains cycle
					if(visited.get(rv.vtx) != rv.dist) { // odd length cycle
						return false; 
					}
					continue;
				}
				visited.put(rv.vtx, rv.dist);
				for (int nbr : graph[rv.vtx] ) { // equivalent to traversal on map of map
					if(!visited.containsKey(nbr)) {
						q.add(new bipair(nbr, rv.dist+1));
					}
				}
			}
		}
		
		return true;
	}
	
	public class bipair{
		int vtx;
		int dist;
		
		public bipair(int v, int d) {
			vtx =v;
			dist =d;
		}
		
	}
}
