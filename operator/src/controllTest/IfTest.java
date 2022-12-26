package controllTest;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		// 두 정수 입력받고 대소비교
		int firstNumber = 0, lastNumber = 0;
		String message = "두 정수 입력 : ", resultMessage = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.print(message);
		firstNumber = sc.nextInt();
		lastNumber = sc.nextInt();
		
		if(firstNumber > lastNumber) {
			resultMessage = "큰 값 : " + firstNumber;
			
		}else if(firstNumber != lastNumber) {
			resultMessage = "큰 값 : " + lastNumber;
			
		}else {
			resultMessage = "두 수가 같습니다.";
		}
		
		System.out.println(resultMessage);
		
	}
}
