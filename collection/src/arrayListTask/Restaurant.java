package arrayListTask;

import java.util.ArrayList;

public class Restaurant {
//	음식 정보를 담을 DB 선언
	public static ArrayList<Food> foods = new ArrayList<Food>(); //Food 클래스 타입으로 foods ArrayList생성
	
//	음식 추가
	public void add(Food food) { //add메소드 선언 -> Food 타입의 food 매게변수 받으면 foods ArrayList에 담긴다.
		foods.add(food);
	}
	
//	양식인지 중식인지 일식인지 한식인지 검사(문자열로 리턴)
//	예)스파게티 입력 시 "양식"리턴
	public String checkKinds(String name) { 
		//checkKinds메소드 선언 -> name으로 매게변수 받으면 foods안에 있는 값들을 다 반복돌아 foods리스트에 있는 이름들을 다 갖고와서
		//현재 매게변수 이름에 입력한 값이 같다면 그 이름의 종류를 리턴해준다.
		for (Food food : foods) {
			if(food.getName().equals(name)) {
				return food.getKinds();
			}
		}
		return null; //만약 같은게 없다는 null을 리턴해준다.
	}
	
//	사용자가 원하는 종류의 음식 목록 조회(종류는 한 가지만 입력가능)
//	예)한식 입력 시 한식만 조회
	public ArrayList<Food> getFoods(String kinds){ //ArrayList<Food>타입으로 getFoods 메소드 선언 , 종류를 매게변수받고
		ArrayList<Food> results = new ArrayList<Food>(); //ArrayList<Food>를 results에다 객체화한다.
		for (Food food : foods) { // foods 리스트에 있는 값들 반복돌려
			if(food.getKinds().equals(kinds)) {//입력한 종류와 foods리스트에 있는 종류가 이름이 같다면
				results.add(food); //그값들만 results 리스트에 저장한다
			}
		}
		return results; //그럼 여기에는 내가 입력한 종류 
	}
	
//	음식의 종류 수정(가격 10% 상승)
//	예)한식 -> 중식, 음식 가격은 10% 상승
	public void updateKinds(Food food) {
		for (Food temp : foods) {
			if(temp.getName().equals(food.getName())) {
				temp.setKinds(food.getKinds());
				temp.setPrice((int)(temp.getPrice() * 1.1));
				break;
			}
		}
	}
	
//	사용자가 원하는 종류의 음식 개수 조회
//	예) 불고기, 제육볶음, 파스타, 초밥
//	한식 입력 시 2개
	public int getCount(String kinds) {
		return getFoods(kinds).size();
	}
}












