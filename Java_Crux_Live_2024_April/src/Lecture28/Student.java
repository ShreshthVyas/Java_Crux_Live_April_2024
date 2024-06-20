package Lecture28;

public class Student {
	int age;
	String name;
	
//	public Student(){ // constructor
//		age =10;
//		name= "Sherr";
//	}
	
	public Student(int age , String name) {
		this.age = age;
		this.name = name;
	}
	
	
	public void greet() {
		System.out.println("Hi user");
	}
}
