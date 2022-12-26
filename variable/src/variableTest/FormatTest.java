package variableTest;

public class FormatTest {
	public static void main(String[] args) {

//		이름, 나이, 몸무게 저장할 변수 선언
		String name = "한동석";
		int age = 7;
		double weight = 76.2;
		
		System.out.printf("이름 : %s\n", name);
		System.out.printf("나이 : %02d살\n몸무게 : %.1fkg", age, weight);
		
	}
}
