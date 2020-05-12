package test0131;

import java.util.Scanner;

public class OperEx5 {

	public static void main(String[] args) {
/*	
		int a=10,b=5;
		int c;
		
		c=a>b ? a:b;
		System.out.println("큰값 :"+c);
*/
		//정수를 입렵 받아 절대값 구하기
		Scanner sc=new Scanner(System.in);
		int a,b;
		
		System.out.println("정수?");
		a=sc.nextInt();
		
		//절대값 구하기
		b=a>0 ? a:-a; // (조건식 ? 값/연산식 : 값/연산식)
		System.out.println(a+"의 절대값 :"+b);
		
		sc.close();
	}
}
