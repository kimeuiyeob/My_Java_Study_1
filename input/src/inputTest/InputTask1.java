package inputTest;

import java.util.Scanner;

public class InputTask1 {
	public static void main(String[] args) {
//		 두 정수를 입력한 뒤 덧셈 결과 출력
//		 단, next()만 사용
		
		int firstNumber = 0, lastNumber = 0, result = 0;
		String firstNumberMsg = "첫번째 정수 : ", lastNumberMsg = "두번째 정수 : ";
		Scanner sc = new Scanner(System.in);
		
		System.out.print(firstNumberMsg);
		firstNumber = Integer.parseInt(sc.next());
		
		System.out.print(lastNumberMsg);
		lastNumber = Integer.parseInt(sc.next());
		
		result = firstNumber + lastNumber;
		
		System.out.printf("%d + %d = %d", firstNumber, lastNumber, result);
		
	}
}
