package Lecture26;

import java.util.Arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1,3,5,7};
		int arr2 [] = {2,6,8,9};
		
		int ans[] = merge2sortedarrays(arr1,arr2);
		
		System.out.println(Arrays.toString(ans));
		
	}

	public static int[] merge2sortedarrays(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		int ans [] = new int[arr1.length+arr2.length];
		int i =0;
		int j =0;
		int k =0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				ans[k] = arr1[i];
				i++;		
			}
			else {
				ans[k] = arr2[j];
				j++;
			}
			k++;
		}
		
		while(i<arr1.length) {
			ans[k] = arr1[i];
			i++;
			k++;
		}
		
		while(j<arr2.length) {
			ans[k] = arr2[j];
			j++;
			k++;
		}
		
		return ans;
	}

}
