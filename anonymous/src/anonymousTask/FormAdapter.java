package anonymousTask;

// Form의 강제성 소멸
public abstract class FormAdapter implements Form{

	@Override
	public String[] getMenu() {return null;}

	@Override
	public void sell(String order) {}

}
