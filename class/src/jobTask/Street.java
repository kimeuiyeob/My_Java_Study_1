package jobTask;

import java.util.Scanner;

public class Street {
	public static void main(String[] args) {
		OakSeller seller = new OakSeller();
		Scanner sc = new Scanner(System.in);
		
		String msg = "1. 판매하기\n2. 승진하기\n3. 내 정보\n4. 나가기";
		int choice = 0, resultSold = 0;
		
		while(true) {
			System.out.println(msg);
			choice = sc.nextInt();
			if(choice == 4) {break;}
			
			switch(choice) {
			case 1: //판매하기
				resultSold = seller.sell();
				
				switch(resultSold) {
				case 0 : //성공
					System.out.println("휴~ 옥장판 판매 성공!");
					break;
				case 1 : //대성공
					System.out.println("아자뵤~! 옥장판 판매 대성공!");
					break;
				case -1 ://실패
					System.out.println("앗");
					if(seller.count == 3 && seller.positionNumber != 0) {
						seller.demote();
						System.out.println(seller.table[seller.positionNumber] + "으로 좌천되었습니다...");
					}
					break;
				}
				System.out.println("내 통장 잔고 : " + seller.income + "만원");
				
				break;
			case 2: //승진하기
				if(seller.positionNumber == 2) {
					System.out.println("승진하실 수 없습니다.");
					break;
				}
				if(seller.promote()) {
					seller.count = 0;
					System.out.println(seller.table[seller.positionNumber] + "(으)로 승진하셨습니다!!!!");
					System.out.println("내 통장 잔고 : " + seller.income + "만원");
					break;
				}
				System.out.println("승진 실패....");
				System.out.println("내 통장 잔고 : " + seller.income + "만원");
				break;
			case 3: //내 정보
				System.out.println("이름 : " + seller.name);
				System.out.println("직급 : " + seller.table[seller.positionNumber]);
				System.out.println("내 통장 잔고 : " + seller.income);
				System.out.println("판매 성공률 : " + seller.successRating + "%");
				break;
			}
		}
		
	}
}










