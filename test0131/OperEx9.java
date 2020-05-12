package test0131;

import java.util.Scanner;

public class OperEx9 {
//정수를 입력받아 양수인지 음수인지 영인지를 판별
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		String s;
		
		System.out.println("정수?");
		a=sc.nextInt();
		
		//양수아니면,음수아니면,0
		s= a>0 ? "양수" :( a<0 ? "음수" : "영");
		
		System.out.println("a :"+s);
		
		sc.close();

	}
}