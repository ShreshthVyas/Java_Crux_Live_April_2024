package Lecture47;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<String>> groupAnagrams(String[] arr) {
		HashMap<String,List<String>> map =  new HashMap<>();
		
		for (String s : arr) {
			char ch[] = s.toCharArray();
			Arrays.sort(ch);
			String str =  new String(ch);
			
			if(map.containsKey(str)) {
				map.get(str).add(s);
			}
			else {
				map.put(str, new ArrayList<String>());
				map.get(str).add(s);
			}
		}
//		List<List<String>> ans = new ArrayList<>();
//		for (String str : map.keySet()) {
//			ans.add(map.get(str));
//		}
		
//		List<List<String>> ans = new ArrayList<>(map.values());
		return  new ArrayList<>(map.values());
	}

}
