package collectionTest;

public class ForEachTest {
	public static void main(String[] args) {
		
		int[][] arrData = {{10, 30, 80}, {20, 40, 10}}; 
//		이차원 배열 -> 10,30,80배열 1개, 20,40,10 배열1개 arrData라는 변수에 두개의 배열이있다.
//		각 학생의 총점과 평균 출력
		int total = 0; //총점 변수
		double average = 0.0; //평균 변수
		
		for (int[] arData : arrData) {
//			total = 0;
			for (int score : arData) {
				total += score;
			}
			
			average = total / (double)arData.length;
			average = Double.parseDouble(String.format("%.2f", average));
			
			System.out.println(total);
			System.out.println(average);
		}
		
	}
}












