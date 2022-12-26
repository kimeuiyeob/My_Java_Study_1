package threadTest;

public class ThreadTest {
	public static void main(String[] args) {

		Runnable runner = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					;
				}
			}
		};

		Runnable t1 = new Thread2();
		Thread2 t2 = new Thread2();

		Thread thread1 = new Thread(runner, "!");
		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					;
				}
			}
		}, "?");

		thread1.start();
		thread2.start();

//		join() : 사용한 객체의 쓰레드가 모두 종료되어야 다른 쓰레드가 실행된다.
//				 이미 start()된 쓰레드는 영향을 받지 않는다.
//				 만약 나중에 실행하고자 하는 쓰레드가 있다면, join() 다음에 start()를 실행해야 한다.
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			;
		}

		System.out.println("main 쓰레드 종료");

//		Thread1 t1 = new Thread1("★");
//		Thread1 t2 = new Thread1("♥");
		
//		t1.start();
//		t2.start();

//		t1.run();
//		t2.run();
	}
}
