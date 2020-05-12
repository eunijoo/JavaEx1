package test0131;

import java.util.Scanner;

public class IfEx6 {

	public static void main(String[] args) {
		// 세 수를 입력받아 적은수에서 큰수 순으로 출력
		Scanner sc=new Scanner(System.in);  //Scanner 실수,정수를 받는건되는데 문자받는건 안됨.
		char ch;
		//if~else if 로 코딩하는 것이 더 효율적
		//첫번째 조건을 만족해도 나머지 조건을 다 실행해봄(시간오래걸림)
		System.out.println("한 문자?");
		ch=sc.next().charAt(0); //charAt(0)은 문자열 중 문자 1개의 첫번째글자만 입력받음
		
		if(ch>= 'A'&& ch <='Z') {
			System.out.println("입력문자는 대문자");
		}
		if(ch>='a'&& ch<='z') {
			System.out.println("입력문자는 소문자");
		}
		if(!(ch>='a'&& ch<='z')&& !(ch>= 'A'&& ch <='Z')) { //not소문자 && not대문자
			System.out.println("입력문자는 기타문자");
		}
		sc.close();	
	}

}
