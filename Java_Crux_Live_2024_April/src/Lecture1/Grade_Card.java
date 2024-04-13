package Lecture1;

public class Grade_Card {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks =71;
		
		if(marks>=90) {
			System.out.println("A");
		}
		else if (marks>=80 && marks<90) {
			System.out.println("B");
		}
		else if (marks>=70 && marks<80) {
			System.out.println("C");
		}
		else if (marks>=60 && marks<70) {
			System.out.println("D");
		}
		else {
			System.out.println("Fail");
		}
	}

}
