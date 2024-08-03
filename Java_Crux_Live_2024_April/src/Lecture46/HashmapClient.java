package Lecture46;

public class HashmapClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashmap<String ,Integer> map = new Hashmap<>();
		map.put("A", 10);
		map.put("B", 20);
		map.put("C", 40);
		map.put("D", 80);
		
		map.put("I", 9);
		map.put("E", 5);
		map.put("F", 6);
		map.put("G", 4);
		
		System.out.println(map);
		map.remove("A");
		System.out.println(map);
		System.out.println(map.get("B"));
		System.out.println(map.containsKey("A"));
		System.out.println(map.containsKey("C"));
	}

}
