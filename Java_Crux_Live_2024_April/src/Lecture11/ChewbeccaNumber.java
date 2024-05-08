package Lecture11;

import java.util.Scanner;

public class ChewbeccaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long l = sc.nextLong();
		System.out.println(chewbecca(l));
	}
	public static long chewbecca( long l) {
		long ans = 0;
		long mul = 1;
		
		while(l>9) {
			long digit = l%10;
			if(digit<5) {
				ans += digit*mul;
			}
			else {
				ans += (9-digit)*mul;
			}
			l = l/10;
			mul = mul*10;
		}
		
		if(l==9 || l<5) {
			ans += l*mul;
		}
		else {
			ans += (9-l)*mul;
		}
		
		return ans;	
	}

}
