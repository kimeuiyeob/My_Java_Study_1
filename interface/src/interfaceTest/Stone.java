package interfaceTest;

public class Stone extends PetAdapter {

	@Override
	public void sitDown() {
		System.out.println("앉는다.");
	}

	@Override
	public void waitNow() {
		System.out.println("기다린다.");
	}
}
