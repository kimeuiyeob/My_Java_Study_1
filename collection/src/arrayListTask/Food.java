package arrayListTask;

public class Food { //Food 클래스 생성
//	이름, 가격, 종류(한식, 중식, 일식, 양식)
//	private
	private String name; //이름,가격,종류
	private int price;
	private String kinds;
	
//	기본 생성자
	public Food() {
		System.out.println("생성자 메소드 호출");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getKinds() {
		return kinds;
	}

	public void setKinds(String kinds) {
		this.kinds = kinds;
	}
	
//	toString()
	@Override
	public String toString() { //toString 재정의
		String str = name + ", " + price + ", " + kinds;
		return str;
	}
}




















