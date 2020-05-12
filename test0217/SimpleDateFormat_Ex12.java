package test0217;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateFormat_Ex12 {

	public static void main(String[] args) {
		try {
			String s="2000-10-10";
			SimpleDateFormat f=new SimpleDateFormat("yyy-MM-dd");
			Date date =f.parse(s);
			Calendar cal=Calendar.getInstance();
			
		// Date -> Calendar
			cal.setTime(date);
			System.out.printf("%tF\n",cal);
			
		// Calendar -> Date
			Date date2=cal.getTime();
			System.out.println(date2);
			
			
		} catch (Exception e) {
			e.printStackTrace(); //너 왜 문제가 발생했어? 라고 알려주는거
		}
		
	}
}
