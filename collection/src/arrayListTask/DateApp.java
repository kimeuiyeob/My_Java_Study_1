package arrayListTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DateApp {
//	이상형 정보를 담을 DB
	public static ArrayList<Love> loves = new ArrayList<Love>();
	
//	이상형 추가
	public void add(Love love) {
		loves.add(love);
	}
	
//	사용자가 입력한 나이인 이상형 목록 조회
	public ArrayList<Love> getList(int age) {
		ArrayList<Love> selected = new ArrayList<Love>();
		
		for (Love love : loves) {
			if(love.getAge() == age) {
				selected.add(love);
			}
		}
		return selected;
	}
	
//	이상형의 나이 수정
//	이상형의 번호를 추가하고 번호로 조회한다.
//	이름이 똑같으면 어떻게 수정하지?
//	구분점이 필요하다, 고유한 값이 필요하다
	public void update(Love love) {
		for (Love db : loves) {
			if(db.getNumber() == love.getNumber()) {
//				객체 통채로 변경
				loves.set(loves.indexOf(db), love);
//				기존 객체의 필드 변경
//				db.setAge(love.getAge());
				break;
			}
		}
	}
	
//	이상형의 나이 순으로 정렬하기
	public void sort() {
//		이상형의 나이만 담을 ArrayList
		ArrayList<Integer> ages = new ArrayList<Integer>();
		
//		오름차순으로 정렬된 이상형 정보를 담을 ArrayList
		ArrayList<Love> loves = new ArrayList<Love>();
		
		for (Love love : this.loves) {
//			이상형의 나이만 담아주기
			ages.add(love.getAge());
		}
		
//		나이 오름차순 정렬 
		Collections.sort(ages);

		for (int i = 0; i < DateApp.loves.size(); i++) {
//			정렬된 나이 ArrayList에서 첫번째 나이부터 비교
			for (Love love : DateApp.loves) {
				if(ages.get(i) == love.getAge()) {
//				찾았다면 순서대로 loves에 담아주기
					loves.add(love);
				}
			}
		}
//		오름차순으로 정렬된 전체 정보를 DB에 저장
		DateApp.loves = loves;
	}
}










