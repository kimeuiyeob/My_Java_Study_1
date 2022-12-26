package collectionTask;

public class User {
	
	private String name;
	private String id;
	private String password;
	private String phoneNumber;
	
	public User() {;}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	private String decrypt(String password) { //복호화(암호화반대) 비밀번호 입력받으면
		String decryptedPassword = ""; //복호화된 비밀번호를 저장할 매게변수 생성
		for (int i = 0; i < password.length(); i++) { //비밀번호길이만큼 반복
			decryptedPassword += (char)(password.charAt(i) / 3); 
			//encrypt에서 3을 곱해줬으니까 같은방식으로 3을 나눠주면 원래 비밀번호가 decryptedPassword에 들어가게 된다.
		}
		return decryptedPassword; //복호화된 비밀번호 반환
	}
	
	@Override
	public String toString() {
		String str = name + "," + id + "," + phoneNumber + "," + decrypt(password);
		return str;
	}
}
















