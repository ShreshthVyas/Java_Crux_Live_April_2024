package Lecture11;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,9,12};
		int ans = binarysearch(arr, 22);
		System.out.println(ans);
		
	}
	public static int binarysearch(int arr[] , int target) {
		int lo =0;
		int hi = arr.length-1;
		while(lo<=hi) {
			int mid = (lo+hi)/2;
			if(arr[mid] == target) {
				return mid;
			}
			if(arr[mid]>target) {
				hi = mid-1;
			}
			else {
				lo = mid+1;
			}
		}
		
		return -1;
	}

}
