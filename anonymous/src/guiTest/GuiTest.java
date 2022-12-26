package guiTest;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GuiTest extends JFrame{
	public GuiTest() {
		super("버튼 테스트");
		JButton btn = new JButton("나 눌러줘!");
		
		setSize(500, 700);
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		
		int x = (d.width - this.getWidth()) / 2;
		int y = (d.height - this.getHeight()) / 2;
		
		setLocation(x, y);
		setLayout(new FlowLayout());
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("안녕 난 버튼이야!");
			}
		});
		
		add(btn);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("앙 닫혔어!");
				System.exit(0);
			}
		});
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GuiTest();
	}
}








