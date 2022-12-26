package inheritanceTest;

class Human {
	void eat() {
		System.out.println("먹기");
	}

	void sleep() {
		System.out.println("잠자기");
	}

	void walk() {
		System.out.println("두 발로 걷기");
	}
}

//	Monkey 자식클래스 Human 부모클래스
class Monkey extends Human {
	void 이잡아라() {
		System.out.println("이잡기");
	}

//	재정의 부모 필드에서 선언한 메소드를 자식 필드에서 수정 walk를 
	@Override
	void walk() {
//		부모의 코드를 그대로 사용하고자 할 때
//		부모 코드의 walk를 네 발로 걷기로 재정의 
		super.walk();
		System.out.println("네 발로 걷기");
	}
}

public class InheritanceTest2 {
	public static void main(String[] args) {
		Monkey kingkong = new Monkey();
		kingkong.walk();
	}
}
