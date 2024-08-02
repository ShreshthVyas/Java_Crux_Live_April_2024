package Lecture45;

import java.util.HashMap;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabbaaccdedec";
		
		HashMap<Character,Integer> map =  new HashMap<>();
		
		for (Character ch : s.toCharArray()) {
//			if(map.containsKey(ch)) {
//				map.put(ch, map.get(ch)+1);
//			}
//			else {
//				map.put(ch, 1);
//			}
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		System.out.println(map);
	}

}
