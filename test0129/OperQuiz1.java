package test0129;

import java.util.Scanner;

public class OperQuiz1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		
		System.out.print("µÎÁ¤¼ö ?");
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.printf("%d + %d = %d\t",a,b,a+b);
		System.out.printf("%d - %d = %d\10n",a,b,a-b);
		System.out.printf("%d * %d = %d\t",a,b,a*b);
		System.out.printf("%d / %d = %d",a,b,a/b);
		
		sc.close();
		
		
	}

}
