package interfaceTest;

public interface Pet {
//	상수와 추상메소드만 존재
	final static int eyes = 2;
	int nose = 1;

	public abstract void bang();

	public void giveYourHand();

	public void bite();

	public void sitDown();

	public void waitNow();

	public void getNose();
}
