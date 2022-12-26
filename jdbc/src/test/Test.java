package test;

public class Test {
	public static void main(String[] args) {
//		Connection connection = null;
//		try {
////			연결 객체 가져오기
//			connection = DBConnecter.getConnection();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
////			만약 드라이버가 열려 있다면,
//			if (connection != null) {
//				try {
////					닫아준다.
//					connection.close();
//				} catch (SQLException e) {
////					드라이버를 닫다가 오류가 발생하면, 예외 던지기를 사용하여 직접 예외를 발생 시켜주고,
////					프로세스를 강제 종료 시킨다.
//					throw new RuntimeException(e.getMessage());
//				}
//			}
//		}

//		아이디 중복검사
//		UserDAO userDAO = new UserDAO();
//		if(userDAO.checkId("hd1223132s")) {
//			System.out.println("중복된 아이디 있음");
//		}else {
//			System.out.println("사용 가능한 아이디");
//		}

//		회원가입
//		UserDAO userDAO = new UserDAO();
//		UserVO userVO = new UserVO();
//		userVO.setUserId("hgd");
//		userVO.setUserName("홍길동");
//		userVO.setUserPassword("1234");
//		userVO.setUserPhone("01055556666");
//		userVO.setUserNickname("zl존 길동");
//		userVO.setUserEmail("hgd@gmail.com");
//		
//		userDAO.insert(userVO);

//		로그인
//		UserDAO userDAO = new UserDAO();
//		System.out.println(userDAO.login("hds", "1234"));

//		회원탈퇴
//		UserDAO userDAO = new UserDAO();
//		userDAO.delete(2);

//		아이디 찾기
//		UserDAO userDAO = new UserDAO();
//		System.out.println(userDAO.findId("01012341234"));

//		비밀번호 변경
//		UserDAO userDAO = new UserDAO();
//		Scanner sc = new Scanner(System.in);
//		String userId = null, userPassword = null;
//		System.out.print("아이디 : ");
//		userId = sc.next();
//		if(userDAO.checkId(userId)) {
//			System.out.println("\n존재하는 아이디 입니다.");
//			System.out.print("새로운 비밀번호 : ");
//			userPassword = sc.next();
//			userDAO.updateUserPassword(userId, userPassword);
//			System.out.println("비밀번호 변경 완료");
//			
//			System.out.println("다시 로그인 하세요");
//			System.out.print("아이디 : ");
//			userId = sc.next();
//			System.out.print("비밀번호 : ");
//			userPassword = sc.next();
//			
//			if(userDAO.login(userId, userPassword) != 0) {
//				System.out.println("로그인 성공");
//			}else {
//				System.out.println("실패");
//			}
//		}

//		정보 수정
//		UserDAO userDAO = new UserDAO();
//		int userNumber = userDAO.login("hgd", "1234");
//		if(userNumber != 0) {
//			UserVO userVO;
//			userVO = userDAO.selectUser(userNumber);
////			userVO.setUserName("이순신");
//			System.out.println(userVO);
//			userVO.setUserRecommenderId("hds");
//			userDAO.update(userVO);
//		}

//		추천인 수
//		UserDAO userDAO = new UserDAO();
//		System.out.println(userDAO.getTotalOfRecommender("hgd"));

//		나를 추천한 사람
//		UserDAO userDAO = new UserDAO();
//		userDAO.selectRecommenders("hds").forEach(System.out::println);

//		내가 추천한 사람
//		UserDAO userDAO = new UserDAO();
//		System.out.println(userDAO.getMyRecommender("hgd"));
	}
}
