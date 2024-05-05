package Lecture10;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {5,4,1,2,3};
		
		for (int pass = 1; pass < arr.length; pass++) { // itni baar comparison hoga
			for (int i = 0; i < arr.length - pass; i++) {
				if(arr[i]> arr[i+1]) { // for descending inverse the sign
					int t = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = t;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
