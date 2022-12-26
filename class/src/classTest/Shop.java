package classTest;

import java.util.Scanner;

class SuperCar {
//	브랜드, 색상, 가격 
	String brand;
	String color;
	int price;
	
	String password;
	
//	엔진 상태, 외부에서 전달받는 값이 아닌, 내부적으로 사용되는 변수
	boolean check;

//	기본 생성자
	public SuperCar() {
//		초기 비밀번호를 "0000"로 설정한다.
		password = "0000";
	}
	
//	↓ 오버로딩
	public SuperCar(String password) {
		this.password = password;
	}

	public SuperCar(String brand, String color, int price, String password) {
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.password = password;
	}
	
//	시동 켜기
//	시동의 상태를 확인하고 
//	시동이 꺼져있다면, "시동 켜기" 출력
//	이미 시동이 켜져있다면, "시동이 이미 켜져있습니다" 출력
	boolean engineStart() {
//		false일 때 true로 바뀌면서 if문 안에 있는 문장을 실행한다.
		if(!check) { //check가 false일 때 들어옴
//			시동이 꺼져있다면, 시동을 켜준다(check를 true로 바꿔준다)
			check = true;
//			시동 켜기 성공(true 리턴)
			return true;
		}
		
//		시동 켜기 실패(false 리턴)
		return false;
	}
	
//	시동 끄기
//	시동의 상태를 확인하고 
//	시동이 켜져있다면, "시동 끄기" 출력
//	이미 시동이 꺼져있다면, "시동이 이미 꺼져있습니다" 출력
	boolean engineStop() {
//		check가 true일 경우 들어옴
		if(check) { // 시동이 켜져있을 때
//			시동 끄기
			check = false;
//			시동 끄기 성공
			return true;
		}
//		시동 끄기 실패
		return false;
	}
	
//	[심화]
//	시동을 켜기 위해서는 비밀번호 4자리를 입력해야 한다.
//	입력한 비밀번호가 3회 연속 실패하면 "경찰 출동" 메세지를 출력한다.
	
//	외부에서 사용자가 입력한 비밀번호를 매개변수로 전달받는다.
	boolean checkPassword(String password) {
//		this.password : 자동차 비밀번호
//		password : 입력받은 비밀번호
//		두 개를 비교해서 일치하면 true, 일치하지 않으면 false
		return this.password.equals(password);
	}
	
}

public class Shop {
	public static void main(String[] args) {
		
//		객체화(instance)
		SuperCar ferrari = new SuperCar();
		
		
		String msg = "1.시동켜기\n2.시동끄기", pwMsg = "비밀번호 : ", pw = null;
		Scanner sc = new Scanner(System.in);
//		choice : 사용자가 입력한 메뉴 번호
//		count : 비밀번호 오류 횟수
		int choice = 0, count = 0;
		
//		FLAG : 해당 영역에서 연산된 결과를 다른 영역에서 사용하고자 할 때
		boolean stopedEngine = false;
		
		do {
			System.out.println(msg);
			choice = sc.nextInt();
			
			switch(choice) {
			case 1: // 시동 켜기
				if(!ferrari.check) { // 시동이 꺼졌을 때 들어옴
					System.out.print(pwMsg);
					pw = sc.next();
					
					if(ferrari.checkPassword(pw)) { // 비밀번호 일치할 때 들어옴
						ferrari.engineStart(); // 시동 켜주기
//						시동 켜기에 성공했다면 오류 횟수를 초기화 해준다.
						count = 0;
						System.out.println("시동 켜짐");
					}else {
						count++; // 오류 횟수 1 증가
						System.out.println("비밀번호 오류 " + count + "회");
						if(count == 3) { // 연속 3회 오류 시 들어옴
							System.out.println("경찰 출동");
						}
					}
					break; // 즉시 탈출
				}
				
				System.out.println("이미 시동이 켜져있습니다.");
				break;
			case 2: // 시동 끄기
//				시동 끄기를 시도한 결과를 stopedEngine Flag에 담아준다.
				if(stopedEngine = ferrari.engineStop()) {
					System.out.println("시동 꺼짐");
					break;
				}
				
				System.out.println("이미 시동이 꺼져있습니다.");
				break;
			}
			
		}while(!stopedEngine && count != 3);
//		stopedEngine은 시동이 켜진 후 시동을 끄기에 성공하면 true이다.
//		시동 끄기에 성공하면 반복문을 탈출한다.
//		count는 오류 횟수이다. count가 3이라는 뜻은, 연속 3회 비밀번호 오류인 경우이다.
//		따라서 count가 3일 때 while문을 탈출해야 하고, count가 3일 때 조건식이 false가 되어야 한다.
	}
}


















