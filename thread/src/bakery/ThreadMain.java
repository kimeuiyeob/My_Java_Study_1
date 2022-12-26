package bakery;

import javax.swing.JOptionPane;

public class ThreadMain {
	public static void main(String[] args) {
		Thread t = new Thread(new ThreadTest());
		String[] btns = {"계속하기", "나가기"};
		t.start();
		
		if(JOptionPane.showOptionDialog(null, "", "종료 테스트", JOptionPane.DEFAULT_OPTION,
				JOptionPane.PLAIN_MESSAGE, null, btns, null) == 1) {
			t.interrupt();
		}
	}
}
