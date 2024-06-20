package Lecture28;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student(10,"Sherr");
//		s.age =10;
//		s.name = "sher";
		System.out.println(s.name);
		System.out.println(s.age);
//		s.greet();
		
		Student s1 = new Student(12,"Cheetah");
		System.out.println(s1.name);
		System.out.println(s1.age);
		
	}

}
