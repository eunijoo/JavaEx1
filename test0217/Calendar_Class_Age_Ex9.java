package test0217;

import java.util.Calendar;
//만나이 계산
public class Calendar_Class_Age_Ex9 {

	public static void main(String[] args) {
		Calendar now= Calendar.getInstance();
		Calendar cal= Calendar.getInstance();
		
	//자기생일 대입
		cal.set(1992,9-1,6);
		
	//나이계산(만 나이로 계산)
		int age =now.get(Calendar.YEAR)-cal.get(Calendar.YEAR);
		
	//생일이 지났으면 통과, 생일이 안지났으면 -1	
		if(cal.get(Calendar.MONTH)> now.get(Calendar.MONTH) ||      //월이 안지났거나
		   cal.get(Calendar.MONTH) == now.get(Calendar.MONTH) &&    //같은 월이거나
		   cal.get(Calendar.DATE)> now.get(Calendar.DATE)) { 		//날짜가 안지났거나
			
			age--;			
		}	
		System.out.println("나이 : " +age);
	}
}
