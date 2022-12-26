package dateTest;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarTask {
	public static void main(String[] args) {
//		본인의 생년월일 출력
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
		Calendar calendar = Calendar.getInstance();
//		calendar.set(2000, 11, 4);
//		calendar.set(Calendar.YEAR, 2000);
//		calendar.set(Calendar.MONTH, 11);
//		calendar.set(Calendar.DATE, 4);
		System.out.println(simpleDateFormat.format(calendar.getTime()));
		
	}
}
