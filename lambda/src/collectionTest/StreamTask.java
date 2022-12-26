package collectionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamTask {
	public static void main(String[] args) {
//		1~10까지 ArrayList에 담고 출력
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.range(1, 11).forEach(datas::add);
//		System.out.println(datas);
		
//		1~100까지 중 홀수만 ArrayList에 담고 출력
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.range(1, 101).filter(v -> v % 2 != 0).forEach(datas::add);
//		IntStream.range(1, 51).map(v -> v * 2 - 1).forEach(datas::add);
//		System.out.println(datas);
		
//		ABCDEF를 각 문자별로 출력
//		String data = "ABCDEF";
//		data.chars().forEach(v -> System.out.print((char)v));
//		IntStream.rangeClosed('A', 'F').forEach(c -> System.out.println((char)c));
		
//		A~F까지 ArrayList에 담고 출력
//		ArrayList<Character> datas = new ArrayList<Character>();
//		IntStream.rangeClosed('A', 'F').forEach(c -> datas.add((char)c));
//		System.out.println(datas);
		
//		map()
//		A~F까지 중 D제외하고 ArrayList에 담고 출력
//		ArrayList<Character> datas = new ArrayList<Character>();
//		IntStream.rangeClosed('A', 'E').map(v -> v > 67 ? v + 1 : v).forEach(v -> datas.add((char)v));
//		System.out.println(datas);
		
//		map()
//		5개의 문자열을 입력받은 후 모두 소문자로 변경(String.toLowerCase())
//		System.out.println("ABC".toLowerCase());
//		ArrayList<String> datas = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PINk"));
//		datas.stream().map(String::toLowerCase).forEach(System.out::println);
		
//		filter()
//		Apple, banana, Melon 중 첫번째 문자가 대문자인 문자열 출력
//		ArrayList<String> datas = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon"));
//		datas.stream().filter(fruit -> fruit.charAt(0) >= 'A').filter(fruit -> fruit.charAt(0) <= 'Z').forEach(System.out::println);
		
//		chars(), map(), forEach()
//		한글을 정수로 변경
//		String hangle = "공일이삼사오육칠팔구";
//		String data = "일공이사";
//		data.chars().map(hangle::indexOf).forEach(System.out::print);
		
//		정수를 한글로 변경
//		String hangle = "공일이삼사오육칠팔구";
//		String data = "1024";
//		data.chars().map(c -> c - 48).forEach(c -> System.out.print(hangle.charAt(c)));
	}
}

















