package test0221;

import java.util.Scanner;

public class Exception_Finally_Ex6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] names = new String[3];

		int idx = 0;
		String s;

		try {
			System.out.println("이름입력[종료:문자열 입력하지않고 엔터]...");
			
			while ((s = sc.nextLine()).length() != 0) {
				names[idx++] = s;
				System.out.println("이름입력 : "); //예외발생하면 실행안함
			}
			System.out.println("========================");  //예외와상관없이 출력됨.
			//ArrayIndexOutOfBoundsException : uncheck 예외
			// 								      배열의 첨자가 범위를 벗어나면 발생하는 예외.
			for (String str : names) {
				System.out.println(str + " ");
			}
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("입력을 초과했습니다.");
		}finally {
			// try { } finally { } 처럼 catch가 없어도 가능. (catch할것이없으면 try finally만 써도됨)
			System.out.println("예외와 상관없이 실행됩니다.");
			sc.close();
		}

		System.out.println();

	}
}