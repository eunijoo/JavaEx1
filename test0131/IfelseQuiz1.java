package test0131;

import java.util.Scanner;

public class IfelseQuiz1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("첫번째수");
		a=sc.nextInt();
		System.out.println("두번째수");
		b=sc.nextInt();
		
		//c=a-b;
		//if(c<0) {  //방법 2가지
		//	c=-c;
     	//}
		if(a>b) {
			c=a-b;
		} else {
			c=b-a;
		}
		
		System.out.println("차이:"+c);
		
		sc.close();

	}

}
