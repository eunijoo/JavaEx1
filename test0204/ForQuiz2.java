package test0204;

import java.util.Scanner;
//1-9 사이의 정수를 입력받아 입력받은 수의 구구단을 출력하는 프로그램.
public class ForQuiz2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n,num,s; //n: 정수변수, num:입력받은수 변수,s:곱셈값저장변수
		s=1; //s는 곱셉이여서 최소값 1로 초기화해줌.
		do {  //무조건 한번은 실행됨.
			System.out.println("단?");
			num=sc.nextInt();	
		}while(num<1 || num>9); //num이 1미만,9초과일때 입력문이 반복된다.
		
		for(n=1;n<=9;n++) { //1단부터9단까지 ;1씩 증가
			s=(num*n); //곱셈식을 s변수에 저장.
			System.out.println(num +"*"+n+"="+s);//단을반복적으로 출력해야해서 for문안에 씀.	
		}
		sc.close();
	}
}
		
	
	

	



