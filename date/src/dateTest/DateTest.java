package dateTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		Date date = new Date();
		Date time = new Date();
		
		date.setYear(100);
		date.setMonth(11);
		
		System.out.println(date);
		System.out.println(simpleDateFormat.format(date));
		
		try {
			time = simpleDateFormat.parse("2002년 12월 04일 09시 00분 00초");
			System.out.println(time);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
