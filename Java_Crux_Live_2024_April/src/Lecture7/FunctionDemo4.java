package Lecture7;

import java.util.Scanner;

public class FunctionDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
		int a =10;
		int b =20;
		add(a,b);
		System.out.println(a);
		System.out.println(b);
	}
	public static void add(int a , int b) {
		a++;
		b++;
		System.out.println(a);
		System.out.println(b);
	}

}
