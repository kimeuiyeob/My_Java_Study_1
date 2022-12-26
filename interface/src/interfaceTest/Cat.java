package interfaceTest;

public class Cat implements Pet {

	@Override
	public void bang() {
		System.out.println("안한다.");
	}

	@Override
	public void giveYourHand() {
		System.out.println("안한다.");
	}

	@Override
	public void bite() {
		System.out.println("문다.");
	}

	@Override
	public void sitDown() {
		System.out.println("지나간다.");
	}

	@Override
	public void waitNow() {
		System.out.println("안기다린다.");
	}

	@Override
	public void getNose() {
		System.out.println("나를 안본다.");
	}

}
