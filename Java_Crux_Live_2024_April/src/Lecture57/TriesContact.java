package Lecture57;

import java.util.HashMap;

import Lecture57.Tries.Node;

public class TriesContact {

	public class Node {
		char data;
		boolean isEnd;
		HashMap<Character, Node> child = new HashMap<>();// Construction necessary for all node
		int count = 1;
	}

	private Node root;

	public TriesContact() {
		Node nn = new Node();
		nn.data = '*';
		root = nn;
	}
	
	public void add(String word) { // add
		Node curr = root;

		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.child.containsKey(ch)) { // if found
				curr = curr.child.get(ch);
				curr.count++;
			} else { // char not found
				Node nn = new Node();
				nn.data = ch;
				curr.child.put(ch, nn); // put new node in parent node
				curr = nn;
			}
		}

		curr.isEnd = true;
	}

	public int find(String word) { // find
		Node curr = root;

		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.child.containsKey(ch)) { // if found
				curr = curr.child.get(ch);
			} else { // char not found
				return 0;
			}
		}

		return curr.count;
	}
	
	public static void main(String[] args) {
		TriesContact t = new TriesContact();
		t.add("hack");
		t.add("hackerrank");
		System.out.println(t.find("hac"));
		System.out.println(t.find("hak"));
	}
}
