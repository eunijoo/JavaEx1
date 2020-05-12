package test0218;

import java.text.SimpleDateFormat;
import java.util.Date;


public class SimpleDateFormat_Ex5 {
	public static long diffOfDay(String begin,String end) {
		long diff=0;
		try {
			SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
			begin = begin.replaceAll("(\\-|\\.|\\/)", "");
			end = end.replaceAll("(\\-|\\.|\\/)", "");
			
			Date d1= sdf.parse(begin);
			Date d2= sdf.parse(end);
			
			diff = (d2.getTime()-d1.getTime())/(1000*60*60*24);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return diff;
	}
	public static void main(String[] args) {
		try {
			Date date =new Date();
			SimpleDateFormat sdf=new SimpleDateFormat("yyyyÒ´ MMêÅddìí HH:mm:ss"); //
			
			String s=sdf.format(date);
			System.out.println(s); //2020Ò´ 02êÅ18ìí 10:07:44
			
			sdf=new SimpleDateFormat("yyyy-MM-dd");
			s="2000-10-10";
			Date date2=sdf.parse(s);
			System.out.println(date2);
		//Å©¸®½º¸¶½º±îÁö ¾ó¸¶³ª ³²¾Ò³ª?	
			long a=diffOfDay("20200218","20201225");
			System.out.println(a);
			
		} catch (Exception e) {
		
		}
	}

}
