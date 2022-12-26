package lambdaTest;

public class LambdaTest {
	public static void main(String[] args) {
		LambdaInter lambdaInter1 = (number) -> number % 10 == 0;
		boolean result1 = lambdaInter1.checkMultipleOf10(11);
		System.out.println(result1);
		
		LambdaInter lambdaInter2 = (n) -> {
			System.out.println("10의 배수 검사");
			return n % 10 == 0;
		};
		boolean result2 = lambdaInter2.checkMultipleOf10(20);
		System.out.println(result2);
	}
}
