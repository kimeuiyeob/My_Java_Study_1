package arrayTest;

public class ArTest1 {
	public static void main(String[] args) {
		int[] arData = {2, 4, 5, 6, 8};
		
		System.out.println(arData);
		System.out.println(arData.length);

		for (int i = 0; i < arData.length; i++) {
			System.out.println(arData[i]);
		}
		
//		5, 4, 3, 2, 1을 넣고 출력
		for (int i = 0; i < arData.length; i++) {
			arData[i] = 5 - i;
		}
		
		for (int i = 0; i < arData.length; i++) {
			System.out.println(arData[i]);
		}
		
//		System.out.println(arData[0] + 7);
//		System.out.println(arData[1]);
//		System.out.println(arData[2]);
//		System.out.println(arData[3]);
//		System.out.println(arData[4]);
	}
}








