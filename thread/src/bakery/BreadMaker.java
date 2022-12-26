package bakery;

public class BreadMaker implements Runnable{
	
	public static boolean check;
	
	@Override
	public void run() {
//		빵을 20개 만든다.
		int i = 0;
		for (i = 0; i < 20; i++) {
			BreadPlate.getInstance().makeBread();
			if(check) {break;}
			try {Thread.sleep(300);} catch (InterruptedException e) {break;}
		}
		if(i != 20) {
			System.out.println("안녕히 가세요");
			return;
		}
		System.out.println("재료 소진");
	}
}
