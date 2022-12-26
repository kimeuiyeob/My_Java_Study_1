package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.UserVO;

public class UserDAO {
	public static final int DELETED_USER_CODE = -1;
	public static final int RESTORED_USER_CODE = 0;
	public static final int DUPLICATED_ID_CODE = 1;
	public static final int ENABLED_ID_CODE = 2;

	public Connection connection;
	public PreparedStatement preparedStatement;

	public ResultSet resultSet;

	/**
	 * 
	 * @param userId
	 * @return
	 * 	RESTORED_USER_CODE = 0;<br>
		DELETED_USER_CODE = 1;<br>
		DUPLICATED_ID_CODE = 2;<br>
		ENABLED_ID_CODE = 3;<br>
	 */
//	아이디 중복검사	
	public int checkId(String userId) {
		String query = "select userStatus from tbl_user where userId = ?";
		int code = 0, userStatus = 0;
		
		try {
			connection = DBConnection.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, userId);
			resultSet = preparedStatement.executeQuery(); // executeQuery는 SELECT 문일때 쓰는 함수!!
			if(resultSet.next()) {
				code = DUPLICATED_ID_CODE;
				
				if(resultSet.getInt(1) == DELETED_USER_CODE) {
					code = DELETED_USER_CODE;
					
				}
			}else {
				code = ENABLED_ID_CODE;
			}

		} catch (SQLException e) {
			System.out.println("checkId()에서 쿼리문 오류");
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e.getMessage());
			}
		}

		return code;
	}

//	회원가입
	public boolean insert(UserVO userVO) {
		if(!check(userVO.getUserPhoneNumber())) { return false; }
		
		String query = "insert into tbl_user "
				+ "(userId, userPassword, userName, userAge, userPhoneNumber, userBirth) " + "values(?, ?, ?, ?, ?, ?)";

		try {
			connection = DBConnection.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, userVO.getUserId());
			preparedStatement.setString(2, userVO.getUserPassword());
			preparedStatement.setString(3, userVO.getUserName());
			preparedStatement.setInt(4, userVO.getUserAge());
			preparedStatement.setString(5, userVO.getUserPhoneNumber());
			preparedStatement.setString(6, userVO.getUserBirth());
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			System.out.println(e);
			System.out.println("insert()에서 쿼리문 오류");

		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e.getMessage());
			}
		}
		return true;
	}

//	로그인
	public int login(String userId, String userPassword) {
		String query = "select userNumber, userStatus from tbl_user where userId = ? and userPassword =?";

		int userNumber = 0;

		try {
			connection = DBConnection.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, userId);
			preparedStatement.setString(2, userPassword);

			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				userNumber = resultSet.getInt("userNumber");
				
				if(resultSet.getInt(2) == DELETED_USER_CODE) {
					userNumber = DELETED_USER_CODE;
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("login() 쿼리문 오류");
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e.getMessage());
			}
		}
		return userNumber;
	}

//	아이디 찾기
	public ArrayList<UserVO> findId(String userPhoneNumber) {

		String query = "select userNumber, userId, userPhoneNumber from tbl_user where userPhoneNumber = ?";
		ArrayList<UserVO> users = new ArrayList<UserVO>();

		try {
			connection = DBConnection.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, userPhoneNumber);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				UserVO userVO = new UserVO();
				userVO.setUserNumber(Integer.valueOf(resultSet.getString(1)));
				userVO.setUserId(resultSet.getString(2));
				userVO.setUserPhoneNumber(resultSet.getString(3));

				users.add(userVO);
			}

		} catch (SQLException e) {
			System.out.println("findId() 쿼리문 오류");
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e.getMessage());
			}
		}
		return users;
	}

//	회원 정보 전체 수정
	public void update(UserVO userVO) {
		String query = "update tbl_user " + "set userName=?, userPassword=?, userPhoneNumber=?, userAge=?, userBirth=? "
				+ "WHERE userNumber = ?";

		try {
			connection = DBConnection.getConnection();
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, userVO.getUserName());
			preparedStatement.setString(2, userVO.getUserPassword());
			preparedStatement.setString(3, userVO.getUserPhoneNumber());
			preparedStatement.setInt(4, userVO.getUserAge());
			preparedStatement.setString(5, userVO.getUserBirth());
			preparedStatement.setInt(6, userVO.getUserNumber());
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			System.out.println("update() 쿼리 오류");
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e.getMessage());
			}
		}
	}

//	회원 전체 정보 조회
	public UserVO selectUser(int userNumber) {
		String query = "select userNumber, userId, userPassword, userName, userAge, userPhoneNumber, userStatus, userBirth from tbl_user "
				+ "where userNumber=?";

		int i = 0;
		UserVO userVO = new UserVO();
		try {
			connection = DBConnection.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, userNumber);
			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				userVO.setUserNumber(resultSet.getInt(++i));
				userVO.setUserId((resultSet.getString(++i)));
				userVO.setUserPassword(resultSet.getString(++i));
				userVO.setUserName(resultSet.getString(++i));
				userVO.setUserAge(resultSet.getInt(++i));
				userVO.setUserPhoneNumber(resultSet.getString(++i));
				userVO.setUserStatus(resultSet.getInt(++i));
				userVO.setUserBirth(resultSet.getString(++i));
			}
		} catch (SQLException e) {
			System.out.println("updateUser() 쿼리문 오류");
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e.getMessage());
			}
		}
		return userVO;
	}

//	회원탈퇴
	public void delete(int userNumber) {
		String query = "update tbl_user set userStatus=? where userNumber= ?";

		try {
			connection = DBConnection.getConnection();
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setInt(1, DELETED_USER_CODE);
			preparedStatement.setInt(2, userNumber);
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			System.out.println("delete() 쿼리문 오류");
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e.getMessage());
			}
		}
	}

//	회원탈퇴 복구
	public void restore(int userNumber) {
		String query = "update tbl_user set userStatus=? where userNumber = ?";

		try {
			connection = DBConnection.getConnection();
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setInt(1, RESTORED_USER_CODE);
			preparedStatement.setInt(2, userNumber);
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			System.out.println("restore() 쿼리문 오류");
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e.getMessage());
			}
		}
	}

	private boolean check(String userPhoneNumber) {
		boolean check = false;
		String query = "select count(userPhoneNumber) result from tbl_user where userPhoneNumber = ?";

		try {
			connection = DBConnection.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, userPhoneNumber);
			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) { 
				check = resultSet.getInt("result") < 3;
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("login() 쿼리문 오류");
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e.getMessage());
			}
		}

		return check;
	}
	
//	핸드폰번호로 가입한 전체 회원 정보 조회
	public ArrayList<UserVO> findUsersByUserPhoneNumber(String userPhoneNumber) {
		String query = "select userNumber, userId, userName, userAge, userPhoneNumber, userBirth, userStatus from tbl_user "
				+ "where userPhoneNumber = ?";
		ArrayList<UserVO> users = new ArrayList<UserVO>();
		try {
			connection = DBConnection.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, userPhoneNumber);
			resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				UserVO userVO = new UserVO();
				userVO.setUserNumber(resultSet.getInt(1));
				userVO.setUserId(resultSet.getString(2));
				userVO.setUserName(resultSet.getString(3));
				userVO.setUserAge(resultSet.getInt(4));
				userVO.setUserPhoneNumber(resultSet.getString(5));
				userVO.setUserBirth(resultSet.getString(6));
				userVO.setUserStatus(resultSet.getInt(7));
				users.add(userVO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e.getMessage());
			}
		}
		
		return users;
	}
}























