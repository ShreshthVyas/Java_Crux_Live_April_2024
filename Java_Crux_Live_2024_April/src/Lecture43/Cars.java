package Lecture43;

public class Cars<T> implements Comparable<Cars> {
	int price;
	int speed;
	String name;
	
	public Cars(int p, int s, String n) {
		price = p;
		speed = s;
		name = n;
	}
	
	@Override
	public String toString() {
		return "Name -"+ this.name + " Speed- "  + this.speed+ " Price- " + this.price;
	}

	@Override
	public int compareTo(Cars o) {
		// TODO Auto-generated method stub
//		return this.speed - o.speed;
//		return o.price - this.price;
//		if(this.speed == o.speed) {
//			return this.name.compareTo(o.name);
//		}
	
		return this.name.compareTo(o.name);
		
	}
	
}
