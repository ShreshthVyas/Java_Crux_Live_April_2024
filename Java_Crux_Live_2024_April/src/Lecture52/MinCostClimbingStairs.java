package Lecture52;

public class MinCostClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,15,20};
		int stepone = mincost(arr,0);
		int steptwo = mincost(arr,1);
		System.out.println(Math.min(stepone, steptwo));
	}

	private static int mincost(int[] arr, int i) {
		// TODO Auto-generated method stub
		if(i>= arr.length) {
			return 0;
		}
		int s1 = mincost(arr, i+1);
		int s2 = mincost(arr, i+2);
		
		return arr[i] + Math.min(s1, s2);
	}

}
