package test0207;

import java.util.Scanner;

public class Arr_Carlender {
//1~10까지 난수를 한줄에 10개씩 출력하고, 마지막에 각 숫자의 발생횟수 출력.
//(int)(Math.random()*10)+1
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int[] month= {31,0,31,30,31,30,31,31,30,31,30,31}; //[0](1월)~[11](12월)
		String[] week= {"일","월","화","수","목","금","토"};
		int y,m,d;
		
		do {
			System.out.println("년도?");
			y=sc.nextInt();  //년도 입력
		} while(y<0);
		do {
			System.out.println("월?");
			m=sc.nextInt();  //월입력
		} while(m<1||m>12);  
		
		//2월 날수 계산
		if(y%4==0&&y%100!=0||y%400==0) 
			month[1]=29; //month[1](2월저장되어있음)에 29일때
		else
			month[1]=28; //month[1](2월저장되어있음)에 28일때
		do {
			System.out.println("일?");
			d=sc.nextInt();
		} while(d<1 ||d>month[m-1]);  //배열은 0부터 시작이여서 해당값은 주소에서 1을 빼줘야 한다.
		
		//2020년 4월 20일이 몇요일인지 계산
		//1년 1월 1일은 월요일
		//전체날수 계산하기 
		//1.1.1~2019.12.31 + 2020.1.1~2020.4.20
		//전체날수= 2019년*365일 +(2019/4-2019/100 -2019/400)//366일 인 경우;
		//전체날수+= (1월,2월,3월)
		//전체날수 += 20일
		int tot;  //전체 날 수의 변수
		tot=(y-1)*365 + ((y-1)/4-(y-1)/100+(y-1)/400);//2019년*365일 +(2019/4-2019/100 -2019/400)
		for(int i=0 ; i<m-1;i++) {		//전체날수+= (1월,2월,3월)
			tot+=month[i]; 
		}
		tot+=d;		//전체날수 += 20일
		System.out.printf("%d년  %d월 %d는 %s요일\n",y,m,d,week[tot%7]); //week[tot%7]나머지값이 배열방으로 들어가서 요일출력
		
		sc.close();
	}

}
