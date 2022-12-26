package threadTest1;

public class Animal implements Runnable{
	
	//Thread는 extends Thread 상속받는 방식과
	//implements Runnable 인터페이스 구현 방식이 있다.
	//둘다 기능은 동일하나 자바에서는 다중상속이 불가하여 상속방법말고
	//인터페이스로 구현하는 방식을 더 선호한다.
	
	@Override
	public void run() { 
		//오버라이드를 통해 run()의 바디를 채워준다. , run()은 쓰레드 실행메소드라고 생각!!
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()); 
			//Thread.currentThread()은 인터페이스 구현할때 이런식으로 값을 불러와야한다.
			try {Thread.sleep(300);} catch (InterruptedException e) {;}
		}
	}
}
