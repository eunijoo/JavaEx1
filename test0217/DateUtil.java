package test0217;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
String �� ��¥�� Date������ ��ȯ
strDate ��ȯ�� ��¥
��ȯ�� Date
*/


public class DateUtil {
	public static void main(String[] args) {
		
		public Date toDate(String strDate) {
			Date date=null;
		
			try {
				strDate.replaceAll("(\\-|\\.|/)", "");
				if(strDate.length()!=8) {
					//���ܴ�����.
					return null;
				}
			SimpleDateFormat f= new SimpleDateFormat("yyyy-MM-dd");
			} catch (Exception e) {
				//���� ������.
			  }
			return date;
		}	
		
		public String toString(Date date) {
			String s=null;
		//Date -> String ��ȯ
			SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd");
			s=f.format(date);
			return s;						
		}
		
	}
}