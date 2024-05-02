package Lecture8;

import java.util.Scanner;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = {1,2,3,4,5};
		Scanner sc=  new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		
		for(int i =0;i< arr.length ;i++) {
			arr[i]= sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		
	}
}
