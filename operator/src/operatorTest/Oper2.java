package operatorTest;

import java.util.Scanner;

public class Oper2 {
	public static void main(String[] args) {
//		두 정수 입력받기
		int firstNumber = 0, lastNumber = 0;
		boolean isBigger = false, isSame = false;
		String message = "정수 두 개를 입력하세요", result = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(message);
		firstNumber = sc.nextInt();
		lastNumber = sc.nextInt();
		
		isBigger = firstNumber > lastNumber;
		isSame = firstNumber == lastNumber;
		
		result = isBigger ? "큰 값 : " + firstNumber : isSame ? "두 수가 같습니다" : "큰 값 : " + lastNumber;
		
		System.out.println(result);
	}
}
