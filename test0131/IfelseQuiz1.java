package test0131;

import java.util.Scanner;

public class IfelseQuiz1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("ù��°��");
		a=sc.nextInt();
		System.out.println("�ι�°��");
		b=sc.nextInt();
		
		//c=a-b;
		//if(c<0) {  //��� 2����
		//	c=-c;
     	//}
		if(a>b) {
			c=a-b;
		} else {
			c=b-a;
		}
		
		System.out.println("����:"+c);
		
		sc.close();

	}

}
