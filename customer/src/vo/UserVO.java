package vo;

public class UserVO {
	private int userNumber;
	private String userId;
	private String userPassword;
	private String userName;
	private int userAge;
	private String userPhoneNumber;
	private int userStatus;
	private String userBirth;

	public UserVO() {
		;
	}

	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int nserNumber) {
		this.userNumber = nserNumber;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public String getUserPhoneNumber() {
		return userPhoneNumber;
	}

	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}

	public int getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(int userStatus) {
		this.userStatus = userStatus;
	}

	public String getUserBirth() {
		return userBirth;
	}

	public void setUserBirth(String userBirth) {
		this.userBirth = userBirth;
	}

	@Override
	public String toString() {
		return "CustomerVO [nserNumber=" + userNumber + ", userId=" + userId + ", userPassword=" + userPassword
				+ ", userName=" + userName + ", userAge=" + userAge + ", userPhoneNumber=" + userPhoneNumber
				+ ", userStatus=" + userStatus + ", userBirth=" + userBirth + "]";
	}
}