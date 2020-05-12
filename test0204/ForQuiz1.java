package test0204;

import java.util.Scanner;
//정수를 입력받아 1에서 입력받은 수까지의 합을 구하는 프로그램작성.
public class ForQuiz1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n,s,num; //n:정수변수 , s: 정수합계 , num : 입력받는 정수 변수
		s=0; //합계0부터 시작이여서 0으로 초기화
	
	//do-while구문이 더 쉽게 코딩 가능.			
		do {   //무조건 한번은 꼭 실행
			System.out.println("정수 입력:");
			num=sc.nextInt(); // 입력받을 함수
		}while (1>num||1000<num); ////입력받은 수가 1미만 1000초과일때 while문으로 들어옴
		
		
		for(n=1;n<=num;n++) { //1부터 num까지 ; 1씩 증가
			s+=n; //정수합계 계산
		}
		
		System.out.println("1~"+num+"까지 합 : "+s); 
		sc.close();
	}
}
		
	
	

	



