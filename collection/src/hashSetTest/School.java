package hashSetTest;

import java.util.HashSet;

public class School {
	public static void main(String[] args) {
		
		HashSet<Student> stds = new HashSet<Student>();
		stds.add(new Student(1, "한동석")); 
		//HashSet은 리스트와 비슷한개념인데 순서가 정해지지않고 중복도 되지않는다.
		stds.add(new Student(1, "한동석")); 
		//Student 클래스에서 생성자에 매게변수 넘버와 이름을 받아서 바로 이렇게 stds객체에 값을 넣을수 있다.
		
		System.out.println(stds.size());
		//HashSet은 hashCode재정의로 인해 중복이 가능하지 않게해서 사이즈가 1개만 나온다.
		//Set의 가장 큰 장점은 중복을 자동으로 제거해준다는 점이다.
		
		Student han = new Student(1, "한동석");
//		System.out.println(han.equals(new Student(1, "한동석"))); 
		System.out.println(han.toString());
		//equals의 재정의로 주소값이 아닌 값으로 비교해서 true가 나오고
		//만약 equals의 재정의를 하지 않으면 주소값으로 비교하기 때문에 false가 나온다.
		//객체 stds 와 객체 han은 안에 있는 값은 같지만 서로 다른 저장영역에 있어서 주소값이 다르다.
	}
}
