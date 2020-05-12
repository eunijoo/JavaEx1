package test0203;

import java.util.Scanner;

public class IfQuiz6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a,b;
		char oper;
		
		System.out.println("두수?");
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.println("연산자[+-*/]입력");
		oper=sc.next().charAt(0);
		
		if(oper == '+') {
			System.out.printf("%d + %d = %d",a,b,a+b);			
		} else if (oper == '-') {
			System.out.printf("%d - %d = %d",a,b,a-b);
		}else if (oper == '*') {
			System.out.printf("%d * %d = %d",a,b,a*b);
		}else if (oper == '/') {
			System.out.printf("%d / %d = %d",a,b,a/b);
		}else {
			System.out.println("연산자 입력오류!!!");
		}
			
		sc.close();	

	}

}
