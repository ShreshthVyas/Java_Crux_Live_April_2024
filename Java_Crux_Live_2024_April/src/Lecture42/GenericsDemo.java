package Lecture42;

public class GenericsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[] = {1,2,3,4,5,6};
		Display(arr);
		String arr1[] = {"A", "B" , "C" ,"D" ,"E"};
		Display(arr1);
	}
	
	public static <T>void Display(T arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ "  ");
		}
		System.out.println();
	}

}
