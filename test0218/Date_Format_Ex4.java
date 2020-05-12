package test0218;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Date_Format_Ex4 {
	public static void main(String[] args) {
		DateFormat df;
		Date date =new Date();
		String s;
		
		df=DateFormat.getDateInstance();  //기본으로 2020. 2. 18 출력
		df=DateFormat.getDateInstance(DateFormat.LONG,Locale.KOREA); //한국시간형식으로 변경(2020년 2월 18일 (화))

		s=df.format(date);
		
		System.out.println(s);
	}

}
