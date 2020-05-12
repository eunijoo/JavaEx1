package test0207;

import java.util.Scanner;

public class Arr_Quiz4 {
//년,월을 입력받아 입력받은 날짜의 달력을 출력하는 프로그램.
//입력한 월이 1~12 사이의 수가 아니면 다시 입력받는다.
//달력은 배열을 이용하여 작성.

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] month= {31,0,31,30,31,30,31,31,30,31,30,31};  //한달에 몇일까지있는지 배열에 저장
		String [] week = {"일","월","화","수","목","금","토"};	//요일을 배열에 저장.
		int y,m,d;  //y:년도 입력받는수 , m:월입력받는수, d:날짜 
		int tot;//입력한 월의 전월까지 날 수.
		
		 //년도 입력구문 //1900보다 적은수 입력하면 다시입력.		
		do {  
			System.out.println("년도? : ");
			y=sc.nextInt(); 
		}while(y<1900);
		
		//월 입력구문 //1-12사이수가 아닌 수 입력하면 다시입력.
		do { 
			System.out.println("월? : ");
			m=sc.nextInt();
		}while(m<1||m>12);
		
		//2월(윤년계산)
		if(y%4==0&&y%100!=0||y%400==0) {  //배열에서 month[1](2월공간)에는 0이 저장되어있어 조건값에 따라 29,28을 따로 저장입력해줌.
			month[1]=29; //month[1](2월저장되어있음)에 29일때
		}else {
			month[1]=28; //month[1](2월저장되어있음)에 28일때
		}
		
		//전체 날수계산 구문 //1년1월1일은 월요일
		
		//365일 경우 + 366일(윤년)경우 계산 구문
		tot=(y-1)*365 + ((y-1)/4-(y-1)/100+(y-1)/400);//2019년*365일 +(2019/4-2019/100 -2019/400) 
		
		//입력한 월의 전월 계산
		for(int i=0 ; i<m-1;i++) {		//전체날수+= (1월,2월,3월)의 배열로가서 저장된 날수를 불러와 계산함.
			tot+=month[i]; 
		}
		tot+=1;		//전체날수 + 해당 월의 1일
		//System.out.printf("%d년 %d월\n",y,m);
		System.out.printf("     %d년  %d월",y,m);
		System.out.println("\n=====================");
		
		//요일계산
		for(int i=0; i<week.length; i++) { //0부터 week.length (배열의 길이값 까지 반복) -> 배열길이 :7
			System.out.printf(week[i]);//week[i]가 배열방으로 들어가서 요일출력(전체출력)
			System.out.printf("  ");
		
		}
		System.out.print("\n");
		
		//해당월에 시작일과 시작요일 계산해서 출력하는 구문
		d=tot%7; //d: 전체 일수를 7로 나눠서 해당 요일을 구함.
		if(d!=0) {  //d가 0이 아닐경우
			for(int i=0;i<d;i++) {
				System.out.print("   ");
			}
		}
		
		//전체 날짜 출력
		for(int i=1;i<=month[m-1];i++) {  //해당월 배열에서 저장되어있는 날짜 가져옴.month[m-1]:입력한 월에서 -1을 해야 해당주소로가짐
			System.out.printf("%2d ",i);
			if((d+i)%7==0 && i<month[m-1]) {
				System.out.println();
			}
		}
		System.out.println("\n=====================");
		
		//7일마다 엔터
//		if(d%7==0) {
//			System.out.println();
//		}
//		
		
		//System.out.printf(y,m); //week[tot%7]나머지값이 배열방으로 들어가서 요일출력
		sc.close();		
	}	
}		

	


