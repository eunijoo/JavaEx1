package test0217;

import java.util.Calendar;

public class Calendar_Class_Ex5 {

	public static void main(String[] args) {
		//Calendar : 추상 클래스(미완성 클래스)
					//추상 클래스는 객체를 직접 생성 불가
	//	Calender cal = Calender.getInstance(); //컴오류
	//	Calender cal = new Calender(); //컴오류
		
/*
		- 객체 생성 방법
		1> Calendar cal=Calendar.getInstance();
		2> Calendar cal=new GregorianCalendar();
		3> GregorianCalendar cal=new GregorianCalendar();
		GregorianCalendar : Calendar 클래스의 하위클래스
 */
		Calendar cal=Calendar.getInstance();  //컴퓨터시스템의 날짜,시간을 가지고 있다.
		
		String s= String.format("%tF %tA %tT",cal,cal,cal); // 현재 년월일, 요일,시간 출력
	//	String s1= String.format("%1$tF %1$tA %1$tT",cal); // 현재 년월일, 요일,시간 출력
		System.out.println(s);
		
	//년,월,일,요일 함수로 가져오기
		//가져오는거 get //내보내는거  set
		int y=cal.get(Calendar.YEAR);
		int m=cal.get(Calendar.MONTH)+1; //+1을 해주면 1월부터 나옴
					//get(Calendar.MONTH)  : 0-11(인덱스개념)까지 돌려줌
		int d=cal.get(Calendar.DATE);
		int w= cal.get(Calendar.DAY_OF_WEEK);
					//1~7:일~토
		String[]ww= {"일","월","화","수","목","금","토"};	
		System.out.printf("%d년 %d월 %d일 %s요일\n",y,m,d,ww[w-1]);
	
	//이번달이 몇일까지 있는지 출력	
		int days= cal.getActualMaximum(Calendar.DATE);
		System.out.println("이번달은 "+days+"일 까지 있습니다.");
	}

}
