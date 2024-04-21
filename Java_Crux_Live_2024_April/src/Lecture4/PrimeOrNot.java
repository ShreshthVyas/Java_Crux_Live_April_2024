package Lecture4;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean f = true;
		for(int i =2;i<n;i++) {
			if(n%i==0) {
				f = false;
			}
		}
		if(f==true) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
		
		
		
		
	}

}
