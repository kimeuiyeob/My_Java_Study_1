package inputTest;

import java.util.Scanner;

public class InputTask2 {
	public static void main(String[] args) {
//		3개의 정수를 한 번에 입력받은 후
//		3개의 정수의 곱 출력
		int firstNumber = 0, middleNumber = 0, lastNumber = 0, result = 0;
		String message = "정수 세 개를 입력하세요 : ";
		Scanner sc = new Scanner(System.in);
		
		System.out.print(message);
		
		firstNumber = Integer.parseInt(sc.next());
		middleNumber = Integer.parseInt(sc.next());
		lastNumber = Integer.parseInt(sc.next());
		
		result = firstNumber * middleNumber * lastNumber;
		
		System.out.printf("%d * %d * %d = %d", firstNumber, middleNumber, lastNumber, result);
	}
}
