package test0203;

import java.util.Scanner;

public class BookEx48 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		char num;
		
		System.out.println("주민번호입력");
		num=sc.next().charAt(7); // 8번째 값을 저장하고,가져온다.
		
		switch(num) {
		case '1': case '3': // 문자로 선언했기때문에 '숫자'로 작성 
			System.out.println("남자입니다"); break;
		case '2': case '4':
			System.out.println("여자입니다"); break;
		default:
			System.out.println("유효하지 않은 주민등록번호입니다.");
		}
		sc.close();
	
	}
}
