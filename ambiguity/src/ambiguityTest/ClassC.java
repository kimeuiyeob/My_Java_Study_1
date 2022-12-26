package ambiguityTest;

public class ClassC implements InterA, InterB{
	@Override
	public void printData() {
		InterA.super.printData();
	}
}
