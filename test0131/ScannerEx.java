package test0131;
import java.util.Scanner;

		public class ScannerEx {

			public static void main(String[] args) {
				// 세 수를 입력받아 적은수에서 큰수 순으로 출력
				Scanner sc=new Scanner(System.in);  //Scanner 실수,정수를 받는건되는데 문자받는건 안됨.
				
				System.out.println("문자열");
				String s=sc.next(); 
				
				char ch;
				
				ch=sc.next().charAt(0); //charAt(0)은 문자열 중 문자 1개의 첫번째글자만 입력받음
				System.out.println("한 문자?");
				//s가 "korea"인 경우
				ch=s.charAt(0); //가장 처음에 있는 글자
				System.out.println(ch); //k
								
				ch=s.charAt(2); //세번째있는 글자
				System.out.println(ch);//r

				sc.close();
	}

}
