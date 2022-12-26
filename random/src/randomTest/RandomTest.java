package randomTest;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		Random r = new Random();
		for (int i = 0; i < 100; i++) {
			System.out.println(r.nextInt(3));				
		}
	}
}
