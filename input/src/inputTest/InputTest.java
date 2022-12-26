package inputTest;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
//		초기값 : 어떤 값을 넣을 지 아직 모를 때
//		정수 : 0
//		실수 : 0.0
//		문자 : ' '
//		문자열 : null 또는 ""
		
		Scanner sc = new Scanner(System.in);
		String name = null;
		String firstName = null;
		
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.println(name + "님 환영합니다.");
//		name = sc.next();
//		firstName = sc.next();
//		System.out.println(name + firstName + "님 환영합니다.");
	}
}
