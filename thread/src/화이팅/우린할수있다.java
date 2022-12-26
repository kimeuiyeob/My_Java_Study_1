package 화이팅;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class 우린할수있다 {
	public static int solution(String s) {
//		0을 기준으로 문자열 분리
		ArrayList<String> datas = new ArrayList<String>(Arrays.asList(s.split("0")));
//		각 세트의 "1" 개수를 담아줄 컬렉션
		ArrayList<Integer> lengths = new ArrayList<Integer>();
//		내림차순 결과를 담아줠 컬렉션
		List<Integer> result = null;
		
//		기존의 값을 길이로 변경 후 lengths에 저장
		datas.stream().map(data -> data.length()).forEach(lengths::add);
//		내림차순 후 결과를 List로 변환
		result = lengths.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
//		전달받은 값이 0밖에 없으면 size()는 0이므로 0 리턴
		return result.size() == 0 ? 0 : result.get(0);
	} 
	
	public static void main(String[] args) {
		System.out.println(solution("1101110"));
	}
}











