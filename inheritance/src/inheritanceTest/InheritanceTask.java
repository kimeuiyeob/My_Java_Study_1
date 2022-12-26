package inheritanceTest;

class Car {
//	브랜드, 색상, 가격
	String brand;
	String color;
	int price;

	public Car() {
		;
	}

	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	// 열쇠로 시동 킴
	void engineStart() {
		System.out.println("열쇠로 시동 킴");
	}

//	열쇠로 시동 끔
	void engineStop() {
		System.out.println("열쇠로 시동 끔");
	}

}

//	SuperCar 자식 Car 부모
class SuperCar extends Car {
//	모드
	String mode;

//	자식 기본 생성자는 부모의 기본 생성자를 호출한다.
//	부모에 기본 생성자가 없으면 자식의 기본 생성자는 오류가 발생한다.
	public SuperCar() {
		;
	}

	public SuperCar(String brand, String color, int price, String mode) {
//		부모의 생성자 중 3개의 값을 전달받는 생성자 호출
		super(brand, color, price);
		this.mode = mode;
	}

//	음성으로 시동 킴
//	재정의 
	@Override
	void engineStart() {
		System.out.println("음성으로 시동 킴");
		super.engineStart();
	}

//	음성으로 시동 끔
	@Override
	void engineStop() {
		System.out.println("음성으로 시동 끔");
	}

//	지붕 열기
	void openRoof() {
		System.out.println("지붕 열기");
	}

//	지붕 닫기
	void closeRoof() {
		System.out.println("지붕 닫기");
	}

}

public class InheritanceTask {
	public static void main(String[] args) {
		SuperCar rollsroyce = new SuperCar("롤스로이스", "하얀색과 검정색", 70000, "Sports");
		rollsroyce.engineStart();
		rollsroyce.engineStop();
		rollsroyce.openRoof();
		rollsroyce.closeRoof();
	}
}
