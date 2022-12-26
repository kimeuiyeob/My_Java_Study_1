package stringTest;

public class StringTest {
	public static void main(String[] args) {
		String data = "ABC";

//		String 클래스 안에 있는 문자 배열(value)로
//		여러 가지 연산을 수행할 수 있다.
		
//		문자열의 길이
		System.out.println(data.length());
		
//		원하는 인덱스의 문자 추출
		System.out.println(data.charAt(1));
		
//		원하는 문자 조회 및 검색
		System.out.println(data.indexOf("Z"));
		
		
	}
}
