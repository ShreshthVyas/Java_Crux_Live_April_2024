package Lecture13;

import java.util.Arrays;
import java.util.Scanner;

public class BookAllocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int s = sc.nextInt();
		int books[] =  new int[n];
		for (int i = 0; i < books.length; i++) {
			books[i] = sc.nextInt();
		}
		System.out.println(binarysearch(books, n, s));
	}
	
	public static int binarysearch(int books[], int n,int s) {
		int lo = 0;
		int hi = 0;
		int ans =0;
		for (int i = 0; i < books.length; i++) {
			hi+= books[i];
		}
		
		while(lo<=hi) {
			int mid = (lo+hi) / 2;
			if(isitpossible(mid, books,s)) {
				ans = mid;
				hi = mid-1;
			}
			else {
				lo = mid+1;
			}	
		}
		
		return ans;
	}

	public static boolean isitpossible(int mid, int[] books, int s) {
		// TODO Auto-generated method stub
		int nos = 1;
		int pagesread = 0;
		for (int i = 0; i < books.length; ) {
			if(books[i]+pagesread<=mid) {
				pagesread+=books[i];
				i++;
			}
			else {
				nos++;
				pagesread =0;
			}
			if(nos>s) {
				return false;
			}
		}
		
		return true;
		
	}
	
	

}
