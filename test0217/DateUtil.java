package test0217;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
String 형 날짜를 Date형으로 변환
strDate 변환할 날짜
변환된 Date
*/


public class DateUtil {
	public static void main(String[] args) {
		
		public Date toDate(String strDate) {
			Date date=null;
		
			try {
				strDate.replaceAll("(\\-|\\.|/)", "");
				if(strDate.length()!=8) {
					//예외던진다.
					return null;
				}
			SimpleDateFormat f= new SimpleDateFormat("yyyy-MM-dd");
			} catch (Exception e) {
				//예외 던진다.
			  }
			return date;
		}	
		
		public String toString(Date date) {
			String s=null;
		//Date -> String 변환
			SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd");
			s=f.format(date);
			return s;						
		}
		
	}
}