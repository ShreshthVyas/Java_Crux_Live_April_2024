package Lecture44;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BusyMan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			pair[] p = new pair[n];
			for (int i = 0; i < p.length; i++) {
				p[i] = new pair();
				p[i].st = sc.nextInt();
				p[i].et = sc.nextInt();
			}
			
			Arrays.sort(p, new Comparator<pair>() {

				@Override
				public int compare(pair o1, pair o2) {
					// TODO Auto-generated method stub
					return o1.et - o2.et;
				}
			});
			
			int count =1;
			int cet = p[0].et;
			
			for (int i = 1; i < p.length; i++) {
				if(p[i].st >= cet) {
					count++;
					cet = p[i].et;
				}
			}
			System.out.println(count);
		}

	}
	
	public static class pair{
		int st;
		int et;
		
		public pair() {
			
		}
	}

}
