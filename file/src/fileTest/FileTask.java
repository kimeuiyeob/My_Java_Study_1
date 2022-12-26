package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTask {
	public static void main(String[] args) throws IOException{
//		고등어, 갈치, 꽁치, 전어 --> 0, 1, 2, 3
		String[] fishs = {"고등어", "갈치", "꽁치", "전어"};
		
//		배열로 출력하고 전체 내용 가져와서 콘솔에 출력하기
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("fish.txt"));
//		for (String fish : fishs) {
//			bufferedWriter.write(fish + "\n");
//		}
//		bufferedWriter.close();
		
//		try {
//			BufferedReader bufferedReader = new BufferedReader(new FileReader("fish.txt"));
//			String line = null;
//			while((line = bufferedReader.readLine()) != null) {
//				System.out.println(line);
//			}
//			bufferedReader.close();
//			
//		} catch (FileNotFoundException e) {
//			System.out.println("없는 경로");
//		}
		
//		수정(갈치 -> 연어)
//		try {
//			BufferedReader bufferedReader = new BufferedReader(new FileReader("fish.txt"));
//			String line = null, temp = "";
//			
//			while((line = bufferedReader.readLine()) != null) {
//				if(line.equals("갈치")) {
//					temp += "연어\n";
//					continue;
//				}
//				temp += line + "\n";
//			}
//			
//			bufferedReader.close();
//			
//			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("fish.txt"));
//			bufferedWriter.write(temp);
//			bufferedWriter.close();
//			
//		} catch (FileNotFoundException e) {
//			System.out.println("없는 경로입니다.");
//		}
		
//		고등어 삭제
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("fish.txt"));
			String line = null, temp = "";
			
			while((line = bufferedReader.readLine()) != null) {
				if(line.equals("고등어")) {
					continue;
				}
				temp += line + "\n";
			}
			
			bufferedReader.close();
			
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("fish.txt"));
			bufferedWriter.write(temp);
			bufferedWriter.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("없는 경로입니다.");
		}
		
	}
}






















