package arrayListTask;
import java.util.ArrayList;
import java.util.List;

public class Generics {

	public static void main(String[] args) {

		ArrayList<String> arrList = new ArrayList<String>();

		arrList.add("박지성");
		arrList.add("손흥민");
		arrList.add("기성용");

		for (int i = 0; i < arrList.size(); i++) {
			System.out.println("arrList : " + arrList.get(i));
		}

		List<Integer> list = new ArrayList<Integer>();
		list.add(123);
		list.add(456);
		list.add(789);

		for (int i = 0; i < list.size(); i++) {
			System.out.println("list : " + list.get(i));
		}
	}

}
