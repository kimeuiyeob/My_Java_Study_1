package collectionTest;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
	
	public static void test(int data) {
		data = 20;
	}
	
	public static void main(String[] args) {
		
//		<?> : 제네릭(이름이 없는)
//		객체화 시 타입을 지정하는 기법.
//		설계할 때에는 타입을 지정할 수 없기 때문에 임시로 타입을 선언할 때 사용한다.
//		따로 다운 캐스팅을 할 필요가 없다.
//		지정할 타입에 제한을 줄 수 있다.
		
		ArrayList<Integer> datas = new ArrayList<>();
//		이렇게 되면 수서대로 10~60까지 값들이 datas객체에 담기게된다.
//		ArrayList는 add()라는걸 통해서 값을 넣어준다.
		
		datas.add(10);
		datas.add(20);
		datas.add(30);
		datas.add(40);
		datas.add(50);
		datas.add(90);
		datas.add(80);
		datas.add(70);
		datas.add(60);
		
//		System.out.println(datas.size()); //그리고 size()를 통해 몇개의 값들이 있는지 알려준다 == 9개가 출력된다.
//		for (int i = 0; i < datas.size(); i++) {
//			System.out.println(datas.get(i));
//		}
		
//		System.out.println(datas);
//		
//		Collections.sort(datas);
//		System.out.println(datas);

	
//		Collections.reverse(datas);
//		System.out.println(datas);
	
//		Collections.shuffle(datas);
//		System.out.println(datas);
		
//		추가(삽입)
//		50뒤에 500삽입
//		if(datas.contains(50)) { //contains()라는건 검색을 해준다고 생각하자! , 
//			datas.add(datas.indexOf(50) + 1, 500);
//		}
//		System.out.println(datas);
		
//		수정
//		90을 9로 수정
//		if(datas.contains(90)) {
//			System.out.println(datas.set(datas.indexOf(90), 9) + "이 9로 변경되었습니다.");
//		}
//		System.out.println(datas);
		
//		삭제
//		80 삭제
//		1. 인덱스로 삭제
//		if(datas.contains(80)) {
//			System.out.println(datas.remove(datas.indexOf(80)) + " 삭제");
//		}
//		System.out.println(datas);
		
//		2. 값으로 삭제
//		if(datas.remove(Integer.valueOf(80))) {
//			System.out.println("삭제 완료");
//		}
	}
}













