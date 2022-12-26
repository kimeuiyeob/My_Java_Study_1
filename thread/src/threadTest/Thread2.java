package threadTest;

public class Thread2 implements Runnable{
	
	@Override
	public void run() {
		//자원
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
			try {Thread.sleep(500);} catch (InterruptedException e) {;}
		}
	}
}
