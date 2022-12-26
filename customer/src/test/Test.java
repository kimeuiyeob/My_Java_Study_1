package test;

import java.util.ArrayList;
import java.util.Scanner;

import dao.UserDAO;
import vo.UserVO;

public class Test {
	public static void main(String[] args) {
		UserDAO userDAO = new UserDAO();
		
//		Connection connection = DBConnection.getConnection(); //연결 확인!!
		
		
//		아이디 검사
//		System.out.println(userDAO.checkId("hds"));
		
//		회원가입
		UserVO userVO = new UserVO();
		ArrayList<UserVO> users = null;
		Scanner sc = new Scanner(System.in);
		String userId = null, userPassword = null;
		int i = 0, status = 0;
//		
		userVO.setUserId("lss");
		userVO.setUserName("이순신");
		userVO.setUserPassword("8888");
		userVO.setUserPhoneNumber("01012341234");
		userVO.setUserBirth("2008-12-04");
		
		if(userDAO.insert(userVO)) {
			System.out.println("성공, 로그인페이지로 이동");
			
		}else {
			System.out.println("실패");
			users = userDAO.findUsersByUserPhoneNumber(userVO.getUserPhoneNumber());
			for(UserVO user : users) {
				System.out.print(++i + ". " + user.toString() + ", ");
				System.out.println(user.getUserStatus() == UserDAO.DELETED_USER_CODE ? "복구하기" : "로그인하기");
			}
			
			System.out.println("다음단계로 진행할 번호를 선택하세요.");
			i = sc.nextInt() - 1;
			if(users.get(i).getUserStatus() == UserDAO.DELETED_USER_CODE) {
				userDAO.restore(users.get(i).getUserNumber());
			}
			System.out.print("아이디 : ");
			userId = sc.next();
			
			System.out.print("비밀번호 : ");
			userPassword = sc.next();
			
			status = userDAO.login(userId, userPassword);
			
			if(status != 0) {
				if(status == UserDAO.DELETED_USER_CODE) {
					System.out.println("탈퇴된 계정입니다.");
				}else {
					System.out.println("로그인 성공");
				}
			}else {
				System.out.println("로그인 실패");
			}
		}
		
		
//		탈퇴 하기
//		int userNumber = userDAO.login("hds", "1234");
//		if(userNumber > 0) {
//			userDAO.delete(userNumber);
//			System.out.println("회원 탈퇴 성공");
//		}
		
//		회원 번호로 회원 정보 전체 조회
//		System.out.println(userDAO.selectUser(1));
		
//		회원정보 수정
//		UserVO userVO = userDAO.selectUser(userDAO.login("hgd", "1111"));
//		userVO.setUserName("길동st");
//		userDAO.update(userVO);
//		System.out.println("수정 성공");
		
//		아이디 찾기
//		userDAO.findId("01012341234").forEach(System.out::println);
		
	}
}












