package test0217;

import java.util.Calendar;
import java.util.Scanner;

public class Calendar_Class_Daily_Ex10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		
		System.out.print("날짜 [yyyy-mm-dd] ?");
		str=sc.next();
		sc.close();  //retrun때문에 위에 써야함
		//실제는 예외처리 해야하지만 아직 예외처리를 배우지 않아서...
		if(str.length()!=10 || str.split("-").length!=3) {
			System.out.println("날짜 입력 형식 오류");
			return;
		}
		
		String[] ss=str.split("-");
		int y=Integer.parseInt(ss[0]);
		int m=Integer.parseInt(ss[1]);
		int d=Integer.parseInt(ss[2]);
		int w,n; //w:요일 n:계산
		
		Calendar cal=Calendar.getInstance();   //오늘 날짜
		cal.set(y,m-1,d);
		w=cal.get(Calendar.DAY_OF_WEEK);
		System.out.printf("날짜 : %tF\n",cal);
		 
	//clone() : 객체 복제(주소는 다르지만 값은 동일(값만 복사함))
	/*  Calendar sday=(Calendar)cal.clone(); 아래 2줄과 유사
		Calendar sday=(Calendar.getInstance();
		sday.set(y,m-1,d); 
	*/
		
	// sday(주시작일) 주소는 다른데 값이 같음		
		Calendar sday=(Calendar)cal.clone();
		n=w-1; //요일에서 1을 뺀 칸만큼 앞으로 이동
		sday.add(Calendar.DATE,n*-1); //n이 음수여야함
		System.out.printf("주 시작: %tF\n",sday); //

	//	eday(주마지막일)주소는 다른데 값이 같음.
		
		Calendar eday=(Calendar)cal.clone();
		eday.add(Calendar.DATE,7-w);
		System.out.printf("주 마지막: %tF\n",eday);
	
	}
}
