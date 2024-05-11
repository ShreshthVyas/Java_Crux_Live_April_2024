package Lecture12;

import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //no of stalls
		int c = sc.nextInt();// no of cows
		
		int stall[] = new int[n];
		for (int i = 0; i < stall.length; i++) {
			stall[i] = sc.nextInt();
		}
		Arrays.sort(stall); 
		System.out.println(binaryseach(stall,c));
	}
	public static int binaryseach(int stall[], int cow) {
		int lo = 0;
		int hi = stall[stall.length-1] - stall[0];
		int ans = 0;
		while(lo<=hi) {
			int mid = (hi+lo)/2;
			if(isitpossible(mid, cow , stall)) {
				ans = mid;
				lo = mid+1;
			}
			else {
				hi = mid-1;
			}
		}
		return ans;
	}
	
	public static boolean isitpossible(int mid , int cows , int stall[]) {
		int placed  =1; // number of cows placed 
		int pos = stall[0]; // the position where last cow is placed 
		
		for (int i = 1; i < stall.length; i++) {
			if(stall[i] - pos >= mid) {
				placed++;
				pos = stall[i];
			}
			if(placed == cows) { // Sari cows baitha di
				return true;
			}
		}
		
		return false;
	}

}
