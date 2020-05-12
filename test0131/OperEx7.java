package test0131;

import java.util.Scanner;

public class OperEx7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//한문자를 입력받아 소문자이면 대문자로.
		//대문자이면 소문자로 변환하고 만약 대소문자가 아니면
		//입력받은 문자를 그대로 출력한다.
		//'A' =65 , 'a'=97
		
		char a,b;
		//a='A';
		//b=(char)(a+32); //대소문자 아스키코드값이 32차이가 남.
		//System.out.println(b);
		
		System.out.println("한문자?");
		a=sc.next().charAt(0);
	  //대문자->소문자, 소문자->대문자,기타->기타
	  //b= a>='A'&&a<='Z' ? (char)(a+32) : (char)(a-32);//대문자여부조건문 ? 소문자로바꿔줌 : 대문자로 바꿔줌
		b= a>='A'&&a<='Z' ? (char)(a+32) : (a>='a'&&a<'z' ? (char)(a-32):a);
		 //  대문자여부조건문  ?   소문자로바꿔줌 :    소문자여부조건문       ?      소문자:    입력그대로
		
		System.out.println(a+"->"+b);
		
		sc.close();
	}

}
