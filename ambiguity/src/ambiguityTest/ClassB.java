package ambiguityTest;

public class ClassB extends ClassA implements InterA{
	@Override
	public void printData() {
		InterA.super.printData();
	}
}
