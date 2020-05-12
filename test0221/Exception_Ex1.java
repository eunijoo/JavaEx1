package test0221;

import java.util.Scanner;

/* 
 * 예외처리 why? 프로그램을 안죽이고 클라이언트에게 문제를 말해줌
 * 	1) 10/0= error 발생  => 0은 연산불가능
 * 	2) 영문자를 입력해서 error 발생
 * 	3) 소숫점을 입력해서 error 발생
 * 	4) int 범위를  넘어간 숫자를 입력해서 error 발생
 * => 여러가지 에러를 if로만 해결하기에는 역부족
 * 
 * stack overflow error = 재귀호출_자기자신을 부르다가 저장공간 stack 넘침
 * 
 * 논리적 에러 : 은행이율계산(수식복잡). 컴파일/런타임은 없는데 연산결과가 다른경우 
 * 
 */

public class Exception_Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;

		System.out.print("두 정수? ");	//정상일때
		a = sc.nextInt();
		b = sc.nextInt();
		if(b==0) { 						//비정상일때
			System.out.println("0으로 나눌수없어요");
		}

		c = a / b;

		System.out.println(a + " / " + b + " = " + c);

		System.out.println("end...");

		sc.close();
	}
}
