package Lecture57;

import java.util.HashMap;

public class Tries {

	public class Node {
		char data;
		boolean isEnd;
		HashMap<Character, Node> child = new HashMap<>();// Construction necessary for all node
	}

	private Node root;

	public Tries() {
		Node nn = new Node();
		nn.data = '*';
		root = nn;
	}

	public void insert(String word) {
		Node curr = root;

		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.child.containsKey(ch)) { // if found
				curr = curr.child.get(ch);
			} else { // char not found
				Node nn = new Node();
				nn.data = ch;
				curr.child.put(ch, nn); // put new node in parent node
				curr = nn;
			}
		}

		curr.isEnd = true;
	}

	public boolean search(String word) {
		Node curr = root;

		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.child.containsKey(ch)) { // if found
				curr = curr.child.get(ch);
			} else { // char not found
				return false;
			}
		}

		return curr.isEnd;
	}

	public boolean startsWith(String prefix) {
		Node curr = root;

		for (int i = 0; i < prefix.length(); i++) {
			char ch = prefix.charAt(i);
			if (curr.child.containsKey(ch)) { // if found
				curr = curr.child.get(ch);
			} else { // char not found
				return false;
			}
		}
		
		return true;
	}
}
