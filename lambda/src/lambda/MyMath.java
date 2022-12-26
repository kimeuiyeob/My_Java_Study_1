package lambda;

import java.util.Scanner;

public class MyMath {
//	외부에서 연산자 한 개를 전달받는다.
	public static Calc calculator(String oper) {
		Calc c = null;
		
		switch(oper) {
		case "+" : // 전달받은 연산자가 +일 때
			c = (n1, n2) -> n1 + n2;
			break;
		case "-" :
			c = (n1, n2) -> n1 - n2;
			break;
		}
		
		return c;
	}
	public static void main(String[] args) {
//		전체 수식에서 +와 -만 분리하는 메소드로 구현
		OperCheck operCheck = (ex) -> {
			String temp = "";
					
			//전체 수식에서 연산자만 골라서 문자열에 담고
			for (int i = 0; i < ex.length(); i++) {
				char c = ex.charAt(i);
				if(c == '-' || c == '+') {
					temp += c;
				}
			}
			//문자열 배열로 리턴
			return temp.split("");
		};
		
		String msg = "정수의 덧셈, 뺄셈에 대한 식을 입력하세요.";
		String exampleMessage = "예)9+7-5";
		String expression = null;
		String[] opers = null;
		String[] nums = null;
		int number1 = 0, number2 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(msg);
		System.out.println(exampleMessage);
		//사용자에게 전체 수식을 입력받는다.
		expression = sc.next();
//		위에서 구현한 연산자 추출 메소드에 전체 수식을 전달한다.
		opers = operCheck.checkOper(expression);
		nums = expression.split("\\+|\\-");
		
//		-1+9+5
//		nums[0] = nums[0].equals("") ? "0" : nums[0];
		
		number1 = Integer.parseInt(nums[0].equals("") ? opers[0] + nums[1] : nums[0]);
		
		for (int i = 0; i < opers.length; i++) {
			if(i == 0 && number1 < 0) {continue;}
			number2 = Integer.parseInt(nums[i + 1]);
			number1 = calculator(opers[i]).calc(number1, number2);
		}
		
		System.out.println(number1);
	}
}




















