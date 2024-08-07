package Lecture48;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {

	private HashMap<Integer, HashMap<Integer, Integer>> graph;

	public Graph(int v) {
		graph = new HashMap<>();

		for (int i = 1; i <= v; i++) {
			graph.put(i, new HashMap<>());
		}
	}

	public void addEdge(int v1, int v2, int w) {
		graph.get(v1).put(v2, w);
		graph.get(v2).put(v1, w);
	}

	public void addVertice(int v) {
		graph.put(v, new HashMap<>());
	}

	public void removeVertice(int v) {
		for (int nbr : graph.get(v).keySet()) {
			graph.get(nbr).remove(v);
		}
		graph.remove(v);
	}

	public void removeEdge(int v1, int v2) {
		graph.get(v1).remove(v2);
		graph.get(v2).remove(v1);
	}

	public boolean containsVertice(int v) {
		return graph.containsKey(v);
	}

	public boolean containsEdge(int v1, int v2) {
		return graph.get(v1).containsKey(v2);
	}

	public void display() {
		for (int i : graph.keySet()) {
			System.out.println(i + " ==> " + graph.get(i));
		}
	}

	public boolean hasPath(int src, int dest, HashSet<Integer> visited) {
		if (src == dest) {
			return true;
		}
		visited.add(src); // avoid deadlock
		for (int nbrs : graph.get(src).keySet()) {
			if (!visited.contains(nbrs)) {
				boolean ans = hasPath(nbrs, dest, visited);
				if (ans) {
					return true;
				}
			}

		}
		visited.remove(src);
		return false;
	}

	public void printAllPath(int src, int dest, HashSet<Integer> visited, String s) {
		if (src == dest) {
			System.out.println(s + dest);
			return;
		}
		visited.add(src); // avoid deadlock
		for (int nbrs : graph.get(src).keySet()) {
			if (!visited.contains(nbrs)) {
				printAllPath(nbrs, dest, visited, s + src + "=>");
			}

		}
		visited.remove(src);
	}

	public boolean bfs(int src, int dest, HashSet<Integer> visited) {
		if (src == dest) {
			return true;
		}
		Queue<Integer> q = new LinkedList<>();

		q.add(src); // add src

		while (!q.isEmpty()) {
			int rv = q.poll(); // remove
			if (rv == dest) {
				return true;
			}

			if (visited.contains(rv)) { // if visited
				continue;
			}

			visited.add(rv); // mark visited

			for (int nbr : graph.get(rv).keySet()) {
				if (!visited.contains(nbr)) { // add nbr if not visited
					q.offer(nbr);
				}
			}

		}
		return false;
	}
	
	public boolean dfs(int src, int dest, HashSet<Integer> visited) {
		if (src == dest) {
			return true;
		}
		Stack<Integer>  st = new Stack<>();

		st.push(src); // add src

		while (!st.isEmpty()) {
			int rv = st.pop(); // remove
			if (rv == dest) {
				return true;
			}

			if (visited.contains(rv)) { // if visited
				continue;
			}

			visited.add(rv); // mark visited

			for (int nbr : graph.get(rv).keySet()) {
				if (!visited.contains(nbr)) { // add nbr if not visited
					st.push(nbr);
				}
			}

		}
		return false;
	}

}
