package castingTest;

public class CastingTest4 {
	public static void main(String[] args) {
		System.out.println(Integer.parseInt("1") + 3 + 9);
		
//		"3.9" + 9 의 결과를 12.9로 출력한다.
		System.out.println(Double.parseDouble("3.9") + 9);
		System.out.println(Float.parseFloat("3.9") + 9);
	}
}
