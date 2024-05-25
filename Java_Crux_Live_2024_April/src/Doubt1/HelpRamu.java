package Doubt1;

import java.util.Scanner;

public class HelpRamu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t > 0) {
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			int c3 = sc.nextInt();
			int c4 = sc.nextInt();
			
			int nor = sc.nextInt(); //no of rickshaw
			int noc =sc.nextInt(); //no of cab
			
			int freqr[] = new int[nor]; // freq of rick
			int freqc[] = new int[noc]; // freq of cab
			
			for (int i = 0; i < freqr.length; i++) {
				freqr[i] = sc.nextInt();
			}
			
			for (int i = 0; i < freqc.length; i++) {
				freqc[i] = sc.nextInt();
			}
			
			int minfairrick = mincost(c1, c2, c3, freqr);
			int minfaircab = mincost(c1, c2, c3, freqc);
			int ans = Math.min(minfairrick+ minfaircab , c4);
			System.out.println(ans);
			t--;
		}
	}
	
	public static int mincost(int c1, int c2, int c3 , int freq[]) {
		
		int sum =0;
		for (int i = 0; i < freq.length; i++) {
			sum+= Math.min(freq[i]*c1, c2);
		}
		
		return Math.min(sum, c3);
		
	}
	

}
