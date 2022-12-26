package arrayTest;

public class ArTest2 {
	public static void main(String[] args) {
		int[] arData = new int[10];
//		1~10 넣고 출력
		for (int i = 0; i < arData.length; i++) {
			arData[i] = i + 1;
		}
		
		for (int i = 0; i < arData.length; i++) {
			System.out.println(arData[i]);
		}
	}
}
