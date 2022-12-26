package hashMapTest;

import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonTest {
	public static void main(String[] args) {
		
		HashMap<String, Object> userMap = new HashMap<String, Object>();
		//HashMap은 키값과 밸류 값이 있다. 키값은 중복이 가능하지 않지만 밸류값은 중복이 가능하다.
		
//		 JSONObject
//		 기본구조 : {String name : Value, String name2 : Value2 ...}
//		 JSONObject는 '{' 로 시작하고 '}' 로 끝내어 표현한다. 
//		 {} 안에는 String으로된 Name과 Value의 쌍을 ':' 로 구분하여 사용한다.
//		 Name 과 Value의 구분은 ',' 로 한다.
		
		JSONObject userJSON = null; 
		JSONArray users = new JSONArray();
		
		userMap.put("id", "hds1234"); //HashMap은 객체에다 값을 넣기위해서는 put을 사용한다.
		userMap.put("pw", "1234");	  //앞에는 키값과 뒤에는 밸류 값이다.
		userMap.put("name", "한동석");
		userMap.put("age", 20);
		
		userJSON = new JSONObject(userMap);
		//userMap을 ()안에 넣으면 JSONObject형식으로 변환된 값을 userJSON에 넣고
		System.out.println(userJSON); 
		//출력하면 {} 안에 Name과 Value의 쌍을 ':'이렇게 나누어서 출력된다. 이게 JSON형식인거 같다.
		
		users.add(userJSON); //JSONArray 타입의 users객체에 저 값들을 추가한다.
		
		userMap.put("id", "hgd1234");
		userMap.put("pw", "5555");
		userMap.put("name", "홍길동");
		userMap.put("age", 25);
		
		userJSON = new JSONObject(userMap);
		
		users.add(userJSON);  //JSONArray 타입의 users객체에 저 값들을 추가한다.
		
		System.out.println(users); //이러면 JSON형식으로 userMap값이 출력된다.
		
		System.out.println(((JSONObject)users.get(1)).toJSONString());//여기는 get(1)로 인덱스 2번째 방에있는 객체를 출력한다.
		
	}
}















