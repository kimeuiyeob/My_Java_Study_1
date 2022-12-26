package threadTest1;

public class Zoo {
	public static void main(String[] args) {
		
		String[] sounds = {"어흥", "야옹", "음메"};
		//문자열 배열을 sounds를 하나만들고 3개의 값을 넣어준다.
		Animal[] animals = new Animal[sounds.length]; //animal 배열을 만들고 안에 값은 3이 들어간다.
		Thread[] threads = new Thread[sounds.length]; //threads 배열을 만들고 안에 값은 3이 들어간다.
		
		for (int i = 0; i < threads.length; i++) { //반복 3번
			animals[i] = new Animal(); //
			threads[i] = new Thread(animals[i], sounds[i]);
		}
		
		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
			if(i != 0) {
				try {threads[i].join();} catch (InterruptedException e) {;}
			}
		}
		
	}
}













