package objectTest;

import java.util.Random;

class Student {
	int number;
	String name;
	
	public Student() {;}

	public Student(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return number + ", " + name;
	}
}

public class ToStringTest {
	public static void main(String[] args) {
		Random r = new Random();
		System.out.println(r.toString());
		
		Student std = new Student(1, "한동석");
		System.out.println(std);
	}
}





