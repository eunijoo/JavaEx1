package test0221;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Finally_Ex7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a,b,c;
		
		try {
			System.out.println("두 수?");
			a=sc.nextInt();
			b=sc.nextInt();
			c=a+b;
			System.out.println(c);
		}catch (InputMismatchException e) {
			//	InputMismatchException : unchecked예외
			//							 Scanner의 nextInt()등에서 숫자가 아닌 문자열을 입력한 경우 발생					
			System.out.println("숫자 입력 가능합니다.");
			
			e.printStackTrace(); //에러원인이 정확하게 출력됨.
		} finally {
			System.out.println("예외와 상관없이 실행...");
			sc.close();
		}
	}
}