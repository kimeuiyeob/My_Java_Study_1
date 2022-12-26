package collectionTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapTest {
	public static void main(String[] args) {
		
//		아이디, 비밀번호, 이름, 나이
		HashMap<String, Object> userMap = new HashMap<String, Object>();
		userMap.put("id", "hds1234");
		userMap.put("pw", "1234");
		userMap.put("name", "한동석");
		userMap.put("age", 20);
		
		System.out.println(userMap.size());
		System.out.println(userMap);
		System.out.println(userMap.get("id"));
		
		Iterator<Entry<String, Object>> iter = userMap.entrySet().iterator();
		
		while(iter.hasNext()) {
			Entry<String, Object> entry = iter.next();
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		Iterator<String> iter2 = userMap.keySet().iterator();
		
		System.out.println("=====================");
		
		while(iter2.hasNext()) {
			System.out.println(iter2.next());
		}
		
		System.out.println("=====================");
		
		for (Object value : userMap.values()) {
			System.out.println(value);
		}
		
	}
}













