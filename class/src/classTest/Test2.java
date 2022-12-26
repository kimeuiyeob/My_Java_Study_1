package classTest;


public class Test2 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("한동석");
			try {Thread.sleep(3000);} catch (InterruptedException e) {;}
		}
	}
}
