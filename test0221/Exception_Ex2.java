package test0221;

import java.util.Scanner;

/* try_catch
 * try쓰고  ctrl+space 안에 연산넣기
 * => error 사항 입력하면 "입력 사항이 올바르지 않거나.." 메세지 뜸
 * 
 * 
 */

public class Exception_Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;

		try {
			System.out.print("두 정수? ");
			a = sc.nextInt();
			b = sc.nextInt();
			c = a / b;
			System.out.println(a + " / " + b + " = " + c); 

		} catch (Exception e) {	//문제가 있을시에만 catch구문에 들어옴	// but, 상황마다 어떤 오류인지 상세히 알려주지는 않음.
			System.out.println("입력 사항이 올바르지 않거나...");
		}

		System.out.println("end...");

		sc.close();
	}
}
