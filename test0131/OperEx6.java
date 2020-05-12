package test0131;

import java.util.Scanner;

public class OperEx6 {

	public static void main(String[] args) {
		//정수를 입력받아 짝수인지 홀수인지 판별
		Scanner sc=new Scanner(System.in);
		int a;
		String s;
		 
		System.out.println("정수?");
		a=sc.nextInt();
		
		s=a%2==0 ? "짝수" : "홀수"	; //(조건식 ? 값 : 값)
		//s=(a&1)==0 ? "짝수" : "홀수"	; // & 연산자로 짝/홀 판별하는 다른방법
		System.out.println(a+":"+s);
		
		sc.close();

	}

}
