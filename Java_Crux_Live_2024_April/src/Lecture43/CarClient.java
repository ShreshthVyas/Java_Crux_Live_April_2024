package Lecture43;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class CarClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars c [] = new Cars[5];
		
//		for (int i = 0; i < c.length; i++) {
//			System.out.println(c[0]);
//		}
		
		c[0] = new Cars(100000, 120, "Maserati");
		c[1] = new Cars(9786543, 140, "Rangerover");
		c[2] = new Cars(9076823, 100, "Honda");
		c[3] = new Cars(980744, 200, "Toyota");
		c[4] = new Cars(80976, 20, "Nissan");
		
//		sort(c);
		ArrayList<Cars> list =  new ArrayList<>();
		Arrays.sort(c , new Comparator<Cars>() {

			@Override
			public int compare(Cars o1, Cars o2) {
				// TODO Auto-generated method stub
				return o1.speed - o2.speed;
			}
		});
		Display(c);
		
	}
	public static <T>void Display(T arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+ "  ");
		}
		
	}
	
//	public static <T extends Comparable<T>> void sort(T[] arr) {
//		for (int pass = 1; pass < arr.length; pass++) { // itni baar comparison hoga
//			for (int i = 0; i < arr.length - pass; i++) {
//				if(arr[i].compareTo(arr[i+1])>0) { // for descending inverse the sign
//					T t = arr[i];
//					arr[i] = arr[i+1];
//					arr[i+1] = t;
//				}
//			}
//		}
//	}
}



