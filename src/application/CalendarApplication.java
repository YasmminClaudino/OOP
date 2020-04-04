package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class CalendarApplication {

	public static void main(String[] args) {
		SimpleDateFormat simpleData = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
		Date date = Date.from(Instant.parse("2020-04-04T19:00:00Z"));
		System.out.println(simpleData.format(date));

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		
		calendar.add(Calendar.HOUR, 3);
		date = calendar.getTime();
		System.out.println(simpleData.format(date));
		
		
		
	}

}
