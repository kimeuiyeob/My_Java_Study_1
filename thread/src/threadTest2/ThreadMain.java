package threadTest2;

import java.util.Scanner;

public class ThreadMain {
	public static void main(String[] args) {
		int[] arInput = new int[3];
		Thread[] arThread = new Thread[arInput.length];
		ThreadTask threadTask = new ThreadTask();
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arThread.length; i++) {
			arThread[i] = new Thread(threadTask);
		}
		
		System.out.print("입력 : ");
		for (int i = 0; i < arThread.length; i++) {
			arInput[i] = sc.nextInt();
//			입력한 순서대로 쓰레드의 이름으로 설정한다.
			arThread[i].setName(String.valueOf(arInput[i]));
		}
		
		for (int i = 0; i < arThread.length; i++) {
			arThread[i].start();
			try {arThread[i].join();} catch (InterruptedException e) {;}
		}
		
	}
}













