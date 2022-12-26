package arrayListTask;

import java.util.ArrayList;

public class Test2 {
	public static void main(String[] args) {
		
		Love love = new Love();
		Love love2 = new Love();
		
		DateApp dateApp = new DateApp();
		
		love.setName("한동석");
		love.setAge(20);
		love.setNumber(1);
		
		love2.setName("홍길동");
		love2.setAge(25);
		love2.setNumber(2);
		
		dateApp.add(love);
		dateApp.add(love2);
		System.out.println(DateApp.loves);
		
		love.setAge(30);
		dateApp.update(love);
		System.out.println(DateApp.loves);

		dateApp.sort();
		System.out.println(DateApp.loves);
	}
}










