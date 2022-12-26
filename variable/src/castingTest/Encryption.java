package castingTest;

public class Encryption {
	public static void main(String[] args) {
		String pw = "ehdtjrdl";
		String encryptedPw = "";
		String decryptedPw = "";
		final int KEY = 3;
		
		for (int i = 0; i < pw.length(); i++) {
			encryptedPw += (char)(pw.charAt(i) * KEY);
		}
		System.out.println(encryptedPw);
		
		for (int i = 0; i < encryptedPw.length(); i++) {
			decryptedPw += (char)(encryptedPw.charAt(i) / KEY);
		}
		System.out.println(decryptedPw);
	}
}
