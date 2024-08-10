package Lecture49;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph2 {
	
	private HashMap<Integer, HashMap<Integer, Integer>> g;

	public Graph2(int v) {
		g = new HashMap<>();

		for (int i = 1; i <= v; i++) {
			g.put(i, new HashMap<>());
		}
	}
	
	public void addEdge(int v1, int v2, int w) {
		g.get(v1).put(v2, w);
		g.get(v2).put(v1, w);
	}
	
	public void BFT() {
		Queue<Integer>  q = new LinkedList<>();
		HashSet<Integer> visited =  new HashSet<>();
		
		for (int src : g.keySet()) {
			if(visited.contains(src)) { // if visited ignore
				continue;
			}
			q.add(src);
			while (!q.isEmpty()) {
				int rv = q.poll(); // remove

				if (visited.contains(rv)) { // if visited ignore
					continue;
				}

				visited.add(rv); // mark visited
				System.out.print(rv + " ");
				for (int nbr : g.get(rv).keySet()) {
					if (!visited.contains(nbr)) { // add nbr if not visited
						q.offer(nbr);
					}
				}

			}
			
		}
		System.out.println();
	}
	
	public void DFT() {
		Stack<Integer>  st = new Stack<>();
		HashSet<Integer> visited =  new HashSet<>();
		
		for (int src : g.keySet()) {
			st.push(src); // add src

			while (!st.isEmpty()) {
				int rv = st.pop(); // remove
				if (visited.contains(rv)) { // if visited
					continue;
				}

				visited.add(rv); // mark visited
				System.out.print(rv + " ");
				for (int nbr : g.get(rv).keySet()) {
					if (!visited.contains(nbr)) { // add nbr if not visited
						st.push(nbr);
					}
				}

			}
		}
		System.out.println();
	}
	
	public boolean isCyclic() {
		Queue<Integer>  q = new LinkedList<>();
		HashSet<Integer> visited =  new HashSet<>();
		
		for (int src : g.keySet()) {
			if(visited.contains(src)) { // if visited ignore
				continue;
			}
			q.add(src);
			while (!q.isEmpty()) {
				int rv = q.poll(); // remove
				if (visited.contains(rv)) { // if visited again cycle present
					return true;
				}
				visited.add(rv); // mark visited
				for (int nbr : g.get(rv).keySet()) {
					if (!visited.contains(nbr)) { // add nbr if not visited
						q.offer(nbr);
					}
				}

			}	
		}
		
		return false;
	}
	
	public boolean isConnected() {
		Queue<Integer>  q = new LinkedList<>();
		HashSet<Integer> visited =  new HashSet<>();
		int count =0;
		for (int src : g.keySet()) {
			if(visited.contains(src)) { // if visited ignore
				continue;
			}
			count++;
			q.add(src);
			while (!q.isEmpty()) {
				int rv = q.poll(); // remove
				if (visited.contains(rv)) { // if visited again cycle present
					continue;
				}
				visited.add(rv); // mark visited
				for (int nbr : g.get(rv).keySet()) {
					if (!visited.contains(nbr)) { // add nbr if not visited
						q.offer(nbr);
					}
				}

			}	
		}
		System.out.println(count);
		return count ==1;
	}
	
	public boolean isTree() {
//		return isConnected() && isCyclic();
		
		Queue<Integer>  q = new LinkedList<>();
		HashSet<Integer> visited =  new HashSet<>();
		int count =0;
		for (int src : g.keySet()) {
			if(visited.contains(src)) { // if visited ignore
				continue;
			}
			count++;
			q.add(src);
			while (!q.isEmpty()) {
				int rv = q.poll(); // remove
				if (visited.contains(rv)) { // if visited again cycle present
					return false;
				}
				visited.add(rv); // mark visited
				for (int nbr : g.get(rv).keySet()) {
					if (!visited.contains(nbr)) { // add nbr if not visited
						q.offer(nbr);
					}
				}

			}	
		}
		return count ==1;
	}
	
	public static void main(String[] args) {
		Graph2 g = new Graph2(7);
		g.addEdge(1, 2, 100);
		g.addEdge(1, 3, 400);
		g.addEdge(3, 4, 300);
		g.addEdge(2, 4, 700);
//		g.addEdge(2, 5, 800);
//		g.addEdge(5, 6, 1000);
//		g.addEdge(5, 7, 900);
		g.addEdge(6, 7, 200);
		
//		g.BFT();
//		g.DFT();
		
//		System.out.println(g.isCyclic());
		
		System.out.println(g.isConnected());
	}
}
