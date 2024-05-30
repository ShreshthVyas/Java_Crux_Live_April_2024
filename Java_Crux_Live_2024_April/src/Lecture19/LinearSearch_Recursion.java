package Lecture19;

public class LinearSearch_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,3,11,-12,13};
		System.out.println(linearsearch(arr,-11,0));
	}

	public static int linearsearch(int[] arr, int target, int i) {
		// TODO Auto-generated method stub
		if(i==arr.length) {
			return -1;
		}
		
		if(arr[i]== target) {
			return i;
		}
		
		return linearsearch(arr, target, i+1);
		
	}
	
}
