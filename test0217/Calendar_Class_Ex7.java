package test0217;

import java.util.Calendar;
import java.util.Scanner;
//달력짜기
public class Calendar_Class_Ex7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int y,m,w,ends;
		
		do {
			System.out.print("년도?");
			y=sc.nextInt();
		} while(y<1900);
		
		do {
			System.out.print("월?");
			m=sc.nextInt();
		} while(m <1 || m>12);
		
		Calendar cal=Calendar.getInstance();
		cal.set(y,m-1,1);  //월은 1을 빼야한다.  //1일 입력
		w=cal.get(Calendar.DAY_OF_WEEK);
		ends=cal.getActualMaximum(Calendar.DATE); //마지막날짜까지 돌림
		
		System.out.println("     \t"+y+"년 "+m+"월");
		System.out.println("     일    월     화     수     목     금     토");
		System.out.println("============================");
	
	//시작일
		for(int i=1;i<w;i++) {
			
			System.out.print("    ");  
		}
	//날짜출력	
		for(int i=1;i<=ends;i++) {
			System.out.printf("%4d",i);
			w++;
			if(w%7==1) {   //날짜 다 찍었으면 엔터
				System.out.println();
			}
		}
		
		if(w%7!=1) { 
			System.out.println();
		}
		System.out.println("============================");
		
		sc.close();
	}

}
