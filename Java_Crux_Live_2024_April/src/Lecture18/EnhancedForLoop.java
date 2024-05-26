package Lecture18;

public class EnhancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] =  {1,2,3,4,5};
		
		for (int i : arr) {
			System.out.println(i);
		}
		
		int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int m[]:matrix) {
			for(int i : m) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		String s ="abcde";
		
		char charr[] = s.toCharArray();
		for (char ch : charr ) {
			System.out.println(ch);
		}
	}

}
