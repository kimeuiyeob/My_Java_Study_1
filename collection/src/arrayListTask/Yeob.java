package arrayListTask;

import java.util.ArrayList;

public class Yeob {

	public static void main(String[] args) {

//		Arraylist생성하여서 soccerplayer로 이름 짓고 손흥민,호날두,메시를 list에 넣어서 출력하자
//
//		ArrayList<String> soccerPlayer = new ArrayList<String>();
//		
//		soccerPlayer.add("손흥민");
//		soccerPlayer.add("호날두");
//		soccerPlayer.add("메시");
//		
//		for (String string : soccerPlayer) {
//			System.out.println("축구선수 : " + string);
//		}
//		
//		for (int i = 0; i < soccerPlayer.size(); i++) {
//			System.out.println("축구선수 : " + soccerPlayer.get(i));
//		}
		
		
//		list생성해서 숫자타입으로만 받고 이름은 number하고 list에 123,456,789를 넣어서 출력하자
//		
//		List <Integer> number = new ArrayList<>();
//		
//		number.add(123);
//		number.add(456);
//		number.add(789);
//		number.add(111);
//		number.remove(3);
//		number.clear();
//		
//		for (Integer integer : number) {
//			System.out.println("숫자는 : " + integer);
//		}
		   
        ArrayList<Sports> arrList = new ArrayList<Sports>();
        
        arrList.add(new Sports());
        arrList.add(new Soccer());
        arrList.add(new Baseball());
        
        Sports sports = arrList.get(0);
        Soccer soccer = (Soccer) arrList.get(1);
		
	}

}

class Sports{}
class Soccer extends Sports{}
class Baseball extends Sports{}
