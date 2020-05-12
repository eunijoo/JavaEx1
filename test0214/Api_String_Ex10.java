package test0214;

import java.util.Scanner;

/*
이름을 입력받아 입력받은 이름 중 김씨의 인원수 구하기
단, 입력받은 이름이 end이면 프로그램 종료
	---결과---
	이름? 남상현
	이름? 오승현
	이름? 김말자
	이름? end
	김씨  : 1명
 */
public class Api_String_Ex10 {
	public static void main(String[] ss) {
		Scanner sc=new Scanner(System.in);
		
		String name; //입력받는 이름변수
		int cnt;  //인원수 세는 변수
		
		cnt=0;
		
		do {
			System.out.println("이름 입력[종료:end] : ");
			name=sc.next();	
			if(name.startsWith("김")) {
				cnt++;
			}
		}while(! name.equals("end"));  	//end입력시 종료
		
		System.out.println("인원수: "+cnt);
		
		sc.close();
	}
}
