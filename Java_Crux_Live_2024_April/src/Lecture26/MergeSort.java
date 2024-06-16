package Lecture26;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,3,-7,5,-2};
		int ans[] = mergesort(0,arr.length-1,arr);
		
		System.out.println(Arrays.toString(ans));
	}

	public static int[] mergesort(int i, int j, int[] arr) {
		// TODO Auto-generated method stub
		if(i==j) {
			int temp[] = new int[1];
			temp[0] = arr[i];
			return temp;
		}
		int mid = (i+j)/2;
		int fh [] = mergesort(i, mid, arr);
		int sh [] =	mergesort(mid+1, j, arr);
		
		return merge2sortedarrays(fh, sh);
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
