package test0203;

import java.util.Scanner;

public class SwitchEx7 {
	public static void main(String[] args) {
		//한문자를 입력받아 입력받은 문자가 숫자인지 확인
		Scanner sc=new Scanner(System.in);
		char c;
		
		System.out.println("문자?");
		c=sc.next().charAt(0);
		
		switch(c) {
		case '0' : case '1' : case '2' : case '3' : case '4' :
		case '5' : case '6' : case '7' : case '8' : case '9' :
		System.out.println(c+"숫자...");
		break;
		default : 
			System.out.println(c+"숫자가 아님");
			break;
		}
		sc.close();
		
	/*if문으로 코딩했을때 (위와 같은 경우는 if문으로 짜는게 맞음.
	  if(c>='0' && c<='9'){
	  	System.out.println(c+"숫자");
	  } else{
	  	System.out.println(c+"숫자가 아님");
	  }
	 */
	
	}
}
