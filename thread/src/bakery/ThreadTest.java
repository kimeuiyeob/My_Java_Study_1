package bakery;

public class ThreadTest implements Runnable{
	@Override
	public void run() {
		while(true) {
			System.out.println("실행중....");
			if(Thread.interrupted()) {
				break;
			}
		}
	}
}
