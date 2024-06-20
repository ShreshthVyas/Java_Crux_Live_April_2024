package Lecture28;

public class Person {

	int age;
	String name;
	static int count =0;
//	public Person(int age , String name) {
////		if(age<0) {
////			System.out.println("Age cannot be -ve");
////			
////		}
////		else {
////			
////		}
//		this.name = name;
//	}
	public void Greet() {
		System.out.println("Hi "+ this.name);
	}
	public static int rcount() {
		return 1;
	}
//	public int getAge() {
//		return age;
//	}
	public void setAge(int age) throws Exception {
		try {
			if(age<0) {
				throw new Exception("Pagal h bhai age negetive mat de");
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			System.out.println("I am in finally");
		}
		
	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public static int getCount() {
//		return count;
//	}
//	public static void setCount(int count) {
//		Person.count = count;
//	}
	static {
		System.out.println("Hello from static");
		int a =10;
	}
}
