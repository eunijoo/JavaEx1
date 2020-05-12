package test0221;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Throw_Ex8 {
	public static void main(String[] args) {
		User8 u = new User8();
		u.intput();
	}
}

class User8 {

	private Scanner sc = new Scanner(System.in);
	
		// throws Exception : 메소드를 호출한 곳에서 Exception checked 예외를 catch하도록 설정.
	private int inputScore() throws Exception {  //호출한 input아 나 쓰려면 내 예외잡아서써라. 	
												 //(문제가 있으면 문제가 있다고 inputScore()을 호출한 input()한테 알려줘야함)
		int result = 0;
		
		try {
			result = sc.nextInt();  //문제가 있으면 확인하고 버려야한다.
			
			if(result<0 || result>100) {  //throws : 호출쪽에서 예외잡으라고 알려주는거  throw : 예외를 발생시키는거 (문제일으키는거)
				
				//예외던짐. 실행을 중지하고 호출함수쪽에서 예외를 발생시킴.
				throw new Exception("점수는 0~100사이만 가능합니다.");
			}
			
		} catch (InputMismatchException e) {
			//System.out.println("숫자만 입력가능합니다.");
			
			sc.nextLine();  //문제가 있는 데이터를 읽어서 버림. nextLine : 한줄읽기
			//예외를 명시적으로 발생한다.
			throw new Exception("숫자만 입력가능합니다.");
		}
		return result;
	}

	public void intput() {  //
		String name, tel;
		int kor, eng;

		try {
		
		System.out.println(" 이름?");
		name = sc.next();

		System.out.println(" 국어 ?");
		kor = inputScore();
		
		System.out.println("영어?");
		eng = inputScore();
		
		System.out.println("전화번호 ? ");
		tel = sc.next();   //문자열입력구문이여가지고 잘못입력한 문자열을 여기서 읽어버림.

		System.out.println(name + ":" + kor + ":" + eng + ":" + tel);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("=====================");		
		}
}