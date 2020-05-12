package test0131;

import java.util.Scanner;

public class IfelseQuiz3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		char a,sh;
		
		System.out.println("ÇÑ ¹®ÀÚ");
		a=sc.next().charAt(0);
		
		if(a>='a' && a<='z') {
			sh=(char)(a-32);
		} else if(a>='A' && a<='z') {
			sh=(char)(a+32);
		} else {
			sh=a;
		}
		System.out.println(a+ "->"+ sh);
		sc.close();

	}

}
