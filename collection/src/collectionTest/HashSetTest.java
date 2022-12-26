package collectionTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class HashSetTest {
	public static void main(String[] args) {
		
		HashSet<String> bloodTypes = new HashSet<String>();
		//HashSet은 중복값이 가능하지 않다. 순서도 정해지지 않는다.
		
		bloodTypes.add("A");
		bloodTypes.add("B");
		bloodTypes.add("O");
		bloodTypes.add("AB");
		bloodTypes.add("AB");
		bloodTypes.add("AB");
		bloodTypes.add("AB");
		bloodTypes.add("AB");
		bloodTypes.add("AB");
		
//		System.out.println(bloodTypes); //중복된 값이 사라지고 순서도 마음대로인걸 확인할수 있다.
		
		List<String> bloodTypeList = new ArrayList<String>(bloodTypes); //여기서 bloodTypeList객체에 bloodTypes값들을 넣어준다.
		
//		System.out.println(bloodTypeList.get(0)); //이러면 첫번째 방은 A이기 때문에 A가 출력된다.
		
//		System.out.println(bloodTypes);
		
		Iterator<String> iter = bloodTypes.iterator(); //iterator()은 bloodTypes의 값들을 불러올수있다.
		
		while(iter.hasNext()) { //iter에 값이 있다면 hasNext()가 그값들을 읽어와 true를 반환해주고
			System.out.println(iter.next()); //그 값들을 next()로 반환해준다.
		}
		
//		Iterator는 이런 집합체로부터 정보를 얻어낸다고 볼 수 있다. 
//		집합체를 다룰 때는 개별적인 클래스에 대해 데이터를 읽는 방법을 알아야 하기 때문에 각 컬렉션에 접근이 힘들어진다.
//		iterator를 쓰게 되면 어떤 컬랙션이라도 동일한 방식으로 접근이 가능하여 그 안에 있는 항목들에 접근할 수 있는 방법을 제공한다.(다형성)
//		 
//		Iterator 메소드에는 hasNext(), next(), remove()가 있다.
//		
//		hasNext() : 읽어올 요소가 남아있는지 확인하는 메소드이다. 요소가 있으면 true, 없으면 false
//		next() : 다음 데이터를 반환한다.
//		remove() : next()로 읽어온 요소를 삭제한다.
//		 
//		메소드 호출 순서는 hasNext() -> next() -> remove()이다.
	}
}















