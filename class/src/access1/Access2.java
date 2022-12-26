package access1;

public class Access2 {
	public static void main(String[] args) {
		Access1 a1 = new Access1();
		
		System.out.println(a1.data1);
		//Access1의 클래스를 a1에 객체화해서 담고
		//그안에 data1은 디폴트로 값10을 담고있기때문에
		//a1.으로data1값을 접근하면 10을 출력한다.
		
		System.out.println(a1.data2); 
		//data2변수는 퍼블릭으로 되어있어서 어디서든 사용가능!
		System.out.println(a1.data3); 
		//data3변수는 프로텍트로 되어있어서 다른패키지에서는 접근불가지만 같은 패키지는 접근 가능!!
		
		
//		System.out.println(a1.data4); 
//		private으로 되어있기때문에 다른 클래스에서 접근하지못한다.
		
	}
}
