package test0207;

import java.util.Arrays;
import java.util.Scanner;

public class Arr_Quiz4 {
//년,월을 입력받아 입력받은 날짜의 달력을 출력하는 프로그램.
//입력한 월이 1~12 사이의 수가 아니면 다시 입력받는다.
//달력은 배열을 이용하여 작성.

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] month= {31,0,31,30,31,30,31,31,30,31,30,31};
		String [] week = {"일","월","화","수","목","금","토"};
		int y,m,d;
				
		do {
			System.out.println("년도? : ");
			y=sc.nextInt();
		}while(y<1900);
		
		do {
			System.out.println("월? : ");
			m=sc.nextInt();
		}while(m<1||m>12);
		
		//2월(윤년계산)
		if(y%4==0&&y%100!=0||y%400==0) {
			month[1]=29; //month[1](2월저장되어있음)에 29일때
		}else {
			month[1]=28; //month[1](2월저장되어있음)에 28일때
		}

			//	while(d<1 ||d>month[m-1]) {
			//		System.out.println(d);
			//	}
		//1년1월1일은 월요일
		int tot;  //전체 날 수의 변수
		tot=(y-1)*365 + ((y-1)/4-(y-1)/100+(y-1)/400);//2019년*365일 +(2019/4-2019/100 -2019/400)
		for(int i=0 ; i<m-1;i++) {		//전체날수+= (1월,2월,3월)
			tot+=month[i]; 
		}
		//tot+=d;		//전체날수 += 20일
		System.out.printf("%d년 %d월\n",y,m);

		for(d=1;d<tot;d++) {
		System.out.printf("%d",week[tot%7]);//week[tot%7]나머지값이 배열방으로 들어가서 요일출력
			if(d%7==0) {
				System.out.println();
			}
		}
		//System.out.printf(y,m); //week[tot%7]나머지값이 배열방으로 들어가서 요일출력
		sc.close();		
	}	
}		

	


