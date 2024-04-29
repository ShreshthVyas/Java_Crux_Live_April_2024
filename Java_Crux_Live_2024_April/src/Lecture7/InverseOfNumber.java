package Lecture7;

import java.util.Scanner;

public class InverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int place =1;
		int ans =0;
		while(n>0) {
			int rem = n%10;
			ans = ans + (int)(place * Math.pow(10, rem-1));
			place++;
			n= n/10;
		}
		System.out.println(ans);	
	}
}
