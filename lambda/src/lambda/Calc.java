package lambda;

@FunctionalInterface
public interface Calc {
//	두 정수를 전달받은 후 더하거나 빼서 리턴한다.
	public int calc(int number1, int number2);
}
