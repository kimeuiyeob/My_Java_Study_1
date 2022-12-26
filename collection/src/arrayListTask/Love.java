package arrayListTask;

public class Love {
//	이름, 나이
//	private
	private int number;
	private String name;
	private int age;
	
//	기본 생성자
	public Love() {;}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	//	toString()
	@Override
	public String toString() {
		String str = number + "," + name + "," + age + "살";
		return str;
	}
}













