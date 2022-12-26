package classTest;

class Test {
	int data;

	public Test() {;}
	
	public Test(int data) {
		this.data = data;
	}

	void printData() {
		System.out.println(data);
	}
}


public class ClassArray {
	public static void main(String[] args) {
		Test[] arTest = new Test[12];
		
		for (int i = 0; i < arTest.length; i++) {
			arTest[i] = new Test(i + 1);
		}
		
		arTest[10].printData();
		
	}
}



















