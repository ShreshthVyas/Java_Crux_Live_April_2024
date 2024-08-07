package Lecture48;

import java.util.HashSet;

public class GraphClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(7);
		g.addEdge(1, 2, 100);
		g.addEdge(1, 3, 400);
		g.addEdge(3, 4, 300);
		g.addEdge(2, 4, 700);
		g.addEdge(2, 5, 800);
		g.addEdge(5, 6, 1000);
		g.addEdge(5, 7, 900);
		g.addEdge(6, 7, 200);
		
//		g.display();
//		System.out.println("-------------");
////		g.removeEdge(6, 7);
////		g.removeVertice(2);
////		g.addVertice(8);
////		System.out.println(g.containsEdge(1, 9));
//		g.display();
		
//		System.out.println(g.hasPath(1, 8,new HashSet<>()));
//		g.printAllPath(1, 7,new HashSet<>(),"");

		System.out.println(g.bfs(1, 6, new HashSet<>()));
		System.out.println(g.dfs(1, 6, new HashSet<>()));

}
}
