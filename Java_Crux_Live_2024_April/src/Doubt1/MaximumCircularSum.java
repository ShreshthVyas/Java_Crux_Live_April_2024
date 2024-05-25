package Doubt1;

import java.util.Scanner;

public class MaximumCircularSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println(maxSum(arr));
		}
		
	}
	
	public static int maxSum(int[] arr)
    {
        int curMax = arr[0], maxSum = arr[0];
        int curMin = arr[0], minSum = arr[0];
        int sum = arr[0];
        
        for(int i = 1; i < arr.length; i++)
        {
            curMax = Math.max(arr[i], curMax + arr[i]);
            maxSum = Math.max(maxSum, curMax);
            
            curMin = Math.min(arr[i], curMin + arr[i]);
            minSum = Math.min(minSum, curMin);
            sum += arr[i];
        }
        if(sum == minSum) {
        	return maxSum;
        }
        else {
        	return Math.max(maxSum, sum - minSum);
        }
    }

}
