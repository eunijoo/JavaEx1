package test0130;

import java.util.Scanner;

public class OpreQuiz2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		double a;
		double b,c;
		
		System.out.printf("반지름?");
		a=sc.nextInt();
		
		b=a*a*3.14;
		c=(a*2)*3.14;
		
		System.out.println("넓이 : "+b);
		System.out.printf("둘레 : "+c);
		
		//System.out.println("넓이 : "+(a*a*3.14));
		//System.out.printf("둘레 : %.1f ",((a*2)*3.14));
		
		sc.close();
		
		
		
	}

}
