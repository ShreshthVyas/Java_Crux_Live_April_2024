package Lecture46;

import java.util.ArrayList;


public class Hashmap <K,V>{
	
	private class Node{
		K key;
		V value;
		Node next;
	}
	
	private ArrayList<Node> bckt;
	private int size =0;
	
	public Hashmap() {
		this(4);
	}
	public Hashmap(int n) {
		bckt = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			bckt.add(null);
		}
	}
	
	public void put(K key , V val) {
		int idx = HashFunc(key);
		Node temp = bckt.get(idx);
		while(temp!=null) { // check if already exists
			if(temp.key.equals(key)) {// if key already exists
				temp.value = val;
				return; // return if already exists
			}
			temp = temp.next;
		}
		
		// Does not exist
		Node nn  = new Node();
		nn.key = key;
		nn.value = val;
		temp = bckt.get(idx);
		nn.next = temp;
		bckt.set(idx, nn);
		size++;
		double thf = 2.0; // Threshhold factor
		double lf = (1.0 *this.size) / bckt.size();
		if(lf>thf) {
			rehashing();
		}
		
	}
	
	private void rehashing() {
		// TODO Auto-generated method stub
		ArrayList<Node> temp = new ArrayList<>();
		for (int i = 0; i < 2*bckt.size(); i++) {
			temp.add(null);
		}
		ArrayList<Node> ll = bckt;
		bckt = temp;
		for (Node node : ll) {
			while(node!=null) {
				put(node.key, node.value);
				node = node.next;
			}
		}
	}
	@Override
	public String toString() {
		String s = "{ ";
		for (Node node : bckt) {
			while(node != null) {
				s += node.key + "=" + node.value + ",";
				node = node.next;
			}
		}
		return s+ "}";
	}
	
	public V remove(K key) {
		int idx =  HashFunc(key);
		Node curr = bckt.get(idx);
		Node prev =null;
		while(curr!=null) {
			if(curr.key.equals(key)) {
				break;
			}
			prev = curr;
			curr = curr.next;
		}
		
		if(curr == null) { // key not found
			return null;
		}
		else if(prev == null) { // First Node delete
			bckt.set(idx, curr.next);
			curr.next =null;
		}
		else { // any node delete
			prev.next = curr.next;
			curr.next =null;
		}
		size--;
		return curr.value;
		
	}
	
	public V get(K key) {
		int idx =  HashFunc(key);
		Node curr = bckt.get(idx);
		while(curr!=null) {
			if(curr.key.equals(key)) {
				return curr.value;
			}
			curr = curr.next;
		}
		
		return null;
	}
	
	public boolean containsKey(K key) {
		int idx =  HashFunc(key);
		Node curr = bckt.get(idx);
		while(curr!=null) {
			if(curr.key.equals(key)) {
				return true;
			}
			curr = curr.next;
		}
		
		return false;
	}
	
	
	private int HashFunc(K key) {
		// TODO Auto-generated method stub
		int idx = key.hashCode() % bckt.size();
		if(idx<0) {
			idx+= bckt.size();
		}
		return idx;
	}
	
	
}
