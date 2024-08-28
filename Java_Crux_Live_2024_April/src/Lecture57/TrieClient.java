package Lecture57;

public class TrieClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tries t = new Tries();
		t.insert("Ram");
		t.insert("Raman");
		t.insert("Ramesh");
		t.insert("Raj");
		t.insert("Rajan");
		t.insert("Rajesh");
		t.insert("Suresh");
		t.insert("Sur");
		
		System.out.println(t.search("Raman"));
		System.out.println(t.search("Rama"));
		System.out.println(t.startsWith("Rama"));
		System.out.println(t.startsWith("Rema"));
		
	}

}
