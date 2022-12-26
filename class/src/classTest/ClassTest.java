package classTest;

class A{ //클래스 A를 만든다
	int data; //data 변수를 담는다.
	
	A(int data){ //int data에 10을 담는다.
		System.out.println(this);
		this.data = data; //여기 data가 this를 통해 A클래스 data에 10이담긴다.
	}
	
	void printData() { //printData의 메소드를 만든다.
		System.out.println(data); //A클래스의 data변수를 출력한다. 
	}
}

public class ClassTest {
	public static void main(String[] args) {
		
		A a = new A(10); //A클래스를 a객체에 담아서 객체화 한다. A(10)의 주소값을 a에 담는다. 
		
		System.out.println(a); // a객체의 주소를 출력한다. 이때 .toString이 생략되있다.
		System.out.println(a.toString()); //그래서 위랑 같다고 생각!!
		
		System.out.println(a.data); //클래스 A 타입의 a 겍체의 주소에 .으로 접근하고 그안에 data값을 출력한다.
		a.printData(); //클래스 A 타입의 a 겍체의 주소에 .printData()를 실행한다. 그 메소드에 data값을 실행하는게 있다.
		
	}
}














