package Lecture18;

import java.util.ArrayList;
import java.util.Collections;

public class DemoArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>  list =  new ArrayList<>();
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		list.add(5);
//		list.add(6);
//		
//		
//		System.out.println(list);
//		
//		System.out.println(list.size());
//		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(i + " - " +list.get(i));
//		}
//		
//		System.out.println(list.remove(1));
		
		list.add(0,1);
		list.add(0,2);
		list.add(0,3);
		list.add(0,4);
		list.add(0,5);
		list.add(0,6);
		
		System.out.println(list);
		
		list.set(0, 7);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
	}

}
