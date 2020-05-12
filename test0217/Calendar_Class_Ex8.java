package test0217;

import java.util.Calendar;

public class Calendar_Class_Ex8 {

	public static void main(String[] args) {
		Calendar cal= Calendar.getInstance();
		System.out.printf("%tF\n",cal);
		
		cal.set(Calendar.MONTH, 15);  //15월을 찍었는데 15월이 없으면 다음년도로 넘어감.
		System.out.printf("%tF\n",cal);
		
		cal.set(Calendar.DATE, 50);   // 50일을 찍었는데 일수가 없으면 다음날로 넘어간다.
		System.out.printf("%tF\n",cal);	
	}
}
