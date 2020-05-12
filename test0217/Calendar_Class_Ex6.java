package test0217;

import java.util.Calendar;

public class Calendar_Class_Ex6 {

	public static void main(String[] args) {
//상현이가 2020년 2월 10일 여자친구를 처음 만났다. 100일 후는?
		
		Calendar cal=Calendar.getInstance();
		
	//2020년 2월 10일로 변경(값을 넣어줌)
		
		cal.set(2020,2-1,10);  //월은 인덱스값이므로 값을 가져올땐+1  값을 넣어줄땐 -1
	
	//100일 후는?
		
		cal.add(Calendar.DATE,100);
		System.out.printf("%tF\n",cal);
	
//몇일 살았는지 계산
		Calendar now =Calendar.getInstance();
		//System.out.println(now.getTimeInMillis()); // 현재날짜를 millisecond 으로 변경
		
	//현재날짜를 1970sus 1월 1일 기준으로 ms로 환산
		System.out.println(now.getTimeInMillis());
		
		cal.set(1992,9-1,6);	
		long days = ((now.getTimeInMillis()-cal.getTimeInMillis())/(1000*60*60*24));	
		System.out.println(days);
	}

}
