package access1;

class F {
}

public class Access1 {
	
	int data1 = 10; //디폴트 , 다른패키지 접근불가!! 하지만 같은 패키지 접근 가능!!
	public int data2 = 20; //퍼블릭 모든곳에서 접근 가능!!
	protected int data3 = 30;
	private int data4 = 40; //다른 클래스에서 접근 불가.
	
	public Access1() {
		;
	}

	public Access1(int data4) {
		this.data4 = data4;
	}

	public int getData4() {
		return data4;
	}

	public void setData4(int data4) {
		this.data4 = data4;
	}
	

}

