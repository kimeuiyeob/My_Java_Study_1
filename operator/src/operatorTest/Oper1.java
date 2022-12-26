package operatorTest;

public class Oper1 {
	public static void main(String[] args) {
		boolean isTrue = 10 > 11;
		System.out.println(10 == 11);
		System.out.println(10 != 11);
		System.out.println(isTrue);
		System.out.println(isTrue && 10 == 10);
		System.out.println(isTrue || 10 == 10);
		//true가 나오도록 수정
		System.out.println(!isTrue && 10 == 10);
	}
}
