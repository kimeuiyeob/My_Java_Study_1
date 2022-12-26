package lamp;

import javax.swing.JOptionPane;

public class Test {
	public static void main(String[] args) {
		TimerDeskLamp timerDeskLamp = new TimerDeskLamp();
		
		String[] btns = {"전원 끄기 예약", "나가기"};
		int choice = 0;
		while(true) {
			choice = JOptionPane.showOptionDialog(null, "", "", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
					null, btns, null);
			
			if(choice == 0) {
				timerDeskLamp.offDelay();
			}else {
				System.exit(0);
			}
		}
	}
}
