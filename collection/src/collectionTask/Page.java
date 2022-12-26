package collectionTask;

import java.util.Scanner;

public class Page {
	public static void main(String[] args) {
		
		User user = new User(); //User클래스를 user에 객체화
		UserField userField = new UserField();
		
		Scanner sc = new Scanner(System.in);
		String number = null;
		
//		입력받은 정보
		user.setId("rladmlduq47"); //set을 통해 값을 변경또는 값을 넣는다.
		user.setName("김의엽");
		user.setPassword("wmfwmf15");
		user.setPhoneNumber("01050408875");
		
//		아이디 중복검사 테스트		
		if(userField.checkId(user.getId()) == null) {
//			checkId메소드 통해 아이디가 없으면 null이기때문에 null과 같다면
//			중복된 아이디가 없다는 뜻이다.
//		회원가입 테스트
			userField.join(user); //중복된 아이디가 없으니까 회원가입
//			userField.users.forEach(System.out::println);
			
			for (User member : UserField.users) {
				System.out.println(member); 
//			users 리스트에 회원가입된걸 확인하는 출력,
//			중복된 아이디가 없어서 입력한 정보가 users 리스트에 잘들어갔다.
			}
			
//			for (int i = 0; i < UserField.users.size(); i++) {
//				System.out.println(userField.users.get(i));
//			}
		}
	
//		로그인 테스트
//		user = userField.login("rladmlduq47", "wmfwmf15");
//		if(user != null) {
//			System.out.println(user);
//		}else {
//			System.out.println("로그인 실패");
//		}
		
//		비밀번호 변경 테스트
		user = userField.checkId("rladmlduq47");
		if(user != null) {
			number = userField.sendSms(user.getPhoneNumber());
			System.out.println(number);
			
			System.out.print("인증번호 : ");
			if(number.equals(sc.next())) {
				System.out.print("비밀번호 : ");
				user.setPassword(sc.next());
				userField.changePassword(user);
				System.out.println(UserField.users.get(0));
			}
		}
		
		if(userField.login("rladmlduq47", "wmfwmf15") != null) {
			System.out.println("로그인 성공");
			
		}else {
			System.out.println("로그인 실패");
		}
		
	}
}
















