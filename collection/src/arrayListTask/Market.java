package arrayListTask;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public class Market {
//	과일들을 저장할 DB 선언
	public static ArrayList<Fruit> fruits = new ArrayList<Fruit>();
	
//	과일 추가
	public void add(Fruit fruit) {
		fruits.add(fruit);
	}

//	과일 삭제
//	과일의 이름을 외부에서 전달받는다.
	public void remove(String name) {
	//	for (int i = 0; i < fruits.size(); i++) {
			
	//	빠른 for문에서 반복자 자리에 있는 객체의 데이터에 변화가 생기면
	//	반복에 대한 기준점이 수정되는 것이므로 오류가 발생한다.
		try {
			for (Fruit fruit : fruits) {
			//	DB에서 과일의 이름을 검색한다.
				if(fruit.getName().equals(name)) {
//			if(fruits.get(i).getName().equals(name)) {
					//	과일의 이름으로 삭제한다.
					//	과일의 이름이 검색되면 해당 객체를 저장한다.
					//	저장한 객체를 DB에서 삭제한다.
					fruits.remove(fruit);
//				fruits.remove(fruits.get(i));
				}
			}
		} catch (ConcurrentModificationException e) {;}
	}
	
//	과일 가격이 평균 가격보다 낮은 지 검사
	public boolean compare(int price) {
		return price < getAverage();
	}
	
	public double getAverage() {
		int total = 0;
		double avg = 0.0;
		
		for (Fruit fruit : fruits) {
			total += fruit.getPrice();
		}
		
		return avg = Double.parseDouble(String.format("%.2f", total / (double)fruits.size()));
	}
}




















