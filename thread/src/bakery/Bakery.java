package bakery;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Bakery {
	public static void main(String[] args) {
		BreadMaker breadMaker = new BreadMaker();
		Thread maker = new Thread(breadMaker);
		BreadPlate breadPlate = BreadPlate.getInstance();
		String[] btns = {"빵 먹기", "나가기"};
		int choice = 0;
		
		ImageIcon icon = new ImageIcon("src/img/bread2.gif");
		
		maker.start();
		
		while(true) {
			choice = JOptionPane.showOptionDialog(null, "", "빵집", JOptionPane.DEFAULT_OPTION,
					JOptionPane.PLAIN_MESSAGE, icon, btns, null);
			
			if(choice == 0) {
				breadPlate.eatBread();
			}else {
				System.exit(0);
//				maker.interrupt();
//				break;
			}
		}
	}
}











