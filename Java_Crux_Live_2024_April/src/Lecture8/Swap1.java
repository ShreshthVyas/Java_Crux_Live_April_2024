package Lecture8;

public class Swap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6};
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(".....");
		swap(arr[1],arr[3]);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

}
