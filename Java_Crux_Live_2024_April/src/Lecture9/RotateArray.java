package Lecture9;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7};
		int n = arr.length;
		int k =0;
		k =k%n;
		reverse(0,n-1,arr);
		reverse(0,k-1,arr);
		reverse(k,n-1,arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
	public static void reverse(int i, int j, int arr[]) {
		
		while(i<=j) {
			int temp = arr[i];
			arr[i] =arr[j];
			arr[j]= temp;
			i++;
			j--;
		}
	}

}
