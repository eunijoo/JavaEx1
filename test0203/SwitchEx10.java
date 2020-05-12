package test0203;
//년도와 월을 입력받아 월의 마지막날짜 출력
//2월 : 년도가 4의배수이고,100의배수가 아니거나 400의 배수이면 29일,그렇지 않으면 28일

import java.util.Scanner;

public class SwitchEx10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		int y,m,d;
		
		System.out.println("년도?");
		y=sc.nextInt();
		System.out.println("몇월?");
		m=sc.nextInt();
		
		switch(m) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			d=31; break; //31일인 월
		case 4: case 6: case 9: case 11:
			d=30; break;//30일인 월
		case 2: //2월은 2가지 경우가 있어서 if문 써야함.
			if(y%4==0 && y%100!=0 || y%400==0) {
				d=29; 
			}else {
				d=28;
			}
			break;
		default : d=0; break; //입력값오류때문에 d를 초기화시켜줌.
		}
		if(d!=0) {
			System.out.println(y+"년"+m+"월 마지막 날짜는 "+d+"일입니다.");		
		}else {
			System.out.println("입력오류");
		}
		sc.close();
	
	}
}
