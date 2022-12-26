package access2;

import access1.Access1;

public class Access3 extends Access1 { 
	//Access3에다가 Access1을 상속받는다
	public static void main(String[] args) {
//		Access1 a1 = new Access1();
		
		
		Access3 a3 = new Access3();
		//Access1을 Access3클래스에 상속받았기때문에 Access1에 있는  
		System.out.println(a3.data3); //
		System.out.println(a3.data2);
	}
}
