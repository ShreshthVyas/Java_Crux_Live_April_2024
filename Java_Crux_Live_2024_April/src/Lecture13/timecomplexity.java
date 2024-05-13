package Lecture13;

public class timecomplexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		long start = System.currentTimeMillis();
//		
//		for (int i = 0; i < 10000000; i++) {
//			
//		}
//		long end = System.currentTimeMillis();
//		
//		System.out.println(end - start);
		System.out.println("Helo");
		int n =10;
//		int i =1;
//		int k =2;
		while(i<n) {
			System.out.println("Hello World");
			i++;
		} //O(n)
		
		while(i<n) {
			System.out.println("Hello World");
			n=n/2;
		}// log(n)
		
		while(i<n) {
			System.out.println("Hello World");
			i*=2;
		} // log(n)
		
		while(i<n) {
			System.out.println("Hello World");
			i+=5;
		}//O(n)
		
		while(i<n) {
			System.out.println("Hello World");
			i+=k;
		}//O(n/k)
		
		while(i<n) {
			System.out.println("Hello World");
			i*=5;
		}//O(logn) base 5
		
		while(i<n) {
			System.out.println("Hello World");
			i*=k;
		} // O(logN) base k 
		
		while(n>0) {
			System.out.println("Hello World");
			n-=2;
			n-=3;
		}// O(n)
		
		for (int a = 0; a <=n ; a++) {
			for (int j = 1; j <= n; j++) {
				System.out.println("Hey");
			}
		}//O(n^2)
		
		for (int i = 0; i <=n ; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.println("Hey");
			}
		}//O(n^2)
		
		for (int i = 0; i*i <=n ; i++) {
			System.out.println("Hello");
		}//O(sqrt(n))
		
		for (int i = 0; i <=n ; i++) {
			for (int j = 1; j <= i*i; j++) {
				for (int k = 0; k <=n/2; k++) {
					System.out.println("hello");
				}
			}
		}
		//o(n^4)
	}

}
