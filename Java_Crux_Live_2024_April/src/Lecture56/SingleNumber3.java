package Lecture56;

import java.util.Arrays;

public class SingleNumber3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,3,2,1,6};
		System.out.println(Arrays.toString(singleNumber(arr)));
	}

	public static int[] singleNumber(int[] nums) {
		int ans = 0;
		for (int i : nums) {
			ans = ans ^ i;
		}
		int mask =  ans & (~(ans-1)); // gives the single different bit
		int a =0;
		for(int i : nums) {
			if((i& mask) !=0) {
				a  = a^i;
			}
		}
		int b = ans ^ a;
		return new int[] {a,b};
		
	}

}
