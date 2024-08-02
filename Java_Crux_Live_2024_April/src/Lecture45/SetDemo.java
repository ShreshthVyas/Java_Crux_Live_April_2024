package Lecture45;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashSet<Integer>  set = new HashSet<>();
//		set.add(1);
//		set.add(2);
//		set.add(3);
//		set.add(1);
//		set.add(1);
//		set.add(1);
//		set.add(2);
//		set.add(3);
//		set.add(null);
//		System.out.println(set.contains(2));
//		System.out.println(set.contains(4));
//		
//		set.remove(2);
//		System.out.println(set);
		
//		LinkedHashSet<Integer>  set = new LinkedHashSet<>();
//		set.add(1);
//		set.add(2);
//		set.add(3);
//		set.add(1);
//		set.add(1);
//		set.add(1);
//		set.add(2);
//		set.add(3);
//		set.add(null);
////		System.out.println(set.contains(2));
////		System.out.println(set.contains(4));
////		
////		set.remove(2);
//		System.out.println(set);
		TreeSet<Integer>  set = new TreeSet<>();
		set.add(6);
		set.add(2);
		set.add(3);
		set.add(7);
		set.add(1);
		set.add(1);
		set.add(2);
		set.add(3);
		
//		System.out.println(set.contains(2));
//		System.out.println(set.contains(4));
//		
//		set.remove(2);
		System.out.println(set);
		
		
	}

}
