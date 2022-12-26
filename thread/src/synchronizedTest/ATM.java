package synchronizedTest;

public class ATM implements Runnable{
	
	public int money;
	
	public ATM() {
		this(10000);
	}
	
	public ATM(int money) {
		super();
		this.money = money;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			withdraw(1000);
			try {Thread.sleep(1000);} catch (InterruptedException e) {;}
		}
	}
	
	public /* synchronized */ void withdraw(int money) {
//		mutex : 동기화를 걸어줄 자원 객체
//		synchronized (this) {
			this.money -= money;
//		}
		System.out.println(Thread.currentThread().getName() + "이(가) " + money + "원 출금");
		System.out.println("현재 잔액 : " + this.money + "원");
	}
}








