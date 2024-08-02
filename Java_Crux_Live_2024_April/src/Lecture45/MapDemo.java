package Lecture45;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashMap<String,Integer> map = new HashMap<>();
//		
//		// put o(1)
//		map.put("A", 1);
//		map.put("B", 2);
//		map.put("C", 3);
//		map.put("D", 4);
//		map.put("E", 5);
////		map.put("F", null);
//		map.put("A", 7);
//		map.put(null, 10);
////		map.put(null, 11);
////		map.put(null, null);
//		map.put("null", 12);
		
		//contains O(1)
//		System.out.println(map.containsKey("A"));
//		System.out.println(map.containsKey("Z"));
//		System.out.println(map.containsKey(null));
//		System.out.println(map.containsKey(map));
		
		//Get O(1)
//		System.out.println(map.get("A"));
//		System.out.println(map.get("Z"));
		
		//remove
//		System.out.println(map.containsKey("A"));
//		map.remove("A");
//		System.out.println(map.containsKey("A"));
//		
//		//
//		System.out.println(map);
		
//		for (String s : map.keySet()) {
//			System.out.println(s + "=>" +map.get(s));
//		}
		
//		TreeMap<Integer,Integer> tmap = new TreeMap<>();
//		tmap.put(1, 10);
//		tmap.put(19, 100);
//		tmap.put(-1, 100);
//		tmap.put(-2, 10);
//		tmap.put(1000, 10);
//		tmap.put(89, 10);
//		tmap.put(187, 10);
//		
//		System.out.println(tmap);
//		
//		for (Integer i : tmap.keySet()) {
//			System.out.println(i + " " + tmap.get(i));
//		}
		
		LinkedHashMap<Integer,Integer> lmap = new LinkedHashMap<>();
		lmap.put(1, 10);
		lmap.put(19, 100);
		lmap.put(-1, 100);
		lmap.put(-2, 10);
		lmap.put(1000, 10);
		lmap.put(89, 10);
		lmap.put(187, 10);
		
		System.out.println(lmap);
	}

}
