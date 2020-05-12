package test0204;

import java.util.Scanner;

public class ForQuiz7 {
//두개의 정수를 입력받아 입력받은 수 중 적은수에서 큰수사이(두 정수를 포함)에 
//3의 배수이거나 5의 배수인 수들의 합과 평균을 출력하는 프로그램.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n,num1,num2,s; //n:정수변수 num1,num2: 입력받는정수의 변수. s:합계 변수
		int cnt,ave; //cnt:숫자세는 변수. ave: 평균변수
		
		System.out.println("두 정수");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		if(num1>num2) { //num2가 num1보다 작은수 일 경우 num1값과 num2값을 바꿔줌 
			n=num1; num1=num2;num2=n; //n이라는 변수를 이용해서 값을 변경			
		}
		s=cnt=0; //합계변수와 숫자세주는 변수는 0부터 시작해야하니깐 0으로 초기화
		for(int i=num1;i<=num2;i++) {
			if(i%3==0 || i%5==0) { //3또는 5의 배수의 합구해주는 구문
				s+=i; 
				cnt++;
			}	
		}	
		ave=(int)(s/cnt);
		System.out.println("합 : "+s);
		System.out.println("평균 : "+ave);
		sc.close();
	}
}


